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
 * $Id: SimpleEMFToXMLTest.java,v 1.1 2011/09/21 14:04:52 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.TestUtils;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * A simple test case to test conversion to XML.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class SimpleEMFToXMLTest extends TestCase {

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

    final String xml = TestUtils.writeXML(Collections.singletonList((Object) library), false);
    System.err.println(xml);
  }
}