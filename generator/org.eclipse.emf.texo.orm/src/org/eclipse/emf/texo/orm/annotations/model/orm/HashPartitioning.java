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
 * A representation of the model object '<em><b>Hash Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* HashPartitioning partitions access to a database cluster by the
 * 				hash of a field value from the object,
 * 				* such as the object's location, or tenant.
 * 				* The hash indexes into the list of connection pools.
 * 				* All write or read request for object's with that hash value are
 * 				sent to the server.
 * 				* If a query does not include the field as a parameter, then it can
 * 				either be sent
 * 				* to all server's and unioned, or left to the sesion's default
 * 				behavior.
 * 				*
 * 				* Partitioning can be enabled on an Entity, relationship, query, or
 * 				session/persistence unit.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.HashPartitioningPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface HashPartitioning {
 * 				String name();
 * 
 * 				/**
 * 				* The database column or query parameter to partition queries by.
 * 				* This is the table column name, not the class attribute name.
 * 				* The column value must be included in the query and should normally
 * 				be part of the object's Id.
 * 				* This can also be the name of a query parameter.
 * 				* If a query does not contain the field the query will not be
 * 				partitioned.
 * 				**
 * 				Column partitionColumn();
 * 
 * 				/**
 * 				* List of connection pool names to partition across.
 * 				**
 * 				String[] connectionPools();
 * 
 * 				/**
 * 				* Defines if queries that do not contain the partition field should
 * 				be sent
 * 				* to every database and have the result unioned.
 * 				**
 * 				boolean unionUnpartitionableQueries() default false;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#getPartitionColumn <em>Partition Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getHashPartitioning()
 * @model extendedMetaData="name='hash-partitioning' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface HashPartitioning extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Partition Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partition Column</em>' containment reference.
   * @see #setPartitionColumn(Column)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getHashPartitioning_PartitionColumn()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='partition-column' namespace='##targetNamespace'"
   * @generated
   */
	Column getPartitionColumn();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#getPartitionColumn <em>Partition Column</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partition Column</em>' containment reference.
   * @see #getPartitionColumn()
   * @generated
   */
	void setPartitionColumn(Column value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getHashPartitioning_ConnectionPool()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getHashPartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Union Unpartitionable Queries</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Unpartitionable Queries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Union Unpartitionable Queries</em>' attribute.
   * @see #isSetUnionUnpartitionableQueries()
   * @see #unsetUnionUnpartitionableQueries()
   * @see #setUnionUnpartitionableQueries(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getHashPartitioning_UnionUnpartitionableQueries()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='union-unpartitionable-queries'"
   * @generated
   */
	boolean isUnionUnpartitionableQueries();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union Unpartitionable Queries</em>' attribute.
   * @see #isSetUnionUnpartitionableQueries()
   * @see #unsetUnionUnpartitionableQueries()
   * @see #isUnionUnpartitionableQueries()
   * @generated
   */
	void setUnionUnpartitionableQueries(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetUnionUnpartitionableQueries()
   * @see #isUnionUnpartitionableQueries()
   * @see #setUnionUnpartitionableQueries(boolean)
   * @generated
   */
	void unsetUnionUnpartitionableQueries();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Union Unpartitionable Queries</em>' attribute is set.
   * @see #unsetUnionUnpartitionableQueries()
   * @see #isUnionUnpartitionableQueries()
   * @see #setUnionUnpartitionableQueries(boolean)
   * @generated
   */
	boolean isSetUnionUnpartitionableQueries();

} // HashPartitioning
