/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapKeyColumn.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Map Key Column</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface MapKeyColumn {
 * 				String name() default "";
 * 				boolean unique() default false;
 * 				boolean nullable() default false;
 * 				boolean insertable() default true;
 * 				boolean updatable() default true;
 * 				String columnDefinition() default "";
 * 				String table() default "";
 * 				int length() default 255;
 * 				int precision() default 0; // decimal precision
 * 				int scale() default 0; // decimal scale
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUpdatable <em>Updatable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn()
 * @model extendedMetaData="name='map-key-column' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface MapKeyColumn extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_ColumnDefinition()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='column-definition'"
   * @generated
   */
  String getColumnDefinition();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getColumnDefinition <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Definition</em>' attribute.
   * @see #getColumnDefinition()
   * @generated
   */
  void setColumnDefinition(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Insertable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='insertable'"
   * @generated
   */
  boolean isInsertable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isInsertable <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Insertable</em>' attribute.
   * @see #isSetInsertable()
   * @see #unsetInsertable()
   * @see #isInsertable()
   * @generated
   */
  void setInsertable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isInsertable <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetInsertable()
   * @see #isInsertable()
   * @see #setInsertable(boolean)
   * @generated
   */
  void unsetInsertable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isInsertable <em>Insertable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Insertable</em>' attribute is set.
   * @see #unsetInsertable()
   * @see #isInsertable()
   * @see #setInsertable(boolean)
   * @generated
   */
  boolean isSetInsertable();

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #isSetLength()
   * @see #unsetLength()
   * @see #setLength(int)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Length()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='attribute' name='length'"
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #isSetLength()
   * @see #unsetLength()
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetLength()
   * @see #getLength()
   * @see #setLength(int)
   * @generated
   */
  void unsetLength();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getLength <em>Length</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Length</em>' attribute is set.
   * @see #unsetLength()
   * @see #getLength()
   * @see #setLength(int)
   * @generated
   */
  boolean isSetLength();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Nullable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='nullable'"
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isSetNullable()
   * @see #unsetNullable()
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNullable()
   * @see #isNullable()
   * @see #setNullable(boolean)
   * @generated
   */
  void unsetNullable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isNullable <em>Nullable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Nullable</em>' attribute is set.
   * @see #unsetNullable()
   * @see #isNullable()
   * @see #setNullable(boolean)
   * @generated
   */
  boolean isSetNullable();

  /**
   * Returns the value of the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precision</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precision</em>' attribute.
   * @see #isSetPrecision()
   * @see #unsetPrecision()
   * @see #setPrecision(int)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Precision()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='attribute' name='precision'"
   * @generated
   */
  int getPrecision();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Precision</em>' attribute.
   * @see #isSetPrecision()
   * @see #unsetPrecision()
   * @see #getPrecision()
   * @generated
   */
  void setPrecision(int value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPrecision()
   * @see #getPrecision()
   * @see #setPrecision(int)
   * @generated
   */
  void unsetPrecision();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getPrecision <em>Precision</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Precision</em>' attribute is set.
   * @see #unsetPrecision()
   * @see #getPrecision()
   * @see #setPrecision(int)
   * @generated
   */
  boolean isSetPrecision();

  /**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #isSetScale()
   * @see #unsetScale()
   * @see #setScale(int)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Scale()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='attribute' name='scale'"
   * @generated
   */
  int getScale();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #isSetScale()
   * @see #unsetScale()
   * @see #getScale()
   * @generated
   */
  void setScale(int value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetScale()
   * @see #getScale()
   * @see #setScale(int)
   * @generated
   */
  void unsetScale();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getScale <em>Scale</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Scale</em>' attribute is set.
   * @see #unsetScale()
   * @see #getScale()
   * @see #setScale(int)
   * @generated
   */
  boolean isSetScale();

  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Table()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='table'"
   * @generated
   */
  String getTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
  void setTable(String value);

  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #isSetUnique()
   * @see #unsetUnique()
   * @see #setUnique(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Unique()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='unique'"
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isSetUnique()
   * @see #unsetUnique()
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetUnique()
   * @see #isUnique()
   * @see #setUnique(boolean)
   * @generated
   */
  void unsetUnique();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUnique <em>Unique</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Unique</em>' attribute is set.
   * @see #unsetUnique()
   * @see #isUnique()
   * @see #setUnique(boolean)
   * @generated
   */
  boolean isSetUnique();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMapKeyColumn_Updatable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='updatable'"
   * @generated
   */
  boolean isUpdatable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUpdatable <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Updatable</em>' attribute.
   * @see #isSetUpdatable()
   * @see #unsetUpdatable()
   * @see #isUpdatable()
   * @generated
   */
  void setUpdatable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUpdatable <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetUpdatable()
   * @see #isUpdatable()
   * @see #setUpdatable(boolean)
   * @generated
   */
  void unsetUpdatable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUpdatable <em>Updatable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Updatable</em>' attribute is set.
   * @see #unsetUpdatable()
   * @see #isUpdatable()
   * @see #setUpdatable(boolean)
   * @generated
   */
  boolean isSetUpdatable();

} // MapKeyColumn
