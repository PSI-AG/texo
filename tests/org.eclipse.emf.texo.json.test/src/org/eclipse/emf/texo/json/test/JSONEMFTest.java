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
 * $Id: XMLTest.java,v 1.16 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.json.test;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.json.EMFJSONConverter;
import org.eclipse.emf.texo.json.JSONEMFConverter;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.test.TestUtils;
import org.json.JSONObject;
import org.junit.Assert;

/**
 * Test the conversion to and from JSON and EMF. For each test the following steps are done:
 * <ol>
 * <li>Generate test data set</li>
 * <li>Convert the test data set to json (json1)</li>
 * <li>Convert the json back to a {@link EObject} instance</li>
 * <li>Convert this list back to json (json22)</li>
 * <li>then the following should be true: json1.equals(json2)</li>
 * </ol>
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */
public class JSONEMFTest extends BaseJSONTest {

  public JSONEMFTest(String name) {
    super(name);
  }

  public void doRunTest() throws Exception {
    final MemoryObjectStore memObjectStore = ComponentProvider.getInstance().newInstance(MemoryObjectStore.class);
    memObjectStore.setChildLevels(100);

    final ModelDataGenerator dataGenerator = TestUtils.generateTestSetModelGenerator(1, 3, 3, 10000, getEPackages(),
        getEClasses());
    final List<EObject> m1 = dataGenerator.getResult();
    memObjectStore.addData(new ArrayList<Object>(dataGenerator.getAllEObjects()));

    final Object json1 = getToJsonConverter(memObjectStore).convert(m1.get(0));

    final EObject m2 = getFromJsonConverter(memObjectStore).convert((JSONObject) json1);

    final Object json2 = getToJsonConverter(memObjectStore).convert(m2);

    System.err.println(json1);
    System.err.println("---------------------------------------------");
    System.err.println(json2);

    Assert.assertEquals(json1.toString(), json2.toString());

    final EObject m3 = getFromJsonConverter(memObjectStore).convert((JSONObject) json2);
    final Object json3 = getToJsonConverter(memObjectStore).convert(m3);

    Assert.assertEquals(json2.toString(), json3.toString());
  }

  private EMFJSONConverter getToJsonConverter(MemoryObjectStore store) {
    final EMFJSONConverter toJsonConverter = ComponentProvider.getInstance().newInstance(EMFJSONConverter.class);
    toJsonConverter.setObjectResolver(store);
    toJsonConverter.setConvertNonContainedReferencedObjects(false);
    toJsonConverter.setMaxChildLevelsToConvert(1);
    toJsonConverter.setPreSortManyValues(false);
    toJsonConverter.setSerializeTitleProperty(false);
    return toJsonConverter;
  }

  private JSONEMFConverter getFromJsonConverter(MemoryObjectStore store) {
    final JSONEMFConverter fromJsonConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    fromJsonConverter.setObjectResolver(store);
    return fromJsonConverter;
  }

}