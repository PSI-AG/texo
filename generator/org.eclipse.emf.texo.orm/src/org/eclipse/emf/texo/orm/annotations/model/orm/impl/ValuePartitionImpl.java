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
import org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartition;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ValuePartitionImpl#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ValuePartitionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuePartitionImpl extends BaseOrmAnnotationImpl implements ValuePartition {
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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final String VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected String value = VALUE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ValuePartitionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getValuePartition();
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VALUE_PARTITION__CONNECTION_POOL, oldConnectionPool, connectionPool));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VALUE_PARTITION__VALUE, oldValue, value));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.VALUE_PARTITION__CONNECTION_POOL:
        return getConnectionPool();
      case OrmPackage.VALUE_PARTITION__VALUE:
        return getValue();
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
      case OrmPackage.VALUE_PARTITION__CONNECTION_POOL:
        setConnectionPool((String)newValue);
        return;
      case OrmPackage.VALUE_PARTITION__VALUE:
        setValue((String)newValue);
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
      case OrmPackage.VALUE_PARTITION__CONNECTION_POOL:
        setConnectionPool(CONNECTION_POOL_EDEFAULT);
        return;
      case OrmPackage.VALUE_PARTITION__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case OrmPackage.VALUE_PARTITION__CONNECTION_POOL:
        return CONNECTION_POOL_EDEFAULT == null ? connectionPool != null : !CONNECTION_POOL_EDEFAULT.equals(connectionPool);
      case OrmPackage.VALUE_PARTITION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(", value: "); //$NON-NLS-1$
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //ValuePartitionImpl
