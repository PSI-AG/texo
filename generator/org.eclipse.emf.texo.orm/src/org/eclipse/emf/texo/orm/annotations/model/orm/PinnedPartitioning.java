/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pinned Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* PinnedPartitioning pins requests to a single connection pool.
 * 				*
 * 				* Partitioning can be enabled on an Entity, relationship, query, or
 * 				session/persistence unit.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.PinnedPartitioningPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface PinnedPartitioning {
 * 				String name();
 * 
 * 				/**
 * 				* The connection pool name to pin queries to.
 * 				**
 * 				String connectionPool();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPinnedPartitioning()
 * @model extendedMetaData="name='pinned-partitioning' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface PinnedPartitioning extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Connection Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Pool</em>' attribute.
   * @see #setConnectionPool(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPinnedPartitioning_ConnectionPool()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='connection-pool'"
   * @generated
   */
	String getConnectionPool();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning#getConnectionPool <em>Connection Pool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection Pool</em>' attribute.
   * @see #getConnectionPool()
   * @generated
   */
	void setConnectionPool(String value);

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPinnedPartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // PinnedPartitioning
