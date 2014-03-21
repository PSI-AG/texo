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
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation

class ModelFactoryTemplate extends BaseTemplate {

    def void generate(EPackageModelGenAnnotation ePackageModelGenAnnotation) {

        if (executeOverrides(ePackageModelGenAnnotation)) {
            return
        }

        var fileName = TemplateUtil::modelFactoryFileName(ePackageModelGenAnnotation)
        var content = generateContent(getModelController(), ePackageModelGenAnnotation)

        content = content + generateModelObjects(getModelController(), ePackageModelGenAnnotation)
        content = content + generateFeatureMaps(getModelController(), ePackageModelGenAnnotation)

        content = content + "}"

        addFile(fileName, content)
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::modelfactory")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelFactoryTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EPackageModelGenAnnotation ePackageModelGenAnnotation)
        '''
«ePackageModelGenAnnotation.javaFileHeader»
package «ePackageModelGenAnnotation.modelClassesPackagePath»;

/**
 * The <b>{@link org.eclipse.emf.texo.model.ModelFactory}</b> for the types of this model: «ePackageModelGenAnnotation.EPackage.name».
 * It contains code to create instances {@link org.eclipse.emf.texo.model.ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
«IF ePackageModelGenAnnotation.documentation != null»
 * <!-- begin-model-doc -->
 * «ePackageModelGenAnnotation.documentation»
 * <!-- end-model-doc -->
«ENDIF»
 * @generated
 */
public class «ePackageModelGenAnnotation.simpleModelFactoryClassName» implements org.eclipse.emf.texo.model.ModelFactory {

    /**
     * Creates an instance for an {@link org.eclipse.emf.ecore.EClass}
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param eClass creates a Object instance for this EClass
     * @return an object representing the eClass
     * @generated
     */
    public Object create(org.eclipse.emf.ecore.EClass eClass) {
        switch (eClass.getClassifierID()) {
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «IF !eClassAnnotation.EClass.isAbstract() && !eClassAnnotation.EClass.interface && eClassAnnotation.generateCode»
            case «ePackageModelGenAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassAnnotation.name)»_CLASSIFIER_ID:
                return create«TemplateUtil::toFirstUpper(eClassAnnotation.name)»();
    «ENDIF»
    «ENDFOR»
            default:
                throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
        }
    }

    /**
     * Wraps an object in a {@link ModelObject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param eClass
     *            the EClass of the object
     * @param adaptee
     *            the object being wrapped/adapted
     * @return the wrapper {@link ModelObject}
     * @generated
     */
    @SuppressWarnings( { "unchecked", "rawtypes" })
    public ModelObject createModelObject(org.eclipse.emf.ecore.EClass eClass, Object adaptee) {
    «IF !ePackageModelGenAnnotation.EClassModelGenAnnotations.isEmpty»
        ModelObject<Object> modelObject = null;
        switch (eClass.getClassifierID()) {
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «IF eClassAnnotation.generateCode»
            case «ePackageModelGenAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassAnnotation.name)»_CLASSIFIER_ID:
                modelObject = new «eClassAnnotation.simpleClassName»ModelObject();
                break;
    «ENDIF»
    «ENDFOR»
            default:
                throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
        }
        modelObject.setTarget(adaptee);
        return modelObject;
    «ELSE»
        throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    «ENDIF»
    }

    /**
     * Creates a feature map entry instance for a certain EStructuralFeature.
     *
     * @param eFeature
     *          the feature map feature
     * @return the pojo feature map entry
     * @generated
     */
    public Object createFeatureMapEntry(org.eclipse.emf.ecore.EStructuralFeature eFeature) {
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «FOR featureAnnotation : eClassAnnotation.featureMapFeatures»
   	  «IF featureAnnotation.generateCode»
      if (eFeature == «ePackageModelGenAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»_«TemplateUtil::toFirstUpper(featureAnnotation.name)»()) {
        return new «featureAnnotation.featureMapQualifiedClassName»();
      }
      «ENDIF»
    «ENDFOR»
    «ENDFOR»
      throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
          + "' is not a valid feature map in this EPackage");
      }

    /**
     * Wraps a feature map entry pojo in a {@link org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry}. If the feature map
     * entry is null then a new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param eFeature
     *          the feature map feature of the object
     * @param adaptee
     *          the pojo feature map entry being wrapped/adapted
     * @return the wrapper {@link ModelFeatureMapEntry}
     * @generated
     */
    public org.eclipse.emf.texo.model.ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature,
        Object adaptee) {
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «FOR featureAnnotation : eClassAnnotation.featureMapFeatures»
   	  «IF featureAnnotation.generateCode»
      if (eFeature == «ePackageModelGenAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»_«TemplateUtil::toFirstUpper(featureAnnotation.name)»()) {
        final «featureAnnotation.featureMapSimpleClassName»ModelFeatureMapEntry<«featureAnnotation.featureMapQualifiedClassName»> entry = new «featureAnnotation.featureMapSimpleClassName»ModelFeatureMapEntry<«featureAnnotation.featureMapQualifiedClassName»>();
        entry.setTarget((«featureAnnotation.featureMapQualifiedClassName») adaptee);
        return entry;
      }
      «ENDIF»
    «ENDFOR»
    «ENDFOR»
      throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
          + "' is not a valid feature map in this EPackage");
    }

    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «IF !eClassAnnotation.EClass.isAbstract() && !eClassAnnotation.EClass.interface && eClassAnnotation.generateCode»
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return an instance of the model object representing the EClass «eClassAnnotation.EClass.name»
     * @generated
     */
    public «eClassAnnotation.qualifiedClassName» create«TemplateUtil::toFirstUpper(eClassAnnotation.name)»() {
        return new «eClassAnnotation.qualifiedClassName»();
    }
    «ENDIF»
    «ENDFOR»

    /**
     * Converts an instance of an {@link org.eclipse.emf.ecore.EDataType} to a String.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param eDataType the {@link org.eclipse.emf.ecore.EDataType} defining the type
     * @param value the object to convert, if the value is null then null is returned.
     * @generated
     */
    public Object createFromString(org.eclipse.emf.ecore.EDataType eDataType, String value) {
        switch (eDataType.getClassifierID()) {
    «FOR eDataTypeAnnotation : ePackageModelGenAnnotation.EDataTypeModelGenAnnotations»
        case «ePackageModelGenAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eDataTypeAnnotation.name)»_CLASSIFIER_ID:
            return create«TemplateUtil::toFirstUpper(eDataTypeAnnotation.name)»FromString(value);
    «ENDFOR»
        default:
            throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
        }
    }

    /**
     * Converts an instance of an {@link org.eclipse.emf.ecore.EDataType} to a String.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param eDataType the {@link org.eclipse.emf.ecore.EDataType} defining the type
     * @param value the object to convert, if value == null then null is returned
     * @generated
     */
	«IF ePackageModelGenAnnotation.addSuppressUnchecked»
	@SuppressWarnings("unchecked")
	«ENDIF»
    public String convertToString(org.eclipse.emf.ecore.EDataType eDataType, Object value) {
        switch (eDataType.getClassifierID()) {
    «FOR eDataTypeAnnotation : ePackageModelGenAnnotation.EDataTypeModelGenAnnotations»
        «IF eDataTypeAnnotation.generateCode»
            case «ePackageModelGenAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eDataTypeAnnotation.name)»_CLASSIFIER_ID:
                return convert«TemplateUtil::toFirstUpper(eDataTypeAnnotation.name)»ToString(«TemplateUtil::cast(eDataTypeAnnotation.objectClassName)»value);
        «ENDIF»
    «ENDFOR»
            default:
                throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
        }
    }

    «FOR eDataTypeAnnotation : ePackageModelGenAnnotation.EDataTypeModelGenAnnotations»
    /**
     * Converts the EDataType: «eDataTypeAnnotation.EClassifier.name» to a String.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the object to convert
     * @return the String representing the value, if value == null then null is returned
     * @generated
     */
    public String convert«TemplateUtil::toFirstUpper(eDataTypeAnnotation.name)»ToString(«eDataTypeAnnotation.objectClassName» value) {
        if (value == null) {
            return null;
        }
        «IF eDataTypeAnnotation.enum»
        return value.toString();
        «ELSEIF eDataTypeAnnotation.baseTypeAnnotation != null»
        return convert«TemplateUtil::toFirstUpper(eDataTypeAnnotation.baseTypeAnnotation.name)»ToString(value);
        «ELSEIF eDataTypeAnnotation.dateType»
        return org.eclipse.emf.texo.utils.ModelUtils.convertToXML(value);
        «ELSEIF eDataTypeAnnotation.instanceClassName == 'java.lang.String'»
        return value;
        «ELSEIF eDataTypeAnnotation.automaticStringConversion»
        return value.toString();
        «ELSE»
        EDataType eDataType = «ePackageModelGenAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eDataTypeAnnotation.name)»EDataType();
        throw new UnsupportedOperationException("Operation not support for EDataType " + eDataType.getName() + " converting from value " + value);
        «ENDIF»
    }

    /**
     * Creates an instance of the EDataType: «eDataTypeAnnotation.EClassifier.name» from a String.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the string value to convert to an object
     * @return the instance of the data type, if value == null then null is returned
     * @generated
     */
    public «eDataTypeAnnotation.objectClassName» create«TemplateUtil::toFirstUpper(eDataTypeAnnotation.name)»FromString(String value) {
        if (value == null) {
            return null;
        }
        «IF eDataTypeAnnotation.enum»
        return «eDataTypeAnnotation.qualifiedClassName».get(value);
        «ELSEIF eDataTypeAnnotation.baseTypeAnnotation != null»
        return create«TemplateUtil::toFirstUpper(eDataTypeAnnotation.baseTypeAnnotation.name)»FromString(value);
        «ELSEIF eDataTypeAnnotation.dateType»
        return org.eclipse.emf.texo.utils.ModelUtils.createFromXML(value);
        «ELSEIF eDataTypeAnnotation.instanceClassName == 'java.lang.String'»
        return value;
        «ELSEIF eDataTypeAnnotation.automaticStringConversion»
        return new «eDataTypeAnnotation.objectClassName»(value);
        «ELSE»
        EDataType eDataType = «ePackageModelGenAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eDataTypeAnnotation.name)»EDataType();
        throw new UnsupportedOperationException("Operation not support for EDataType " + eDataType.getName() + " converting from value " + value);
        «ENDIF»
    }
    «ENDFOR»
    '''

    def String generateModelObjects(ModelController modelController,
        EPackageModelGenAnnotation ePackageModelGenAnnotation) {
        var result = ""
        /* Create the ModelObject wrappers as inner classes */
        for (eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations) {
            if (eClassAnnotation.qualifiedClassName != null && eClassAnnotation.generateCode) {
                var ModelObjectTemplate template = new ModelObjectTemplate();
                template.setArtifactGenerator(getArtifactGenerator())
                result = result + "\n\n" + template.generateContent(eClassAnnotation)
            }
        }
        result
    }

    def String generateFeatureMaps(ModelController modelController,
        EPackageModelGenAnnotation ePackageModelGenAnnotation) {
        var result = ""
        for (eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations) {
        	if (eClassAnnotation.generateCode) {
	            for (featureAnnotation : eClassAnnotation.featureMapFeatures) {            	
    		    	if (featureAnnotation.generateCode) {
		                var ModelFeatureMapTemplate template = new ModelFeatureMapTemplate()
	        	        template.setArtifactGenerator(getArtifactGenerator())
	            	    result = result + "\n\n" + template.generateContent(featureAnnotation)
	            	}
	            }
            }
        }
        result
    }
}
