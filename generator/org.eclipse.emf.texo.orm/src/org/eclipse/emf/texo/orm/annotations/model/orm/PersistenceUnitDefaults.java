/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceUnitDefaults.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Persistence Unit Defaults</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				These defaults are applied to the persistence unit as a whole
 * 				unless they are overridden by local annotation or XML
 * 				element settings.
 * 
 * 				schema - Used as the schema for all tables, secondary tables, join
 * 				tables, collection tables, sequence generators, and table
 * 				generators that apply to the persistence unit
 * 				catalog - Used as the catalog for all tables, secondary tables, join
 * 				tables, collection tables, sequence generators, and table
 * 				generators that apply to the persistence unit
 * 				delimited-identifiers - Used to treat database identifiers as
 * 				delimited identifiers.
 * 				access - Used as the access type for all managed classes in
 * 				the persistence unit
 * 				cascade-persist - Adds cascade-persist to the set of cascade options
 * 				in all entity relationships of the persistence unit
 * 				entity-listeners - List of default entity listeners to be invoked
 * 				on each entity in the persistence unit.
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDelimitedIdentifiers <em>Delimited Identifiers</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCascadePersist <em>Cascade Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getTenantDiscriminator <em>Tenant Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults()
 * @model extendedMetaData="name='persistence-unit-defaults' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface PersistenceUnitDefaults extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' attribute.
   * @see #setSchema(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_Schema()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace'"
   * @generated
   */
  String getSchema();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getSchema <em>Schema</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_Catalog()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
   * @generated
   */
  String getCatalog();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCatalog <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Catalog</em>' attribute.
   * @see #getCatalog()
   * @generated
   */
  void setCatalog(String value);

  /**
   * Returns the value of the '<em><b>Delimited Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimited Identifiers</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimited Identifiers</em>' containment reference.
   * @see #setDelimitedIdentifiers(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_DelimitedIdentifiers()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='delimited-identifiers' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getDelimitedIdentifiers();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDelimitedIdentifiers <em>Delimited Identifiers</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimited Identifiers</em>' containment reference.
   * @see #getDelimitedIdentifiers()
   * @generated
   */
  void setDelimitedIdentifiers(EmptyType value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='access' namespace='##targetNamespace'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
	AccessMethods getAccessMethods();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
	void setAccessMethods(AccessMethods value);

		/**
   * Returns the value of the '<em><b>Cascade Persist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade Persist</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade Persist</em>' containment reference.
   * @see #setCascadePersist(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_CascadePersist()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cascade-persist' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getCascadePersist();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCascadePersist <em>Cascade Persist</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade Persist</em>' containment reference.
   * @see #getCascadePersist()
   * @generated
   */
  void setCascadePersist(EmptyType value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_TenantDiscriminator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='tenant-discriminator' namespace='##targetNamespace'"
   * @generated
   */
	EList<TenantDiscriminator> getTenantDiscriminator();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPersistenceUnitDefaults_EntityListeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='entity-listeners' namespace='##targetNamespace'"
   * @generated
   */
  EntityListeners getEntityListeners();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Listeners</em>' containment reference.
   * @see #getEntityListeners()
   * @generated
   */
  void setEntityListeners(EntityListeners value);

} // PersistenceUnitDefaults
