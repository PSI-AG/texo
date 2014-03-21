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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.json.EMFJSONConverter;
import org.eclipse.emf.texo.json.JSONTexoResource;
import org.eclipse.emf.texo.server.test.store.TexoResourceTest;
import org.eclipse.emf.texo.store.TexoResource;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Factory;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package;
import org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement;
import org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap;
import org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl;
import org.eclipse.emf.texo.test.model.issues.bz399086.Bz399086ModelPackage;
import org.json.JSONArray;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for issue: https://bugs.eclipse.org/bugs/show_bug.cgi?id=399086
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class Bz399086Test extends TexoResourceTest {

  public Bz399086Test() {
    super("bz399086");
    Bz399086PackageImpl.init();
    Bz399086ModelPackage.initialize();
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
    final Bz399086Factory factory = Bz399086Factory.eINSTANCE;

    // Persist
    {
      final TheMap m = factory.createTheMap();
      m.getValueContent().put("e1", "e1");
      m.getValueContent().put("e2", "e2");
      final MapElement e1 = factory.createMapElement();
      e1.setName("e1");
      m.getRefContent().put("e1", e1);
      final MapElement e2 = factory.createMapElement();
      e2.setName("e2");
      m.getRefContent().put("e2", e2);

      final TexoResource resource = createResource();

      // http: // www.eclipse.org/forums/index.php/m/1011919/
      resource.query("select m from bz399086_MapElement m", new HashMap<String, Object>(), 0, Integer.MAX_VALUE);

      resource.getContents().add(m);
      resource.getContents().add(e1);
      resource.getContents().add(e2);
      try {
        resource.save(Collections.emptyMap());
      } catch (IOException e) {
        throw new IllegalStateException(e);
      }
    }

    try {
      final TexoResource resource = createResource(getBaseURL() + "?types=bz399086_TheMap&childLevels=10");
      resource.load(Collections.emptyMap());
      Assert.assertEquals(1, resource.getContents().size());
      final TheMap m = (TheMap) resource.getContents().get(0);
      Assert.assertEquals(2, m.getValueContent().size());
      Assert.assertEquals("e1", m.getValueContent().get("e1"));
      Assert.assertEquals("e2", m.getValueContent().get("e2"));
      Assert.assertEquals("e1", m.getRefContent().get("e1").getName());
      Assert.assertEquals("e2", m.getRefContent().get("e2").getName());
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  // http://www.eclipse.org/forums/index.php/t/452843/
  @Test
  public void testGenData() {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(Bz399086Package.eINSTANCE);

    final List<EClass> eClasses = DataGeneratorUtils.getRootEClasses(ePackages);
    final ModelDataGenerator modelDataGenerator = new ModelDataGenerator();
    modelDataGenerator.setStartEClasses(eClasses);
    modelDataGenerator.setEPackages(ePackages);
    modelDataGenerator.setMaxDepth(5);
    modelDataGenerator.setCollectionSize(2);
    modelDataGenerator.setDataSize(5);
    modelDataGenerator.setMaxObjects(1000);
    modelDataGenerator.generateTestData();

    final EMFJSONConverter conv = ComponentProvider.getInstance().newInstance(EMFJSONConverter.class);
    final JSONArray array = ComponentProvider.getInstance().newInstance(JSONArray.class);

    try {
      URL url = new URL(getBaseURL());

      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("PUT");
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      for (EObject obj : modelDataGenerator.getResult()) {
        obj.eSet(obj.eClass().getEStructuralFeature("db_version"), null);
        array.put(conv.convert(obj));
      }

      OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
      writer.write(array.toString());
      writer.flush();

      BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      reader.readLine();
    } catch (Exception e) {
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
