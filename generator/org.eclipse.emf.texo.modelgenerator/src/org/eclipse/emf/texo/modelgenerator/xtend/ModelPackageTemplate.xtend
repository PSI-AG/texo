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

import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.texo.generator.BaseTemplate
import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.modelgenerator.annotator.GenConstants
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
import java.util.ArrayList
import java.util.List

class ModelPackageTemplate extends BaseTemplate {

    def void generate(EPackageModelGenAnnotation ePackageModelGenAnnotation, boolean doDao) {

        if (executeOverrides(ePackageModelGenAnnotation)) {
            return
        }

        var fileName = TemplateUtil::packageFileName(ePackageModelGenAnnotation)
        var content = generateContent(getModelController(), ePackageModelGenAnnotation, doDao)

        addFile(fileName, content)
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::modelpackage")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelPackageTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EPackageModelGenAnnotation ePackageModelGenAnnotation,
        boolean doDao)
        '''
«ePackageModelGenAnnotation.javaFileHeader»
package «ePackageModelGenAnnotation.modelClassesPackagePath»;

/**
 * The <b>Package</b> for the model '<em><b>«ePackageModelGenAnnotation.name»</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 *
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
«IF ePackageModelGenAnnotation.documentation != null»
 * <!-- begin-model-doc -->
 * «ePackageModelGenAnnotation.documentation»
 * <!-- end-model-doc -->
«ENDIF»
 * @generated
 */
public class «ePackageModelGenAnnotation.simpleClassName» extends org.eclipse.emf.texo.model.ModelPackage {

    /**
     * Is set when the package has been initialized.
     * @generated
     */
    private static boolean isInitialized = false;

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String NS_URI = "«ePackageModelGenAnnotation.EPackage.nsURI»";

    /**
     * The {@link org.eclipse.emf.texo.model.ModelFactory} for this package.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
     public static final «ePackageModelGenAnnotation.simpleModelFactoryClassName» «GenConstants::MODELFACTORY_CONSTANT» = new «ePackageModelGenAnnotation.simpleModelFactoryClassName»();
    «FOR eClassifierAnnotation : ePackageModelGenAnnotation.EDataTypeModelGenAnnotations»

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int «TemplateUtil::toUpperCase(eClassifierAnnotation.name)»_CLASSIFIER_ID = «eClassifierAnnotation.EClassifier.classifierID»;
    «ENDFOR»
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int «TemplateUtil::toUpperCase(eClassAnnotation.name)»_CLASSIFIER_ID = «eClassAnnotation.EClass.classifierID»;
    «FOR featureAnnotation : eClassAnnotation.EAllStructuralFeatureModelGenAnnotations»

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int «TemplateUtil::toUpperCase(eClassAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID = «eClassAnnotation.EClass.getFeatureID(featureAnnotation.EStructuralFeature)»;
    «ENDFOR»
    «ENDFOR»

    «/*this static initialization must be done last, after the other ones, otherwise
    the above statics are not set before the initialize method is called*/»
    /**
     * The static member with the instance of this {@link ModelPackage}.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final «ePackageModelGenAnnotation.simpleClassName» INSTANCE = initialize();

    /**
     * Initializes this {@link org.eclipse.emf.texo.model.ModelPackage}.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return an initialized instance of this class
     *
     * @generated
     */
    public static «ePackageModelGenAnnotation.simpleClassName» initialize() {

        if (isInitialized) {
            return («ePackageModelGenAnnotation.simpleClassName»)org.eclipse.emf.texo.model.ModelResolver.getInstance().getModelPackage(NS_URI);
        }

        final «ePackageModelGenAnnotation.simpleClassName» modelPackage = new «ePackageModelGenAnnotation.simpleClassName»();

        org.eclipse.emf.texo.model.ModelResolver.getInstance().registerModelPackage(modelPackage);

        «IF ePackageModelGenAnnotation.handleEcoreFile»
        // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
        // see the ModelResolver getEPackageRegistry method
        org.eclipse.emf.texo.utils.ModelUtils.readEPackagesFromFile(modelPackage);
        «ENDIF»

        isInitialized = true;

        «FOR p : ePackageModelGenAnnotation.dependsOn»
        «(p as EPackageModelGenAnnotation).qualifiedClassName».initialize();
        «ENDFOR»

        // force the initialization of the EFactory proxy
        modelPackage.getEPackage();

        «FOR p : ePackageModelGenAnnotation.subPackageModelGens»
        «(p as EPackageModelGenAnnotation).qualifiedClassName».initialize();
        «ENDFOR»

        // register the relation between a Class and its EClassifier
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «IF eClassAnnotation.qualifiedClassName != null»
        org.eclipse.emf.texo.model.ModelResolver.getInstance().registerClassModelMapping(«eClassAnnotation.qualifiedClassName».class, modelPackage.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»EClass(),modelPackage);
    «ENDIF»
    «ENDFOR»

    «FOR eEnumAnnotation : ePackageModelGenAnnotation.EEnumModelGenAnnotations»
    «IF eEnumAnnotation.qualifiedClassName != null»
        org.eclipse.emf.texo.model.ModelResolver.getInstance().registerClassModelMapping(«eEnumAnnotation.qualifiedClassName».class, modelPackage.get«TemplateUtil::toFirstUpper(eEnumAnnotation.name)»EEnum(),modelPackage);
    «ENDIF»
    «ENDFOR»

    «IF doDao»
        «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
        «IF eClassAnnotation.daoQualifiedClassName != null»
        org.eclipse.emf.texo.server.store.DaoRegistry.getInstance().registerDao(«eClassAnnotation.qualifiedClassName».class, «eClassAnnotation.daoQualifiedClassName».class);
        «ENDIF»
        «ENDFOR»
    «ENDIF»

        // and return ourselves
        return modelPackage;
    }

    /**
     * Returns the {@link org.eclipse.emf.texo.model.ModelFactory} of this ModelPackage.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the {@link «ePackageModelGenAnnotation.simpleModelFactoryClassName»} instance.
     * @generated
     */
    @Override
    public «ePackageModelGenAnnotation.simpleModelFactoryClassName» getModelFactory() {
        return «GenConstants::MODELFACTORY_CONSTANT»;
    }

    /**
     * Returns the nsUri of the {@link org.eclipse.emf.ecore.EPackage} managed by this Package instance.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the nsUri of the EPackage
     * @generated
    */
    @Override
    public String getNsURI() {
        return NS_URI;
    }

    /**
     * Returns the name of the ecore file containing the ecore model of the {@link org.eclipse.emf.ecore.EPackage} managed here.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the name of the ecore file
     * @generated
    */
    @Override
    public String getEcoreFileName() {
        return "«ePackageModelGenAnnotation.name».ecore";
    }

    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»

    /**
     * Returns the {@link org.eclipse.emf.ecore.EClass} '<em><b>«eClassAnnotation.EClass.name»</b></em>'.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return an instance of the {@link org.eclipse.emf.ecore.EClass} '<em><b>«eClassAnnotation.EClass.name»</b></em>'
     * @generated
     */
    public org.eclipse.emf.ecore.EClass get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»EClass() {
        return (org.eclipse.emf.ecore.EClass)getEPackage().getEClassifiers().get(«TemplateUtil::toUpperCase(eClassAnnotation.name)»_CLASSIFIER_ID);
    }
    «FOR featureAnnotation : eClassAnnotation.EStructuralFeatureModelGenAnnotations»

    /**
     * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>«eClassAnnotation.EClass.name».«featureAnnotation.EStructuralFeature.name»</b></em>'.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>«eClassAnnotation.EClass.name».«featureAnnotation.EStructuralFeature.name»</b></em>'.
     * @generated
     */
    «IF featureAnnotation.EStructuralFeature instanceof EReference»
    public org.eclipse.emf.ecore.EReference get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»_«TemplateUtil::toFirstUpper(featureAnnotation.name)»() {
        return (org.eclipse.emf.ecore.EReference)get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»EClass().getEAllStructuralFeatures().get(«TemplateUtil::toUpperCase(eClassAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID);
    }
    «ELSE»
    public org.eclipse.emf.ecore.EAttribute get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»_«TemplateUtil::toFirstUpper(featureAnnotation.name)»() {
        return (org.eclipse.emf.ecore.EAttribute)get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»EClass().getEAllStructuralFeatures().get(«TemplateUtil::toUpperCase(eClassAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID);
    }
    «ENDIF»
    «ENDFOR»
    «ENDFOR»
    «FOR eClassifierAnnotation : ePackageModelGenAnnotation.EDataTypeModelGenAnnotations»
    «IF eClassifierAnnotation.EClassifier instanceof EEnum»
    /**
     * Returns the EEnum '<em><b>«eClassifierAnnotation.EClassifier.name»</b></em>'.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return an instance of the EEnum representing '<em><b>«eClassifierAnnotation.EClassifier.name»</b></em>'
     * @generated
     */
    public org.eclipse.emf.ecore.EEnum get«TemplateUtil::toFirstUpper(eClassifierAnnotation.name)»EEnum() {
        return (org.eclipse.emf.ecore.EEnum)getEPackage().getEClassifiers().get(«TemplateUtil::toUpperCase(eClassifierAnnotation.name)»_CLASSIFIER_ID);
    }
    «ELSE»
    /**
     * Returns the {@link org.eclipse.emf.ecore.EDataType} '<em><b>«eClassifierAnnotation.EClassifier.name»</b></em>'.
      * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return an instance of the {@link org.eclipse.emf.ecore.EDataType} representing '<em><b>«eClassifierAnnotation.EClassifier.name»</b></em>'
     * @generated
     */
    public org.eclipse.emf.ecore.EDataType get«TemplateUtil::toFirstUpper(eClassifierAnnotation.name)»EDataType() {
        return    (org.eclipse.emf.ecore.EDataType)getEPackage().getEClassifiers().get(«TemplateUtil::toUpperCase(eClassifierAnnotation.name)»_CLASSIFIER_ID);
    }
    «ENDIF»
    «ENDFOR»

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param eClassifier
     *            the {@link org.eclipse.emf.ecore.EClassifier}
     * @return the class implementing a specific {@link org.eclipse.emf.ecore.EClass}.
     * @generated
     */
    @Override
    public Class<?> getEClassifierClass(org.eclipse.emf.ecore.EClassifier eClassifier) {
        switch (eClassifier.getClassifierID()) {
    «FOR eClassAnnotation : ePackageModelGenAnnotation.EClassModelGenAnnotations»
    «IF eClassAnnotation.qualifiedClassName != null»
        case «TemplateUtil::toUpperCase(eClassAnnotation.name)»_CLASSIFIER_ID:
            return «eClassAnnotation.qualifiedClassName».class;
    «ENDIF»
    «ENDFOR»
    «FOR eClassifierAnnotation : ePackageModelGenAnnotation.EDataTypeModelGenAnnotations»
    «IF eClassifierAnnotation.qualifiedClassName != null»
        case «TemplateUtil::toUpperCase(eClassifierAnnotation.name)»_CLASSIFIER_ID:
            return «eClassifierAnnotation.qualifiedClassName».class;
    «ENDIF»
    «ENDFOR»
        default:
            throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
        }
    }
}
'''
}