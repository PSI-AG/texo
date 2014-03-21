/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.math.BigInteger;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch Fetch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				/**
 * 				* A BatchFetch annotation can be used on any relationship mapping,
 * 				* (OneToOne, ManyToOne, OneToMany, ManyToMany, ElementCollection,
 * 				BasicCollection, BasicMap).
 * 				* It allows the related objects to be batch read in a single query.
 * 				* Batch fetching can also be set at the query level, and it is
 * 				* normally recommended to do so as all queries may not require
 * 				batching.
 * 				*
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.1
 * 				**
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface BatchFetch {
 * 				/**
 * 				* (Optional) The type of batch-fetch to use.
 * 				* Either JOIN, EXISTS or IN.
 * 				* JOIN is the default.
 * 				**
 * 				BatchFetchType value() default BatchFetchType.JOIN;
 * 
 * 				/**
 * 				* Define the default batch fetch size.
 * 				* This is only used for IN type batch reading and defines
 * 				* the number of keys used in each IN clause.
 * 				* The default size is 256, or the query's pageSize for cursor
 * 				queries.
 * 				**
 * 				int size() default -1;
 * 				}
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBatchFetch()
 * @model extendedMetaData="name='batch-fetch' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface BatchFetch extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBatchFetch_Size()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='size'"
   * @generated
   */
	BigInteger getSize();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
	void setSize(BigInteger value);

	/**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetchType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetchType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(BatchFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBatchFetch_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
	BatchFetchType getType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetchType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
	void setType(BatchFetchType value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(BatchFetchType)
   * @generated
   */
	void unsetType();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(BatchFetchType)
   * @generated
   */
	boolean isSetType();

} // BatchFetch
