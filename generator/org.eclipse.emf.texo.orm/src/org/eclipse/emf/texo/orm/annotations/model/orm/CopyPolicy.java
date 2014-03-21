/**
 * <copyright>
 * </copyright>
 *
 * $Id: CopyPolicy.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Copy Policy</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				/**
 * 				* A CopyPolicy is used to set a
 * 				* org.eclipse.persistence.descriptors.copying.CopyPolicy on an
 * 				Entity.
 * 				* It is required that a class that implements
 * 				* org.eclipse.persistence.descriptors.copying.CopyPolicy be specified
 * 				* as the argument.
 * 				*
 * 				* A CopyPolicy should be specified on an Entity, MappedSuperclass or
 * 				* Embeddable.
 * 				*
 * 				* For instance:
 * 				* @Entity
 * 				* @CopyPolicy("example.MyCopyPolicy")
 * 				**
 * 				public @interface CopyPolicy {
 * 
 * 				/*
 * 				* (Required)
 * 				* This defines the class of the copy policy. It must specify a class
 * 				* that implements
 * 				org.eclipse.persistence.descriptors.copying.CopyPolicy
 * 				**
 * 				Class value();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCopyPolicy()
 * @model extendedMetaData="name='copy-policy' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface CopyPolicy extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCopyPolicy_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='class'"
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

} // CopyPolicy
