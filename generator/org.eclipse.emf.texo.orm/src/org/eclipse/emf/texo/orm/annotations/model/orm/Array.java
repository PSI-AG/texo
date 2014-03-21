/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Array types are extended object-relational data-types supported by
 * 				some databases.
 * 				* Array types are user define types in the database such as VARRAY
 * 				types on Oracle.
 * 				* Arrays can contains basic types (VARCHAR) or other Struct types,
 * 				and can be stored in
 * 				* a column or in a Struct type.
 * 				* This annotation can be defined on a collection attribute that is
 * 				* persisted to an Array type. The collection can be of basic types,
 * 				or embeddable
 * 				* class mapped using a Struct.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.mappings.structures.ObjectRelationalDataTypeDescriptor
 * 				* @see org.eclipse.persistence.mappings.structures.ArrayMapping
 * 				* @see org.eclipse.persistence.mappings.structures.ObjectArrayMapping
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface Array {
 * 				/**
 * 				* (Optional) The basic or embeddable class that is the element
 * 				* type of the collection. This element is optional only if the
 * 				* collection field or property is defined using Java generics,
 * 				* and must be specified otherwise. It defaults to the
 * 				* paramterized type of the collection when defined using
 * 				* generics.
 * 				**
 * 				Class targetClass() default void.class;
 * 
 * 				/**
 * 				* (Required) The database name of the database array structure type.
 * 				**
 * 				String databaseType();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getLob <em>Lob</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray()
 * @model extendedMetaData="name='array' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Array extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(Column)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Column()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
   * @generated
   */
	Column getColumn();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
	void setColumn(Column value);

	/**
   * Returns the value of the '<em><b>Temporal</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Temporal</em>' attribute.
   * @see #setTemporal(TemporalType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Temporal()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace'"
   * @generated
   */
	TemporalType getTemporal();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getTemporal <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temporal</em>' attribute.
   * @see #getTemporal()
   * @generated
   */
	void setTemporal(TemporalType value);

	/**
   * Returns the value of the '<em><b>Enumerated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated</em>' attribute.
   * @see #setEnumerated(EnumType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Enumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="kind='element' name='enumerated' namespace='##targetNamespace'"
   * @generated
   */
	EnumType getEnumerated();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getEnumerated <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated</em>' attribute.
   * @see #getEnumerated()
   * @generated
   */
	void setEnumerated(EnumType value);

	/**
   * Returns the value of the '<em><b>Lob</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lob</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Lob</em>' containment reference.
   * @see #setLob(Lob)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Lob()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='lob' namespace='##targetNamespace'"
   * @generated
   */
	Lob getLob();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getLob <em>Lob</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lob</em>' containment reference.
   * @see #getLob()
   * @generated
   */
	void setLob(Lob value);

	/**
   * Returns the value of the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Convert</em>' attribute.
   * @see #setConvert(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Convert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='convert' namespace='##targetNamespace'"
   * @generated
   */
	String getConvert();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getConvert <em>Convert</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Convert</em>' attribute.
   * @see #getConvert()
   * @generated
   */
	void setConvert(String value);

	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:5'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Converter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Converter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace' group='#group:5'"
   * @generated
   */
	EList<Converter> getConverter();

	/**
   * Returns the value of the '<em><b>Type Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Converter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_TypeConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace' group='#group:5'"
   * @generated
   */
	EList<TypeConverter> getTypeConverter();

	/**
   * Returns the value of the '<em><b>Object Type Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type Converter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_ObjectTypeConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace' group='#group:5'"
   * @generated
   */
	EList<ObjectTypeConverter> getObjectTypeConverter();

	/**
   * Returns the value of the '<em><b>Struct Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Converter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_StructConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace' group='#group:5'"
   * @generated
   */
	EList<StructConverter> getStructConverter();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Property()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
	AccessMethods getAccessMethods();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAccessMethods <em>Access Methods</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
	AccessType getAccess();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
	void unsetAccess();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAccess <em>Access</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getAttributeType <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' attribute.
   * @see #getAttributeType()
   * @generated
   */
	void setAttributeType(String value);

	/**
   * Returns the value of the '<em><b>Database Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Type</em>' attribute.
   * @see #setDatabaseType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_DatabaseType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='database-type'"
   * @generated
   */
	String getDatabaseType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getDatabaseType <em>Database Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Type</em>' attribute.
   * @see #getDatabaseType()
   * @generated
   */
	void setDatabaseType(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Target Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target Class</em>' attribute.
   * @see #setTargetClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getArray_TargetClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='target-class'"
   * @generated
   */
	String getTargetClass();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Array#getTargetClass <em>Target Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Class</em>' attribute.
   * @see #getTargetClass()
   * @generated
   */
	void setTargetClass(String value);

} // Array
