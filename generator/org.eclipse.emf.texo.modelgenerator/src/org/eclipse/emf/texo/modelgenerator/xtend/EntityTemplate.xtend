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

class EntityTemplate extends BaseTemplate {

    def void generate(EClassModelGenAnnotation eClassModelGenAnnotation) {
        var EPackageModelGenAnnotation ePackageModelGenAnnotation = eClassModelGenAnnotation.ownerEPackageAnnotation

        if (eClassModelGenAnnotation.generateCode && (ePackageModelGenAnnotation.addRuntimeModelBehavior || !TemplateUtil::isDocumentRoot(eClassModelGenAnnotation.EClass))) {

            if (executeOverrides(eClassModelGenAnnotation)) {
                return
            }

            var fileName = TemplateUtil::classFileName(eClassModelGenAnnotation)
            var content = generateContent(getModelController(), eClassModelGenAnnotation, ePackageModelGenAnnotation);

            addFile(fileName, content)

            generateFeatureGroups(getModelController(), eClassModelGenAnnotation)
        }
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::entity")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::EntityTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EClassModelGenAnnotation eClassModelGenAnnotation,
        EPackageModelGenAnnotation ePackageModelGenAnnotation)
        '''
«ePackageModelGenAnnotation.javaFileHeader»
package «ePackageModelGenAnnotation.packagePath»;

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
public«IF eClassModelGenAnnotation.abstractValue» abstract«ENDIF» class «eClassModelGenAnnotation.simpleClassName»
«IF eClassModelGenAnnotation.classExtends.size > 0» extends «eClassModelGenAnnotation.classExtends.get(0)»«ENDIF»
«IF eClassModelGenAnnotation.classImplements.size > 0» implements
«FOR classImplements : eClassModelGenAnnotation.classImplements SEPARATOR ","»«classImplements»«ENDFOR»
«ENDIF»
{
«IF eClassModelGenAnnotation.serializable»
  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
«ENDIF»

«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
    «/* a document root has almost only volatile features, but they need to be generated also */»
    «IF featureAnnotation.generateCode && !featureAnnotation.EStructuralFeature.volatile»

        /**
          * <!-- begin-user-doc -->
          * <!-- end-user-doc -->
        «IF featureAnnotation.documentation != null»
         * <!-- begin-model-doc -->
         * «featureAnnotation.documentation»
         * <!-- end-model-doc -->
        «ENDIF»
         * @generated
         */
        «modelController.getJavaAnnotations(featureAnnotation.EStructuralFeature, "field", eClassModelGenAnnotation.EClass)»
        private «featureAnnotation.type» «featureAnnotation.validJavaMemberName» = «featureAnnotation.defaultValue»;
    «ENDIF»
«ENDFOR»

«executeXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::entity_addition", eClassModelGenAnnotation)»

«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
	«IF featureAnnotation.generateCode»
        /**
         * Returns the value of '<em><b>«featureAnnotation.EStructuralFeature.name»</b></em>' feature.
            «IF !featureAnnotation.EStructuralFeature.volatile && featureAnnotation.many && featureAnnotation.reference && (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
         * Note: the returned collection is Unmodifiable use the {#addTo«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.itemType» value)}
         * and {@link #removeFrom«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.itemType» value)} methods
         * to modify this feature.
             «ENDIF»
         *
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        «IF featureAnnotation.documentation != null»
         * <!-- begin-model-doc -->
         * «featureAnnotation.documentation»
         * <!-- end-model-doc -->
        «ENDIF»
         * @return the value of '<em><b>«featureAnnotation.EStructuralFeature.name»</b></em>' feature
         * @generated
         */
        «modelController.getJavaAnnotations(featureAnnotation.EStructuralFeature, "getter", eClassModelGenAnnotation.EClass)»
        public «featureAnnotation.type» «featureAnnotation.getter»() {
        «IF !featureAnnotation.EStructuralFeature.volatile»
            «IF featureAnnotation.many && featureAnnotation.reference && (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
                «IF (featureAnnotation as EReferenceModelGenAnnotation).useList»
            return java.util.Collections.unmodifiableList(«featureAnnotation.validJavaMemberName»);
                «ELSE»
            return java.util.Collections.unmodifiableSet(«featureAnnotation.validJavaMemberName»);
                «ENDIF»
            «ELSE»
            return «featureAnnotation.validJavaMemberName»;
            «ENDIF»
        «ELSEIF featureAnnotation.featureMapFeature != null»
            «IF featureAnnotation.many»
            return «featureAnnotation.featureMapFeature.featureMapQualifiedClassName».createUnmodifiableValueList(«featureAnnotation.featureMapFeature.getter»(), «featureAnnotation.featureMapFeature.featureMapQualifiedClassName».Feature.«TemplateUtil::toUpperCase(featureAnnotation.name)»);
            «ELSE»
            return «featureAnnotation.featureMapFeature.featureMapQualifiedClassName».getSingleFeatureMapValue(«featureAnnotation.featureMapFeature.getter»(), «featureAnnotation.featureMapFeature.featureMapQualifiedClassName».Feature.«TemplateUtil::toUpperCase(featureAnnotation.name)»);
            «ENDIF»
        «ELSE»
            // Volatile feature
            // TODO: implement this method to return the '«featureAnnotation.EStructuralFeature.name»'
            // Ensure that you remove @generated or mark it @generated NOT
            throw new UnsupportedOperationException();
        «ENDIF»
        }

        «IF featureAnnotation.EStructuralFeature.changeable || (featureAnnotation.reference && (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation != null)»
            «IF featureAnnotation.featureMapFeature == null && featureAnnotation.many && featureAnnotation.reference && ((featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport || (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess)»
            /**
             * Adds to the <em>«featureAnnotation.EStructuralFeature.name»</em> feature.
             *
             * @param «featureAnnotation.validJavaMemberName»Value the value to add
             * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
             * @generated
             */
            public boolean addTo«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.itemType» «featureAnnotation.validJavaMemberName»Value) {
                «IF !featureAnnotation.EStructuralFeature.volatile»
                «IF featureAnnotation.EStructuralFeature.unique»
                if (!«featureAnnotation.validJavaMemberName».contains(«featureAnnotation.validJavaMemberName»Value)) {
                «ENDIF»
                    boolean result = «featureAnnotation.validJavaMemberName».add(«featureAnnotation.validJavaMemberName»Value);
                    «IF (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation != null && (featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport»
                    «var oppositeAnnotation = (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation»
                    «IF oppositeAnnotation.many»
                        «IF oppositeAnnotation.generateSafeManyAccess»
                            «featureAnnotation.validJavaMemberName»Value.addTo«TemplateUtil::toFirstUpper(oppositeAnnotation.validJavaMemberName)»(this);
                        «ELSE»
                            «featureAnnotation.validJavaMemberName»Value.add(this);
                        «ENDIF»
                    «ELSE»
                        «featureAnnotation.validJavaMemberName»Value.«oppositeAnnotation.setter»(this);
                    «ENDIF»
                    «ENDIF»
                    return result;
                «IF featureAnnotation.EStructuralFeature.unique»
                }
                return false;
                «ENDIF»
                «ELSE»
                // Volatile feature
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
                «ENDIF»
            }

            /**
             * Removes from the <em>«featureAnnotation.EStructuralFeature.name»</em> feature.
             *
             * @param «featureAnnotation.validJavaMemberName»Value the value to remove
             * @return true if the value is removed from the collection (it existed in the collection before removing), false otherwise
             *
             * @generated
             */
            public boolean removeFrom«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.itemType» «featureAnnotation.validJavaMemberName»Value) {
                «IF !featureAnnotation.EStructuralFeature.volatile»
                if («featureAnnotation.validJavaMemberName».contains(«featureAnnotation.validJavaMemberName»Value)) {
                    boolean result = «featureAnnotation.validJavaMemberName».remove(«featureAnnotation.validJavaMemberName»Value);
                    «IF (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation != null && (featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport»
                    «var oppositeAnnotation = (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation»
                    «IF oppositeAnnotation.many»
                        «IF oppositeAnnotation.generateSafeManyAccess»
                            «featureAnnotation.validJavaMemberName»Value.removeFrom«TemplateUtil::toFirstUpper(oppositeAnnotation.validJavaMemberName)»(this);
                        «ELSE»
                            «featureAnnotation.validJavaMemberName»Value.remove(oppositeAnnotation.validJavaMemberName)»(this);
                        «ENDIF»
                    «ELSE»
                        «featureAnnotation.validJavaMemberName»Value.«oppositeAnnotation.setter»(null);
                    «ENDIF»
                    «ENDIF»
                    return result;
                }
               	return false;
                «ELSE»
                // Volatile feature
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
                «ENDIF»
            }

            /**
             * Clears the <em>«featureAnnotation.EStructuralFeature.name»</em> feature.
             * @generated
             */
            public void clear«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»() {
                «IF !featureAnnotation.EStructuralFeature.volatile»
                while (!«featureAnnotation.validJavaMemberName».isEmpty()) {
                    removeFrom«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(«featureAnnotation.validJavaMemberName».iterator().next());
                }
                «ELSE»
                // Volatile feature
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
                «ENDIF»
            }
            «ENDIF»
            /**
             * Sets the '{@link «eClassModelGenAnnotation.simpleClassName»#«featureAnnotation.getter»() <em>«featureAnnotation.EStructuralFeature.name»</em>}' feature.
             *
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
            «IF featureAnnotation.documentation != null»
             * <!-- begin-model-doc -->
             * «featureAnnotation.documentation»
             * <!-- end-model-doc -->
            «ENDIF»
             * @param new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)» the new value of the '{@link «eClassModelGenAnnotation.simpleClassName»#«featureAnnotation.getter»() «featureAnnotation.EStructuralFeature.name»}' feature.
             * @generated
             */
            «modelController.getJavaAnnotations(featureAnnotation.EStructuralFeature, "setter", eClassModelGenAnnotation.EClass)»
            public void «featureAnnotation.setter»(«featureAnnotation.type» new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)») {
            «IF !featureAnnotation.EStructuralFeature.volatile»
                «IF featureAnnotation.reference && (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
                    «IF featureAnnotation.many»
                        clear«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»();
                        for («featureAnnotation.itemType» value : new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)») {
                            addTo«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»(value);
                        }
                    «ELSE»
                        «IF (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation != null && (featureAnnotation as EReferenceModelGenAnnotation).generateBidirectionalAssociationSupport»
                        «var oppositeAnnotation = (featureAnnotation as EReferenceModelGenAnnotation).oppositeModelGenAnnotation»
                        if («featureAnnotation.validJavaMemberName» != new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)») {
                            if («featureAnnotation.validJavaMemberName» != null) {
                                «IF oppositeAnnotation.many»
                                    «IF (oppositeAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
                                        «featureAnnotation.validJavaMemberName».removeFrom«TemplateUtil::toFirstUpper(oppositeAnnotation.validJavaMemberName)»(this);
                                    «ELSE»
                                        «featureAnnotation.validJavaMemberName».remove(this);
                                    «ENDIF»
                                «ELSE»
                                    «featureAnnotation.type» temp«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)» = «featureAnnotation.validJavaMemberName»;
                                    «featureAnnotation.validJavaMemberName» = null;
                                    temp«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)».«oppositeAnnotation.setter»(null);
                                «ENDIF»
                            }
                            «featureAnnotation.validJavaMemberName» = new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»;
                            if («featureAnnotation.validJavaMemberName» != null) {
                                «IF oppositeAnnotation.many»
                                    «IF (oppositeAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
                                        «featureAnnotation.validJavaMemberName».addTo«TemplateUtil::toFirstUpper(oppositeAnnotation.validJavaMemberName)»(this);
                                    «ELSE»
                                        «featureAnnotation.validJavaMemberName».add(this);
                                    «ENDIF»
                                «ELSE»
                                    «featureAnnotation.validJavaMemberName».«oppositeAnnotation.setter»(this);
                                «ENDIF»
                            }
                        }
                        «ELSE»
                            «featureAnnotation.validJavaMemberName» = new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»;
                        «ENDIF»
                    «ENDIF»
                «ELSE»
                    «featureAnnotation.validJavaMemberName» = new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»;
                «ENDIF»
            «ELSEIF featureAnnotation.featureMapFeature != null»
                «IF featureAnnotation.many»
                «featureAnnotation.featureMapFeature.setter»(«featureAnnotation.featureMapFeature.featureMapQualifiedClassName».createFeatureGroupList(«featureAnnotation.featureMapFeature.featureMapQualifiedClassName».Feature.«TemplateUtil::toUpperCase(featureAnnotation.name)», new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»));
                «ELSE»
                «featureAnnotation.featureMapFeature.featureMapQualifiedClassName».setSingleFeatureMapValue(«featureAnnotation.featureMapFeature.getter»(), «featureAnnotation.featureMapFeature.featureMapQualifiedClassName».Feature.«TemplateUtil::toUpperCase(featureAnnotation.name)», new«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»);
                «ENDIF»
            «ELSE»
                // Volatile feature
                // TODO: implement this method to set the '«featureAnnotation.EStructuralFeature.name»'
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
            «ENDIF»
            }
        «ENDIF»
      «ENDIF»
    «ENDFOR»

    /**
     * A toString method which prints the values of all EAttributes of this instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
      * @generated
     */
     @Override
     public String toString() {
         return  "«eClassModelGenAnnotation.name» "
         «FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
            «IF featureAnnotation.generateCode && !featureAnnotation.reference && !featureAnnotation.EStructuralFeature.many»
                 + " [«featureAnnotation.name»: " +  «featureAnnotation.getter»() + "]"
              «ENDIF»
         «ENDFOR»;
     }
}
'''

    def void generateFeatureGroups(ModelController modelController,
        EClassModelGenAnnotation eClassModelGenAnnotation) {
        /* Create the feature map entries if any«ENDREM */
        for (featureAnnotation : eClassModelGenAnnotation.featureMapFeatures) {
        	if (featureAnnotation.generateCode) {
	            var FeatureGroupTemplate template = new FeatureGroupTemplate();
	            template.setArtifactGenerator(getArtifactGenerator())
	            template.generate(featureAnnotation)
	            addFiles(template.getFiles())
        	}
        }
    }
}
