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
 * $Id: AnnotationsModelRegistry.java,v 1.3 2011/08/25 12:33:30 mtaal Exp $
 */

package org.eclipse.emf.texo.annotations.annotationsmodel.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

/**
 * Manages the available annotation models.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class AnnotationsModelRegistry {

  private static AnnotationsModelRegistry instance = new AnnotationsModelRegistry();

  public static AnnotationsModelRegistry getInstance() {
    return instance;
  }

  public static void setInstance(AnnotationsModelRegistry instance) {
    AnnotationsModelRegistry.instance = instance;
  }

  private List<EPackage> annotationModels = new ArrayList<EPackage>();

  public void addAnnotationModel(EPackage ePackage) {
    if (!annotationModels.contains(ePackage)) {
      annotationModels.add(ePackage);
    }
  }

  public List<EPackage> getAnnotationModels() {
    return annotationModels;
  }

  public void setAnnotationModels(List<EPackage> annotationModels) {
    this.annotationModels = annotationModels;
  }

  public List<EClass> getSubEClasses(EClass eSuperClass) {
    final List<EClass> result = new ArrayList<EClass>();
    for (EPackage ePackage : annotationModels) {
      for (EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClass eClass = (EClass) eClassifier;
          if (eSuperClass.isSuperTypeOf(eClass)) {
            result.add(eClass);
          }
        }
      }
    }
    return result;
  }

}
