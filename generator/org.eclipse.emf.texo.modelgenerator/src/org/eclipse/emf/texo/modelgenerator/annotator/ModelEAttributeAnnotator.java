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
 * $Id: ModelEAttributeAnnotator.java,v 1.16 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Responsible for setting the values in a {@link EAttributeModelGenAnnotation}.
 * 
 * There is a special detail related to eattributes which are derived from a xsd model. Specifically the attributes
 * which are optional or which represent xml elements with minOccurs="0". These should be treated in a special way in
 * xml (de-serialization).
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */

public class ModelEAttributeAnnotator extends ModelEStructuralFeatureAnnotator implements
    Annotator<EAttributeModelGenAnnotation> {

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EAttributeModelGenAnnotation annotation) {
    super.postAnnotating(annotation);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  @Override
  public EClass getAnnotationEClass() {
    return ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EAttributeModelGenAnnotation annotation) {

    Check.isNotNull(annotation.getEAttribute(), "eAttribute must be set");//$NON-NLS-1$

    super.annotate(annotation);

    final EAttribute eAttribute = annotation.getEAttribute();
    if (!annotation.isSetBoolean()) {
      annotation.setBoolean(isBooleanType(eAttribute));
    }
    if (!annotation.isSetPrimitive()) {
      annotation.setPrimitive(isPrimitiveType(eAttribute));
    }
    if (!annotation.isSetReference()) {
      annotation.setReference(false);
    }
  }

  private boolean isBooleanType(EStructuralFeature eFeature) {
    // note == comparison is possible
    return isPrimitiveType(eFeature)
        && (getInstanceClass(eFeature) == java.lang.Boolean.TYPE || getInstanceClass(eFeature) == java.lang.Boolean.class);
  }

  private boolean isPrimitiveType(EStructuralFeature eFeature) {
    if (eFeature.isMany() || getInstanceClass(eFeature) == null) {
      return false;
    }
    return getInstanceClass(eFeature).isPrimitive();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.modelgenerator.annotator.ModelEStructuralFeatureAnnotator#getGetter(org
   * .eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  protected String getGetter(EStructuralFeature eFeature) {
    if (isBooleanType(eFeature)) {
      return "is" + ModelUtils.upCaseFirst(getName(eFeature));//$NON-NLS-1$
    }
    return super.getGetter(eFeature);
  }

  private boolean isManyInstanceClass(EStructuralFeature eFeature) {
    final Class<?> localInstanceClass = getInstanceClass(eFeature);
    if (localInstanceClass == null) {
      return false;
    }
    return localInstanceClass.isArray() || Collection.class.isAssignableFrom(localInstanceClass);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.modelgenerator.annotator.ModelEStructuralFeatureAnnotator#getType(org.
   * eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  protected String getType(EStructuralFeature eFeature, EStructuralFeatureModelGenAnnotation genAnnotation) {
    if (eFeature.isMany()) {
      if (genAnnotation.isUseList()) {
        return List.class.getName() + "<" + getItemType(eFeature) //$NON-NLS-1$
            + ">"; //$NON-NLS-1$
      }
      return Set.class.getName() + "<" + getItemType(eFeature) + //$NON-NLS-1$ 
          ">"; //$NON-NLS-1$
    } else if (isManyInstanceClass(eFeature)) {
      // support two constructors: array, set and list
      final Class<?> localInstanceClass = getInstanceClass(eFeature);
      if (localInstanceClass == null) {
        return getInstanceClassName(eFeature);
      }
      if (localInstanceClass.isArray()) {
        return localInstanceClass.getComponentType().getName() + "[]"; //$NON-NLS-1$
      }
      // a collection...
      final EDataType eDataType = ((EAttribute) eFeature).getEAttributeType();
      final EDataTypeModelGenAnnotationDefinition eDataTypeAnnotation = getEDataTypeModelGenAnnotation(eDataType);
      return eDataTypeAnnotation.getInstanceClassName() + "<" + eDataTypeAnnotation.getItemType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // if not required then use the object variant to keep track of null values
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=379796
    final Class<?> clz = getInstanceClass(eFeature);
    if (clz != null) {
      return clz.getName();
    }

    return getInstanceClassName(eFeature);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.annotator.modelgenerator. ModelEStructuralFeatureAnnotator#getObjectType()
   */
  @Override
  protected String getObjectType(EStructuralFeature eStructuralFeature,
      EStructuralFeatureModelGenAnnotation genAnnotation) {
    if (getType(eStructuralFeature, genAnnotation).contains(GenConstants.DOT)) {
      return GenUtils.correctTypeDef(getType(eStructuralFeature, genAnnotation));
    }
    final EDataType eDataType = ((EAttribute) eStructuralFeature).getEAttributeType();
    final EDataTypeModelGenAnnotationDefinition annotation = getEDataTypeModelGenAnnotation(eDataType);
    return GenUtils.correctTypeDef(annotation.getObjectClassName());
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.modelgenerator.annotator.ModelEStructuralFeatureAnnotator#getItemType(
   * org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  protected String getItemType(EStructuralFeature eFeature) {
    if (FeatureMapUtil.isFeatureMap(eFeature)) {
      return GenUtils.correctTypeDef(getFeatureMapQualifiedClassName(eFeature));
    }
    final EAttribute eAttribute = (EAttribute) eFeature;
    final EDataType eDataType = eAttribute.getEAttributeType();
    final EDataTypeModelGenAnnotationDefinition annotation = getEDataTypeModelGenAnnotation(eDataType);
    return GenUtils.correctTypeDef(annotation.getObjectClassName());
  }

  /** @return true if efeature isMany or {@link #isManyInstanceClass()} is true */
  @Override
  protected boolean isMany(EStructuralFeature eFeature) {
    return eFeature.isMany();// || isManyInstanceClass(eFeature);
  }

  /** Returns a default value for the feature */
  @Override
  protected String getDefaultValue(EStructuralFeature eFeature, EStructuralFeatureModelGenAnnotation genAnnotation) {
    if (eFeature.isMany()) {
      if (genAnnotation.isUseList()) {
        return "new " + ArrayList.class.getName() + //$NON-NLS-1$ 
            "<" //$NON-NLS-1$
            + getItemType(eFeature) + ">()"; //$NON-NLS-1$
      }
      return "new " + HashSet.class.getName() + //$NON-NLS-1$ 
          "<" //$NON-NLS-1$
          + getItemType(eFeature) + ">()"; //$NON-NLS-1$
    }
    try {
      if (ModelUtils.isUnsettable(eFeature)) {
        if (eFeature.getEType() instanceof EEnum) {
          return "null"; //$NON-NLS-1$
        }
        final Class<?> clz = getInstanceClass(eFeature);
        if (clz != null && !clz.isPrimitive()) {
          return "null"; //$NON-NLS-1$
        }
      }

      return GenUtils.getStaticDefaultValue(getAnnotationManager(), ((EAttribute) eFeature).getEAttributeType(),
          eFeature.getDefaultValueLiteral());
    } catch (final Throwable t) {
      t.printStackTrace(System.err);
      throw new Error(t);
    }
  }

  /**
   * @return the instance class of the EDataType. Note can return NULL, because the instance class of the EDataType
   *         maybe null or the instance class is not in the classpath.
   */
  private Class<?> getInstanceClass(EStructuralFeature eFeature) {
    // invariant, see remark in getInstanceClassName()
    Check.isTrue(!FeatureMapUtil.isFeatureMap(eFeature) && !eFeature.isMany(), "The EStructuralFeature " //$NON-NLS-1$
        + eFeature + " is a featuremap, this method should not be called"); //$NON-NLS-1$
    final EDataType eDataType = ((EAttribute) eFeature).getEAttributeType();
    final EDataTypeModelGenAnnotationDefinition annotation = getEDataTypeModelGenAnnotation(eDataType);
    final Class<?> clz = getClassForName(eDataType, annotation.getInstanceClassName());

    // if unsettable then use the object variant to keep track of null values
    // unset is represented by null in Texo
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=379796
    if (ModelUtils.isUnsettable(eFeature) && clz != null && clz.isPrimitive()) {
      return GenUtils.getObjectClass(clz);
    }

    return clz;
  }
}