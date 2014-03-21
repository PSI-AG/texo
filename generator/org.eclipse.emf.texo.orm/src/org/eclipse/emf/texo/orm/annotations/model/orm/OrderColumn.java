/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderColumn.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Order Column</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface OrderColumn {
 * 				String name() default "";
 * 				boolean nullable() default true;
 * 				boolean insertable() default true;
 * 				boolean updatable() default true;
 * 				String columnDefinition() default "";
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getCorrectionType <em>Correction Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isUpdatable <em>Updatable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn()
 * @model extendedMetaData="name='order-column' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface OrderColumn extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Definition</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Definition</em>' attribute.
   * @see #setColumnDefinition(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn_ColumnDefinition()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='column-definition'"
   * @generated
   */
  String getColumnDefinition();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getColumnDefinition <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Definition</em>' attribute.
   * @see #getColumnDefinition()
   * @generated
   */
  void setColumnDefinition(String value);

  /**
   * Returns the value of the '<em><b>Correction Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Correction Type</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Correction Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType
   * @see #isSetCorrectionType()
   * @see #unsetCorrectionType()
   * @see #setCorrectionType(OrderColumnCorrectionType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn_CorrectionType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='correction-type'"
   * @generated
   */
  OrderColumnCorrectionType getCorrectionType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getCorrectionType <em>Correction Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Correction Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType
   * @see #isSetCorrectionType()
   * @see #unsetCorrectionType()
   * @see #getCorrectionType()
   * @generated
   */
  void setCorrectionType(OrderColumnCorrectionType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getCorrectionType <em>Correction Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCorrectionType()
   * @see #getCorrectionType()
   * @see #setCorrectionType(OrderColumnCorrectionType)
   * @generated
   */
  void unsetCorrectionType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getCorrectionType <em>Correction Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Correction Type</em>' attribute is set.
   * @see #unsetCorrectionType()
   * @see #getCorrectionType()
   * @see #setCorrectionType(OrderColumnCorrectionType)
   * @generated
   */
  boolean isSetCorrectionType();

  /**
   * Returns the value of the '<em><b>Insertable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertable</em>' attribute.
   * @see #isSetInsertable()
   * @see #unsetInsertable()
   * @see #setInsertable(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn_Insertable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='insertable'"
   * @generated
   */
  boolean isInsertable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isInsertable <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Insertable</em>' attribute.
   * @see #isSetInsertable()
   * @see #unsetInsertable()
   * @see #isInsertable()
   * @generated
   */
  void setInsertable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isInsertable <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetInsertable()
   * @see #isInsertable()
   * @see #setInsertable(boolean)
   * @generated
   */
  void unsetInsertable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isInsertable <em>Insertable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Insertable</em>' attribute is set.
   * @see #unsetInsertable()
   * @see #isInsertable()
   * @see #setInsertable(boolean)
   * @generated
   */
  boolean isSetInsertable();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #isSetNullable()
   * @see #unsetNullable()
   * @see #setNullable(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn_Nullable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='nullable'"
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isSetNullable()
   * @see #unsetNullable()
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNullable()
   * @see #isNullable()
   * @see #setNullable(boolean)
   * @generated
   */
  void unsetNullable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isNullable <em>Nullable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Nullable</em>' attribute is set.
   * @see #unsetNullable()
   * @see #isNullable()
   * @see #setNullable(boolean)
   * @generated
   */
  boolean isSetNullable();

  /**
   * Returns the value of the '<em><b>Updatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updatable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updatable</em>' attribute.
   * @see #isSetUpdatable()
   * @see #unsetUpdatable()
   * @see #setUpdatable(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumn_Updatable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='updatable'"
   * @generated
   */
  boolean isUpdatable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isUpdatable <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Updatable</em>' attribute.
   * @see #isSetUpdatable()
   * @see #unsetUpdatable()
   * @see #isUpdatable()
   * @generated
   */
  void setUpdatable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isUpdatable <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetUpdatable()
   * @see #isUpdatable()
   * @see #setUpdatable(boolean)
   * @generated
   */
  void unsetUpdatable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isUpdatable <em>Updatable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Updatable</em>' attribute is set.
   * @see #unsetUpdatable()
   * @see #isUpdatable()
   * @see #setUpdatable(boolean)
   * @generated
   */
  boolean isSetUpdatable();

} // OrderColumn
