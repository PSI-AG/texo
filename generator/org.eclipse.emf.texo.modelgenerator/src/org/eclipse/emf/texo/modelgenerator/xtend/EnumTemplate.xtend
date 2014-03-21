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
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation

class EnumTemplate extends BaseTemplate {

    def void generate(EEnumModelGenAnnotation eEnumModelGenAnnotation) {

        if (!eEnumModelGenAnnotation.generateCode) {
            return
        }

        if (executeOverrides(eEnumModelGenAnnotation)) {
            return
        }

        var fileName = TemplateUtil::classFileName(eEnumModelGenAnnotation)
        var content = generateContent(getModelController(), eEnumModelGenAnnotation, eEnumModelGenAnnotation.EDataType as EEnum, eEnumModelGenAnnotation.ownerEPackageAnnotation)

        addFile(fileName, content)
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::enum")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::EnumTemplate")
        return list
    }

    def String generateContent(ModelController modelController, EEnumModelGenAnnotation eEnumModelGenAnnotation,
            EEnum eEnum, EPackageModelGenAnnotation ePackageAnnotation
    )
        '''
«ePackageAnnotation.javaFileHeader»
package «ePackageAnnotation.packagePath»;

/**
 * A representation of the literals of the enumeration '<em><b>«eEnumModelGenAnnotation.name»</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
«IF eEnumModelGenAnnotation.documentation != null»
 * <!-- begin-model-doc -->
 * «eEnumModelGenAnnotation.documentation»
 * <!-- end-model-doc -->
«ENDIF»
 * @generated
 */
«modelController.getJavaAnnotations(eEnumModelGenAnnotation.EEnum, "type")»
public enum «eEnumModelGenAnnotation.simpleClassName»
{

«executeXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::enum_addition", eEnumModelGenAnnotation)»

«FOR e : eEnum.ELiterals SEPARATOR ','»
    «var EEnumLiteral el = e as EEnumLiteral»
     /**
      * The enum: «TemplateUtil::toUpperCase(el.name)»
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
    «IF TemplateUtil::getDocumentation(el) != null»
     * <!-- begin-model-doc -->
     * «TemplateUtil::getDocumentation(el)»
     * <!-- end-model-doc -->
    «ENDIF»
      * @generated
      */
    «modelController.getJavaAnnotations(el, "type")»
    «TemplateUtil::toUpperCase(TemplateUtil::format(el.name))»(«el.value», "«el.name»", "«el.literal»") {

         /**
          * @return always true for this instance
          * @generated
          */
        @Override
        public boolean is«TemplateUtil::toFirstUpper(el.name)»() {
            return true;
        }
    }
«ENDFOR»;

    /**
     * An array of all the '<em><b>«eEnumModelGenAnnotation.name»</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final «eEnumModelGenAnnotation.simpleClassName»[] VALUES_ARRAY =
        new «eEnumModelGenAnnotation.simpleClassName»[] {
«FOR e : eEnum.ELiterals SEPARATOR ','»
    «var EEnumLiteral el = e as EEnumLiteral»«TemplateUtil::toUpperCase(TemplateUtil::format(el.name))»
«ENDFOR»
        };

    /**
     * A public read-only list of all the '<em><b>«eEnumModelGenAnnotation.name»</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final java.util.List<«eEnumModelGenAnnotation.simpleClassName»> VALUES = java.util.Collections.unmodifiableList(java.util.Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>«eEnumModelGenAnnotation.name»</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param literal the literal to use to get the enum instance
     * @return the «eEnumModelGenAnnotation.name», the literal enum class
     * @generated
     */
    public static «eEnumModelGenAnnotation.simpleClassName» get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            «eEnumModelGenAnnotation.simpleClassName» result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>«eEnumModelGenAnnotation.name»</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name to use to get the enum instance
     * @return the «eEnumModelGenAnnotation.name», the literal enum class
     * @generated
     */
    public static «eEnumModelGenAnnotation.simpleClassName» getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            «eEnumModelGenAnnotation.simpleClassName» result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>«eEnumModelGenAnnotation.name»</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the value to use to get the enum instance
     * @return the «eEnumModelGenAnnotation.name», the literal enum
     * @generated
     */
    public static «eEnumModelGenAnnotation.simpleClassName» get(int value) {
        for («eEnumModelGenAnnotation.simpleClassName» enumInstance : VALUES_ARRAY) {
            if (enumInstance.getValue() == value) {
                return enumInstance;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private «eEnumModelGenAnnotation.simpleClassName»(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

«FOR e : eEnum.ELiterals»
    «var EEnumLiteral el = e as EEnumLiteral»

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return false, is overridden by actual enum types.
     * @generated
     */
    public boolean is«TemplateUtil::toFirstUpper(el.name)»() {
        return false;
    }

«ENDFOR»

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the name
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the literal of this enum instance
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the literal value of the enumerator, which is its string representation.
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
}
        '''
}
