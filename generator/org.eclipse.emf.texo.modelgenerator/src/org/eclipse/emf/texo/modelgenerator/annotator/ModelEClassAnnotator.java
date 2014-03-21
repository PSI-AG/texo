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
 * $Id: ModelEClassAnnotator.java,v 1.25 2011/09/23 11:03:00 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Responsible for setting the values in a {@link EClassModelGenAnnotation}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.25 $
 */

public class ModelEClassAnnotator extends ModelEClassifierAnnotator implements Annotator<EClassModelGenAnnotation> {

  private static final String SERIALIZABLE_NAME = java.io.Serializable.class.getName();

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  @Override
  public EClass getAnnotationEClass() {
    return ModelcodegeneratorPackage.eINSTANCE.getEClassModelGenAnnotation();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EClassModelGenAnnotation annotation) {

    Check.isNotNull(annotation.getEClass(), "eClass must be set");//$NON-NLS-1$

    final EClass eClass = annotation.getEClass();

    super.annotate(annotation);

    // must be done before the classimplements/classextends
    if (!annotation.isSetSerializable()) {
      annotation.setSerializable(isJavaSerializable(annotation, eClass));
    }

    if (annotation.getClassImplements().isEmpty()) {
      annotation.getClassImplements().addAll(getClassImplements(annotation, eClass));
    }
    final List<String> classExtends = getClassExtends(annotation, eClass);
    if (annotation.getClassExtends().isEmpty()) {
      annotation.getClassExtends().addAll(classExtends);
    }

    // - emap always have instance class set
    // - do not generate this one if the epackage is a dynamic one
    // in other cases the instanceclassname is the original EMF instance class
    if (!ModelUtils.isEMap(eClass) && GenUtils.useInstanceClassNames(eClass.getEPackage())
        && !GeneratorUtils.isEmptyOrNull(eClass.getInstanceClassName())) {
      annotation.setQualifiedClassName(eClass.getInstanceClassName());

      annotation.setGenerateCode(false);

      final int dotIndex = eClass.getInstanceClassName().lastIndexOf(GenConstants.DOT);
      // TODO: will this work for inner classes, a rare case
      if (dotIndex == -1) {
        annotation.setSimpleClassName(eClass.getInstanceClassName());
      } else {
        annotation.setSimpleClassName(eClass.getInstanceClassName().substring(dotIndex + 1));
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
          annotation.setSimpleClassName(getSimpleClassName(eClass));
        }
      }
      if (GeneratorUtils.isEmptyOrNull(annotation.getQualifiedClassName())) {
        if (!ModelUtils.isEMap(eClass)) {
          annotation.setQualifiedClassName(getQualifiedClassName(eClass, annotation.getSimpleClassName()));
        }
      }
    }

    if (!ModelUtils.isEMap(eClass) && GeneratorUtils.isEmptyOrNull(annotation.getDaoQualifiedClassName())) {
      final EPackageModelGenAnnotation ePackageModelGenAnnotation = getEPackageModelGenAnnotation(eClass.getEPackage());
      final String packagePath = ePackageModelGenAnnotation.getDaoClassesPackagePath();
      annotation.setDaoQualifiedClassName(packagePath + GenConstants.DOT + annotation.getSimpleClassName()
          + getDaoPatternName(ePackageModelGenAnnotation));
    } else {
      // prevent dao generation
      annotation.setDaoQualifiedClassName(null);
    }

    annotation.setAbstract(eClass.isAbstract());
    if (!annotation.isSetHasSuperEClass()) {
      final EClass superEClass = getSuperClassEClass(eClass);
      annotation.setHasSuperEClass(superEClass != null);
      if (superEClass != null) {
        annotation.setSuperEClass(getEClassModelGenAnnotation(superEClass));
      }
    }

    // check the super eclass
    if (annotation.isSetHasSuperEClass()) {
      final EClass superEClass = getSuperClassEClass(eClass);
      if (superEClass == null || getEClassModelGenAnnotation(superEClass) == null || superEClass.getEPackage() == null) {
        annotation.setHasSuperEClass(false);
      } else if (annotation.getSuperEClass() == null) {
        annotation.setSuperEClass(getEClassModelGenAnnotation(superEClass));
      }
    }

