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
 * $Id: ModelEEnumAnnotator.java,v 1.13 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.Locale;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;

/**
 * Responsible for setting the values in a {@link EEnumModelGenAnnotation}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.13 $
 */

public class ModelEEnumAnnotator extends ModelEClassifierAnnotator implements Annotator<EEnumModelGenAnnotation> {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  @Override
  public EClass getAnnotationEClass() {
    return ModelcodegeneratorPackage.eINSTANCE.getEEnumModelGenAnnotation();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EEnumModelGenAnnotation annotation) {
    super.annotate(annotation);
    Check.isNotNull(annotation.getEDataType(), "eDataType must be set");//$NON-NLS-1$

    final EDataType eDataType = annotation.getEDataType();
    if (!annotation.isSetEnum()) {
      annotation.setEnum(eDataType instanceof EEnum);
    }

    // only use instance class name if the epackage is not a generated one
    if (GenUtils.useInstanceClassNames(eDataType.getEPackage())
        && !GeneratorUtils.isEmptyOrNull(eDataType.getInstanceClassName())) {
      annotation.setQualifiedClassName(eDataType.getInstanceClassName());
      // do not generate this one
      annotation.setGenerateCode(false);
      final int dotIndex = eDataType.getInstanceClassName().lastIndexOf(GenConstants.DOT);
      // TODO: will this work for inner classes, a rare case
      if (dotIndex == -1) {
        annotation.setSimpleClassName(eDataType.getInstanceClassName());
      } else {
        annotation.setSimpleClassName(eDataType.getInstanceClassName().substring(dotIndex + 1));
      }
    } else {
      if (GeneratorUtils.isEmptyOrNull(annotation.getSimpleClassName())) {
        if (!GeneratorUtils.isEmptyOrNull(annotation.getQualifiedClassName())) {
          final int index = annotation.getQualifiedClassName().lastIndexOf(GenConstants.DOT);
          if (index == -1) {
            annotation.setSimpleClassName(annotation.getQualifiedClassName());
          } else {
            annotation.setSimpleClassName(annotation.getQualifiedClassName().substring(1 + index));
          }
        } else {
          annotation.setSimpleClassName(getSimpleClassName(eDataType));
        }
      }
      if (GeneratorUtils.isEmptyOrNull(annotation.getQualifiedClassName())) {
        annotation.setQualifiedClassName(getQualifiedClassName(annotation.getEClassifier(),
            annotation.getSimpleClassName()));
      }
    }
    annotation.setDateType(false);
    annotation.setItemType(Object.class.getName());

    if (GeneratorUtils.isEmptyOrNull(annotation.getObjectClassName())) {
      annotation.setObjectClassName(annotation.getQualifiedClassName());
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getInstanceClassName())) {
      annotation.setInstanceClassName(annotation.getQualifiedClassName());
    }

    if (!annotation.isSetGenerateCode()) {
      annotation.setGenerateCode(true);
    }
    if (!annotation.isSetAutomaticStringConversion()) {
      annotation.setAutomaticStringConversion(false);
    }
    final EPackageModelGenAnnotation ePackageAnnotation = getEPackageModelGenAnnotation(eDataType.getEPackage());
    annotation.setOwnerEPackageAnnotation(ePackageAnnotation);
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EEnumModelGenAnnotation annotation) {
  }

  protected String getInstanceClassNameForEnum(EEnum eEnum) {
    final EPackageModelGenAnnotation annotation = getEPackageModelGenAnnotation(eEnum.getEPackage());
    final String qualifiedClassName = annotation.getPackagePath().toLowerCase(Locale.ENGLISH) + GenConstants.DOT
        + getSimpleClassName(eEnum);
    return qualifiedClassName;
  }

}