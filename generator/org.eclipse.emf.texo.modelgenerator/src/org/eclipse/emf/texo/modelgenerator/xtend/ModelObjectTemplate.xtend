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

import org.eclipse.emf.texo.generator.BaseTemplate
import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation
import java.util.ArrayList
import java.util.List

class ModelObjectTemplate extends BaseTemplate {

    def String generateContent(EClassModelGenAnnotation eClassModelGenAnnotation) {
        var EPackageModelGenAnnotation ePackageAnnotation = eClassModelGenAnnotation.ownerEPackageAnnotation

        generateContent(getModelController(), eClassModelGenAnnotation, ePackageAnnotation)
    }

    /**
     * Note that this method is just here for reference purposes,
     * this template is not overrideable at this point as the
     * override assumes that the overrider will generate a file
     */
    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::modelobject")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelObjectTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EClassModelGenAnnotation eClassModelGenAnnotation,
        EPackageModelGenAnnotation ePackageAnnotation)
        '''
/**
 * The adapter/wrapper for the EClass '<em><b>«eClassModelGenAnnotation.name»</b></em>'.
 *
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @param <E> the domain model java class
 *
 * @generated
 */
public static class «eClassModelGenAnnotation.simpleClassName»ModelObject<E extends «eClassModelGenAnnotation.qualifiedClassName»>
«IF eClassModelGenAnnotation.hasSuperEClass»
    «var eSuperClassAnnotation = eClassModelGenAnnotation.superEClass »
    «var eSuperPackageAnnotation = eClassModelGenAnnotation.superEClass.ownerEPackageAnnotation»
    «IF eSuperPackageAnnotation.EPackage != eClassModelGenAnnotation.EClass.EPackage»
     extends «eSuperPackageAnnotation.modelClassesPackagePath».«eSuperPackageAnnotation.simpleModelFactoryClassName».«eSuperClassAnnotation.simpleClassName»ModelObject<E>
    «ELSE»
     extends «eSuperClassAnnotation.simpleClassName»ModelObject<E>
    «ENDIF»
«ELSE»
extends org.eclipse.emf.texo.model.AbstractModelObject<E>
«ENDIF»
{
    /**
    * @generated
    */
    «IF eClassModelGenAnnotation.hasSuperEClass»
    @Override
    «ENDIF»
    public org.eclipse.emf.ecore.EClass eClass() {
        return «ePackageAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassModelGenAnnotation.name)»EClass();
    }

    /**
    * @generated
    */
    «IF eClassModelGenAnnotation.hasSuperEClass»
    @Override
    «ENDIF»
    public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {
        return «ePackageAnnotation.qualifiedClassName».INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
        final int featureID = eClass().getFeatureID(eStructuralFeature);
        switch (featureID) {
        «FOR featureAnnotation : eClassModelGenAnnotation.EAllStructuralFeatureModelGenAnnotations»
        	«IF featureAnnotation.generateCode»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
                return getTarget().«featureAnnotation.getter»();
        	«ENDIF»
        «ENDFOR»
            default:
                return super.eGet(eStructuralFeature);
        }
    }

    /**
     * @generated
     */
    «IF eClassModelGenAnnotation.addSuppressUnchecked || eClassModelGenAnnotation.EAllStructuralFeatureModelGenAnnotations.exists(e|e.EStructuralFeature.many && e.EStructuralFeature.changeable)»
    @SuppressWarnings("unchecked")
    «ENDIF»
    @Override
    public void eSet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {
        final int featureID = eClass().getFeatureID(eStructuralFeature);
        switch (featureID) {
        «FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
            «IF featureAnnotation.generateCode && featureAnnotation.EStructuralFeature.changeable»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
                getTarget().«featureAnnotation.setter»(«TemplateUtil::cast(featureAnnotation.objectType)»value);
                return;
            «ENDIF»
        «ENDFOR»
            default:
                super.eSet(eStructuralFeature, value);
        }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {
        final int featureID = eClass().getFeatureID(eStructuralFeature);
        switch (featureID) {
        «FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
            «/*
                The check !featureAnnotation.itemType.contains(",") prevents maps to be handled here
            */»
            «IF featureAnnotation.EStructuralFeature.changeable && featureAnnotation.many && !featureAnnotation.itemType.contains(",")»
            «IF featureAnnotation.reference && featureAnnotation.featureMapFeature == null && ((featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport || (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess)»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
                return getTarget().addTo«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«TemplateUtil::cast(featureAnnotation.itemType)»value);
            «ELSE»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
                return getTarget().«featureAnnotation.getter»().add(«TemplateUtil::cast(featureAnnotation.itemType)»value);
            «ENDIF»
            «ENDIF»
        «ENDFOR»
            default:
                return super.eAddTo(eStructuralFeature, value);
        }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {
        final int featureID = eClass().getFeatureID(eStructuralFeature);
        switch (featureID) {
        «FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
            «/*
                The check !featureAnnotation.itemType.contains(",") prevents maps to be handled here
            */»
            «IF featureAnnotation.EStructuralFeature.changeable && featureAnnotation.many && !featureAnnotation.itemType.contains(",")»
            «IF featureAnnotation.reference && featureAnnotation.featureMapFeature == null && ((featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport || (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess)»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
                return getTarget().removeFrom«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»((«featureAnnotation.itemType»)value);
            «ELSE»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
                return getTarget().«featureAnnotation.getter»().remove(value);
            «ENDIF»
            «ENDIF»
        «ENDFOR»
            default:
                return super.eRemoveFrom(eStructuralFeature, value);
        }
    }
}
'''
}