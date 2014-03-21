/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementCollection.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Element Collection</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface ElementCollection { Class targetClass() default
 *                  void.class; FetchType fetch() default LAZY; }
 * 
 * 
 *                  <!-- end-model-doc -->
 * 
 *                  <p>
 *                  The following features are supported:
 *                  <ul>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderBy <em>Order By
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderColumn <em>Order
 *                  Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKey <em>Map Key
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyClass <em>Map
 *                  Key Class</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyTemporal <em>
 *                  Map Key Temporal</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyEnumerated <em>
 *                  Map Key Enumerated</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyConvert <em>Map
 *                  Key Convert</em>}</li>
 *                  <li>
 *                  {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyAttributeOverride
 *                  <em>Map Key Attribute Override</em>}</li>
 *                  <li>
 *                  {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyAssociationOverride
 *                  <em>Map Key Association Override</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyColumn <em>Map
 *                  Key Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyJoinColumn <em>
 *                  Map Key Join Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getColumn <em>Column
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTemporal <em>Temporal
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getEnumerated <em>
 *                  Enumerated</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getLob <em>Lob</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConvert <em>Convert
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAttributeOverride
 *                  <em>Attribute Override</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAssociationOverride
 *                  <em>Association Override</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getGroup <em>Group</em>}
 *                  </li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConverter <em>
 *                  Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTypeConverter <em>
 *                  Type Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getObjectTypeConverter
 *                  <em>Object Type Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getStructConverter <em>
 *                  Struct Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getCollectionTable <em>
 *                  Collection Table</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getProperty <em>Property
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccessMethods <em>
 *                  Access Methods</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccess <em>Access
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getFetch <em>Fetch</em>}
 *                  </li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getName <em>Name</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTargetClass <em>
 *                  Target Class</em>}</li>
 *                  </ul>
 *                  </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection()
 * @model extendedMetaData="name='element-collection' kind='elementOnly'"
 * @generated
 */
