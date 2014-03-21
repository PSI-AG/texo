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
 * $Id: ModelEStructuralFeatureAnnotator.java,v 1.19 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.Locale;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.model.ModelConstants;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Wraps a {@link EStructuralFeature} to provide convenience methods to the code generation templates.
 * 
 * A special note on mixed features and mixed EClass types. An EClass can be set as being mixed. This means that text
 * content is mixed with the real content defined by elements. If an EClass is mixed then all the content is stored in a
 * featuremap. This means that if an EClass is mixed that all the features are made a member of the mixed feature which
 * can be found in the EClass also.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.19 $
 */

public abstract class ModelEStructuralFeatureAnnotator extends ModelENamedElementAnnotator {

  protected void annotate(final EStructuralFeatureModelGenAnnotation annotation) {
    super.annotate(annotation);

    final EStructuralFeature eFeature = annotation.getEStructuralFeature();

    if (eFeature.getEType() == null) {
      throw new IllegalStateException(
          "The EType of the model element " + eFeature.getEContainingClass().getName() + "." + eFeature.getName() + " is not set, it is null"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getValidJavaMemberName())) {
      final String memberName = getValidJavaMemberName(eFeature);
      annotation.setValidJavaMemberName(memberName);
    }

    // also add the annotation in the model
    EAnnotation eAnnotation = eFeature.getEAnnotation(ModelConstants.EANNOTATION_SOURCE);
    if (eAnnotation == null) {
      eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
      eAnnotation.setSource(ModelConstants.EANNOTATION_SOURCE);
      eFeature.getEAnnotations().add(eAnnotation);
    }
    eAnnotation.getDetails().put(ModelConstants.JAVAMEMBER_ANNOTATION_KEY, annotation.getValidJavaMemberName());

    // note the useList influences the getType/getDefaultValue computation below, so
    // it needs to be done before
    if (!annotation.isSetUseList()) {
      if (!isMany(eFeature)) {
        annotation.setUseList(false);
      } else {
        annotation.setUseList(eFeature.isOrdered());
      }
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getDefaultValue())) {
      annotation.setDefaultValue(getDefaultValue(eFeature, annotation));
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getGetter())) {
      annotation.setGetter(getGetter(eFeature));
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getSetter())) {
      annotation.setSetter(getSetter(eFeature));
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getType())) {
      annotation.setType(getType(eFeature, annotation));
    }
    if (!annotation.isSetItemType()) {
      annotation.setItemType(getItemType(eFeature));
    }
    if (!annotation.isSetMany()) {
      annotation.setMany(isMany(eFeature));
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getObjectType())) {
      annotation.setObjectType(getObjectType(eFeature, annotation));
    }
    if (FeatureMapUtil.isFeatureMap(eFeature)) {
      if (GeneratorUtils.isEmptyOrNull(annotation.getFeatureMapQualifiedClassName())) {
        annotation.setFeatureMapQualifiedClassName(getFeatureMapQualifiedClassName(eFeature));
      }
      if (GeneratorUtils.isEmptyOrNull(annotation.getFeatureMapSimpleClassName())) {
        if (GeneratorUtils.isNotEmptyAndNotNull(annotation.getFeatureMapQualifiedClassName())) {
          final int lastIndex = annotation.getFeatureMapQualifiedClassName().lastIndexOf(GenConstants.DOT);
          if (lastIndex != -1) {
            annotation.setFeatureMapSimpleClassName(annotation.getFeatureMapQualifiedClassName().substring(
                lastIndex + 1));
          } else {
            annotation.setFeatureMapSimpleClassName(getFeatureMapSimpleClassName(eFeature));
          }
        }
      }
    }

    final EClassModelGenAnnotation eClassAnnotation = getEClassModelGenAnnotation(annotation.getEStructuralFeature()
        .getEContainingClass());
    annotation.setOwnerEClassAnnotation(eClassAnnotation);
  }

  protected abstract String getItemType(EStructuralFeature eFeature);

  protected String getInstanceClassName(EStructuralFeature eFeature) {
    if (FeatureMapUtil.isFeatureMap(eFeature)) {
      // for featuremaps:
      // note that the instance class name is different than the
      // class returned from getInstanceClass
      // looking at the current flow this does not matter as
      // getInstanceClass() is only called in case isMany is false
      return getFeatureMapQualifiedClassName(eFeature);
    }
    return getEDataTypeModelGenAnnotation(((EAttribute) eFeature).getEAttributeType()).getInstanceClassName();
  }

  protected boolean isMany(EStructuralFeature eFeature) {
    return eFeature.isMany();
  }

  /**
   * @return the name of the EStructuralFeature corrected if a java reserved word is used,
   * @see GenUtils#safeName(String)
   */
  protected String getValidJavaMemberName(EStructuralFeature eStructuralFeature) {
    return GenUtils.getValidJavaMemberName(getName(eStructuralFeature));
  }

  /** @return the get accessor, always prefixes with get */
  protected String getGetter(EStructuralFeature eStructuralFeature) {
    final String result = "get" + ModelUtils.upCaseFirst(getName(eStructuralFeature)); //$NON-NLS-1$
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=378087
    if (result.equals("getClass")) { //$NON-NLS-1$
      return "get_Class"; //$NON-NLS-1$
    }
    return result;
  }

  /** @return the set accessor, always prefixes with set */
  protected String getSetter(EStructuralFeature eStructuralFeature) {
    return "set" + ModelUtils.upCaseFirst(getName(eStructuralFeature)); //$NON-NLS-1$
  }

  // prevent name clashes in the generated FeatureGroup class for the case that
  // the name is value or feature or if the feature is part of a mixed type
  @Override
  public String getName(ENamedElement eNamedElement) {
    final EStructuralFeature eStructuralFeature = (EStructuralFeature) eNamedElement;
    final String defaultName = GenUtils.getValidJavaMemberName(super.getName(eStructuralFeature));

    final boolean partOfFeatureMap = null != ExtendedMetaData.INSTANCE.getGroup(eStructuralFeature);
    final boolean partOfMix = null != GeneratorUtils.getMixedEStructuralFeature(eStructuralFeature
        .getEContainingClass());
    if (!partOfFeatureMap && !partOfMix) {
      return defaultName;
    }

    // a mixed feature, also take care of comment, cdata and text
    if (partOfMix && (defaultName.compareToIgnoreCase("comment") == 0 //$NON-NLS-1$
        || defaultName.compareToIgnoreCase("text") == 0 || defaultName //$NON-NLS-1$
        .compareToIgnoreCase("cdata") == 0)) { //$NON-NLS-1$
      return defaultName + "_"; //$NON-NLS-1$
    }

    if (defaultName.compareToIgnoreCase("value") == 0 //$NON-NLS-1$
        || defaultName.compareToIgnoreCase("feature") == 0) { //$NON-NLS-1$
      return defaultName + "_"; //$NON-NLS-1$
    }
    return defaultName;
  }

  /**
   * @return the valid java type of the value of the {@link EStructuralFeature}.
   */
  protected abstract String getType(EStructuralFeature eStructuralFeature,
      EStructuralFeatureModelGenAnnotation genAnnotation);

  /**
   * The object version of a type. If the type is a java primitive (for example int) then it's object representation is
   * returned (for example java.lang.Integer).
   * 
   * As a default calls {@link #getType()}.
   * 
   * @param eStructuralFeature
   * @return the object version of the type of the {@link EStructuralFeature}.
   */
  protected String getObjectType(EStructuralFeature eStructuralFeature,
      EStructuralFeatureModelGenAnnotation genAnnotation) {
    return getType(eStructuralFeature, genAnnotation);
  }

  /**
   * @param eStructuralFeature
   * @return a default value for the feature which can be placed in the java source, can also be a call to a factory.
   */
  protected abstract String getDefaultValue(EStructuralFeature eStructuralFeature,
      EStructuralFeatureModelGenAnnotation genAnnotation);

  /**
   * @param eStructuralFeature
   *          the FeatureMap feature
   * @return the fully qualified class name for the feature map class
   * 
   * @see ModelEPackageAnnotator#getPackagePath()
   * @see #getFeatureMapSimpleClassName()
   * @see GenConstants#FEATUREMAP_POSTFIX
   */
  protected String getFeatureMapQualifiedClassName(EStructuralFeature eStructuralFeature) {
    Check.isTrue(FeatureMapUtil.isFeatureMap(eStructuralFeature), "The eStructuralFeature " + eStructuralFeature //$NON-NLS-1$
        + " is not a feature map"); //$NON-NLS-1$

    final String qualifiedClassName = getFeatureMapPackageName(eStructuralFeature) + GenConstants.DOT
        + getFeatureMapSimpleClassName(eStructuralFeature);
    // ((EClassifier)
    // getENamedElement()).setInstanceClassName(qualifiedClassName);
    return qualifiedClassName;
  }

  protected String getFeatureMapPackageName(EStructuralFeature eFeature) {
    return getEPackageModelGenAnnotation(eFeature.getEContainingClass().getEPackage()).getPackagePath().toLowerCase(
        Locale.ENGLISH);
  }

  /**
   * @param eStructuralFeature
   *          the FeatureMap feature
   * @return the class name for the feature map class
   * 
   * @see ModelEPackageAnnotator#getPackagePath()
   * @see #getFeatureMapSimpleClassName()
   * @see GenConstants#FEATUREMAP_POSTFIX
   */
  private String getFeatureMapSimpleClassName(EStructuralFeature eStructuralFeature) {
    Check.isTrue(FeatureMapUtil.isFeatureMap(eStructuralFeature), "The eStructuralFeature " + eStructuralFeature //$NON-NLS-1$
        + " is not a feature map"); //$NON-NLS-1$
    final EClassModelGenAnnotation eClassAnnotation = getEClassModelGenAnnotation(eStructuralFeature
        .getEContainingClass());
    final EPackageModelGenAnnotation ePackageAnnotation = getEPackageModelGenAnnotation(eStructuralFeature
        .getEContainingClass().getEPackage());

    return ModelUtils.upCaseFirst(eClassAnnotation.getName()) + ModelUtils.upCaseFirst(getName(eStructuralFeature))
        + ePackageAnnotation.getFeatureGroupClassNamePostFix();
  }

  protected void postAnnotating(EStructuralFeatureModelGenAnnotation annotation) {
    final EStructuralFeature eFeature = annotation.getEStructuralFeature();

    final EStructuralFeature groupFeature = ExtendedMetaData.INSTANCE.getGroup(eFeature);
    if (groupFeature != null && eFeature != groupFeature) {
      final EStructuralFeatureModelGenAnnotation groupAnnotation = getEStructuralFeatureModelGenAnnotation(groupFeature);
      groupAnnotation.getMemberFeatureMapFeatures().add(annotation);
    } else if (!GeneratorUtils.isAttribute(eFeature)) {
      // another case, the parent eclass is a mixed eclass
      // add ourselves to the mixed feature
      final EStructuralFeature mixedFeature = GeneratorUtils.getMixedEStructuralFeature(eFeature.getEContainingClass());
      if (mixedFeature != null && mixedFeature != eFeature) {
        final EStructuralFeatureModelGenAnnotation mixedAnnotation = getEStructuralFeatureModelGenAnnotation(mixedFeature);
        mixedAnnotation.getMemberFeatureMapFeatures().add(annotation);
      }
    }
  }
}