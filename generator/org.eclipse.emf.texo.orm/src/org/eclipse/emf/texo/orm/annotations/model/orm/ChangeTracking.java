/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChangeTracking.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Change Tracking</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* The ChangeTracking annotation is used to specify the
 * 				*
 * 				org.eclipse.persistence.descriptors.changetracking.ObjectChangePolicy
 * 				* which computes changes sets for EclipseLink's UnitOfWork commit
 * 				* process. An ObjectChangePolicy is stored on an Entity's descriptor.
 * 				*
 * 				* A ChangeTracking annotation may be specified on an Entity,
 * 				* MappedSuperclass or Embeddable.
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface ChangeTracking {
 * 				/**
 * 				* (Optional) The type of change tracking to use.
 * 				**
 * 				ChangeTrackingType value() default AUTO;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getChangeTracking()
 * @model extendedMetaData="name='change-tracking' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ChangeTracking extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(ChangeTrackingType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getChangeTracking_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  ChangeTrackingType getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(ChangeTrackingType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(ChangeTrackingType)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(ChangeTrackingType)
   * @generated
   */
  boolean isSetType();

} // ChangeTracking
