/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReturnInsert;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Insert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ReturnInsertImpl#isReturnOnly <em>Return Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnInsertImpl extends BaseOrmAnnotationImpl implements ReturnInsert {
	/**
   * The default value of the '{@link #isReturnOnly() <em>Return Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isReturnOnly()
   * @generated
   * @ordered
   */
	protected static final boolean RETURN_ONLY_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isReturnOnly() <em>Return Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isReturnOnly()
   * @generated
   * @ordered
   */
	protected boolean returnOnly = RETURN_ONLY_EDEFAULT;

	/**
   * This is true if the Return Only attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean returnOnlyESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ReturnInsertImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getReturnInsert();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isReturnOnly() {
    return returnOnly;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReturnOnly(boolean newReturnOnly) {
    boolean oldReturnOnly = returnOnly;
    returnOnly = newReturnOnly;
    boolean oldReturnOnlyESet = returnOnlyESet;
    returnOnlyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RETURN_INSERT__RETURN_ONLY, oldReturnOnly, returnOnly, !oldReturnOnlyESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetReturnOnly() {
    boolean oldReturnOnly = returnOnly;
    boolean oldReturnOnlyESet = returnOnlyESet;
    returnOnly = RETURN_ONLY_EDEFAULT;
    returnOnlyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.RETURN_INSERT__RETURN_ONLY, oldReturnOnly, RETURN_ONLY_EDEFAULT, oldReturnOnlyESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetReturnOnly() {
    return returnOnlyESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.RETURN_INSERT__RETURN_ONLY:
        return isReturnOnly();
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
      case OrmPackage.RETURN_INSERT__RETURN_ONLY:
        setReturnOnly((Boolean)newValue);
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
      case OrmPackage.RETURN_INSERT__RETURN_ONLY:
        unsetReturnOnly();
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
      case OrmPackage.RETURN_INSERT__RETURN_ONLY:
        return isSetReturnOnly();
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
    result.append(" (returnOnly: "); //$NON-NLS-1$
    if (returnOnlyESet) result.append(returnOnly); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} //ReturnInsertImpl
