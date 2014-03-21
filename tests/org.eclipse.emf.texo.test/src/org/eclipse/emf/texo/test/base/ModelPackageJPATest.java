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
 * $Id: ModelPackageJPATest.java,v 1.7 2011/08/25 12:42:40 mtaal Exp $
 */
package org.eclipse.emf.texo.test.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * Base JPA Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class ModelPackageJPATest extends TestCase {

  private List<ModelPackage> modelPackages;
  private List<EClass> eClasses;

  public ModelPackageJPATest(ModelPackage modelPackage) {
    this(modelPackage, ""); //$NON-NLS-1$
  }

  public ModelPackageJPATest(ModelPackage modelPackage, String postFix) {
    super(modelPackage.getEPackage().getName() + postFix);
    modelPackages = Collections.singletonList(modelPackage);
  }

  public ModelPackageJPATest(List<ModelPackage> modelPackages) {
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
    eClasses = DataGeneratorUtils.getRootEClasses(getEPackages());
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

    final List<EObject> list = modelDataGenerator.getResult();
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    final List<Object> result = emfModelConverter.convert(list);

    // System.err.println(modelDataGenerator.getTotalObjectCount());
    // ModelXMLSaver xmlPrinter = new ModelXMLSaver();
    // xmlPrinter.setObjects(result);
    // final StringWriter sw = new StringWriter();
    // xmlPrinter.setSaveAsXMI(true);
    // xmlPrinter.setWriter(sw);
    // xmlPrinter.write();
    // System.err.println(sw.toString());

    return result;
  }

}
