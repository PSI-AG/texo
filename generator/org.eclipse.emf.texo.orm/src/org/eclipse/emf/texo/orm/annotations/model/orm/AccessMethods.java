/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccessMethods.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Access Methods</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getGetMethod <em>Get Method</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getSetMethod <em>Set Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAccessMethods()
 * @model extendedMetaData="name='access-methods' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface AccessMethods extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Get Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Method</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Method</em>' attribute.
   * @see #setGetMethod(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAccessMethods_GetMethod()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='get-method'"
   * @generated
   */
  String getGetMethod();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getGetMethod <em>Get Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Method</em>' attribute.
   * @see #getGetMethod()
   * @generated
   */
  void setGetMethod(String value);

  /**
   * Returns the value of the '<em><b>Set Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Method</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Method</em>' attribute.
   * @see #setSetMethod(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAccessMethods_SetMethod()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='set-method'"
   * @generated
   */
  String getSetMethod();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getSetMethod <em>Set Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Method</em>' attribute.
   * @see #getSetMethod()
   * @generated
   */
  void setSetMethod(String value);

} // AccessMethods
