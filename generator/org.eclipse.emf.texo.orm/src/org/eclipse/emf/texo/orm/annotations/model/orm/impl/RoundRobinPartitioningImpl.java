/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round Robin Partitioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RoundRobinPartitioningImpl#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RoundRobinPartitioningImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RoundRobinPartitioningImpl#isReplicateWrites <em>Replicate Writes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundRobinPartitioningImpl extends BaseOrmAnnotationImpl implements RoundRobinPartitioning {
	/**
   * The cached value of the '{@link #getConnectionPool() <em>Connection Pool</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConnectionPool()
   * @generated
   * @ordered
   */
	protected EList<String> connectionPool;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The default value of the '{@link #isReplicateWrites() <em>Replicate Writes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isReplicateWrites()
   * @generated
   * @ordered
   */
	protected static final boolean REPLICATE_WRITES_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isReplicateWrites() <em>Replicate Writes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isReplicateWrites()
   * @generated
   * @ordered
   */
	protected boolean replicateWrites = REPLICATE_WRITES_EDEFAULT;

	/**
   * This is true if the Replicate Writes attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean replicateWritesESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RoundRobinPartitioningImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getRoundRobinPartitioning();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getConnectionPool() {
    if (connectionPool == null) {
      connectionPool = new EDataTypeEList<String>(String.class, this, OrmPackage.ROUND_ROBIN_PARTITIONING__CONNECTION_POOL);
    }
    return connectionPool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROUND_ROBIN_PARTITIONING__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isReplicateWrites() {
    return replicateWrites;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReplicateWrites(boolean newReplicateWrites) {
    boolean oldReplicateWrites = replicateWrites;
    replicateWrites = newReplicateWrites;
    boolean oldReplicateWritesESet = replicateWritesESet;
    replicateWritesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROUND_ROBIN_PARTITIONING__REPLICATE_WRITES, oldReplicateWrites, replicateWrites, !oldReplicateWritesESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetReplicateWrites() {
    boolean oldReplicateWrites = replicateWrites;
    boolean oldReplicateWritesESet = replicateWritesESet;
    replicateWrites = REPLICATE_WRITES_EDEFAULT;
    replicateWritesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ROUND_ROBIN_PARTITIONING__REPLICATE_WRITES, oldReplicateWrites, REPLICATE_WRITES_EDEFAULT, oldReplicateWritesESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetReplicateWrites() {
    return replicateWritesESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ROUND_ROBIN_PARTITIONING__CONNECTION_POOL:
        return getConnectionPool();
      case OrmPackage.ROUND_ROBIN_PARTITIONING__NAME:
        return getName();
      case OrmPackage.ROUND_ROBIN_PARTITIONING__REPLICATE_WRITES:
        return isReplicateWrites();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.ROUND_ROBIN_PARTITIONING__CONNECTION_POOL:
        getConnectionPool().clear();
        getConnectionPool().addAll((Collection<? extends String>)newValue);
        return;
      case OrmPackage.ROUND_ROBIN_PARTITIONING__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.ROUND_ROBIN_PARTITIONING__REPLICATE_WRITES:
        setReplicateWrites((Boolean)newValue);
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
      case OrmPackage.ROUND_ROBIN_PARTITIONING__CONNECTION_POOL:
        getConnectionPool().clear();
        return;
      case OrmPackage.ROUND_ROBIN_PARTITIONING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.ROUND_ROBIN_PARTITIONING__REPLICATE_WRITES:
        unsetReplicateWrites();
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
      case OrmPackage.ROUND_ROBIN_PARTITIONING__CONNECTION_POOL:
        return connectionPool != null && !connectionPool.isEmpty();
      case OrmPackage.ROUND_ROBIN_PARTITIONING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.ROUND_ROBIN_PARTITIONING__REPLICATE_WRITES:
        return isSetReplicateWrites();
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
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", replicateWrites: "); //$NON-NLS-1$
    if (replicateWritesESet) result.append(replicateWrites); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} //RoundRobinPartitioningImpl
