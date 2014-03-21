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
 * A representation of the model object '<em><b>Structure</b></em>'.
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
 * 				* This annotation can be defined on a field/method to define an
 * 				StructureMapping to an embedded Struct type.
 * 				* The target Embeddable must be mapped using the Struct annotation.
 * 				*
 * 				* @see Struct
 * 				* @see
 * 				org.eclipse.persistence.mappings.structures.ObjectRelationalDataTypeDescriptor
 * 				* @see org.eclipse.persistence.mappings.structures.StructureMapping
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface Structure {
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructure()
 * @model extendedMetaData="name='structure' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Structure extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructure_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
	EList<Property> getProperty();

	/**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructure_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
	AccessMethods getAccessMethods();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
	void setAccessMethods(AccessMethods value);

	/**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructure_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
	AccessType getAccess();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
	void setAccess(AccessType value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
	void unsetAccess();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
	boolean isSetAccess();

	/**
   * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Type</em>' attribute.
   * @see #setAttributeType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructure_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getAttributeType <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' attribute.
   * @see #getAttributeType()
   * @generated
   */
	void setAttributeType(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStructure_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // Structure
