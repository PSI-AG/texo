/**
 * <copyright>
 * </copyright>
 *
 * $Id: Basic.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Basic</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface Basic {
 * 				FetchType fetch() default EAGER;
 * 				boolean optional() default true;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getGeneratedValue <em>Generated Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getLob <em>Lob</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getReturnInsert <em>Return Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getReturnUpdate <em>Return Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic()
 * @model extendedMetaData="name='basic' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Basic extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Column()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
   * @generated
   */
  Column getColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getColumn <em>Column</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Index()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
   * @generated
   */
	Index getIndex();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getIndex <em>Index</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_GeneratedValue()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='generated-value' namespace='##targetNamespace'"
   * @generated
   */
  GeneratedValue getGeneratedValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getGeneratedValue <em>Generated Value</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generated Value</em>' containment reference.
   * @see #getGeneratedValue()
   * @generated
   */
  void setGeneratedValue(GeneratedValue value);

  /**
   * Returns the value of the '<em><b>Lob</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lob</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lob</em>' containment reference.
   * @see #setLob(Lob)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Lob()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='lob' namespace='##targetNamespace'"
   * @generated
   */
  Lob getLob();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getLob <em>Lob</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Lob</em>' containment reference.
   * @see #getLob()
   * @generated
   */
  void setLob(Lob value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Temporal()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace'"
   * @generated
   */
  TemporalType getTemporal();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTemporal <em>Temporal</em>}' attribute.
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
   * If the meaning of the '<em>Enumerated</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated</em>' attribute.
   * @see #setEnumerated(EnumType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Enumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="kind='element' name='enumerated' namespace='##targetNamespace'"
   * @generated
   */
  EnumType getEnumerated();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getEnumerated <em>Enumerated</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Convert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='convert' namespace='##targetNamespace'"
   * @generated
   */
  String getConvert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConvert <em>Convert</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Converter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
   * @generated
   */
  Converter getConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConverter <em>Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_TypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace'"
   * @generated
   */
  TypeConverter getTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTypeConverter <em>Type Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_ObjectTypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace'"
   * @generated
   */
  ObjectTypeConverter getObjectTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getObjectTypeConverter <em>Object Type Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_StructConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  StructConverter getStructConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getStructConverter <em>Struct Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_TableGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='table-generator' namespace='##targetNamespace'"
   * @generated
   */
  TableGenerator getTableGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTableGenerator <em>Table Generator</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_SequenceGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sequence-generator' namespace='##targetNamespace'"
   * @generated
   */
  SequenceGenerator getSequenceGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getSequenceGenerator <em>Sequence Generator</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Property()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
  void setAccessMethods(AccessMethods value);

  /**
   * Returns the value of the '<em><b>Return Insert</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Insert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Return Insert</em>' containment reference.
   * @see #setReturnInsert(ReturnInsert)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_ReturnInsert()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='return-insert' namespace='##targetNamespace'"
   * @generated
   */
	ReturnInsert getReturnInsert();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getReturnInsert <em>Return Insert</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Insert</em>' containment reference.
   * @see #getReturnInsert()
   * @generated
   */
	void setReturnInsert(ReturnInsert value);

		/**
   * Returns the value of the '<em><b>Return Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Return Update</em>' containment reference.
   * @see #setReturnUpdate(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_ReturnUpdate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='return-update' namespace='##targetNamespace'"
   * @generated
   */
	EmptyType getReturnUpdate();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getReturnUpdate <em>Return Update</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Update</em>' containment reference.
   * @see #getReturnUpdate()
   * @generated
   */
	void setReturnUpdate(EmptyType value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccess <em>Access</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAttributeType <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' attribute.
   * @see #getAttributeType()
   * @generated
   */
	void setAttributeType(String value);

		/**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #setFetch(FetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getFetch <em>Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Mutable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='mutable'"
   * @generated
   */
  boolean isMutable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mutable</em>' attribute.
   * @see #isSetMutable()
   * @see #unsetMutable()
   * @see #isMutable()
   * @generated
   */
  void setMutable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMutable()
   * @see #isMutable()
   * @see #setMutable(boolean)
   * @generated
   */
  void unsetMutable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isMutable <em>Mutable</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #setOptional(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasic_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  void unsetOptional();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isOptional <em>Optional</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Optional</em>' attribute is set.
   * @see #unsetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  boolean isSetOptional();

} // Basic
