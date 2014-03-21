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
 * $Id: EStructuralFeatureORMAnnotator.java,v 1.2 2010/09/23 12:42:50 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Base class of EStructuralFeature annotators.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class EStructuralFeatureORMAnnotator extends ETypeElementORMAnnotator {
  protected boolean doAddQNameConverter(EStructuralFeatureModelGenAnnotation annotation) {
    final EStructuralFeature eFeature = annotation.getEStructuralFeature();
    if (FeatureMapUtil.isFeatureMap(eFeature)) {
      return false;
    }
    if (!ORMMappingOptions.getDefaultOptions().isTestRun()) {
      return false;
    }
    if (annotation.getEStructuralFeature().getEType() instanceof EEnum) {
      return false;
    }
    if (ModelUtils.isAnyType(eFeature)) {
      return true;
    }
    final EClassifier eClassifier = eFeature.getEType();
    if (eClassifier.getInstanceClass() != null && QName.class == eClassifier.getInstanceClass()) {
      return true;
    }
    return false;
  }

  protected boolean doAddConverter(EStructuralFeatureModelGenAnnotation annotation) {
    final EStructuralFeature eFeature = annotation.getEStructuralFeature();
    if (FeatureMapUtil.isFeatureMap(eFeature)) {
      return false;
    }
    if (!ORMMappingOptions.getDefaultOptions().isTestRun()) {
      return false;
    }
    if (annotation.getEStructuralFeature().getEType() instanceof EEnum) {
      return false;
    }
    if (ModelUtils.isAnyType(eFeature)) {
      return true;
    }
    if (annotation.getObjectType() != null
        && (annotation.getItemType().equals(EObject.class.getName()) || annotation.getItemType().equals(
            Object.class.getName()))) {
      return true;
    }
    return false;
  }

}