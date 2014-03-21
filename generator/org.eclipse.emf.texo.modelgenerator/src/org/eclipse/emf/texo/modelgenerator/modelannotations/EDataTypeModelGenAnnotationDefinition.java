/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDataTypeModelGenAnnotationDefinition.java,v 1.5 2011/08/28 12:35:09 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EData Type Model Gen Annotation Definition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getObjectClassName <em>Object Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isEnum <em>Enum</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isDateType <em>Date Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isAutomaticStringConversion <em>Automatic String Conversion</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getBaseTypeAnnotation <em>Base Type Annotation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface EDataTypeModelGenAnnotationDefinition extends EClassifierModelGenAnnotation {
  /**
   * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Class Name</em>' attribute.
   * @see #setInstanceClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_InstanceClassName()
   * @model unique="false" transient="true"
   * @generated
   */
  String getInstanceClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getInstanceClassName <em>Instance Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Class Name</em>' attribute.
   * @see #getInstanceClassName()
   * @generated
   */
  void setInstanceClassName(String value);

  /**
   * Returns the value of the '<em><b>Object Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Class Name</em>' attribute.
   * @see #setObjectClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_ObjectClassName()
   * @model unique="false" transient="true"
   * @generated
   */
  String getObjectClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getObjectClassName <em>Object Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Class Name</em>' attribute.
   * @see #getObjectClassName()
   * @generated
   */
  void setObjectClassName(String value);

  /**
   * Returns the value of the '<em><b>Enum</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enum</em>' attribute.
   * @see #isSetEnum()
   * @see #unsetEnum()
   * @see #setEnum(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_Enum()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  boolean isEnum();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #isSetEnum()
   * @see #unsetEnum()
   * @see #isEnum()
   * @generated
   */
  void setEnum(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnum()
   * @see #isEnum()
   * @see #setEnum(boolean)
   * @generated
   */
  void unsetEnum();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isEnum <em>Enum</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enum</em>' attribute is set.
   * @see #unsetEnum()
   * @see #isEnum()
   * @see #setEnum(boolean)
   * @generated
   */
  boolean isSetEnum();

  /**
   * Returns the value of the '<em><b>Date Type</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Date Type</em>' attribute.
   * @see #isSetDateType()
   * @see #unsetDateType()
   * @see #setDateType(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_DateType()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  boolean isDateType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isDateType <em>Date Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Type</em>' attribute.
   * @see #isSetDateType()
   * @see #unsetDateType()
   * @see #isDateType()
   * @generated
   */
  void setDateType(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isDateType <em>Date Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDateType()
   * @see #isDateType()
   * @see #setDateType(boolean)
   * @generated
   */
  void unsetDateType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isDateType <em>Date Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Date Type</em>' attribute is set.
   * @see #unsetDateType()
   * @see #isDateType()
   * @see #setDateType(boolean)
   * @generated
   */
  boolean isSetDateType();

  /**
   * Returns the value of the '<em><b>Automatic String Conversion</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Automatic String Conversion</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Automatic String Conversion</em>' attribute.
   * @see #isSetAutomaticStringConversion()
   * @see #unsetAutomaticStringConversion()
   * @see #setAutomaticStringConversion(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_AutomaticStringConversion()
   * @model default="false" unsettable="true"
   * @generated
   */
  boolean isAutomaticStringConversion();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isAutomaticStringConversion <em>Automatic String Conversion</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Automatic String Conversion</em>' attribute.
   * @see #isSetAutomaticStringConversion()
   * @see #unsetAutomaticStringConversion()
   * @see #isAutomaticStringConversion()
   * @generated
   */
  void setAutomaticStringConversion(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isAutomaticStringConversion <em>Automatic String Conversion</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAutomaticStringConversion()
   * @see #isAutomaticStringConversion()
   * @see #setAutomaticStringConversion(boolean)
   * @generated
   */
  void unsetAutomaticStringConversion();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isAutomaticStringConversion <em>Automatic String Conversion</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Automatic String Conversion</em>' attribute is set.
   * @see #unsetAutomaticStringConversion()
   * @see #isAutomaticStringConversion()
   * @see #setAutomaticStringConversion(boolean)
   * @generated
   */
  boolean isSetAutomaticStringConversion();

  /**
   * Returns the value of the '<em><b>Base Type Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type Annotation</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type Annotation</em>' reference.
   * @see #setBaseTypeAnnotation(EDataTypeModelGenAnnotationDefinition)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_BaseTypeAnnotation()
   * @model transient="true"
   * @generated
   */
  EDataTypeModelGenAnnotationDefinition getBaseTypeAnnotation();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getBaseTypeAnnotation <em>Base Type Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type Annotation</em>' reference.
   * @see #getBaseTypeAnnotation()
   * @generated
   */
  void setBaseTypeAnnotation(EDataTypeModelGenAnnotationDefinition value);

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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_ItemType()
   * @model unique="false" unsettable="true" required="true" transient="true"
   * @generated
   */
  String getItemType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getItemType <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Type</em>' attribute.
   * @see #isSetItemType()
   * @see #unsetItemType()
   * @see #getItemType()
   * @generated
   */
  void setItemType(String value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getItemType <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetItemType()
   * @see #getItemType()
   * @see #setItemType(String)
   * @generated
   */
  void unsetItemType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getItemType <em>Item Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Item Type</em>' attribute is set.
   * @see #unsetItemType()
   * @see #getItemType()
   * @see #setItemType(String)
   * @generated
   */
  boolean isSetItemType();

  EDataType getEDataType();

} // EDataTypeModelGenAnnotationDefinition
