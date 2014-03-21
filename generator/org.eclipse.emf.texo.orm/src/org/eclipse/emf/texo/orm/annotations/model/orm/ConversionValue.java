/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConversionValue.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Conversion Value</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({ )
 * @Retention(RUNTIME) public @interface ConversionValue { * * (Required) Specify the database value. * String
 *                     dataValue();
 * 
 *                     * * (Required) Specify the object value. * String objectValue(); }
 * 
 * 
 *                     <!-- end-model-doc -->
 * 
 *                     <p>
 *                     The following features are supported:
 *                     <ul>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getDataValue <em>Data
 *                     Value</em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getObjectValue <em>
 *                     Object Value</em>}</li>
 *                     </ul>
 *                     </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getConversionValue()
 * @model extendedMetaData="name='conversion-value' kind='empty'"
 * @generated
 */
public interface ConversionValue extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Data Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Value</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Value</em>' attribute.
   * @see #setDataValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getConversionValue_DataValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='data-value'"
   * @generated
   */
  String getDataValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getDataValue <em>Data Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Value</em>' attribute.
   * @see #getDataValue()
   * @generated
   */
  void setDataValue(String value);

  /**
   * Returns the value of the '<em><b>Object Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Value</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Value</em>' attribute.
   * @see #setObjectValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getConversionValue_ObjectValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='object-value'"
   * @generated
   */
  String getObjectValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getObjectValue <em>Object Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Value</em>' attribute.
   * @see #getObjectValue()
   * @generated
   */
  void setObjectValue(String value);

} // ConversionValue
