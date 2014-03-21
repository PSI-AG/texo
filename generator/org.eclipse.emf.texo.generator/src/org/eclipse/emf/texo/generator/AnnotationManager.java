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
 * $Id: AnnotationManager.java,v 1.13 2011/09/23 21:00:18 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelFactory;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;

/**
 * During the annotation process takes care of managing all annotations and annotators.
 * 
 * Can be called to request for an annotation of a certain type (EClass) for an {@link ENamedElement}. Will retrieve the
 * annotations which have manually been created and will call an annotator to complete the values of the annotation.
 * 
 * @see ModelController
 * @see Annotator
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class AnnotationManager {

  public static final String JPA_ANNOTATION_SYSTEM_ID = "jpa"; //$NON-NLS-1$

  private static List<String> enabledAnnotationSystems = new ArrayList<String>();

  public static boolean isAnnotationSystemEnabled(String id) {
    return enabledAnnotationSystems.contains(id);
  }

  public static void enableAnnotationSystem(String id) {
    if (!isAnnotationSystemEnabled(id)) {
      enabledAnnotationSystems.add(id);
    }
  }

  public static void removeEnabledAnnotationSystem(String id) {
    enabledAnnotationSystems.remove(id);
  }

  private Map<EClass, Annotator<? extends ENamedElementAnnotation>> annotators = new HashMap<EClass, Annotator<? extends ENamedElementAnnotation>>();

  // the initial annotated model containing them all
  private AnnotatedModel annotatedModel = AnnotationsmodelFactory.eINSTANCE.createAnnotatedModel();

  private Map<ENamedElementAnnotation, ENamedElementAnnotation> processedAnnotations = new HashMap<ENamedElementAnnotation, ENamedElementAnnotation>();

  public ENamedElementAnnotation getAnnotation(ENamedElement eModelElement, EClass annotationEClass) {
    return getAnnotation(eModelElement, annotationEClass, true);
  }

  @SuppressWarnings("unchecked")
  public ENamedElementAnnotation getAnnotation(ENamedElement eModelElement, EClass annotationEClass, boolean initialized) {
    final AnnotatedENamedElement aElement = annotatedModel.getAnnotatedENamedElement(eModelElement, true);

    ENamedElementAnnotation eNamedElementAnnotation = null;
    for (ENamedElementAnnotation annotation : aElement.getAllAnnotations()) {
      if (annotationEClass.isSuperTypeOf(annotation.eClass())) {
        eNamedElementAnnotation = annotation;
        break;
      }
    }

    if (eNamedElementAnnotation == null) {
      // create a new annotation
      eNamedElementAnnotation = (ENamedElementAnnotation) annotationEClass.getEPackage().getEFactoryInstance()
          .create(annotationEClass);
      eNamedElementAnnotation.setGenerated(true);

      // add the new annotation to the annotatedModel
      addAnnotation(eModelElement, eNamedElementAnnotation);
    }

    // find an annotator to do the rest
    if (initialized && !processedAnnotations.containsKey(eNamedElementAnnotation)) {
      if (annotators.containsKey(annotationEClass)) {
        ((Annotator<ENamedElementAnnotation>) annotators.get(annotationEClass))
            .setAnnotationFeatures(eNamedElementAnnotation);
        processedAnnotations.put(eNamedElementAnnotation, eNamedElementAnnotation);
      }
    }

    return eNamedElementAnnotation;
  }

  public List<ENamedElementAnnotation> getAnnotations(ENamedElement namedElement) {
    final AnnotatedENamedElement aElement = annotatedModel.getAnnotatedENamedElement(namedElement, true);
    return aElement.getAllAnnotations();
  }

  protected void addAnnotation(EModelElement eModelElement, ENamedElementAnnotation annotation) {
    if (eModelElement instanceof EPackage) {
      final AnnotatedEPackage aPackage = annotatedModel.getAnnotatedEPackage((EPackage) eModelElement, true);
      aPackage.getEPackageAnnotations().add((EPackageAnnotation) annotation);
    } else if (eModelElement instanceof EClass) {
      final AnnotatedEClass aClass = annotatedModel.getAnnotatedEClass((EClass) eModelElement, true);
      aClass.getEClassAnnotations().add((EClassAnnotation) annotation);
    } else if (eModelElement instanceof EReference) {
      final AnnotatedEReference aReference = annotatedModel.getAnnotatedEReference((EReference) eModelElement, true);
      aReference.getEReferenceAnnotations().add((EReferenceAnnotation) annotation);
    } else if (eModelElement instanceof EAttribute) {
      final AnnotatedEAttribute aAttribute = annotatedModel.getAnnotatedEAttribute((EAttribute) eModelElement, true);
      aAttribute.getEAttributeAnnotations().add((EAttributeAnnotation) annotation);
    } else if (eModelElement instanceof EEnum) {
      final AnnotatedEEnum aEnum = annotatedModel.getAnnotatedEEnum((EEnum) eModelElement, true);
      if (annotation instanceof EEnumAnnotation) {
        aEnum.getEEnumAnnotations().add((EEnumAnnotation) annotation);
      } else {
        aEnum.getEDataTypeAnnotations().add((EDataTypeAnnotation) annotation);
      }
    } else if (eModelElement instanceof EEnumLiteral) {
      final AnnotatedEEnumLiteral aEnumLiteral = annotatedModel.getAnnotatedEEnumLiteral((EEnumLiteral) eModelElement,
          true);
      aEnumLiteral.getEEnumLiteralAnnotations().add((EEnumLiteralAnnotation) annotation);
    } else if (eModelElement instanceof EDataType) {
      final AnnotatedEDataType aDataType = annotatedModel.getAnnotatedEDataType((EDataType) eModelElement, true);
      aDataType.getEDataTypeAnnotations().add((EDataTypeAnnotation) annotation);
    } else {
      throw new IllegalArgumentException("Type " + eModelElement + " not supported here");// $//$ //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  public void addAnnotators(ModelAnnotator modelAnnotator) {
    for (Annotator<? extends ENamedElementAnnotation> annotator : modelAnnotator.getAnnotators()) {
      addAnnotator(annotator);
    }
  }

  public void addAnnotator(Annotator<? extends ENamedElementAnnotation> annotator) {
    annotators.put(annotator.getAnnotationEClass(), annotator);
    annotator.setAnnotationManager(this);
  }

  @SuppressWarnings("unchecked")
  public Annotator<ENamedElementAnnotation> getAnnotator(EClass annotationEClass) {
    return (Annotator<ENamedElementAnnotation>) annotators.get(annotationEClass);
  }

  public AnnotatedModel getAnnotatedModel() {
    return annotatedModel;
  }

  public void setAnnotatedModel(AnnotatedModel annotatedModel) {
    this.annotatedModel = annotatedModel;
  }
}
