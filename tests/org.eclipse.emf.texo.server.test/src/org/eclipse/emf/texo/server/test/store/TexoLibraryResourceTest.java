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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.model.ModelConstants;
import org.eclipse.emf.texo.store.TexoResource;
import org.eclipse.emf.texo.test.emfmodel.library.Book;
import org.eclipse.emf.texo.test.emfmodel.library.Library;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryFactory;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryPackage;
import org.eclipse.emf.texo.test.emfmodel.library.Writer;
import org.eclipse.emf.texo.test.emfmodel.library.impl.LibraryPackageImpl;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the {@link TexoResource} using the library example.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public abstract class TexoLibraryResourceTest extends TexoResourceTest {

  public TexoLibraryResourceTest() {
    super("library"); //$NON-NLS-1$
    // touch the EMF package before the other ones.
    LibraryPackageImpl.init();
    LibraryModelPackage.initialize();
  }

  @Test
  public void testPersistGetCountQuery() {
    final LibraryFactory factory = LibraryFactory.eINSTANCE;
    final int COUNT = 5;

    // Persist
    {
      final List<EObject> toInsertUpdate = new ArrayList<EObject>();
      for (int i = 0; i < COUNT; i++) {
        // create testdata
        final Library lib = factory.createLibrary();
        toInsertUpdate.add(lib);
        lib.setName("name" + i); //$NON-NLS-1$

        for (int w = 0; w < COUNT; w++) {
          final Writer writer = factory.createWriter();
          lib.getWriters().add(writer);
          writer.setName(i + "_" + w);

          for (int b = 0; b < COUNT; b++) {
            final Book bk = factory.createBook();
            bk.setAuthor(writer);
            bk.setTitle(writer.getName() + "_" + b);
            writer.getBooks().add(bk);
            lib.getBooks().add(bk);
          }
        }
      }
      final TexoResource resource = createResource();
      resource.getContents().addAll(toInsertUpdate);
      try {
        resource.save(Collections.emptyMap());
      } catch (IOException e) {
        throw new IllegalStateException(e);
      }
    }

    // Query + proxy resolving
    {
      final TexoResource resource = createResource();

      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = resource.query("select w from library_Writer w where w.name like :name",
          namedParams, 0, -1);
      Assert.assertEquals(COUNT, writers.size());

      int i = 0;
      for (EObject w : writers) {
        final Writer writer = (Writer) w;
        Assert.assertTrue(w.eResource() == resource);
        Assert.assertEquals("1_" + i++, writer.getName());
        int j = 0;
        // writer books ereference has proxy resolving to false
        for (Book bk : writer.getBooks()) {
          // explicitly resolve proxies
          EcoreUtil.resolve(bk, writer);

          Assert.assertTrue(bk.getTitle().equals(writer.getName() + "_" + j));
          Assert.assertTrue(bk.getAuthor() == writer);
          Assert.assertFalse(bk.eIsProxy());
          Assert.assertTrue(bk.eResource() == resource);
          j++;
        }
        Assert.assertTrue(writer.eContainer() == null);
      }
    }

    // types parameter
    try {
      {
        final TexoResource resource = createResource(getBaseURL() + "?types=library_Library");
        resource.load(Collections.emptyMap());
        Assert.assertEquals(COUNT, resource.getContents().size());
        // only libraries should be in the root
        for (EObject eObject : resource.getContents()) {
          Assert.assertTrue(eObject instanceof Library);
          Assert.assertFalse(((Library) eObject).getBooks().isEmpty());
          Assert.assertFalse(((Library) eObject).getWriters().isEmpty());
        }
      }
      {
        final TexoResource resource = createResource(getBaseURL() + "?types=library_Library,library_Writer");
        resource.load(Collections.emptyMap());
        Assert.assertEquals(COUNT, resource.getContents().size());
        // only libraries should be in the root
        for (EObject eObject : resource.getContents()) {
          Assert.assertTrue(eObject instanceof Library);
          Assert.assertFalse(((Library) eObject).getBooks().isEmpty());
          Assert.assertFalse(((Library) eObject).getWriters().isEmpty());
        }
      }
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }

    // Insert/Update and delete
    try {
      final String newName = "newName";
      final String updatedName = "updatedName";
      {
        final TexoResource resource = createResource();
        final Map<String, Object> namedParams = new HashMap<String, Object>();
        final List<EObject> libs = resource.query("select l from library_Library l", namedParams, 0, -1);

        final EObject toDel = libs.get(4);
        final String delUriFragment = ModelUtils.getQualifiedNameFromEClass(LibraryPackage.eINSTANCE.getLibrary())
            + ModelConstants.FRAGMENTSEPARATOR + ((Library) toDel).getDb_Id();
        final EObject checkDel = resource.getEObject(delUriFragment);

        // must exist and be the same
        Assert.assertTrue(toDel == checkDel);

        // remove
        Assert.assertTrue(resource.getContents().remove(toDel));

        final Library lib = factory.createLibrary();
        lib.setName("name10"); //$NON-NLS-1$
        resource.getContents().add(2, lib);

        resource.save(Collections.emptyMap());

        // does not exist anymore
        Assert.assertTrue(null == resource.getEObject(delUriFragment));
        Assert.assertTrue(lib.getDb_Id() > 0);
      }

      {
        final TexoResource resource = createResource();
        final Map<String, Object> namedParams = new HashMap<String, Object>();
        final List<EObject> libs = resource.query("select l from library_Library l", namedParams, 0, -1);
        boolean foundNewName = true;
        boolean foundUpdatedName = true;
        for (EObject l : libs) {
          final Library lib = (Library) l;
          if (lib.getName().equals(newName)) {
            Assert.assertFalse(foundNewName);
            foundNewName = true;
          }
          if (lib.getName().equals(updatedName)) {
            Assert.assertFalse(foundUpdatedName);
            foundUpdatedName = true;
          }
        }
        Assert.assertTrue(foundNewName);
        Assert.assertTrue(foundUpdatedName);
      }
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }

    // same objects
    {
      final TexoResource resource = createResource();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      final List<EObject> libs1 = resource.query("select l from library_Library l", namedParams, 0, -1);
      final List<EObject> libs2 = resource.query("select l from library_Library l", namedParams, 0, -1);
      Iterator<EObject> it2 = libs2.iterator();
      for (EObject eObject : libs1) {
        Assert.assertTrue(eObject == it2.next());
      }
      it2 = libs2.iterator();
      for (EObject eObject : resource.getContents()) {
        Assert.assertTrue(eObject == it2.next());
      }
    }
  }
}
