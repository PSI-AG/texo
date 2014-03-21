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
 * A representation of the model object '<em><b>Range Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* RangePartitioningPolicy partitions access to a database cluster by
 * 				a field value from the object,
 * 				* such as the object's id, location, or tenant.
 * 				* Each server is assigned a range of values.
 * 				* All write or read request for object's with that value are sent to
 * 				the server.
 * 				* If a query does not include the field as a parameter, then it can
 * 				either be sent
 * 				* to all server's and unioned, or left to the sesion's default
 * 				behavior.
 * 				*
 * 				* If multiple partitions are used to process a single transaction,
 * 				JTA should be used for proper XA transaction support.
 * 				*
 * 				* Partitioning can be enabled on an Entity, relationship, query, or
 * 				session/persistence unit.
 * 				* Partition policies are globally named to allow reuse,
 * 				* the partitioning policy must also be set using the @Partitioned
 * 				annotation to be used.
 * 				*
 * 				* @see Partitioned
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.RangePartitioningPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface RangePartitioning {
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
 * 				* (Required) List of connection pool names to load balance across.
 * 				**
 * 				RangePartition[] partitions();
 * 
 * 				/**
 * 				* Defines if queries that do not contain the partition field should
 * 				be sent
 * 				* to every database and have the result unioned.
 * 				**
 * 				boolean unionUnpartitionableQueries() default false;
 * 
 * 				/** The type of the start and end values. **
 * 				Class partitionValueType() default String.class;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getPartitionColumn <em>Partition Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getPartitionValueType <em>Partition Value Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartitioning()
 * @model extendedMetaData="name='range-partitioning' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface RangePartitioning extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartitioning_PartitionColumn()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='partition-column' namespace='##targetNamespace'"
   * @generated
   */
	Column getPartitionColumn();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getPartitionColumn <em>Partition Column</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partition Column</em>' containment reference.
   * @see #getPartitionColumn()
   * @generated
   */
	void setPartitionColumn(Column value);

	/**
   * Returns the value of the '<em><b>Partition</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partition</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartitioning_Partition()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='partition' namespace='##targetNamespace'"
   * @generated
   */
	EList<RangePartition> getPartition();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Partition Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partition Value Type</em>' attribute.
   * @see #setPartitionValueType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartitioning_PartitionValueType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='partition-value-type'"
   * @generated
   */
	String getPartitionValueType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#getPartitionValueType <em>Partition Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partition Value Type</em>' attribute.
   * @see #getPartitionValueType()
   * @generated
   */
	void setPartitionValueType(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartitioning_UnionUnpartitionableQueries()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='union-unpartitionable-queries'"
   * @generated
   */
	boolean isUnionUnpartitionableQueries();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetUnionUnpartitionableQueries()
   * @see #isUnionUnpartitionableQueries()
   * @see #setUnionUnpartitionableQueries(boolean)
   * @generated
   */
	void unsetUnionUnpartitionableQueries();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Union Unpartitionable Queries</em>' attribute is set.
   * @see #unsetUnionUnpartitionableQueries()
   * @see #isUnionUnpartitionableQueries()
   * @see #setUnionUnpartitionableQueries(boolean)
   * @generated
   */
	boolean isSetUnionUnpartitionableQueries();

} // RangePartitioning
