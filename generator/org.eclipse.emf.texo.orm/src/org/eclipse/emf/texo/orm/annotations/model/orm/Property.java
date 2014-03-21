/**
 * <copyright>
 * </copyright>
 *
 * $Id: Property.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Property</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				A user defined mapping's property.
 * 				@Target({METHOD, FIELD, TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface Property {
 * 				/**
 * 				* Property name.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* String representation of Property value,
 * 				* converted to an instance of valueType.
 * 				**
 * 				String value();
 * 
 * 				/**
 * 				* Property value type.
 * 				* The value converted to valueType by ConversionManager.
 * 				* If specified must be a simple type that could be handled by
 * 				* ConversionManager:
 * 				* numerical, boolean, temporal.
 * 				**
 * 				Class valueType() default String.class;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getProperty()
 * @model extendedMetaData="name='property' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Property extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getProperty_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getProperty_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see #setValueType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getProperty_ValueType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='value-type'"
   * @generated
   */
  String getValueType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see #getValueType()
   * @generated
   */
  void setValueType(String value);

} // Property
