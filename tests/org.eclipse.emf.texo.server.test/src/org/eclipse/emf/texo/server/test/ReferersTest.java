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
 * $Id: ReferersTest.java,v 1.4 2011/08/26 07:58:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test;

import java.util.List;

import org.eclipse.emf.texo.store.ObjectStore;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the referers api of the {@link ObjectStore}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class ReferersTest extends BaseTest {

  public ReferersTest() {
    super("library"); //$NON-NLS-1$
  }

  @Test
  public void testReferers() {
    final LibraryModelFactory factory = LibraryModelPackage.MODELFACTORY;
    final int COUNT = 5;

    long libId = -1;
    {
      // create testdata
      final Library lib = factory.createLibrary();
      lib.setName("name"); //$NON-NLS-1$

      for (int w = 0; w < COUNT; w++) {
        final Writer writer = factory.createWriter();
        lib.getWriters().add(writer);

        for (int b = 0; b < COUNT; b++) {
          final Book bk = factory.createBook();
          bk.setAuthor(writer);
          writer.getBooks().add(bk);
          lib.getBooks().add(bk);
        }
      }
      getObjectStore().begin();
      getObjectStore().insert(lib);
      getObjectStore().commit();
      libId = lib.getDb_Id();
    }

    final ObjectStore objectStore = getNewObjectStore();
    {
      objectStore.begin();
      final Library lib = objectStore.get(Library.class, libId);
      for (Book bk : lib.getBooks()) {
        List<Object> referers = objectStore.getReferingObjects(bk, false);
        Assert.assertEquals(2, referers.size());
        for (Object o : referers) {
          Assert.assertTrue(o instanceof Writer || o instanceof Library);
        }
        referers = objectStore.getReferingObjects(bk, true);
        Assert.assertEquals(2, referers.size());
      }
      for (Writer writer : lib.getWriters()) {
        List<Object> referers = objectStore.getReferingObjects(writer, false);
        // the + 1 is the library
        Assert.assertEquals(COUNT + 1, referers.size());
        for (Object o : referers) {
          Assert.assertTrue(o instanceof Book || o instanceof Library);
        }
        referers = objectStore.getReferingObjects(writer, true);
        Assert.assertEquals(COUNT + 1, referers.size());
      }
      objectStore.commit();
    }
  }
}
