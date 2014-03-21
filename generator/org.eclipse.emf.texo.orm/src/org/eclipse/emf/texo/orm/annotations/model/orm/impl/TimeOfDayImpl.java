/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimeOfDayImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Time Of Day</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TimeOfDayImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TimeOfDayImpl#getMillisecond <em>Millisecond</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TimeOfDayImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TimeOfDayImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeOfDayImpl extends BaseOrmAnnotationImpl implements TimeOfDay {
  /**
   * The default value of the '{@link #getHour() <em>Hour</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected static final BigInteger HOUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected BigInteger hour = HOUR_EDEFAULT;

  /**
   * The default value of the '{@link #getMillisecond() <em>Millisecond</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMillisecond()
   * @generated
   * @ordered
   */
  protected static final BigInteger MILLISECOND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMillisecond() <em>Millisecond</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMillisecond()
   * @generated
   * @ordered
   */
  protected BigInteger millisecond = MILLISECOND_EDEFAULT;

  /**
   * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected static final BigInteger MINUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected BigInteger minute = MINUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected static final BigInteger SECOND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected BigInteger second = SECOND_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TimeOfDayImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getTimeOfDay();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getHour() {
    return hour;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHour(BigInteger newHour) {
    BigInteger oldHour = hour;
    hour = newHour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TIME_OF_DAY__HOUR, oldHour, hour));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getMillisecond() {
    return millisecond;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMillisecond(BigInteger newMillisecond) {
    BigInteger oldMillisecond = millisecond;
    millisecond = newMillisecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TIME_OF_DAY__MILLISECOND, oldMillisecond, millisecond));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getMinute() {
    return minute;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMinute(BigInteger newMinute) {
    BigInteger oldMinute = minute;
    minute = newMinute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TIME_OF_DAY__MINUTE, oldMinute, minute));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getSecond() {
    return second;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(BigInteger newSecond) {
    BigInteger oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TIME_OF_DAY__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.TIME_OF_DAY__HOUR:
        return getHour();
      case OrmPackage.TIME_OF_DAY__MILLISECOND:
        return getMillisecond();
      case OrmPackage.TIME_OF_DAY__MINUTE:
        return getMinute();
      case OrmPackage.TIME_OF_DAY__SECOND:
        return getSecond();
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
      case OrmPackage.TIME_OF_DAY__HOUR:
        setHour((BigInteger)newValue);
        return;
      case OrmPackage.TIME_OF_DAY__MILLISECOND:
        setMillisecond((BigInteger)newValue);
        return;
      case OrmPackage.TIME_OF_DAY__MINUTE:
        setMinute((BigInteger)newValue);
        return;
      case OrmPackage.TIME_OF_DAY__SECOND:
        setSecond((BigInteger)newValue);
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
      case OrmPackage.TIME_OF_DAY__HOUR:
        setHour(HOUR_EDEFAULT);
        return;
      case OrmPackage.TIME_OF_DAY__MILLISECOND:
        setMillisecond(MILLISECOND_EDEFAULT);
        return;
      case OrmPackage.TIME_OF_DAY__MINUTE:
        setMinute(MINUTE_EDEFAULT);
        return;
      case OrmPackage.TIME_OF_DAY__SECOND:
        setSecond(SECOND_EDEFAULT);
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
      case OrmPackage.TIME_OF_DAY__HOUR:
        return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
      case OrmPackage.TIME_OF_DAY__MILLISECOND:
        return MILLISECOND_EDEFAULT == null ? millisecond != null : !MILLISECOND_EDEFAULT.equals(millisecond);
      case OrmPackage.TIME_OF_DAY__MINUTE:
        return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
      case OrmPackage.TIME_OF_DAY__SECOND:
        return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
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
    result.append(" (hour: "); //$NON-NLS-1$
    result.append(hour);
    result.append(", millisecond: "); //$NON-NLS-1$
    result.append(millisecond);
    result.append(", minute: "); //$NON-NLS-1$
    result.append(minute);
    result.append(", second: "); //$NON-NLS-1$
    result.append(second);
    result.append(')');
    return result.toString();
  }

} // TimeOfDayImpl
