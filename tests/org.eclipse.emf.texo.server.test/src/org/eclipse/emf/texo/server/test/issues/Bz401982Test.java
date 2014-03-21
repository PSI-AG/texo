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
package org.eclipse.emf.texo.server.test.issues;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONTexoResource;
import org.eclipse.emf.texo.server.test.store.TexoResourceTest;
import org.eclipse.emf.texo.store.TexoResource;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Factory;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main;
import org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl;
import org.eclipse.emf.texo.test.model.issues.bz403743.Bz403743ModelPackage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for issue: https://bugs.eclipse.org/bugs/show_bug.cgi?id=401982.
 * 
 * Re-uses the model from the 403743 issue and test.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class Bz401982Test extends TexoResourceTest {

  public Bz401982Test() {
    super("bz403743");
    Bz403743PackageImpl.init();
    Bz403743ModelPackage.initialize();
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
  public void testResource() {

    // Persist
    {
      final Bz403743Factory factory = Bz403743Factory.eINSTANCE;
      Test403743_Main root = factory.createTest403743_Main();
      root.setName("root");
      final TexoResource resource = createResource();
      resource.getContents().add(root);
      try {
        resource.save(Collections.emptyMap());
      } catch (IOException e) {
        throw new IllegalStateException(e);
      }
    }

    try {
      final TexoResource resource = createResource(getBaseURL() + "?types=bz403743_Test403743_Main");
      resource.setChildLevels(6);
      resource.load(Collections.emptyMap());
      Test403743_Main root = (Test403743_Main) resource.getContents().get(0);
      Assert.assertEquals("root", root.getName());
    } catch (IOException e) {
      throw new IllegalStateException(e);
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
