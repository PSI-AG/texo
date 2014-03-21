/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmValidator.java,v 1.6 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.eclipse.emf.texo.orm.annotations.model.orm.*;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage
 * @generated
 */
public class OrmValidator extends EObjectValidator {
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final OrmValidator INSTANCE = new OrmValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.texo.orm.annotations.model.orm";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmValidator() {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage() {
    return OrmPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID) {
      case OrmPackage.ACCESS_METHODS:
        return validateAccessMethods((AccessMethods)value, diagnostics, context);
      case OrmPackage.ADDITIONAL_CRITERIA:
        return validateAdditionalCriteria((AdditionalCriteria)value, diagnostics, context);
      case OrmPackage.ARRAY:
        return validateArray((Array)value, diagnostics, context);
      case OrmPackage.ASSOCIATION_OVERRIDE:
        return validateAssociationOverride((AssociationOverride)value, diagnostics, context);
      case OrmPackage.ATTRIBUTE_OVERRIDE:
        return validateAttributeOverride((AttributeOverride)value, diagnostics, context);
      case OrmPackage.ATTRIBUTES:
        return validateAttributes((Attributes)value, diagnostics, context);
      case OrmPackage.BASIC:
        return validateBasic((Basic)value, diagnostics, context);
      case OrmPackage.BASIC_COLLECTION:
        return validateBasicCollection((BasicCollection)value, diagnostics, context);
      case OrmPackage.BASIC_MAP:
        return validateBasicMap((BasicMap)value, diagnostics, context);
      case OrmPackage.BATCH_FETCH:
        return validateBatchFetch((BatchFetch)value, diagnostics, context);
      case OrmPackage.CACHE:
        return validateCache((Cache)value, diagnostics, context);
      case OrmPackage.CACHE_INTERCEPTOR:
        return validateCacheInterceptor((CacheInterceptor)value, diagnostics, context);
      case OrmPackage.CASCADE_TYPE:
        return validateCascadeType((CascadeType)value, diagnostics, context);
      case OrmPackage.CHANGE_TRACKING:
        return validateChangeTracking((ChangeTracking)value, diagnostics, context);
      case OrmPackage.CLASS_EXTRACTOR:
        return validateClassExtractor((ClassExtractor)value, diagnostics, context);
      case OrmPackage.CLONE_COPY_POLICY:
        return validateCloneCopyPolicy((CloneCopyPolicy)value, diagnostics, context);
      case OrmPackage.COLLECTION_TABLE:
        return validateCollectionTable((CollectionTable)value, diagnostics, context);
      case OrmPackage.COLUMN:
        return validateColumn((Column)value, diagnostics, context);
      case OrmPackage.COLUMN_RESULT:
        return validateColumnResult((ColumnResult)value, diagnostics, context);
      case OrmPackage.CONVERSION_VALUE:
        return validateConversionValue((ConversionValue)value, diagnostics, context);
      case OrmPackage.CONVERTER:
        return validateConverter((Converter)value, diagnostics, context);
      case OrmPackage.COPY_POLICY:
        return validateCopyPolicy((CopyPolicy)value, diagnostics, context);
      case OrmPackage.CUSTOMIZER:
        return validateCustomizer((Customizer)value, diagnostics, context);
      case OrmPackage.DISCRIMINATOR_CLASS:
        return validateDiscriminatorClass((DiscriminatorClass)value, diagnostics, context);
      case OrmPackage.DISCRIMINATOR_COLUMN:
        return validateDiscriminatorColumn((DiscriminatorColumn)value, diagnostics, context);
      case OrmPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case OrmPackage.ECLIPSELINK_COLLECTION_TABLE:
        return validateEclipselinkCollectionTable((EclipselinkCollectionTable)value, diagnostics, context);
      case OrmPackage.ELEMENT_COLLECTION:
        return validateElementCollection((ElementCollection)value, diagnostics, context);
      case OrmPackage.EMBEDDABLE:
        return validateEmbeddable((Embeddable)value, diagnostics, context);
      case OrmPackage.EMBEDDED:
        return validateEmbedded((Embedded)value, diagnostics, context);
      case OrmPackage.EMBEDDED_ID:
        return validateEmbeddedId((EmbeddedId)value, diagnostics, context);
      case OrmPackage.EMPTY_TYPE:
        return validateEmptyType((EmptyType)value, diagnostics, context);
      case OrmPackage.ENTITY:
        return validateEntity((Entity)value, diagnostics, context);
      case OrmPackage.ENTITY_LISTENER:
        return validateEntityListener((EntityListener)value, diagnostics, context);
      case OrmPackage.ENTITY_LISTENERS:
        return validateEntityListeners((EntityListeners)value, diagnostics, context);
      case OrmPackage.ENTITY_MAPPINGS_TYPE:
        return validateEntityMappingsType((EntityMappingsType)value, diagnostics, context);
      case OrmPackage.ENTITY_RESULT:
        return validateEntityResult((EntityResult)value, diagnostics, context);
      case OrmPackage.FETCH_ATTRIBUTE:
        return validateFetchAttribute((FetchAttribute)value, diagnostics, context);
      case OrmPackage.FETCH_GROUP:
        return validateFetchGroup((FetchGroup)value, diagnostics, context);
      case OrmPackage.FIELD_RESULT:
        return validateFieldResult((FieldResult)value, diagnostics, context);
      case OrmPackage.GENERATED_VALUE:
        return validateGeneratedValue((GeneratedValue)value, diagnostics, context);
      case OrmPackage.HASH_PARTITIONING:
        return validateHashPartitioning((HashPartitioning)value, diagnostics, context);
      case OrmPackage.ID:
        return validateId((Id)value, diagnostics, context);
      case OrmPackage.ID_CLASS:
        return validateIdClass((IdClass)value, diagnostics, context);
      case OrmPackage.INDEX:
        return validateIndex((Index)value, diagnostics, context);
      case OrmPackage.INHERITANCE:
        return validateInheritance((Inheritance)value, diagnostics, context);
      case OrmPackage.INSTANTIATION_COPY_POLICY:
        return validateInstantiationCopyPolicy((InstantiationCopyPolicy)value, diagnostics, context);
      case OrmPackage.JOIN_COLUMN:
        return validateJoinColumn((JoinColumn)value, diagnostics, context);
      case OrmPackage.JOIN_TABLE:
        return validateJoinTable((JoinTable)value, diagnostics, context);
      case OrmPackage.LOB:
        return validateLob((Lob)value, diagnostics, context);
      case OrmPackage.MANY_TO_MANY:
        return validateManyToMany((ManyToMany)value, diagnostics, context);
      case OrmPackage.MANY_TO_ONE:
        return validateManyToOne((ManyToOne)value, diagnostics, context);
      case OrmPackage.MAP_KEY:
        return validateMapKey((MapKey)value, diagnostics, context);
      case OrmPackage.MAP_KEY_CLASS:
        return validateMapKeyClass((MapKeyClass)value, diagnostics, context);
      case OrmPackage.MAP_KEY_COLUMN:
        return validateMapKeyColumn((MapKeyColumn)value, diagnostics, context);
      case OrmPackage.MAP_KEY_JOIN_COLUMN:
        return validateMapKeyJoinColumn((MapKeyJoinColumn)value, diagnostics, context);
      case OrmPackage.MAPPED_SUPERCLASS:
        return validateMappedSuperclass((MappedSuperclass)value, diagnostics, context);
      case OrmPackage.MULTITENANT:
        return validateMultitenant((Multitenant)value, diagnostics, context);
      case OrmPackage.NAMED_NATIVE_QUERY:
        return validateNamedNativeQuery((NamedNativeQuery)value, diagnostics, context);
      case OrmPackage.NAMED_PLSQL_STORED_FUNCTION_QUERY:
        return validateNamedPlsqlStoredFunctionQuery((NamedPlsqlStoredFunctionQuery)value, diagnostics, context);
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY:
        return validateNamedPlsqlStoredProcedureQuery((NamedPlsqlStoredProcedureQuery)value, diagnostics, context);
      case OrmPackage.NAMED_QUERY:
        return validateNamedQuery((NamedQuery)value, diagnostics, context);
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY:
        return validateNamedStoredFunctionQuery((NamedStoredFunctionQuery)value, diagnostics, context);
      case OrmPackage.NAMED_STORED_PROCEDURE_QUERY:
        return validateNamedStoredProcedureQuery((NamedStoredProcedureQuery)value, diagnostics, context);
      case OrmPackage.OBJECT_TYPE_CONVERTER:
        return validateObjectTypeConverter((ObjectTypeConverter)value, diagnostics, context);
      case OrmPackage.ONE_TO_MANY:
        return validateOneToMany((OneToMany)value, diagnostics, context);
      case OrmPackage.ONE_TO_ONE:
        return validateOneToOne((OneToOne)value, diagnostics, context);
      case OrmPackage.OPTIMISTIC_LOCKING:
        return validateOptimisticLocking((OptimisticLocking)value, diagnostics, context);
      case OrmPackage.ORDER_COLUMN:
        return validateOrderColumn((OrderColumn)value, diagnostics, context);
      case OrmPackage.PARTITIONING:
        return validatePartitioning((Partitioning)value, diagnostics, context);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS:
        return validatePersistenceUnitDefaults((PersistenceUnitDefaults)value, diagnostics, context);
      case OrmPackage.PERSISTENCE_UNIT_METADATA:
        return validatePersistenceUnitMetadata((PersistenceUnitMetadata)value, diagnostics, context);
      case OrmPackage.PINNED_PARTITIONING:
        return validatePinnedPartitioning((PinnedPartitioning)value, diagnostics, context);
      case OrmPackage.PLSQL_PARAMETER:
        return validatePlsqlParameter((PlsqlParameter)value, diagnostics, context);
      case OrmPackage.PLSQL_RECORD:
        return validatePlsqlRecord((PlsqlRecord)value, diagnostics, context);
      case OrmPackage.PLSQL_TABLE:
        return validatePlsqlTable((PlsqlTable)value, diagnostics, context);
      case OrmPackage.POST_LOAD:
        return validatePostLoad((PostLoad)value, diagnostics, context);
      case OrmPackage.POST_PERSIST:
        return validatePostPersist((PostPersist)value, diagnostics, context);
      case OrmPackage.POST_REMOVE:
        return validatePostRemove((PostRemove)value, diagnostics, context);
      case OrmPackage.POST_UPDATE:
        return validatePostUpdate((PostUpdate)value, diagnostics, context);
      case OrmPackage.PRE_PERSIST:
        return validatePrePersist((PrePersist)value, diagnostics, context);
      case OrmPackage.PRE_REMOVE:
        return validatePreRemove((PreRemove)value, diagnostics, context);
      case OrmPackage.PRE_UPDATE:
        return validatePreUpdate((PreUpdate)value, diagnostics, context);
      case OrmPackage.PRIMARY_KEY:
        return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
      case OrmPackage.PRIMARY_KEY_JOIN_COLUMN:
        return validatePrimaryKeyJoinColumn((PrimaryKeyJoinColumn)value, diagnostics, context);
      case OrmPackage.PROPERTY:
        return validateProperty((Property)value, diagnostics, context);
      case OrmPackage.QUERY_HINT:
        return validateQueryHint((QueryHint)value, diagnostics, context);
      case OrmPackage.QUERY_REDIRECTORS:
        return validateQueryRedirectors((QueryRedirectors)value, diagnostics, context);
      case OrmPackage.RANGE_PARTITION:
        return validateRangePartition((RangePartition)value, diagnostics, context);
      case OrmPackage.RANGE_PARTITIONING:
        return validateRangePartitioning((RangePartitioning)value, diagnostics, context);
      case OrmPackage.READ_TRANSFORMER:
        return validateReadTransformer((ReadTransformer)value, diagnostics, context);
      case OrmPackage.REPLICATION_PARTITIONING:
        return validateReplicationPartitioning((ReplicationPartitioning)value, diagnostics, context);
      case OrmPackage.RETURN_INSERT:
        return validateReturnInsert((ReturnInsert)value, diagnostics, context);
      case OrmPackage.ROUND_ROBIN_PARTITIONING:
        return validateRoundRobinPartitioning((RoundRobinPartitioning)value, diagnostics, context);
      case OrmPackage.SECONDARY_TABLE:
        return validateSecondaryTable((SecondaryTable)value, diagnostics, context);
      case OrmPackage.SEQUENCE_GENERATOR:
        return validateSequenceGenerator((SequenceGenerator)value, diagnostics, context);
      case OrmPackage.SQL_RESULT_SET_MAPPING:
        return validateSqlResultSetMapping((SqlResultSetMapping)value, diagnostics, context);
      case OrmPackage.STORED_PROCEDURE_PARAMETER:
        return validateStoredProcedureParameter((StoredProcedureParameter)value, diagnostics, context);
      case OrmPackage.STRUCT:
        return validateStruct((Struct)value, diagnostics, context);
      case OrmPackage.STRUCT_CONVERTER:
        return validateStructConverter((StructConverter)value, diagnostics, context);
      case OrmPackage.STRUCTURE:
        return validateStructure((Structure)value, diagnostics, context);
      case OrmPackage.TABLE:
        return validateTable((Table)value, diagnostics, context);
      case OrmPackage.TABLE_GENERATOR:
        return validateTableGenerator((TableGenerator)value, diagnostics, context);
      case OrmPackage.TENANT_DISCRIMINATOR:
        return validateTenantDiscriminator((TenantDiscriminator)value, diagnostics, context);
      case OrmPackage.TIME_OF_DAY:
        return validateTimeOfDay((TimeOfDay)value, diagnostics, context);
      case OrmPackage.TRANSFORMATION:
        return validateTransformation((Transformation)value, diagnostics, context);
      case OrmPackage.TRANSIENT:
        return validateTransient((Transient)value, diagnostics, context);
      case OrmPackage.TYPE_CONVERTER:
        return validateTypeConverter((TypeConverter)value, diagnostics, context);
      case OrmPackage.UNION_PARTITIONING:
        return validateUnionPartitioning((UnionPartitioning)value, diagnostics, context);
      case OrmPackage.UNIQUE_CONSTRAINT:
        return validateUniqueConstraint((UniqueConstraint)value, diagnostics, context);
      case OrmPackage.VALUE_PARTITION:
        return validateValuePartition((ValuePartition)value, diagnostics, context);
      case OrmPackage.VALUE_PARTITIONING:
        return validateValuePartitioning((ValuePartitioning)value, diagnostics, context);
      case OrmPackage.VARIABLE_ONE_TO_ONE:
        return validateVariableOneToOne((VariableOneToOne)value, diagnostics, context);
      case OrmPackage.VERSION:
        return validateVersion((Version)value, diagnostics, context);
      case OrmPackage.WRITE_TRANSFORMER:
        return validateWriteTransformer((WriteTransformer)value, diagnostics, context);
      case OrmPackage.ACCESS_TYPE:
        return validateAccessType((AccessType)value, diagnostics, context);
      case OrmPackage.BATCH_FETCH_TYPE:
        return validateBatchFetchType((BatchFetchType)value, diagnostics, context);
      case OrmPackage.CACHE_COORDINATION_TYPE:
        return validateCacheCoordinationType((CacheCoordinationType)value, diagnostics, context);
      case OrmPackage.CACHE_ISOLATION_TYPE:
        return validateCacheIsolationType((CacheIsolationType)value, diagnostics, context);
      case OrmPackage.CACHE_KEY_TYPE:
        return validateCacheKeyType((CacheKeyType)value, diagnostics, context);
      case OrmPackage.CACHE_TYPE:
        return validateCacheType((CacheType)value, diagnostics, context);
      case OrmPackage.CHANGE_TRACKING_TYPE:
        return validateChangeTrackingType((ChangeTrackingType)value, diagnostics, context);
      case OrmPackage.DIRECTION_TYPE:
        return validateDirectionType((DirectionType)value, diagnostics, context);
      case OrmPackage.DISCRIMINATOR_TYPE:
        return validateDiscriminatorType((DiscriminatorType)value, diagnostics, context);
      case OrmPackage.ENUM_TYPE:
        return validateEnumType((EnumType)value, diagnostics, context);
      case OrmPackage.EXISTENCE_TYPE:
        return validateExistenceType((ExistenceType)value, diagnostics, context);
      case OrmPackage.FETCH_TYPE:
        return validateFetchType((FetchType)value, diagnostics, context);
      case OrmPackage.GENERATION_TYPE:
        return validateGenerationType((GenerationType)value, diagnostics, context);
      case OrmPackage.ID_VALIDATION:
        return validateIdValidation((IdValidation)value, diagnostics, context);
      case OrmPackage.INHERITANCE_TYPE:
        return validateInheritanceType((InheritanceType)value, diagnostics, context);
      case OrmPackage.JOIN_FETCH_TYPE:
        return validateJoinFetchType((JoinFetchType)value, diagnostics, context);
      case OrmPackage.LOCK_MODE_TYPE:
        return validateLockModeType((LockModeType)value, diagnostics, context);
      case OrmPackage.MULTITENANT_TYPE:
        return validateMultitenantType((MultitenantType)value, diagnostics, context);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE:
        return validateOptimisticLockingType((OptimisticLockingType)value, diagnostics, context);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE:
        return validateOrderColumnCorrectionType((OrderColumnCorrectionType)value, diagnostics, context);
      case OrmPackage.SUPPORTED_VERSIONS_TYPE:
        return validateSupportedVersionsType((SupportedVersionsType)value, diagnostics, context);
      case OrmPackage.TEMPORAL_TYPE:
        return validateTemporalType((TemporalType)value, diagnostics, context);
      case OrmPackage.ACCESS_TYPE_OBJECT:
        return validateAccessTypeObject((AccessType)value, diagnostics, context);
      case OrmPackage.BATCH_FETCH_TYPE_OBJECT:
        return validateBatchFetchTypeObject((BatchFetchType)value, diagnostics, context);
      case OrmPackage.CACHE_COORDINATION_TYPE_OBJECT:
        return validateCacheCoordinationTypeObject((CacheCoordinationType)value, diagnostics, context);
      case OrmPackage.CACHE_ISOLATION_TYPE_OBJECT:
        return validateCacheIsolationTypeObject((CacheIsolationType)value, diagnostics, context);
      case OrmPackage.CACHE_KEY_TYPE_OBJECT:
        return validateCacheKeyTypeObject((CacheKeyType)value, diagnostics, context);
      case OrmPackage.CACHE_TYPE_OBJECT:
        return validateCacheTypeObject((CacheType)value, diagnostics, context);
      case OrmPackage.CHANGE_TRACKING_TYPE_OBJECT:
        return validateChangeTrackingTypeObject((ChangeTrackingType)value, diagnostics, context);
      case OrmPackage.DIRECTION_TYPE_OBJECT:
        return validateDirectionTypeObject((DirectionType)value, diagnostics, context);
      case OrmPackage.DISCRIMINATOR_TYPE_OBJECT:
        return validateDiscriminatorTypeObject((DiscriminatorType)value, diagnostics, context);
      case OrmPackage.DISCRIMINATOR_VALUE:
        return validateDiscriminatorValue((String)value, diagnostics, context);
      case OrmPackage.ENUMERATED:
        return validateEnumerated((EnumType)value, diagnostics, context);
      case OrmPackage.ENUM_TYPE_OBJECT:
        return validateEnumTypeObject((EnumType)value, diagnostics, context);
      case OrmPackage.EXISTENCE_TYPE_OBJECT:
        return validateExistenceTypeObject((ExistenceType)value, diagnostics, context);
      case OrmPackage.FETCH_TYPE_OBJECT:
        return validateFetchTypeObject((FetchType)value, diagnostics, context);
      case OrmPackage.GENERATION_TYPE_OBJECT:
        return validateGenerationTypeObject((GenerationType)value, diagnostics, context);
      case OrmPackage.ID_VALIDATION_OBJECT:
        return validateIdValidationObject((IdValidation)value, diagnostics, context);
      case OrmPackage.INHERITANCE_TYPE_OBJECT:
        return validateInheritanceTypeObject((InheritanceType)value, diagnostics, context);
      case OrmPackage.JOIN_FETCH_TYPE_OBJECT:
        return validateJoinFetchTypeObject((JoinFetchType)value, diagnostics, context);
      case OrmPackage.LOCK_MODE_TYPE_OBJECT:
        return validateLockModeTypeObject((LockModeType)value, diagnostics, context);
      case OrmPackage.MULTITENANT_TYPE_OBJECT:
        return validateMultitenantTypeObject((MultitenantType)value, diagnostics, context);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE_OBJECT:
        return validateOptimisticLockingTypeObject((OptimisticLockingType)value, diagnostics, context);
      case OrmPackage.ORDER_BY:
        return validateOrderBy((String)value, diagnostics, context);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE_OBJECT:
        return validateOrderColumnCorrectionTypeObject((OrderColumnCorrectionType)value, diagnostics, context);
      case OrmPackage.SUPPORTED_VERSIONS_TYPE_OBJECT:
        return validateSupportedVersionsTypeObject((SupportedVersionsType)value, diagnostics, context);
      case OrmPackage.TEMPORAL:
        return validateTemporal((TemporalType)value, diagnostics, context);
      case OrmPackage.TEMPORAL_TYPE_OBJECT:
        return validateTemporalTypeObject((TemporalType)value, diagnostics, context);
      case OrmPackage.VERSION_TYPE:
        return validateVersionType((String)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessMethods(AccessMethods accessMethods, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)accessMethods, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAdditionalCriteria(AdditionalCriteria additionalCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)additionalCriteria, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)array, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssociationOverride(AssociationOverride associationOverride, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)associationOverride, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttributeOverride(AttributeOverride attributeOverride, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)attributeOverride, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttributes(Attributes attributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)attributes, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBasic(Basic basic, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)basic, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBasicCollection(BasicCollection basicCollection, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)basicCollection, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBasicMap(BasicMap basicMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)basicMap, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBatchFetch(BatchFetch batchFetch, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)batchFetch, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCache(Cache cache, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)cache, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCacheInterceptor(CacheInterceptor cacheInterceptor, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)cacheInterceptor, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCascadeType(CascadeType cascadeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)cascadeType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChangeTracking(ChangeTracking changeTracking, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)changeTracking, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClassExtractor(ClassExtractor classExtractor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)classExtractor, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCloneCopyPolicy(CloneCopyPolicy cloneCopyPolicy, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)cloneCopyPolicy, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCollectionTable(CollectionTable collectionTable, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)collectionTable, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)column, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumnResult(ColumnResult columnResult, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)columnResult, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConversionValue(ConversionValue conversionValue, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)conversionValue, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConverter(Converter converter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)converter, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCopyPolicy(CopyPolicy copyPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)copyPolicy, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCustomizer(Customizer customizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)customizer, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDiscriminatorClass(DiscriminatorClass discriminatorClass, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)discriminatorClass, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDiscriminatorColumn(DiscriminatorColumn discriminatorColumn, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)discriminatorColumn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEclipselinkCollectionTable(EclipselinkCollectionTable eclipselinkCollectionTable,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)eclipselinkCollectionTable, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateElementCollection(ElementCollection elementCollection, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)elementCollection, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmbeddable(Embeddable embeddable, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)embeddable, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmbedded(Embedded embedded, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)embedded, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmbeddedId(EmbeddedId embeddedId, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)embeddedId, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmptyType(EmptyType emptyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)emptyType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)entity, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEntityListener(EntityListener entityListener, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)entityListener, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEntityListeners(EntityListeners entityListeners, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)entityListeners, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEntityMappingsType(EntityMappingsType entityMappingsType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)entityMappingsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEntityResult(EntityResult entityResult, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)entityResult, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetchAttribute(FetchAttribute fetchAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)fetchAttribute, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetchGroup(FetchGroup fetchGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)fetchGroup, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFieldResult(FieldResult fieldResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)fieldResult, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGeneratedValue(GeneratedValue generatedValue, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)generatedValue, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHashPartitioning(HashPartitioning hashPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)hashPartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateId(Id id, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)id, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIdClass(IdClass idClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)idClass, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIndex(Index index, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)index, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInheritance(Inheritance inheritance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)inheritance, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstantiationCopyPolicy(InstantiationCopyPolicy instantiationCopyPolicy,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)instantiationCopyPolicy, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateJoinColumn(JoinColumn joinColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)joinColumn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateJoinTable(JoinTable joinTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)joinTable, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLob(Lob lob, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)lob, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateManyToMany(ManyToMany manyToMany, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)manyToMany, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateManyToOne(ManyToOne manyToOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)manyToOne, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMapKey(MapKey mapKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)mapKey, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMapKeyClass(MapKeyClass mapKeyClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)mapKeyClass, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMapKeyColumn(MapKeyColumn mapKeyColumn, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)mapKeyColumn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMapKeyJoinColumn(MapKeyJoinColumn mapKeyJoinColumn, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)mapKeyJoinColumn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMappedSuperclass(MappedSuperclass mappedSuperclass, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)mappedSuperclass, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMultitenant(Multitenant multitenant, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)multitenant, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNamedNativeQuery(NamedNativeQuery namedNativeQuery, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)namedNativeQuery, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNamedPlsqlStoredFunctionQuery(NamedPlsqlStoredFunctionQuery namedPlsqlStoredFunctionQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)namedPlsqlStoredFunctionQuery, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNamedPlsqlStoredProcedureQuery(NamedPlsqlStoredProcedureQuery namedPlsqlStoredProcedureQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)namedPlsqlStoredProcedureQuery, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNamedQuery(NamedQuery namedQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)namedQuery, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNamedStoredFunctionQuery(NamedStoredFunctionQuery namedStoredFunctionQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)namedStoredFunctionQuery, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNamedStoredProcedureQuery(NamedStoredProcedureQuery namedStoredProcedureQuery,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)namedStoredProcedureQuery, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObjectTypeConverter(ObjectTypeConverter objectTypeConverter, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)objectTypeConverter, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOneToMany(OneToMany oneToMany, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)oneToMany, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOneToOne(OneToOne oneToOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)oneToOne, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOptimisticLocking(OptimisticLocking optimisticLocking, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)optimisticLocking, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOrderColumn(OrderColumn orderColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)orderColumn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePartitioning(Partitioning partitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)partitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePersistenceUnitDefaults(PersistenceUnitDefaults persistenceUnitDefaults,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)persistenceUnitDefaults, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePersistenceUnitMetadata(PersistenceUnitMetadata persistenceUnitMetadata,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)persistenceUnitMetadata, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePinnedPartitioning(PinnedPartitioning pinnedPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)pinnedPartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlsqlParameter(PlsqlParameter plsqlParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)plsqlParameter, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlsqlRecord(PlsqlRecord plsqlRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)plsqlRecord, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlsqlTable(PlsqlTable plsqlTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)plsqlTable, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePostLoad(PostLoad postLoad, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)postLoad, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePostPersist(PostPersist postPersist, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)postPersist, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePostRemove(PostRemove postRemove, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)postRemove, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePostUpdate(PostUpdate postUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)postUpdate, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrePersist(PrePersist prePersist, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)prePersist, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreRemove(PreRemove preRemove, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)preRemove, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreUpdate(PreUpdate preUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)preUpdate, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)primaryKey, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrimaryKeyJoinColumn(PrimaryKeyJoinColumn primaryKeyJoinColumn, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)primaryKeyJoinColumn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)property, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQueryHint(QueryHint queryHint, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)queryHint, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQueryRedirectors(QueryRedirectors queryRedirectors, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)queryRedirectors, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRangePartition(RangePartition rangePartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)rangePartition, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRangePartitioning(RangePartitioning rangePartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)rangePartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReadTransformer(ReadTransformer readTransformer, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)readTransformer, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReplicationPartitioning(ReplicationPartitioning replicationPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)replicationPartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReturnInsert(ReturnInsert returnInsert, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)returnInsert, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRoundRobinPartitioning(RoundRobinPartitioning roundRobinPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)roundRobinPartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSecondaryTable(SecondaryTable secondaryTable, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)secondaryTable, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSequenceGenerator(SequenceGenerator sequenceGenerator, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)sequenceGenerator, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSqlResultSetMapping(SqlResultSetMapping sqlResultSetMapping, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)sqlResultSetMapping, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStoredProcedureParameter(StoredProcedureParameter storedProcedureParameter,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)storedProcedureParameter, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStruct(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)struct, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStructConverter(StructConverter structConverter, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)structConverter, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStructure(Structure structure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)structure, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)table, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTableGenerator(TableGenerator tableGenerator, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)tableGenerator, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTenantDiscriminator(TenantDiscriminator tenantDiscriminator, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)tenantDiscriminator, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeOfDay(TimeOfDay timeOfDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)timeOfDay, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransformation(Transformation transformation, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)transformation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransient(Transient transient_, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)transient_, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTypeConverter(TypeConverter typeConverter, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)typeConverter, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnionPartitioning(UnionPartitioning unionPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)unionPartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUniqueConstraint(UniqueConstraint uniqueConstraint, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)uniqueConstraint, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateValuePartition(ValuePartition valuePartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)valuePartition, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateValuePartitioning(ValuePartitioning valuePartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)valuePartitioning, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVariableOneToOne(VariableOneToOne variableOneToOne, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)variableOneToOne, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)version, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWriteTransformer(WriteTransformer writeTransformer, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validate_EveryDefaultConstraint((EObject)writeTransformer, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBatchFetchType(BatchFetchType batchFetchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCacheCoordinationType(CacheCoordinationType cacheCoordinationType,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCacheIsolationType(CacheIsolationType cacheIsolationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCacheKeyType(CacheKeyType cacheKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCacheType(CacheType cacheType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChangeTrackingType(ChangeTrackingType changeTrackingType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDiscriminatorType(DiscriminatorType discriminatorType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEnumType(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExistenceType(ExistenceType existenceType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetchType(FetchType fetchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGenerationType(GenerationType generationType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIdValidation(IdValidation idValidation, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInheritanceType(InheritanceType inheritanceType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateJoinFetchType(JoinFetchType joinFetchType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLockModeType(LockModeType lockModeType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMultitenantType(MultitenantType multitenantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOptimisticLockingType(OptimisticLockingType optimisticLockingType,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOrderColumnCorrectionType(OrderColumnCorrectionType orderColumnCorrectionType,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSupportedVersionsType(SupportedVersionsType supportedVersionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTemporalType(TemporalType temporalType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBatchFetchTypeObject(BatchFetchType batchFetchTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCacheCoordinationTypeObject(CacheCoordinationType cacheCoordinationTypeObject,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCacheIsolationTypeObject(CacheIsolationType cacheIsolationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCacheKeyTypeObject(CacheKeyType cacheKeyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCacheTypeObject(CacheType cacheTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChangeTrackingTypeObject(ChangeTrackingType changeTrackingTypeObject,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDirectionTypeObject(DirectionType directionTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDiscriminatorTypeObject(DiscriminatorType discriminatorTypeObject,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDiscriminatorValue(String discriminatorValue, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEnumerated(EnumType enumerated, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEnumTypeObject(EnumType enumTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExistenceTypeObject(ExistenceType existenceTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetchTypeObject(FetchType fetchTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGenerationTypeObject(GenerationType generationTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIdValidationObject(IdValidation idValidationObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInheritanceTypeObject(InheritanceType inheritanceTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateJoinFetchTypeObject(JoinFetchType joinFetchTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLockModeTypeObject(LockModeType lockModeTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMultitenantTypeObject(MultitenantType multitenantTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOptimisticLockingTypeObject(OptimisticLockingType optimisticLockingTypeObject,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOrderBy(String orderBy, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOrderColumnCorrectionTypeObject(OrderColumnCorrectionType orderColumnCorrectionTypeObject,
      DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSupportedVersionsTypeObject(SupportedVersionsType supportedVersionsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTemporal(TemporalType temporal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTemporalTypeObject(TemporalType temporalTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVersionType(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateVersionType_Pattern(versionType, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @see #validateVersionType_Pattern
   */
  public static final PatternMatcher [][] VERSION_TYPE__PATTERN__VALUES = new PatternMatcher [][] {
      new PatternMatcher [] {
        XMLTypeUtil.createPatternMatcher("[0-9]+(\\.[0-9]+)*")
      }
    };

  /**
   * Validates the Pattern constraint of '<em>Version Type</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVersionType_Pattern(String versionType, DiagnosticChain diagnostics,
      Map<Object, Object> context) {
    return validatePattern(OrmPackage.eINSTANCE.getVersionType(), versionType, VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} // OrmValidator
