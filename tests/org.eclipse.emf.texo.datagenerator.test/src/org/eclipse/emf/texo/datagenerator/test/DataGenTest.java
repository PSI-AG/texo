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
 * $Id: DataGenTest.java,v 1.9 2011/08/25 12:46:08 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.modisco.kdm.KdmModelPackage;

/**
 * Test the generation of testdata
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class DataGenTest extends TestCase {

  public void testLibrarySmall() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(ExtlibraryModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(ExtlibraryModelPackage.INSTANCE.getLibraryEClass());

    final List<EObject> eObjects = generateTestSet(ePackages, eClasses, 1, 1, 1, 100);
    validate(eObjects, true);
  }

  public void testExtendedPOTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(Epo2ModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(Epo2ModelPackage.INSTANCE.getSupplierEClass());

    final List<EObject> eObjects = generateTestSet(ePackages, eClasses, 10, 10, 10, 10000);
    validate(eObjects, true);
  }

  public void testKDM() throws Exception {
    IdentifiableModelPackage.initialize();
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(KdmModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    for (EPackage subEPackage : KdmModelPackage.INSTANCE.getEPackage().getESubpackages()) {
      ePackages.add(subEPackage);
      for (EClassifier eClassifier : subEPackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClass eClass = (EClass) eClassifier;
          if (!eClass.isAbstract() && !eClass.isInterface()) {
            eClasses.add(eClass);
          }
        }
      }
    }

    final List<EObject> eObjects = generateTestSet(ePackages, eClasses, 3, 3, 3, 100000);
    validate(eObjects, true);
  }

  public void testAccountingTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(AccountingModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(AccountingModelPackage.INSTANCE.getAccountingEClass());

    final List<EObject> eObjects = generateTestSet(ePackages, eClasses, 1, 5, 5, 10000);
    validate(eObjects, true);
  }

  public void testPlayTestData() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(PlayModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(PlayModelPackage.INSTANCE.getPlayTypeEClass());

    final List<EObject> eObjects = generateTestSet(ePackages, eClasses, 10, 10, 10, 10000);
    validate(eObjects, false);
  }

  public void testEObjectGenerationLarge() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(ExtlibraryModelPackage.INSTANCE.getEPackage());
    final List<EClass> eClasses = new ArrayList<EClass>();
    eClasses.add(ExtlibraryModelPackage.INSTANCE.getLibraryEClass());

    final List<EObject> eObjects = generateTestSet(ePackages, eClasses, 3, 5, 5, 100000);
    assertTrue(eObjects.size() > 0);
    validate(eObjects, false);
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
    System.err.println("Generated " + modelDataGenerator.getTotalObjectCount() + " objects "); //$NON-NLS-1$ //$NON-NLS-2$
    return modelDataGenerator.getResult();
  }

  // calls the EMF validator and saves the objects in a
  // XMLResource/XMIResource to
  // test if that works
  private void validate(final List<EObject> eObjects, final boolean printToConsole) throws Exception {
    // validate the result
    for (final EObject eObject : eObjects) {
      final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
      if (diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.ERROR) {
        fail(diagnostic.getMessage());
      }
    }

    // store them in a resource to see if that works
    final XMIResource resource = new XMIResourceImpl();
    resource.getContents().addAll(eObjects);
    final StringWriter sw = new StringWriter();
    resource.save(sw, Collections.EMPTY_MAP);

    // if (false && printToConsole) {
    // System.err.println(sw.toString());
    // }
  }

}