/**
 * <copyright>
 * </copyright>
 *
 * $Id: EStructuralFeatureModelGenAnnotation.java,v 1.13 2011/08/28 12:35:09 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EStructural Feature Model Gen Annotation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getValidJavaMemberName <em>Valid Java Member Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isGenerateCode <em>Generate Code</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapQualifiedClassName <em>Feature Map Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapSimpleClassName <em>Feature Map Simple Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature <em>Feature Map Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures <em>Member Feature Map Features</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isUseList <em>Use List</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getOwnerEClassAnnotation <em>Owner EClass Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface EStructuralFeatureModelGenAnnotation extends ENamedElementModelGenAnnotation {
  /**
   * Returns the value of the '<em><b>Getter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getter</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getter</em>' attribute.
   * @see #setGetter(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Getter()
   * @model unique="false"
   * @generated
   */
  String getGetter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getGetter <em>Getter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Getter</em>' attribute.
   * @see #getGetter()
   * @generated
   */
  void setGetter(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Type()
   * @model unique="false" transient="true"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' attribute.
   * @see #setObjectType(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_ObjectType()
   * @model unique="false" transient="true"
   * @generated
   */
  String getObjectType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(String value);

  /**
   * Returns the value of the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Type</em>' attribute.
   * @see #isSetItemType()
   * @see #unsetItemType()
   * @see #setItemType(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_ItemType()
   * @model unique="false" unsettable="true" transient="true"
   * @generated
   */
  String getItemType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Type</em>' attribute.
   * @see #isSetItemType()
   * @see #unsetItemType()
   * @see #getItemType()
   * @generated
   */
  void setItemType(String value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetItemType()
   * @see #getItemType()
   * @see #setItemType(String)
   * @generated
   */
  void unsetItemType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getItemType <em>Item Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Item Type</em>' attribute is set.
   * @see #unsetItemType()
   * @see #getItemType()
   * @see #setItemType(String)
   * @generated
   */
  boolean isSetItemType();

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_DefaultValue()
   * @model unique="false"
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

  /**
   * Returns the value of the '<em><b>Setter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setter</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setter</em>' attribute.
   * @see #setSetter(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Setter()
   * @model unique="false"
   * @generated
   */
  String getSetter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getSetter <em>Setter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Setter</em>' attribute.
   * @see #getSetter()
   * @generated
   */
  void setSetter(String value);

  /**
   * Returns the value of the '<em><b>Valid Java Member Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valid Java Member Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid Java Member Name</em>' attribute.
   * @see #setValidJavaMemberName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_ValidJavaMemberName()
   * @model unique="false"
   * @generated
   */
  String getValidJavaMemberName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getValidJavaMemberName <em>Valid Java Member Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid Java Member Name</em>' attribute.
   * @see #getValidJavaMemberName()
   * @generated
   */
  void setValidJavaMemberName(String value);

  /**
   * Returns the value of the '<em><b>Generate Code</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Code</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Generate Code</em>' attribute.
   * @see #isSetGenerateCode()
   * @see #unsetGenerateCode()
   * @see #setGenerateCode(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_GenerateCode()
   * @model default="true" unsettable="true"
   * @generated
   */
  boolean isGenerateCode();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Code</em>' attribute.
   * @see #isSetGenerateCode()
   * @see #unsetGenerateCode()
   * @see #isGenerateCode()
   * @generated
   */
  void setGenerateCode(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenerateCode()
   * @see #isGenerateCode()
   * @see #setGenerateCode(boolean)
   * @generated
   */
  void unsetGenerateCode();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Generate Code</em>' attribute is set.
   * @see #unsetGenerateCode()
   * @see #isGenerateCode()
   * @see #setGenerateCode(boolean)
   * @generated
   */
  boolean isSetGenerateCode();

  /**
   * Returns the value of the '<em><b>Feature Map Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Qualified Class Name</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Qualified Class Name</em>' attribute.
   * @see #setFeatureMapQualifiedClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_FeatureMapQualifiedClassName()
   * @model unique="false"
   * @generated
   */
  String getFeatureMapQualifiedClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapQualifiedClassName <em>Feature Map Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Qualified Class Name</em>' attribute.
   * @see #getFeatureMapQualifiedClassName()
   * @generated
   */
  void setFeatureMapQualifiedClassName(String value);

  /**
   * Returns the value of the '<em><b>Feature Map Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Simple Class Name</em>' attribute isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Simple Class Name</em>' attribute.
   * @see #setFeatureMapSimpleClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_FeatureMapSimpleClassName()
   * @model unique="false"
   * @generated
   */
  String getFeatureMapSimpleClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapSimpleClassName <em>Feature Map Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Simple Class Name</em>' attribute.
   * @see #getFeatureMapSimpleClassName()
   * @generated
   */
  void setFeatureMapSimpleClassName(String value);

  /**
   * Returns the value of the '<em><b>Feature Map Feature</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures <em>Member Feature Map Features</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Feature</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Feature</em>' reference.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_FeatureMapFeature()
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures
   * @model opposite="memberFeatureMapFeatures" transient="true" changeable="false"
   * @generated
   */
  EStructuralFeatureModelGenAnnotation getFeatureMapFeature();

  /**
   * Returns the value of the '<em><b>Member Feature Map Features</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation}.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature <em>Feature Map Feature</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Feature Map Features</em>' reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Feature Map Features</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_MemberFeatureMapFeatures()
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature
   * @model opposite="featureMapFeature" transient="true" changeable="false"
   * @generated
   */
  EList<EStructuralFeatureModelGenAnnotation> getMemberFeatureMapFeatures();

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Many</em>' attribute.
   * @see #isSetMany()
   * @see #unsetMany()
   * @see #setMany(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Many()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isSetMany()
   * @see #unsetMany()
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMany()
   * @see #isMany()
   * @see #setMany(boolean)
   * @generated
   */
  void unsetMany();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isMany <em>Many</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Many</em>' attribute is set.
   * @see #unsetMany()
   * @see #isMany()
   * @see #setMany(boolean)
   * @generated
   */
  boolean isSetMany();

  /**
   * Returns the value of the '<em><b>Use List</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use List</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Use List</em>' attribute.
   * @see #isSetUseList()
   * @see #unsetUseList()
   * @see #setUseList(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_UseList()
   * @model default="true" unique="false" unsettable="true"
   * @generated
   */
  boolean isUseList();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isUseList <em>Use List</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Use List</em>' attribute.
   * @see #isSetUseList()
   * @see #unsetUseList()
   * @see #isUseList()
   * @generated
   */
  void setUseList(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isUseList <em>Use List</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetUseList()
   * @see #isUseList()
   * @see #setUseList(boolean)
   * @generated
   */
  void unsetUseList();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isUseList <em>Use List</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Use List</em>' attribute is set.
   * @see #unsetUseList()
   * @see #isUseList()
   * @see #setUseList(boolean)
   * @generated
   */
  boolean isSetUseList();

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #isSetReference()
   * @see #unsetReference()
   * @see #setReference(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Reference()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #isSetReference()
   * @see #unsetReference()
   * @see #isReference()
   * @generated
   */
  void setReference(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReference()
   * @see #isReference()
   * @see #setReference(boolean)
   * @generated
   */
  void unsetReference();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isReference <em>Reference</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Reference</em>' attribute is set.
   * @see #unsetReference()
   * @see #isReference()
   * @see #setReference(boolean)
   * @generated
   */
  boolean isSetReference();

  /**
   * Returns the value of the '<em><b>Owner EClass Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner EClass Annotation</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner EClass Annotation</em>' reference.
   * @see #setOwnerEClassAnnotation(EClassModelGenAnnotation)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_OwnerEClassAnnotation()
   * @model
   * @generated
   */
  EClassModelGenAnnotation getOwnerEClassAnnotation();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getOwnerEClassAnnotation <em>Owner EClass Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner EClass Annotation</em>' reference.
   * @see #getOwnerEClassAnnotation()
   * @generated
   */
  void setOwnerEClassAnnotation(EClassModelGenAnnotation value);

  // note can be defined in the model because it gives clashes in subtypes
  EStructuralFeature getEStructuralFeature();

  /**
   * @return the member features of this EStructuralFeatures and the member features of the member features, recursively
   */
  List<EStructuralFeatureModelGenAnnotation> getAllMemberFeatureMapFeatures();

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#
   * collectMemberFeatures(java.util.List)
   */
  void collectMemberFeatures(List<EStructuralFeatureModelGenAnnotation> collectedFeatureAnnotations);

} // EStructuralFeatureModelGenAnnotation
