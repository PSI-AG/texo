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
 * A representation of the model object '<em><b>Union Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* UnionPartitioning sends queries to all connection pools and unions
 * 				the results.
 * 				* This is for queries or relationships that span partitions when
 * 				partitioning is used,
 * 				* such as on a ManyToMany cross partition relationship.
 * 				*
 * 				* Partitioning can be enabled on an Entity, relationship, query, or
 * 				session/persistence unit.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.UnionPartitioningPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface UnionPartitioning {
 * 				String name();
 * 
 * 				/**
 * 				* (Required) List of connection pool names to load balance across.
 * 				**
 * 				String[] connectionPools();
 * 
 * 				/**
 * 				* Defines if write queries should be replicated.
 * 				* Writes are normally not replicated when unioning,
 * 				* but can be for ManyToMany relationships, when the join table needs
 * 				to be replicated.
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
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#isReplicateWrites <em>Replicate Writes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUnionPartitioning()
 * @model extendedMetaData="name='union-partitioning' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface UnionPartitioning extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUnionPartitioning_ConnectionPool()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUnionPartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUnionPartitioning_ReplicateWrites()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='replicate-writes'"
   * @generated
   */
	boolean isReplicateWrites();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#isReplicateWrites <em>Replicate Writes</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#isReplicateWrites <em>Replicate Writes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetReplicateWrites()
   * @see #isReplicateWrites()
   * @see #setReplicateWrites(boolean)
   * @generated
   */
	void unsetReplicateWrites();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning#isReplicateWrites <em>Replicate Writes</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Replicate Writes</em>' attribute is set.
   * @see #unsetReplicateWrites()
   * @see #isReplicateWrites()
   * @see #setReplicateWrites(boolean)
   * @generated
   */
	boolean isSetReplicateWrites();

} // UnionPartitioning
