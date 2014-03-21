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
 * A representation of the model object '<em><b>Round Robin Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* RoundRobinPartitioning sends requests in a round robin fashion to
 * 				the set of connection pools.
 * 				* It is for load-balancing read queries across a cluster of database
 * 				machines.
 * 				* It requires that the full database be replicated on each machine,
 * 				so does not support partitioning.
 * 				* The data should either be read-only, or writes should be replicated
 * 				on the database.
 * 				*
 * 				* Partitioning can be enabled on an Entity, relationship, query, or
 * 				session/persistence unit.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.RoundRobinPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface RoundRobinPartitioning {
 * 				String name();
 * 
 * 				/**
 * 				* (Required) List of connection pool names to load balance across.
 * 				**
 * 				String[] connectionPools();
 * 
 * 				/**
 * 				* This allows for a set of database to be written to and kept in
 * 				synch,
 * 				* and have reads load-balanced across the databases.
 * 				**
 * 				boolean replicateWrites() default false;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#isReplicateWrites <em>Replicate Writes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRoundRobinPartitioning()
 * @model extendedMetaData="name='round-robin-partitioning' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface RoundRobinPartitioning extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRoundRobinPartitioning_ConnectionPool()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRoundRobinPartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Replicate Writes</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicate Writes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Replicate Writes</em>' attribute.
   * @see #isSetReplicateWrites()
   * @see #unsetReplicateWrites()
   * @see #setReplicateWrites(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRoundRobinPartitioning_ReplicateWrites()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='replicate-writes'"
   * @generated
   */
	boolean isReplicateWrites();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#isReplicateWrites <em>Replicate Writes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replicate Writes</em>' attribute.
   * @see #isSetReplicateWrites()
   * @see #unsetReplicateWrites()
   * @see #isReplicateWrites()
   * @generated
   */
	void setReplicateWrites(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#isReplicateWrites <em>Replicate Writes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetReplicateWrites()
   * @see #isReplicateWrites()
   * @see #setReplicateWrites(boolean)
   * @generated
   */
	void unsetReplicateWrites();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning#isReplicateWrites <em>Replicate Writes</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Replicate Writes</em>' attribute is set.
   * @see #unsetReplicateWrites()
   * @see #isReplicateWrites()
   * @see #setReplicateWrites(boolean)
   * @generated
   */
	boolean isSetReplicateWrites();

} // RoundRobinPartitioning
