/**
 * Copyright (c) 2012 Springsite BV (http://www.springsite.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Author - Martin Taal
 */
package org.eclipse.emf.texo.modelgenerator.xtend;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.modelgenerator.annotator.GenUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.utils.ModelUtils;

@SuppressWarnings("all")
public class TemplateUtil {
  public static String classFileName(final EClassifierModelGenAnnotation eClassifierModelGenAnnotation) {
    String _qualifiedClassName = eClassifierModelGenAnnotation.getQualifiedClassName();
    String _replaceAll = _qualifiedClassName.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public static String daoClassFileName(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    String _daoQualifiedClassName = eClassModelGenAnnotation.getDaoQualifiedClassName();
    String _replaceAll = _daoQualifiedClassName.replaceAll("\\.", "/");
    String _plus = (_replaceAll + ".java");
    return _plus;
  }
  
  public static String classFileName(final EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation) {
    String _featureMapQualifiedClassName = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
    String _replaceAll = _featureMapQualifiedClassName.replaceAll("\\.", "/");
    String _plus = (_replaceAll + ".java");
    return _plus;
  }
  
  public static String packageFileName(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _qualifiedClassName = ePackageModelGenAnnotation.getQualifiedClassName();
    String _replaceAll = _qualifiedClassName.replaceAll("\\.", "/");
    String _plus = (_replaceAll + ".java");
    return _plus;
  }
  
  public static String ecoreFileName(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _modelClassesPackagePath = ePackageModelGenAnnotation.getModelClassesPackagePath();
    String _plus = (_modelClassesPackagePath + ".");
    String _name = ePackageModelGenAnnotation.getName();
    String _plus_1 = (_plus + _name);
    String _replaceAll = _plus_1.replaceAll("\\.", "/");
    String _plus_2 = (_replaceAll + ".ecore");
    return _plus_2;
  }
  
  public static String modelFactoryFileName(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _modelClassesPackagePath = ePackageModelGenAnnotation.getModelClassesPackagePath();
    String _plus = (_modelClassesPackagePath + ".");
    String _simpleModelFactoryClassName = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    String _plus_1 = (_plus + _simpleModelFactoryClassName);
    String _replaceAll = _plus_1.replaceAll("\\.", "/");
    String _plus_2 = (_replaceAll + ".java");
    return _plus_2;
  }
  
  public static String toLowerCase(final String value) {
    String _lowerCase = ModelUtils.toLowerCase(value);
    return _lowerCase;
  }
  
  public static String toUpperCase(final String value) {
    String _upperCase = ModelUtils.toUpperCase(value);
    return _upperCase;
  }
  
  public static String toFirstLower(final String value) {
    String _lowerCaseFirst = ModelUtils.lowerCaseFirst(value);
    return _lowerCaseFirst;
  }
  
  public static String toFirstUpper(final String value) {
    String _upCaseFirst = ModelUtils.upCaseFirst(value);
    return _upCaseFirst;
  }
  
  public static boolean isDocumentRoot(final EClass eClass) {
    boolean _isDocumentRoot = GenUtils.isDocumentRoot(eClass);
    return _isDocumentRoot;
  }
  
  public static String format(final String value) {
    String _formatIdentifier = GenUtils.formatIdentifier(value);
    return _formatIdentifier;
  }
  
  public static boolean isMixed(final EStructuralFeature eStructuralFeature) {
    boolean _isMixed = ModelUtils.isMixed(eStructuralFeature);
    return _isMixed;
  }
  
  public static String getDocumentation(final ENamedElement eNamedElement) {
    String _documentation = ModelUtils.getDocumentation(eNamedElement);
    return _documentation;
  }
  
  public static String cast(final String value) {
    String _cast = GenUtils.cast(value);
    return _cast;
  }
  
  public static String correctTypeDef(final String value) {
    String _correctTypeDef = GenUtils.correctTypeDef(value);
    return _correctTypeDef;
  }
}
