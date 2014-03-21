/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash Partitioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.HashPartitioningImpl#getPartitionColumn <em>Partition Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.HashPartitioningImpl#getConnectionPool <em>Connection Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.HashPartitioningImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.HashPartitioningImpl#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashPartitioningImpl extends BaseOrmAnnotationImpl implements HashPartitioning {
	/**
   * The cached value of the '{@link #getPartitionColumn() <em>Partition Column</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPartitionColumn()
   * @generated
   * @ordered
   */
	protected Column partitionColumn;

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
   * The default value of the '{@link #isUnionUnpartitionableQueries() <em>Union Unpartitionable Queries</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isUnionUnpartitionableQueries()
   * @generated
   * @ordered
   */
	protected static final boolean UNION_UNPARTITIONABLE_QUERIES_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isUnionUnpartitionableQueries() <em>Union Unpartitionable Queries</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isUnionUnpartitionableQueries()
   * @generated
   * @ordered
   */
	protected boolean unionUnpartitionableQueries = UNION_UNPARTITIONABLE_QUERIES_EDEFAULT;

	/**
   * This is true if the Union Unpartitionable Queries attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean unionUnpartitionableQueriesESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HashPartitioningImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getHashPartitioning();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Column getPartitionColumn() {
    return partitionColumn;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPartitionColumn(Column newPartitionColumn, NotificationChain msgs) {
    Column oldPartitionColumn = partitionColumn;
    partitionColumn = newPartitionColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN, oldPartitionColumn, newPartitionColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPartitionColumn(Column newPartitionColumn) {
    if (newPartitionColumn != partitionColumn) {
      NotificationChain msgs = null;
      if (partitionColumn != null)
        msgs = ((InternalEObject)partitionColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN, null, msgs);
      if (newPartitionColumn != null)
        msgs = ((InternalEObject)newPartitionColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN, null, msgs);
      msgs = basicSetPartitionColumn(newPartitionColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN, newPartitionColumn, newPartitionColumn));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getConnectionPool() {
    if (connectionPool == null) {
      connectionPool = new EDataTypeEList<String>(String.class, this, OrmPackage.HASH_PARTITIONING__CONNECTION_POOL);
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.HASH_PARTITIONING__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isUnionUnpartitionableQueries() {
    return unionUnpartitionableQueries;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnionUnpartitionableQueries(boolean newUnionUnpartitionableQueries) {
    boolean oldUnionUnpartitionableQueries = unionUnpartitionableQueries;
    unionUnpartitionableQueries = newUnionUnpartitionableQueries;
    boolean oldUnionUnpartitionableQueriesESet = unionUnpartitionableQueriesESet;
    unionUnpartitionableQueriesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.HASH_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES, oldUnionUnpartitionableQueries, unionUnpartitionableQueries, !oldUnionUnpartitionableQueriesESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetUnionUnpartitionableQueries() {
    boolean oldUnionUnpartitionableQueries = unionUnpartitionableQueries;
    boolean oldUnionUnpartitionableQueriesESet = unionUnpartitionableQueriesESet;
    unionUnpartitionableQueries = UNION_UNPARTITIONABLE_QUERIES_EDEFAULT;
    unionUnpartitionableQueriesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.HASH_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES, oldUnionUnpartitionableQueries, UNION_UNPARTITIONABLE_QUERIES_EDEFAULT, oldUnionUnpartitionableQueriesESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetUnionUnpartitionableQueries() {
    return unionUnpartitionableQueriesESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN:
        return basicSetPartitionColumn(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN:
        return getPartitionColumn();
      case OrmPackage.HASH_PARTITIONING__CONNECTION_POOL:
        return getConnectionPool();
      case OrmPackage.HASH_PARTITIONING__NAME:
        return getName();
      case OrmPackage.HASH_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
        return isUnionUnpartitionableQueries();
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
      case OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN:
        setPartitionColumn((Column)newValue);
        return;
      case OrmPackage.HASH_PARTITIONING__CONNECTION_POOL:
        getConnectionPool().clear();
        getConnectionPool().addAll((Collection<? extends String>)newValue);
        return;
      case OrmPackage.HASH_PARTITIONING__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.HASH_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
        setUnionUnpartitionableQueries((Boolean)newValue);
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
      case OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN:
        setPartitionColumn((Column)null);
        return;
      case OrmPackage.HASH_PARTITIONING__CONNECTION_POOL:
        getConnectionPool().clear();
        return;
      case OrmPackage.HASH_PARTITIONING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.HASH_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
        unsetUnionUnpartitionableQueries();
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
      case OrmPackage.HASH_PARTITIONING__PARTITION_COLUMN:
        return partitionColumn != null;
      case OrmPackage.HASH_PARTITIONING__CONNECTION_POOL:
        return connectionPool != null && !connectionPool.isEmpty();
      case OrmPackage.HASH_PARTITIONING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.HASH_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
        return isSetUnionUnpartitionableQueries();
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
    result.append(", unionUnpartitionableQueries: "); //$NON-NLS-1$
    if (unionUnpartitionableQueriesESet) result.append(unionUnpartitionableQueries); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} //HashPartitioningImpl
