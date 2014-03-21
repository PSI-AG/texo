/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Struct types are extended object-relational data-types supported by
 * 				some databases.
 * 				* Struct types are user define types in the database such as OBJECT
 * 				types on Oracle.
 * 				* Structs can normally contains Arrays (VARRAY) or other Struct
 * 				types, and can be stored in
 * 				* a column or a table.
 * 				* This annotation define a class to map to a database Struct type.
 * 				* The class should normally be an Embeddable, but could also be an
 * 				Entity if stored in a object table.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.mappings.structures.ObjectRelationalDataTypeDescriptor
 * 				* @see org.eclipse.persistence.mappings.structures.StructureMapping
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({TYPE, METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface Struct {
 * 				/**
 * 				* (Required) The database name of the database structure type.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* (Optional) Defines the order of the fields contained in the
 * 				database structure type.
 * 				**
 * 				String[] fields() default {};
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Struct#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Struct#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStruct()
 * @model extendedMetaData="name='struct' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Struct extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Field</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' attribute list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStruct_Field()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
   * @generated
   */
	EList<String> getField();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStruct_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Struct#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // Struct
