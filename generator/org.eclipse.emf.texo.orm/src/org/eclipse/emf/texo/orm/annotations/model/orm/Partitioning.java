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
 * A representation of the model object '<em><b>Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A Partitioning is used to partition the data for a class across
 * 				multiple difference databases
 * 				* or across a database cluster such as Oracle RAC.
 * 				* Partitioning can provide improved scalability by allowing multiple
 * 				database machines to service requests.
 * 				* This annotation configures a custom PartitioningPolicy.
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
 * 				org.eclipse.persistence.descriptors.partitioning.PartitioningPolicy
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface Partitioning {
 * 				String name();
 * 
 * 				/**
 * 				* (Required) Full package.class name of a subclass of
 * 				PartitioningPolicy.
 * 				**
 * 				Class partitioningClass();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPartitioning()
 * @model extendedMetaData="name='partitioning' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Partitioning extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPartitioning_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='class'"
   * @generated
   */
	String getClass_();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
	void setClass(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPartitioning_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // Partitioning
