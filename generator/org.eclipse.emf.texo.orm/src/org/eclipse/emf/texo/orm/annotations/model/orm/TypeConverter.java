/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeConverter.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Type Converter</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface TypeConverter {
 * 				/**
 * 				* (Required) Name this converter. The name should be unique
 * 				* across the whole persistence unit.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* (Optional) Specify the type stored on the database. The
 * 				* default is inferred from the type of the persistence field
 * 				* or property.
 * 				**
 * 				Class dataType() default void.class;
 * 
 * 				/**
 * 				* (Optional) Specify the type stored on the entity. The
 * 				* default is inferred from the type of the persistent field
 * 				* or property.
 * 				**
 * 				Class objectType() default void.class;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTypeConverter()
 * @model extendedMetaData="name='type-converter' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface TypeConverter extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' attribute.
   * @see #setDataType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTypeConverter_DataType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='data-type'"
   * @generated
   */
  String getDataType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getDataType <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' attribute.
   * @see #getDataType()
   * @generated
   */
  void setDataType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTypeConverter_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' attribute.
   * @see #setObjectType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTypeConverter_ObjectType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='object-type'"
   * @generated
   */
  String getObjectType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(String value);

} // TypeConverter
