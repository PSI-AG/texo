/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructConverter.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Struct Converter</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({TYPE, METHOD, FIELD})
 * @Retention(RUNTIME) public @interface StructConverter { * * (Required) Name this converter. The name should be unique
 *                     across * the whole persistence unit. * String name();
 * 
 *                     * * (Required) The converter class to be used. This class must * implement the EclipseLink
 *                     interface * org.eclipse.persistence.mappings.converters.Converter * String converter(); }
 * 
 * 
 *                     <!-- end-model-doc -->
 * 
 *                     <p>
 *                     The following features are supported:
 *                     <ul>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getConverter <em>
 *                     Converter</em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getName <em>Name</em>}</li>
 *                     </ul>
 *                     </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructConverter()
 * @model extendedMetaData="name='struct-converter' kind='empty'"
 * @generated
 */
public interface StructConverter extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Converter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Converter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Converter</em>' attribute.
   * @see #setConverter(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructConverter_Converter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='converter'"
   * @generated
   */
  String getConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getConverter <em>Converter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Converter</em>' attribute.
   * @see #getConverter()
   * @generated
   */
  void setConverter(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructConverter_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // StructConverter
