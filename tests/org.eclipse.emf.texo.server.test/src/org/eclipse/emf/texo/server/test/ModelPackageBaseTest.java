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
 * $Id: ModelPackageBaseTest.java,v 1.3 2011/08/25 14:34:48 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Base Package Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ModelPackageBaseTest extends BaseTest {

  private List<ModelPackage> modelPackages;
  private List<EClass> eClasses;

  public ModelPackageBaseTest(ModelPackage modelPackage) {
    super(modelPackage.getEPackage().getName());
    ServiceModelPackageRegistry.getInstance().register(modelPackage);
    modelPackages = Collections.singletonList(modelPackage);
  }

  public ModelPackageBaseTest(List<ModelPackage> modelPackages) {
    super(modelPackages.get(0).getEPackage().getName());
    this.modelPackages = modelPackages;
  }

  public List<EClass> getEClasses() {
    if (eClasses == null) {
      setAllEClasses();
    }
    return eClasses;
  }

  public void setEClasses(List<EClass> eClasses) {
    this.eClasses = eClasses;
  }

  protected void setAllEClasses() {
    eClasses = new ArrayList<EClass>();
    for (final EPackage ePackage : getEPackages()) {
      for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass && !ModelUtils.isEMap((EClass) eClassifier)) {
          final EClass eClass = (EClass) eClassifier;
          if (!eClass.isAbstract() && !eClass.isInterface()) {
            eClasses.add((EClass) eClassifier);
          }
        }
      }
    }
  }

  protected List<EPackage> getEPackages() {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    for (ModelPackage modelPackage : modelPackages) {
      ePackages.add(modelPackage.getEPackage());
    }
    return ePackages;
  }

  protected List<Object> generateTestSet(final int dataSize, final int collectionSize, final int maxDepth,
      final int maxObjects) {
    final ModelDataGenerator modelDataGenerator = new ModelDataGenerator();
    modelDataGenerator.setStartEClasses(getEClasses());
    modelDataGenerator.setMaxDepth(maxDepth);
    modelDataGenerator.setCollectionSize(collectionSize);
    modelDataGenerator.setDataSize(dataSize);
    modelDataGenerator.setMaxObjects(maxObjects);
    modelDataGenerator.setEPackages(getEPackages());
    modelDataGenerator.setUseDataFiles(false);
    modelDataGenerator.generateTestData();
    System.err.println(modelDataGenerator.getTotalObjectCount());
    final List<EObject> list = modelDataGenerator.getResult();
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    return emfModelConverter.convert(list);
  }

}
