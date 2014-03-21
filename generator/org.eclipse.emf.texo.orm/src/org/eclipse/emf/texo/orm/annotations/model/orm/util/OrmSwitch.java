/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmSwitch.java,v 1.5 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.texo.orm.annotations.model.orm.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage
 * @generated
 */
public class OrmSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static OrmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmSwitch() {
    if (modelPackage == null) {
      modelPackage = OrmPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case OrmPackage.ACCESS_METHODS: {
        AccessMethods accessMethods = (AccessMethods)theEObject;
        T result = caseAccessMethods(accessMethods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ADDITIONAL_CRITERIA: {
        AdditionalCriteria additionalCriteria = (AdditionalCriteria)theEObject;
        T result = caseAdditionalCriteria(additionalCriteria);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ARRAY: {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ASSOCIATION_OVERRIDE: {
        AssociationOverride associationOverride = (AssociationOverride)theEObject;
        T result = caseAssociationOverride(associationOverride);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ATTRIBUTE_OVERRIDE: {
        AttributeOverride attributeOverride = (AttributeOverride)theEObject;
        T result = caseAttributeOverride(attributeOverride);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ATTRIBUTES: {
        Attributes attributes = (Attributes)theEObject;
        T result = caseAttributes(attributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.BASIC: {
        Basic basic = (Basic)theEObject;
        T result = caseBasic(basic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.BASIC_COLLECTION: {
        BasicCollection basicCollection = (BasicCollection)theEObject;
        T result = caseBasicCollection(basicCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.BASIC_MAP: {
        BasicMap basicMap = (BasicMap)theEObject;
        T result = caseBasicMap(basicMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.BATCH_FETCH: {
        BatchFetch batchFetch = (BatchFetch)theEObject;
        T result = caseBatchFetch(batchFetch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CACHE: {
        Cache cache = (Cache)theEObject;
        T result = caseCache(cache);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CACHE_INTERCEPTOR: {
        CacheInterceptor cacheInterceptor = (CacheInterceptor)theEObject;
        T result = caseCacheInterceptor(cacheInterceptor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CASCADE_TYPE: {
        CascadeType cascadeType = (CascadeType)theEObject;
        T result = caseCascadeType(cascadeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CHANGE_TRACKING: {
        ChangeTracking changeTracking = (ChangeTracking)theEObject;
        T result = caseChangeTracking(changeTracking);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CLASS_EXTRACTOR: {
        ClassExtractor classExtractor = (ClassExtractor)theEObject;
        T result = caseClassExtractor(classExtractor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CLONE_COPY_POLICY: {
        CloneCopyPolicy cloneCopyPolicy = (CloneCopyPolicy)theEObject;
        T result = caseCloneCopyPolicy(cloneCopyPolicy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COLLECTION_TABLE: {
        CollectionTable collectionTable = (CollectionTable)theEObject;
        T result = caseCollectionTable(collectionTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COLUMN: {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COLUMN_RESULT: {
        ColumnResult columnResult = (ColumnResult)theEObject;
        T result = caseColumnResult(columnResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CONVERSION_VALUE: {
        ConversionValue conversionValue = (ConversionValue)theEObject;
        T result = caseConversionValue(conversionValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CONVERTER: {
        Converter converter = (Converter)theEObject;
        T result = caseConverter(converter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COPY_POLICY: {
        CopyPolicy copyPolicy = (CopyPolicy)theEObject;
        T result = caseCopyPolicy(copyPolicy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CUSTOMIZER: {
        Customizer customizer = (Customizer)theEObject;
        T result = caseCustomizer(customizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.DISCRIMINATOR_CLASS: {
        DiscriminatorClass discriminatorClass = (DiscriminatorClass)theEObject;
        T result = caseDiscriminatorClass(discriminatorClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.DISCRIMINATOR_COLUMN: {
        DiscriminatorColumn discriminatorColumn = (DiscriminatorColumn)theEObject;
        T result = caseDiscriminatorColumn(discriminatorColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ECLIPSELINK_COLLECTION_TABLE: {
        EclipselinkCollectionTable eclipselinkCollectionTable = (EclipselinkCollectionTable)theEObject;
        T result = caseEclipselinkCollectionTable(eclipselinkCollectionTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ELEMENT_COLLECTION: {
        ElementCollection elementCollection = (ElementCollection)theEObject;
        T result = caseElementCollection(elementCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.EMBEDDABLE: {
        Embeddable embeddable = (Embeddable)theEObject;
        T result = caseEmbeddable(embeddable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.EMBEDDED: {
        Embedded embedded = (Embedded)theEObject;
        T result = caseEmbedded(embedded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.EMBEDDED_ID: {
        EmbeddedId embeddedId = (EmbeddedId)theEObject;
        T result = caseEmbeddedId(embeddedId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.EMPTY_TYPE: {
        EmptyType emptyType = (EmptyType)theEObject;
        T result = caseEmptyType(emptyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ENTITY: {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ENTITY_LISTENER: {
        EntityListener entityListener = (EntityListener)theEObject;
        T result = caseEntityListener(entityListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ENTITY_LISTENERS: {
        EntityListeners entityListeners = (EntityListeners)theEObject;
        T result = caseEntityListeners(entityListeners);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ENTITY_MAPPINGS_TYPE: {
        EntityMappingsType entityMappingsType = (EntityMappingsType)theEObject;
        T result = caseEntityMappingsType(entityMappingsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ENTITY_RESULT: {
        EntityResult entityResult = (EntityResult)theEObject;
        T result = caseEntityResult(entityResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.FETCH_ATTRIBUTE: {
        FetchAttribute fetchAttribute = (FetchAttribute)theEObject;
        T result = caseFetchAttribute(fetchAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.FETCH_GROUP: {
        FetchGroup fetchGroup = (FetchGroup)theEObject;
        T result = caseFetchGroup(fetchGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.FIELD_RESULT: {
        FieldResult fieldResult = (FieldResult)theEObject;
        T result = caseFieldResult(fieldResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.GENERATED_VALUE: {
        GeneratedValue generatedValue = (GeneratedValue)theEObject;
        T result = caseGeneratedValue(generatedValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.HASH_PARTITIONING: {
        HashPartitioning hashPartitioning = (HashPartitioning)theEObject;
        T result = caseHashPartitioning(hashPartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ID: {
        Id id = (Id)theEObject;
        T result = caseId(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ID_CLASS: {
        IdClass idClass = (IdClass)theEObject;
        T result = caseIdClass(idClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INDEX: {
        Index index = (Index)theEObject;
        T result = caseIndex(index);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INHERITANCE: {
        Inheritance inheritance = (Inheritance)theEObject;
        T result = caseInheritance(inheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INSTANTIATION_COPY_POLICY: {
        InstantiationCopyPolicy instantiationCopyPolicy = (InstantiationCopyPolicy)theEObject;
        T result = caseInstantiationCopyPolicy(instantiationCopyPolicy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.JOIN_COLUMN: {
        JoinColumn joinColumn = (JoinColumn)theEObject;
        T result = caseJoinColumn(joinColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.JOIN_TABLE: {
        JoinTable joinTable = (JoinTable)theEObject;
        T result = caseJoinTable(joinTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.LOB: {
        Lob lob = (Lob)theEObject;
        T result = caseLob(lob);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MANY_TO_MANY: {
        ManyToMany manyToMany = (ManyToMany)theEObject;
        T result = caseManyToMany(manyToMany);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MANY_TO_ONE: {
        ManyToOne manyToOne = (ManyToOne)theEObject;
        T result = caseManyToOne(manyToOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MAP_KEY: {
        MapKey mapKey = (MapKey)theEObject;
        T result = caseMapKey(mapKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MAP_KEY_CLASS: {
        MapKeyClass mapKeyClass = (MapKeyClass)theEObject;
        T result = caseMapKeyClass(mapKeyClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MAP_KEY_COLUMN: {
        MapKeyColumn mapKeyColumn = (MapKeyColumn)theEObject;
        T result = caseMapKeyColumn(mapKeyColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MAP_KEY_JOIN_COLUMN: {
        MapKeyJoinColumn mapKeyJoinColumn = (MapKeyJoinColumn)theEObject;
        T result = caseMapKeyJoinColumn(mapKeyJoinColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MAPPED_SUPERCLASS: {
        MappedSuperclass mappedSuperclass = (MappedSuperclass)theEObject;
        T result = caseMappedSuperclass(mappedSuperclass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MULTITENANT: {
        Multitenant multitenant = (Multitenant)theEObject;
        T result = caseMultitenant(multitenant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NAMED_NATIVE_QUERY: {
        NamedNativeQuery namedNativeQuery = (NamedNativeQuery)theEObject;
        T result = caseNamedNativeQuery(namedNativeQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NAMED_PLSQL_STORED_FUNCTION_QUERY: {
        NamedPlsqlStoredFunctionQuery namedPlsqlStoredFunctionQuery = (NamedPlsqlStoredFunctionQuery)theEObject;
        T result = caseNamedPlsqlStoredFunctionQuery(namedPlsqlStoredFunctionQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY: {
        NamedPlsqlStoredProcedureQuery namedPlsqlStoredProcedureQuery = (NamedPlsqlStoredProcedureQuery)theEObject;
        T result = caseNamedPlsqlStoredProcedureQuery(namedPlsqlStoredProcedureQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NAMED_QUERY: {
        NamedQuery namedQuery = (NamedQuery)theEObject;
        T result = caseNamedQuery(namedQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY: {
        NamedStoredFunctionQuery namedStoredFunctionQuery = (NamedStoredFunctionQuery)theEObject;
        T result = caseNamedStoredFunctionQuery(namedStoredFunctionQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NAMED_STORED_PROCEDURE_QUERY: {
        NamedStoredProcedureQuery namedStoredProcedureQuery = (NamedStoredProcedureQuery)theEObject;
        T result = caseNamedStoredProcedureQuery(namedStoredProcedureQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.OBJECT_TYPE_CONVERTER: {
        ObjectTypeConverter objectTypeConverter = (ObjectTypeConverter)theEObject;
        T result = caseObjectTypeConverter(objectTypeConverter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ONE_TO_MANY: {
        OneToMany oneToMany = (OneToMany)theEObject;
        T result = caseOneToMany(oneToMany);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ONE_TO_ONE: {
        OneToOne oneToOne = (OneToOne)theEObject;
        T result = caseOneToOne(oneToOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.OPTIMISTIC_LOCKING: {
        OptimisticLocking optimisticLocking = (OptimisticLocking)theEObject;
        T result = caseOptimisticLocking(optimisticLocking);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ORDER_COLUMN: {
        OrderColumn orderColumn = (OrderColumn)theEObject;
        T result = caseOrderColumn(orderColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PARTITIONING: {
        Partitioning partitioning = (Partitioning)theEObject;
        T result = casePartitioning(partitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS: {
        PersistenceUnitDefaults persistenceUnitDefaults = (PersistenceUnitDefaults)theEObject;
        T result = casePersistenceUnitDefaults(persistenceUnitDefaults);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PERSISTENCE_UNIT_METADATA: {
        PersistenceUnitMetadata persistenceUnitMetadata = (PersistenceUnitMetadata)theEObject;
        T result = casePersistenceUnitMetadata(persistenceUnitMetadata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PINNED_PARTITIONING: {
        PinnedPartitioning pinnedPartitioning = (PinnedPartitioning)theEObject;
        T result = casePinnedPartitioning(pinnedPartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PLSQL_PARAMETER: {
        PlsqlParameter plsqlParameter = (PlsqlParameter)theEObject;
        T result = casePlsqlParameter(plsqlParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PLSQL_RECORD: {
        PlsqlRecord plsqlRecord = (PlsqlRecord)theEObject;
        T result = casePlsqlRecord(plsqlRecord);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PLSQL_TABLE: {
        PlsqlTable plsqlTable = (PlsqlTable)theEObject;
        T result = casePlsqlTable(plsqlTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.POST_LOAD: {
        PostLoad postLoad = (PostLoad)theEObject;
        T result = casePostLoad(postLoad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.POST_PERSIST: {
        PostPersist postPersist = (PostPersist)theEObject;
        T result = casePostPersist(postPersist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.POST_REMOVE: {
        PostRemove postRemove = (PostRemove)theEObject;
        T result = casePostRemove(postRemove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.POST_UPDATE: {
        PostUpdate postUpdate = (PostUpdate)theEObject;
        T result = casePostUpdate(postUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PRE_PERSIST: {
        PrePersist prePersist = (PrePersist)theEObject;
        T result = casePrePersist(prePersist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PRE_REMOVE: {
        PreRemove preRemove = (PreRemove)theEObject;
        T result = casePreRemove(preRemove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PRE_UPDATE: {
        PreUpdate preUpdate = (PreUpdate)theEObject;
        T result = casePreUpdate(preUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PRIMARY_KEY: {
        PrimaryKey primaryKey = (PrimaryKey)theEObject;
        T result = casePrimaryKey(primaryKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PRIMARY_KEY_JOIN_COLUMN: {
        PrimaryKeyJoinColumn primaryKeyJoinColumn = (PrimaryKeyJoinColumn)theEObject;
        T result = casePrimaryKeyJoinColumn(primaryKeyJoinColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PROPERTY: {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.QUERY_HINT: {
        QueryHint queryHint = (QueryHint)theEObject;
        T result = caseQueryHint(queryHint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.QUERY_REDIRECTORS: {
        QueryRedirectors queryRedirectors = (QueryRedirectors)theEObject;
        T result = caseQueryRedirectors(queryRedirectors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RANGE_PARTITION: {
        RangePartition rangePartition = (RangePartition)theEObject;
        T result = caseRangePartition(rangePartition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RANGE_PARTITIONING: {
        RangePartitioning rangePartitioning = (RangePartitioning)theEObject;
        T result = caseRangePartitioning(rangePartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.READ_TRANSFORMER: {
        ReadTransformer readTransformer = (ReadTransformer)theEObject;
        T result = caseReadTransformer(readTransformer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.REPLICATION_PARTITIONING: {
        ReplicationPartitioning replicationPartitioning = (ReplicationPartitioning)theEObject;
        T result = caseReplicationPartitioning(replicationPartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RETURN_INSERT: {
        ReturnInsert returnInsert = (ReturnInsert)theEObject;
        T result = caseReturnInsert(returnInsert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROUND_ROBIN_PARTITIONING: {
        RoundRobinPartitioning roundRobinPartitioning = (RoundRobinPartitioning)theEObject;
        T result = caseRoundRobinPartitioning(roundRobinPartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.SECONDARY_TABLE: {
        SecondaryTable secondaryTable = (SecondaryTable)theEObject;
        T result = caseSecondaryTable(secondaryTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.SEQUENCE_GENERATOR: {
        SequenceGenerator sequenceGenerator = (SequenceGenerator)theEObject;
        T result = caseSequenceGenerator(sequenceGenerator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.SQL_RESULT_SET_MAPPING: {
        SqlResultSetMapping sqlResultSetMapping = (SqlResultSetMapping)theEObject;
        T result = caseSqlResultSetMapping(sqlResultSetMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.STORED_PROCEDURE_PARAMETER: {
        StoredProcedureParameter storedProcedureParameter = (StoredProcedureParameter)theEObject;
        T result = caseStoredProcedureParameter(storedProcedureParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.STRUCT: {
        Struct struct = (Struct)theEObject;
        T result = caseStruct(struct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.STRUCT_CONVERTER: {
        StructConverter structConverter = (StructConverter)theEObject;
        T result = caseStructConverter(structConverter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.STRUCTURE: {
        Structure structure = (Structure)theEObject;
        T result = caseStructure(structure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TABLE: {
        Table table = (Table)theEObject;
        T result = caseTable(table);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TABLE_GENERATOR: {
        TableGenerator tableGenerator = (TableGenerator)theEObject;
        T result = caseTableGenerator(tableGenerator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TENANT_DISCRIMINATOR: {
        TenantDiscriminator tenantDiscriminator = (TenantDiscriminator)theEObject;
        T result = caseTenantDiscriminator(tenantDiscriminator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TIME_OF_DAY: {
        TimeOfDay timeOfDay = (TimeOfDay)theEObject;
        T result = caseTimeOfDay(timeOfDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TRANSFORMATION: {
        Transformation transformation = (Transformation)theEObject;
        T result = caseTransformation(transformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TRANSIENT: {
        Transient transient_ = (Transient)theEObject;
        T result = caseTransient(transient_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TYPE_CONVERTER: {
        TypeConverter typeConverter = (TypeConverter)theEObject;
        T result = caseTypeConverter(typeConverter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.UNION_PARTITIONING: {
        UnionPartitioning unionPartitioning = (UnionPartitioning)theEObject;
        T result = caseUnionPartitioning(unionPartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.UNIQUE_CONSTRAINT: {
        UniqueConstraint uniqueConstraint = (UniqueConstraint)theEObject;
        T result = caseUniqueConstraint(uniqueConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.VALUE_PARTITION: {
        ValuePartition valuePartition = (ValuePartition)theEObject;
        T result = caseValuePartition(valuePartition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.VALUE_PARTITIONING: {
        ValuePartitioning valuePartitioning = (ValuePartitioning)theEObject;
        T result = caseValuePartitioning(valuePartitioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.VARIABLE_ONE_TO_ONE: {
        VariableOneToOne variableOneToOne = (VariableOneToOne)theEObject;
        T result = caseVariableOneToOne(variableOneToOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.VERSION: {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.WRITE_TRANSFORMER: {
        WriteTransformer writeTransformer = (WriteTransformer)theEObject;
        T result = caseWriteTransformer(writeTransformer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessMethods(AccessMethods object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additional Criteria</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additional Criteria</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAdditionalCriteria(AdditionalCriteria object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseArray(Array object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Association Override</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association Override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociationOverride(AssociationOverride object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Override</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeOverride(AttributeOverride object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributes(Attributes object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasic(Basic object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Collection</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicCollection(BasicCollection object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Map</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicMap(BasicMap object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Batch Fetch</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Batch Fetch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBatchFetch(BatchFetch object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCache(Cache object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cache Interceptor</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cache Interceptor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCacheInterceptor(CacheInterceptor object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cascade Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cascade Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCascadeType(CascadeType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Tracking</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Tracking</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeTracking(ChangeTracking object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Extractor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Extractor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClassExtractor(ClassExtractor object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Clone Copy Policy</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clone Copy Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloneCopyPolicy(CloneCopyPolicy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Table</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionTable(CollectionTable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnResult(ColumnResult object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conversion Value</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conversion Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConversionValue(ConversionValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Converter</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Converter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConverter(Converter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Copy Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Copy Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCopyPolicy(CopyPolicy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Customizer</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Customizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomizer(Customizer object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminator Class</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminator Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminatorClass(DiscriminatorClass object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminator Column</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminator Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminatorColumn(DiscriminatorColumn object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eclipselink Collection Table</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eclipselink Collection Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEclipselinkCollectionTable(EclipselinkCollectionTable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Collection</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementCollection(ElementCollection object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embeddable</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embeddable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddable(Embeddable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embedded</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embedded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbedded(Embedded object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embedded Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embedded Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddedId(EmbeddedId object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Type</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyType(EmptyType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Listener</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityListener(EntityListener object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Listeners</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Listeners</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityListeners(EntityListeners object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Mappings Type</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Mappings Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityMappingsType(EntityMappingsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityResult(EntityResult object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetch Attribute</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFetchAttribute(FetchAttribute object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Fetch Group</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFetchGroup(FetchGroup object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Field Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldResult(FieldResult object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generated Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generated Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneratedValue(GeneratedValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hash Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hash Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseHashPartitioning(HashPartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseId(Id object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Class</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdClass(IdClass object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIndex(Index object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInheritance(Inheritance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instantiation Copy Policy</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instantiation Copy Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstantiationCopyPolicy(InstantiationCopyPolicy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinColumn(JoinColumn object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Table</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinTable(JoinTable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lob</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lob</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLob(Lob object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many To Many</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many To Many</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManyToMany(ManyToMany object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many To One</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many To One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManyToOne(ManyToOne object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Key</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapKey(MapKey object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Key Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Key Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapKeyClass(MapKeyClass object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Key Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Key Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapKeyColumn(MapKeyColumn object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Key Join Column</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Key Join Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapKeyJoinColumn(MapKeyJoinColumn object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapped Superclass</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapped Superclass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappedSuperclass(MappedSuperclass object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multitenant</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multitenant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultitenant(Multitenant object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Named Native Query</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Native Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedNativeQuery(NamedNativeQuery object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Plsql Stored Function Query</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Plsql Stored Function Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNamedPlsqlStoredFunctionQuery(NamedPlsqlStoredFunctionQuery object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Named Plsql Stored Procedure Query</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Plsql Stored Procedure Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNamedPlsqlStoredProcedureQuery(NamedPlsqlStoredProcedureQuery object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Named Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedQuery(NamedQuery object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Stored Function Query</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Stored Function Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNamedStoredFunctionQuery(NamedStoredFunctionQuery object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Named Stored Procedure Query</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Stored Procedure Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedStoredProcedureQuery(NamedStoredProcedureQuery object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Type Converter</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Type Converter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectTypeConverter(ObjectTypeConverter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One To Many</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One To Many</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneToMany(OneToMany object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One To One</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One To One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneToOne(OneToOne object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optimistic Locking</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optimistic Locking</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptimisticLocking(OptimisticLocking object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderColumn(OrderColumn object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePartitioning(Partitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Persistence Unit Defaults</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Persistence Unit Defaults</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersistenceUnitDefaults(PersistenceUnitDefaults object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Persistence Unit Metadata</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Persistence Unit Metadata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersistenceUnitMetadata(PersistenceUnitMetadata object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pinned Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pinned Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePinnedPartitioning(PinnedPartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Plsql Parameter</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plsql Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlsqlParameter(PlsqlParameter object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Plsql Record</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plsql Record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlsqlRecord(PlsqlRecord object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Plsql Table</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plsql Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlsqlTable(PlsqlTable object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Post Load</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostLoad(PostLoad object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Persist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Persist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostPersist(PostPersist object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Remove</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Remove</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostRemove(PostRemove object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostUpdate(PostUpdate object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Persist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Persist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrePersist(PrePersist object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Remove</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Remove</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreRemove(PreRemove object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Update</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreUpdate(PreUpdate object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryKey(PrimaryKey object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Key Join Column</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Key Join Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryKeyJoinColumn(PrimaryKeyJoinColumn object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Hint</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Hint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryHint(QueryHint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Redirectors</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Redirectors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryRedirectors(QueryRedirectors object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Partition</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Partition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRangePartition(RangePartition object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Range Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRangePartitioning(RangePartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Read Transformer</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read Transformer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReadTransformer(ReadTransformer object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replication Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replication Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReplicationPartitioning(ReplicationPartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Return Insert</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Insert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReturnInsert(ReturnInsert object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Round Robin Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Round Robin Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRoundRobinPartitioning(RoundRobinPartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Secondary Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Secondary Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecondaryTable(SecondaryTable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Generator</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceGenerator(SequenceGenerator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sql Result Set Mapping</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sql Result Set Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSqlResultSetMapping(SqlResultSetMapping object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stored Procedure Parameter</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stored Procedure Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoredProcedureParameter(StoredProcedureParameter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStruct(Struct object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Struct Converter</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Converter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructConverter(StructConverter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStructure(Structure object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTable(Table object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableGenerator(TableGenerator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tenant Discriminator</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tenant Discriminator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTenantDiscriminator(TenantDiscriminator object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeOfDay(TimeOfDay object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransformation(Transformation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transient</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransient(Transient object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Converter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Converter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeConverter(TypeConverter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseUnionPartitioning(UnionPartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniqueConstraint(UniqueConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Partition</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Partition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseValuePartition(ValuePartition object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Value Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Partitioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseValuePartitioning(ValuePartitioning object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Variable One To One</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable One To One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableOneToOne(VariableOneToOne object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Transformer</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Transformer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteTransformer(WriteTransformer object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} // OrmSwitch
