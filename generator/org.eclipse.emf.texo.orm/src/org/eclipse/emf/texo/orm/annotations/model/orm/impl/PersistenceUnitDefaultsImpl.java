/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceUnitDefaultsImpl.java,v 1.6 2011/10/25 13:25:23 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults;
import org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Persistence Unit Defaults</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getDelimitedIdentifiers <em>Delimited Identifiers</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getCascadePersist <em>Cascade Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getTenantDiscriminator <em>Tenant Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl#getEntityListeners <em>Entity Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceUnitDefaultsImpl extends BaseOrmAnnotationImpl implements PersistenceUnitDefaults {
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
   * The cached value of the '{@link #getDelimitedIdentifiers() <em>Delimited Identifiers</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDelimitedIdentifiers()
   * @generated
   * @ordered
   */
  protected EmptyType delimitedIdentifiers;

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
   * The cached value of the '{@link #getCascadePersist() <em>Cascade Persist</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCascadePersist()
   * @generated
   * @ordered
   */
  protected EmptyType cascadePersist;

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
   * The cached value of the '{@link #getEntityListeners() <em>Entity Listeners</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getEntityListeners()
   * @generated
   * @ordered
   */
  protected EntityListeners entityListeners;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PersistenceUnitDefaultsImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getPersistenceUnitDefaults();
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__SCHEMA, oldSchema, schema));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CATALOG, oldCatalog, catalog));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType getDelimitedIdentifiers() {
    return delimitedIdentifiers;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelimitedIdentifiers(EmptyType newDelimitedIdentifiers, NotificationChain msgs) {
    EmptyType oldDelimitedIdentifiers = delimitedIdentifiers;
    delimitedIdentifiers = newDelimitedIdentifiers;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS, oldDelimitedIdentifiers, newDelimitedIdentifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDelimitedIdentifiers(EmptyType newDelimitedIdentifiers) {
    if (newDelimitedIdentifiers != delimitedIdentifiers) {
      NotificationChain msgs = null;
      if (delimitedIdentifiers != null)
        msgs = ((InternalEObject)delimitedIdentifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS, null, msgs);
      if (newDelimitedIdentifiers != null)
        msgs = ((InternalEObject)newDelimitedIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS, null, msgs);
      msgs = basicSetDelimitedIdentifiers(newDelimitedIdentifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS, newDelimitedIdentifiers, newDelimitedIdentifiers));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType getCascadePersist() {
    return cascadePersist;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCascadePersist(EmptyType newCascadePersist, NotificationChain msgs) {
    EmptyType oldCascadePersist = cascadePersist;
    cascadePersist = newCascadePersist;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST, oldCascadePersist, newCascadePersist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCascadePersist(EmptyType newCascadePersist) {
    if (newCascadePersist != cascadePersist) {
      NotificationChain msgs = null;
      if (cascadePersist != null)
        msgs = ((InternalEObject)cascadePersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST, null, msgs);
      if (newCascadePersist != null)
        msgs = ((InternalEObject)newCascadePersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST, null, msgs);
      msgs = basicSetCascadePersist(newCascadePersist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST, newCascadePersist, newCascadePersist));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TenantDiscriminator> getTenantDiscriminator() {
    if (tenantDiscriminator == null) {
      tenantDiscriminator = new EObjectContainmentEList<TenantDiscriminator>(TenantDiscriminator.class, this, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR);
    }
    return tenantDiscriminator;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityListeners getEntityListeners() {
    return entityListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityListeners(EntityListeners newEntityListeners, NotificationChain msgs) {
    EntityListeners oldEntityListeners = entityListeners;
    entityListeners = newEntityListeners;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS, oldEntityListeners, newEntityListeners);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEntityListeners(EntityListeners newEntityListeners) {
    if (newEntityListeners != entityListeners) {
      NotificationChain msgs = null;
      if (entityListeners != null)
        msgs = ((InternalEObject)entityListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS, null, msgs);
      if (newEntityListeners != null)
        msgs = ((InternalEObject)newEntityListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS, null, msgs);
      msgs = basicSetEntityListeners(newEntityListeners, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS, newEntityListeners, newEntityListeners));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS:
        return basicSetDelimitedIdentifiers(null, msgs);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST:
        return basicSetCascadePersist(null, msgs);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR:
        return ((InternalEList<?>)getTenantDiscriminator()).basicRemove(otherEnd, msgs);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS:
        return basicSetEntityListeners(null, msgs);
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
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION:
        return getDescription();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__SCHEMA:
        return getSchema();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CATALOG:
        return getCatalog();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS:
        return getDelimitedIdentifiers();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS:
        return getAccess();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST:
        return getCascadePersist();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR:
        return getTenantDiscriminator();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS:
        return getEntityListeners();
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
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__SCHEMA:
        setSchema((String)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CATALOG:
        setCatalog((String)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS:
        setDelimitedIdentifiers((EmptyType)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST:
        setCascadePersist((EmptyType)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR:
        getTenantDiscriminator().clear();
        getTenantDiscriminator().addAll((Collection<? extends TenantDiscriminator>)newValue);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS:
        setEntityListeners((EntityListeners)newValue);
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
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CATALOG:
        setCatalog(CATALOG_EDEFAULT);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS:
        setDelimitedIdentifiers((EmptyType)null);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST:
        setCascadePersist((EmptyType)null);
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR:
        getTenantDiscriminator().clear();
        return;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS:
        setEntityListeners((EntityListeners)null);
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
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__SCHEMA:
        return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CATALOG:
        return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS:
        return delimitedIdentifiers != null;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS:
        return isSetAccess();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST:
        return cascadePersist != null;
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR:
        return tenantDiscriminator != null && !tenantDiscriminator.isEmpty();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS:
        return entityListeners != null;
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
    result.append(", schema: "); //$NON-NLS-1$
    result.append(schema);
    result.append(", catalog: "); //$NON-NLS-1$
    result.append(catalog);
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // PersistenceUnitDefaultsImpl
