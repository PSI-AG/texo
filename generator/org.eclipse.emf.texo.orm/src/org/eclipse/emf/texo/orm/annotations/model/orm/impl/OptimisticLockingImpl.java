/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptimisticLockingImpl.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking;
import org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Optimistic Locking</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OptimisticLockingImpl#getSelectedColumn <em>Selected
 * Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OptimisticLockingImpl#isCascade <em>Cascade</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OptimisticLockingImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OptimisticLockingImpl extends BaseOrmAnnotationImpl implements OptimisticLocking {
  /**
   * The cached value of the '{@link #getSelectedColumn() <em>Selected Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSelectedColumn()
   * @generated
   * @ordered
   */
  protected EList<Column> selectedColumn;

  /**
   * The default value of the '{@link #isCascade() <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCascade()
   * @generated
   * @ordered
   */
  protected static final boolean CASCADE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCascade() <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCascade()
   * @generated
   * @ordered
   */
  protected boolean cascade = CASCADE_EDEFAULT;

  /**
   * This is true if the Cascade attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean cascadeESet;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final OptimisticLockingType TYPE_EDEFAULT = OptimisticLockingType.ALLCOLUMNS;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected OptimisticLockingType type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected OptimisticLockingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getOptimisticLocking();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getSelectedColumn() {
    if (selectedColumn == null) {
      selectedColumn = new EObjectContainmentEList<Column>(Column.class, this, OrmPackage.OPTIMISTIC_LOCKING__SELECTED_COLUMN);
    }
    return selectedColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCascade() {
    return cascade;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCascade(boolean newCascade) {
    boolean oldCascade = cascade;
    cascade = newCascade;
    boolean oldCascadeESet = cascadeESet;
    cascadeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.OPTIMISTIC_LOCKING__CASCADE, oldCascade, cascade, !oldCascadeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCascade() {
    boolean oldCascade = cascade;
    boolean oldCascadeESet = cascadeESet;
    cascade = CASCADE_EDEFAULT;
    cascadeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.OPTIMISTIC_LOCKING__CASCADE, oldCascade, CASCADE_EDEFAULT, oldCascadeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCascade() {
    return cascadeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLockingType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(OptimisticLockingType newType) {
    OptimisticLockingType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.OPTIMISTIC_LOCKING__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    OptimisticLockingType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.OPTIMISTIC_LOCKING__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType() {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.OPTIMISTIC_LOCKING__SELECTED_COLUMN:
        return ((InternalEList<?>)getSelectedColumn()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.OPTIMISTIC_LOCKING__SELECTED_COLUMN:
        return getSelectedColumn();
      case OrmPackage.OPTIMISTIC_LOCKING__CASCADE:
        return isCascade();
      case OrmPackage.OPTIMISTIC_LOCKING__TYPE:
        return getType();
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
      case OrmPackage.OPTIMISTIC_LOCKING__SELECTED_COLUMN:
        getSelectedColumn().clear();
        getSelectedColumn().addAll((Collection<? extends Column>)newValue);
        return;
      case OrmPackage.OPTIMISTIC_LOCKING__CASCADE:
        setCascade((Boolean)newValue);
        return;
      case OrmPackage.OPTIMISTIC_LOCKING__TYPE:
        setType((OptimisticLockingType)newValue);
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
      case OrmPackage.OPTIMISTIC_LOCKING__SELECTED_COLUMN:
        getSelectedColumn().clear();
        return;
      case OrmPackage.OPTIMISTIC_LOCKING__CASCADE:
        unsetCascade();
        return;
      case OrmPackage.OPTIMISTIC_LOCKING__TYPE:
        unsetType();
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
      case OrmPackage.OPTIMISTIC_LOCKING__SELECTED_COLUMN:
        return selectedColumn != null && !selectedColumn.isEmpty();
      case OrmPackage.OPTIMISTIC_LOCKING__CASCADE:
        return isSetCascade();
      case OrmPackage.OPTIMISTIC_LOCKING__TYPE:
        return isSetType();
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
    result.append(" (cascade: "); //$NON-NLS-1$
    if (cascadeESet) result.append(cascade); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", type: "); //$NON-NLS-1$
    if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // OptimisticLockingImpl
