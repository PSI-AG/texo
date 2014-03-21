/**
 * <copyright>
 *
 * Copyright (c) 2013 Springsite BV (The Netherlands) and others
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

import junit.framework.TestCase;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.EMFJSONConverter;
import org.eclipse.emf.texo.json.JSONEMFConverter;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.json.JSONObject;

/**
 * Test the conversion from JSON and Ecore models.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */
public class JSONEcoreTest extends TestCase {

  public JSONEcoreTest() {
    super();
  }

  public void testLibraryModel() throws Exception {
    final JSONObject json1 = (JSONObject) getToJsonConverter().convert(LibraryModelPackage.INSTANCE.getEPackage());
    System.err.println(json1.toString());
    final Object object = getFromJsonConverter().convert(json1);
    System.err.println(object);
  }

  private EMFJSONConverter getToJsonConverter() {
    final EMFJSONConverter toJsonConverter = ComponentProvider.getInstance().newInstance(EMFJSONConverter.class);
    // toJsonConverter.setObjectResolver(store);
    toJsonConverter.setConvertNonContainedReferencedObjects(false);
    toJsonConverter.setMaxChildLevelsToConvert(100);
    toJsonConverter.setPreSortManyValues(true);
    toJsonConverter.setSerializeTitleProperty(false);
    return toJsonConverter;
  }

  private JSONEMFConverter getFromJsonConverter() {
    final JSONEMFConverter fromJsonConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    return fromJsonConverter;
  }

}