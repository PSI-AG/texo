/**
 * <copyright>
 * </copyright>
 *
 * $Id: CloneCopyPolicyImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Clone Copy Policy</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CloneCopyPolicyImpl#getMethod <em>Method</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CloneCopyPolicyImpl#getWorkingCopyMethod <em>Working
 * Copy Method</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CloneCopyPolicyImpl extends BaseOrmAnnotationImpl implements CloneCopyPolicy {
  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getWorkingCopyMethod() <em>Working Copy Method</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getWorkingCopyMethod()
   * @generated
   * @ordered
   */
  protected static final String WORKING_COPY_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWorkingCopyMethod() <em>Working Copy Method</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getWorkingCopyMethod()
   * @generated
   * @ordered
   */
  protected String workingCopyMethod = WORKING_COPY_METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CloneCopyPolicyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getCloneCopyPolicy();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getMethod() {
    return method;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod) {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CLONE_COPY_POLICY__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getWorkingCopyMethod() {
    return workingCopyMethod;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWorkingCopyMethod(String newWorkingCopyMethod) {
    String oldWorkingCopyMethod = workingCopyMethod;
    workingCopyMethod = newWorkingCopyMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CLONE_COPY_POLICY__WORKING_COPY_METHOD, oldWorkingCopyMethod, workingCopyMethod));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.CLONE_COPY_POLICY__METHOD:
        return getMethod();
      case OrmPackage.CLONE_COPY_POLICY__WORKING_COPY_METHOD:
        return getWorkingCopyMethod();
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
      case OrmPackage.CLONE_COPY_POLICY__METHOD:
        setMethod((String)newValue);
        return;
      case OrmPackage.CLONE_COPY_POLICY__WORKING_COPY_METHOD:
        setWorkingCopyMethod((String)newValue);
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
      case OrmPackage.CLONE_COPY_POLICY__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case OrmPackage.CLONE_COPY_POLICY__WORKING_COPY_METHOD:
        setWorkingCopyMethod(WORKING_COPY_METHOD_EDEFAULT);
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
      case OrmPackage.CLONE_COPY_POLICY__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case OrmPackage.CLONE_COPY_POLICY__WORKING_COPY_METHOD:
        return WORKING_COPY_METHOD_EDEFAULT == null ? workingCopyMethod != null : !WORKING_COPY_METHOD_EDEFAULT.equals(workingCopyMethod);
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
    result.append(" (method: "); //$NON-NLS-1$
    result.append(method);
    result.append(", workingCopyMethod: "); //$NON-NLS-1$
    result.append(workingCopyMethod);
    result.append(')');
    return result.toString();
  }

} // CloneCopyPolicyImpl
