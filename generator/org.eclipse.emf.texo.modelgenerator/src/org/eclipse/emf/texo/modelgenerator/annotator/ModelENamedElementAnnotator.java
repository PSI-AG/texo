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
 * $Id: ModelENamedElementAnnotator.java,v 1.12 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;

/**
 * Sets the features of a {@link ENamedElement} annotation.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class ModelENamedElementAnnotator {

  private AnnotationManager annotationManager;

  private Map<String, Class<?>> instanceClassCache = new HashMap<String, Class<?>>();

  // used in getClassForName to store that no class could be found
  private static class NULLIndicator {
  }

  protected Class<?> getClassForName(EDataType eDataType, String name) {
    final String cachedName = eDataType.getEPackage().getNsURI() + eDataType.getName() + "___" + name; //$NON-NLS-1$
    Class<?> result = instanceClassCache.get(cachedName);
    if (result != null) {
      // not found
      if (result == NULLIndicator.class) {
        return null;
      }
      return result;
    }
    result = GenUtils.getClassForName(eDataType, name);
    if (result == null) {
      instanceClassCache.put(cachedName, NULLIndicator.class);
    } else {
      instanceClassCache.put(cachedName, result);
    }
    return result;
  }

  protected void annotate(final ENamedElementModelGenAnnotation annotation) {
    Check.isTrue(getAnnotationEClass().isSuperTypeOf(annotation.eClass()),
        "Invalid annotation eclass " + annotation + " for this annotator " + this); //$NON-NLS-1$//$NON-NLS-2$
    Check.isNotNull(annotation.getENamedElement(), "eNamedElement must be set");//$NON-NLS-1$
    if (annotation.getDocumentation() == null) {
      annotation.setDocumentation(EcoreUtil.getDocumentation(annotation.getENamedElement()));
    }
    annotation.setName(getName(annotation.getENamedElement()));
  }

  public abstract EClass getAnnotationEClass();

  protected String getName(ENamedElement namedElement) {
    return namedElement.getName();
  }

  public AnnotationManager getAnnotationManager() {
    return annotationManager;
  }

  public void setAnnotationManager(AnnotationManager annotationManager) {
    this.annotationManager = annotationManager;
  }

  protected EPackageModelGenAnnotation getEPackageModelGenAnnotation(EPackage ePackage) {
    return (EPackageModelGenAnnotation) annotationManager.getAnnotation(ePackage,
        ModelcodegeneratorPackage.eINSTANCE.getEPackageModelGenAnnotation());
  }

  protected EPackageModelGenAnnotation getEPackageModelGenAnnotation(EPackage ePackage, boolean initialized) {
    return (EPackageModelGenAnnotation) annotationManager.getAnnotation(ePackage,
        ModelcodegeneratorPackage.eINSTANCE.getEPackageModelGenAnnotation(), initialized);
  }

  protected EClassModelGenAnnotation getEClassModelGenAnnotation(EClass eClass) {
    return (EClassModelGenAnnotation) annotationManager.getAnnotation(eClass,
        ModelcodegeneratorPackage.eINSTANCE.getEClassModelGenAnnotation());
  }

  protected EStructuralFeatureModelGenAnnotation getEStructuralFeatureModelGenAnnotation(EStructuralFeature eFeature) {
    if (eFeature instanceof EReference) {
      return getEReferenceModelGenAnnotation((EReference) eFeature);
    }
    return getEAttributeModelGenAnnotation((EAttribute) eFeature);
  }

  protected EReferenceModelGenAnnotation getEReferenceModelGenAnnotation(EReference eReference) {
    return (EReferenceModelGenAnnotation) annotationManager.getAnnotation(eReference,
        ModelcodegeneratorPackage.eINSTANCE.getEReferenceModelGenAnnotation());
  }

  protected EAttributeModelGenAnnotation getEAttributeModelGenAnnotation(EAttribute eAttribute) {
    return (EAttributeModelGenAnnotation) annotationManager.getAnnotation(eAttribute,
        ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation());
  }

  protected EDataTypeModelGenAnnotationDefinition getEDataTypeModelGenAnnotation(EDataType eDataType) {
    if (eDataType == null) {
      throw new IllegalStateException("The EDataType of one of the model elements in your model is not set, it is null"); //$NON-NLS-1$
    }
    if (eDataType instanceof EEnum) {
      return getEEnumModelGenAnnotation((EEnum) eDataType);
    }
    return (EDataTypeModelGenAnnotation) annotationManager.getAnnotation(eDataType,
        ModelcodegeneratorPackage.eINSTANCE.getEDataTypeModelGenAnnotation());
  }

  protected EEnumModelGenAnnotation getEEnumModelGenAnnotation(EEnum eEnum) {
    return (EEnumModelGenAnnotation) annotationManager.getAnnotation(eEnum,
        ModelcodegeneratorPackage.eINSTANCE.getEEnumModelGenAnnotation());
  }
}
