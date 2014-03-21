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

import junit.framework.TestCase;

import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Test;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=415716
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz415716 extends TestCase {

  @Test
  public void test() {
    final LibraryModelFactory factory = LibraryModelPackage.MODELFACTORY;
    {
      final Book book = factory.createBook();
      final Writer writer = factory.createWriter();

      assertTrue(writer.addToBooks(book));
      assertFalse(writer.addToBooks(book));
      assertTrue(writer.removeFromBooks(book));
      assertFalse(writer.removeFromBooks(book));
      assertFalse(writer.removeFromBooks(factory.createBook()));
      assertTrue(writer.addToBooks(book));
      book.setAuthor(writer);
    }
    {
      final Book book = factory.createBook();
      final Writer writer = factory.createWriter();
      @SuppressWarnings("unchecked")
      final ModelObject<Writer> moWriter = factory.createModelObject(LibraryModelPackage.INSTANCE.getWriterEClass(),
          writer);

      assertTrue(moWriter.eAddTo(LibraryModelPackage.INSTANCE.getWriter_Books(), book));
      assertFalse(moWriter.eAddTo(LibraryModelPackage.INSTANCE.getWriter_Books(), book));
      assertTrue(moWriter.eRemoveFrom(LibraryModelPackage.INSTANCE.getWriter_Books(), book));
      assertFalse(moWriter.eRemoveFrom(LibraryModelPackage.INSTANCE.getWriter_Books(), book));
      assertFalse(moWriter.eRemoveFrom(LibraryModelPackage.INSTANCE.getWriter_Books(), factory.createBook()));
      assertFalse(writer.getBooks().remove(new Object()));
      assertTrue(moWriter.eAddTo(LibraryModelPackage.INSTANCE.getWriter_Books(), book));
      assertTrue(moWriter.eRemoveFrom(LibraryModelPackage.INSTANCE.getWriter_Books(), book));
    }
  }
}