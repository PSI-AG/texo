/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptimisticLocking.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Optimistic Locking</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * * * An optimistic-locking element is used to specify the type of * optimistic locking EclipseLink should use when
 * updating or deleting * entities. An optimistic-locking specification is supported on * an entity or
 * mapped-superclass. * * It is used in conjunction with the optimistic-locking-type. *
 * 
 * @Target({TYPE )
 * @Retention(RUNTIME) public @interface OptimisticLocking { * * (Optional) The type of optimistic locking policy to
 *                     use. * OptimisticLockingType type() default VERSION_COLUMN;
 * 
 *                     * * (Optional) For an optimistic locking policy of type * SELECTED_COLUMNS, this annotation
 *                     member becomes a (Required) * field. * Column[] selectedColumns() default {};
 * 
 *                     * * (Optional) Specify where the optimistic locking policy should * cascade lock. Currently only
 *                     supported with VERSION_COLUMN locking. * boolean cascade() default false; }
 * 
 * 
 *                     <!-- end-model-doc -->
 * 
 *                     <p>
 *                     The following features are supported:
 *                     <ul>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getSelectedColumn
 *                     <em>Selected Column</em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#isCascade <em>Cascade
 *                     </em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getType <em>Type
 *                     </em>}</li>
 *                     </ul>
 *                     </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOptimisticLocking()
 * @model extendedMetaData="name='optimistic-locking' kind='elementOnly'"
 * @generated
 */
public interface OptimisticLocking extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Selected Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected Column</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOptimisticLocking_SelectedColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='selected-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<Column> getSelectedColumn();

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' attribute.
   * @see #isSetCascade()
   * @see #unsetCascade()
   * @see #setCascade(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOptimisticLocking_Cascade()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='cascade'"
   * @generated
   */
  boolean isCascade();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#isCascade <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' attribute.
   * @see #isSetCascade()
   * @see #unsetCascade()
   * @see #isCascade()
   * @generated
   */
  void setCascade(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#isCascade <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCascade()
   * @see #isCascade()
   * @see #setCascade(boolean)
   * @generated
   */
  void unsetCascade();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#isCascade <em>Cascade</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Cascade</em>' attribute is set.
   * @see #unsetCascade()
   * @see #isCascade()
   * @see #setCascade(boolean)
   * @generated
   */
  boolean isSetCascade();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(OptimisticLockingType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOptimisticLocking_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  OptimisticLockingType getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(OptimisticLockingType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(OptimisticLockingType)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(OptimisticLockingType)
   * @generated
   */
  boolean isSetType();

} // OptimisticLocking
