/**
 * <copyright>
 * </copyright>
 *
 * $Id: Id.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Id</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface Id {}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getGeneratedValue <em>Generated Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId()
 * @model extendedMetaData="name='id' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Id extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(Column)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Column()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
   * @generated
   */
  Column getColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Column value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Index)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Index()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
   * @generated
   */
	Index getIndex();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
	void setIndex(Index value);

		/**
   * Returns the value of the '<em><b>Generated Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generated Value</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generated Value</em>' containment reference.
   * @see #setGeneratedValue(GeneratedValue)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_GeneratedValue()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='generated-value' namespace='##targetNamespace'"
   * @generated
   */
  GeneratedValue getGeneratedValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getGeneratedValue <em>Generated Value</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generated Value</em>' containment reference.
   * @see #getGeneratedValue()
   * @generated
   */
  void setGeneratedValue(GeneratedValue value);

  /**
   * Returns the value of the '<em><b>Temporal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporal</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temporal</em>' attribute.
   * @see #setTemporal(TemporalType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Temporal()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace'"
   * @generated
   */
  TemporalType getTemporal();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTemporal <em>Temporal</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Enumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="kind='element' name='enumerated' namespace='##targetNamespace'"
   * @generated
   */
	EnumType getEnumerated();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getEnumerated <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated</em>' attribute.
   * @see #getEnumerated()
   * @generated
   */
	void setEnumerated(EnumType value);

		/**
   * Returns the value of the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Convert</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Convert</em>' attribute.
   * @see #setConvert(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Convert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='convert' namespace='##targetNamespace'"
   * @generated
   */
  String getConvert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConvert <em>Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Convert</em>' attribute.
   * @see #getConvert()
   * @generated
   */
  void setConvert(String value);

  /**
   * Returns the value of the '<em><b>Converter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Converter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Converter</em>' containment reference.
   * @see #setConverter(Converter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Converter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
   * @generated
   */
  Converter getConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConverter <em>Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Converter</em>' containment reference.
   * @see #getConverter()
   * @generated
   */
  void setConverter(Converter value);

  /**
   * Returns the value of the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Converter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Converter</em>' containment reference.
   * @see #setTypeConverter(TypeConverter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_TypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace'"
   * @generated
   */
  TypeConverter getTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTypeConverter <em>Type Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Converter</em>' containment reference.
   * @see #getTypeConverter()
   * @generated
   */
  void setTypeConverter(TypeConverter value);

  /**
   * Returns the value of the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type Converter</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type Converter</em>' containment reference.
   * @see #setObjectTypeConverter(ObjectTypeConverter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_ObjectTypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace'"
   * @generated
   */
  ObjectTypeConverter getObjectTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getObjectTypeConverter <em>Object Type Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type Converter</em>' containment reference.
   * @see #getObjectTypeConverter()
   * @generated
   */
  void setObjectTypeConverter(ObjectTypeConverter value);

  /**
   * Returns the value of the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Converter</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Converter</em>' containment reference.
   * @see #setStructConverter(StructConverter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_StructConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  StructConverter getStructConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getStructConverter <em>Struct Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct Converter</em>' containment reference.
   * @see #getStructConverter()
   * @generated
   */
  void setStructConverter(StructConverter value);

  /**
   * Returns the value of the '<em><b>Table Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Generator</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Generator</em>' containment reference.
   * @see #setTableGenerator(TableGenerator)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_TableGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='table-generator' namespace='##targetNamespace'"
   * @generated
   */
  TableGenerator getTableGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTableGenerator <em>Table Generator</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Generator</em>' containment reference.
   * @see #getTableGenerator()
   * @generated
   */
  void setTableGenerator(TableGenerator value);

  /**
   * Returns the value of the '<em><b>Sequence Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Generator</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Generator</em>' containment reference.
   * @see #setSequenceGenerator(SequenceGenerator)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_SequenceGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sequence-generator' namespace='##targetNamespace'"
   * @generated
   */
  SequenceGenerator getSequenceGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getSequenceGenerator <em>Sequence Generator</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Generator</em>' containment reference.
   * @see #getSequenceGenerator()
   * @generated
   */
  void setSequenceGenerator(SequenceGenerator value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * If the meaning of the '<em>Access</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAttributeType <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' attribute.
   * @see #getAttributeType()
   * @generated
   */
	void setAttributeType(String value);

		/**
   * Returns the value of the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mutable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mutable</em>' attribute.
   * @see #isSetMutable()
   * @see #unsetMutable()
   * @see #setMutable(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Mutable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='mutable'"
   * @generated
   */
  boolean isMutable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mutable</em>' attribute.
   * @see #isSetMutable()
   * @see #unsetMutable()
   * @see #isMutable()
   * @generated
   */
  void setMutable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMutable()
   * @see #isMutable()
   * @see #setMutable(boolean)
   * @generated
   */
  void unsetMutable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#isMutable <em>Mutable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Mutable</em>' attribute is set.
   * @see #unsetMutable()
   * @see #isMutable()
   * @see #setMutable(boolean)
   * @generated
   */
  boolean isSetMutable();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getId_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Id
