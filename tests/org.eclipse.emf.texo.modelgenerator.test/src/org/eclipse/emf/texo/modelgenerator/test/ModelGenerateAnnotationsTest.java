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
 * $Id: ModelGenerateAnnotationsTest.java,v 1.12 2011/08/26 14:34:50 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.annotator.ModelGenAnnotator;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;

/**
 * Test the generation of annotations for model generation. See the {@link ModelGenAnnotator} class.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.12 $
 */
public class ModelGenerateAnnotationsTest extends TestCase {

  public void testBasicGeneration() throws Exception {
    // force the ecore package to be registered
    EcorePackage.eINSTANCE.getEPackage();

    final URL url = TestModel.getModelUrl("samples/library.ecore"); //$NON-NLS-1$
    final List<EPackage> ePackages = GeneratorUtils.readEPackage(url.toURI(), GeneratorUtils.createEPackageRegistry(),
        false);

    final ModelController modelController = new ModelController();
    modelController.setEPackages(ePackages);
    modelController.annotate(new ArrayList<ModelAnnotator>());

    checkCompletelyAnnotated(ePackages.get(0), modelController.getAnnotationManager().getAnnotatedModel());
  }

  public void testBasicGenerationAllModels() throws Exception {
    for (String modelFileName : TestModel.getAllModelRelativePaths()) {
      final URL url = TestModel.getModelUrl(modelFileName);
      final List<EPackage> ePackages = GeneratorUtils.readEPackage(url.toURI(),
          GeneratorUtils.createEPackageRegistry(), false);

      final ModelController modelController = new ModelController();
      modelController.setEPackages(ePackages);
      modelController.annotate(new ArrayList<ModelAnnotator>());

      System.err.println("Checking " + modelFileName); //$NON-NLS-1$

      checkCompletelyAnnotated(ePackages.get(0), modelController.getAnnotationManager().getAnnotatedModel());
    }
  }

  private void checkCompletelyAnnotated(final EPackage ePackage, final AnnotatedModel annotatedModel) {

    final AnnotatedEPackage aPackage = annotatedModel.getAnnotatedEPackage(ePackage, false);
    assertNotNull(aPackage);
    assertFalse(aPackage.getEPackageAnnotations().isEmpty());
    checkAnnotationClassPresent(aPackage.getAllAnnotations(), EPackageModelGenAnnotation.class);

    for (EClassifier eClassifier : ePackage.getEClassifiers()) {
      final AnnotatedEClassifier aClassifier = annotatedModel.getAnnotatedEClassifier(eClassifier, false);
      assertNotNull(aClassifier);
      assertFalse(aClassifier.getAllAnnotations().isEmpty());
      checkAnnotationClassPresent(aClassifier.getAllAnnotations(), EClassifierModelGenAnnotation.class);
    }
  }

  private void checkAnnotationClassPresent(final List<?> annotations, final Class<?> clz) {
    for (Object o : annotations) {
      if (clz.isAssignableFrom(o.getClass())) {
        return;
      }
    }
    fail("No annotation of class " + clz.getName() //$NON-NLS-1$
        + " present in annotation list"); //$NON-NLS-1$
  }
}
