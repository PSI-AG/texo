/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityMappingsTypeImpl.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata;
import org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.SupportedVersionsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartitioning;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity Mappings Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getTenantDiscriminator <em>Tenant Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getNamedStoredFunctionQuery <em>Named Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getNamedPlsqlStoredProcedureQuery <em>Named Plsql Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getNamedPlsqlStoredFunctionQuery <em>Named Plsql Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getPlsqlRecord <em>Plsql Record</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getPlsqlTable <em>Plsql Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getMappedSuperclass <em>Mapped Superclass</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityMappingsTypeImpl extends BaseOrmAnnotationImpl implements EntityMappingsType {
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPersistenceUnitMetadata() <em>Persistence Unit Metadata</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getPersistenceUnitMetadata()
   * @generated
   * @ordered
   */
  protected PersistenceUnitMetadata persistenceUnitMetadata;

  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected static final String SCHEMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected String schema = SCHEMA_EDEFAULT;

  /**
   * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCatalog()
   * @generated
   * @ordered
   */
  protected static final String CATALOG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCatalog()
   * @generated
   * @ordered
   */
  protected String catalog = CATALOG_EDEFAULT;

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
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
	protected AccessMethods accessMethods;

		/**
   * The cached value of the '{@link #getTenantDiscriminator() <em>Tenant Discriminator</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTenantDiscriminator()
   * @generated
   * @ordered
   */
	protected EList<TenantDiscriminator> tenantDiscriminator;

		/**
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected EList<Converter> converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<TypeConverter> typeConverter;

  /**
   * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getObjectTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<ObjectTypeConverter> objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected EList<StructConverter> structConverter;

  /**
   * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getSequenceGenerator()
   * @generated
   * @ordered
   */
  protected EList<SequenceGenerator> sequenceGenerator;

  /**
   * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTableGenerator()
   * @generated
   * @ordered
   */
  protected EList<TableGenerator> tableGenerator;

  /**
   * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPartitioning()
   * @generated
   * @ordered
   */
	protected EList<Partitioning> partitioning;

		/**
   * The cached value of the '{@link #getReplicationPartitioning() <em>Replication Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReplicationPartitioning()
   * @generated
   * @ordered
   */
	protected EList<ReplicationPartitioning> replicationPartitioning;

		/**
   * The cached value of the '{@link #getRoundRobinPartitioning() <em>Round Robin Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRoundRobinPartitioning()
   * @generated
   * @ordered
   */
	protected EList<RoundRobinPartitioning> roundRobinPartitioning;

		/**
   * The cached value of the '{@link #getPinnedPartitioning() <em>Pinned Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPinnedPartitioning()
   * @generated
   * @ordered
   */
	protected EList<PinnedPartitioning> pinnedPartitioning;

		/**
   * The cached value of the '{@link #getRangePartitioning() <em>Range Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRangePartitioning()
   * @generated
   * @ordered
   */
	protected EList<RangePartitioning> rangePartitioning;

		/**
   * The cached value of the '{@link #getValuePartitioning() <em>Value Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValuePartitioning()
   * @generated
   * @ordered
   */
	protected EList<ValuePartitioning> valuePartitioning;

		/**
   * The cached value of the '{@link #getHashPartitioning() <em>Hash Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHashPartitioning()
   * @generated
   * @ordered
   */
	protected EList<HashPartitioning> hashPartitioning;

		/**
   * The cached value of the '{@link #getUnionPartitioning() <em>Union Partitioning</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnionPartitioning()
   * @generated
   * @ordered
   */
	protected EList<UnionPartitioning> unionPartitioning;

		/**
   * The cached value of the '{@link #getNamedQuery() <em>Named Query</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNamedQuery()
   * @generated
   * @ordered
   */
  protected EList<NamedQuery> namedQuery;

  /**
   * The cached value of the '{@link #getNamedNativeQuery() <em>Named Native Query</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNamedNativeQuery()
   * @generated
   * @ordered
   */
  protected EList<NamedNativeQuery> namedNativeQuery;

  /**
   * The cached value of the '{@link #getNamedStoredProcedureQuery() <em>Named Stored Procedure Query</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNamedStoredProcedureQuery()
   * @generated
   * @ordered
   */
  protected EList<NamedStoredProcedureQuery> namedStoredProcedureQuery;

  /**
   * The cached value of the '{@link #getNamedStoredFunctionQuery() <em>Named Stored Function Query</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNamedStoredFunctionQuery()
   * @generated
   * @ordered
   */
	protected EList<NamedStoredFunctionQuery> namedStoredFunctionQuery;

		/**
   * The cached value of the '{@link #getNamedPlsqlStoredProcedureQuery() <em>Named Plsql Stored Procedure Query</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNamedPlsqlStoredProcedureQuery()
   * @generated
   * @ordered
   */
	protected EList<NamedPlsqlStoredProcedureQuery> namedPlsqlStoredProcedureQuery;

		/**
   * The cached value of the '{@link #getNamedPlsqlStoredFunctionQuery() <em>Named Plsql Stored Function Query</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNamedPlsqlStoredFunctionQuery()
   * @generated
   * @ordered
   */
	protected EList<NamedPlsqlStoredFunctionQuery> namedPlsqlStoredFunctionQuery;

		/**
   * The cached value of the '{@link #getPlsqlRecord() <em>Plsql Record</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlsqlRecord()
   * @generated
   * @ordered
   */
	protected EList<PlsqlRecord> plsqlRecord;

		/**
   * The cached value of the '{@link #getPlsqlTable() <em>Plsql Table</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlsqlTable()
   * @generated
   * @ordered
   */
	protected EList<PlsqlTable> plsqlTable;

		/**
   * The cached value of the '{@link #getSqlResultSetMapping() <em>Sql Result Set Mapping</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getSqlResultSetMapping()
   * @generated
   * @ordered
   */
  protected EList<SqlResultSetMapping> sqlResultSetMapping;

  /**
   * The cached value of the '{@link #getMappedSuperclass() <em>Mapped Superclass</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMappedSuperclass()
   * @generated
   * @ordered
   */
  protected EList<MappedSuperclass> mappedSuperclass;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EList<Entity> entity;

  /**
   * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getEmbeddable()
   * @generated
   * @ordered
   */
  protected EList<Embeddable> embeddable;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final SupportedVersionsType VERSION_EDEFAULT = SupportedVersionsType._23;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected SupportedVersionsType version = VERSION_EDEFAULT;

  /**
   * This is true if the Version attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean versionESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EntityMappingsTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getEntityMappingsType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PersistenceUnitMetadata getPersistenceUnitMetadata() {
    return persistenceUnitMetadata;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersistenceUnitMetadata(PersistenceUnitMetadata newPersistenceUnitMetadata,
      NotificationChain msgs) {
    PersistenceUnitMetadata oldPersistenceUnitMetadata = persistenceUnitMetadata;
    persistenceUnitMetadata = newPersistenceUnitMetadata;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, oldPersistenceUnitMetadata, newPersistenceUnitMetadata);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPersistenceUnitMetadata(PersistenceUnitMetadata newPersistenceUnitMetadata) {
    if (newPersistenceUnitMetadata != persistenceUnitMetadata) {
      NotificationChain msgs = null;
      if (persistenceUnitMetadata != null)
        msgs = ((InternalEObject)persistenceUnitMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, null, msgs);
      if (newPersistenceUnitMetadata != null)
        msgs = ((InternalEObject)newPersistenceUnitMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, null, msgs);
      msgs = basicSetPersistenceUnitMetadata(newPersistenceUnitMetadata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, newPersistenceUnitMetadata, newPersistenceUnitMetadata));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getPackage() {
    return package_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage) {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getSchema() {
    return schema;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(String newSchema) {
    String oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCatalog(String newCatalog) {
    String oldCatalog = catalog;
    catalog = newCatalog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG, oldCatalog, catalog));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
	public AccessMethods getAccessMethods() {
    return accessMethods;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null)
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TenantDiscriminator> getTenantDiscriminator() {
    if (tenantDiscriminator == null) {
      tenantDiscriminator = new EObjectContainmentEList<TenantDiscriminator>(TenantDiscriminator.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR);
    }
    return tenantDiscriminator;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Converter> getConverter() {
    if (converter == null) {
      converter = new EObjectContainmentEList<Converter>(Converter.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER);
    }
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeConverter> getTypeConverter() {
    if (typeConverter == null) {
      typeConverter = new EObjectContainmentEList<TypeConverter>(TypeConverter.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER);
    }
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
    if (objectTypeConverter == null) {
      objectTypeConverter = new EObjectContainmentEList<ObjectTypeConverter>(ObjectTypeConverter.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER);
    }
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<StructConverter> getStructConverter() {
    if (structConverter == null) {
      structConverter = new EObjectContainmentEList<StructConverter>(StructConverter.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER);
    }
    return structConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<SequenceGenerator> getSequenceGenerator() {
    if (sequenceGenerator == null) {
      sequenceGenerator = new EObjectContainmentEList<SequenceGenerator>(SequenceGenerator.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR);
    }
    return sequenceGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<TableGenerator> getTableGenerator() {
    if (tableGenerator == null) {
      tableGenerator = new EObjectContainmentEList<TableGenerator>(TableGenerator.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR);
    }
    return tableGenerator;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Partitioning> getPartitioning() {
    if (partitioning == null) {
      partitioning = new EObjectContainmentEList<Partitioning>(Partitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING);
    }
    return partitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ReplicationPartitioning> getReplicationPartitioning() {
    if (replicationPartitioning == null) {
      replicationPartitioning = new EObjectContainmentEList<ReplicationPartitioning>(ReplicationPartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING);
    }
    return replicationPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RoundRobinPartitioning> getRoundRobinPartitioning() {
    if (roundRobinPartitioning == null) {
      roundRobinPartitioning = new EObjectContainmentEList<RoundRobinPartitioning>(RoundRobinPartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING);
    }
    return roundRobinPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PinnedPartitioning> getPinnedPartitioning() {
    if (pinnedPartitioning == null) {
      pinnedPartitioning = new EObjectContainmentEList<PinnedPartitioning>(PinnedPartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING);
    }
    return pinnedPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RangePartitioning> getRangePartitioning() {
    if (rangePartitioning == null) {
      rangePartitioning = new EObjectContainmentEList<RangePartitioning>(RangePartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING);
    }
    return rangePartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ValuePartitioning> getValuePartitioning() {
    if (valuePartitioning == null) {
      valuePartitioning = new EObjectContainmentEList<ValuePartitioning>(ValuePartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING);
    }
    return valuePartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<HashPartitioning> getHashPartitioning() {
    if (hashPartitioning == null) {
      hashPartitioning = new EObjectContainmentEList<HashPartitioning>(HashPartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING);
    }
    return hashPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<UnionPartitioning> getUnionPartitioning() {
    if (unionPartitioning == null) {
      unionPartitioning = new EObjectContainmentEList<UnionPartitioning>(UnionPartitioning.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING);
    }
    return unionPartitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedQuery> getNamedQuery() {
    if (namedQuery == null) {
      namedQuery = new EObjectContainmentEList<NamedQuery>(NamedQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY);
    }
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedNativeQuery> getNamedNativeQuery() {
    if (namedNativeQuery == null) {
      namedNativeQuery = new EObjectContainmentEList<NamedNativeQuery>(NamedNativeQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY);
    }
    return namedNativeQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedStoredProcedureQuery> getNamedStoredProcedureQuery() {
    if (namedStoredProcedureQuery == null) {
      namedStoredProcedureQuery = new EObjectContainmentEList<NamedStoredProcedureQuery>(NamedStoredProcedureQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY);
    }
    return namedStoredProcedureQuery;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NamedStoredFunctionQuery> getNamedStoredFunctionQuery() {
    if (namedStoredFunctionQuery == null) {
      namedStoredFunctionQuery = new EObjectContainmentEList<NamedStoredFunctionQuery>(NamedStoredFunctionQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY);
    }
    return namedStoredFunctionQuery;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NamedPlsqlStoredProcedureQuery> getNamedPlsqlStoredProcedureQuery() {
    if (namedPlsqlStoredProcedureQuery == null) {
      namedPlsqlStoredProcedureQuery = new EObjectContainmentEList<NamedPlsqlStoredProcedureQuery>(NamedPlsqlStoredProcedureQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY);
    }
    return namedPlsqlStoredProcedureQuery;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NamedPlsqlStoredFunctionQuery> getNamedPlsqlStoredFunctionQuery() {
    if (namedPlsqlStoredFunctionQuery == null) {
      namedPlsqlStoredFunctionQuery = new EObjectContainmentEList<NamedPlsqlStoredFunctionQuery>(NamedPlsqlStoredFunctionQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY);
    }
    return namedPlsqlStoredFunctionQuery;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PlsqlRecord> getPlsqlRecord() {
    if (plsqlRecord == null) {
      plsqlRecord = new EObjectContainmentEList<PlsqlRecord>(PlsqlRecord.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD);
    }
    return plsqlRecord;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PlsqlTable> getPlsqlTable() {
    if (plsqlTable == null) {
      plsqlTable = new EObjectContainmentEList<PlsqlTable>(PlsqlTable.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE);
    }
    return plsqlTable;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<SqlResultSetMapping> getSqlResultSetMapping() {
    if (sqlResultSetMapping == null) {
      sqlResultSetMapping = new EObjectContainmentEList<SqlResultSetMapping>(SqlResultSetMapping.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING);
    }
    return sqlResultSetMapping;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MappedSuperclass> getMappedSuperclass() {
    if (mappedSuperclass == null) {
      mappedSuperclass = new EObjectContainmentEList<MappedSuperclass>(MappedSuperclass.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS);
    }
    return mappedSuperclass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntity() {
    if (entity == null) {
      entity = new EObjectContainmentEList<Entity>(Entity.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY);
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Embeddable> getEmbeddable() {
    if (embeddable == null) {
      embeddable = new EObjectContainmentEList<Embeddable>(Embeddable.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE);
    }
    return embeddable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SupportedVersionsType getVersion() {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVersion(SupportedVersionsType newVersion) {
    SupportedVersionsType oldVersion = version;
    version = newVersion == null ? VERSION_EDEFAULT : newVersion;
    boolean oldVersionESet = versionESet;
    versionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION, oldVersion, version, !oldVersionESet));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetVersion() {
    SupportedVersionsType oldVersion = version;
    boolean oldVersionESet = versionESet;
    version = VERSION_EDEFAULT;
    versionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetVersion() {
    return versionESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
        return basicSetPersistenceUnitMetadata(null, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR:
        return ((InternalEList<?>)getTenantDiscriminator()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER:
        return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER:
        return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER:
        return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER:
        return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
        return ((InternalEList<?>)getSequenceGenerator()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
        return ((InternalEList<?>)getTableGenerator()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING:
        return ((InternalEList<?>)getPartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING:
        return ((InternalEList<?>)getReplicationPartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING:
        return ((InternalEList<?>)getRoundRobinPartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING:
        return ((InternalEList<?>)getPinnedPartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING:
        return ((InternalEList<?>)getRangePartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING:
        return ((InternalEList<?>)getValuePartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING:
        return ((InternalEList<?>)getHashPartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING:
        return ((InternalEList<?>)getUnionPartitioning()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
        return ((InternalEList<?>)getNamedQuery()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
        return ((InternalEList<?>)getNamedNativeQuery()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY:
        return ((InternalEList<?>)getNamedStoredProcedureQuery()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY:
        return ((InternalEList<?>)getNamedStoredFunctionQuery()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
        return ((InternalEList<?>)getNamedPlsqlStoredProcedureQuery()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY:
        return ((InternalEList<?>)getNamedPlsqlStoredFunctionQuery()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD:
        return ((InternalEList<?>)getPlsqlRecord()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE:
        return ((InternalEList<?>)getPlsqlTable()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
        return ((InternalEList<?>)getSqlResultSetMapping()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
        return ((InternalEList<?>)getMappedSuperclass()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
        return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
        return ((InternalEList<?>)getEmbeddable()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
        return getDescription();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
        return getPersistenceUnitMetadata();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
        return getPackage();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
        return getSchema();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
        return getCatalog();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
        return getAccess();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR:
        return getTenantDiscriminator();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER:
        return getConverter();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
        return getSequenceGenerator();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
        return getTableGenerator();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING:
        return getPartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING:
        return getReplicationPartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING:
        return getRoundRobinPartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING:
        return getPinnedPartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING:
        return getRangePartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING:
        return getValuePartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING:
        return getHashPartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING:
        return getUnionPartitioning();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
        return getNamedQuery();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
        return getNamedNativeQuery();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY:
        return getNamedStoredProcedureQuery();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY:
        return getNamedStoredFunctionQuery();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
        return getNamedPlsqlStoredProcedureQuery();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY:
        return getNamedPlsqlStoredFunctionQuery();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD:
        return getPlsqlRecord();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE:
        return getPlsqlTable();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
        return getSqlResultSetMapping();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
        return getMappedSuperclass();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
        return getEntity();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
        return getEmbeddable();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
        return getVersion();
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
      case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
        setPersistenceUnitMetadata((PersistenceUnitMetadata)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
        setPackage((String)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
        setSchema((String)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
        setCatalog((String)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR:
        getTenantDiscriminator().clear();
        getTenantDiscriminator().addAll((Collection<? extends TenantDiscriminator>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER:
        getConverter().clear();
        getConverter().addAll((Collection<? extends Converter>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER:
        getTypeConverter().clear();
        getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER:
        getStructConverter().clear();
        getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
        getSequenceGenerator().clear();
        getSequenceGenerator().addAll((Collection<? extends SequenceGenerator>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
        getTableGenerator().clear();
        getTableGenerator().addAll((Collection<? extends TableGenerator>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING:
        getPartitioning().clear();
        getPartitioning().addAll((Collection<? extends Partitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING:
        getReplicationPartitioning().clear();
        getReplicationPartitioning().addAll((Collection<? extends ReplicationPartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING:
        getRoundRobinPartitioning().clear();
        getRoundRobinPartitioning().addAll((Collection<? extends RoundRobinPartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING:
        getPinnedPartitioning().clear();
        getPinnedPartitioning().addAll((Collection<? extends PinnedPartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING:
        getRangePartitioning().clear();
        getRangePartitioning().addAll((Collection<? extends RangePartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING:
        getValuePartitioning().clear();
        getValuePartitioning().addAll((Collection<? extends ValuePartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING:
        getHashPartitioning().clear();
        getHashPartitioning().addAll((Collection<? extends HashPartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING:
        getUnionPartitioning().clear();
        getUnionPartitioning().addAll((Collection<? extends UnionPartitioning>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
        getNamedQuery().clear();
        getNamedQuery().addAll((Collection<? extends NamedQuery>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
        getNamedNativeQuery().clear();
        getNamedNativeQuery().addAll((Collection<? extends NamedNativeQuery>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY:
        getNamedStoredProcedureQuery().clear();
        getNamedStoredProcedureQuery().addAll((Collection<? extends NamedStoredProcedureQuery>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY:
        getNamedStoredFunctionQuery().clear();
        getNamedStoredFunctionQuery().addAll((Collection<? extends NamedStoredFunctionQuery>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
        getNamedPlsqlStoredProcedureQuery().clear();
        getNamedPlsqlStoredProcedureQuery().addAll((Collection<? extends NamedPlsqlStoredProcedureQuery>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY:
        getNamedPlsqlStoredFunctionQuery().clear();
        getNamedPlsqlStoredFunctionQuery().addAll((Collection<? extends NamedPlsqlStoredFunctionQuery>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD:
        getPlsqlRecord().clear();
        getPlsqlRecord().addAll((Collection<? extends PlsqlRecord>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE:
        getPlsqlTable().clear();
        getPlsqlTable().addAll((Collection<? extends PlsqlTable>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
        getSqlResultSetMapping().clear();
        getSqlResultSetMapping().addAll((Collection<? extends SqlResultSetMapping>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
        getMappedSuperclass().clear();
        getMappedSuperclass().addAll((Collection<? extends MappedSuperclass>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
        getEntity().clear();
        getEntity().addAll((Collection<? extends Entity>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
        getEmbeddable().clear();
        getEmbeddable().addAll((Collection<? extends Embeddable>)newValue);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
        setVersion((SupportedVersionsType)newValue);
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
      case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
        setPersistenceUnitMetadata((PersistenceUnitMetadata)null);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
        setCatalog(CATALOG_EDEFAULT);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR:
        getTenantDiscriminator().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER:
        getConverter().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER:
        getTypeConverter().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER:
        getStructConverter().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
        getSequenceGenerator().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
        getTableGenerator().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING:
        getPartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING:
        getReplicationPartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING:
        getRoundRobinPartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING:
        getPinnedPartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING:
        getRangePartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING:
        getValuePartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING:
        getHashPartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING:
        getUnionPartitioning().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
        getNamedQuery().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
        getNamedNativeQuery().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY:
        getNamedStoredProcedureQuery().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY:
        getNamedStoredFunctionQuery().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
        getNamedPlsqlStoredProcedureQuery().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY:
        getNamedPlsqlStoredFunctionQuery().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD:
        getPlsqlRecord().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE:
        getPlsqlTable().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
        getSqlResultSetMapping().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
        getMappedSuperclass().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
        getEntity().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
        getEmbeddable().clear();
        return;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
        unsetVersion();
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
      case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
        return persistenceUnitMetadata != null;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
        return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
        return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
        return isSetAccess();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR:
        return tenantDiscriminator != null && !tenantDiscriminator.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER:
        return converter != null && !converter.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER:
        return typeConverter != null && !typeConverter.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER:
        return objectTypeConverter != null && !objectTypeConverter.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER:
        return structConverter != null && !structConverter.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
        return sequenceGenerator != null && !sequenceGenerator.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
        return tableGenerator != null && !tableGenerator.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING:
        return partitioning != null && !partitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING:
        return replicationPartitioning != null && !replicationPartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING:
        return roundRobinPartitioning != null && !roundRobinPartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING:
        return pinnedPartitioning != null && !pinnedPartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING:
        return rangePartitioning != null && !rangePartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING:
        return valuePartitioning != null && !valuePartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING:
        return hashPartitioning != null && !hashPartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING:
        return unionPartitioning != null && !unionPartitioning.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
        return namedQuery != null && !namedQuery.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
        return namedNativeQuery != null && !namedNativeQuery.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY:
        return namedStoredProcedureQuery != null && !namedStoredProcedureQuery.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY:
        return namedStoredFunctionQuery != null && !namedStoredFunctionQuery.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
        return namedPlsqlStoredProcedureQuery != null && !namedPlsqlStoredProcedureQuery.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY:
        return namedPlsqlStoredFunctionQuery != null && !namedPlsqlStoredFunctionQuery.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD:
        return plsqlRecord != null && !plsqlRecord.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE:
        return plsqlTable != null && !plsqlTable.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
        return sqlResultSetMapping != null && !sqlResultSetMapping.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
        return mappedSuperclass != null && !mappedSuperclass.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
        return entity != null && !entity.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
        return embeddable != null && !embeddable.isEmpty();
      case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
        return isSetVersion();
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
    result.append(" (description: "); //$NON-NLS-1$
    result.append(description);
    result.append(", package: "); //$NON-NLS-1$
    result.append(package_);
    result.append(", schema: "); //$NON-NLS-1$
    result.append(schema);
    result.append(", catalog: "); //$NON-NLS-1$
    result.append(catalog);
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", version: "); //$NON-NLS-1$
    if (versionESet) result.append(version); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // EntityMappingsTypeImpl
