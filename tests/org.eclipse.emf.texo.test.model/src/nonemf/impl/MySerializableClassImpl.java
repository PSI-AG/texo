/**
 * <copyright>
 * </copyright>
 *
 * $Id: MySerializableClassImpl.java,v 1.4 2011/08/26 07:29:14 mtaal Exp $
 */
package nonemf.impl;

import nonemf.MySerializableClass;
import nonemf.NonemfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>My Serializable Class</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nonemf.impl.MySerializableClassImpl#getSomethingInteresting <em>Something Interesting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MySerializableClassImpl extends EObjectImpl implements MySerializableClass {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * The default value of the '{@link #getSomethingInteresting() <em>Something Interesting</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSomethingInteresting()
   * @generated
   * @ordered
   */
  protected static final String SOMETHING_INTERESTING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSomethingInteresting() <em>Something Interesting</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSomethingInteresting()
   * @generated
   * @ordered
   */
  protected String somethingInteresting = SOMETHING_INTERESTING_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MySerializableClassImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return NonemfPackage.Literals.MY_SERIALIZABLE_CLASS;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getSomethingInteresting() {
    return somethingInteresting;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSomethingInteresting(String newSomethingInteresting) {
    String oldSomethingInteresting = somethingInteresting;
    somethingInteresting = newSomethingInteresting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NonemfPackage.MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING, oldSomethingInteresting, somethingInteresting));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case NonemfPackage.MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING:
        return getSomethingInteresting();
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
      case NonemfPackage.MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING:
        setSomethingInteresting((String)newValue);
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
      case NonemfPackage.MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING:
        setSomethingInteresting(SOMETHING_INTERESTING_EDEFAULT);
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
      case NonemfPackage.MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING:
        return SOMETHING_INTERESTING_EDEFAULT == null ? somethingInteresting != null : !SOMETHING_INTERESTING_EDEFAULT.equals(somethingInteresting);
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
    result.append(" (somethingInteresting: ");
    result.append(somethingInteresting);
    result.append(')');
    return result.toString();
  }

} // MySerializableClassImpl
