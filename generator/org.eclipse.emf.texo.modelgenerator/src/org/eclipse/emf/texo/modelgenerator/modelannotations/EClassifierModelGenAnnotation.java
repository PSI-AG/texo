/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassifierModelGenAnnotation.java,v 1.12 2011/08/28 12:35:09 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EClassifier Model Gen Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#isGenerateCode <em>Generate Code</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getOwnerEPackageAnnotation <em>Owner EPackage Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface EClassifierModelGenAnnotation extends ENamedElementModelGenAnnotation {
  /**
   * Returns the value of the '<em><b>Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Class Name</em>' attribute.
   * @see #setQualifiedClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_QualifiedClassName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Class Name</em>' attribute.
   * @see #getQualifiedClassName()
   * @generated
   */
  void setQualifiedClassName(String value);

  /**
   * Returns the value of the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Class Name</em>' attribute.
   * @see #setSimpleClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_SimpleClassName()
   * @model unique="false"
   * @generated
   */
  String getSimpleClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Class Name</em>' attribute.
   * @see #getSimpleClassName()
   * @generated
   */
  void setSimpleClassName(String value);

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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_GenerateCode()
   * @model default="true" unique="false" unsettable="true"
   * @generated
   */
  boolean isGenerateCode();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Code</em>' attribute.
   * @see #isSetGenerateCode()
   * @see #unsetGenerateCode()
   * @see #isGenerateCode()
   * @generated
   */
  void setGenerateCode(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenerateCode()
   * @see #isGenerateCode()
   * @see #setGenerateCode(boolean)
   * @generated
   */
  void unsetGenerateCode();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Generate Code</em>' attribute is set.
   * @see #unsetGenerateCode()
   * @see #isGenerateCode()
   * @see #setGenerateCode(boolean)
   * @generated
   */
  boolean isSetGenerateCode();

  /**
   * Returns the value of the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner EPackage Annotation</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner EPackage Annotation</em>' reference.
   * @see #setOwnerEPackageAnnotation(EPackageModelGenAnnotation)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_OwnerEPackageAnnotation()
   * @model ordered="false"
   * @generated
   */
  EPackageModelGenAnnotation getOwnerEPackageAnnotation();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getOwnerEPackageAnnotation <em>Owner EPackage Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner EPackage Annotation</em>' reference.
   * @see #getOwnerEPackageAnnotation()
   * @generated
   */
  void setOwnerEPackageAnnotation(EPackageModelGenAnnotation value);

  EClassifier getEClassifier();

} // EClassifierModelGenAnnotation
