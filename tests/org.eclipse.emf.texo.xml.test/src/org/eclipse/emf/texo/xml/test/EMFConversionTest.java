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
 * $Id: EMFConversionTest.java,v 1.9 2011/08/25 12:42:35 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.emap.EmapsampleModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * Test the conversion from and to EMF objects.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class EMFConversionTest extends TestCase {

  // fails because order is not maintained in lists/sets
  public void _testExtLibrary() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(ExtlibraryModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(ExtlibraryModelPackage.INSTANCE.getLibraryEClass());
    doTest(ePackages, eClasses);
  }

  // not supported because of multiple inheritance
  // public void testExtendedPOTestData() throws Exception {
  // final List<EPackage> ePackages = new ArrayList<EPackage>();
  // ePackages.add(Epo2ModelPackage.INSTANCE.getEPackage());
  // final List<EClass> eClasses = new ArrayList<EClass>();
  // eClasses.add(Epo2ModelPackage.INSTANCE.getSupplierEClass());
  // doTest(ePackages, eClasses);
  // }

  // fails because exports adds <Vat xsi:nill="true"/>
  public void _testAccountingTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(AccountingModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(AccountingModelPackage.INSTANCE.getAccountingEClass());
    doTest(ePackages, eClasses);
  }

  public void testEmapTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(EmapsampleModelPackage.INSTANCE.getEPackage());
    doTest(ePackages, DataGeneratorUtils.getRootEClasses(ePackages));
  }

  public void testRentalTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(RentalModelPackage.INSTANCE.getEPackage());
    doTest(ePackages, DataGeneratorUtils.getRootEClasses(ePackages));
  }

  public void testPlayTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(PlayModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(PlayModelPackage.INSTANCE.getPlayTypeEClass());
    doTest(ePackages, eClasses);
  }

  private void doTest(final List<EPackage> ePackages, final List<EClass> eClasses) throws Exception {
    // create a testset
    final List<EObject> beforeEObjects = generateTestSet(ePackages, eClasses, 3, 5, 5, 100000);
    // create the xmi string
    final String beforeXMIString = getXMIString(beforeEObjects);
    // System.err.println(beforeXMIString);

    // convert to ModelObjects
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    final List<Object> objects = emfModelConverter.convert(beforeEObjects);

    // convert back
    final ModelEMFConverter modelEMFConverter = new ModelEMFConverter();
    final List<EObject> afterEObjects = modelEMFConverter.convert(objects);

    // create xmi string
    final String afterXMIString = getXMIString(afterEObjects);

    // System.err.println(afterXMIString);
    // writeXMIToFile("_1.xml", beforeXMIString);
    // writeXMIToFile("_2.xml", afterXMIString);

    assertEquals(beforeXMIString, afterXMIString);
  }

  // private void writeXMIToFile(String suffix, String content) throws Exception {
  // final FileWriter fw = new FileWriter("/home/mtaal/mytmp/xml" + suffix);
  // fw.write(content);
  // fw.flush();
  // fw.close();
  // }

  private String getXMIString(final List<EObject> eObjects) throws Exception {
    final XMIResource resource = new XMIResourceImpl();
    resource.getContents().addAll(eObjects);
    final StringWriter sw = new StringWriter();
    resource.save(sw, Collections.EMPTY_MAP);
    return sw.toString();
  }

  private List<EObject> generateTestSet(final List<EPackage> ePackages, final List<EClass> eClasses,
      final int dataSize, final int collectionSize, final int maxDepth, final int maxObjects) {
    final ModelDataGenerator modelDataGenerator = new ModelDataGenerator();
    modelDataGenerator.setStartEClasses(eClasses);
    modelDataGenerator.setMaxDepth(maxDepth);
    modelDataGenerator.setCollectionSize(collectionSize);
    modelDataGenerator.setDataSize(dataSize);
    modelDataGenerator.setMaxObjects(maxObjects);
    modelDataGenerator.setEPackages(ePackages);
    modelDataGenerator.generateTestData();
    System.err.println(modelDataGenerator.getTotalObjectCount());
    return modelDataGenerator.getResult();
  }
}