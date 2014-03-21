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
package org.eclipse.emf.texo.server.test.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.server.test.BaseTest;
import org.eclipse.emf.texo.store.EObjectStore;
import org.eclipse.emf.texo.test.emfmodel.library.Book;
import org.eclipse.emf.texo.test.emfmodel.library.Library;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryFactory;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryPackage;
import org.eclipse.emf.texo.test.emfmodel.library.Writer;
import org.eclipse.emf.texo.test.emfmodel.library.impl.LibraryPackageImpl;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the {@link EObjectStore} api.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public abstract class EObjectStoreTest extends BaseTest {

  public EObjectStoreTest() {
    super("library"); //$NON-NLS-1$
    // touch the EMF package before the other ones.
    LibraryPackageImpl.init();
    LibraryModelPackage.initialize();
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();

    // set to false
    // is set to true in super
    EntityManagerProvider.getInstance().setUseCurrentEntityManagerPattern(false);
  }

  @Test
  public void testPersistGetCountQuery() {
    final LibraryFactory factory = LibraryFactory.eINSTANCE;
    final int COUNT = 5;

    long libId = -1;
    // Persist
    {
      final List<EObject> toInsert = new ArrayList<EObject>();
      for (int i = 0; i < COUNT; i++) {
        // create testdata
        final Library lib = factory.createLibrary();
        toInsert.add(lib);
        lib.setName("name" + i); //$NON-NLS-1$

        for (int w = 0; w < COUNT; w++) {
          final Writer writer = factory.createWriter();
          lib.getWriters().add(writer);
          writer.setName(i + "_" + w);
          toInsert.add(writer);
          for (int b = 0; b < COUNT; b++) {
            final Book bk = factory.createBook();
            bk.setAuthor(writer);
            toInsert.add(bk);
            writer.getBooks().add(bk);
            lib.getBooks().add(bk);
          }
        }
      }
      final EObjectStore service = getEObjectStore();
      service.persist(toInsert, Collections.<EObject> emptyList(), Collections.<EObject> emptyList());
      libId = ((Library) toInsert.get(0)).getDb_Id();
    }

    // Get
    {
      final EObjectStore service = getEObjectStore();
      final Library lib = (Library) service.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib.getName().equals("name0"));
    }

    // getBooks
    {
      final EObjectStore service = getEObjectStore();
      // first need to read the writers to ensure that the writers
      // have been read in the cache. The EMF proxy resolving
      // needs resources to proxy resolving...
      service.query("select w from library_Writer w", new HashMap<String, Object>(), -1, -1);
      final List<EObject> bks = service.query("select b from library_Book b", new HashMap<String, Object>(), -1, -1);
      for (EObject eBk : bks) {
        final Book bk = (Book) eBk;
        Assert.assertNotNull(bk.getAuthor());
      }
    }

    // Count
    {
      final EObjectStore service = getEObjectStore();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final long cnt = service.count("select count(w) from library_Writer w where w.name like :name", namedParams);
      Assert.assertEquals(COUNT, cnt);
    }

    // Query
    {
      final EObjectStore service = getEObjectStore();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = service.query("select w from library_Writer w where w.name like :name",
          namedParams, 0, -1);
      Assert.assertEquals(COUNT, writers.size());

      int i = 0;
      for (EObject w : writers) {
        final Writer writer = (Writer) w;
        Assert.assertEquals("1_" + i++, writer.getName());
        // only check proxy in the first loop as refering objects
        // will load books in a non-proxy way below
        if (i == 1) {
          for (Book bk : writer.getBooks()) {
            Assert.assertTrue(bk.eIsProxy());
          }
        }
        if (i == 1) {
          // only check once, after this the library is loaded below
          Assert.assertTrue(writer.eContainer() == null);
        }

        List<EObject> referingObjects = service.getReferingObjects(writer, -1, false);
        // size includes the library
        Assert.assertTrue(referingObjects.size() == 1 + writer.getBooks().size());
        Assert.assertTrue(referingObjects.size() == 1 + COUNT);
        Library lib = null;
        for (EObject eObject : referingObjects) {
          if (eObject instanceof Library) {
            lib = (Library) eObject;
          } else {
            // must be a boook
            Assert.assertTrue(writer.getBooks().contains(eObject));
          }
        }
        Assert.assertNotNull(lib);
        referingObjects = service.getReferingObjects(lib, -1, false);
        Assert.assertTrue(referingObjects.size() == 0);
        referingObjects = service.getReferingObjects(lib, -1, true);
        Assert.assertTrue(referingObjects.size() == 0);
        referingObjects = service.getReferingObjects(writer, COUNT - 1, true);
        Assert.assertTrue(referingObjects.size() == COUNT - 1);
      }
    }

    // query paging 1
    {
      final EObjectStore service = getEObjectStore();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = service.query("select w from library_Writer w where w.name like :name",
          namedParams, 0, 2);
      Assert.assertEquals(2, writers.size());
    }

    // query paging 2
    {
      final EObjectStore service = getEObjectStore();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = service.query("select w from library_Writer w where w.name like :name",
          namedParams, 3, -1);
      Assert.assertEquals(2, writers.size());
    }

    // Refresh
    {
      final EObjectStore s1 = getEObjectStore();
      final EObjectStore s2 = getEObjectStore();
      final Library lib1 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      final Library lib2 = (Library) s2.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib2.getName().equals(lib1.getName()));
      Assert.assertTrue(lib1 != lib2);
      lib1.setName("newname");
      Assert.assertFalse(lib2.getName().equals(lib1.getName()));
      s1.persist(Collections.<EObject> emptyList(), Collections.<EObject> singletonList(lib1),
          Collections.<EObject> emptyList());
      Assert.assertFalse(lib2.getName().equals(lib1.getName()));
      s2.refresh(lib2);
      Assert.assertTrue(lib2.getName().equals(lib1.getName()));
    }

    // Resolve objects
    {
      final EObjectStore s1 = getEObjectStore();
      final Library lib1 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      final Library lib2 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib1 == lib2);
    }
    {
      final EObjectStore s1 = getEObjectStore();
      final Library lib1 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      s1.clearCache();
      final Library lib2 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib1 != lib2);
    }

    // Insert/Update and delete
    {
      final EObjectStore service = getEObjectStore();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      final List<EObject> libs = service.query("select l from library_Library l", namedParams, 0, -1);
      final EObject toDel = libs.remove(4);
      final Library lib = factory.createLibrary();
      lib.setName("name10"); //$NON-NLS-1$
      service.persist(Collections.<EObject> singletonList(lib), libs, Collections.<EObject> singletonList(toDel));

      Assert.assertTrue(null == service.get(LibraryPackage.eINSTANCE.getLibrary(), ((Library) toDel).getDb_Id()));
      Assert.assertTrue(lib.getDb_Id() > 0);
    }

    // same objects
    {
      final EObjectStore service = getEObjectStore();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      final List<EObject> libs1 = service.query("select l from library_Library l", namedParams, 0, -1);
      final List<EObject> libs2 = service.query("select l from library_Library l", namedParams, 0, -1);
      final Iterator<EObject> it2 = libs2.iterator();
      for (EObject eObject : libs1) {
        Assert.assertTrue(eObject == it2.next());
      }
      final Library lib = (Library) service.get(LibraryPackage.eINSTANCE.getLibrary(),
          ((Library) libs1.get(0)).getDb_Id());
      Assert.assertTrue(libs1.contains(lib));
      Assert.assertTrue(libs2.contains(lib));
    }
  }

  protected abstract EObjectStore getEObjectStore();
}
