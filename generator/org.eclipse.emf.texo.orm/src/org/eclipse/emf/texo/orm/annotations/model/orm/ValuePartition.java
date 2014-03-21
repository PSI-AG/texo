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
 * A representation of the model object '<em><b>Value Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Represent a specific value partition.
 * 				* The value will be routed to the connection pool.
 * 				*
 * 				* @see ValuePartitioningPolicy
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.ValuePartitioningPolicy
 * 				* @see
 * 				org.eclipse.persistence.descriptors.partitioning.ValuePartition
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface ValuePartition {
 * 				/** The String representation of the range start value. **
 * 				String value() default "";
 * 
 * 				/** The connection pool to route queries to for this value. **
 * 				String connectionPool();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartition#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getValuePartition()
 * @model extendedMetaData="name='value-partition' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ValuePartition extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getValuePartition_ConnectionPool()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='connection-pool'"
   * @generated
   */
	String getConnectionPool();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartition#getConnectionPool <em>Connection Pool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection Pool</em>' attribute.
   * @see #getConnectionPool()
   * @generated
   */
	void setConnectionPool(String value);

	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getValuePartition_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
	String getValue();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(String value);

} // ValuePartition
