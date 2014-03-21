/**
 * <copyright>
 * </copyright>
 *
 * $Id: Entity.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				Defines the settings and mappings for an entity. Is allowed to be
 * 				sparsely populated and used in conjunction with the annotations.
 * 				Alternatively, the metadata-complete attribute can be used to
 * 				indicate that no annotations on the entity class (and its fields
 * 				or properties) are to be processed. If this is the case then
 * 				the defaulting rules for the entity and its subelements will
 * 				be recursively applied.
 * 
 * 				@Target(TYPE) @Retention(RUNTIME)
 * 				public @interface Entity {
 * 				String name() default "";
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getMultitenant <em>Multitenant</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAdditionalCriteria <em>Additional Criteria</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCustomizer <em>Customizer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getChangeTracking <em>Change Tracking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSecondaryTable <em>Secondary Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCascadeOnDelete <em>Cascade On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getClassExtractor <em>Class Extractor</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getOptimisticLocking <em>Optimistic Locking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCache <em>Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCacheInterceptor <em>Cache Interceptor</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getFetchGroup <em>Fetch Group</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCopyPolicy <em>Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCloneCopyPolicy <em>Clone Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPartitioned <em>Partitioned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedStoredFunctionQuery <em>Named Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedPlsqlStoredProcedureQuery <em>Named Plsql Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedPlsqlStoredFunctionQuery <em>Named Plsql Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPlsqlRecord <em>Plsql Record</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPlsqlTable <em>Plsql Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getQueryRedirectors <em>Query Redirectors</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getEntityListeners <em>Entity Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrePersist <em>Pre Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostPersist <em>Post Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreRemove <em>Pre Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostRemove <em>Post Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreUpdate <em>Pre Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostUpdate <em>Post Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostLoad <em>Post Load</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExistenceChecking <em>Existence Checking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity()
 * @model extendedMetaData="name='entity' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Entity extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
	AccessMethods getAccessMethods();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
	void setAccessMethods(AccessMethods value);

		/**
   * Returns the value of the '<em><b>Multitenant</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multitenant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Multitenant</em>' containment reference.
   * @see #setMultitenant(Multitenant)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Multitenant()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='multitenant' namespace='##targetNamespace'"
   * @generated
   */
	Multitenant getMultitenant();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getMultitenant <em>Multitenant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multitenant</em>' containment reference.
   * @see #getMultitenant()
   * @generated
   */
	void setMultitenant(Multitenant value);

		/**
   * Returns the value of the '<em><b>Additional Criteria</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Additional Criteria</em>' containment reference.
   * @see #setAdditionalCriteria(AdditionalCriteria)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_AdditionalCriteria()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='additional-criteria' namespace='##targetNamespace'"
   * @generated
   */
	AdditionalCriteria getAdditionalCriteria();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAdditionalCriteria <em>Additional Criteria</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additional Criteria</em>' containment reference.
   * @see #getAdditionalCriteria()
   * @generated
   */
	void setAdditionalCriteria(AdditionalCriteria value);

		/**
   * Returns the value of the '<em><b>Customizer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customizer</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customizer</em>' containment reference.
   * @see #setCustomizer(Customizer)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Customizer()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='customizer' namespace='##targetNamespace'"
   * @generated
   */
  Customizer getCustomizer();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCustomizer <em>Customizer</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Customizer</em>' containment reference.
   * @see #getCustomizer()
   * @generated
   */
  void setCustomizer(Customizer value);

  /**
   * Returns the value of the '<em><b>Change Tracking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change Tracking</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Tracking</em>' containment reference.
   * @see #setChangeTracking(ChangeTracking)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ChangeTracking()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='change-tracking' namespace='##targetNamespace'"
   * @generated
   */
  ChangeTracking getChangeTracking();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getChangeTracking <em>Change Tracking</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Tracking</em>' containment reference.
   * @see #getChangeTracking()
   * @generated
   */
  void setChangeTracking(ChangeTracking value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(Table)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Table()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

  /**
   * Returns the value of the '<em><b>Secondary Table</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondary Table</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondary Table</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_SecondaryTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='secondary-table' namespace='##targetNamespace'"
   * @generated
   */
  EList<SecondaryTable> getSecondaryTable();

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(Struct)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
   * @generated
   */
	Struct getStruct();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
	void setStruct(Struct value);

		/**
   * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Join Column</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PrimaryKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_CascadeOnDelete()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='element' name='cascade-on-delete' namespace='##targetNamespace'"
   * @generated
   */
	boolean isCascadeOnDelete();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @generated
   */
	void unsetCascadeOnDelete();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Index</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Index}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Index()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
   * @generated
   */
	EList<Index> getIndex();

		/**
   * Returns the value of the '<em><b>Id Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Class</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Class</em>' containment reference.
   * @see #setIdClass(IdClass)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_IdClass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='id-class' namespace='##targetNamespace'"
   * @generated
   */
  IdClass getIdClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getIdClass <em>Id Class</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Class</em>' containment reference.
   * @see #getIdClass()
   * @generated
   */
  void setIdClass(IdClass value);

  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' containment reference.
   * @see #setPrimaryKey(PrimaryKey)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PrimaryKey()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary-key' namespace='##targetNamespace'"
   * @generated
   */
  PrimaryKey getPrimaryKey();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKey <em>Primary Key</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' containment reference.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(PrimaryKey value);

  /**
   * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance</em>' containment reference.
   * @see #setInheritance(Inheritance)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Inheritance()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='inheritance' namespace='##targetNamespace'"
   * @generated
   */
  Inheritance getInheritance();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInheritance <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Inheritance</em>' containment reference.
   * @see #getInheritance()
   * @generated
   */
  void setInheritance(Inheritance value);

  /**
   * Returns the value of the '<em><b>Discriminator Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator Value</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator Value</em>' attribute.
   * @see #setDiscriminatorValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_DiscriminatorValue()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorValue"
   *        extendedMetaData="kind='element' name='discriminator-value' namespace='##targetNamespace'"
   * @generated
   */
  String getDiscriminatorValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorValue <em>Discriminator Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminator Value</em>' attribute.
   * @see #getDiscriminatorValue()
   * @generated
   */
  void setDiscriminatorValue(String value);

  /**
   * Returns the value of the '<em><b>Discriminator Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator Column</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator Column</em>' containment reference.
   * @see #setDiscriminatorColumn(DiscriminatorColumn)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_DiscriminatorColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='discriminator-column' namespace='##targetNamespace'"
   * @generated
   */
  DiscriminatorColumn getDiscriminatorColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorColumn <em>Discriminator Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminator Column</em>' containment reference.
   * @see #getDiscriminatorColumn()
   * @generated
   */
  void setDiscriminatorColumn(DiscriminatorColumn value);

  /**
   * Returns the value of the '<em><b>Class Extractor</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class Extractor</em>' containment reference.
   * @see #setClassExtractor(ClassExtractor)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ClassExtractor()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='class-extractor' namespace='##targetNamespace'"
   * @generated
   */
	ClassExtractor getClassExtractor();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getClassExtractor <em>Class Extractor</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Extractor</em>' containment reference.
   * @see #getClassExtractor()
   * @generated
   */
	void setClassExtractor(ClassExtractor value);

		/**
   * Returns the value of the '<em><b>Optimistic Locking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optimistic Locking</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optimistic Locking</em>' containment reference.
   * @see #setOptimisticLocking(OptimisticLocking)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_OptimisticLocking()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='optimistic-locking' namespace='##targetNamespace'"
   * @generated
   */
  OptimisticLocking getOptimisticLocking();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getOptimisticLocking <em>Optimistic Locking</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Optimistic Locking</em>' containment reference.
   * @see #getOptimisticLocking()
   * @generated
   */
  void setOptimisticLocking(OptimisticLocking value);

  /**
   * Returns the value of the '<em><b>Cache</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache</em>' containment reference.
   * @see #setCache(Cache)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Cache()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cache' namespace='##targetNamespace'"
   * @generated
   */
  Cache getCache();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCache <em>Cache</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache</em>' containment reference.
   * @see #getCache()
   * @generated
   */
  void setCache(Cache value);

  /**
   * Returns the value of the '<em><b>Cache Interceptor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache Interceptor</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Interceptor</em>' containment reference.
   * @see #setCacheInterceptor(CacheInterceptor)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_CacheInterceptor()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cache-interceptor' namespace='##targetNamespace'"
   * @generated
   */
  CacheInterceptor getCacheInterceptor();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCacheInterceptor <em>Cache Interceptor</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Interceptor</em>' containment reference.
   * @see #getCacheInterceptor()
   * @generated
   */
  void setCacheInterceptor(CacheInterceptor value);

  /**
   * Returns the value of the '<em><b>Fetch Group</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch Group</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_FetchGroup()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='fetch-group' namespace='##targetNamespace'"
   * @generated
   */
	EList<FetchGroup> getFetchGroup();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Converter()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_TypeConverter()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ObjectTypeConverter()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_StructConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  EList<StructConverter> getStructConverter();

  /**
   * Returns the value of the '<em><b>Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copy Policy</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copy Policy</em>' containment reference.
   * @see #setCopyPolicy(CopyPolicy)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_CopyPolicy()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='copy-policy' namespace='##targetNamespace'"
   * @generated
   */
  CopyPolicy getCopyPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCopyPolicy <em>Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Copy Policy</em>' containment reference.
   * @see #getCopyPolicy()
   * @generated
   */
  void setCopyPolicy(CopyPolicy value);

  /**
   * Returns the value of the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiation Copy Policy</em>' containment reference isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiation Copy Policy</em>' containment reference.
   * @see #setInstantiationCopyPolicy(InstantiationCopyPolicy)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_InstantiationCopyPolicy()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instantiation-copy-policy' namespace='##targetNamespace'"
   * @generated
   */
  InstantiationCopyPolicy getInstantiationCopyPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Instantiation Copy Policy</em>' containment reference.
   * @see #getInstantiationCopyPolicy()
   * @generated
   */
  void setInstantiationCopyPolicy(InstantiationCopyPolicy value);

  /**
   * Returns the value of the '<em><b>Clone Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clone Copy Policy</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clone Copy Policy</em>' containment reference.
   * @see #setCloneCopyPolicy(CloneCopyPolicy)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_CloneCopyPolicy()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='clone-copy-policy' namespace='##targetNamespace'"
   * @generated
   */
  CloneCopyPolicy getCloneCopyPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCloneCopyPolicy <em>Clone Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Clone Copy Policy</em>' containment reference.
   * @see #getCloneCopyPolicy()
   * @generated
   */
  void setCloneCopyPolicy(CloneCopyPolicy value);

  /**
   * Returns the value of the '<em><b>Sequence Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Generator</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Generator</em>' containment reference.
   * @see #setSequenceGenerator(SequenceGenerator)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_SequenceGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sequence-generator' namespace='##targetNamespace'"
   * @generated
   */
  SequenceGenerator getSequenceGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSequenceGenerator <em>Sequence Generator</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Generator</em>' containment reference.
   * @see #getSequenceGenerator()
   * @generated
   */
  void setSequenceGenerator(SequenceGenerator value);

  /**
   * Returns the value of the '<em><b>Table Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Generator</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Generator</em>' containment reference.
   * @see #setTableGenerator(TableGenerator)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_TableGenerator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='table-generator' namespace='##targetNamespace'"
   * @generated
   */
  TableGenerator getTableGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTableGenerator <em>Table Generator</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Generator</em>' containment reference.
   * @see #getTableGenerator()
   * @generated
   */
  void setTableGenerator(TableGenerator value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Partitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='partitioning' namespace='##targetNamespace'"
   * @generated
   */
	Partitioning getPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPartitioning <em>Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ReplicationPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='replication-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ReplicationPartitioning getReplicationPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getReplicationPartitioning <em>Replication Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_RoundRobinPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='round-robin-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RoundRobinPartitioning getRoundRobinPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PinnedPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pinned-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	PinnedPartitioning getPinnedPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPinnedPartitioning <em>Pinned Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_RangePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='range-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RangePartitioning getRangePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getRangePartitioning <em>Range Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ValuePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ValuePartitioning getValuePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getValuePartitioning <em>Value Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_HashPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hash-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	HashPartitioning getHashPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getHashPartitioning <em>Hash Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_UnionPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='union-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	UnionPartitioning getUnionPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getUnionPartitioning <em>Union Partitioning</em>}' containment reference.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Partitioned()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='partitioned' namespace='##targetNamespace'"
   * @generated
   */
	String getPartitioned();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPartitioned <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partitioned</em>' attribute.
   * @see #getPartitioned()
   * @generated
   */
	void setPartitioned(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_NamedQuery()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_NamedNativeQuery()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_NamedStoredProcedureQuery()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_NamedStoredFunctionQuery()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_NamedPlsqlStoredProcedureQuery()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_NamedPlsqlStoredFunctionQuery()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PlsqlRecord()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PlsqlTable()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_SqlResultSetMapping()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sql-result-set-mapping' namespace='##targetNamespace'"
   * @generated
   */
  EList<SqlResultSetMapping> getSqlResultSetMapping();

  /**
   * Returns the value of the '<em><b>Query Redirectors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Redirectors</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Redirectors</em>' containment reference.
   * @see #setQueryRedirectors(QueryRedirectors)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_QueryRedirectors()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='query-redirectors' namespace='##targetNamespace'"
   * @generated
   */
  QueryRedirectors getQueryRedirectors();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getQueryRedirectors <em>Query Redirectors</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Redirectors</em>' containment reference.
   * @see #getQueryRedirectors()
   * @generated
   */
  void setQueryRedirectors(QueryRedirectors value);

  /**
   * Returns the value of the '<em><b>Exclude Default Listeners</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Default Listeners</em>' containment reference isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Default Listeners</em>' containment reference.
   * @see #setExcludeDefaultListeners(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ExcludeDefaultListeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='exclude-default-listeners' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getExcludeDefaultListeners();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Default Listeners</em>' containment reference.
   * @see #getExcludeDefaultListeners()
   * @generated
   */
  void setExcludeDefaultListeners(EmptyType value);

  /**
   * Returns the value of the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
   * <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Exclude Superclass Listeners</em>' containment reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Superclass Listeners</em>' containment reference.
   * @see #setExcludeSuperclassListeners(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ExcludeSuperclassListeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='exclude-superclass-listeners' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getExcludeSuperclassListeners();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Superclass Listeners</em>' containment reference.
   * @see #getExcludeSuperclassListeners()
   * @generated
   */
  void setExcludeSuperclassListeners(EmptyType value);

  /**
   * Returns the value of the '<em><b>Entity Listeners</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Listeners</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Listeners</em>' containment reference.
   * @see #setEntityListeners(EntityListeners)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_EntityListeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='entity-listeners' namespace='##targetNamespace'"
   * @generated
   */
  EntityListeners getEntityListeners();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getEntityListeners <em>Entity Listeners</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Listeners</em>' containment reference.
   * @see #getEntityListeners()
   * @generated
   */
  void setEntityListeners(EntityListeners value);

  /**
   * Returns the value of the '<em><b>Pre Persist</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Persist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Persist</em>' containment reference.
   * @see #setPrePersist(PrePersist)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PrePersist()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pre-persist' namespace='##targetNamespace'"
   * @generated
   */
	PrePersist getPrePersist();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrePersist <em>Pre Persist</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Persist</em>' containment reference.
   * @see #getPrePersist()
   * @generated
   */
	void setPrePersist(PrePersist value);

		/**
   * Returns the value of the '<em><b>Post Persist</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Persist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Post Persist</em>' containment reference.
   * @see #setPostPersist(PostPersist)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PostPersist()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='post-persist' namespace='##targetNamespace'"
   * @generated
   */
	PostPersist getPostPersist();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostPersist <em>Post Persist</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Persist</em>' containment reference.
   * @see #getPostPersist()
   * @generated
   */
	void setPostPersist(PostPersist value);

		/**
   * Returns the value of the '<em><b>Pre Remove</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Remove</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Remove</em>' containment reference.
   * @see #setPreRemove(PreRemove)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PreRemove()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pre-remove' namespace='##targetNamespace'"
   * @generated
   */
	PreRemove getPreRemove();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreRemove <em>Pre Remove</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Remove</em>' containment reference.
   * @see #getPreRemove()
   * @generated
   */
	void setPreRemove(PreRemove value);

		/**
   * Returns the value of the '<em><b>Post Remove</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Remove</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Post Remove</em>' containment reference.
   * @see #setPostRemove(PostRemove)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PostRemove()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='post-remove' namespace='##targetNamespace'"
   * @generated
   */
	PostRemove getPostRemove();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostRemove <em>Post Remove</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Remove</em>' containment reference.
   * @see #getPostRemove()
   * @generated
   */
	void setPostRemove(PostRemove value);

		/**
   * Returns the value of the '<em><b>Pre Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Update</em>' containment reference.
   * @see #setPreUpdate(PreUpdate)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PreUpdate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pre-update' namespace='##targetNamespace'"
   * @generated
   */
	PreUpdate getPreUpdate();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreUpdate <em>Pre Update</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Update</em>' containment reference.
   * @see #getPreUpdate()
   * @generated
   */
	void setPreUpdate(PreUpdate value);

		/**
   * Returns the value of the '<em><b>Post Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Post Update</em>' containment reference.
   * @see #setPostUpdate(PostUpdate)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PostUpdate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='post-update' namespace='##targetNamespace'"
   * @generated
   */
	PostUpdate getPostUpdate();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostUpdate <em>Post Update</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Update</em>' containment reference.
   * @see #getPostUpdate()
   * @generated
   */
	void setPostUpdate(PostUpdate value);

		/**
   * Returns the value of the '<em><b>Post Load</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Load</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Post Load</em>' containment reference.
   * @see #setPostLoad(PostLoad)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_PostLoad()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='post-load' namespace='##targetNamespace'"
   * @generated
   */
	PostLoad getPostLoad();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostLoad <em>Post Load</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Load</em>' containment reference.
   * @see #getPostLoad()
   * @generated
   */
	void setPostLoad(PostLoad value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_AttributeOverride()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_AssociationOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='association-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AssociationOverride> getAssociationOverride();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(Attributes)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Attributes()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
   * @generated
   */
  Attributes getAttributes();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attributes value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Cacheable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cacheable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cacheable</em>' attribute.
   * @see #isSetCacheable()
   * @see #unsetCacheable()
   * @see #setCacheable(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Cacheable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='cacheable'"
   * @generated
   */
  boolean isCacheable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCacheable <em>Cacheable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cacheable</em>' attribute.
   * @see #isSetCacheable()
   * @see #unsetCacheable()
   * @see #isCacheable()
   * @generated
   */
  void setCacheable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCacheable <em>Cacheable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCacheable()
   * @see #isCacheable()
   * @see #setCacheable(boolean)
   * @generated
   */
  void unsetCacheable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCacheable <em>Cacheable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Cacheable</em>' attribute is set.
   * @see #unsetCacheable()
   * @see #isCacheable()
   * @see #setCacheable(boolean)
   * @generated
   */
  boolean isSetCacheable();

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='class'"
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Exclude Default Mappings</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Default Mappings</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Default Mappings</em>' attribute.
   * @see #isSetExcludeDefaultMappings()
   * @see #unsetExcludeDefaultMappings()
   * @see #setExcludeDefaultMappings(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ExcludeDefaultMappings()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='exclude-default-mappings'"
   * @generated
   */
  boolean isExcludeDefaultMappings();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Default Mappings</em>' attribute.
   * @see #isSetExcludeDefaultMappings()
   * @see #unsetExcludeDefaultMappings()
   * @see #isExcludeDefaultMappings()
   * @generated
   */
  void setExcludeDefaultMappings(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExcludeDefaultMappings()
   * @see #isExcludeDefaultMappings()
   * @see #setExcludeDefaultMappings(boolean)
   * @generated
   */
  void unsetExcludeDefaultMappings();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Exclude Default Mappings</em>' attribute is set.
   * @see #unsetExcludeDefaultMappings()
   * @see #isExcludeDefaultMappings()
   * @see #setExcludeDefaultMappings(boolean)
   * @generated
   */
  boolean isSetExcludeDefaultMappings();

  /**
   * Returns the value of the '<em><b>Existence Checking</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Existence Checking</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Existence Checking</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType
   * @see #isSetExistenceChecking()
   * @see #unsetExistenceChecking()
   * @see #setExistenceChecking(ExistenceType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ExistenceChecking()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='existence-checking'"
   * @generated
   */
  ExistenceType getExistenceChecking();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExistenceChecking <em>Existence Checking</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Existence Checking</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType
   * @see #isSetExistenceChecking()
   * @see #unsetExistenceChecking()
   * @see #getExistenceChecking()
   * @generated
   */
  void setExistenceChecking(ExistenceType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExistenceChecking <em>Existence Checking</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExistenceChecking()
   * @see #getExistenceChecking()
   * @see #setExistenceChecking(ExistenceType)
   * @generated
   */
  void unsetExistenceChecking();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExistenceChecking <em>Existence Checking</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Existence Checking</em>' attribute is set.
   * @see #unsetExistenceChecking()
   * @see #getExistenceChecking()
   * @see #setExistenceChecking(ExistenceType)
   * @generated
   */
  boolean isSetExistenceChecking();

  /**
   * Returns the value of the '<em><b>Metadata Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata Complete</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata Complete</em>' attribute.
   * @see #isSetMetadataComplete()
   * @see #unsetMetadataComplete()
   * @see #setMetadataComplete(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_MetadataComplete()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='metadata-complete'"
   * @generated
   */
  boolean isMetadataComplete();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata Complete</em>' attribute.
   * @see #isSetMetadataComplete()
   * @see #unsetMetadataComplete()
   * @see #isMetadataComplete()
   * @generated
   */
  void setMetadataComplete(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMetadataComplete()
   * @see #isMetadataComplete()
   * @see #setMetadataComplete(boolean)
   * @generated
   */
  void unsetMetadataComplete();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Metadata Complete</em>' attribute is set.
   * @see #unsetMetadataComplete()
   * @see #isMetadataComplete()
   * @see #setMetadataComplete(boolean)
   * @generated
   */
  boolean isSetMetadataComplete();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Class</em>' attribute.
   * @see #setParentClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ParentClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='parent-class'"
   * @generated
   */
	String getParentClass();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getParentClass <em>Parent Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Class</em>' attribute.
   * @see #getParentClass()
   * @generated
   */
	void setParentClass(String value);

		/**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see #isSetReadOnly()
   * @see #unsetReadOnly()
   * @see #setReadOnly(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntity_ReadOnly()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='read-only'"
   * @generated
   */
  boolean isReadOnly();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see #isSetReadOnly()
   * @see #unsetReadOnly()
   * @see #isReadOnly()
   * @generated
   */
  void setReadOnly(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReadOnly()
   * @see #isReadOnly()
   * @see #setReadOnly(boolean)
   * @generated
   */
  void unsetReadOnly();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isReadOnly <em>Read Only</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Read Only</em>' attribute is set.
   * @see #unsetReadOnly()
   * @see #isReadOnly()
   * @see #setReadOnly(boolean)
   * @generated
   */
  boolean isSetReadOnly();

} // Entity
