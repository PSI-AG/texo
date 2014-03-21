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
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation

class FeatureGroupTemplate extends BaseTemplate {

    def void generate(EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation) {
        var EClassModelGenAnnotation eClassAnnotation = eStructuralFeatureModelGenAnnotation.ownerEClassAnnotation as EClassModelGenAnnotation
        var EPackageModelGenAnnotation ePackageAnnotation = eClassAnnotation.ownerEPackageAnnotation as EPackageModelGenAnnotation

        if (executeOverrides(eStructuralFeatureModelGenAnnotation)) {
            return
        }

        var fileName = TemplateUtil::classFileName(eStructuralFeatureModelGenAnnotation)
        var content = generateContent(getModelController(), eStructuralFeatureModelGenAnnotation, eClassAnnotation, ePackageAnnotation)

        addFile(fileName, content)
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::featuregroup")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::FeatureGroupTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
        EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation,
        EClassModelGenAnnotation eClassAnnotation,
        EPackageModelGenAnnotation ePackageAnnotation)
        '''
«ePackageAnnotation.javaFileHeader»
package «ePackageAnnotation.packagePath»;

/**
 * A representation for the Feature Group '<em><b>«eClassAnnotation.EClass.name».«eStructuralFeatureModelGenAnnotation.name»</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
«IF eStructuralFeatureModelGenAnnotation.documentation != null»
 * <!-- begin-model-doc -->
 * «eStructuralFeatureModelGenAnnotation.documentation»
 * <!-- end-model-doc -->
«ENDIF»
 * @generated
*/
«modelController.getJavaAnnotations(eStructuralFeatureModelGenAnnotation.EStructuralFeature, "featureMap.type")»
public class «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»
«IF ePackageAnnotation.featureMapClassExtends != null && ePackageAnnotation.featureMapClassExtends.trim().length > 0» extends «ePackageAnnotation.featureMapClassExtends»«ENDIF»
{

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * Is used to identify which feature is set in this feature group.
     * @generated
     */
    public static enum Feature {
    «IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»TEXT, CDATA, COMMENT«IF eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures.size > 0»,«ENDIF»«ENDIF»
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures SEPARATOR ","»
    	«IF memberFeatureAnnotation.generateCode»
           «TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»
    	«ENDIF»
    «ENDFOR»
    }

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * Returns only the values from the feature group which have the feature equal to the parameter.
     *
     * @param featureGroup the featureGroup List to filter
     * @param filterByFeature filters by this enum
     * @return a list with instances corresponding to the feature kind
     * @see java.util.Collections#unmodifiableList(List)
     * @generated
     */
    @SuppressWarnings("unchecked")
    public static <T> java.util.List<T> createUnmodifiableValueList(java.util.List<«eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»> featureGroup, Feature filterByFeature) {
        final java.util.List<Object> result = new java.util.ArrayList<Object>();
        for (final «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName» group : featureGroup) {
            if (group.getFeature() == filterByFeature) {
                result.add(group.getValue());
            }
        }
        return (List<T>) Collections.unmodifiableList(result);
    }

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * Returns a single value from the feature group which has the feature equal to the parameter.
     * The first found value is returned. If no value can be found then null is returned.
     *
     * @param featureGroup the featureGroup List to filter
     * @param filterByFeature filters by this enum
     * @return an instance corresponding to the feature kind or null if not found.
     * @generated
     */
    @SuppressWarnings("unchecked")
    public static <T> T getSingleFeatureMapValue(java.util.List<«eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»> featureGroup, Feature filterByFeature) {
        for (final «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName» group : featureGroup) {
            if (group.getFeature() == filterByFeature) {
                return (T)group.getValue();
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * Sets a single value in a feature group, if there is already a value set in the feature
     * for the feature in question then it is replaced by the new value.
     *
     * @param featureGroup the featureGroup List to find the value
     * @param feature sets this feature
     * @param value the value to set
     * @generated
     */
    public static void setSingleFeatureMapValue(java.util.List<«eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»> featureGroup, Feature feature, Object value) {
        for (final «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName» group : featureGroup) {
            if (group.getFeature() == feature) {
                group.setValue(feature, value);
                return;
            }
        }
        final «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName» entry = new «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»();
        entry.setValue(feature, value);
        featureGroup.add(entry);
    }

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * Creates a list of group instances set with the passed feature and values.
     *
     * @param feature the feature to set
     * @param values the values to set as value of each group instance in the result.
     * @return a list with instances of this class, set with the Feature and values
     * @generated
     */
    public static java.util.List<«eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»> createFeatureGroupList(Feature feature, List<?> values) {
        final java.util.List<«eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»> result = new java.util.ArrayList<«eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»>();
        for (Object value : values) {
            final «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName» group = new «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»();
            group.setValue(feature, value);
            result.add(group);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * @generated
     */
    «modelController.getJavaAnnotations(eStructuralFeatureModelGenAnnotation.EStructuralFeature, "featureMap.feature")»
    private Feature feature = null;

«IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    «modelController.getJavaAnnotations(eStructuralFeatureModelGenAnnotation.EStructuralFeature, "featureMap.text")»
    private String text;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    «modelController.getJavaAnnotations(eStructuralFeatureModelGenAnnotation.EStructuralFeature, "featureMap.cdata")»
    private String cDATA;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    «modelController.getJavaAnnotations(eStructuralFeatureModelGenAnnotation.EStructuralFeature, "featureMap.comment")»
    private String comment;
«ENDIF»
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.memberFeatureMapFeatures»

    «IF memberFeatureAnnotation.generateCode && memberFeatureAnnotation.featureMapFeature == eStructuralFeatureModelGenAnnotation»
    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
     * @generated
    */
    «modelController.getJavaAnnotations(memberFeatureAnnotation.EStructuralFeature, "featureMap.field")»
    private «memberFeatureAnnotation.itemType» «memberFeatureAnnotation.validJavaMemberName»;
    «ENDIF»
    «ENDFOR»

    /**
     * @param feature the EStructuralFeature of this feature map entry
     * @generated
     */
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    /**
     * @return feature the EStructuralFeature of this feature map entry
     * @generated
     */
    public Feature getFeature() {
        return feature;
    }

«IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
    /**
     * Returns the value of '<em><b>text</b></em>' feature.
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of '<em><b>text</b></em>' feature
     * @generated
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the <em>text</em> feature.
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param newText the new value of the '<em><b>text</b></em>' feature.
     * @generated
     */
    public void setText(String newText) {
        text = newText;
        setFeature(Feature.TEXT);
    }

    /**
     * Returns the value of '<em><b>CDATA</b></em>' feature.
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of '<em><b>CDATA</b></em>' feature
     * @generated
     */
    public String getCDATA() {
        return cDATA;
    }

    /**
     * Sets the <em>cDATA</em> feature.
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param newCDATA the new value of the '<em><b>CDATA</b></em>' feature.
     * @generated
     */
    public void setCDATA(String newCDATA) {
        cDATA = newCDATA;
        setFeature(Feature.CDATA);
    }

    /**
     * Returns the value of '<em><b>comment</b></em>' feature.
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of '<em><b>comment</b></em>' feature
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the <em>comment</em> feature.
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param newComment the new value of the '<em><b>comment</b></em>' feature.
     * @generated
     */
    public void setComment(String newComment) {
        comment = newComment;
        setFeature(Feature.COMMENT);
    }
«ENDIF»
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»

	  «IF memberFeatureAnnotation.generateCode»
        /**
         * Returns the value of '<em><b>«memberFeatureAnnotation.EStructuralFeature.name»</b></em>' feature.
         *
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the value of '<em><b>«memberFeatureAnnotation.EStructuralFeature.name»</b></em>' feature
         * @generated
         */
        «modelController.getJavaAnnotations(memberFeatureAnnotation.EStructuralFeature, "featureMap.getter")»
        public «memberFeatureAnnotation.itemType» «memberFeatureAnnotation.getter»() {
        «IF memberFeatureAnnotation.featureMapFeature == eStructuralFeatureModelGenAnnotation»
            return «memberFeatureAnnotation.validJavaMemberName»;
        «ELSE»
            if («memberFeatureAnnotation.featureMapFeature.getter»() == null) {
                return null;
            }
            return «memberFeatureAnnotation.featureMapFeature.getter»().«memberFeatureAnnotation.getter»();
        «ENDIF»
        }

        /**
         * Sets the '{@link «eClassAnnotation.simpleClassName»#«memberFeatureAnnotation.getter»() <em>«memberFeatureAnnotation.EStructuralFeature.name»</em>}' feature.
         *
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param new«TemplateUtil::toFirstUpper(memberFeatureAnnotation.name)» the new value of the '{@link «eClassAnnotation.simpleClassName»#«memberFeatureAnnotation.getter»() «memberFeatureAnnotation.EStructuralFeature.name»}' feature.
         * @generated
         */
        «modelController.getJavaAnnotations(memberFeatureAnnotation.EStructuralFeature, "featureMap.setter")»
        public void «memberFeatureAnnotation.setter»(«memberFeatureAnnotation.itemType» new«TemplateUtil::toFirstUpper(memberFeatureAnnotation.name)») {
            «IF memberFeatureAnnotation.featureMapFeature == eStructuralFeatureModelGenAnnotation»
            «memberFeatureAnnotation.validJavaMemberName» = new«TemplateUtil::toFirstUpper(memberFeatureAnnotation.name)»;
            setFeature(Feature.«TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»);
            «ELSE»
                if («memberFeatureAnnotation.featureMapFeature.getter»() == null) {
                    «memberFeatureAnnotation.featureMapFeature.setter»(new «memberFeatureAnnotation.featureMapFeature.featureMapQualifiedClassName»());
                }
                «memberFeatureAnnotation.featureMapFeature.getter»().«memberFeatureAnnotation.setter»(new«TemplateUtil::toFirstUpper(memberFeatureAnnotation.name)»);
            «ENDIF»
        }
      «ENDIF»
    «ENDFOR»

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      * @return the value of this feature map entry. The type of the returned value is based on the feature.
      * @see #getFeature()
     * @generated
     */
    public Object getValue() {
        switch (getFeature()) {
«IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
        case TEXT:
            return getText();
        case CDATA:
            return getCDATA();
        case COMMENT:
            return getComment();
«ENDIF»
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»
            case «TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»:
                return «memberFeatureAnnotation.getter»();
    «ENDFOR»
            default:
                throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
        }
    }

    /**
     * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      * @param feature the feature to set
      * @param value the value to set in this instance
      * @see #getFeature()
     * @generated
     */
    public void setValue(Feature feature, Object value) {
        switch (feature) {
«IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
        case TEXT:
            setText((String)value);
            break;
        case CDATA:
            setCDATA((String)value);
            break;
        case COMMENT:
            setComment((String)value);
            break;
«ENDIF»
    «FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»
    	«IF memberFeatureAnnotation.generateCode»
            case «TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»:
                «memberFeatureAnnotation.setter»((«memberFeatureAnnotation.itemType»)value);
                break;
    	«ENDIF»
    «ENDFOR»
            default:
            throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
        }
    }
}
    '''
}
