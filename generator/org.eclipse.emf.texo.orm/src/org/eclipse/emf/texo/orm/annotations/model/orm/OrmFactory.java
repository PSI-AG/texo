/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmFactory.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage
 * @generated
 */
public interface OrmFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  OrmFactory eINSTANCE = org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Access Methods</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Access Methods</em>'.
   * @generated
   */
  AccessMethods createAccessMethods();

  /**
   * Returns a new object of class '<em>Additional Criteria</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Additional Criteria</em>'.
   * @generated
   */
	AdditionalCriteria createAdditionalCriteria();

		/**
   * Returns a new object of class '<em>Array</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Array</em>'.
   * @generated
   */
	Array createArray();

		/**
   * Returns a new object of class '<em>Association Override</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Association Override</em>'.
   * @generated
   */
  AssociationOverride createAssociationOverride();

  /**
   * Returns a new object of class '<em>Attribute Override</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Override</em>'.
   * @generated
   */
  AttributeOverride createAttributeOverride();

  /**
   * Returns a new object of class '<em>Attributes</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Attributes</em>'.
   * @generated
   */
  Attributes createAttributes();

  /**
   * Returns a new object of class '<em>Basic</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Basic</em>'.
   * @generated
   */
  Basic createBasic();

  /**
   * Returns a new object of class '<em>Basic Collection</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Collection</em>'.
   * @generated
   */
  BasicCollection createBasicCollection();

  /**
   * Returns a new object of class '<em>Basic Map</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Map</em>'.
   * @generated
   */
  BasicMap createBasicMap();

  /**
   * Returns a new object of class '<em>Batch Fetch</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Batch Fetch</em>'.
   * @generated
   */
	BatchFetch createBatchFetch();

		/**
   * Returns a new object of class '<em>Cache</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cache</em>'.
   * @generated
   */
  Cache createCache();

  /**
   * Returns a new object of class '<em>Cache Interceptor</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cache Interceptor</em>'.
   * @generated
   */
  CacheInterceptor createCacheInterceptor();

  /**
   * Returns a new object of class '<em>Cascade Type</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cascade Type</em>'.
   * @generated
   */
  CascadeType createCascadeType();

  /**
   * Returns a new object of class '<em>Change Tracking</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Change Tracking</em>'.
   * @generated
   */
  ChangeTracking createChangeTracking();

  /**
   * Returns a new object of class '<em>Class Extractor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Extractor</em>'.
   * @generated
   */
	ClassExtractor createClassExtractor();

		/**
   * Returns a new object of class '<em>Clone Copy Policy</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Clone Copy Policy</em>'.
   * @generated
   */
  CloneCopyPolicy createCloneCopyPolicy();

  /**
   * Returns a new object of class '<em>Collection Table</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Table</em>'.
   * @generated
   */
  CollectionTable createCollectionTable();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Column Result</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Column Result</em>'.
   * @generated
   */
  ColumnResult createColumnResult();

  /**
   * Returns a new object of class '<em>Conversion Value</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Conversion Value</em>'.
   * @generated
   */
  ConversionValue createConversionValue();

  /**
   * Returns a new object of class '<em>Converter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Converter</em>'.
   * @generated
   */
  Converter createConverter();

  /**
   * Returns a new object of class '<em>Copy Policy</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Copy Policy</em>'.
   * @generated
   */
  CopyPolicy createCopyPolicy();

  /**
   * Returns a new object of class '<em>Customizer</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Customizer</em>'.
   * @generated
   */
  Customizer createCustomizer();

  /**
   * Returns a new object of class '<em>Discriminator Class</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminator Class</em>'.
   * @generated
   */
  DiscriminatorClass createDiscriminatorClass();

  /**
   * Returns a new object of class '<em>Discriminator Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminator Column</em>'.
   * @generated
   */
  DiscriminatorColumn createDiscriminatorColumn();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Eclipselink Collection Table</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>Eclipselink Collection Table</em>'.
   * @generated
   */
  EclipselinkCollectionTable createEclipselinkCollectionTable();

  /**
   * Returns a new object of class '<em>Element Collection</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Element Collection</em>'.
   * @generated
   */
  ElementCollection createElementCollection();

  /**
   * Returns a new object of class '<em>Embeddable</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Embeddable</em>'.
   * @generated
   */
  Embeddable createEmbeddable();

  /**
   * Returns a new object of class '<em>Embedded</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Embedded</em>'.
   * @generated
   */
  Embedded createEmbedded();

  /**
   * Returns a new object of class '<em>Embedded Id</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Embedded Id</em>'.
   * @generated
   */
  EmbeddedId createEmbeddedId();

  /**
   * Returns a new object of class '<em>Empty Type</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Type</em>'.
   * @generated
   */
  EmptyType createEmptyType();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Entity Listener</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Listener</em>'.
   * @generated
   */
  EntityListener createEntityListener();

  /**
   * Returns a new object of class '<em>Entity Listeners</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Listeners</em>'.
   * @generated
   */
  EntityListeners createEntityListeners();

  /**
   * Returns a new object of class '<em>Entity Mappings Type</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Mappings Type</em>'.
   * @generated
   */
  EntityMappingsType createEntityMappingsType();

  /**
   * Returns a new object of class '<em>Entity Result</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Result</em>'.
   * @generated
   */
  EntityResult createEntityResult();

  /**
   * Returns a new object of class '<em>Fetch Attribute</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Fetch Attribute</em>'.
   * @generated
   */
	FetchAttribute createFetchAttribute();

		/**
   * Returns a new object of class '<em>Fetch Group</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Fetch Group</em>'.
   * @generated
   */
	FetchGroup createFetchGroup();

		/**
   * Returns a new object of class '<em>Field Result</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Field Result</em>'.
   * @generated
   */
  FieldResult createFieldResult();

  /**
   * Returns a new object of class '<em>Generated Value</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Generated Value</em>'.
   * @generated
   */
  GeneratedValue createGeneratedValue();

  /**
   * Returns a new object of class '<em>Hash Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Hash Partitioning</em>'.
   * @generated
   */
	HashPartitioning createHashPartitioning();

		/**
   * Returns a new object of class '<em>Id</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Id</em>'.
   * @generated
   */
  Id createId();

  /**
   * Returns a new object of class '<em>Id Class</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Id Class</em>'.
   * @generated
   */
  IdClass createIdClass();

  /**
   * Returns a new object of class '<em>Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Index</em>'.
   * @generated
   */
	Index createIndex();

		/**
   * Returns a new object of class '<em>Inheritance</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance</em>'.
   * @generated
   */
  Inheritance createInheritance();

  /**
   * Returns a new object of class '<em>Instantiation Copy Policy</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Instantiation Copy Policy</em>'.
   * @generated
   */
  InstantiationCopyPolicy createInstantiationCopyPolicy();

  /**
   * Returns a new object of class '<em>Join Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Join Column</em>'.
   * @generated
   */
  JoinColumn createJoinColumn();

  /**
   * Returns a new object of class '<em>Join Table</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Join Table</em>'.
   * @generated
   */
  JoinTable createJoinTable();

  /**
   * Returns a new object of class '<em>Lob</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Lob</em>'.
   * @generated
   */
  Lob createLob();

  /**
   * Returns a new object of class '<em>Many To Many</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Many To Many</em>'.
   * @generated
   */
  ManyToMany createManyToMany();

  /**
   * Returns a new object of class '<em>Many To One</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Many To One</em>'.
   * @generated
   */
  ManyToOne createManyToOne();

  /**
   * Returns a new object of class '<em>Map Key</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Map Key</em>'.
   * @generated
   */
  MapKey createMapKey();

  /**
   * Returns a new object of class '<em>Map Key Class</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Map Key Class</em>'.
   * @generated
   */
  MapKeyClass createMapKeyClass();

  /**
   * Returns a new object of class '<em>Map Key Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Map Key Column</em>'.
   * @generated
   */
  MapKeyColumn createMapKeyColumn();

  /**
   * Returns a new object of class '<em>Map Key Join Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Map Key Join Column</em>'.
   * @generated
   */
  MapKeyJoinColumn createMapKeyJoinColumn();

  /**
   * Returns a new object of class '<em>Mapped Superclass</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Mapped Superclass</em>'.
   * @generated
   */
  MappedSuperclass createMappedSuperclass();

  /**
   * Returns a new object of class '<em>Multitenant</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Multitenant</em>'.
   * @generated
   */
	Multitenant createMultitenant();

		/**
   * Returns a new object of class '<em>Named Native Query</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Named Native Query</em>'.
   * @generated
   */
  NamedNativeQuery createNamedNativeQuery();

  /**
   * Returns a new object of class '<em>Named Plsql Stored Function Query</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Plsql Stored Function Query</em>'.
   * @generated
   */
	NamedPlsqlStoredFunctionQuery createNamedPlsqlStoredFunctionQuery();

		/**
   * Returns a new object of class '<em>Named Plsql Stored Procedure Query</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Plsql Stored Procedure Query</em>'.
   * @generated
   */
	NamedPlsqlStoredProcedureQuery createNamedPlsqlStoredProcedureQuery();

		/**
   * Returns a new object of class '<em>Named Query</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Named Query</em>'.
   * @generated
   */
  NamedQuery createNamedQuery();

  /**
   * Returns a new object of class '<em>Named Stored Function Query</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Stored Function Query</em>'.
   * @generated
   */
	NamedStoredFunctionQuery createNamedStoredFunctionQuery();

		/**
   * Returns a new object of class '<em>Named Stored Procedure Query</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>Named Stored Procedure Query</em>'.
   * @generated
   */
  NamedStoredProcedureQuery createNamedStoredProcedureQuery();

  /**
   * Returns a new object of class '<em>Object Type Converter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Object Type Converter</em>'.
   * @generated
   */
  ObjectTypeConverter createObjectTypeConverter();

  /**
   * Returns a new object of class '<em>One To Many</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>One To Many</em>'.
   * @generated
   */
  OneToMany createOneToMany();

  /**
   * Returns a new object of class '<em>One To One</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>One To One</em>'.
   * @generated
   */
  OneToOne createOneToOne();

  /**
   * Returns a new object of class '<em>Optimistic Locking</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Optimistic Locking</em>'.
   * @generated
   */
  OptimisticLocking createOptimisticLocking();

  /**
   * Returns a new object of class '<em>Order Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Order Column</em>'.
   * @generated
   */
  OrderColumn createOrderColumn();

  /**
   * Returns a new object of class '<em>Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Partitioning</em>'.
   * @generated
   */
	Partitioning createPartitioning();

		/**
   * Returns a new object of class '<em>Persistence Unit Defaults</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence Unit Defaults</em>'.
   * @generated
   */
  PersistenceUnitDefaults createPersistenceUnitDefaults();

  /**
   * Returns a new object of class '<em>Persistence Unit Metadata</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence Unit Metadata</em>'.
   * @generated
   */
  PersistenceUnitMetadata createPersistenceUnitMetadata();

  /**
   * Returns a new object of class '<em>Pinned Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Pinned Partitioning</em>'.
   * @generated
   */
	PinnedPartitioning createPinnedPartitioning();

		/**
   * Returns a new object of class '<em>Plsql Parameter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Plsql Parameter</em>'.
   * @generated
   */
	PlsqlParameter createPlsqlParameter();

		/**
   * Returns a new object of class '<em>Plsql Record</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Plsql Record</em>'.
   * @generated
   */
	PlsqlRecord createPlsqlRecord();

		/**
   * Returns a new object of class '<em>Plsql Table</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Plsql Table</em>'.
   * @generated
   */
	PlsqlTable createPlsqlTable();

		/**
   * Returns a new object of class '<em>Post Load</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Post Load</em>'.
   * @generated
   */
  PostLoad createPostLoad();

  /**
   * Returns a new object of class '<em>Post Persist</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Post Persist</em>'.
   * @generated
   */
  PostPersist createPostPersist();

  /**
   * Returns a new object of class '<em>Post Remove</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Post Remove</em>'.
   * @generated
   */
  PostRemove createPostRemove();

  /**
   * Returns a new object of class '<em>Post Update</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Post Update</em>'.
   * @generated
   */
  PostUpdate createPostUpdate();

  /**
   * Returns a new object of class '<em>Pre Persist</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Persist</em>'.
   * @generated
   */
  PrePersist createPrePersist();

  /**
   * Returns a new object of class '<em>Pre Remove</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Remove</em>'.
   * @generated
   */
  PreRemove createPreRemove();

  /**
   * Returns a new object of class '<em>Pre Update</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Update</em>'.
   * @generated
   */
  PreUpdate createPreUpdate();

  /**
   * Returns a new object of class '<em>Primary Key</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key</em>'.
   * @generated
   */
  PrimaryKey createPrimaryKey();

  /**
   * Returns a new object of class '<em>Primary Key Join Column</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key Join Column</em>'.
   * @generated
   */
  PrimaryKeyJoinColumn createPrimaryKeyJoinColumn();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Query Hint</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Query Hint</em>'.
   * @generated
   */
  QueryHint createQueryHint();

  /**
   * Returns a new object of class '<em>Query Redirectors</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Query Redirectors</em>'.
   * @generated
   */
  QueryRedirectors createQueryRedirectors();

  /**
   * Returns a new object of class '<em>Range Partition</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Partition</em>'.
   * @generated
   */
	RangePartition createRangePartition();

		/**
   * Returns a new object of class '<em>Range Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Partitioning</em>'.
   * @generated
   */
	RangePartitioning createRangePartitioning();

		/**
   * Returns a new object of class '<em>Read Transformer</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Read Transformer</em>'.
   * @generated
   */
  ReadTransformer createReadTransformer();

  /**
   * Returns a new object of class '<em>Replication Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Replication Partitioning</em>'.
   * @generated
   */
	ReplicationPartitioning createReplicationPartitioning();

		/**
   * Returns a new object of class '<em>Return Insert</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Insert</em>'.
   * @generated
   */
	ReturnInsert createReturnInsert();

		/**
   * Returns a new object of class '<em>Round Robin Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Round Robin Partitioning</em>'.
   * @generated
   */
	RoundRobinPartitioning createRoundRobinPartitioning();

		/**
   * Returns a new object of class '<em>Secondary Table</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Secondary Table</em>'.
   * @generated
   */
  SecondaryTable createSecondaryTable();

  /**
   * Returns a new object of class '<em>Sequence Generator</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Generator</em>'.
   * @generated
   */
  SequenceGenerator createSequenceGenerator();

  /**
   * Returns a new object of class '<em>Sql Result Set Mapping</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Sql Result Set Mapping</em>'.
   * @generated
   */
  SqlResultSetMapping createSqlResultSetMapping();

  /**
   * Returns a new object of class '<em>Stored Procedure Parameter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Stored Procedure Parameter</em>'.
   * @generated
   */
  StoredProcedureParameter createStoredProcedureParameter();

  /**
   * Returns a new object of class '<em>Struct</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct</em>'.
   * @generated
   */
	Struct createStruct();

		/**
   * Returns a new object of class '<em>Struct Converter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Converter</em>'.
   * @generated
   */
  StructConverter createStructConverter();

  /**
   * Returns a new object of class '<em>Structure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure</em>'.
   * @generated
   */
	Structure createStructure();

		/**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Table Generator</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Table Generator</em>'.
   * @generated
   */
  TableGenerator createTableGenerator();

  /**
   * Returns a new object of class '<em>Tenant Discriminator</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tenant Discriminator</em>'.
   * @generated
   */
	TenantDiscriminator createTenantDiscriminator();

		/**
   * Returns a new object of class '<em>Time Of Day</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Time Of Day</em>'.
   * @generated
   */
  TimeOfDay createTimeOfDay();

  /**
   * Returns a new object of class '<em>Transformation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation</em>'.
   * @generated
   */
  Transformation createTransformation();

  /**
   * Returns a new object of class '<em>Transient</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Transient</em>'.
   * @generated
   */
  Transient createTransient();

  /**
   * Returns a new object of class '<em>Type Converter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Type Converter</em>'.
   * @generated
   */
  TypeConverter createTypeConverter();

  /**
   * Returns a new object of class '<em>Union Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Union Partitioning</em>'.
   * @generated
   */
	UnionPartitioning createUnionPartitioning();

		/**
   * Returns a new object of class '<em>Unique Constraint</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Constraint</em>'.
   * @generated
   */
  UniqueConstraint createUniqueConstraint();

  /**
   * Returns a new object of class '<em>Value Partition</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Partition</em>'.
   * @generated
   */
	ValuePartition createValuePartition();

		/**
   * Returns a new object of class '<em>Value Partitioning</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Partitioning</em>'.
   * @generated
   */
	ValuePartitioning createValuePartitioning();

		/**
   * Returns a new object of class '<em>Variable One To One</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Variable One To One</em>'.
   * @generated
   */
  VariableOneToOne createVariableOneToOne();

  /**
   * Returns a new object of class '<em>Version</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Version</em>'.
   * @generated
   */
  Version createVersion();

  /**
   * Returns a new object of class '<em>Write Transformer</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Write Transformer</em>'.
   * @generated
   */
  WriteTransformer createWriteTransformer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OrmPackage getOrmPackage();

} // OrmFactory
