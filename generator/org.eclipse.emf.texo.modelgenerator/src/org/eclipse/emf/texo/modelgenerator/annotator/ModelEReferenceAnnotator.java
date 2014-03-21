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
 * $Id: ModelEReferenceAnnotator.java,v 1.16 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Responsible for setting the values in a {@link EReferenceModelGenAnnotation}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */

public class ModelEReferenceAnnotator extends ModelEStructuralFeatureAnnotator implements
    Annotator<EReferenceModelGenAnnotation> {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  @Override
  public EClass getAnnotationEClass() {
    return ModelcodegeneratorPackage.eINSTANCE.getEReferenceModelGenAnnotation();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EReferenceModelGenAnnotation annotation) {
    Check.isNotNull(annotation.getEReference(), "eReference must be set");//$NON-NLS-1$
    super.annotate(annotation);
    if (!annotation.isSetReference()) {
      annotation.setReference(true);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EReferenceModelGenAnnotation annotation) {
    super.postAnnotating(annotation);

    final boolean saveManyAccess = !ModelUtils.isEMap(annotation.getEStructuralFeature())
        && getEPackageModelGenAnnotation(annotation.getEReference().getEContainingClass().getEPackage())
            .isGenerateSafeManyAccess();

    final boolean doBidirectionalHandling = !ModelUtils.isEMap(annotation.getEStructuralFeature())
        && getEPackageModelGenAnnotation(annotation.getEReference().getEContainingClass().getEPackage())
            .isGenerateBidirectionalAssociationSupport();

    if (!annotation.isSetGenerateSafeManyAccess()) {
      annotation.setGenerateSafeManyAccess(saveManyAccess);
    }
    if (!annotation.isSetGenerateBidirectionalAssociationSupport()) {
      annotation.setGenerateBidirectionalAssociationSupport(doBidirectionalHandling);
    }

    // set the opposite
    if (saveManyAccess && annotation.getEReference().getEOpposite() != null
        && annotation.getOppositeModelGenAnnotation() == null) {

      final EReferenceModelGenAnnotation oppositeAnnotation = getEReferenceModelGenAnnotation(annotation
          .getEReference().getEOpposite());
      annotation.setOppositeModelGenAnnotation(oppositeAnnotation);
      oppositeAnnotation.setOppositeModelGenAnnotation(annotation);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.modelgenerator.annotator.ModelEStructuralFeatureAnnotator#getType(org.
   * eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  protected String getType(EStructuralFeature eFeature, EStructuralFeatureModelGenAnnotation genAnnotation) {
    final EReference eReference = (EReference) eFeature;

    if (ModelUtils.isEMap(eReference)) {
      return Map.class.getName() + "<" + getItemType(eReference) + //$NON-NLS-1$ 
          ">"; //$NON-NLS-1$
    } else if (eReference.isMany()) {
      if (genAnnotation.isUseList()) {
        return List.class.getName() + "<" + getItemType(eReference) + //$NON-NLS-1$ 
            ">"; //$NON-NLS-1$
      }
      return Set.class.getName() + "<" + getItemType(eReference) + //$NON-NLS-1$ 
          ">"; //$NON-NLS-1$
    }

    // eobject references are used as any type, in Texo these are
    // represented by the Object class.
    if (eReference.getEReferenceType() == EcorePackage.eINSTANCE.getEObject()) {
      return Object.class.getName();
    }

    return getEClassModelGenAnnotation(eReference.getEReferenceType()).getQualifiedClassName();
  }

  @Override
  protected String getItemType(EStructuralFeature eFeature) {
    final EReference eReference = (EReference) eFeature;
    if (ModelUtils.isEMap(eReference)) {
      return getMapKeyValueTypes(eReference);
    }

    // eobject references are used as any type, in Texo these are
    // represented by the Object class.
    if (eReference.getEReferenceType() == EcorePackage.eINSTANCE.getEObject()) {
      return Object.class.getName();
    }

    return getEClassModelGenAnnotation(eReference.getEReferenceType()).getQualifiedClassName();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.modelgenerator.annotator.ModelEStructuralFeatureAnnotator#getDefaultValue
   * (org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  protected String getDefaultValue(EStructuralFeature eFeature, EStructuralFeatureModelGenAnnotation genAnnotation) {
    final EReference eReference = (EReference) eFeature;
    if (ModelUtils.isEMap(eReference)) {
      if (genAnnotation.isUseList()) {
        return "new " + LinkedHashMap.class.getName() + //$NON-NLS-1$ 
            "<" + getItemType(eReference) //$NON-NLS-1$
            + ">()"; //$NON-NLS-1$
      }
      return "new " + HashMap.class.getName() + //$NON-NLS-1$ 
          "<" + getItemType(eReference) //$NON-NLS-1$
          + ">()"; //$NON-NLS-1$
    } else if (eReference.isMany()) {
      if (genAnnotation.isUseList()) {
        return "new " + ArrayList.class.getName() + //$NON-NLS-1$ 
            "<" + getItemType(eReference) //$NON-NLS-1$
            + ">()"; //$NON-NLS-1$
      }
      return "new " + HashSet.class.getName() + //$NON-NLS-1$ 
          "<" + getItemType(eReference) //$NON-NLS-1$
          + ">()"; //$NON-NLS-1$
    }

    return GenConstants.NULL;
  }

  /**
   * Computes the type of the key and value of the map and returns those. The types are defined in the key and value
   * EFeatures of the EMap EClass.
   * 
   * @return a String which can be used directly in the declaration of the Map in the generated java code (e.g. String,
   *         Object).
   */
  private String getMapKeyValueTypes(EReference eReference) {
    final EClass mapType = eReference.getEReferenceType();
    final String valueClass = getInstanceTypeFromEStructuralFeature(mapType.getEStructuralFeature("value")); //$NON-NLS-1$
    final String keyClass = getInstanceTypeFromEStructuralFeature(mapType.getEStructuralFeature("key")); //$NON-NLS-1$
    return keyClass + ", " + valueClass; //$NON-NLS-1$
  }

  private String getInstanceTypeFromEStructuralFeature(final EStructuralFeature eStructuralFeature) {
    final EStructuralFeatureModelGenAnnotation annotation = getEStructuralFeatureModelGenAnnotation(eStructuralFeature);
    return annotation.getType();
  }

}