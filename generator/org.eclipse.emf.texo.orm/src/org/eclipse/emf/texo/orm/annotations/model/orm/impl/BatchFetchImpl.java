/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch;
import org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch Fetch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BatchFetchImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BatchFetchImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatchFetchImpl extends BaseOrmAnnotationImpl implements BatchFetch {
	/**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
	protected static final BigInteger SIZE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
	protected BigInteger size = SIZE_EDEFAULT;

	/**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected static final BatchFetchType TYPE_EDEFAULT = BatchFetchType.JOIN;

	/**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected BatchFetchType type = TYPE_EDEFAULT;

	/**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean typeESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BatchFetchImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getBatchFetch();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getSize() {
    return size;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSize(BigInteger newSize) {
    BigInteger oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BATCH_FETCH__SIZE, oldSize, size));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BatchFetchType getType() {
    return type;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setType(BatchFetchType newType) {
    BatchFetchType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BATCH_FETCH__TYPE, oldType, type, !oldTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetType() {
    BatchFetchType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BATCH_FETCH__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetType() {
    return typeESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.BATCH_FETCH__SIZE:
        return getSize();
      case OrmPackage.BATCH_FETCH__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.BATCH_FETCH__SIZE:
        setSize((BigInteger)newValue);
        return;
      case OrmPackage.BATCH_FETCH__TYPE:
        setType((BatchFetchType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.BATCH_FETCH__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case OrmPackage.BATCH_FETCH__TYPE:
        unsetType();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.BATCH_FETCH__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case OrmPackage.BATCH_FETCH__TYPE:
        return isSetType();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (size: "); //$NON-NLS-1$
    result.append(size);
    result.append(", type: "); //$NON-NLS-1$
    if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} //BatchFetchImpl
