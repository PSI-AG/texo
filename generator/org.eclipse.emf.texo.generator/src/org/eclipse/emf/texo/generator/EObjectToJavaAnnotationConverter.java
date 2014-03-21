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
 * $Id: EObjectToJavaAnnotationConverter.java,v 1.3 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.Collection;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Contains logic to translate an EObject to a java annotation representation. The assumption is that the EClass and
 * EStructuralFeature names all correspond directly with the names of the java annotation.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EObjectToJavaAnnotationConverter {

  public static final String JAVA_ANNOTATABLE_FEATURE = "texo.java.annotatable"; //$NON-NLS-1$
  public static final String JAVA_PACKAGE_EANNOTATION_SOURCE = "texo.java.package"; //$NON-NLS-1$
  public static final String EANNOTATION_KEY = "value"; //$NON-NLS-1$

  private static EObjectToJavaAnnotationConverter instance = new EObjectToJavaAnnotationConverter();

  public static EObjectToJavaAnnotationConverter getInstance() {
    return instance;
  }

  public static void setInstance(EObjectToJavaAnnotationConverter instance) {
    EObjectToJavaAnnotationConverter.instance = instance;
  }

  public String convertItsFeaturesToAnnotations(EObject eObject) {
    final StringBuilder sb = new StringBuilder();
    for (EReference eReference : eObject.eClass().getEAllReferences()) {
      // only do the ones which are annotatable.
      if (eReference.getEAnnotation(JAVA_ANNOTATABLE_FEATURE) == null) {
        continue;
      }
      final Object value = eObject.eGet(eReference);
      if (value != null) {
        if (sb.length() > 0) {
          sb.append("\n"); //$NON-NLS-1$
        }
        sb.append(EObjectToJavaAnnotationConverter.getInstance().convert((EObject) value));
      }
    }
    return sb.toString();

  }

  public String convert(EObject eObject) {
    final StringBuilder sb = new StringBuilder();
    sb.append("@" + getBasePackage(eObject.eClass()) + "." + eObject.eClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$ 
    sb.append("("); //$NON-NLS-1$
    boolean addComma = false;
    for (EStructuralFeature eFeature : eObject.eClass().getEAllStructuralFeatures()) {
      // ignore non-containment ereferences
      if (eFeature instanceof EReference && !((EReference) eFeature).isContainment()) {
        continue;
      }
      final Object value = eObject.eGet(eFeature);
      if (value == null) {
        continue;
      }
      if (addComma) {
        sb.append(","); //$NON-NLS-1$
      }
      sb.append(eFeature.getName() + "="); //$NON-NLS-1$
      if (eFeature.isMany()) {
        sb.append(handleMany(eFeature, value));
      } else if (eFeature instanceof EAttribute) {
        sb.append(convert((EAttribute) eFeature, value));
      } else {
        sb.append(convert((EReference) eFeature, value));
      }
      addComma = true;
    }
    sb.append(")"); //$NON-NLS-1$
    return sb.toString();
  }

  private String getBasePackage(EModelElement eModelElement) {
    final EAnnotation eAnnotation = eModelElement.getEAnnotation(JAVA_PACKAGE_EANNOTATION_SOURCE);
    if (eAnnotation == null) {
      return ""; //$NON-NLS-1$
    }
    return eAnnotation.getDetails().get(EANNOTATION_KEY);
  }

  public String handleMany(EStructuralFeature eFeature, Object values) {
    final StringBuilder sb = new StringBuilder();
    if (eFeature.isMany()) {
      sb.append("{"); //$NON-NLS-1$
    }
    boolean addComma = false;
    for (Object value : (Collection<?>) values) {
      if (addComma) {
        sb.append(","); //$NON-NLS-1$
      }
      if (eFeature instanceof EAttribute) {
        sb.append(convert((EAttribute) eFeature, value));
      } else {
        sb.append(convert((EReference) eFeature, value));
      }
      addComma = true;
    }
    if (eFeature.isMany()) {
      sb.append("}"); //$NON-NLS-1$
    }
    return sb.toString();
  }

  public String convert(EReference eReference, Object value) {
    return convert((EObject) value);
  }

  public String convert(EAttribute eAttribute, Object value) {
    if (value instanceof String) {
      return "\"" + value + "\""; //$NON-NLS-1$ //$NON-NLS-2$
    }
    if (value instanceof Enumerator) {
      return ((Enumerator) value).getLiteral();
    }
    if (eAttribute.getEAttributeType() == EcorePackage.eINSTANCE.getEJavaClass()) {
      if (value instanceof Class<?>) {
        return ((Class<?>) value).getName() + ".class"; //$NON-NLS-1$
      }
      return value.toString() + ".class"; //$NON-NLS-1$
    }
    return eAttribute.getEType().getEPackage().getEFactoryInstance()
        .convertToString(eAttribute.getEAttributeType(), value);
  }
}
