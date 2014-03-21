/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccessMethodsImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Access Methods</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AccessMethodsImpl#getGetMethod <em>Get Method</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AccessMethodsImpl#getSetMethod <em>Set Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessMethodsImpl extends BaseOrmAnnotationImpl implements AccessMethods {
  /**
   * The default value of the '{@link #getGetMethod() <em>Get Method</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getGetMethod()
   * @generated
   * @ordered
   */
  protected static final String GET_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetMethod() <em>Get Method</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getGetMethod()
   * @generated
   * @ordered
   */
  protected String getMethod = GET_METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getSetMethod() <em>Set Method</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSetMethod()
   * @generated
   * @ordered
   */
  protected static final String SET_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSetMethod() <em>Set Method</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSetMethod()
   * @generated
   * @ordered
   */
  protected String setMethod = SET_METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AccessMethodsImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getAccessMethods();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getGetMethod() {
    return getMethod;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setGetMethod(String newGetMethod) {
    String oldGetMethod = getMethod;
    getMethod = newGetMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ACCESS_METHODS__GET_METHOD, oldGetMethod, getMethod));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getSetMethod() {
    return setMethod;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSetMethod(String newSetMethod) {
    String oldSetMethod = setMethod;
    setMethod = newSetMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ACCESS_METHODS__SET_METHOD, oldSetMethod, setMethod));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ACCESS_METHODS__GET_METHOD:
        return getGetMethod();
      case OrmPackage.ACCESS_METHODS__SET_METHOD:
        return getSetMethod();
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
      case OrmPackage.ACCESS_METHODS__GET_METHOD:
        setGetMethod((String)newValue);
        return;
      case OrmPackage.ACCESS_METHODS__SET_METHOD:
        setSetMethod((String)newValue);
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
      case OrmPackage.ACCESS_METHODS__GET_METHOD:
        setGetMethod(GET_METHOD_EDEFAULT);
        return;
      case OrmPackage.ACCESS_METHODS__SET_METHOD:
        setSetMethod(SET_METHOD_EDEFAULT);
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
      case OrmPackage.ACCESS_METHODS__GET_METHOD:
        return GET_METHOD_EDEFAULT == null ? getMethod != null : !GET_METHOD_EDEFAULT.equals(getMethod);
      case OrmPackage.ACCESS_METHODS__SET_METHOD:
        return SET_METHOD_EDEFAULT == null ? setMethod != null : !SET_METHOD_EDEFAULT.equals(setMethod);
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
    result.append(" (getMethod: "); //$NON-NLS-1$
    result.append(getMethod);
    result.append(", setMethod: "); //$NON-NLS-1$
    result.append(setMethod);
    result.append(')');
    return result.toString();
  }

} // AccessMethodsImpl
