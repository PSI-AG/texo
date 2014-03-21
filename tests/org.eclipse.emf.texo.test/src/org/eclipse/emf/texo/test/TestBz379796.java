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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.texo.test.model.issues.bz379796.Bz379796ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379796.ComparisonType;
import org.eclipse.emf.texo.test.model.issues.bz379796.PriceType;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.xml.ModelXMLSaver;
import org.junit.Assert;
import org.junit.Test;

public class TestBz379796 {

  @Test
  public void test() throws Exception {
    final String val1 = "5"; //$NON-NLS-1$
    final String val2 = "6"; //$NON-NLS-1$
    final PriceType priceType = Bz379796ModelPackage.INSTANCE.getModelFactory().createPriceType();
    Assert.assertTrue(priceType.getValue().equals("")); //$NON-NLS-1$
    priceType.setValue(val1);
    Assert.assertTrue(priceType.getValue().equals(val1));
    priceType.setValue(val2);
    Assert.assertTrue(priceType.getValue().equals(val2));
    priceType.setValue(null);
    Assert.assertTrue(priceType.getValue() == null);

    {
      PriceType priceType2 = Bz379796ModelPackage.INSTANCE.getModelFactory().createPriceType();

      {
        ModelXMLSaver modelXMLSaver = new ModelXMLSaver();
        final StringWriter sw = new StringWriter();
        modelXMLSaver.setWriter(sw);
        final List<Object> objects = new ArrayList<Object>();
        objects.add(priceType2);
        modelXMLSaver.setObjects(objects);
        modelXMLSaver.write();

        final String xml1 = sw.toString();
        System.err.println(xml1);
        for (EAttribute eattr : Bz379796ModelPackage.INSTANCE.getPriceTypeEClass().getEAllAttributes()) {
          System.err.println(eattr.getName());
          if (ModelUtils.isUnsettable(eattr) || !eattr.isRequired() && eattr.getDefaultValue() == null) {
            Assert.assertTrue(!xml1.contains(eattr.getName()));
          } else if (eattr.getEAttributeType() instanceof EEnum && eattr.getDefaultValueLiteral() == null) {
            Assert.assertTrue(!xml1.contains(eattr.getName()));
          } else {
            Assert.assertTrue(xml1.contains(eattr.getName()));
          }
        }
      }
      {
        // now set everything
        priceType2.setComparison(ComparisonType.GREATER);
        priceType2.setComparisonElement(ComparisonType.GREATEROREQUAL);
        priceType2.setRequiredComparisonElement(ComparisonType.EQUAL);
        priceType2.setValue(val1);
        priceType2.setDb_Id(new Long(1));
        priceType2.setDb_version(2);
        priceType2.setValueElement(5);

        final List<Object> objects = new ArrayList<Object>();
        objects.clear();
        objects.add(priceType2);
        ModelXMLSaver modelXMLSaver = new ModelXMLSaver();

        modelXMLSaver.setObjects(objects);

        final StringWriter sw2 = new StringWriter();
        modelXMLSaver.setWriter(sw2);

        modelXMLSaver.write();

        final String xml2 = sw2.toString();

        // everything should now be there
        for (EAttribute eattr : Bz379796ModelPackage.INSTANCE.getPriceTypeEClass().getEAllAttributes()) {
          Assert.assertTrue(xml2.contains(eattr.getName()));
        }
      }
    }

  }
}
