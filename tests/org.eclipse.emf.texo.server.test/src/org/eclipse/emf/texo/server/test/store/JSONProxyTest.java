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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONTexoResource;
import org.eclipse.emf.texo.store.TexoResource;
import org.eclipse.emf.texo.test.emfmodel.library.Book;
import org.eclipse.emf.texo.test.emfmodel.library.Library;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryFactory;
import org.eclipse.emf.texo.test.emfmodel.library.Writer;
import org.eclipse.emf.texo.test.emfmodel.library.impl.LibraryPackageImpl;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests simple proxy resolution.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class JSONProxyTest extends TexoResourceTest {

  public JSONProxyTest() {
    super("library"); //$NON-NLS-1$
    // touch the EMF package before the other ones.
    LibraryPackageImpl.init();
    LibraryModelPackage.initialize();
  }

  @Before
  @Override
  public void setUp() throws Exception {
    super.setUp();
    doServerSetUp();
  }

  @Override
  @After
  public void tearDown() throws Exception {
    super.tearDown();
    doServerTearDown();
  }

  @Test
  public void testProxy() {
    final LibraryFactory factory = LibraryFactory.eINSTANCE;
    final int COUNT = 3;

    // Persist testdata
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
        // note: normally getBooks would resolve proxies but
        // in the ecore model the ereference has been set as not
        // resolving proxies, therefore the explicit resolve proxies
        for (Book bk : writer.getBooks()) {
          // start as a proxy
          Assert.assertTrue(bk.eIsProxy());

          // still a proxy no data
          Assert.assertTrue(null == bk.getTitle());

          // resolve it
          EcoreUtil.resolve(bk, writer);

          // not a proxy anymore
          Assert.assertFalse(bk.eIsProxy());
          Assert.assertTrue(bk.getTitle().equals(writer.getName() + "_" + j));
          Assert.assertTrue(bk.getAuthor() == writer);
          Assert.assertTrue(bk.eResource() == resource);
          j++;
        }
        Assert.assertTrue(writer.eContainer() == null);
      }
    }
  }

  @Override
  protected TexoResource createResource(String uriString) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("http", new JSONTexoResourceFactory());
    return (TexoResource) resourceSet.createResource(URI.createURI(uriString));
  }

  private static class JSONTexoResourceFactory implements Resource.Factory {

    public Resource createResource(URI uri) {
      final JSONTexoResource resource = ComponentProvider.getInstance().newInstance(JSONTexoResource.class);
      resource.setURI(uri);
      return resource;
    }
  }
}
