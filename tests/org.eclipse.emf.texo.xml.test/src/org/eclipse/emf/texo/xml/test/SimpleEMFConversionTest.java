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
 * $Id: SimpleEMFConversionTest.java,v 1.6 2011/08/25 12:42:35 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * A simple test case to test conversion from and to EMF EObjects.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class SimpleEMFConversionTest extends TestCase {

  private static final String WRITER_NAME = "writer"; //$NON-NLS-1$
  private static final String TITLE = "title"; //$NON-NLS-1$
  private static final int PAGES = 27;
  private static final String LIBRARY_NAME = "library"; //$NON-NLS-1$
  private static final BookCategory BOOK_CATEGORY = BookCategory.SCIENCEFICTION;

  public void testModelAccess() {
    final LibraryModelFactory factory = LibraryModelPackage.MODELFACTORY;
    final Book book = factory.createBook();
    book.setTitle(TITLE);
    book.setCategory(BOOK_CATEGORY);
    book.setPages(PAGES);

    final Writer writer = factory.createWriter();
    writer.setName(WRITER_NAME);
    writer.getBooks().add(book);
    book.setAuthor(writer);

    final Library library = factory.createLibrary();
    library.setName(LIBRARY_NAME);
    library.getWriters().add(writer);
    library.getBooks().add(book);

    // convert to eobjects
    final List<Object> modelObjects = Collections.singletonList((Object) library);
    final List<EObject> eObjects = new ModelEMFConverter().convert(modelObjects);

    // and convert back
    final List<Object> convertedModelObjects = new EMFModelConverter().convert(eObjects);

    // and test the result
    assertEquals(1, convertedModelObjects.size());
    final Library newLibrary = (Library) convertedModelObjects.get(0);
    assertNotSame(library, newLibrary);
    assertEquals(library.getName(), newLibrary.getName());
    assertEquals(library.getBooks().size(), newLibrary.getBooks().size());
    assertEquals(library.getWriters().size(), newLibrary.getWriters().size());

    final Book newBook = newLibrary.getBooks().get(0);
    final Writer newWriter = newLibrary.getWriters().get(0);
    assertNotSame(book, newBook);
    assertEquals(book.getCategory(), newBook.getCategory());
    assertEquals(book.getPages(), newBook.getPages());
    assertSame(book.getAuthor(), writer);
    assertNotSame(writer, newWriter);
    assertSame(newWriter.getBooks().get(0), newBook);
    assertEquals(1, newWriter.getBooks().size());
    assertEquals(newWriter.getName(), writer.getName());
  }
}