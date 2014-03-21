/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedQueryImpl.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Named Query</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl#getLockMode <em>Lock Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedQueryImpl extends BaseOrmAnnotationImpl implements NamedQuery {
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getQuery() <em>Query</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected static final String QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected String query = QUERY_EDEFAULT;

  /**
   * The default value of the '{@link #getLockMode() <em>Lock Mode</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLockMode()
   * @generated
   * @ordered
   */
  protected static final LockModeType LOCK_MODE_EDEFAULT = LockModeType.READ;

  /**
   * The cached value of the '{@link #getLockMode() <em>Lock Mode</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLockMode()
   * @generated
   * @ordered
   */
  protected LockModeType lockMode = LOCK_MODE_EDEFAULT;

  /**
   * This is true if the Lock Mode attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean lockModeESet;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected EList<QueryHint> hint;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected NamedQueryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getNamedQuery();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_QUERY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getQuery() {
    return query;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(String newQuery) {
    String oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_QUERY__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LockModeType getLockMode() {
    return lockMode;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLockMode(LockModeType newLockMode) {
    LockModeType oldLockMode = lockMode;
    lockMode = newLockMode == null ? LOCK_MODE_EDEFAULT : newLockMode;
    boolean oldLockModeESet = lockModeESet;
    lockModeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_QUERY__LOCK_MODE, oldLockMode, lockMode, !oldLockModeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetLockMode() {
    LockModeType oldLockMode = lockMode;
    boolean oldLockModeESet = lockModeESet;
    lockMode = LOCK_MODE_EDEFAULT;
    lockModeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.NAMED_QUERY__LOCK_MODE, oldLockMode, LOCK_MODE_EDEFAULT, oldLockModeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetLockMode() {
    return lockModeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<QueryHint> getHint() {
    if (hint == null) {
      hint = new EObjectContainmentEList<QueryHint>(QueryHint.class, this, OrmPackage.NAMED_QUERY__HINT);
    }
    return hint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_QUERY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.NAMED_QUERY__HINT:
        return ((InternalEList<?>)getHint()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.NAMED_QUERY__DESCRIPTION:
        return getDescription();
      case OrmPackage.NAMED_QUERY__QUERY:
        return getQuery();
      case OrmPackage.NAMED_QUERY__LOCK_MODE:
        return getLockMode();
      case OrmPackage.NAMED_QUERY__HINT:
        return getHint();
      case OrmPackage.NAMED_QUERY__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.NAMED_QUERY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrmPackage.NAMED_QUERY__QUERY:
        setQuery((String)newValue);
        return;
      case OrmPackage.NAMED_QUERY__LOCK_MODE:
        setLockMode((LockModeType)newValue);
        return;
      case OrmPackage.NAMED_QUERY__HINT:
        getHint().clear();
        getHint().addAll((Collection<? extends QueryHint>)newValue);
        return;
      case OrmPackage.NAMED_QUERY__NAME:
        setName((String)newValue);
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
      case OrmPackage.NAMED_QUERY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrmPackage.NAMED_QUERY__QUERY:
        setQuery(QUERY_EDEFAULT);
        return;
      case OrmPackage.NAMED_QUERY__LOCK_MODE:
        unsetLockMode();
        return;
      case OrmPackage.NAMED_QUERY__HINT:
        getHint().clear();
        return;
      case OrmPackage.NAMED_QUERY__NAME:
        setName(NAME_EDEFAULT);
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
      case OrmPackage.NAMED_QUERY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrmPackage.NAMED_QUERY__QUERY:
        return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
      case OrmPackage.NAMED_QUERY__LOCK_MODE:
        return isSetLockMode();
      case OrmPackage.NAMED_QUERY__HINT:
        return hint != null && !hint.isEmpty();
      case OrmPackage.NAMED_QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (description: "); //$NON-NLS-1$
    result.append(description);
    result.append(", query: "); //$NON-NLS-1$
    result.append(query);
    result.append(", lockMode: "); //$NON-NLS-1$
    if (lockModeESet) result.append(lockMode); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} // NamedQueryImpl
