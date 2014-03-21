/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands), IBM Corporation and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *   IBM - default value handling
 *
 * </copyright>
 *
 * $Id: ModelEDataTypeAnnotator.java,v 1.19 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.Locale;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Responsible for setting the values in a {@link EDataTypeModelGenAnnotation}.
 * 
 * Note: the code related to default value handling originates to a large extent from the GenDataTypeImpl class which is
 * part of EMF core.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.19 $
 */

public class ModelEDataTypeAnnotator extends ModelEClassifierAnnotator implements
    Annotator<EDataTypeModelGenAnnotation> {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  @Override
  public EClass getAnnotationEClass() {
    return ModelcodegeneratorPackage.eINSTANCE.getEDataTypeModelGenAnnotation();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EDataTypeModelGenAnnotation annotation) {
    super.annotate(annotation);
    Check.isNotNull(annotation.getEDataType(), "eDataType must be set");//$NON-NLS-1$

    final EDataType eDataType = annotation.getEDataType();
    if (!annotation.isSetEnum()) {
      annotation.setEnum(eDataType instanceof EEnum);
    }

    final EEnum eEnumBaseType = ModelUtils.getEnumBaseDataTypeIfObject(eDataType);
    final boolean isTypeWithEnumBaseType = eEnumBaseType != null;

    final String instanceClassName;
    if (!GeneratorUtils.isEmptyOrNull(annotation.getInstanceClassName())) {
      instanceClassName = annotation.getInstanceClassName();
    } else if (isTypeWithEnumBaseType) {
      instanceClassName = getInstanceClassNameForEnum(eEnumBaseType);
    } else {
      instanceClassName = getInstanceClassName(eDataType);
    }

    final Class<?> instanceClass = getInstanceClass(eDataType, instanceClassName);

    if (!annotation.isSetDateType()) {
      if (isTypeWithEnumBaseType) {
        annotation.setDateType(false);
      } else if (GenUtils.isDateOrDateTime(eDataType)) {
        annotation.setDateType(true);
      } else {
        annotation.setDateType(false);
      }
    }

    // find the item type, if not found directly try to find it in the basetype
    EDataType itemDataType = ExtendedMetaData.INSTANCE.getItemType(annotation.getEDataType());
    EDataType baseType = annotation.getEDataType();
    while (itemDataType == null && (baseType = ExtendedMetaData.INSTANCE.getBaseType(baseType)) != null) {
      itemDataType = ExtendedMetaData.INSTANCE.getItemType(baseType);
    }
    if (itemDataType != null) {
      final EDataTypeModelGenAnnotationDefinition itemDataTypeAnnotation = getEDataTypeModelGenAnnotation(itemDataType);
      annotation.setItemType(itemDataTypeAnnotation.getInstanceClassName());
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getObjectClassName())) {
      if (isTypeWithEnumBaseType) {
        annotation.setObjectClassName(instanceClassName);
      } else if (instanceClass != null && instanceClass.isArray()) {
        annotation.setObjectClassName(instanceClass.getComponentType() + "[]"); //$NON-NLS-1$
      } else if (instanceClass != null && instanceClass.getTypeParameters().length > 0
          && annotation.getItemType() != null) {
        // currently only one type parameter is supported
        annotation.setObjectClassName(instanceClass.getName() + "<" + annotation.getItemType() //$NON-NLS-1$
            + ">"); //$NON-NLS-1$
      } else {
        annotation.setObjectClassName(GenUtils.getObjectClassName(eDataType, instanceClassName));
      }
    }

    // set the item type equal to the object classname for safety reason
    if (GeneratorUtils.isEmptyOrNull(annotation.getItemType())) {
      annotation.setItemType(annotation.getObjectClassName());
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getQualifiedClassName())) {
      annotation.setQualifiedClassName(instanceClassName);
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getInstanceClassName())) {
      annotation.setInstanceClassName(instanceClassName);
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getSimpleClassName())) {
      annotation.setSimpleClassName(getSimpleClassName(eDataType));
    }
    if (!annotation.isSetGenerateCode()) {
      annotation.setGenerateCode(true);
    }
    if (!annotation.isSetAutomaticStringConversion()) {
      if (isTypeWithEnumBaseType) {
        annotation.setAutomaticStringConversion(false);
      } else {
        annotation.setAutomaticStringConversion(hasInstanceClassStringConstructor(instanceClass));
      }
    }
    final EPackageModelGenAnnotation ePackageAnnotation = getEPackageModelGenAnnotation(eDataType.getEPackage());
    annotation.setOwnerEPackageAnnotation(ePackageAnnotation);
    if (isTypeWithEnumBaseType) {
      final EDataTypeModelGenAnnotationDefinition baseTypeAnnotation = getEDataTypeModelGenAnnotation(eEnumBaseType);
      annotation.setBaseTypeAnnotation(baseTypeAnnotation);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EDataTypeModelGenAnnotation annotation) {
  }

  private Class<?> getInstanceClass(EDataType eDataType, String instanceClassName) {
    return getClassForName(eDataType, instanceClassName);
  }

  private String getInstanceClassName(EDataType eDataType) {
    return GenUtils.getInstanceClassName(eDataType);
  }

  /**
   * @return true if the instance class is not null (see {@link #getInstanceClass()} and it has a constructor with a
   *         single String constructor.
   */
  private boolean hasInstanceClassStringConstructor(Class<?> instanceClass) {
    if (instanceClass == null) {
      return false;
    }
    try {
      Class<?> useClass = instanceClass;
      if (!useClass.getName().contains(".")) { //$NON-NLS-1$
        useClass = GenUtils.getObjectClass(instanceClass);
        if (useClass == null) {
          return false;
        }
      }
      useClass.getConstructor(String.class);
      return true;
    } catch (final NoSuchMethodException e) {
      return false;
    }
  }

  protected String getInstanceClassNameForEnum(EEnum eEnum) {
    final EPackageModelGenAnnotation annotation = getEPackageModelGenAnnotation(eEnum.getEPackage());
    final String qualifiedClassName = annotation.getPackagePath().toLowerCase(Locale.ENGLISH) + GenConstants.DOT
        + getSimpleClassName(eEnum);
    return qualifiedClassName;
  }
}