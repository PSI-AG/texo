/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmFactoryImpl.java,v 1.6 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class OrmFactoryImpl extends EFactoryImpl implements OrmFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static OrmFactory init() {
    try {
      OrmFactory theOrmFactory = (OrmFactory)EPackage.Registry.INSTANCE.getEFactory(OrmPackage.eNS_URI);
      if (theOrmFactory != null) {
        return theOrmFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OrmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case OrmPackage.ACCESS_METHODS: return (EObject)createAccessMethods();
      case OrmPackage.ADDITIONAL_CRITERIA: return (EObject)createAdditionalCriteria();
      case OrmPackage.ARRAY: return (EObject)createArray();
      case OrmPackage.ASSOCIATION_OVERRIDE: return (EObject)createAssociationOverride();
      case OrmPackage.ATTRIBUTE_OVERRIDE: return (EObject)createAttributeOverride();
      case OrmPackage.ATTRIBUTES: return (EObject)createAttributes();
      case OrmPackage.BASIC: return (EObject)createBasic();
      case OrmPackage.BASIC_COLLECTION: return (EObject)createBasicCollection();
      case OrmPackage.BASIC_MAP: return (EObject)createBasicMap();
      case OrmPackage.BATCH_FETCH: return (EObject)createBatchFetch();
      case OrmPackage.CACHE: return (EObject)createCache();
      case OrmPackage.CACHE_INTERCEPTOR: return (EObject)createCacheInterceptor();
      case OrmPackage.CASCADE_TYPE: return (EObject)createCascadeType();
      case OrmPackage.CHANGE_TRACKING: return (EObject)createChangeTracking();
      case OrmPackage.CLASS_EXTRACTOR: return (EObject)createClassExtractor();
      case OrmPackage.CLONE_COPY_POLICY: return (EObject)createCloneCopyPolicy();
      case OrmPackage.COLLECTION_TABLE: return (EObject)createCollectionTable();
      case OrmPackage.COLUMN: return (EObject)createColumn();
      case OrmPackage.COLUMN_RESULT: return (EObject)createColumnResult();
      case OrmPackage.CONVERSION_VALUE: return (EObject)createConversionValue();
      case OrmPackage.CONVERTER: return (EObject)createConverter();
      case OrmPackage.COPY_POLICY: return (EObject)createCopyPolicy();
      case OrmPackage.CUSTOMIZER: return (EObject)createCustomizer();
      case OrmPackage.DISCRIMINATOR_CLASS: return (EObject)createDiscriminatorClass();
      case OrmPackage.DISCRIMINATOR_COLUMN: return (EObject)createDiscriminatorColumn();
      case OrmPackage.DOCUMENT_ROOT: return (EObject)createDocumentRoot();
      case OrmPackage.ECLIPSELINK_COLLECTION_TABLE: return (EObject)createEclipselinkCollectionTable();
      case OrmPackage.ELEMENT_COLLECTION: return (EObject)createElementCollection();
      case OrmPackage.EMBEDDABLE: return (EObject)createEmbeddable();
      case OrmPackage.EMBEDDED: return (EObject)createEmbedded();
      case OrmPackage.EMBEDDED_ID: return (EObject)createEmbeddedId();
      case OrmPackage.EMPTY_TYPE: return (EObject)createEmptyType();
      case OrmPackage.ENTITY: return (EObject)createEntity();
      case OrmPackage.ENTITY_LISTENER: return (EObject)createEntityListener();
      case OrmPackage.ENTITY_LISTENERS: return (EObject)createEntityListeners();
      case OrmPackage.ENTITY_MAPPINGS_TYPE: return (EObject)createEntityMappingsType();
      case OrmPackage.ENTITY_RESULT: return (EObject)createEntityResult();
      case OrmPackage.FETCH_ATTRIBUTE: return (EObject)createFetchAttribute();
      case OrmPackage.FETCH_GROUP: return (EObject)createFetchGroup();
      case OrmPackage.FIELD_RESULT: return (EObject)createFieldResult();
      case OrmPackage.GENERATED_VALUE: return (EObject)createGeneratedValue();
      case OrmPackage.HASH_PARTITIONING: return (EObject)createHashPartitioning();
      case OrmPackage.ID: return (EObject)createId();
      case OrmPackage.ID_CLASS: return (EObject)createIdClass();
      case OrmPackage.INDEX: return (EObject)createIndex();
      case OrmPackage.INHERITANCE: return (EObject)createInheritance();
      case OrmPackage.INSTANTIATION_COPY_POLICY: return (EObject)createInstantiationCopyPolicy();
      case OrmPackage.JOIN_COLUMN: return (EObject)createJoinColumn();
      case OrmPackage.JOIN_TABLE: return (EObject)createJoinTable();
      case OrmPackage.LOB: return (EObject)createLob();
      case OrmPackage.MANY_TO_MANY: return (EObject)createManyToMany();
      case OrmPackage.MANY_TO_ONE: return (EObject)createManyToOne();
      case OrmPackage.MAP_KEY: return (EObject)createMapKey();
      case OrmPackage.MAP_KEY_CLASS: return (EObject)createMapKeyClass();
      case OrmPackage.MAP_KEY_COLUMN: return (EObject)createMapKeyColumn();
      case OrmPackage.MAP_KEY_JOIN_COLUMN: return (EObject)createMapKeyJoinColumn();
      case OrmPackage.MAPPED_SUPERCLASS: return (EObject)createMappedSuperclass();
      case OrmPackage.MULTITENANT: return (EObject)createMultitenant();
      case OrmPackage.NAMED_NATIVE_QUERY: return (EObject)createNamedNativeQuery();
      case OrmPackage.NAMED_PLSQL_STORED_FUNCTION_QUERY: return (EObject)createNamedPlsqlStoredFunctionQuery();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY: return (EObject)createNamedPlsqlStoredProcedureQuery();
      case OrmPackage.NAMED_QUERY: return (EObject)createNamedQuery();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY: return (EObject)createNamedStoredFunctionQuery();
      case OrmPackage.NAMED_STORED_PROCEDURE_QUERY: return (EObject)createNamedStoredProcedureQuery();
      case OrmPackage.OBJECT_TYPE_CONVERTER: return (EObject)createObjectTypeConverter();
      case OrmPackage.ONE_TO_MANY: return (EObject)createOneToMany();
      case OrmPackage.ONE_TO_ONE: return (EObject)createOneToOne();
      case OrmPackage.OPTIMISTIC_LOCKING: return (EObject)createOptimisticLocking();
      case OrmPackage.ORDER_COLUMN: return (EObject)createOrderColumn();
      case OrmPackage.PARTITIONING: return (EObject)createPartitioning();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS: return (EObject)createPersistenceUnitDefaults();
      case OrmPackage.PERSISTENCE_UNIT_METADATA: return (EObject)createPersistenceUnitMetadata();
      case OrmPackage.PINNED_PARTITIONING: return (EObject)createPinnedPartitioning();
      case OrmPackage.PLSQL_PARAMETER: return (EObject)createPlsqlParameter();
      case OrmPackage.PLSQL_RECORD: return (EObject)createPlsqlRecord();
      case OrmPackage.PLSQL_TABLE: return (EObject)createPlsqlTable();
      case OrmPackage.POST_LOAD: return (EObject)createPostLoad();
      case OrmPackage.POST_PERSIST: return (EObject)createPostPersist();
      case OrmPackage.POST_REMOVE: return (EObject)createPostRemove();
      case OrmPackage.POST_UPDATE: return (EObject)createPostUpdate();
      case OrmPackage.PRE_PERSIST: return (EObject)createPrePersist();
      case OrmPackage.PRE_REMOVE: return (EObject)createPreRemove();
      case OrmPackage.PRE_UPDATE: return (EObject)createPreUpdate();
      case OrmPackage.PRIMARY_KEY: return (EObject)createPrimaryKey();
      case OrmPackage.PRIMARY_KEY_JOIN_COLUMN: return (EObject)createPrimaryKeyJoinColumn();
      case OrmPackage.PROPERTY: return (EObject)createProperty();
      case OrmPackage.QUERY_HINT: return (EObject)createQueryHint();
      case OrmPackage.QUERY_REDIRECTORS: return (EObject)createQueryRedirectors();
      case OrmPackage.RANGE_PARTITION: return (EObject)createRangePartition();
      case OrmPackage.RANGE_PARTITIONING: return (EObject)createRangePartitioning();
      case OrmPackage.READ_TRANSFORMER: return (EObject)createReadTransformer();
      case OrmPackage.REPLICATION_PARTITIONING: return (EObject)createReplicationPartitioning();
      case OrmPackage.RETURN_INSERT: return (EObject)createReturnInsert();
      case OrmPackage.ROUND_ROBIN_PARTITIONING: return (EObject)createRoundRobinPartitioning();
      case OrmPackage.SECONDARY_TABLE: return (EObject)createSecondaryTable();
      case OrmPackage.SEQUENCE_GENERATOR: return (EObject)createSequenceGenerator();
      case OrmPackage.SQL_RESULT_SET_MAPPING: return (EObject)createSqlResultSetMapping();
      case OrmPackage.STORED_PROCEDURE_PARAMETER: return (EObject)createStoredProcedureParameter();
      case OrmPackage.STRUCT: return (EObject)createStruct();
      case OrmPackage.STRUCT_CONVERTER: return (EObject)createStructConverter();
      case OrmPackage.STRUCTURE: return (EObject)createStructure();
      case OrmPackage.TABLE: return (EObject)createTable();
      case OrmPackage.TABLE_GENERATOR: return (EObject)createTableGenerator();
      case OrmPackage.TENANT_DISCRIMINATOR: return (EObject)createTenantDiscriminator();
      case OrmPackage.TIME_OF_DAY: return (EObject)createTimeOfDay();
      case OrmPackage.TRANSFORMATION: return (EObject)createTransformation();
      case OrmPackage.TRANSIENT: return (EObject)createTransient();
      case OrmPackage.TYPE_CONVERTER: return (EObject)createTypeConverter();
      case OrmPackage.UNION_PARTITIONING: return (EObject)createUnionPartitioning();
      case OrmPackage.UNIQUE_CONSTRAINT: return (EObject)createUniqueConstraint();
      case OrmPackage.VALUE_PARTITION: return (EObject)createValuePartition();
      case OrmPackage.VALUE_PARTITIONING: return (EObject)createValuePartitioning();
      case OrmPackage.VARIABLE_ONE_TO_ONE: return (EObject)createVariableOneToOne();
      case OrmPackage.VERSION: return (EObject)createVersion();
      case OrmPackage.WRITE_TRANSFORMER: return (EObject)createWriteTransformer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case OrmPackage.ACCESS_TYPE:
        return createAccessTypeFromString(eDataType, initialValue);
      case OrmPackage.BATCH_FETCH_TYPE:
        return createBatchFetchTypeFromString(eDataType, initialValue);
      case OrmPackage.CACHE_COORDINATION_TYPE:
        return createCacheCoordinationTypeFromString(eDataType, initialValue);
      case OrmPackage.CACHE_ISOLATION_TYPE:
        return createCacheIsolationTypeFromString(eDataType, initialValue);
      case OrmPackage.CACHE_KEY_TYPE:
        return createCacheKeyTypeFromString(eDataType, initialValue);
      case OrmPackage.CACHE_TYPE:
        return createCacheTypeFromString(eDataType, initialValue);
      case OrmPackage.CHANGE_TRACKING_TYPE:
        return createChangeTrackingTypeFromString(eDataType, initialValue);
      case OrmPackage.DIRECTION_TYPE:
        return createDirectionTypeFromString(eDataType, initialValue);
      case OrmPackage.DISCRIMINATOR_TYPE:
        return createDiscriminatorTypeFromString(eDataType, initialValue);
      case OrmPackage.ENUM_TYPE:
        return createEnumTypeFromString(eDataType, initialValue);
      case OrmPackage.EXISTENCE_TYPE:
        return createExistenceTypeFromString(eDataType, initialValue);
      case OrmPackage.FETCH_TYPE:
        return createFetchTypeFromString(eDataType, initialValue);
      case OrmPackage.GENERATION_TYPE:
        return createGenerationTypeFromString(eDataType, initialValue);
      case OrmPackage.ID_VALIDATION:
        return createIdValidationFromString(eDataType, initialValue);
      case OrmPackage.INHERITANCE_TYPE:
        return createInheritanceTypeFromString(eDataType, initialValue);
      case OrmPackage.JOIN_FETCH_TYPE:
        return createJoinFetchTypeFromString(eDataType, initialValue);
      case OrmPackage.LOCK_MODE_TYPE:
        return createLockModeTypeFromString(eDataType, initialValue);
      case OrmPackage.MULTITENANT_TYPE:
        return createMultitenantTypeFromString(eDataType, initialValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE:
        return createOptimisticLockingTypeFromString(eDataType, initialValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE:
        return createOrderColumnCorrectionTypeFromString(eDataType, initialValue);
      case OrmPackage.SUPPORTED_VERSIONS_TYPE:
        return createSupportedVersionsTypeFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL_TYPE:
        return createTemporalTypeFromString(eDataType, initialValue);
      case OrmPackage.ACCESS_TYPE_OBJECT:
        return createAccessTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.BATCH_FETCH_TYPE_OBJECT:
        return createBatchFetchTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CACHE_COORDINATION_TYPE_OBJECT:
        return createCacheCoordinationTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CACHE_ISOLATION_TYPE_OBJECT:
        return createCacheIsolationTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CACHE_KEY_TYPE_OBJECT:
        return createCacheKeyTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CACHE_TYPE_OBJECT:
        return createCacheTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CHANGE_TRACKING_TYPE_OBJECT:
        return createChangeTrackingTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.DIRECTION_TYPE_OBJECT:
        return createDirectionTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.DISCRIMINATOR_TYPE_OBJECT:
        return createDiscriminatorTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.DISCRIMINATOR_VALUE:
        return createDiscriminatorValueFromString(eDataType, initialValue);
      case OrmPackage.ENUMERATED:
        return createEnumeratedFromString(eDataType, initialValue);
      case OrmPackage.ENUM_TYPE_OBJECT:
        return createEnumTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.EXISTENCE_TYPE_OBJECT:
        return createExistenceTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.FETCH_TYPE_OBJECT:
        return createFetchTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.GENERATION_TYPE_OBJECT:
        return createGenerationTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.ID_VALIDATION_OBJECT:
        return createIdValidationObjectFromString(eDataType, initialValue);
      case OrmPackage.INHERITANCE_TYPE_OBJECT:
        return createInheritanceTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.JOIN_FETCH_TYPE_OBJECT:
        return createJoinFetchTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.LOCK_MODE_TYPE_OBJECT:
        return createLockModeTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.MULTITENANT_TYPE_OBJECT:
        return createMultitenantTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE_OBJECT:
        return createOptimisticLockingTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.ORDER_BY:
        return createOrderByFromString(eDataType, initialValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE_OBJECT:
        return createOrderColumnCorrectionTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.SUPPORTED_VERSIONS_TYPE_OBJECT:
        return createSupportedVersionsTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL:
        return createTemporalFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL_TYPE_OBJECT:
        return createTemporalTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.VERSION_TYPE:
        return createVersionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case OrmPackage.ACCESS_TYPE:
        return convertAccessTypeToString(eDataType, instanceValue);
      case OrmPackage.BATCH_FETCH_TYPE:
        return convertBatchFetchTypeToString(eDataType, instanceValue);
      case OrmPackage.CACHE_COORDINATION_TYPE:
        return convertCacheCoordinationTypeToString(eDataType, instanceValue);
      case OrmPackage.CACHE_ISOLATION_TYPE:
        return convertCacheIsolationTypeToString(eDataType, instanceValue);
      case OrmPackage.CACHE_KEY_TYPE:
        return convertCacheKeyTypeToString(eDataType, instanceValue);
      case OrmPackage.CACHE_TYPE:
        return convertCacheTypeToString(eDataType, instanceValue);
      case OrmPackage.CHANGE_TRACKING_TYPE:
        return convertChangeTrackingTypeToString(eDataType, instanceValue);
      case OrmPackage.DIRECTION_TYPE:
        return convertDirectionTypeToString(eDataType, instanceValue);
      case OrmPackage.DISCRIMINATOR_TYPE:
        return convertDiscriminatorTypeToString(eDataType, instanceValue);
      case OrmPackage.ENUM_TYPE:
        return convertEnumTypeToString(eDataType, instanceValue);
      case OrmPackage.EXISTENCE_TYPE:
        return convertExistenceTypeToString(eDataType, instanceValue);
      case OrmPackage.FETCH_TYPE:
        return convertFetchTypeToString(eDataType, instanceValue);
      case OrmPackage.GENERATION_TYPE:
        return convertGenerationTypeToString(eDataType, instanceValue);
      case OrmPackage.ID_VALIDATION:
        return convertIdValidationToString(eDataType, instanceValue);
      case OrmPackage.INHERITANCE_TYPE:
        return convertInheritanceTypeToString(eDataType, instanceValue);
      case OrmPackage.JOIN_FETCH_TYPE:
        return convertJoinFetchTypeToString(eDataType, instanceValue);
      case OrmPackage.LOCK_MODE_TYPE:
        return convertLockModeTypeToString(eDataType, instanceValue);
      case OrmPackage.MULTITENANT_TYPE:
        return convertMultitenantTypeToString(eDataType, instanceValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE:
        return convertOptimisticLockingTypeToString(eDataType, instanceValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE:
        return convertOrderColumnCorrectionTypeToString(eDataType, instanceValue);
      case OrmPackage.SUPPORTED_VERSIONS_TYPE:
        return convertSupportedVersionsTypeToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL_TYPE:
        return convertTemporalTypeToString(eDataType, instanceValue);
      case OrmPackage.ACCESS_TYPE_OBJECT:
        return convertAccessTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.BATCH_FETCH_TYPE_OBJECT:
        return convertBatchFetchTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CACHE_COORDINATION_TYPE_OBJECT:
        return convertCacheCoordinationTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CACHE_ISOLATION_TYPE_OBJECT:
        return convertCacheIsolationTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CACHE_KEY_TYPE_OBJECT:
        return convertCacheKeyTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CACHE_TYPE_OBJECT:
        return convertCacheTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CHANGE_TRACKING_TYPE_OBJECT:
        return convertChangeTrackingTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.DIRECTION_TYPE_OBJECT:
        return convertDirectionTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.DISCRIMINATOR_TYPE_OBJECT:
        return convertDiscriminatorTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.DISCRIMINATOR_VALUE:
        return convertDiscriminatorValueToString(eDataType, instanceValue);
      case OrmPackage.ENUMERATED:
        return convertEnumeratedToString(eDataType, instanceValue);
      case OrmPackage.ENUM_TYPE_OBJECT:
        return convertEnumTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.EXISTENCE_TYPE_OBJECT:
        return convertExistenceTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.FETCH_TYPE_OBJECT:
        return convertFetchTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.GENERATION_TYPE_OBJECT:
        return convertGenerationTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.ID_VALIDATION_OBJECT:
        return convertIdValidationObjectToString(eDataType, instanceValue);
      case OrmPackage.INHERITANCE_TYPE_OBJECT:
        return convertInheritanceTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.JOIN_FETCH_TYPE_OBJECT:
        return convertJoinFetchTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.LOCK_MODE_TYPE_OBJECT:
        return convertLockModeTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.MULTITENANT_TYPE_OBJECT:
        return convertMultitenantTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE_OBJECT:
        return convertOptimisticLockingTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.ORDER_BY:
        return convertOrderByToString(eDataType, instanceValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE_OBJECT:
        return convertOrderColumnCorrectionTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.SUPPORTED_VERSIONS_TYPE_OBJECT:
        return convertSupportedVersionsTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL:
        return convertTemporalToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL_TYPE_OBJECT:
        return convertTemporalTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.VERSION_TYPE:
        return convertVersionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessMethods createAccessMethods() {
    AccessMethodsImpl accessMethods = new AccessMethodsImpl();
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AdditionalCriteria createAdditionalCriteria() {
    AdditionalCriteriaImpl additionalCriteria = new AdditionalCriteriaImpl();
    return additionalCriteria;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Array createArray() {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AssociationOverride createAssociationOverride() {
    AssociationOverrideImpl associationOverride = new AssociationOverrideImpl();
    return associationOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AttributeOverride createAttributeOverride() {
    AttributeOverrideImpl attributeOverride = new AttributeOverrideImpl();
    return attributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Attributes createAttributes() {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Basic createBasic() {
    BasicImpl basic = new BasicImpl();
    return basic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BasicCollection createBasicCollection() {
    BasicCollectionImpl basicCollection = new BasicCollectionImpl();
    return basicCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BasicMap createBasicMap() {
    BasicMapImpl basicMap = new BasicMapImpl();
    return basicMap;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BatchFetch createBatchFetch() {
    BatchFetchImpl batchFetch = new BatchFetchImpl();
    return batchFetch;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Cache createCache() {
    CacheImpl cache = new CacheImpl();
    return cache;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheInterceptor createCacheInterceptor() {
    CacheInterceptorImpl cacheInterceptor = new CacheInterceptorImpl();
    return cacheInterceptor;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CascadeType createCascadeType() {
    CascadeTypeImpl cascadeType = new CascadeTypeImpl();
    return cascadeType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTracking createChangeTracking() {
    ChangeTrackingImpl changeTracking = new ChangeTrackingImpl();
    return changeTracking;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClassExtractor createClassExtractor() {
    ClassExtractorImpl classExtractor = new ClassExtractorImpl();
    return classExtractor;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CloneCopyPolicy createCloneCopyPolicy() {
    CloneCopyPolicyImpl cloneCopyPolicy = new CloneCopyPolicyImpl();
    return cloneCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CollectionTable createCollectionTable() {
    CollectionTableImpl collectionTable = new CollectionTableImpl();
    return collectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn() {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnResult createColumnResult() {
    ColumnResultImpl columnResult = new ColumnResultImpl();
    return columnResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ConversionValue createConversionValue() {
    ConversionValueImpl conversionValue = new ConversionValueImpl();
    return conversionValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Converter createConverter() {
    ConverterImpl converter = new ConverterImpl();
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CopyPolicy createCopyPolicy() {
    CopyPolicyImpl copyPolicy = new CopyPolicyImpl();
    return copyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Customizer createCustomizer() {
    CustomizerImpl customizer = new CustomizerImpl();
    return customizer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorClass createDiscriminatorClass() {
    DiscriminatorClassImpl discriminatorClass = new DiscriminatorClassImpl();
    return discriminatorClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorColumn createDiscriminatorColumn() {
    DiscriminatorColumnImpl discriminatorColumn = new DiscriminatorColumnImpl();
    return discriminatorColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EclipselinkCollectionTable createEclipselinkCollectionTable() {
    EclipselinkCollectionTableImpl eclipselinkCollectionTable = new EclipselinkCollectionTableImpl();
    return eclipselinkCollectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ElementCollection createElementCollection() {
    ElementCollectionImpl elementCollection = new ElementCollectionImpl();
    return elementCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Embeddable createEmbeddable() {
    EmbeddableImpl embeddable = new EmbeddableImpl();
    return embeddable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Embedded createEmbedded() {
    EmbeddedImpl embedded = new EmbeddedImpl();
    return embedded;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedId createEmbeddedId() {
    EmbeddedIdImpl embeddedId = new EmbeddedIdImpl();
    return embeddedId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType createEmptyType() {
    EmptyTypeImpl emptyType = new EmptyTypeImpl();
    return emptyType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity() {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityListener createEntityListener() {
    EntityListenerImpl entityListener = new EntityListenerImpl();
    return entityListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityListeners createEntityListeners() {
    EntityListenersImpl entityListeners = new EntityListenersImpl();
    return entityListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityMappingsType createEntityMappingsType() {
    EntityMappingsTypeImpl entityMappingsType = new EntityMappingsTypeImpl();
    return entityMappingsType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityResult createEntityResult() {
    EntityResultImpl entityResult = new EntityResultImpl();
    return entityResult;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetchAttribute createFetchAttribute() {
    FetchAttributeImpl fetchAttribute = new FetchAttributeImpl();
    return fetchAttribute;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetchGroup createFetchGroup() {
    FetchGroupImpl fetchGroup = new FetchGroupImpl();
    return fetchGroup;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FieldResult createFieldResult() {
    FieldResultImpl fieldResult = new FieldResultImpl();
    return fieldResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GeneratedValue createGeneratedValue() {
    GeneratedValueImpl generatedValue = new GeneratedValueImpl();
    return generatedValue;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HashPartitioning createHashPartitioning() {
    HashPartitioningImpl hashPartitioning = new HashPartitioningImpl();
    return hashPartitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Id createId() {
    IdImpl id = new IdImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdClass createIdClass() {
    IdClassImpl idClass = new IdClassImpl();
    return idClass;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Index createIndex() {
    IndexImpl index = new IndexImpl();
    return index;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Inheritance createInheritance() {
    InheritanceImpl inheritance = new InheritanceImpl();
    return inheritance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InstantiationCopyPolicy createInstantiationCopyPolicy() {
    InstantiationCopyPolicyImpl instantiationCopyPolicy = new InstantiationCopyPolicyImpl();
    return instantiationCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinColumn createJoinColumn() {
    JoinColumnImpl joinColumn = new JoinColumnImpl();
    return joinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinTable createJoinTable() {
    JoinTableImpl joinTable = new JoinTableImpl();
    return joinTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Lob createLob() {
    LobImpl lob = new LobImpl();
    return lob;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ManyToMany createManyToMany() {
    ManyToManyImpl manyToMany = new ManyToManyImpl();
    return manyToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ManyToOne createManyToOne() {
    ManyToOneImpl manyToOne = new ManyToOneImpl();
    return manyToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKey createMapKey() {
    MapKeyImpl mapKey = new MapKeyImpl();
    return mapKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyClass createMapKeyClass() {
    MapKeyClassImpl mapKeyClass = new MapKeyClassImpl();
    return mapKeyClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyColumn createMapKeyColumn() {
    MapKeyColumnImpl mapKeyColumn = new MapKeyColumnImpl();
    return mapKeyColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyJoinColumn createMapKeyJoinColumn() {
    MapKeyJoinColumnImpl mapKeyJoinColumn = new MapKeyJoinColumnImpl();
    return mapKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MappedSuperclass createMappedSuperclass() {
    MappedSuperclassImpl mappedSuperclass = new MappedSuperclassImpl();
    return mappedSuperclass;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Multitenant createMultitenant() {
    MultitenantImpl multitenant = new MultitenantImpl();
    return multitenant;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedNativeQuery createNamedNativeQuery() {
    NamedNativeQueryImpl namedNativeQuery = new NamedNativeQueryImpl();
    return namedNativeQuery;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedPlsqlStoredFunctionQuery createNamedPlsqlStoredFunctionQuery() {
    NamedPlsqlStoredFunctionQueryImpl namedPlsqlStoredFunctionQuery = new NamedPlsqlStoredFunctionQueryImpl();
    return namedPlsqlStoredFunctionQuery;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedPlsqlStoredProcedureQuery createNamedPlsqlStoredProcedureQuery() {
    NamedPlsqlStoredProcedureQueryImpl namedPlsqlStoredProcedureQuery = new NamedPlsqlStoredProcedureQueryImpl();
    return namedPlsqlStoredProcedureQuery;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedQuery createNamedQuery() {
    NamedQueryImpl namedQuery = new NamedQueryImpl();
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedStoredFunctionQuery createNamedStoredFunctionQuery() {
    NamedStoredFunctionQueryImpl namedStoredFunctionQuery = new NamedStoredFunctionQueryImpl();
    return namedStoredFunctionQuery;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedStoredProcedureQuery createNamedStoredProcedureQuery() {
    NamedStoredProcedureQueryImpl namedStoredProcedureQuery = new NamedStoredProcedureQueryImpl();
    return namedStoredProcedureQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ObjectTypeConverter createObjectTypeConverter() {
    ObjectTypeConverterImpl objectTypeConverter = new ObjectTypeConverterImpl();
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OneToMany createOneToMany() {
    OneToManyImpl oneToMany = new OneToManyImpl();
    return oneToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OneToOne createOneToOne() {
    OneToOneImpl oneToOne = new OneToOneImpl();
    return oneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLocking createOptimisticLocking() {
    OptimisticLockingImpl optimisticLocking = new OptimisticLockingImpl();
    return optimisticLocking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumn createOrderColumn() {
    OrderColumnImpl orderColumn = new OrderColumnImpl();
    return orderColumn;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Partitioning createPartitioning() {
    PartitioningImpl partitioning = new PartitioningImpl();
    return partitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PersistenceUnitDefaults createPersistenceUnitDefaults() {
    PersistenceUnitDefaultsImpl persistenceUnitDefaults = new PersistenceUnitDefaultsImpl();
    return persistenceUnitDefaults;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PersistenceUnitMetadata createPersistenceUnitMetadata() {
    PersistenceUnitMetadataImpl persistenceUnitMetadata = new PersistenceUnitMetadataImpl();
    return persistenceUnitMetadata;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PinnedPartitioning createPinnedPartitioning() {
    PinnedPartitioningImpl pinnedPartitioning = new PinnedPartitioningImpl();
    return pinnedPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlsqlParameter createPlsqlParameter() {
    PlsqlParameterImpl plsqlParameter = new PlsqlParameterImpl();
    return plsqlParameter;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlsqlRecord createPlsqlRecord() {
    PlsqlRecordImpl plsqlRecord = new PlsqlRecordImpl();
    return plsqlRecord;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlsqlTable createPlsqlTable() {
    PlsqlTableImpl plsqlTable = new PlsqlTableImpl();
    return plsqlTable;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostLoad createPostLoad() {
    PostLoadImpl postLoad = new PostLoadImpl();
    return postLoad;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostPersist createPostPersist() {
    PostPersistImpl postPersist = new PostPersistImpl();
    return postPersist;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostRemove createPostRemove() {
    PostRemoveImpl postRemove = new PostRemoveImpl();
    return postRemove;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostUpdate createPostUpdate() {
    PostUpdateImpl postUpdate = new PostUpdateImpl();
    return postUpdate;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrePersist createPrePersist() {
    PrePersistImpl prePersist = new PrePersistImpl();
    return prePersist;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PreRemove createPreRemove() {
    PreRemoveImpl preRemove = new PreRemoveImpl();
    return preRemove;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PreUpdate createPreUpdate() {
    PreUpdateImpl preUpdate = new PreUpdateImpl();
    return preUpdate;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey createPrimaryKey() {
    PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKeyJoinColumn createPrimaryKeyJoinColumn() {
    PrimaryKeyJoinColumnImpl primaryKeyJoinColumn = new PrimaryKeyJoinColumnImpl();
    return primaryKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty() {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public QueryHint createQueryHint() {
    QueryHintImpl queryHint = new QueryHintImpl();
    return queryHint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public QueryRedirectors createQueryRedirectors() {
    QueryRedirectorsImpl queryRedirectors = new QueryRedirectorsImpl();
    return queryRedirectors;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RangePartition createRangePartition() {
    RangePartitionImpl rangePartition = new RangePartitionImpl();
    return rangePartition;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RangePartitioning createRangePartitioning() {
    RangePartitioningImpl rangePartitioning = new RangePartitioningImpl();
    return rangePartitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReadTransformer createReadTransformer() {
    ReadTransformerImpl readTransformer = new ReadTransformerImpl();
    return readTransformer;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReplicationPartitioning createReplicationPartitioning() {
    ReplicationPartitioningImpl replicationPartitioning = new ReplicationPartitioningImpl();
    return replicationPartitioning;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReturnInsert createReturnInsert() {
    ReturnInsertImpl returnInsert = new ReturnInsertImpl();
    return returnInsert;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RoundRobinPartitioning createRoundRobinPartitioning() {
    RoundRobinPartitioningImpl roundRobinPartitioning = new RoundRobinPartitioningImpl();
    return roundRobinPartitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SecondaryTable createSecondaryTable() {
    SecondaryTableImpl secondaryTable = new SecondaryTableImpl();
    return secondaryTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SequenceGenerator createSequenceGenerator() {
    SequenceGeneratorImpl sequenceGenerator = new SequenceGeneratorImpl();
    return sequenceGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SqlResultSetMapping createSqlResultSetMapping() {
    SqlResultSetMappingImpl sqlResultSetMapping = new SqlResultSetMappingImpl();
    return sqlResultSetMapping;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StoredProcedureParameter createStoredProcedureParameter() {
    StoredProcedureParameterImpl storedProcedureParameter = new StoredProcedureParameterImpl();
    return storedProcedureParameter;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Struct createStruct() {
    StructImpl struct = new StructImpl();
    return struct;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StructConverter createStructConverter() {
    StructConverterImpl structConverter = new StructConverterImpl();
    return structConverter;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Structure createStructure() {
    StructureImpl structure = new StructureImpl();
    return structure;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Table createTable() {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TableGenerator createTableGenerator() {
    TableGeneratorImpl tableGenerator = new TableGeneratorImpl();
    return tableGenerator;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TenantDiscriminator createTenantDiscriminator() {
    TenantDiscriminatorImpl tenantDiscriminator = new TenantDiscriminatorImpl();
    return tenantDiscriminator;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TimeOfDay createTimeOfDay() {
    TimeOfDayImpl timeOfDay = new TimeOfDayImpl();
    return timeOfDay;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation() {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Transient createTransient() {
    TransientImpl transient_ = new TransientImpl();
    return transient_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypeConverter createTypeConverter() {
    TypeConverterImpl typeConverter = new TypeConverterImpl();
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UnionPartitioning createUnionPartitioning() {
    UnionPartitioningImpl unionPartitioning = new UnionPartitioningImpl();
    return unionPartitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public UniqueConstraint createUniqueConstraint() {
    UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
    return uniqueConstraint;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ValuePartition createValuePartition() {
    ValuePartitionImpl valuePartition = new ValuePartitionImpl();
    return valuePartition;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ValuePartitioning createValuePartitioning() {
    ValuePartitioningImpl valuePartitioning = new ValuePartitioningImpl();
    return valuePartitioning;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public VariableOneToOne createVariableOneToOne() {
    VariableOneToOneImpl variableOneToOne = new VariableOneToOneImpl();
    return variableOneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion() {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WriteTransformer createWriteTransformer() {
    WriteTransformerImpl writeTransformer = new WriteTransformerImpl();
    return writeTransformer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
    AccessType result = AccessType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BatchFetchType createBatchFetchTypeFromString(EDataType eDataType, String initialValue) {
    BatchFetchType result = BatchFetchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBatchFetchTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheCoordinationType createCacheCoordinationTypeFromString(EDataType eDataType, String initialValue) {
    CacheCoordinationType result = CacheCoordinationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheCoordinationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CacheIsolationType createCacheIsolationTypeFromString(EDataType eDataType, String initialValue) {
    CacheIsolationType result = CacheIsolationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCacheIsolationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CacheKeyType createCacheKeyTypeFromString(EDataType eDataType, String initialValue) {
    CacheKeyType result = CacheKeyType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCacheKeyTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue) {
    CacheType result = CacheType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTrackingType createChangeTrackingTypeFromString(EDataType eDataType, String initialValue) {
    ChangeTrackingType result = ChangeTrackingType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTrackingTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
    DirectionType result = DirectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorType createDiscriminatorTypeFromString(EDataType eDataType, String initialValue) {
    DiscriminatorType result = DiscriminatorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDiscriminatorTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumTypeFromString(EDataType eDataType, String initialValue) {
    EnumType result = EnumType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExistenceType createExistenceTypeFromString(EDataType eDataType, String initialValue) {
    ExistenceType result = ExistenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertExistenceTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType createFetchTypeFromString(EDataType eDataType, String initialValue) {
    FetchType result = FetchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertFetchTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GenerationType createGenerationTypeFromString(EDataType eDataType, String initialValue) {
    GenerationType result = GenerationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertGenerationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdValidation createIdValidationFromString(EDataType eDataType, String initialValue) {
    IdValidation result = IdValidation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIdValidationToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InheritanceType createInheritanceTypeFromString(EDataType eDataType, String initialValue) {
    InheritanceType result = InheritanceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInheritanceTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinFetchType createJoinFetchTypeFromString(EDataType eDataType, String initialValue) {
    JoinFetchType result = JoinFetchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertJoinFetchTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LockModeType createLockModeTypeFromString(EDataType eDataType, String initialValue) {
    LockModeType result = LockModeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertLockModeTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MultitenantType createMultitenantTypeFromString(EDataType eDataType, String initialValue) {
    MultitenantType result = MultitenantType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertMultitenantTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLockingType createOptimisticLockingTypeFromString(EDataType eDataType, String initialValue) {
    OptimisticLockingType result = OptimisticLockingType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOptimisticLockingTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumnCorrectionType createOrderColumnCorrectionTypeFromString(EDataType eDataType, String initialValue) {
    OrderColumnCorrectionType result = OrderColumnCorrectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderColumnCorrectionTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SupportedVersionsType createSupportedVersionsTypeFromString(EDataType eDataType, String initialValue) {
    SupportedVersionsType result = SupportedVersionsType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertSupportedVersionsTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType createTemporalTypeFromString(EDataType eDataType, String initialValue) {
    TemporalType result = TemporalType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createAccessTypeFromString(OrmPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertAccessTypeToString(OrmPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BatchFetchType createBatchFetchTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createBatchFetchTypeFromString(OrmPackage.eINSTANCE.getBatchFetchType(), initialValue);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBatchFetchTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertBatchFetchTypeToString(OrmPackage.eINSTANCE.getBatchFetchType(), instanceValue);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheCoordinationType createCacheCoordinationTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createCacheCoordinationTypeFromString(OrmPackage.eINSTANCE.getCacheCoordinationType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheCoordinationTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCacheCoordinationTypeToString(OrmPackage.eINSTANCE.getCacheCoordinationType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CacheIsolationType createCacheIsolationTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createCacheIsolationTypeFromString(OrmPackage.eINSTANCE.getCacheIsolationType(), initialValue);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCacheIsolationTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCacheIsolationTypeToString(OrmPackage.eINSTANCE.getCacheIsolationType(), instanceValue);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CacheKeyType createCacheKeyTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createCacheKeyTypeFromString(OrmPackage.eINSTANCE.getCacheKeyType(), initialValue);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCacheKeyTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCacheKeyTypeToString(OrmPackage.eINSTANCE.getCacheKeyType(), instanceValue);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheType createCacheTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createCacheTypeFromString(OrmPackage.eINSTANCE.getCacheType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCacheTypeToString(OrmPackage.eINSTANCE.getCacheType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTrackingType createChangeTrackingTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createChangeTrackingTypeFromString(OrmPackage.eINSTANCE.getChangeTrackingType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTrackingTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertChangeTrackingTypeToString(OrmPackage.eINSTANCE.getChangeTrackingType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createDirectionTypeFromString(OrmPackage.eINSTANCE.getDirectionType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDirectionTypeToString(OrmPackage.eINSTANCE.getDirectionType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorType createDiscriminatorTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createDiscriminatorTypeFromString(OrmPackage.eINSTANCE.getDiscriminatorType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDiscriminatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDiscriminatorTypeToString(OrmPackage.eINSTANCE.getDiscriminatorType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createDiscriminatorValueFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDiscriminatorValueToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumeratedFromString(EDataType eDataType, String initialValue) {
    return createEnumTypeFromString(OrmPackage.eINSTANCE.getEnumType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumeratedToString(EDataType eDataType, Object instanceValue) {
    return convertEnumTypeToString(OrmPackage.eINSTANCE.getEnumType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createEnumTypeFromString(OrmPackage.eINSTANCE.getEnumType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertEnumTypeToString(OrmPackage.eINSTANCE.getEnumType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExistenceType createExistenceTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createExistenceTypeFromString(OrmPackage.eINSTANCE.getExistenceType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertExistenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertExistenceTypeToString(OrmPackage.eINSTANCE.getExistenceType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType createFetchTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createFetchTypeFromString(OrmPackage.eINSTANCE.getFetchType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertFetchTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFetchTypeToString(OrmPackage.eINSTANCE.getFetchType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GenerationType createGenerationTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGenerationTypeFromString(OrmPackage.eINSTANCE.getGenerationType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertGenerationTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGenerationTypeToString(OrmPackage.eINSTANCE.getGenerationType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdValidation createIdValidationObjectFromString(EDataType eDataType, String initialValue) {
    return createIdValidationFromString(OrmPackage.eINSTANCE.getIdValidation(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIdValidationObjectToString(EDataType eDataType, Object instanceValue) {
    return convertIdValidationToString(OrmPackage.eINSTANCE.getIdValidation(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InheritanceType createInheritanceTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createInheritanceTypeFromString(OrmPackage.eINSTANCE.getInheritanceType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInheritanceTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertInheritanceTypeToString(OrmPackage.eINSTANCE.getInheritanceType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinFetchType createJoinFetchTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createJoinFetchTypeFromString(OrmPackage.eINSTANCE.getJoinFetchType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertJoinFetchTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertJoinFetchTypeToString(OrmPackage.eINSTANCE.getJoinFetchType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LockModeType createLockModeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createLockModeTypeFromString(OrmPackage.eINSTANCE.getLockModeType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertLockModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertLockModeTypeToString(OrmPackage.eINSTANCE.getLockModeType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MultitenantType createMultitenantTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createMultitenantTypeFromString(OrmPackage.eINSTANCE.getMultitenantType(), initialValue);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertMultitenantTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertMultitenantTypeToString(OrmPackage.eINSTANCE.getMultitenantType(), instanceValue);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLockingType createOptimisticLockingTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createOptimisticLockingTypeFromString(OrmPackage.eINSTANCE.getOptimisticLockingType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOptimisticLockingTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertOptimisticLockingTypeToString(OrmPackage.eINSTANCE.getOptimisticLockingType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createOrderByFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderByToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumnCorrectionType createOrderColumnCorrectionTypeObjectFromString(EDataType eDataType,
      String initialValue) {
    return createOrderColumnCorrectionTypeFromString(OrmPackage.eINSTANCE.getOrderColumnCorrectionType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderColumnCorrectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertOrderColumnCorrectionTypeToString(OrmPackage.eINSTANCE.getOrderColumnCorrectionType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SupportedVersionsType createSupportedVersionsTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createSupportedVersionsTypeFromString(OrmPackage.eINSTANCE.getSupportedVersionsType(), initialValue);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertSupportedVersionsTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertSupportedVersionsTypeToString(OrmPackage.eINSTANCE.getSupportedVersionsType(), instanceValue);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType createTemporalFromString(EDataType eDataType, String initialValue) {
    return createTemporalTypeFromString(OrmPackage.eINSTANCE.getTemporalType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalToString(EDataType eDataType, Object instanceValue) {
    return convertTemporalTypeToString(OrmPackage.eINSTANCE.getTemporalType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType createTemporalTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createTemporalTypeFromString(OrmPackage.eINSTANCE.getTemporalType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertTemporalTypeToString(OrmPackage.eINSTANCE.getTemporalType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmPackage getOrmPackage() {
    return (OrmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OrmPackage getPackage() {
    return OrmPackage.eINSTANCE;
  }

} // OrmFactoryImpl