    if (!annotation.isSetGenerateCode()) {
      final boolean doGenerateCode = !ModelUtils.isEMap(eClass);
      annotation.setGenerateCode(doGenerateCode);
    }

    final EPackageModelGenAnnotation ePackageAnnotation = getEPackageModelGenAnnotation(eClass.getEPackage());
    annotation.setOwnerEPackageAnnotation(ePackageAnnotation);

    if (!annotation.isSetHasManyFeatures()) {
      final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();

      if (annotation.getEStructuralFeatureModelGenAnnotations().isEmpty()) {
        // fill the subfeatures
        for (final EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
          features.add(eStructuralFeature);
        }
        // also add the feature annotations of interfaces of supertypes
        for (final EStructuralFeature eStructuralFeature : getAllLocallyImplementedFeatures(eClass)) {
          features.add(eStructuralFeature);
        }
      } else {
        for (EStructuralFeatureModelGenAnnotation featureAnnotation : annotation
            .getEStructuralFeatureModelGenAnnotations()) {
          features.add(featureAnnotation.getEStructuralFeature());
        }
      }

      for (EStructuralFeature feature : features) {
        if (!feature.isVolatile() && feature.isMany()) {
          annotation.setHasManyFeatures(true);
          break;
        }
      }
    }
  }

  protected String getDaoPatternName(EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String patternName = "dao"; //$NON-NLS-1$
    if (!GeneratorUtils.isEmptyOrNull(ePackageModelGenAnnotation.getDaoPatternName())) {
      patternName = ePackageModelGenAnnotation.getDaoPatternName();
    }
    return patternName.substring(0, 1).toUpperCase() + (patternName.length() > 1 ? patternName.substring(1) : ""); //$NON-NLS-1$
  }

  // private void buildDaoFinders(EClassModelGenAnnotation annotation) {
  // final List<String> doneFinders = new ArrayList<String>();
  // for (EStructuralFeatureModelGenAnnotation featureAnnotation :
  // annotation.getEStructuralFeatureModelGenAnnotations()) {
  //
  // }
  // }
  //
  // private List<String> getFinderNames(EStructuralFeatureModelGenAnnotation annotation) {
  // final EAnnotation eAnnotation = annotation.getENamedElement().getEAnnotation(ModelConstants.EANNOTATION_SOURCE);
  // if (eAnnotation == null) {
  // return Collections.emptyList();
  // }
  // final List<String> result = new ArrayList<String>();
  // for (String key : eAnnotation.getDetails().keySet()) {
  // if (key.startsWith(ModelConstants.FINDER_ANNOTATION_KEY)) {
  // result.add(key);
  // }
  // }
  // return result;
  // }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EClassModelGenAnnotation annotation) {
    final EClass eClass = annotation.getEClass();
    if (annotation.getEStructuralFeatureModelGenAnnotations().isEmpty()) {
      // fill the subfeatures
      for (final EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
        annotation.getEStructuralFeatureModelGenAnnotations().add(
            getEStructuralFeatureModelGenAnnotation(eStructuralFeature));
      }
      // also add the feature annotations of interfaces of supertypes
      for (final EStructuralFeature eStructuralFeature : getAllLocallyImplementedFeatures(eClass)) {
        annotation.getEStructuralFeatureModelGenAnnotations().add(
            getEStructuralFeatureModelGenAnnotation(eStructuralFeature));
      }

      for (EStructuralFeatureModelGenAnnotation featureAnnotation : annotation
          .getEStructuralFeatureModelGenAnnotations()) {
        if (FeatureMapUtil.isFeatureMap(featureAnnotation.getEStructuralFeature())) {
          annotation.getFeatureMapFeatures().add(featureAnnotation);
        }
      }
    }
  }

  // collects all the features of interfaces and super eclasses which are not the
  // one inherited from
  private List<EStructuralFeature> getAllLocallyImplementedFeatures(final EClass eLocalClass) {
    final EClass theSuperEClass = getSuperClassEClass(eLocalClass);

    final List<EStructuralFeature> list = new ArrayList<EStructuralFeature>();
    for (final EClass inheritedEClass : eLocalClass.getESuperTypes()) {
      if (inheritedEClass != theSuperEClass) {
        list.addAll(inheritedEClass.getEStructuralFeatures());
        list.addAll(getAllLocallyImplementedFeatures(inheritedEClass));
      }
    }
    return list;
  }

  /**
   * Creates the extends string used in the java class/interface, the returned value includes the term 'extends'
   * 
   * @return the extends statement used in the java class declaration
   */
  private List<String> getClassExtends(EClassModelGenAnnotation annotation, EClass eClass) {
    final List<String> result = new ArrayList<String>();
    if (eClass.isInterface()) {
      for (final EClass superEClass : eClass.getESuperTypes()) {
        final EClassModelGenAnnotation superAnnotation = getEClassModelGenAnnotation(superEClass);
        result.add(superAnnotation.getQualifiedClassName());
      }

      final EPackageModelGenAnnotation ePackageModelGenAnnotation = getEPackageModelGenAnnotation(eClass.getEPackage());
      if (GeneratorUtils.isNotEmptyAndNotNull(ePackageModelGenAnnotation.getRootInterfaceExtends()) && result.isEmpty()) {
        result.add(ePackageModelGenAnnotation.getRootInterfaceExtends());
      }

      if (annotation.isSerializable() && !isSuperClassSerializable(eClass)) {
        result.add(Serializable.class.getName());
      }

      return result;
    }

    final EClass superEClass = getSuperClassEClass(eClass);
    if (superEClass == null) {
      final EPackageModelGenAnnotation ePackageModelGenAnnotation = getEPackageModelGenAnnotation(eClass.getEPackage());
      if (GeneratorUtils.isNotEmptyAndNotNull(ePackageModelGenAnnotation.getRootClassExtends()) && result.isEmpty()) {
        result.add(ePackageModelGenAnnotation.getRootClassExtends());
      }
      return result;
    }
    final EClassModelGenAnnotation superAnnotation = getEClassModelGenAnnotation(superEClass);
    result.add(superAnnotation.getQualifiedClassName());
    return result;
  }

  /**
   * Gets all the interfaces defined as super EClass ({@see EClass#getESuperTypes()}) and returns their qualified
   * interface names.
   * 
   * @return the list of qualified interface names
   */
  private List<String> getClassImplements(EClassModelGenAnnotation annotation, EClass eClass) {
    final List<EClass> superTypes = eClass.getESuperTypes();
    final List<String> interfaces = new ArrayList<String>();
    for (final EClass superEClass : superTypes) {
      if (superEClass.isInterface()) {
        final EClassModelGenAnnotation superAnnotation = getEClassModelGenAnnotation(superEClass);
        interfaces.add(superAnnotation.getQualifiedClassName());
      }
    }

    // add the serializable interface
    if (annotation.isSerializable() && !isSuperClassSerializable(eClass)) {
      interfaces.add(Serializable.class.getName());
    }

    return interfaces;
  }

  /**
   * @return the first non-interface super EClass, if none there then null is returned
   */
  private EClass getSuperClassEClass(EClass eClass) {
    final List<EClass> superTypes = eClass.getESuperTypes();
    if (superTypes.isEmpty()) {
      return null;
    }
    for (final EClass superEClass : superTypes) {
      if (!superEClass.isInterface()) {
        return superEClass;
      }
    }
    return null;
  }

  /**
   * @return true if this EClass or one of its supertypes implements java.io.Serializable
   */
  private boolean isJavaSerializable(EClassModelGenAnnotation annotation, EClass eClass) {
    // if (getGenEPackage().getOptionClassImplements() != null &&
    // getGenEPackage().getOptionClassImplements().compareTo(SERIALIZABLE_NAME)
    // == 0) {
    // return true;
    // }

    // ask the own implements list
    for (final String interf : getClassImplements(annotation, eClass)) {
      if (interf.compareTo(SERIALIZABLE_NAME) == 0) {
        return true;
      }
    }

    return isSuperClassSerializable(eClass);
  }

  private boolean isSuperClassSerializable(EClass eClass) {

    for (final EClass superEClass : eClass.getEAllSuperTypes()) {
      final EClassModelGenAnnotation superAnnotation = getEClassModelGenAnnotation(superEClass);
      if (superAnnotation.getQualifiedClassName().equals(Serializable.class.getName())) {
        return true;
      }
      if (superAnnotation.isSerializable()) {
        return true;
      }
    }
    return false;
  }
}