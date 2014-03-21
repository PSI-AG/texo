/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicMap.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Basic Map</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface BasicMap {
 * 				/**
 * 				* (Optional) Defines whether the value of the field or property
 * 				* should be lazily loaded or must be eagerly fetched. The EAGER
 * 				* strategy is a requirement on the persistence provider runtime that
 * 				* the value must be eagerly fetched. The LAZY strategy is a hint to
 * 				* the persistence provider runtime. If not specified, defaults to
 * 				* LAZY.
 * 				**
 * 				FetchType fetch() default LAZY;
 * 
 * 				/**
 * 				* (Optional) The name of the data column that holds the direct map
 * 				* key. If the name on te key column is "", the name will default to:
 * 				* the name of the property or field; "_KEY".
 * 				**
 * 				Column keyColumn() default @Column;
 * 
 * 				/**
 * 				* (Optional) Specify the key converter. Default is equivalent to
 * 				* specifying @Convert("none"), meaning no converter will be added to
 * 				* the direct map key.
 * 				**
 * 				Convert keyConverter() default @Convert;
 * 
 * 				/**
 * 				* (Optional) The name of the data column that holds the direct
 * 				* collection data. Defaults to the property or field name.
 * 				**
 * 				Column valueColumn() default @Column;
 * 
 * 				/**
 * 				* (Optional) Specify the value converter. Default is equivalent to
 * 				* specifying @Convert("none"), meaning no converter will be added to
 * 				* the value column mapping.
 * 				**
 * 				Convert valueConverter() default @Convert;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyColumn <em>Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyConverter <em>Key Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueColumn <em>Value Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueConverter <em>Value Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getBatchFetch <em>Batch Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getNoncacheable <em>Noncacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap()
 * @model extendedMetaData="name='basic-map' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface BasicMap extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Key Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Column</em>' containment reference.
   * @see #setKeyColumn(Column)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_KeyColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='key-column' namespace='##targetNamespace'"
   * @generated
   */
  Column getKeyColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyColumn <em>Key Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Column</em>' containment reference.
   * @see #getKeyColumn()
   * @generated
   */
  void setKeyColumn(Column value);

  /**
   * Returns the value of the '<em><b>Key Converter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Converter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Converter</em>' attribute.
   * @see #setKeyConverter(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_KeyConverter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='key-converter' namespace='##targetNamespace'"
   * @generated
   */
  String getKeyConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyConverter <em>Key Converter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Converter</em>' attribute.
   * @see #getKeyConverter()
   * @generated
   */
  void setKeyConverter(String value);

  /**
   * Returns the value of the '<em><b>Value Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Column</em>' containment reference.
   * @see #setValueColumn(Column)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_ValueColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value-column' namespace='##targetNamespace'"
   * @generated
   */
  Column getValueColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueColumn <em>Value Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Column</em>' containment reference.
   * @see #getValueColumn()
   * @generated
   */
  void setValueColumn(Column value);

  /**
   * Returns the value of the '<em><b>Value Converter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Converter</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Converter</em>' attribute.
   * @see #setValueConverter(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_ValueConverter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='value-converter' namespace='##targetNamespace'"
   * @generated
   */
  String getValueConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueConverter <em>Value Converter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Converter</em>' attribute.
   * @see #getValueConverter()
   * @generated
   */
  void setValueConverter(String value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute list isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:4'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Converter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Converter</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Converter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
  EList<Converter> getConverter();

  /**
   * Returns the value of the '<em><b>Type Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Converter</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_TypeConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
  EList<TypeConverter> getTypeConverter();

  /**
   * Returns the value of the '<em><b>Object Type Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type Converter</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_ObjectTypeConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
  EList<ObjectTypeConverter> getObjectTypeConverter();

  /**
   * Returns the value of the '<em><b>Struct Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Converter</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_StructConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
  EList<StructConverter> getStructConverter();

  /**
   * Returns the value of the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection Table</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection Table</em>' containment reference.
   * @see #setCollectionTable(EclipselinkCollectionTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_CollectionTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='collection-table' namespace='##targetNamespace'"
   * @generated
   */
  EclipselinkCollectionTable getCollectionTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getCollectionTable <em>Collection Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Table</em>' containment reference.
   * @see #getCollectionTable()
   * @generated
   */
  void setCollectionTable(EclipselinkCollectionTable value);

  /**
   * Returns the value of the '<em><b>Join Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Fetch</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_JoinFetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
  JoinFetchType getJoinFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @generated
   */
  void setJoinFetch(JoinFetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  void unsetJoinFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getJoinFetch <em>Join Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Join Fetch</em>' attribute is set.
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  boolean isSetJoinFetch();

  /**
   * Returns the value of the '<em><b>Batch Fetch</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Fetch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Batch Fetch</em>' containment reference.
   * @see #setBatchFetch(BatchFetch)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_BatchFetch()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='batch-fetch' namespace='##targetNamespace'"
   * @generated
   */
	BatchFetch getBatchFetch();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getBatchFetch <em>Batch Fetch</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch Fetch</em>' containment reference.
   * @see #getBatchFetch()
   * @generated
   */
	void setBatchFetch(BatchFetch value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Property()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
  void setAccessMethods(AccessMethods value);

  /**
   * Returns the value of the '<em><b>Noncacheable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noncacheable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Noncacheable</em>' containment reference.
   * @see #setNoncacheable(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Noncacheable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='noncacheable' namespace='##targetNamespace'"
   * @generated
   */
	EmptyType getNoncacheable();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getNoncacheable <em>Noncacheable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noncacheable</em>' containment reference.
   * @see #getNoncacheable()
   * @generated
   */
	void setNoncacheable(EmptyType value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getFetch <em>Fetch</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getFetch <em>Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBasicMap_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // BasicMap
