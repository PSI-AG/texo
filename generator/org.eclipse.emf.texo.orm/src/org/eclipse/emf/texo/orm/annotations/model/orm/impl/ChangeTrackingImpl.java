/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChangeTrackingImpl.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking;
import org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Change Tracking</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ChangeTrackingImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChangeTrackingImpl extends BaseOrmAnnotationImpl implements ChangeTracking {
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ChangeTrackingType TYPE_EDEFAULT = ChangeTrackingType.ATTRIBUTE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ChangeTrackingType type = TYPE_EDEFAULT;

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
  protected ChangeTrackingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getChangeTracking();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTrackingType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(ChangeTrackingType newType) {
    ChangeTrackingType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CHANGE_TRACKING__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    ChangeTrackingType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CHANGE_TRACKING__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.CHANGE_TRACKING__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.CHANGE_TRACKING__TYPE:
        setType((ChangeTrackingType)newValue);
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
      case OrmPackage.CHANGE_TRACKING__TYPE:
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
      case OrmPackage.CHANGE_TRACKING__TYPE:
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
    result.append(" (type: "); //$NON-NLS-1$
    if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // ChangeTrackingImpl
