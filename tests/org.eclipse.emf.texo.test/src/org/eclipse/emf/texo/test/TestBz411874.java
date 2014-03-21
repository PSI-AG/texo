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

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.json.JSONModelConverter;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.test.model.issues.bz411874.Bz411874ModelFactory;
import org.eclipse.emf.texo.test.model.issues.bz411874.Bz411874ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz411874.EClassA;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=411874
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz411874 extends TestCase {

  @Test
  public void test() throws JSONException {
    // touch to initialize
    System.err.println(XMLTypePackage.eNS_URI);

    final Bz411874ModelFactory factory = Bz411874ModelPackage.MODELFACTORY;
    final byte[] bytes = new byte[] { 1, 3, 4, 5, 6, 8, 1, 4, 3, 4 };
    final byte[] bytes64 = new byte[] { 8, 103, 34, 55, 66, 87, 71, 84, 3, 4 };
    String jsonString = ""; //$NON-NLS-1$
    {
      final EClassA object = factory.createEClassA();
      object.setDb_Id(103l);
      object.setDb_version(3);
      object.setByteArray(bytes);
      object.setBase64(bytes64);
      final ModelJSONConverter converter = new ModelJSONConverter();
      jsonString = converter.convert(object).toString();
    }
    System.err.println(jsonString);
    {
      final JSONModelConverter converter = new JSONModelConverter();
      Object o = converter.convert(new JSONObject(jsonString));
      final EClassA object = (EClassA) o;
      assertEquals(103l, object.getDb_Id().longValue());
      assertEquals(3, object.getDb_version().intValue());
      assertEquals(bytes.length, object.getByteArray().length);
      for (int i = 0; i < bytes.length; i++) {
        assertEquals(bytes[i], object.getByteArray()[i]);
      }
      assertEquals(bytes64.length, object.getBase64().length);
      for (int i = 0; i < bytes64.length; i++) {
        assertEquals(bytes64[i], object.getBase64()[i]);
      }
    }
  }
}