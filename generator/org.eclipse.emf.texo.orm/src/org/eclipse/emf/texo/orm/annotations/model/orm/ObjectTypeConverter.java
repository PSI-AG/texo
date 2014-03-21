/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeConverter.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Type Converter</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface ObjectTypeConverter {
 * 				/**
 * 				* (Required) Name this converter. The name should be unique
 * 				* across the whole persistence unit.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* (Optional) Specify the type stored on the database. The
 * 				* default is inferred from the type of the persistence
 * 				* field or property.
 * 				**
 * 				Class dataType() default void.class;
 * 
 * 				/**
 * 				* (Optional) Specify the type stored on the entity. The
 * 				* default is inferred from the type of the persistent
 * 				* field or property.
 * 				**
 * 				Class objectType() default void.class;
 * 
 * 				/**
 * 				* (Required) Specify the conversion values to be used
 * 				* with the object converter.
 * 				**
 * 				ConversionValue[] conversionValues();
 * 
 * 				/**
 * 				* (Optional) Specify a default object value. Used for
 * 				* legacy data if the data value is missing.
 * 				**
 * 				String defaultObjectValue() default "";
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getConversionValue <em>Conversion Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDefaultObjectValue <em>Default Object Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getObjectTypeConverter()
 * @model extendedMetaData="name='object-type-converter' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ObjectTypeConverter extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Conversion Value</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conversion Value</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conversion Value</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getObjectTypeConverter_ConversionValue()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='conversion-value' namespace='##targetNamespace'"
   * @generated
   */
  EList<ConversionValue> getConversionValue();

  /**
   * Returns the value of the '<em><b>Default Object Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Object Value</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Object Value</em>' attribute.
   * @see #setDefaultObjectValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getObjectTypeConverter_DefaultObjectValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='default-object-value' namespace='##targetNamespace'"
   * @generated
   */
  String getDefaultObjectValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDefaultObjectValue <em>Default Object Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Object Value</em>' attribute.
   * @see #getDefaultObjectValue()
   * @generated
   */
  void setDefaultObjectValue(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getObjectTypeConverter_DataType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='data-type'"
   * @generated
   */
  String getDataType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDataType <em>Data Type</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getObjectTypeConverter_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getObjectTypeConverter_ObjectType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='object-type'"
   * @generated
   */
  String getObjectType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(String value);

} // ObjectTypeConverter
