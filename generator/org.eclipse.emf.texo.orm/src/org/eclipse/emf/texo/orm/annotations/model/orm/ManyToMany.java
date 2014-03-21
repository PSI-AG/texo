/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToMany.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Many To Many</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface ManyToMany {
 * 				Class targetEntity() default void.class;
 * 				CascadeType[] cascade() default {};
 * 				FetchType fetch() default LAZY;
 * 				String mappedBy() default "";
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyClass <em>Map Key Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyTemporal <em>Map Key Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyConvert <em>Map Key Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyAssociationOverride <em>Map Key Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyColumn <em>Map Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#isCascadeOnDelete <em>Cascade On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getBatchFetch <em>Batch Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getNoncacheable <em>Noncacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getPartitioned <em>Partitioned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany()
 * @model extendedMetaData="name='many-to-many' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ManyToMany extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_OrderBy()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.OrderBy"
   *        extendedMetaData="kind='element' name='order-by' namespace='##targetNamespace'"
   * @generated
   */
  String getOrderBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderBy <em>Order By</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_OrderColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='order-column' namespace='##targetNamespace'"
   * @generated
   */
  OrderColumn getOrderColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderColumn <em>Order Column</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKey()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key' namespace='##targetNamespace'"
   * @generated
   */
  MapKey getMapKey();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKey <em>Map Key</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyClass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-class' namespace='##targetNamespace'"
   * @generated
   */
  MapKeyClass getMapKeyClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyClass <em>Map Key Class</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyTemporal()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="kind='element' name='map-key-temporal' namespace='##targetNamespace'"
   * @generated
   */
  TemporalType getMapKeyTemporal();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyTemporal <em>Map Key Temporal</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyEnumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="kind='element' name='map-key-enumerated' namespace='##targetNamespace'"
   * @generated
   */
  EnumType getMapKeyEnumerated();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyConvert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='map-key-convert' namespace='##targetNamespace'"
   * @generated
   */
  String getMapKeyConvert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyConvert <em>Map Key Convert</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyAttributeOverride()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyAssociationOverride()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-column' namespace='##targetNamespace'"
   * @generated
   */
  MapKeyColumn getMapKeyColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyColumn <em>Map Key Column</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MapKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<MapKeyJoinColumn> getMapKeyJoinColumn();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Converter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
   * @generated
   */
  Converter getConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getConverter <em>Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_TypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace'"
   * @generated
   */
  TypeConverter getTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTypeConverter <em>Type Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_ObjectTypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace'"
   * @generated
   */
  ObjectTypeConverter getObjectTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getObjectTypeConverter <em>Object Type Converter</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_StructConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  StructConverter getStructConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getStructConverter <em>Struct Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct Converter</em>' containment reference.
   * @see #getStructConverter()
   * @generated
   */
  void setStructConverter(StructConverter value);

  /**
   * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Table</em>' containment reference.
   * @see #setJoinTable(JoinTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_JoinTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
   * @generated
   */
  JoinTable getJoinTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinTable <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  void setJoinTable(JoinTable value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' containment reference.
   * @see #setCascade(CascadeType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Cascade()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cascade' namespace='##targetNamespace'"
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getCascade <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' containment reference.
   * @see #getCascade()
   * @generated
   */
  void setCascade(CascadeType value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_CascadeOnDelete()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='element' name='cascade-on-delete' namespace='##targetNamespace'"
   * @generated
   */
	boolean isCascadeOnDelete();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @generated
   */
	void unsetCascadeOnDelete();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute is set.
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
   * If the meaning of the '<em>Join Fetch</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_JoinFetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
  JoinFetchType getJoinFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinFetch <em>Join Fetch</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  void unsetJoinFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinFetch <em>Join Fetch</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_BatchFetch()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='batch-fetch' namespace='##targetNamespace'"
   * @generated
   */
	BatchFetch getBatchFetch();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getBatchFetch <em>Batch Fetch</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Property()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccessMethods <em>Access Methods</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Noncacheable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='noncacheable' namespace='##targetNamespace'"
   * @generated
   */
	EmptyType getNoncacheable();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getNoncacheable <em>Noncacheable</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Partitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='partitioning' namespace='##targetNamespace'"
   * @generated
   */
	Partitioning getPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getPartitioning <em>Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_ReplicationPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='replication-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ReplicationPartitioning getReplicationPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getReplicationPartitioning <em>Replication Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_RoundRobinPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='round-robin-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RoundRobinPartitioning getRoundRobinPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_PinnedPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pinned-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	PinnedPartitioning getPinnedPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getPinnedPartitioning <em>Pinned Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_RangePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='range-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RangePartitioning getRangePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getRangePartitioning <em>Range Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_ValuePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ValuePartitioning getValuePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getValuePartitioning <em>Value Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_HashPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hash-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	HashPartitioning getHashPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getHashPartitioning <em>Hash Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_UnionPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='union-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	UnionPartitioning getUnionPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getUnionPartitioning <em>Union Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Partitioned()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='partitioned' namespace='##targetNamespace'"
   * @generated
   */
	String getPartitioned();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getPartitioned <em>Partitioned</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccess <em>Access</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAttributeType <em>Attribute Type</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getFetch <em>Fetch</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getFetch <em>Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_MappedBy()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='mapped-by'"
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Entity</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Entity</em>' attribute.
   * @see #setTargetEntity(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToMany_TargetEntity()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='target-entity'"
   * @generated
   */
  String getTargetEntity();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTargetEntity <em>Target Entity</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' attribute.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(String value);

} // ManyToMany
