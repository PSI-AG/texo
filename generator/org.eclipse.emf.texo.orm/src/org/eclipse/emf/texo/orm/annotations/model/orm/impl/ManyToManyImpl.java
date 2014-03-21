/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToManyImpl.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch;
import org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Many To Many</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyClass <em>Map Key Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyTemporal <em>Map Key Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyEnumerated <em>Map Key Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyConvert <em>Map Key Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyAssociationOverride <em>Map Key Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyColumn <em>Map Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMapKeyJoinColumn <em>Map Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#isCascadeOnDelete <em>Cascade On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getBatchFetch <em>Batch Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getNoncacheable <em>Noncacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getPartitioned <em>Partitioned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToManyImpl extends BaseOrmAnnotationImpl implements ManyToMany {
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
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected Converter converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected TypeConverter typeConverter;

  /**
   * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getObjectTypeConverter()
   * @generated
   * @ordered
   */
  protected ObjectTypeConverter objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected StructConverter structConverter;

  /**
   * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getJoinTable()
   * @generated
   * @ordered
   */
  protected JoinTable joinTable;

  /**
   * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected CascadeType cascade;

  /**
   * The default value of the '{@link #isCascadeOnDelete() <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isCascadeOnDelete()
   * @generated
   * @ordered
   */
	protected static final boolean CASCADE_ON_DELETE_EDEFAULT = false;

		/**
   * The cached value of the '{@link #isCascadeOnDelete() <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isCascadeOnDelete()
   * @generated
   * @ordered
   */
	protected boolean cascadeOnDelete = CASCADE_ON_DELETE_EDEFAULT;

		/**
   * This is true if the Cascade On Delete attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * The cached value of the '{@link #getNoncacheable() <em>Noncacheable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNoncacheable()
   * @generated
   * @ordered
   */
	protected EmptyType noncacheable;

		/**
   * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPartitioning()
   * @generated
   * @ordered
   */
	protected Partitioning partitioning;

		/**
   * The cached value of the '{@link #getReplicationPartitioning() <em>Replication Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReplicationPartitioning()
   * @generated
   * @ordered
   */
	protected ReplicationPartitioning replicationPartitioning;

		/**
   * The cached value of the '{@link #getRoundRobinPartitioning() <em>Round Robin Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRoundRobinPartitioning()
   * @generated
   * @ordered
   */
	protected RoundRobinPartitioning roundRobinPartitioning;

		/**
   * The cached value of the '{@link #getPinnedPartitioning() <em>Pinned Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPinnedPartitioning()
   * @generated
   * @ordered
   */
	protected PinnedPartitioning pinnedPartitioning;

		/**
   * The cached value of the '{@link #getRangePartitioning() <em>Range Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRangePartitioning()
   * @generated
   * @ordered
   */
	protected RangePartitioning rangePartitioning;

		/**
   * The cached value of the '{@link #getValuePartitioning() <em>Value Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValuePartitioning()
   * @generated
   * @ordered
   */
	protected ValuePartitioning valuePartitioning;

		/**
   * The cached value of the '{@link #getHashPartitioning() <em>Hash Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHashPartitioning()
   * @generated
   * @ordered
   */
	protected HashPartitioning hashPartitioning;

		/**
   * The cached value of the '{@link #getUnionPartitioning() <em>Union Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnionPartitioning()
   * @generated
   * @ordered
   */
	protected UnionPartitioning unionPartitioning;

		/**
   * The default value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPartitioned()
   * @generated
   * @ordered
   */
	protected static final String PARTITIONED_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * The default value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected String mappedBy = MAPPED_BY_EDEFAULT;

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
   * The default value of the '{@link #getTargetEntity() <em>Target Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEntity()
   * @generated
   * @ordered
   */
  protected static final String TARGET_ENTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTargetEntity()
   * @generated
   * @ordered
   */
  protected String targetEntity = TARGET_ENTITY_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ManyToManyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getManyToMany();
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ORDER_BY, oldOrderBy, orderBy));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ORDER_COLUMN, oldOrderColumn, newOrderColumn);
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
        msgs = ((InternalEObject)orderColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__ORDER_COLUMN, null, msgs);
      if (newOrderColumn != null)
        msgs = ((InternalEObject)newOrderColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__ORDER_COLUMN, null, msgs);
      msgs = basicSetOrderColumn(newOrderColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ORDER_COLUMN, newOrderColumn, newOrderColumn));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY, oldMapKey, newMapKey);
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
        msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__MAP_KEY, null, msgs);
      if (newMapKey != null)
        msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__MAP_KEY, null, msgs);
      msgs = basicSetMapKey(newMapKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY, newMapKey, newMapKey));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS, oldMapKeyClass, newMapKeyClass);
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
        msgs = ((InternalEObject)mapKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS, null, msgs);
      if (newMapKeyClass != null)
        msgs = ((InternalEObject)newMapKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS, null, msgs);
      msgs = basicSetMapKeyClass(newMapKeyClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS, newMapKeyClass, newMapKeyClass));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType getMapKeyTemporal() {
    return mapKeyTemporal;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMapKeyTemporal(TemporalType newMapKeyTemporal) {
    TemporalType oldMapKeyTemporal = mapKeyTemporal;
    mapKeyTemporal = newMapKeyTemporal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_TEMPORAL, oldMapKeyTemporal, mapKeyTemporal));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType getMapKeyEnumerated() {
    return mapKeyEnumerated;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMapKeyEnumerated(EnumType newMapKeyEnumerated) {
    EnumType oldMapKeyEnumerated = mapKeyEnumerated;
    mapKeyEnumerated = newMapKeyEnumerated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_ENUMERATED, oldMapKeyEnumerated, mapKeyEnumerated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_CONVERT, oldMapKeyConvert, mapKeyConvert));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeOverride> getMapKeyAttributeOverride() {
    if (mapKeyAttributeOverride == null) {
      mapKeyAttributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE);
    }
    return mapKeyAttributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AssociationOverride> getMapKeyAssociationOverride() {
    if (mapKeyAssociationOverride == null) {
      mapKeyAssociationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN, oldMapKeyColumn, newMapKeyColumn);
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
        msgs = ((InternalEObject)mapKeyColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN, null, msgs);
      if (newMapKeyColumn != null)
        msgs = ((InternalEObject)newMapKeyColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN, null, msgs);
      msgs = basicSetMapKeyColumn(newMapKeyColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN, newMapKeyColumn, newMapKeyColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MapKeyJoinColumn> getMapKeyJoinColumn() {
    if (mapKeyJoinColumn == null) {
      mapKeyJoinColumn = new EObjectContainmentEList<MapKeyJoinColumn>(MapKeyJoinColumn.class, this, OrmPackage.MANY_TO_MANY__MAP_KEY_JOIN_COLUMN);
    }
    return mapKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Converter getConverter() {
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConverter(Converter newConverter, NotificationChain msgs) {
    Converter oldConverter = converter;
    converter = newConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__CONVERTER, oldConverter, newConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConverter(Converter newConverter) {
    if (newConverter != converter) {
      NotificationChain msgs = null;
      if (converter != null)
        msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__CONVERTER, null, msgs);
      if (newConverter != null)
        msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__CONVERTER, null, msgs);
      msgs = basicSetConverter(newConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__CONVERTER, newConverter, newConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypeConverter getTypeConverter() {
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeConverter(TypeConverter newTypeConverter, NotificationChain msgs) {
    TypeConverter oldTypeConverter = typeConverter;
    typeConverter = newTypeConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__TYPE_CONVERTER, oldTypeConverter, newTypeConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTypeConverter(TypeConverter newTypeConverter) {
    if (newTypeConverter != typeConverter) {
      NotificationChain msgs = null;
      if (typeConverter != null)
        msgs = ((InternalEObject)typeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__TYPE_CONVERTER, null, msgs);
      if (newTypeConverter != null)
        msgs = ((InternalEObject)newTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__TYPE_CONVERTER, null, msgs);
      msgs = basicSetTypeConverter(newTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__TYPE_CONVERTER, newTypeConverter, newTypeConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ObjectTypeConverter getObjectTypeConverter() {
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectTypeConverter(ObjectTypeConverter newObjectTypeConverter,
      NotificationChain msgs) {
    ObjectTypeConverter oldObjectTypeConverter = objectTypeConverter;
    objectTypeConverter = newObjectTypeConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER, oldObjectTypeConverter, newObjectTypeConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setObjectTypeConverter(ObjectTypeConverter newObjectTypeConverter) {
    if (newObjectTypeConverter != objectTypeConverter) {
      NotificationChain msgs = null;
      if (objectTypeConverter != null)
        msgs = ((InternalEObject)objectTypeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER, null, msgs);
      if (newObjectTypeConverter != null)
        msgs = ((InternalEObject)newObjectTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER, null, msgs);
      msgs = basicSetObjectTypeConverter(newObjectTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER, newObjectTypeConverter, newObjectTypeConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StructConverter getStructConverter() {
    return structConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructConverter(StructConverter newStructConverter, NotificationChain msgs) {
    StructConverter oldStructConverter = structConverter;
    structConverter = newStructConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER, oldStructConverter, newStructConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStructConverter(StructConverter newStructConverter) {
    if (newStructConverter != structConverter) {
      NotificationChain msgs = null;
      if (structConverter != null)
        msgs = ((InternalEObject)structConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER, null, msgs);
      if (newStructConverter != null)
        msgs = ((InternalEObject)newStructConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER, null, msgs);
      msgs = basicSetStructConverter(newStructConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER, newStructConverter, newStructConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinTable getJoinTable() {
    return joinTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
    JoinTable oldJoinTable = joinTable;
    joinTable = newJoinTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__JOIN_TABLE, oldJoinTable, newJoinTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJoinTable(JoinTable newJoinTable) {
    if (newJoinTable != joinTable) {
      NotificationChain msgs = null;
      if (joinTable != null)
        msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__JOIN_TABLE, null, msgs);
      if (newJoinTable != null)
        msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__JOIN_TABLE, null, msgs);
      msgs = basicSetJoinTable(newJoinTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__JOIN_TABLE, newJoinTable, newJoinTable));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CascadeType getCascade() {
    return cascade;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCascade(CascadeType newCascade, NotificationChain msgs) {
    CascadeType oldCascade = cascade;
    cascade = newCascade;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__CASCADE, oldCascade, newCascade);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCascade(CascadeType newCascade) {
    if (newCascade != cascade) {
      NotificationChain msgs = null;
      if (cascade != null)
        msgs = ((InternalEObject)cascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__CASCADE, null, msgs);
      if (newCascade != null)
        msgs = ((InternalEObject)newCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__CASCADE, null, msgs);
      msgs = basicSetCascade(newCascade, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__CASCADE, newCascade, newCascade));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isCascadeOnDelete() {
    return cascadeOnDelete;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCascadeOnDelete(boolean newCascadeOnDelete) {
    boolean oldCascadeOnDelete = cascadeOnDelete;
    cascadeOnDelete = newCascadeOnDelete;
    boolean oldCascadeOnDeleteESet = cascadeOnDeleteESet;
    cascadeOnDeleteESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__CASCADE_ON_DELETE, oldCascadeOnDelete, cascadeOnDelete, !oldCascadeOnDeleteESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetCascadeOnDelete() {
    boolean oldCascadeOnDelete = cascadeOnDelete;
    boolean oldCascadeOnDeleteESet = cascadeOnDeleteESet;
    cascadeOnDelete = CASCADE_ON_DELETE_EDEFAULT;
    cascadeOnDeleteESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_MANY__CASCADE_ON_DELETE, oldCascadeOnDelete, CASCADE_ON_DELETE_EDEFAULT, oldCascadeOnDeleteESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__JOIN_FETCH, oldJoinFetch, joinFetch, !oldJoinFetchESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_MANY__JOIN_FETCH, oldJoinFetch, JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetJoinFetch() {
    return joinFetchESet;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BatchFetch getBatchFetch() {
    return batchFetch;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBatchFetch(BatchFetch newBatchFetch, NotificationChain msgs) {
    BatchFetch oldBatchFetch = batchFetch;
    batchFetch = newBatchFetch;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__BATCH_FETCH, oldBatchFetch, newBatchFetch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBatchFetch(BatchFetch newBatchFetch) {
    if (newBatchFetch != batchFetch) {
      NotificationChain msgs = null;
      if (batchFetch != null)
        msgs = ((InternalEObject)batchFetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__BATCH_FETCH, null, msgs);
      if (newBatchFetch != null)
        msgs = ((InternalEObject)newBatchFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__BATCH_FETCH, null, msgs);
      msgs = basicSetBatchFetch(newBatchFetch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__BATCH_FETCH, newBatchFetch, newBatchFetch));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.MANY_TO_MANY__PROPERTY);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EmptyType getNoncacheable() {
    return noncacheable;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNoncacheable(EmptyType newNoncacheable, NotificationChain msgs) {
    EmptyType oldNoncacheable = noncacheable;
    noncacheable = newNoncacheable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__NONCACHEABLE, oldNoncacheable, newNoncacheable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNoncacheable(EmptyType newNoncacheable) {
    if (newNoncacheable != noncacheable) {
      NotificationChain msgs = null;
      if (noncacheable != null)
        msgs = ((InternalEObject)noncacheable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__NONCACHEABLE, null, msgs);
      if (newNoncacheable != null)
        msgs = ((InternalEObject)newNoncacheable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__NONCACHEABLE, null, msgs);
      msgs = basicSetNoncacheable(newNoncacheable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__NONCACHEABLE, newNoncacheable, newNoncacheable));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Partitioning getPartitioning() {
    return partitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPartitioning(Partitioning newPartitioning, NotificationChain msgs) {
    Partitioning oldPartitioning = partitioning;
    partitioning = newPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__PARTITIONING, oldPartitioning, newPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPartitioning(Partitioning newPartitioning) {
    if (newPartitioning != partitioning) {
      NotificationChain msgs = null;
      if (partitioning != null)
        msgs = ((InternalEObject)partitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__PARTITIONING, null, msgs);
      if (newPartitioning != null)
        msgs = ((InternalEObject)newPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__PARTITIONING, null, msgs);
      msgs = basicSetPartitioning(newPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__PARTITIONING, newPartitioning, newPartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReplicationPartitioning getReplicationPartitioning() {
    return replicationPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning, NotificationChain msgs) {
    ReplicationPartitioning oldReplicationPartitioning = replicationPartitioning;
    replicationPartitioning = newReplicationPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING, oldReplicationPartitioning, newReplicationPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning) {
    if (newReplicationPartitioning != replicationPartitioning) {
      NotificationChain msgs = null;
      if (replicationPartitioning != null)
        msgs = ((InternalEObject)replicationPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING, null, msgs);
      if (newReplicationPartitioning != null)
        msgs = ((InternalEObject)newReplicationPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING, null, msgs);
      msgs = basicSetReplicationPartitioning(newReplicationPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING, newReplicationPartitioning, newReplicationPartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RoundRobinPartitioning getRoundRobinPartitioning() {
    return roundRobinPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning, NotificationChain msgs) {
    RoundRobinPartitioning oldRoundRobinPartitioning = roundRobinPartitioning;
    roundRobinPartitioning = newRoundRobinPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING, oldRoundRobinPartitioning, newRoundRobinPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning) {
    if (newRoundRobinPartitioning != roundRobinPartitioning) {
      NotificationChain msgs = null;
      if (roundRobinPartitioning != null)
        msgs = ((InternalEObject)roundRobinPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING, null, msgs);
      if (newRoundRobinPartitioning != null)
        msgs = ((InternalEObject)newRoundRobinPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING, null, msgs);
      msgs = basicSetRoundRobinPartitioning(newRoundRobinPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING, newRoundRobinPartitioning, newRoundRobinPartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PinnedPartitioning getPinnedPartitioning() {
    return pinnedPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPinnedPartitioning(PinnedPartitioning newPinnedPartitioning, NotificationChain msgs) {
    PinnedPartitioning oldPinnedPartitioning = pinnedPartitioning;
    pinnedPartitioning = newPinnedPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING, oldPinnedPartitioning, newPinnedPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPinnedPartitioning(PinnedPartitioning newPinnedPartitioning) {
    if (newPinnedPartitioning != pinnedPartitioning) {
      NotificationChain msgs = null;
      if (pinnedPartitioning != null)
        msgs = ((InternalEObject)pinnedPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING, null, msgs);
      if (newPinnedPartitioning != null)
        msgs = ((InternalEObject)newPinnedPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING, null, msgs);
      msgs = basicSetPinnedPartitioning(newPinnedPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING, newPinnedPartitioning, newPinnedPartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RangePartitioning getRangePartitioning() {
    return rangePartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRangePartitioning(RangePartitioning newRangePartitioning, NotificationChain msgs) {
    RangePartitioning oldRangePartitioning = rangePartitioning;
    rangePartitioning = newRangePartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING, oldRangePartitioning, newRangePartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRangePartitioning(RangePartitioning newRangePartitioning) {
    if (newRangePartitioning != rangePartitioning) {
      NotificationChain msgs = null;
      if (rangePartitioning != null)
        msgs = ((InternalEObject)rangePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING, null, msgs);
      if (newRangePartitioning != null)
        msgs = ((InternalEObject)newRangePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING, null, msgs);
      msgs = basicSetRangePartitioning(newRangePartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING, newRangePartitioning, newRangePartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ValuePartitioning getValuePartitioning() {
    return valuePartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetValuePartitioning(ValuePartitioning newValuePartitioning, NotificationChain msgs) {
    ValuePartitioning oldValuePartitioning = valuePartitioning;
    valuePartitioning = newValuePartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING, oldValuePartitioning, newValuePartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValuePartitioning(ValuePartitioning newValuePartitioning) {
    if (newValuePartitioning != valuePartitioning) {
      NotificationChain msgs = null;
      if (valuePartitioning != null)
        msgs = ((InternalEObject)valuePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING, null, msgs);
      if (newValuePartitioning != null)
        msgs = ((InternalEObject)newValuePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING, null, msgs);
      msgs = basicSetValuePartitioning(newValuePartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING, newValuePartitioning, newValuePartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HashPartitioning getHashPartitioning() {
    return hashPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetHashPartitioning(HashPartitioning newHashPartitioning, NotificationChain msgs) {
    HashPartitioning oldHashPartitioning = hashPartitioning;
    hashPartitioning = newHashPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__HASH_PARTITIONING, oldHashPartitioning, newHashPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHashPartitioning(HashPartitioning newHashPartitioning) {
    if (newHashPartitioning != hashPartitioning) {
      NotificationChain msgs = null;
      if (hashPartitioning != null)
        msgs = ((InternalEObject)hashPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__HASH_PARTITIONING, null, msgs);
      if (newHashPartitioning != null)
        msgs = ((InternalEObject)newHashPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__HASH_PARTITIONING, null, msgs);
      msgs = basicSetHashPartitioning(newHashPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__HASH_PARTITIONING, newHashPartitioning, newHashPartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UnionPartitioning getUnionPartitioning() {
    return unionPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetUnionPartitioning(UnionPartitioning newUnionPartitioning, NotificationChain msgs) {
    UnionPartitioning oldUnionPartitioning = unionPartitioning;
    unionPartitioning = newUnionPartitioning;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__UNION_PARTITIONING, oldUnionPartitioning, newUnionPartitioning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnionPartitioning(UnionPartitioning newUnionPartitioning) {
    if (newUnionPartitioning != unionPartitioning) {
      NotificationChain msgs = null;
      if (unionPartitioning != null)
        msgs = ((InternalEObject)unionPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__UNION_PARTITIONING, null, msgs);
      if (newUnionPartitioning != null)
        msgs = ((InternalEObject)newUnionPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_MANY__UNION_PARTITIONING, null, msgs);
      msgs = basicSetUnionPartitioning(newUnionPartitioning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__UNION_PARTITIONING, newUnionPartitioning, newUnionPartitioning));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPartitioned() {
    return partitioned;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPartitioned(String newPartitioned) {
    String oldPartitioned = partitioned;
    partitioned = newPartitioned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__PARTITIONED, oldPartitioned, partitioned));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_MANY__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAttributeType() {
    return attributeType;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAttributeType(String newAttributeType) {
    String oldAttributeType = attributeType;
    attributeType = newAttributeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__FETCH, oldFetch, fetch, !oldFetchESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_MANY__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
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
  public String getMappedBy() {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMappedBy(String newMappedBy) {
    String oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__MAPPED_BY, oldMappedBy, mappedBy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTargetEntity() {
    return targetEntity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTargetEntity(String newTargetEntity) {
    String oldTargetEntity = targetEntity;
    targetEntity = newTargetEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_MANY__TARGET_ENTITY, oldTargetEntity, targetEntity));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.MANY_TO_MANY__ORDER_COLUMN:
        return basicSetOrderColumn(null, msgs);
      case OrmPackage.MANY_TO_MANY__MAP_KEY:
        return basicSetMapKey(null, msgs);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS:
        return basicSetMapKeyClass(null, msgs);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
        return ((InternalEList<?>)getMapKeyAttributeOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
        return ((InternalEList<?>)getMapKeyAssociationOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN:
        return basicSetMapKeyColumn(null, msgs);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_JOIN_COLUMN:
        return ((InternalEList<?>)getMapKeyJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmPackage.MANY_TO_MANY__CONVERTER:
        return basicSetConverter(null, msgs);
      case OrmPackage.MANY_TO_MANY__TYPE_CONVERTER:
        return basicSetTypeConverter(null, msgs);
      case OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER:
        return basicSetObjectTypeConverter(null, msgs);
      case OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER:
        return basicSetStructConverter(null, msgs);
      case OrmPackage.MANY_TO_MANY__JOIN_TABLE:
        return basicSetJoinTable(null, msgs);
      case OrmPackage.MANY_TO_MANY__CASCADE:
        return basicSetCascade(null, msgs);
      case OrmPackage.MANY_TO_MANY__BATCH_FETCH:
        return basicSetBatchFetch(null, msgs);
      case OrmPackage.MANY_TO_MANY__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.MANY_TO_MANY__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.MANY_TO_MANY__NONCACHEABLE:
        return basicSetNoncacheable(null, msgs);
      case OrmPackage.MANY_TO_MANY__PARTITIONING:
        return basicSetPartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING:
        return basicSetReplicationPartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING:
        return basicSetRoundRobinPartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING:
        return basicSetPinnedPartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING:
        return basicSetRangePartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING:
        return basicSetValuePartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__HASH_PARTITIONING:
        return basicSetHashPartitioning(null, msgs);
      case OrmPackage.MANY_TO_MANY__UNION_PARTITIONING:
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
      case OrmPackage.MANY_TO_MANY__ORDER_BY:
        return getOrderBy();
      case OrmPackage.MANY_TO_MANY__ORDER_COLUMN:
        return getOrderColumn();
      case OrmPackage.MANY_TO_MANY__MAP_KEY:
        return getMapKey();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS:
        return getMapKeyClass();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_TEMPORAL:
        return getMapKeyTemporal();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ENUMERATED:
        return getMapKeyEnumerated();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CONVERT:
        return getMapKeyConvert();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
        return getMapKeyAttributeOverride();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
        return getMapKeyAssociationOverride();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN:
        return getMapKeyColumn();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_JOIN_COLUMN:
        return getMapKeyJoinColumn();
      case OrmPackage.MANY_TO_MANY__CONVERTER:
        return getConverter();
      case OrmPackage.MANY_TO_MANY__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.MANY_TO_MANY__JOIN_TABLE:
        return getJoinTable();
      case OrmPackage.MANY_TO_MANY__CASCADE:
        return getCascade();
      case OrmPackage.MANY_TO_MANY__CASCADE_ON_DELETE:
        return isCascadeOnDelete();
      case OrmPackage.MANY_TO_MANY__JOIN_FETCH:
        return getJoinFetch();
      case OrmPackage.MANY_TO_MANY__BATCH_FETCH:
        return getBatchFetch();
      case OrmPackage.MANY_TO_MANY__PROPERTY:
        return getProperty();
      case OrmPackage.MANY_TO_MANY__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.MANY_TO_MANY__NONCACHEABLE:
        return getNoncacheable();
      case OrmPackage.MANY_TO_MANY__PARTITIONING:
        return getPartitioning();
      case OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING:
        return getReplicationPartitioning();
      case OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING:
        return getRoundRobinPartitioning();
      case OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING:
        return getPinnedPartitioning();
      case OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING:
        return getRangePartitioning();
      case OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING:
        return getValuePartitioning();
      case OrmPackage.MANY_TO_MANY__HASH_PARTITIONING:
        return getHashPartitioning();
      case OrmPackage.MANY_TO_MANY__UNION_PARTITIONING:
        return getUnionPartitioning();
      case OrmPackage.MANY_TO_MANY__PARTITIONED:
        return getPartitioned();
      case OrmPackage.MANY_TO_MANY__ACCESS:
        return getAccess();
      case OrmPackage.MANY_TO_MANY__ATTRIBUTE_TYPE:
        return getAttributeType();
      case OrmPackage.MANY_TO_MANY__FETCH:
        return getFetch();
      case OrmPackage.MANY_TO_MANY__MAPPED_BY:
        return getMappedBy();
      case OrmPackage.MANY_TO_MANY__NAME:
        return getName();
      case OrmPackage.MANY_TO_MANY__TARGET_ENTITY:
        return getTargetEntity();
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
      case OrmPackage.MANY_TO_MANY__ORDER_BY:
        setOrderBy((String)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__ORDER_COLUMN:
        setOrderColumn((OrderColumn)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY:
        setMapKey((MapKey)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS:
        setMapKeyClass((MapKeyClass)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_TEMPORAL:
        setMapKeyTemporal((TemporalType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ENUMERATED:
        setMapKeyEnumerated((EnumType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CONVERT:
        setMapKeyConvert((String)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
        getMapKeyAttributeOverride().clear();
        getMapKeyAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
        getMapKeyAssociationOverride().clear();
        getMapKeyAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN:
        setMapKeyColumn((MapKeyColumn)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_JOIN_COLUMN:
        getMapKeyJoinColumn().clear();
        getMapKeyJoinColumn().addAll((Collection<? extends MapKeyJoinColumn>)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__CONVERTER:
        setConverter((Converter)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER:
        setStructConverter((StructConverter)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__JOIN_TABLE:
        setJoinTable((JoinTable)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__CASCADE:
        setCascade((CascadeType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__CASCADE_ON_DELETE:
        setCascadeOnDelete((Boolean)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__JOIN_FETCH:
        setJoinFetch((JoinFetchType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__BATCH_FETCH:
        setBatchFetch((BatchFetch)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__NONCACHEABLE:
        setNoncacheable((EmptyType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__PARTITIONING:
        setPartitioning((Partitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING:
        setReplicationPartitioning((ReplicationPartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING:
        setRoundRobinPartitioning((RoundRobinPartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING:
        setPinnedPartitioning((PinnedPartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING:
        setRangePartitioning((RangePartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING:
        setValuePartitioning((ValuePartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__HASH_PARTITIONING:
        setHashPartitioning((HashPartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__UNION_PARTITIONING:
        setUnionPartitioning((UnionPartitioning)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__PARTITIONED:
        setPartitioned((String)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__ATTRIBUTE_TYPE:
        setAttributeType((String)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__FETCH:
        setFetch((FetchType)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__MAPPED_BY:
        setMappedBy((String)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.MANY_TO_MANY__TARGET_ENTITY:
        setTargetEntity((String)newValue);
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
      case OrmPackage.MANY_TO_MANY__ORDER_BY:
        setOrderBy(ORDER_BY_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__ORDER_COLUMN:
        setOrderColumn((OrderColumn)null);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY:
        setMapKey((MapKey)null);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS:
        setMapKeyClass((MapKeyClass)null);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_TEMPORAL:
        setMapKeyTemporal(MAP_KEY_TEMPORAL_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ENUMERATED:
        setMapKeyEnumerated(MAP_KEY_ENUMERATED_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CONVERT:
        setMapKeyConvert(MAP_KEY_CONVERT_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
        getMapKeyAttributeOverride().clear();
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
        getMapKeyAssociationOverride().clear();
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN:
        setMapKeyColumn((MapKeyColumn)null);
        return;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_JOIN_COLUMN:
        getMapKeyJoinColumn().clear();
        return;
      case OrmPackage.MANY_TO_MANY__CONVERTER:
        setConverter((Converter)null);
        return;
      case OrmPackage.MANY_TO_MANY__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)null);
        return;
      case OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)null);
        return;
      case OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER:
        setStructConverter((StructConverter)null);
        return;
      case OrmPackage.MANY_TO_MANY__JOIN_TABLE:
        setJoinTable((JoinTable)null);
        return;
      case OrmPackage.MANY_TO_MANY__CASCADE:
        setCascade((CascadeType)null);
        return;
      case OrmPackage.MANY_TO_MANY__CASCADE_ON_DELETE:
        unsetCascadeOnDelete();
        return;
      case OrmPackage.MANY_TO_MANY__JOIN_FETCH:
        unsetJoinFetch();
        return;
      case OrmPackage.MANY_TO_MANY__BATCH_FETCH:
        setBatchFetch((BatchFetch)null);
        return;
      case OrmPackage.MANY_TO_MANY__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.MANY_TO_MANY__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.MANY_TO_MANY__NONCACHEABLE:
        setNoncacheable((EmptyType)null);
        return;
      case OrmPackage.MANY_TO_MANY__PARTITIONING:
        setPartitioning((Partitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING:
        setReplicationPartitioning((ReplicationPartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING:
        setRoundRobinPartitioning((RoundRobinPartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING:
        setPinnedPartitioning((PinnedPartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING:
        setRangePartitioning((RangePartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING:
        setValuePartitioning((ValuePartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__HASH_PARTITIONING:
        setHashPartitioning((HashPartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__UNION_PARTITIONING:
        setUnionPartitioning((UnionPartitioning)null);
        return;
      case OrmPackage.MANY_TO_MANY__PARTITIONED:
        setPartitioned(PARTITIONED_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.MANY_TO_MANY__ATTRIBUTE_TYPE:
        setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__FETCH:
        unsetFetch();
        return;
      case OrmPackage.MANY_TO_MANY__MAPPED_BY:
        setMappedBy(MAPPED_BY_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.MANY_TO_MANY__TARGET_ENTITY:
        setTargetEntity(TARGET_ENTITY_EDEFAULT);
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
      case OrmPackage.MANY_TO_MANY__ORDER_BY:
        return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
      case OrmPackage.MANY_TO_MANY__ORDER_COLUMN:
        return orderColumn != null;
      case OrmPackage.MANY_TO_MANY__MAP_KEY:
        return mapKey != null;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CLASS:
        return mapKeyClass != null;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_TEMPORAL:
        return MAP_KEY_TEMPORAL_EDEFAULT == null ? mapKeyTemporal != null : !MAP_KEY_TEMPORAL_EDEFAULT.equals(mapKeyTemporal);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ENUMERATED:
        return MAP_KEY_ENUMERATED_EDEFAULT == null ? mapKeyEnumerated != null : !MAP_KEY_ENUMERATED_EDEFAULT.equals(mapKeyEnumerated);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_CONVERT:
        return MAP_KEY_CONVERT_EDEFAULT == null ? mapKeyConvert != null : !MAP_KEY_CONVERT_EDEFAULT.equals(mapKeyConvert);
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
        return mapKeyAttributeOverride != null && !mapKeyAttributeOverride.isEmpty();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
        return mapKeyAssociationOverride != null && !mapKeyAssociationOverride.isEmpty();
      case OrmPackage.MANY_TO_MANY__MAP_KEY_COLUMN:
        return mapKeyColumn != null;
      case OrmPackage.MANY_TO_MANY__MAP_KEY_JOIN_COLUMN:
        return mapKeyJoinColumn != null && !mapKeyJoinColumn.isEmpty();
      case OrmPackage.MANY_TO_MANY__CONVERTER:
        return converter != null;
      case OrmPackage.MANY_TO_MANY__TYPE_CONVERTER:
        return typeConverter != null;
      case OrmPackage.MANY_TO_MANY__OBJECT_TYPE_CONVERTER:
        return objectTypeConverter != null;
      case OrmPackage.MANY_TO_MANY__STRUCT_CONVERTER:
        return structConverter != null;
      case OrmPackage.MANY_TO_MANY__JOIN_TABLE:
        return joinTable != null;
      case OrmPackage.MANY_TO_MANY__CASCADE:
        return cascade != null;
      case OrmPackage.MANY_TO_MANY__CASCADE_ON_DELETE:
        return isSetCascadeOnDelete();
      case OrmPackage.MANY_TO_MANY__JOIN_FETCH:
        return isSetJoinFetch();
      case OrmPackage.MANY_TO_MANY__BATCH_FETCH:
        return batchFetch != null;
      case OrmPackage.MANY_TO_MANY__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.MANY_TO_MANY__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.MANY_TO_MANY__NONCACHEABLE:
        return noncacheable != null;
      case OrmPackage.MANY_TO_MANY__PARTITIONING:
        return partitioning != null;
      case OrmPackage.MANY_TO_MANY__REPLICATION_PARTITIONING:
        return replicationPartitioning != null;
      case OrmPackage.MANY_TO_MANY__ROUND_ROBIN_PARTITIONING:
        return roundRobinPartitioning != null;
      case OrmPackage.MANY_TO_MANY__PINNED_PARTITIONING:
        return pinnedPartitioning != null;
      case OrmPackage.MANY_TO_MANY__RANGE_PARTITIONING:
        return rangePartitioning != null;
      case OrmPackage.MANY_TO_MANY__VALUE_PARTITIONING:
        return valuePartitioning != null;
      case OrmPackage.MANY_TO_MANY__HASH_PARTITIONING:
        return hashPartitioning != null;
      case OrmPackage.MANY_TO_MANY__UNION_PARTITIONING:
        return unionPartitioning != null;
      case OrmPackage.MANY_TO_MANY__PARTITIONED:
        return PARTITIONED_EDEFAULT == null ? partitioned != null : !PARTITIONED_EDEFAULT.equals(partitioned);
      case OrmPackage.MANY_TO_MANY__ACCESS:
        return isSetAccess();
      case OrmPackage.MANY_TO_MANY__ATTRIBUTE_TYPE:
        return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
      case OrmPackage.MANY_TO_MANY__FETCH:
        return isSetFetch();
      case OrmPackage.MANY_TO_MANY__MAPPED_BY:
        return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
      case OrmPackage.MANY_TO_MANY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.MANY_TO_MANY__TARGET_ENTITY:
        return TARGET_ENTITY_EDEFAULT == null ? targetEntity != null : !TARGET_ENTITY_EDEFAULT.equals(targetEntity);
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
    result.append(", fetch: "); //$NON-NLS-1$
    if (fetchESet) result.append(fetch); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", mappedBy: "); //$NON-NLS-1$
    result.append(mappedBy);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", targetEntity: "); //$NON-NLS-1$
    result.append(targetEntity);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getManyToMany_Cascade());
    features.add(OrmPackage.eINSTANCE.getManyToMany_Fetch());
    features.add(OrmPackage.eINSTANCE.getManyToMany_MappedBy());
    features.add(OrmPackage.eINSTANCE.getManyToMany_TargetEntity());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }

} // ManyToManyImpl