public interface ElementCollection extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Order By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By</em>' attribute.
   * @see #setOrderBy(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_OrderBy()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.OrderBy"
   *        extendedMetaData="kind='element' name='order-by' namespace='##targetNamespace'"
   * @generated
   */
  String getOrderBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderBy <em>Order By</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Order By</em>' attribute.
   * @see #getOrderBy()
   * @generated
   */
  void setOrderBy(String value);

  /**
   * Returns the value of the '<em><b>Order Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order Column</em>' containment reference.
   * @see #setOrderColumn(OrderColumn)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_OrderColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='order-column' namespace='##targetNamespace'"
   * @generated
   */
  OrderColumn getOrderColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderColumn <em>Order Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Order Column</em>' containment reference.
   * @see #getOrderColumn()
   * @generated
   */
  void setOrderColumn(OrderColumn value);

  /**
   * Returns the value of the '<em><b>Map Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key</em>' containment reference.
   * @see #setMapKey(MapKey)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKey()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key' namespace='##targetNamespace'"
   * @generated
   */
  MapKey getMapKey();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKey <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key</em>' containment reference.
   * @see #getMapKey()
   * @generated
   */
  void setMapKey(MapKey value);

  /**
   * Returns the value of the '<em><b>Map Key Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Class</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Class</em>' containment reference.
   * @see #setMapKeyClass(MapKeyClass)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyClass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-class' namespace='##targetNamespace'"
   * @generated
   */
  MapKeyClass getMapKeyClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyClass <em>Map Key Class</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Class</em>' containment reference.
   * @see #getMapKeyClass()
   * @generated
   */
  void setMapKeyClass(MapKeyClass value);

  /**
   * Returns the value of the '<em><b>Map Key Temporal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Temporal</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Temporal</em>' attribute.
   * @see #setMapKeyTemporal(TemporalType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyTemporal()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="kind='element' name='map-key-temporal' namespace='##targetNamespace'"
   * @generated
   */
  TemporalType getMapKeyTemporal();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyTemporal <em>Map Key Temporal</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Temporal</em>' attribute.
   * @see #getMapKeyTemporal()
   * @generated
   */
	void setMapKeyTemporal(TemporalType value);

		/**
   * Returns the value of the '<em><b>Map Key Enumerated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Enumerated</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Enumerated</em>' attribute.
   * @see #setMapKeyEnumerated(EnumType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyEnumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="kind='element' name='map-key-enumerated' namespace='##targetNamespace'"
   * @generated
   */
  EnumType getMapKeyEnumerated();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyEnumerated <em>Map Key Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Enumerated</em>' attribute.
   * @see #getMapKeyEnumerated()
   * @generated
   */
	void setMapKeyEnumerated(EnumType value);

		/**
   * Returns the value of the '<em><b>Map Key Convert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Convert</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Convert</em>' attribute.
   * @see #setMapKeyConvert(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyConvert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='map-key-convert' namespace='##targetNamespace'"
   * @generated
   */
  String getMapKeyConvert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyConvert <em>Map Key Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Convert</em>' attribute.
   * @see #getMapKeyConvert()
   * @generated
   */
  void setMapKeyConvert(String value);

  /**
   * Returns the value of the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Attribute Override</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Attribute Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyAttributeOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-attribute-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AttributeOverride> getMapKeyAttributeOverride();

  /**
   * Returns the value of the '<em><b>Map Key Association Override</b></em>' containment reference list. The list
   * contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Association Override</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Association Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyAssociationOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-association-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AssociationOverride> getMapKeyAssociationOverride();

  /**
   * Returns the value of the '<em><b>Map Key Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Column</em>' containment reference.
   * @see #setMapKeyColumn(MapKeyColumn)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-column' namespace='##targetNamespace'"
   * @generated
   */
  MapKeyColumn getMapKeyColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyColumn <em>Map Key Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Column</em>' containment reference.
   * @see #getMapKeyColumn()
   * @generated
   */
  void setMapKeyColumn(MapKeyColumn value);

  /**
   * Returns the value of the '<em><b>Map Key Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Join Column</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_MapKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<MapKeyJoinColumn> getMapKeyJoinColumn();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Column()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
   * @generated
   */
  Column getColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Column value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Temporal()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace'"
   * @generated
   */
  TemporalType getTemporal();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTemporal <em>Temporal</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Enumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="kind='element' name='enumerated' namespace='##targetNamespace'"
   * @generated
   */
  EnumType getEnumerated();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getEnumerated <em>Enumerated</em>}' attribute.
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
   * If the meaning of the '<em>Lob</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lob</em>' containment reference.
   * @see #setLob(Lob)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Lob()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='lob' namespace='##targetNamespace'"
   * @generated
   */
  Lob getLob();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getLob <em>Lob</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Lob</em>' containment reference.
   * @see #getLob()
   * @generated
   */
  void setLob(Lob value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Convert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='convert' namespace='##targetNamespace'"
   * @generated
   */
  String getConvert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConvert <em>Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Convert</em>' attribute.
   * @see #getConvert()
   * @generated
   */
  void setConvert(String value);

  /**
   * Returns the value of the '<em><b>Attribute Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Override</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_AttributeOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='attribute-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AttributeOverride> getAttributeOverride();

  /**
   * Returns the value of the '<em><b>Association Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association Override</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_AssociationOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='association-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AssociationOverride> getAssociationOverride();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:18'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Converter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace' group='#group:18'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_TypeConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace' group='#group:18'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_ObjectTypeConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace' group='#group:18'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_StructConverter()
   * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace' group='#group:18'"
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
   * @see #setCollectionTable(CollectionTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_CollectionTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='collection-table' namespace='##targetNamespace'"
   * @generated
   */
  CollectionTable getCollectionTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getCollectionTable <em>Collection Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Table</em>' containment reference.
   * @see #getCollectionTable()
   * @generated
   */
  void setCollectionTable(CollectionTable value);

  /**
   * Returns the value of the '<em><b>Cascade On Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade On Delete</em>' attribute.
   * @see #isSetCascadeOnDelete()
   * @see #unsetCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_CascadeOnDelete()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='element' name='cascade-on-delete' namespace='##targetNamespace'"
   * @generated
   */
	boolean isCascadeOnDelete();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade On Delete</em>' attribute.
   * @see #isSetCascadeOnDelete()
   * @see #unsetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @generated
   */
	void setCascadeOnDelete(boolean value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @generated
   */
	void unsetCascadeOnDelete();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Cascade On Delete</em>' attribute is set.
   * @see #unsetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @generated
   */
	boolean isSetCascadeOnDelete();

		/**
   * Returns the value of the '<em><b>Join Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_JoinFetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
	JoinFetchType getJoinFetch();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @generated
   */
	void setJoinFetch(JoinFetchType value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
	void unsetJoinFetch();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getJoinFetch <em>Join Fetch</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_BatchFetch()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='batch-fetch' namespace='##targetNamespace'"
   * @generated
   */
	BatchFetch getBatchFetch();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getBatchFetch <em>Batch Fetch</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Property()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccessMethods <em>Access Methods</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Noncacheable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='noncacheable' namespace='##targetNamespace'"
   * @generated
   */
	EmptyType getNoncacheable();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getNoncacheable <em>Noncacheable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noncacheable</em>' containment reference.
   * @see #getNoncacheable()
   * @generated
   */
	void setNoncacheable(EmptyType value);

		/**
   * Returns the value of the '<em><b>Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partitioning</em>' containment reference.
   * @see #setPartitioning(Partitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Partitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='partitioning' namespace='##targetNamespace'"
   * @generated
   */
	Partitioning getPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getPartitioning <em>Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partitioning</em>' containment reference.
   * @see #getPartitioning()
   * @generated
   */
	void setPartitioning(Partitioning value);

		/**
   * Returns the value of the '<em><b>Replication Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Replication Partitioning</em>' containment reference.
   * @see #setReplicationPartitioning(ReplicationPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_ReplicationPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='replication-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ReplicationPartitioning getReplicationPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getReplicationPartitioning <em>Replication Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replication Partitioning</em>' containment reference.
   * @see #getReplicationPartitioning()
   * @generated
   */
	void setReplicationPartitioning(ReplicationPartitioning value);

		/**
   * Returns the value of the '<em><b>Round Robin Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Robin Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Round Robin Partitioning</em>' containment reference.
   * @see #setRoundRobinPartitioning(RoundRobinPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_RoundRobinPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='round-robin-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RoundRobinPartitioning getRoundRobinPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Round Robin Partitioning</em>' containment reference.
   * @see #getRoundRobinPartitioning()
   * @generated
   */
	void setRoundRobinPartitioning(RoundRobinPartitioning value);

		/**
   * Returns the value of the '<em><b>Pinned Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pinned Partitioning</em>' containment reference.
   * @see #setPinnedPartitioning(PinnedPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_PinnedPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pinned-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	PinnedPartitioning getPinnedPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getPinnedPartitioning <em>Pinned Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pinned Partitioning</em>' containment reference.
   * @see #getPinnedPartitioning()
   * @generated
   */
	void setPinnedPartitioning(PinnedPartitioning value);

		/**
   * Returns the value of the '<em><b>Range Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Range Partitioning</em>' containment reference.
   * @see #setRangePartitioning(RangePartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_RangePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='range-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RangePartitioning getRangePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getRangePartitioning <em>Range Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Partitioning</em>' containment reference.
   * @see #getRangePartitioning()
   * @generated
   */
	void setRangePartitioning(RangePartitioning value);

		/**
   * Returns the value of the '<em><b>Value Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value Partitioning</em>' containment reference.
   * @see #setValuePartitioning(ValuePartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_ValuePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ValuePartitioning getValuePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getValuePartitioning <em>Value Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Partitioning</em>' containment reference.
   * @see #getValuePartitioning()
   * @generated
   */
	void setValuePartitioning(ValuePartitioning value);

		/**
   * Returns the value of the '<em><b>Hash Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Hash Partitioning</em>' containment reference.
   * @see #setHashPartitioning(HashPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_HashPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hash-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	HashPartitioning getHashPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getHashPartitioning <em>Hash Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hash Partitioning</em>' containment reference.
   * @see #getHashPartitioning()
   * @generated
   */
	void setHashPartitioning(HashPartitioning value);

		/**
   * Returns the value of the '<em><b>Union Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Union Partitioning</em>' containment reference.
   * @see #setUnionPartitioning(UnionPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_UnionPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='union-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	UnionPartitioning getUnionPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getUnionPartitioning <em>Union Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union Partitioning</em>' containment reference.
   * @see #getUnionPartitioning()
   * @generated
   */
	void setUnionPartitioning(UnionPartitioning value);

		/**
   * Returns the value of the '<em><b>Partitioned</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partitioned</em>' attribute.
   * @see #setPartitioned(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Partitioned()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='partitioned' namespace='##targetNamespace'"
   * @generated
   */
	String getPartitioned();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getPartitioned <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partitioned</em>' attribute.
   * @see #getPartitioned()
   * @generated
   */
	void setPartitioned(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccess <em>Access</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAttributeType <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' attribute.
   * @see #getAttributeType()
   * @generated
   */
	void setAttributeType(String value);

		/**
   * Returns the value of the '<em><b>Composite Member</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Composite Member</em>' attribute.
   * @see #setCompositeMember(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_CompositeMember()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='composite-member'"
   * @generated
   */
	String getCompositeMember();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getCompositeMember <em>Composite Member</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite Member</em>' attribute.
   * @see #getCompositeMember()
   * @generated
   */
	void setCompositeMember(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getFetch <em>Fetch</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getFetch <em>Fetch</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Class</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Class</em>' attribute.
   * @see #setTargetClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getElementCollection_TargetClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='target-class'"
   * @generated
   */
  String getTargetClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTargetClass <em>Target Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Class</em>' attribute.
   * @see #getTargetClass()
   * @generated
   */
  void setTargetClass(String value);

} // ElementCollection
