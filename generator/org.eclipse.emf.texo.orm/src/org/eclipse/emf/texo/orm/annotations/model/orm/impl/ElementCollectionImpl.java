/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementCollectionImpl.java,v 1.8 2011/10/25 22:49:05 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch;
import org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Lob;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKey;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartitioning;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Element Collection</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getOrderBy <em>Order By</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getOrderColumn <em>Order Column
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKey <em>Map Key</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyClass <em>Map Key Class
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyTemporal <em>Map Key
 * Temporal</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyEnumerated <em>Map Key
 * Enumerated</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyConvert <em>Map Key
 * Convert</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyAttributeOverride <em>
 * Map Key Attribute Override</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyAssociationOverride
 * <em>Map Key Association Override</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyColumn <em>Map Key
 * Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getMapKeyJoinColumn <em>Map Key
 * Join Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getColumn <em>Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getTemporal <em>Temporal</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getEnumerated <em>Enumerated
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getLob <em>Lob</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getConvert <em>Convert</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getAttributeOverride <em>
 * Attribute Override</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getAssociationOverride <em>
 * Association Override</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getGroup <em>Group</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getConverter <em>Converter</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getTypeConverter <em>Type
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getObjectTypeConverter <em>
 * Object Type Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getStructConverter <em>Struct
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getCollectionTable <em>
 * Collection Table</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getAccessMethods <em>Access
 * Methods</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getAccess <em>Access</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getFetch <em>Fetch</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl#getTargetClass <em>Target Class
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ElementCollectionImpl extends BaseOrmAnnotationImpl implements ElementCollection {
  /**
   * The default value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected static final String ORDER_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected String orderBy = ORDER_BY_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrderColumn() <em>Order Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOrderColumn()
   * @generated
   * @ordered
   */
  protected OrderColumn orderColumn;

  /**
   * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMapKey()
   * @generated
   * @ordered
   */
  protected MapKey mapKey;

  /**
   * The cached value of the '{@link #getMapKeyClass() <em>Map Key Class</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyClass()
   * @generated
   * @ordered
   */
  protected MapKeyClass mapKeyClass;

  /**
   * The default value of the '{@link #getMapKeyTemporal() <em>Map Key Temporal</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getMapKeyTemporal()
   * @generated
   * @ordered
   */
  protected static final TemporalType MAP_KEY_TEMPORAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapKeyTemporal() <em>Map Key Temporal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapKeyTemporal()
   * @generated
   * @ordered
   */
  protected TemporalType mapKeyTemporal = MAP_KEY_TEMPORAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMapKeyEnumerated() <em>Map Key Enumerated</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyEnumerated()
   * @generated
   * @ordered
   */
  protected static final EnumType MAP_KEY_ENUMERATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapKeyEnumerated() <em>Map Key Enumerated</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getMapKeyEnumerated()
   * @generated
   * @ordered
   */
  protected EnumType mapKeyEnumerated = MAP_KEY_ENUMERATED_EDEFAULT;

  /**
   * The default value of the '{@link #getMapKeyConvert() <em>Map Key Convert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapKeyConvert()
   * @generated
   * @ordered
   */
  protected static final String MAP_KEY_CONVERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapKeyConvert() <em>Map Key Convert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapKeyConvert()
   * @generated
   * @ordered
   */
  protected String mapKeyConvert = MAP_KEY_CONVERT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMapKeyAttributeOverride() <em>Map Key Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMapKeyAttributeOverride()
   * @generated
   * @ordered
   */
  protected EList<AttributeOverride> mapKeyAttributeOverride;

  /**
   * The cached value of the '{@link #getMapKeyAssociationOverride() <em>Map Key Association Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMapKeyAssociationOverride()
   * @generated
   * @ordered
   */
  protected EList<AssociationOverride> mapKeyAssociationOverride;

  /**
   * The cached value of the '{@link #getMapKeyColumn() <em>Map Key Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyColumn()
   * @generated
   * @ordered
   */
  protected MapKeyColumn mapKeyColumn;

  /**
   * The cached value of the '{@link #getMapKeyJoinColumn() <em>Map Key Join Column</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMapKeyJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<MapKeyJoinColumn> mapKeyJoinColumn;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected Column column;

  /**
   * The default value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
  protected static final TemporalType TEMPORAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
  protected TemporalType temporal = TEMPORAL_EDEFAULT;

  /**
   * The default value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected static final EnumType ENUMERATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected EnumType enumerated = ENUMERATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getLob() <em>Lob</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLob()
   * @generated
   * @ordered
   */
  protected Lob lob;

  /**
   * The default value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getConvert()
   * @generated
   * @ordered
   */
  protected static final String CONVERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getConvert()
   * @generated
   * @ordered
   */
  protected String convert = CONVERT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getAttributeOverride()
   * @generated
   * @ordered
   */
  protected EList<AttributeOverride> attributeOverride;

  /**
   * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getAssociationOverride()
   * @generated
   * @ordered
   */
  protected EList<AssociationOverride> associationOverride;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected FeatureMap group;

  /**
   * The cached value of the '{@link #getCollectionTable() <em>Collection Table</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCollectionTable()
   * @generated
   * @ordered
   */
  protected CollectionTable collectionTable;

  /**
   * The default value of the '{@link #isCascadeOnDelete() <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isCascadeOnDelete()
   * @generated
   * @ordered
   */
  protected static final boolean CASCADE_ON_DELETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCascadeOnDelete() <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isCascadeOnDelete()
   * @generated
   * @ordered
   */
  protected boolean cascadeOnDelete = CASCADE_ON_DELETE_EDEFAULT;

  /**
   * This is true if the Cascade On Delete attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean cascadeOnDeleteESet;

  /**
   * The default value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getJoinFetch()
   * @generated
   * @ordered
   */
  protected static final JoinFetchType JOIN_FETCH_EDEFAULT = JoinFetchType.INNER;

  /**
   * The cached value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getJoinFetch()
   * @generated
   * @ordered
   */
  protected JoinFetchType joinFetch = JOIN_FETCH_EDEFAULT;

  /**
   * This is true if the Join Fetch attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean joinFetchESet;

  /**
   * The cached value of the '{@link #getBatchFetch() <em>Batch Fetch</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getBatchFetch()
   * @generated
   * @ordered
   */
  protected BatchFetch batchFetch;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
  protected AccessMethods accessMethods;

  /**
   * The cached value of the '{@link #getNoncacheable() <em>Noncacheable</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNoncacheable()
   * @generated
   * @ordered
   */
  protected EmptyType noncacheable;

  /**
   * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPartitioning()
   * @generated
   * @ordered
   */
  protected Partitioning partitioning;

  /**
   * The cached value of the '{@link #getReplicationPartitioning() <em>Replication Partitioning</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getReplicationPartitioning()
   * @generated
   * @ordered
   */
  protected ReplicationPartitioning replicationPartitioning;

  /**
   * The cached value of the '{@link #getRoundRobinPartitioning() <em>Round Robin Partitioning</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getRoundRobinPartitioning()
   * @generated
   * @ordered
   */
  protected RoundRobinPartitioning roundRobinPartitioning;

  /**
   * The cached value of the '{@link #getPinnedPartitioning() <em>Pinned Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPinnedPartitioning()
   * @generated
   * @ordered
   */
  protected PinnedPartitioning pinnedPartitioning;

  /**
   * The cached value of the '{@link #getRangePartitioning() <em>Range Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRangePartitioning()
   * @generated
   * @ordered
   */
  protected RangePartitioning rangePartitioning;

  /**
   * The cached value of the '{@link #getValuePartitioning() <em>Value Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getValuePartitioning()
   * @generated
   * @ordered
   */
  protected ValuePartitioning valuePartitioning;

  /**
   * The cached value of the '{@link #getHashPartitioning() <em>Hash Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getHashPartitioning()
   * @generated
   * @ordered
   */
  protected HashPartitioning hashPartitioning;

  /**
   * The cached value of the '{@link #getUnionPartitioning() <em>Union Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getUnionPartitioning()
   * @generated
   * @ordered
   */
  protected UnionPartitioning unionPartitioning;

  /**
   * The default value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPartitioned()
   * @generated
   * @ordered
   */
  protected static final String PARTITIONED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPartitioned()
   * @generated
   * @ordered
   */
  protected String partitioned = PARTITIONED_EDEFAULT;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet;

  /**
   * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
  protected String attributeType = ATTRIBUTE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getCompositeMember() <em>Composite Member</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCompositeMember()
   * @generated
   * @ordered
   */
  protected static final String COMPOSITE_MEMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompositeMember() <em>Composite Member</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCompositeMember()
   * @generated
   * @ordered
   */
  protected String compositeMember = COMPOSITE_MEMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected static final FetchType FETCH_EDEFAULT = FetchType.LAZY;

  /**
   * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected FetchType fetch = FETCH_EDEFAULT;

  /**
   * This is true if the Fetch attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean fetchESet;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTargetClass()
   * @generated
   * @ordered
   */
  protected static final String TARGET_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTargetClass()
   * @generated
   * @ordered
   */
  protected String targetClass = TARGET_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ElementCollectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getElementCollection();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getOrderBy() {
    return orderBy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOrderBy(String newOrderBy) {
    String oldOrderBy = orderBy;
    orderBy = newOrderBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ORDER_BY, oldOrderBy, orderBy));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumn getOrderColumn() {
    return orderColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderColumn(OrderColumn newOrderColumn, NotificationChain msgs) {
    OrderColumn oldOrderColumn = orderColumn;
    orderColumn = newOrderColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN, oldOrderColumn, newOrderColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOrderColumn(OrderColumn newOrderColumn) {
    if (newOrderColumn != orderColumn) {
      NotificationChain msgs = null;
      if (orderColumn != null)
        msgs = ((InternalEObject)orderColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN, null, msgs);
      if (newOrderColumn != null)
        msgs = ((InternalEObject)newOrderColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN, null, msgs);
      msgs = basicSetOrderColumn(newOrderColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN, newOrderColumn, newOrderColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKey getMapKey() {
    return mapKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKey(MapKey newMapKey, NotificationChain msgs) {
    MapKey oldMapKey = mapKey;
    mapKey = newMapKey;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY, oldMapKey, newMapKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMapKey(MapKey newMapKey) {
    if (newMapKey != mapKey) {
      NotificationChain msgs = null;
      if (mapKey != null)
        msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__MAP_KEY, null, msgs);
      if (newMapKey != null)
        msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__MAP_KEY, null, msgs);
      msgs = basicSetMapKey(newMapKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY, newMapKey, newMapKey));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyClass getMapKeyClass() {
    return mapKeyClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKeyClass(MapKeyClass newMapKeyClass, NotificationChain msgs) {
    MapKeyClass oldMapKeyClass = mapKeyClass;
    mapKeyClass = newMapKeyClass;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS, oldMapKeyClass, newMapKeyClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMapKeyClass(MapKeyClass newMapKeyClass) {
    if (newMapKeyClass != mapKeyClass) {
      NotificationChain msgs = null;
      if (mapKeyClass != null)
        msgs = ((InternalEObject)mapKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS, null, msgs);
      if (newMapKeyClass != null)
        msgs = ((InternalEObject)newMapKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS, null, msgs);
      msgs = basicSetMapKeyClass(newMapKeyClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS, newMapKeyClass, newMapKeyClass));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType getMapKeyTemporal() {
    return mapKeyTemporal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMapKeyTemporal(TemporalType newMapKeyTemporal) {
    TemporalType oldMapKeyTemporal = mapKeyTemporal;
    mapKeyTemporal = newMapKeyTemporal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_TEMPORAL, oldMapKeyTemporal, mapKeyTemporal));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType getMapKeyEnumerated() {
    return mapKeyEnumerated;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMapKeyEnumerated(EnumType newMapKeyEnumerated) {
    EnumType oldMapKeyEnumerated = mapKeyEnumerated;
    mapKeyEnumerated = newMapKeyEnumerated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ENUMERATED, oldMapKeyEnumerated, mapKeyEnumerated));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getMapKeyConvert() {
    return mapKeyConvert;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMapKeyConvert(String newMapKeyConvert) {
    String oldMapKeyConvert = mapKeyConvert;
    mapKeyConvert = newMapKeyConvert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CONVERT, oldMapKeyConvert, mapKeyConvert));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeOverride> getMapKeyAttributeOverride() {
    if (mapKeyAttributeOverride == null) {
      mapKeyAttributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE);
    }
    return mapKeyAttributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AssociationOverride> getMapKeyAssociationOverride() {
    if (mapKeyAssociationOverride == null) {
      mapKeyAssociationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE);
    }
    return mapKeyAssociationOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyColumn getMapKeyColumn() {
    return mapKeyColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKeyColumn(MapKeyColumn newMapKeyColumn, NotificationChain msgs) {
    MapKeyColumn oldMapKeyColumn = mapKeyColumn;
    mapKeyColumn = newMapKeyColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN, oldMapKeyColumn, newMapKeyColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMapKeyColumn(MapKeyColumn newMapKeyColumn) {
    if (newMapKeyColumn != mapKeyColumn) {
      NotificationChain msgs = null;
      if (mapKeyColumn != null)
        msgs = ((InternalEObject)mapKeyColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN, null, msgs);
      if (newMapKeyColumn != null)
        msgs = ((InternalEObject)newMapKeyColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN, null, msgs);
      msgs = basicSetMapKeyColumn(newMapKeyColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN, newMapKeyColumn, newMapKeyColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MapKeyJoinColumn> getMapKeyJoinColumn() {
    if (mapKeyJoinColumn == null) {
      mapKeyJoinColumn = new EObjectContainmentEList<MapKeyJoinColumn>(MapKeyJoinColumn.class, this, OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN);
    }
    return mapKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column getColumn() {
    return column;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
    Column oldColumn = column;
    column = newColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__COLUMN, oldColumn, newColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(Column newColumn) {
    if (newColumn != column) {
      NotificationChain msgs = null;
      if (column != null)
        msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__COLUMN, null, msgs);
      if (newColumn != null)
        msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__COLUMN, null, msgs);
      msgs = basicSetColumn(newColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__COLUMN, newColumn, newColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType getTemporal() {
    return temporal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTemporal(TemporalType newTemporal) {
    TemporalType oldTemporal = temporal;
    temporal = newTemporal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__TEMPORAL, oldTemporal, temporal));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType getEnumerated() {
    return enumerated;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnumerated(EnumType newEnumerated) {
    EnumType oldEnumerated = enumerated;
    enumerated = newEnumerated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ENUMERATED, oldEnumerated, enumerated));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Lob getLob() {
    return lob;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLob(Lob newLob, NotificationChain msgs) {
    Lob oldLob = lob;
    lob = newLob;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__LOB, oldLob, newLob);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLob(Lob newLob) {
    if (newLob != lob) {
      NotificationChain msgs = null;
      if (lob != null)
        msgs = ((InternalEObject)lob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__LOB, null, msgs);
      if (newLob != null)
        msgs = ((InternalEObject)newLob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__LOB, null, msgs);
      msgs = basicSetLob(newLob, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__LOB, newLob, newLob));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getConvert() {
    return convert;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConvert(String newConvert) {
    String oldConvert = convert;
    convert = newConvert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__CONVERT, oldConvert, convert));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeOverride> getAttributeOverride() {
    if (attributeOverride == null) {
      attributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE);
    }
    return attributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AssociationOverride> getAssociationOverride() {
    if (associationOverride == null) {
      associationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE);
    }
    return associationOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, OrmPackage.ELEMENT_COLLECTION__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Converter> getConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getElementCollection_Converter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeConverter> getTypeConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getElementCollection_TypeConverter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getElementCollection_ObjectTypeConverter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<StructConverter> getStructConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getElementCollection_StructConverter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CollectionTable getCollectionTable() {
    return collectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollectionTable(CollectionTable newCollectionTable, NotificationChain msgs) {
    CollectionTable oldCollectionTable = collectionTable;
    collectionTable = newCollectionTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCollectionTable(CollectionTable newCollectionTable) {
    if (newCollectionTable != collectionTable) {
      NotificationChain msgs = null;
      if (collectionTable != null)
        msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE, null, msgs);
      if (newCollectionTable != null)
        msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE, null, msgs);
      msgs = basicSetCollectionTable(newCollectionTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCascadeOnDelete() {
    return cascadeOnDelete;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCascadeOnDelete(boolean newCascadeOnDelete) {
    boolean oldCascadeOnDelete = cascadeOnDelete;
    cascadeOnDelete = newCascadeOnDelete;
    boolean oldCascadeOnDeleteESet = cascadeOnDeleteESet;
    cascadeOnDeleteESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE, oldCascadeOnDelete, cascadeOnDelete, !oldCascadeOnDeleteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCascadeOnDelete() {
    boolean oldCascadeOnDelete = cascadeOnDelete;
    boolean oldCascadeOnDeleteESet = cascadeOnDeleteESet;
    cascadeOnDelete = CASCADE_ON_DELETE_EDEFAULT;
    cascadeOnDeleteESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE, oldCascadeOnDelete, CASCADE_ON_DELETE_EDEFAULT, oldCascadeOnDeleteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCascadeOnDelete() {
    return cascadeOnDeleteESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinFetchType getJoinFetch() {
    return joinFetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJoinFetch(JoinFetchType newJoinFetch) {
    JoinFetchType oldJoinFetch = joinFetch;
    joinFetch = newJoinFetch == null ? JOIN_FETCH_EDEFAULT : newJoinFetch;
    boolean oldJoinFetchESet = joinFetchESet;
    joinFetchESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH, oldJoinFetch, joinFetch, !oldJoinFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetJoinFetch() {
    JoinFetchType oldJoinFetch = joinFetch;
    boolean oldJoinFetchESet = joinFetchESet;
    joinFetch = JOIN_FETCH_EDEFAULT;
    joinFetchESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH, oldJoinFetch, JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetJoinFetch() {
    return joinFetchESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BatchFetch getBatchFetch() {
    return batchFetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBatchFetch(BatchFetch newBatchFetch, NotificationChain msgs) {
    BatchFetch oldBatchFetch = batchFetch;
    batchFetch = newBatchFetch;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH, oldBatchFetch, newBatchFetch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setBatchFetch(BatchFetch newBatchFetch) {
    if (newBatchFetch != batchFetch) {
      NotificationChain msgs = null;
      if (batchFetch != null)
        msgs = ((InternalEObject)batchFetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH, null, msgs);
      if (newBatchFetch != null)
        msgs = ((InternalEObject)newBatchFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH, null, msgs);
      msgs = basicSetBatchFetch(newBatchFetch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH, newBatchFetch, newBatchFetch));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.ELEMENT_COLLECTION__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessMethods getAccessMethods() {
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null)
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType getNoncacheable() {
    return noncacheable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNoncacheable(EmptyType newNoncacheable, NotificationChain msgs) {
    EmptyType oldNoncacheable = noncacheable;
    noncacheable = newNoncacheable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE, oldNoncacheable, newNoncacheable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNoncacheable(EmptyType newNoncacheable) {
    if (newNoncacheable != noncacheable) {
      NotificationChain msgs = null;
      if (noncacheable != null)
        msgs = ((InternalEObject)noncacheable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE, null, msgs);
      if (newNoncacheable != null)
        msgs = ((InternalEObject)newNoncacheable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE, null, msgs);
      msgs = basicSetNoncacheable(newNoncacheable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE, newNoncacheable, newNoncacheable));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Partitioning getPartitioning() {
    return partitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPartitioning(Partitioning newPartitioning, NotificationChain msgs) {
    Partitioning oldPartitioning = partitioning;
    partitioning = newPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__PARTITIONING, oldPartitioning, newPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPartitioning(Partitioning newPartitioning) {
    if (newPartitioning != partitioning) {
      NotificationChain msgs = null;
      if (partitioning != null)
        msgs = ((InternalEObject)partitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__PARTITIONING, null, msgs);
      if (newPartitioning != null)
        msgs = ((InternalEObject)newPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__PARTITIONING, null, msgs);
      msgs = basicSetPartitioning(newPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__PARTITIONING, newPartitioning, newPartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReplicationPartitioning getReplicationPartitioning() {
    return replicationPartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning,
      NotificationChain msgs) {
    ReplicationPartitioning oldReplicationPartitioning = replicationPartitioning;
    replicationPartitioning = newReplicationPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING, oldReplicationPartitioning, newReplicationPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning) {
    if (newReplicationPartitioning != replicationPartitioning) {
      NotificationChain msgs = null;
      if (replicationPartitioning != null)
        msgs = ((InternalEObject)replicationPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING, null, msgs);
      if (newReplicationPartitioning != null)
        msgs = ((InternalEObject)newReplicationPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING, null, msgs);
      msgs = basicSetReplicationPartitioning(newReplicationPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING, newReplicationPartitioning, newReplicationPartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RoundRobinPartitioning getRoundRobinPartitioning() {
    return roundRobinPartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning,
      NotificationChain msgs) {
    RoundRobinPartitioning oldRoundRobinPartitioning = roundRobinPartitioning;
    roundRobinPartitioning = newRoundRobinPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING, oldRoundRobinPartitioning, newRoundRobinPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning) {
    if (newRoundRobinPartitioning != roundRobinPartitioning) {
      NotificationChain msgs = null;
      if (roundRobinPartitioning != null)
        msgs = ((InternalEObject)roundRobinPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING, null, msgs);
      if (newRoundRobinPartitioning != null)
        msgs = ((InternalEObject)newRoundRobinPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING, null, msgs);
      msgs = basicSetRoundRobinPartitioning(newRoundRobinPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING, newRoundRobinPartitioning, newRoundRobinPartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PinnedPartitioning getPinnedPartitioning() {
    return pinnedPartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPinnedPartitioning(PinnedPartitioning newPinnedPartitioning, NotificationChain msgs) {
    PinnedPartitioning oldPinnedPartitioning = pinnedPartitioning;
    pinnedPartitioning = newPinnedPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING, oldPinnedPartitioning, newPinnedPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPinnedPartitioning(PinnedPartitioning newPinnedPartitioning) {
    if (newPinnedPartitioning != pinnedPartitioning) {
      NotificationChain msgs = null;
      if (pinnedPartitioning != null)
        msgs = ((InternalEObject)pinnedPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING, null, msgs);
      if (newPinnedPartitioning != null)
        msgs = ((InternalEObject)newPinnedPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING, null, msgs);
      msgs = basicSetPinnedPartitioning(newPinnedPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING, newPinnedPartitioning, newPinnedPartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RangePartitioning getRangePartitioning() {
    return rangePartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRangePartitioning(RangePartitioning newRangePartitioning, NotificationChain msgs) {
    RangePartitioning oldRangePartitioning = rangePartitioning;
    rangePartitioning = newRangePartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING, oldRangePartitioning, newRangePartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRangePartitioning(RangePartitioning newRangePartitioning) {
    if (newRangePartitioning != rangePartitioning) {
      NotificationChain msgs = null;
      if (rangePartitioning != null)
        msgs = ((InternalEObject)rangePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING, null, msgs);
      if (newRangePartitioning != null)
        msgs = ((InternalEObject)newRangePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING, null, msgs);
      msgs = basicSetRangePartitioning(newRangePartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING, newRangePartitioning, newRangePartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ValuePartitioning getValuePartitioning() {
    return valuePartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuePartitioning(ValuePartitioning newValuePartitioning, NotificationChain msgs) {
    ValuePartitioning oldValuePartitioning = valuePartitioning;
    valuePartitioning = newValuePartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING, oldValuePartitioning, newValuePartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValuePartitioning(ValuePartitioning newValuePartitioning) {
    if (newValuePartitioning != valuePartitioning) {
      NotificationChain msgs = null;
      if (valuePartitioning != null)
        msgs = ((InternalEObject)valuePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING, null, msgs);
      if (newValuePartitioning != null)
        msgs = ((InternalEObject)newValuePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING, null, msgs);
      msgs = basicSetValuePartitioning(newValuePartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING, newValuePartitioning, newValuePartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HashPartitioning getHashPartitioning() {
    return hashPartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHashPartitioning(HashPartitioning newHashPartitioning, NotificationChain msgs) {
    HashPartitioning oldHashPartitioning = hashPartitioning;
    hashPartitioning = newHashPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING, oldHashPartitioning, newHashPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHashPartitioning(HashPartitioning newHashPartitioning) {
    if (newHashPartitioning != hashPartitioning) {
      NotificationChain msgs = null;
      if (hashPartitioning != null)
        msgs = ((InternalEObject)hashPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING, null, msgs);
      if (newHashPartitioning != null)
        msgs = ((InternalEObject)newHashPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING, null, msgs);
      msgs = basicSetHashPartitioning(newHashPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING, newHashPartitioning, newHashPartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public UnionPartitioning getUnionPartitioning() {
    return unionPartitioning;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnionPartitioning(UnionPartitioning newUnionPartitioning, NotificationChain msgs) {
    UnionPartitioning oldUnionPartitioning = unionPartitioning;
    unionPartitioning = newUnionPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING, oldUnionPartitioning, newUnionPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUnionPartitioning(UnionPartitioning newUnionPartitioning) {
    if (newUnionPartitioning != unionPartitioning) {
      NotificationChain msgs = null;
      if (unionPartitioning != null)
        msgs = ((InternalEObject)unionPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING, null, msgs);
      if (newUnionPartitioning != null)
        msgs = ((InternalEObject)newUnionPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING, null, msgs);
      msgs = basicSetUnionPartitioning(newUnionPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING, newUnionPartitioning, newUnionPartitioning));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getPartitioned() {
    return partitioned;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPartitioned(String newPartitioned) {
    String oldPartitioned = partitioned;
    partitioned = newPartitioned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__PARTITIONED, oldPartitioned, partitioned));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ELEMENT_COLLECTION__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeType() {
    return attributeType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeType(String newAttributeType) {
    String oldAttributeType = attributeType;
    attributeType = newAttributeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getCompositeMember() {
    return compositeMember;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCompositeMember(String newCompositeMember) {
    String oldCompositeMember = compositeMember;
    compositeMember = newCompositeMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__COMPOSITE_MEMBER, oldCompositeMember, compositeMember));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType getFetch() {
    return fetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFetch(FetchType newFetch) {
    FetchType oldFetch = fetch;
    fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
    boolean oldFetchESet = fetchESet;
    fetchESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__FETCH, oldFetch, fetch, !oldFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetFetch() {
    FetchType oldFetch = fetch;
    boolean oldFetchESet = fetchESet;
    fetch = FETCH_EDEFAULT;
    fetchESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ELEMENT_COLLECTION__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFetch() {
    return fetchESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTargetClass() {
    return targetClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTargetClass(String newTargetClass) {
    String oldTargetClass = targetClass;
    targetClass = newTargetClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ELEMENT_COLLECTION__TARGET_CLASS, oldTargetClass, targetClass));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN:
        return basicSetOrderColumn(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY:
        return basicSetMapKey(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS:
        return basicSetMapKeyClass(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE:
        return ((InternalEList<?>)getMapKeyAttributeOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE:
        return ((InternalEList<?>)getMapKeyAssociationOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN:
        return basicSetMapKeyColumn(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN:
        return ((InternalEList<?>)getMapKeyJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__COLUMN:
        return basicSetColumn(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__LOB:
        return basicSetLob(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE:
        return ((InternalEList<?>)getAttributeOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE:
        return ((InternalEList<?>)getAssociationOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__CONVERTER:
        return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__TYPE_CONVERTER:
        return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__OBJECT_TYPE_CONVERTER:
        return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__STRUCT_CONVERTER:
        return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE:
        return basicSetCollectionTable(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH:
        return basicSetBatchFetch(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE:
        return basicSetNoncacheable(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONING:
        return basicSetPartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING:
        return basicSetReplicationPartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING:
        return basicSetRoundRobinPartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING:
        return basicSetPinnedPartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING:
        return basicSetRangePartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING:
        return basicSetValuePartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING:
        return basicSetHashPartitioning(null, msgs);
      case OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING:
        return basicSetUnionPartitioning(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ELEMENT_COLLECTION__ORDER_BY:
        return getOrderBy();
      case OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN:
        return getOrderColumn();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY:
        return getMapKey();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS:
        return getMapKeyClass();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_TEMPORAL:
        return getMapKeyTemporal();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ENUMERATED:
        return getMapKeyEnumerated();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CONVERT:
        return getMapKeyConvert();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE:
        return getMapKeyAttributeOverride();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE:
        return getMapKeyAssociationOverride();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN:
        return getMapKeyColumn();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN:
        return getMapKeyJoinColumn();
      case OrmPackage.ELEMENT_COLLECTION__COLUMN:
        return getColumn();
      case OrmPackage.ELEMENT_COLLECTION__TEMPORAL:
        return getTemporal();
      case OrmPackage.ELEMENT_COLLECTION__ENUMERATED:
        return getEnumerated();
      case OrmPackage.ELEMENT_COLLECTION__LOB:
        return getLob();
      case OrmPackage.ELEMENT_COLLECTION__CONVERT:
        return getConvert();
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE:
        return getAttributeOverride();
      case OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE:
        return getAssociationOverride();
      case OrmPackage.ELEMENT_COLLECTION__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case OrmPackage.ELEMENT_COLLECTION__CONVERTER:
        return getConverter();
      case OrmPackage.ELEMENT_COLLECTION__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.ELEMENT_COLLECTION__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.ELEMENT_COLLECTION__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE:
        return getCollectionTable();
      case OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE:
        return isCascadeOnDelete();
      case OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH:
        return getJoinFetch();
      case OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH:
        return getBatchFetch();
      case OrmPackage.ELEMENT_COLLECTION__PROPERTY:
        return getProperty();
      case OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE:
        return getNoncacheable();
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONING:
        return getPartitioning();
      case OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING:
        return getReplicationPartitioning();
      case OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING:
        return getRoundRobinPartitioning();
      case OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING:
        return getPinnedPartitioning();
      case OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING:
        return getRangePartitioning();
      case OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING:
        return getValuePartitioning();
      case OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING:
        return getHashPartitioning();
      case OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING:
        return getUnionPartitioning();
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONED:
        return getPartitioned();
      case OrmPackage.ELEMENT_COLLECTION__ACCESS:
        return getAccess();
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_TYPE:
        return getAttributeType();
      case OrmPackage.ELEMENT_COLLECTION__COMPOSITE_MEMBER:
        return getCompositeMember();
      case OrmPackage.ELEMENT_COLLECTION__FETCH:
        return getFetch();
      case OrmPackage.ELEMENT_COLLECTION__NAME:
        return getName();
      case OrmPackage.ELEMENT_COLLECTION__TARGET_CLASS:
        return getTargetClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.ELEMENT_COLLECTION__ORDER_BY:
        setOrderBy((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN:
        setOrderColumn((OrderColumn)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY:
        setMapKey((MapKey)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS:
        setMapKeyClass((MapKeyClass)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_TEMPORAL:
        setMapKeyTemporal((TemporalType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ENUMERATED:
        setMapKeyEnumerated((EnumType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CONVERT:
        setMapKeyConvert((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE:
        getMapKeyAttributeOverride().clear();
        getMapKeyAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE:
        getMapKeyAssociationOverride().clear();
        getMapKeyAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN:
        setMapKeyColumn((MapKeyColumn)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN:
        getMapKeyJoinColumn().clear();
        getMapKeyJoinColumn().addAll((Collection<? extends MapKeyJoinColumn>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__COLUMN:
        setColumn((Column)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__TEMPORAL:
        setTemporal((TemporalType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ENUMERATED:
        setEnumerated((EnumType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__LOB:
        setLob((Lob)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__CONVERT:
        setConvert((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        getAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        getAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__CONVERTER:
        getConverter().clear();
        getConverter().addAll((Collection<? extends Converter>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__TYPE_CONVERTER:
        getTypeConverter().clear();
        getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__STRUCT_CONVERTER:
        getStructConverter().clear();
        getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE:
        setCollectionTable((CollectionTable)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE:
        setCascadeOnDelete((Boolean)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH:
        setJoinFetch((JoinFetchType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH:
        setBatchFetch((BatchFetch)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE:
        setNoncacheable((EmptyType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONING:
        setPartitioning((Partitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING:
        setReplicationPartitioning((ReplicationPartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING:
        setRoundRobinPartitioning((RoundRobinPartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING:
        setPinnedPartitioning((PinnedPartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING:
        setRangePartitioning((RangePartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING:
        setValuePartitioning((ValuePartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING:
        setHashPartitioning((HashPartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING:
        setUnionPartitioning((UnionPartitioning)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONED:
        setPartitioned((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_TYPE:
        setAttributeType((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__COMPOSITE_MEMBER:
        setCompositeMember((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__FETCH:
        setFetch((FetchType)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.ELEMENT_COLLECTION__TARGET_CLASS:
        setTargetClass((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.ELEMENT_COLLECTION__ORDER_BY:
        setOrderBy(ORDER_BY_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN:
        setOrderColumn((OrderColumn)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY:
        setMapKey((MapKey)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS:
        setMapKeyClass((MapKeyClass)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_TEMPORAL:
        setMapKeyTemporal(MAP_KEY_TEMPORAL_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ENUMERATED:
        setMapKeyEnumerated(MAP_KEY_ENUMERATED_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CONVERT:
        setMapKeyConvert(MAP_KEY_CONVERT_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE:
        getMapKeyAttributeOverride().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE:
        getMapKeyAssociationOverride().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN:
        setMapKeyColumn((MapKeyColumn)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN:
        getMapKeyJoinColumn().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__COLUMN:
        setColumn((Column)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__TEMPORAL:
        setTemporal(TEMPORAL_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ENUMERATED:
        setEnumerated(ENUMERATED_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__LOB:
        setLob((Lob)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__CONVERT:
        setConvert(CONVERT_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__GROUP:
        getGroup().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__CONVERTER:
        getConverter().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__TYPE_CONVERTER:
        getTypeConverter().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__STRUCT_CONVERTER:
        getStructConverter().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE:
        setCollectionTable((CollectionTable)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE:
        unsetCascadeOnDelete();
        return;
      case OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH:
        unsetJoinFetch();
        return;
      case OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH:
        setBatchFetch((BatchFetch)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE:
        setNoncacheable((EmptyType)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONING:
        setPartitioning((Partitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING:
        setReplicationPartitioning((ReplicationPartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING:
        setRoundRobinPartitioning((RoundRobinPartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING:
        setPinnedPartitioning((PinnedPartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING:
        setRangePartitioning((RangePartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING:
        setValuePartitioning((ValuePartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING:
        setHashPartitioning((HashPartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING:
        setUnionPartitioning((UnionPartitioning)null);
        return;
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONED:
        setPartitioned(PARTITIONED_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_TYPE:
        setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__COMPOSITE_MEMBER:
        setCompositeMember(COMPOSITE_MEMBER_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__FETCH:
        unsetFetch();
        return;
      case OrmPackage.ELEMENT_COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.ELEMENT_COLLECTION__TARGET_CLASS:
        setTargetClass(TARGET_CLASS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.ELEMENT_COLLECTION__ORDER_BY:
        return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
      case OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN:
        return orderColumn != null;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY:
        return mapKey != null;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS:
        return mapKeyClass != null;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_TEMPORAL:
        return MAP_KEY_TEMPORAL_EDEFAULT == null ? mapKeyTemporal != null : !MAP_KEY_TEMPORAL_EDEFAULT.equals(mapKeyTemporal);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ENUMERATED:
        return MAP_KEY_ENUMERATED_EDEFAULT == null ? mapKeyEnumerated != null : !MAP_KEY_ENUMERATED_EDEFAULT.equals(mapKeyEnumerated);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CONVERT:
        return MAP_KEY_CONVERT_EDEFAULT == null ? mapKeyConvert != null : !MAP_KEY_CONVERT_EDEFAULT.equals(mapKeyConvert);
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE:
        return mapKeyAttributeOverride != null && !mapKeyAttributeOverride.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE:
        return mapKeyAssociationOverride != null && !mapKeyAssociationOverride.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN:
        return mapKeyColumn != null;
      case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN:
        return mapKeyJoinColumn != null && !mapKeyJoinColumn.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__COLUMN:
        return column != null;
      case OrmPackage.ELEMENT_COLLECTION__TEMPORAL:
        return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
      case OrmPackage.ELEMENT_COLLECTION__ENUMERATED:
        return ENUMERATED_EDEFAULT == null ? enumerated != null : !ENUMERATED_EDEFAULT.equals(enumerated);
      case OrmPackage.ELEMENT_COLLECTION__LOB:
        return lob != null;
      case OrmPackage.ELEMENT_COLLECTION__CONVERT:
        return CONVERT_EDEFAULT == null ? convert != null : !CONVERT_EDEFAULT.equals(convert);
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE:
        return attributeOverride != null && !attributeOverride.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE:
        return associationOverride != null && !associationOverride.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__GROUP:
        return group != null && !group.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__CONVERTER:
        return !getConverter().isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__TYPE_CONVERTER:
        return !getTypeConverter().isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__OBJECT_TYPE_CONVERTER:
        return !getObjectTypeConverter().isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__STRUCT_CONVERTER:
        return !getStructConverter().isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE:
        return collectionTable != null;
      case OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE:
        return isSetCascadeOnDelete();
      case OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH:
        return isSetJoinFetch();
      case OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH:
        return batchFetch != null;
      case OrmPackage.ELEMENT_COLLECTION__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE:
        return noncacheable != null;
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONING:
        return partitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING:
        return replicationPartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING:
        return roundRobinPartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING:
        return pinnedPartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING:
        return rangePartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING:
        return valuePartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING:
        return hashPartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING:
        return unionPartitioning != null;
      case OrmPackage.ELEMENT_COLLECTION__PARTITIONED:
        return PARTITIONED_EDEFAULT == null ? partitioned != null : !PARTITIONED_EDEFAULT.equals(partitioned);
      case OrmPackage.ELEMENT_COLLECTION__ACCESS:
        return isSetAccess();
      case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_TYPE:
        return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
      case OrmPackage.ELEMENT_COLLECTION__COMPOSITE_MEMBER:
        return COMPOSITE_MEMBER_EDEFAULT == null ? compositeMember != null : !COMPOSITE_MEMBER_EDEFAULT.equals(compositeMember);
      case OrmPackage.ELEMENT_COLLECTION__FETCH:
        return isSetFetch();
      case OrmPackage.ELEMENT_COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.ELEMENT_COLLECTION__TARGET_CLASS:
        return TARGET_CLASS_EDEFAULT == null ? targetClass != null : !TARGET_CLASS_EDEFAULT.equals(targetClass);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (orderBy: "); //$NON-NLS-1$
    result.append(orderBy);
    result.append(", mapKeyTemporal: "); //$NON-NLS-1$
    result.append(mapKeyTemporal);
    result.append(", mapKeyEnumerated: "); //$NON-NLS-1$
    result.append(mapKeyEnumerated);
    result.append(", mapKeyConvert: "); //$NON-NLS-1$
    result.append(mapKeyConvert);
    result.append(", temporal: "); //$NON-NLS-1$
    result.append(temporal);
    result.append(", enumerated: "); //$NON-NLS-1$
    result.append(enumerated);
    result.append(", convert: "); //$NON-NLS-1$
    result.append(convert);
    result.append(", group: "); //$NON-NLS-1$
    result.append(group);
    result.append(", cascadeOnDelete: "); //$NON-NLS-1$
    if (cascadeOnDeleteESet) result.append(cascadeOnDelete); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", joinFetch: "); //$NON-NLS-1$
    if (joinFetchESet) result.append(joinFetch); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", partitioned: "); //$NON-NLS-1$
    result.append(partitioned);
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", attributeType: "); //$NON-NLS-1$
    result.append(attributeType);
    result.append(", compositeMember: "); //$NON-NLS-1$
    result.append(compositeMember);
    result.append(", fetch: "); //$NON-NLS-1$
    if (fetchESet) result.append(fetch); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", targetClass: "); //$NON-NLS-1$
    result.append(targetClass);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    // features.add(OrmPackage.eINSTANCE.getElementCollection_Convert());
    features.add(OrmPackage.eINSTANCE.getElementCollection_Fetch());
    features.add(OrmPackage.eINSTANCE.getElementCollection_TargetClass());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }
} // ElementCollectionImpl
