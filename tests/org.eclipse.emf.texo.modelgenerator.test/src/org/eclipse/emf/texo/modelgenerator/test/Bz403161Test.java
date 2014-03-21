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
 * $Id: EclipseModelGeneratorTest.java,v 1.24 2011/10/25 13:19:13 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for bugzilla: https://bugs.eclipse.org/bugs/show_bug.cgi?id=403161
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.24 $
 */

public class Bz403161Test extends TestCase {

  @Test
  public void test() throws Exception {

    // force initialization
    ModelAnnotatorRegistry.getInstance().getModelAnnotators();
    URL url = TestModel.getModelUrl("issues/bz403161_2.ecore"); //$NON-NLS-1$

    final EPackage.Registry packageRegistry = GeneratorUtils.createEPackageRegistry();
    final List<EPackage> ePackages = GeneratorUtils.readEPackages(Collections.singletonList(url.toURI()),
        packageRegistry, false);
    final ModelController modelController = new ModelController();
    modelController.setEPackages(ePackages);
    modelController.getAnnotationManager().getAnnotatedModel().setGeneratingSources(true);
    modelController.annotate(new ArrayList<ModelAnnotator>());

    final EClass subEClass = (EClass) ePackages.get(0).getEClassifier("Test403161_2"); //$NON-NLS-1$
    final EClass superEClass = subEClass.getESuperTypes().get(0);

    modelController.getAnnotation(subEClass, ModelcodegeneratorPackage.eNS_URI);
    final EClassModelGenAnnotation subModelGenAnnotation = (EClassModelGenAnnotation) modelController.getAnnotation(
        subEClass, ModelcodegeneratorPackage.eNS_URI);
    Assert.assertEquals(1, subModelGenAnnotation.getEStructuralFeatureModelGenAnnotations().size());
    Assert.assertEquals(2, subModelGenAnnotation.getEAllStructuralFeatureModelGenAnnotations().size());
    final EClassModelGenAnnotation superModelGenAnnotation = (EClassModelGenAnnotation) modelController.getAnnotation(
        superEClass, ModelcodegeneratorPackage.eNS_URI);
    Assert.assertEquals(1, superModelGenAnnotation.getEStructuralFeatureModelGenAnnotations().size());
    Assert.assertEquals(1, superModelGenAnnotation.getEAllStructuralFeatureModelGenAnnotations().size());
  }
}