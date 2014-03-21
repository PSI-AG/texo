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
 * A representation of the model object '<em><b>Range Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Represent a specific range partition.
 * 				* Values = startValue and = endValue will be routed to the connection
 * 				pool.
 * 				*
 * 				* @see RangePartitioningPolicy
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.RangePartitioningPolicy
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.RangePartition
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface RangePartition {
 * 				/** The String representation of the range start value. **
 * 				String startValue() default "";
 * 				/** The String representation of the range start value. **
 * 				String endValue() default "";
 * 				/** The connection pool to route queries to for this range. **
 * 				String connectionPool();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition#getEndValue <em>End Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition#getStartValue <em>Start Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartition()
 * @model extendedMetaData="name='range-partition' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface RangePartition extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartition_ConnectionPool()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='connection-pool'"
   * @generated
   */
	String getConnectionPool();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition#getConnectionPool <em>Connection Pool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection Pool</em>' attribute.
   * @see #getConnectionPool()
   * @generated
   */
	void setConnectionPool(String value);

	/**
   * Returns the value of the '<em><b>End Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>End Value</em>' attribute.
   * @see #setEndValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartition_EndValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='end-value'"
   * @generated
   */
	String getEndValue();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition#getEndValue <em>End Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Value</em>' attribute.
   * @see #getEndValue()
   * @generated
   */
	void setEndValue(String value);

	/**
   * Returns the value of the '<em><b>Start Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Start Value</em>' attribute.
   * @see #setStartValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getRangePartition_StartValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='start-value'"
   * @generated
   */
	String getStartValue();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition#getStartValue <em>Start Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Value</em>' attribute.
   * @see #getStartValue()
   * @generated
   */
	void setStartValue(String value);

} // RangePartition
