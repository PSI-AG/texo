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
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitionImpl#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitionImpl#getEndValue <em>End Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitionImpl#getStartValue <em>Start Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangePartitionImpl extends BaseOrmAnnotationImpl implements RangePartition {
	/**
   * The default value of the '{@link #getConnectionPool() <em>Connection Pool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConnectionPool()
   * @generated
   * @ordered
   */
	protected static final String CONNECTION_POOL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getConnectionPool() <em>Connection Pool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConnectionPool()
   * @generated
   * @ordered
   */
	protected String connectionPool = CONNECTION_POOL_EDEFAULT;

	/**
   * The default value of the '{@link #getEndValue() <em>End Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEndValue()
   * @generated
   * @ordered
   */
	protected static final String END_VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getEndValue() <em>End Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEndValue()
   * @generated
   * @ordered
   */
	protected String endValue = END_VALUE_EDEFAULT;

	/**
   * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStartValue()
   * @generated
   * @ordered
   */
	protected static final String START_VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStartValue()
   * @generated
   * @ordered
   */
	protected String startValue = START_VALUE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RangePartitionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getRangePartition();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getConnectionPool() {
    return connectionPool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConnectionPool(String newConnectionPool) {
    String oldConnectionPool = connectionPool;
    connectionPool = newConnectionPool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITION__CONNECTION_POOL, oldConnectionPool, connectionPool));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getEndValue() {
    return endValue;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEndValue(String newEndValue) {
    String oldEndValue = endValue;
    endValue = newEndValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITION__END_VALUE, oldEndValue, endValue));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getStartValue() {
    return startValue;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStartValue(String newStartValue) {
    String oldStartValue = startValue;
    startValue = newStartValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITION__START_VALUE, oldStartValue, startValue));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.RANGE_PARTITION__CONNECTION_POOL:
        return getConnectionPool();
      case OrmPackage.RANGE_PARTITION__END_VALUE:
        return getEndValue();
      case OrmPackage.RANGE_PARTITION__START_VALUE:
        return getStartValue();
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
      case OrmPackage.RANGE_PARTITION__CONNECTION_POOL:
        setConnectionPool((String)newValue);
        return;
      case OrmPackage.RANGE_PARTITION__END_VALUE:
        setEndValue((String)newValue);
        return;
      case OrmPackage.RANGE_PARTITION__START_VALUE:
        setStartValue((String)newValue);
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
      case OrmPackage.RANGE_PARTITION__CONNECTION_POOL:
        setConnectionPool(CONNECTION_POOL_EDEFAULT);
        return;
      case OrmPackage.RANGE_PARTITION__END_VALUE:
        setEndValue(END_VALUE_EDEFAULT);
        return;
      case OrmPackage.RANGE_PARTITION__START_VALUE:
        setStartValue(START_VALUE_EDEFAULT);
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
      case OrmPackage.RANGE_PARTITION__CONNECTION_POOL:
        return CONNECTION_POOL_EDEFAULT == null ? connectionPool != null : !CONNECTION_POOL_EDEFAULT.equals(connectionPool);
      case OrmPackage.RANGE_PARTITION__END_VALUE:
        return END_VALUE_EDEFAULT == null ? endValue != null : !END_VALUE_EDEFAULT.equals(endValue);
      case OrmPackage.RANGE_PARTITION__START_VALUE:
        return START_VALUE_EDEFAULT == null ? startValue != null : !START_VALUE_EDEFAULT.equals(startValue);
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
    result.append(" (connectionPool: "); //$NON-NLS-1$
    result.append(connectionPool);
    result.append(", endValue: "); //$NON-NLS-1$
    result.append(endValue);
    result.append(", startValue: "); //$NON-NLS-1$
    result.append(startValue);
    result.append(')');
    return result.toString();
  }

} //RangePartitionImpl
