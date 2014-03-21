/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: TestModelAccess.java,v 1.7 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * Tests simple access through the model api, tests that access to the model api gives the same results as direct
 * access.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestModelAccess extends TestCase {

  private static final String WRITER_NAME = "writer"; //$NON-NLS-1$
  private static final String TITLE = "title"; //$NON-NLS-1$
  private static final String TITLE_NEW = "titleNew"; //$NON-NLS-1$
  private static final int PAGES = 27;
  private static final int PAGES_NEW = 25;
  private static final String LIBRARY_NAME = "library"; //$NON-NLS-1$
  private static final BookCategory BOOK_CATEGORY = BookCategory.SCIENCEFICTION;
  private static final BookCategory BOOK_CATEGORY_NEW = BookCategory.MYSTERY;

  public void testModelAccess() {
    final LibraryModelFactory factory = LibraryModelPackage.MODELFACTORY;
    final LibraryModelPackage modelPackage = LibraryModelPackage.INSTANCE;
    final Book book = factory.createBook();
    book.setTitle(TITLE);
    book.setCategory(BOOK_CATEGORY);
    book.setPages(PAGES);

    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(book);
    for (EStructuralFeature eFeature : modelObject.eClass().getEAllStructuralFeatures()) {
      System.err.println(eFeature.getName() + ": " + modelObject.eGet(eFeature)); //$NON-NLS-1$
    }

    final Writer writer = factory.createWriter();
    writer.setName(WRITER_NAME);
    writer.getBooks().add(book);
    book.setAuthor(writer);

    final Library library = factory.createLibrary();
    library.setName(LIBRARY_NAME);
    library.getWriters().add(writer);
    library.getBooks().add(book);

    final List<Object> objects = new ArrayList<Object>();
    objects.add(library);
    objects.add(writer);
    objects.add(book);
    System.err.println(convertToXML(objects));

    // now move to the model interface
    final ModelObject<?> libraryModelObject = ModelResolver.getInstance().getModelObject(library);
    final ModelObject<?> bookModelObject = ModelResolver.getInstance().getModelObject(book);
    final ModelObject<?> writerModelObject = ModelResolver.getInstance().getModelObject(writer);

    assertEquals(libraryModelObject.eClass(), modelPackage.getLibraryEClass());
    assertEquals(bookModelObject.eClass(), modelPackage.getBookEClass());
    assertEquals(writerModelObject.eClass(), modelPackage.getWriterEClass());

    // and get some data
    assertEquals(TITLE, bookModelObject.eGet(modelPackage.getBook_Title()));
    assertEquals(PAGES, bookModelObject.eGet(modelPackage.getBook_Pages()));
    assertEquals(BOOK_CATEGORY, bookModelObject.eGet(modelPackage.getBook_Category()));

    assertEquals(WRITER_NAME, writerModelObject.eGet(modelPackage.getWriter_Name()));
    assertEquals(LIBRARY_NAME, libraryModelObject.eGet(modelPackage.getLibrary_Name()));

    final Collection<?> books = (Collection<?>) libraryModelObject.eGet(modelPackage.getLibrary_Books());
    final Collection<?> writers = (Collection<?>) libraryModelObject.eGet(modelPackage.getLibrary_Writers());
    assertTrue(books.contains(book));
    assertTrue(writers.contains(writer));

    // now set some data through the model api
    writers.clear();
    bookModelObject.eSet(modelPackage.getBook_Title(), TITLE_NEW);
    bookModelObject.eSet(modelPackage.getBook_Category(), BOOK_CATEGORY_NEW);
    bookModelObject.eSet(modelPackage.getBook_Pages(), PAGES_NEW);

    // and check the original objects
    assertFalse(library.getWriters().contains(writer));
    assertTrue(library.getWriters().isEmpty());
    assertEquals(book.getTitle(), TITLE_NEW);
    assertEquals(book.getCategory(), BOOK_CATEGORY_NEW);
    assertEquals(book.getPages(), PAGES_NEW);

  }

  private String convertToXML(java.util.List<Object> objects) {
    final StringBuilder sb = new StringBuilder();
    // create the root tag
    sb.append("<Root>\n"); //$NON-NLS-1$

    // walk over the objects
    for (Object object : objects) {
      // wrap the object
      final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);

      sb.append("<" + modelObject.eClass().getName() + ">\n"); //$NON-NLS-1$ //$NON-NLS-2$

      // iterate over the EAttributes
      for (EAttribute eAttribute : modelObject.eClass().getEAllAttributes()) {
        // create the XML
        sb.append("<" + eAttribute.getName() + ">"); //$NON-NLS-1$ //$NON-NLS-2$

        // convert to a string
        final Object value = modelObject.eGet(eAttribute);
        final String strValue = ModelResolver.getInstance().convertToString(eAttribute.getEAttributeType(), value);

        sb.append(strValue);
        sb.append("</" + eAttribute.getName() + ">\n"); //$NON-NLS-1$ //$NON-NLS-2$
      }
      // and close the tag
      sb.append("</" + modelObject.eClass().getName() + ">\n"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    sb.append("</Root>\n"); //$NON-NLS-1$
    return sb.toString();
  }
}