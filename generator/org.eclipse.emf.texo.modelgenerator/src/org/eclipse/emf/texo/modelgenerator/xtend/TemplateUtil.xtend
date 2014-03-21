/*******************************************************************************
 * Copyright (c) 2012 Springsite BV (http://www.springsite.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Author - Martin Taal
 *******************************************************************************/
package org.eclipse.emf.texo.modelgenerator.xtend

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation
import org.eclipse.emf.texo.utils.ModelUtils
import org.eclipse.emf.texo.modelgenerator.annotator.GenUtils

class TemplateUtil {
    def static String classFileName(EClassifierModelGenAnnotation eClassifierModelGenAnnotation) {
        return (eClassifierModelGenAnnotation.qualifiedClassName.replaceAll("\\.","/") + ".java")
    }
    
    def static String daoClassFileName(EClassModelGenAnnotation eClassModelGenAnnotation) {
        eClassModelGenAnnotation.daoQualifiedClassName.replaceAll("\\.","/") + ".java"
    }

    def static String classFileName(EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation) {
        eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName.replaceAll("\\.","/") + ".java"
    }

    def static String packageFileName(EPackageModelGenAnnotation ePackageModelGenAnnotation) {
        ePackageModelGenAnnotation.qualifiedClassName.replaceAll("\\.","/") + ".java"
    }

    def static String ecoreFileName(EPackageModelGenAnnotation ePackageModelGenAnnotation) {
        (ePackageModelGenAnnotation.modelClassesPackagePath + "." + ePackageModelGenAnnotation.name).replaceAll("\\.","/") + ".ecore"
    }

    def static String modelFactoryFileName(EPackageModelGenAnnotation ePackageModelGenAnnotation) {
          (ePackageModelGenAnnotation.modelClassesPackagePath + "." + ePackageModelGenAnnotation.simpleModelFactoryClassName).replaceAll("\\.","/") + ".java"
    }

    def static String toLowerCase(String value) {
        ModelUtils::toLowerCase(value)
    }
    
    def static String toUpperCase(String value) {
        ModelUtils::toUpperCase(value)
    }
    
    def static toFirstLower(String value) {
        ModelUtils::lowerCaseFirst(value)
    }
    
    def static toFirstUpper(String value) {
        ModelUtils::upCaseFirst(value)
    }

    def static boolean isDocumentRoot(EClass eClass) {
        GenUtils::isDocumentRoot(eClass)
    }

    def static String format(String value) {
        GenUtils::formatIdentifier(value)
    }

    def static boolean isMixed( EStructuralFeature eStructuralFeature ) {
        ModelUtils::isMixed(eStructuralFeature)
    }

    def static String getDocumentation(ENamedElement eNamedElement) {
        ModelUtils::getDocumentation(eNamedElement)
    }

    def static String cast(String value) {
        GenUtils::cast(value)
    }

    def static String correctTypeDef(String value) {
        GenUtils::correctTypeDef(value)
    }
}