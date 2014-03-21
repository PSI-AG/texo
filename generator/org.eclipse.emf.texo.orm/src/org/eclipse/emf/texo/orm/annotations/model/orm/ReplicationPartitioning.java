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
 * A representation of the model object '<em><b>Replication Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* ReplicationPartitioning sends requests to a set of connection
 * 				pools.
 * 				* It is for replicating data across a cluster of database machines.
 * 				* Only modification queries are replicated.
 * 				*
 * 				* Partitioning can be enabled on an Entity, relationship, query, or
 * 				session/persistence unit.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.ReplicationPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface ReplicationPartitioning {
 * 				String name();
 * 
 * 				/**
 * 				* (Required) List of connection pool names to load balance across.
 * 				**
 * 				String[] connectionPools();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReplicationPartitioning()
 * @model extendedMetaData="name='replication-partitioning' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ReplicationPartitioning extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Connection Pool</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Pool</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Pool</em>' attribute list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReplicationPartitioning_ConnectionPool()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='connection-pool' namespace='##targetNamespace'"
   * @generated
   */
	EList<String> getConnectionPool();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReplicationPartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // ReplicationPartitioning
