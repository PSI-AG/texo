/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKeyImpl.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheKeyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Primary Key</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl#getCacheKeyType <em>Cache Key Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyImpl extends BaseOrmAnnotationImpl implements PrimaryKey {
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<Column> column;

  /**
   * The default value of the '{@link #getCacheKeyType() <em>Cache Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCacheKeyType()
   * @generated
   * @ordered
   */
	protected static final CacheKeyType CACHE_KEY_TYPE_EDEFAULT = CacheKeyType.IDVALUE;

		/**
   * The cached value of the '{@link #getCacheKeyType() <em>Cache Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCacheKeyType()
   * @generated
   * @ordered
   */
	protected CacheKeyType cacheKeyType = CACHE_KEY_TYPE_EDEFAULT;

		/**
   * This is true if the Cache Key Type attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean cacheKeyTypeESet;

		/**
   * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getValidation()
   * @generated
   * @ordered
   */
  protected static final IdValidation VALIDATION_EDEFAULT = IdValidation.NULL;

  /**
   * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getValidation()
   * @generated
   * @ordered
   */
  protected IdValidation validation = VALIDATION_EDEFAULT;

  /**
   * This is true if the Validation attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean validationESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryKeyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getPrimaryKey();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumn() {
    if (column == null) {
      column = new EObjectContainmentEList<Column>(Column.class, this, OrmPackage.PRIMARY_KEY__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CacheKeyType getCacheKeyType() {
    return cacheKeyType;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCacheKeyType(CacheKeyType newCacheKeyType) {
    CacheKeyType oldCacheKeyType = cacheKeyType;
    cacheKeyType = newCacheKeyType == null ? CACHE_KEY_TYPE_EDEFAULT : newCacheKeyType;
    boolean oldCacheKeyTypeESet = cacheKeyTypeESet;
    cacheKeyTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PRIMARY_KEY__CACHE_KEY_TYPE, oldCacheKeyType, cacheKeyType, !oldCacheKeyTypeESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetCacheKeyType() {
    CacheKeyType oldCacheKeyType = cacheKeyType;
    boolean oldCacheKeyTypeESet = cacheKeyTypeESet;
    cacheKeyType = CACHE_KEY_TYPE_EDEFAULT;
    cacheKeyTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.PRIMARY_KEY__CACHE_KEY_TYPE, oldCacheKeyType, CACHE_KEY_TYPE_EDEFAULT, oldCacheKeyTypeESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetCacheKeyType() {
    return cacheKeyTypeESet;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdValidation getValidation() {
    return validation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValidation(IdValidation newValidation) {
    IdValidation oldValidation = validation;
    validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
    boolean oldValidationESet = validationESet;
    validationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PRIMARY_KEY__VALIDATION, oldValidation, validation, !oldValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetValidation() {
    IdValidation oldValidation = validation;
    boolean oldValidationESet = validationESet;
    validation = VALIDATION_EDEFAULT;
    validationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.PRIMARY_KEY__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetValidation() {
    return validationESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.PRIMARY_KEY__COLUMN:
        return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.PRIMARY_KEY__COLUMN:
        return getColumn();
      case OrmPackage.PRIMARY_KEY__CACHE_KEY_TYPE:
        return getCacheKeyType();
      case OrmPackage.PRIMARY_KEY__VALIDATION:
        return getValidation();
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
      case OrmPackage.PRIMARY_KEY__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends Column>)newValue);
        return;
      case OrmPackage.PRIMARY_KEY__CACHE_KEY_TYPE:
        setCacheKeyType((CacheKeyType)newValue);
        return;
      case OrmPackage.PRIMARY_KEY__VALIDATION:
        setValidation((IdValidation)newValue);
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
      case OrmPackage.PRIMARY_KEY__COLUMN:
        getColumn().clear();
        return;
      case OrmPackage.PRIMARY_KEY__CACHE_KEY_TYPE:
        unsetCacheKeyType();
        return;
      case OrmPackage.PRIMARY_KEY__VALIDATION:
        unsetValidation();
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
      case OrmPackage.PRIMARY_KEY__COLUMN:
        return column != null && !column.isEmpty();
      case OrmPackage.PRIMARY_KEY__CACHE_KEY_TYPE:
        return isSetCacheKeyType();
      case OrmPackage.PRIMARY_KEY__VALIDATION:
        return isSetValidation();
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
    result.append(" (cacheKeyType: "); //$NON-NLS-1$
    if (cacheKeyTypeESet) result.append(cacheKeyType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", validation: "); //$NON-NLS-1$
    if (validationESet) result.append(validation); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // PrimaryKeyImpl
