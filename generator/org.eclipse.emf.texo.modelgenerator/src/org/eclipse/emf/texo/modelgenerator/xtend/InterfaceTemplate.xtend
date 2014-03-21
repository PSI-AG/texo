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

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.texo.generator.BaseTemplate
import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation

class InterfaceTemplate extends BaseTemplate {

    def void generate(EClassModelGenAnnotation eClassModelGenAnnotation) {
        var EPackageModelGenAnnotation ePackageAnnotation = eClassModelGenAnnotation.ownerEPackageAnnotation

        if (eClassModelGenAnnotation.generateCode) {

            if (executeOverrides(eClassModelGenAnnotation)) {
                return
            }

            var fileName = TemplateUtil::classFileName(eClassModelGenAnnotation)
            var content = generateContent(getModelController(), eClassModelGenAnnotation, ePackageAnnotation)

            addFile(fileName, content)
        }
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::interface")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::InterfaceTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EClassModelGenAnnotation eClassModelGenAnnotation,
        EPackageModelGenAnnotation ePackageAnnotation)
        '''
«ePackageAnnotation.javaFileHeader»
package «ePackageAnnotation.packagePath»;

/**
 * A representation of the model object '<em><b>«eClassModelGenAnnotation.name»</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
«IF eClassModelGenAnnotation.documentation != null»
 * <!-- begin-model-doc -->
 * «eClassModelGenAnnotation.documentation»
 * <!-- end-model-doc -->
«ENDIF»
 * @generated
*/
«modelController.getJavaAnnotations(eClassModelGenAnnotation.EClass, "type", eClassModelGenAnnotation.EClass)»
public interface «eClassModelGenAnnotation.simpleClassName»
«IF eClassModelGenAnnotation.classExtends.size > 0» extends «eClassModelGenAnnotation.classExtends.get(0)»«ENDIF»
{
«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
	«IF featureAnnotation.generateCode»
        /**
         * Returns the value of '<em><b>«featureAnnotation.EStructuralFeature.name»</em></b>' feature.
         *
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the value of '<em><b>«featureAnnotation.EStructuralFeature.name»</b></em>' feature
         * @generated
         */
        «modelController.getJavaAnnotations(featureAnnotation.EStructuralFeature, "getter", eClassModelGenAnnotation.EClass)»
        public «featureAnnotation.type» «featureAnnotation.getter»();

        «IF featureAnnotation.EStructuralFeature.changeable || (featureAnnotation.reference && (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation != null)»
            «IF featureAnnotation.featureMapFeature == null && featureAnnotation.many && featureAnnotation.reference && ((featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport || (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess)»
            /**
             * Adds to the <em>«featureAnnotation.EStructuralFeature.name»</em> feature.
             *
             * @param value the value to add
             * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
             *
             * @generated
             */
            public boolean addTo«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.itemType» value);

            /**
             * Removes from the <em>«featureAnnotation.EStructuralFeature.name»</em> feature.
             *
             * @param value the value to remove
             * @return true if the value is removed from the collection (it was present in the collection), false otherwise
             *
             * @generated
             */
            public boolean removeFrom«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.itemType» value);

            /**
             * Clears the <em>«featureAnnotation.EStructuralFeature.name»</em> feature.
             * @generated
             */
            public void clear«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»();
            «ENDIF»
            /**
             * Sets the '{@link «eClassModelGenAnnotation.simpleClassName»#«featureAnnotation.getter»() <em>«featureAnnotation.EStructuralFeature.name»</em>}' feature.
             *
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @param new«TemplateUtil::toFirstUpper(featureAnnotation.name)» the new value of the '{@link «eClassModelGenAnnotation.simpleClassName»#«featureAnnotation.getter»() <em>«featureAnnotation.EStructuralFeature.name»</em>}' feature.
             * @generated
             */
            «modelController.getJavaAnnotations(featureAnnotation.EStructuralFeature, "getter", eClassModelGenAnnotation.EClass)»
            public void «featureAnnotation.setter»(«featureAnnotation.type» new«TemplateUtil::toFirstUpper(featureAnnotation.name)»);
        «ENDIF»
    «ENDIF»
«ENDFOR»

«executeXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::interface_addition", eClassModelGenAnnotation)»

}
'''
}