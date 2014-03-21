/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityMappingsType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity Mappings Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 					The entity-mappings element is the root element of a mapping
 * 					file. It contains the following four types of elements:
 * 
 * 					1. The persistence-unit-metadata element contains metadata
 * 					for the entire persistence unit. It is undefined if this element
 * 					occurs in multiple mapping files within the same persistence unit.
 * 
 * 					2. The package, schema, catalog and access elements apply to all of
 * 					the entity, mapped-superclass and embeddable elements defined in
 * 					the same file in which they occur.
 * 
 * 					3. The sequence-generator, table-generator, named-query,
 * 					named-native-query and sql-result-set-mapping elements are global
 * 					to the persistence unit. It is undefined to have more than one
 * 					sequence-generator or table-generator of the same name in the same
 * 					or different mapping files in a persistence unit. It is also
 * 					undefined to have more than one named-query, named-native-query, or
 * 					result-set-mapping of the same name in the same or different
 * 					mapping
 * 					files in a persistence unit.
 * 
 * 					4. The entity, mapped-superclass and embeddable elements each define
 * 					the mapping information for a managed persistent class. The mapping
 * 					information contained in these elements may be complete or it may
 * 					be partial.
 * 
 * 				
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTenantDiscriminator <em>Tenant Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedStoredFunctionQuery <em>Named Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedPlsqlStoredProcedureQuery <em>Named Plsql Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedPlsqlStoredFunctionQuery <em>Named Plsql Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPlsqlRecord <em>Plsql Record</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPlsqlTable <em>Plsql Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getMappedSuperclass <em>Mapped Superclass</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType()
 * @model extendedMetaData="name='entity-mappings_._type' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface EntityMappingsType extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistence Unit Metadata</em>' containment reference isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistence Unit Metadata</em>' containment reference.
   * @see #setPersistenceUnitMetadata(PersistenceUnitMetadata)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_PersistenceUnitMetadata()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='persistence-unit-metadata' namespace='##targetNamespace'"
   * @generated
   */
  PersistenceUnitMetadata getPersistenceUnitMetadata();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Persistence Unit Metadata</em>' containment reference.
   * @see #getPersistenceUnitMetadata()
   * @generated
   */
  void setPersistenceUnitMetadata(PersistenceUnitMetadata value);

  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Package()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' attribute.
   * @see #setSchema(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Schema()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace'"
   * @generated
   */
  String getSchema();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSchema <em>Schema</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' attribute.
   * @see #getSchema()
   * @generated
   */
  void setSchema(String value);

  /**
   * Returns the value of the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catalog</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catalog</em>' attribute.
   * @see #setCatalog(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Catalog()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
   * @generated
   */
  String getCatalog();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getCatalog <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Catalog</em>' attribute.
   * @see #getCatalog()
   * @generated
   */
  void setCatalog(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='access' namespace='##targetNamespace'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
	AccessMethods getAccessMethods();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
	void setAccessMethods(AccessMethods value);

		/**
   * Returns the value of the '<em><b>Tenant Discriminator</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Discriminator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Tenant Discriminator</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_TenantDiscriminator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='tenant-discriminator' namespace='##targetNamespace'"
   * @generated
   */
	EList<TenantDiscriminator> getTenantDiscriminator();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Converter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_TypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_ObjectTypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace'"
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_StructConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  EList<StructConverter> getStructConverter();

  /**
   * Returns the value of the '<em><b>Sequence Generator</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Generator</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Generator</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_SequenceGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sequence-generator' namespace='##targetNamespace'"
   * @generated
   */
  EList<SequenceGenerator> getSequenceGenerator();

  /**
   * Returns the value of the '<em><b>Table Generator</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Generator</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Generator</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_TableGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='table-generator' namespace='##targetNamespace'"
   * @generated
   */
  EList<TableGenerator> getTableGenerator();

  /**
   * Returns the value of the '<em><b>Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Partitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<Partitioning> getPartitioning();

		/**
   * Returns the value of the '<em><b>Replication Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Replication Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_ReplicationPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='replication-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<ReplicationPartitioning> getReplicationPartitioning();

		/**
   * Returns the value of the '<em><b>Round Robin Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Robin Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Round Robin Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_RoundRobinPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='round-robin-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<RoundRobinPartitioning> getRoundRobinPartitioning();

		/**
   * Returns the value of the '<em><b>Pinned Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pinned Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_PinnedPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pinned-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<PinnedPartitioning> getPinnedPartitioning();

		/**
   * Returns the value of the '<em><b>Range Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Range Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_RangePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='range-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<RangePartitioning> getRangePartitioning();

		/**
   * Returns the value of the '<em><b>Value Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_ValuePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<ValuePartitioning> getValuePartitioning();

		/**
   * Returns the value of the '<em><b>Hash Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Hash Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_HashPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hash-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<HashPartitioning> getHashPartitioning();

		/**
   * Returns the value of the '<em><b>Union Partitioning</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Partitioning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Union Partitioning</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_UnionPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='union-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	EList<UnionPartitioning> getUnionPartitioning();

		/**
   * Returns the value of the '<em><b>Named Query</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Query</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Query</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_NamedQuery()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='named-query' namespace='##targetNamespace'"
   * @generated
   */
  EList<NamedQuery> getNamedQuery();

  /**
   * Returns the value of the '<em><b>Named Native Query</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Native Query</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Native Query</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_NamedNativeQuery()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='named-native-query' namespace='##targetNamespace'"
   * @generated
   */
  EList<NamedNativeQuery> getNamedNativeQuery();

  /**
   * Returns the value of the '<em><b>Named Stored Procedure Query</b></em>' containment reference list. The list
   * contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Stored Procedure Query</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Named Stored Procedure Query</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_NamedStoredProcedureQuery()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='named-stored-procedure-query' namespace='##targetNamespace'"
   * @generated
   */
  EList<NamedStoredProcedureQuery> getNamedStoredProcedureQuery();

  /**
   * Returns the value of the '<em><b>Named Stored Function Query</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Stored Function Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Named Stored Function Query</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_NamedStoredFunctionQuery()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='named-stored-function-query' namespace='##targetNamespace'"
   * @generated
   */
	EList<NamedStoredFunctionQuery> getNamedStoredFunctionQuery();

		/**
   * Returns the value of the '<em><b>Named Plsql Stored Procedure Query</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Plsql Stored Procedure Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Named Plsql Stored Procedure Query</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_NamedPlsqlStoredProcedureQuery()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='named-plsql-stored-procedure-query' namespace='##targetNamespace'"
   * @generated
   */
	EList<NamedPlsqlStoredProcedureQuery> getNamedPlsqlStoredProcedureQuery();

		/**
   * Returns the value of the '<em><b>Named Plsql Stored Function Query</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Plsql Stored Function Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Named Plsql Stored Function Query</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_NamedPlsqlStoredFunctionQuery()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='named-plsql-stored-function-query' namespace='##targetNamespace'"
   * @generated
   */
	EList<NamedPlsqlStoredFunctionQuery> getNamedPlsqlStoredFunctionQuery();

		/**
   * Returns the value of the '<em><b>Plsql Record</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plsql Record</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Plsql Record</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_PlsqlRecord()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='plsql-record' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlRecord> getPlsqlRecord();

		/**
   * Returns the value of the '<em><b>Plsql Table</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plsql Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Plsql Table</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_PlsqlTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='plsql-table' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlTable> getPlsqlTable();

		/**
   * Returns the value of the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql Result Set Mapping</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Result Set Mapping</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_SqlResultSetMapping()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sql-result-set-mapping' namespace='##targetNamespace'"
   * @generated
   */
  EList<SqlResultSetMapping> getSqlResultSetMapping();

  /**
   * Returns the value of the '<em><b>Mapped Superclass</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Superclass</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Superclass</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_MappedSuperclass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mapped-superclass' namespace='##targetNamespace'"
   * @generated
   */
  EList<MappedSuperclass> getMappedSuperclass();

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Entity()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
   * @generated
   */
  EList<Entity> getEntity();

  /**
   * Returns the value of the '<em><b>Embeddable</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embeddable</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embeddable</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Embeddable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='embeddable' namespace='##targetNamespace'"
   * @generated
   */
  EList<Embeddable> getEmbeddable();

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute. The default value is <code>"2.0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Version</em>' attribute.
   * @see #isSetVersion()
   * @see #unsetVersion()
   * @see #setVersion(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityMappingsType_Version()
   * @model default="2.0" unsettable="true" dataType="org.eclipse.emf.texo.orm.annotations.model.orm.VersionType"
   *        required="true" extendedMetaData="kind='attribute' name='version'"
   * @generated
   */
  SupportedVersionsType getVersion();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SupportedVersionsType
   * @see #isSetVersion()
   * @see #unsetVersion()
   * @see #getVersion()
   * @generated
   */
	void setVersion(SupportedVersionsType value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetVersion()
   * @see #getVersion()
   * @see #setVersion(SupportedVersionsType)
   * @generated
   */
  void unsetVersion();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getVersion <em>Version</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Version</em>' attribute is set.
   * @see #unsetVersion()
   * @see #getVersion()
   * @see #setVersion(SupportedVersionsType)
   * @generated
   */
  boolean isSetVersion();

} // EntityMappingsType
