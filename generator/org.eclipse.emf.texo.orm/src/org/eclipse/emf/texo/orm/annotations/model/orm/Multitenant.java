/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multitenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface Multitenant {
 * 				/**
 * 				* (Optional) Specify the multi-tenant strategy to use.
 * 				**
 * 				MultitenantType value() default MultitenantType.SINGLE_TABLE;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant#getTenantDiscriminator <em>Tenant Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMultitenant()
 * @model extendedMetaData="name='multitenant' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Multitenant extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Tenant Discriminator</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Discriminator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Tenant Discriminator</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMultitenant_TenantDiscriminator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='tenant-discriminator' namespace='##targetNamespace'"
   * @generated
   */
	EList<TenantDiscriminator> getTenantDiscriminator();

	/**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.MultitenantType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MultitenantType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(MultitenantType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMultitenant_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
	MultitenantType getType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MultitenantType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
	void setType(MultitenantType value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(MultitenantType)
   * @generated
   */
	void unsetType();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(MultitenantType)
   * @generated
   */
	boolean isSetType();

} // Multitenant
