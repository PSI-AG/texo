/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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
 * $Id: EClassInstanceClassSetTest.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.texo.test.model.issues.notrequiredserialization.NotRequiredSerializationModelPackage;
import org.eclipse.emf.texo.test.model.issues.notrequiredserialization.SerializationTest;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.xml.ModelXMLSaver;
import org.junit.Assert;
import org.junit.Test;

public class TestNotRequiredSerialization {

  @Test
  public void test() throws Exception {
    {
      {
        SerializationTest test = NotRequiredSerializationModelPackage.INSTANCE.getModelFactory()
            .createSerializationTest();
        test.setName(""); //$NON-NLS-1$
        test.setDb_Id(1l);
        test.setDb_version(1);
        ModelXMLSaver modelXMLSaver = new ModelXMLSaver();
        final StringWriter sw = new StringWriter();
        modelXMLSaver.setWriter(sw);
        final List<Object> objects = new ArrayList<Object>();
        objects.add(test);
        modelXMLSaver.setObjects(objects);
        modelXMLSaver.write();

        final String xml1 = sw.toString();
        System.err.println(xml1);
        for (EAttribute eattr : NotRequiredSerializationModelPackage.INSTANCE.getSerializationTestEClass()
            .getEAllAttributes()) {
          if (ModelUtils.isUnsettable(eattr)) {
            Assert.assertTrue(!xml1.contains(eattr.getName()));
          } else {
            Assert.assertTrue(xml1.contains(eattr.getName()));
          }
        }
      }
    }

  }
}
