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
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation
import java.util.ArrayList
import java.util.List

class ModelFeatureMapTemplate extends BaseTemplate {

    def String generateContent(EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation) {
        var EClassModelGenAnnotation eClassAnnotation = eStructuralFeatureModelGenAnnotation.ownerEClassAnnotation as EClassModelGenAnnotation
        var EPackageModelGenAnnotation ePackageAnnotation = eClassAnnotation.ownerEPackageAnnotation as EPackageModelGenAnnotation

        generateContent(getModelController(), eStructuralFeatureModelGenAnnotation, eClassAnnotation, ePackageAnnotation)
    }

    /**
     * Note that this method is just here for reference purposes,
     * this template is not overrideable at this point as the
     * override assumes that the overrider will generate a file
     */
    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::modelfeaturemap")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelFeatureMapTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation,
        EClassModelGenAnnotation eClassAnnotation,
        EPackageModelGenAnnotation ePackageAnnotation)
        '''
/**
 * The wrapper/adapter for the Feature Group '<em><b>«eClassAnnotation.EClass.name».«eStructuralFeatureModelGenAnnotation.name»</b></em>'.
 *
 * @param <E> the Feature Group class
 * @generated
*/
public static class «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»ModelFeatureMapEntry<E extends «eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName»> extends org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry<«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName»> {

    /**
     * @generated
     */
    public org.eclipse.emf.ecore.EStructuralFeature getEStructuralFeature() {
        switch (getTarget().getFeature()) {
        «IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
            case TEXT:
                return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();
            case CDATA:
                return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();
            case COMMENT:
                return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment();
        «ENDIF»
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»
            case «TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»:
                return «ePackageAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»_«TemplateUtil::toFirstUpper(memberFeatureAnnotation.name)»();
    «ENDFOR»
            default:
                throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
        }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
        «IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
        if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
            getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.TEXT);
            return;
        } else if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
            getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.CDATA);
            return;
        } else if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
            getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.COMMENT);
            return;
        }
        «ENDIF»

        final org.eclipse.emf.ecore.EClass eClass = «ePackageAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»EClass();
        switch (eClass.getFeatureID(eStructuralFeature)) {
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»
    	«IF memberFeatureAnnotation.generateCode»
            case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassAnnotation.name)»_«TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»_FEATURE_ID:
                getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.«TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»);
                return;
	    «ENDIF»
    «ENDFOR»
            default:
                throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
        }
    }

    /**
     * @generated
     */
    public Object getValue() {
        return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
        getTarget().setValue(getTarget().getFeature(), value);
    }
}
'''
}