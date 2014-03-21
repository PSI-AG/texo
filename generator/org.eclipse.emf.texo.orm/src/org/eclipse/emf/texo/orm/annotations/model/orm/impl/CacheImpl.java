/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.Cache;
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType;
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheIsolationType;
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cache</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#getExpiryTimeOfDay <em>Expiry Time Of Day</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#isAlwaysRefresh <em>Always Refresh</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#getCoordinationType <em>Coordination Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#isDisableHits <em>Disable Hits</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#isRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#isShared <em>Shared</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheImpl extends BaseOrmAnnotationImpl implements Cache {
  /**
   * The default value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getExpiry()
   * @generated
   * @ordered
   */
  protected static final BigInteger EXPIRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getExpiry()
   * @generated
   * @ordered
   */
  protected BigInteger expiry = EXPIRY_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpiryTimeOfDay() <em>Expiry Time Of Day</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExpiryTimeOfDay()
   * @generated
   * @ordered
   */
  protected TimeOfDay expiryTimeOfDay;

  /**
   * The default value of the '{@link #isAlwaysRefresh() <em>Always Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlwaysRefresh()
   * @generated
   * @ordered
   */
  protected static final boolean ALWAYS_REFRESH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAlwaysRefresh() <em>Always Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlwaysRefresh()
   * @generated
   * @ordered
   */
  protected boolean alwaysRefresh = ALWAYS_REFRESH_EDEFAULT;

  /**
   * This is true if the Always Refresh attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean alwaysRefreshESet;

  /**
   * The default value of the '{@link #getCoordinationType() <em>Coordination Type</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCoordinationType()
   * @generated
   * @ordered
   */
  protected static final CacheCoordinationType COORDINATION_TYPE_EDEFAULT = CacheCoordinationType.SENDOBJECTCHANGES;

  /**
   * The cached value of the '{@link #getCoordinationType() <em>Coordination Type</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCoordinationType()
   * @generated
   * @ordered
   */
  protected CacheCoordinationType coordinationType = COORDINATION_TYPE_EDEFAULT;

  /**
   * This is true if the Coordination Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean coordinationTypeESet;

  /**
   * The default value of the '{@link #isDisableHits() <em>Disable Hits</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDisableHits()
   * @generated
   * @ordered
   */
  protected static final boolean DISABLE_HITS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisableHits() <em>Disable Hits</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDisableHits()
   * @generated
   * @ordered
   */
  protected boolean disableHits = DISABLE_HITS_EDEFAULT;

  /**
   * This is true if the Disable Hits attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean disableHitsESet;

  /**
   * The default value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIsolation()
   * @generated
   * @ordered
   */
	protected static final CacheIsolationType ISOLATION_EDEFAULT = CacheIsolationType.SHARED;

		/**
   * The cached value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIsolation()
   * @generated
   * @ordered
   */
	protected CacheIsolationType isolation = ISOLATION_EDEFAULT;

		/**
   * This is true if the Isolation attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean isolationESet;

		/**
   * The default value of the '{@link #isRefreshOnlyIfNewer() <em>Refresh Only If Newer</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isRefreshOnlyIfNewer()
   * @generated
   * @ordered
   */
  protected static final boolean REFRESH_ONLY_IF_NEWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRefreshOnlyIfNewer() <em>Refresh Only If Newer</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isRefreshOnlyIfNewer()
   * @generated
   * @ordered
   */
  protected boolean refreshOnlyIfNewer = REFRESH_ONLY_IF_NEWER_EDEFAULT;

  /**
   * This is true if the Refresh Only If Newer attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean refreshOnlyIfNewerESet;

  /**
   * The default value of the '{@link #isShared() <em>Shared</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isShared()
   * @generated
   * @ordered
   */
  protected static final boolean SHARED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShared() <em>Shared</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isShared()
   * @generated
   * @ordered
   */
  protected boolean shared = SHARED_EDEFAULT;

  /**
   * This is true if the Shared attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean sharedESet;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final BigInteger SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected BigInteger size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final CacheType TYPE_EDEFAULT = CacheType.FULL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected CacheType type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CacheImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getCache();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getExpiry() {
    return expiry;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExpiry(BigInteger newExpiry) {
    BigInteger oldExpiry = expiry;
    expiry = newExpiry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__EXPIRY, oldExpiry, expiry));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TimeOfDay getExpiryTimeOfDay() {
    return expiryTimeOfDay;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpiryTimeOfDay(TimeOfDay newExpiryTimeOfDay, NotificationChain msgs) {
    TimeOfDay oldExpiryTimeOfDay = expiryTimeOfDay;
    expiryTimeOfDay = newExpiryTimeOfDay;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__EXPIRY_TIME_OF_DAY, oldExpiryTimeOfDay, newExpiryTimeOfDay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExpiryTimeOfDay(TimeOfDay newExpiryTimeOfDay) {
    if (newExpiryTimeOfDay != expiryTimeOfDay) {
      NotificationChain msgs = null;
      if (expiryTimeOfDay != null)
        msgs = ((InternalEObject)expiryTimeOfDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.CACHE__EXPIRY_TIME_OF_DAY, null, msgs);
      if (newExpiryTimeOfDay != null)
        msgs = ((InternalEObject)newExpiryTimeOfDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.CACHE__EXPIRY_TIME_OF_DAY, null, msgs);
      msgs = basicSetExpiryTimeOfDay(newExpiryTimeOfDay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__EXPIRY_TIME_OF_DAY, newExpiryTimeOfDay, newExpiryTimeOfDay));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAlwaysRefresh() {
    return alwaysRefresh;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAlwaysRefresh(boolean newAlwaysRefresh) {
    boolean oldAlwaysRefresh = alwaysRefresh;
    alwaysRefresh = newAlwaysRefresh;
    boolean oldAlwaysRefreshESet = alwaysRefreshESet;
    alwaysRefreshESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__ALWAYS_REFRESH, oldAlwaysRefresh, alwaysRefresh, !oldAlwaysRefreshESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAlwaysRefresh() {
    boolean oldAlwaysRefresh = alwaysRefresh;
    boolean oldAlwaysRefreshESet = alwaysRefreshESet;
    alwaysRefresh = ALWAYS_REFRESH_EDEFAULT;
    alwaysRefreshESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__ALWAYS_REFRESH, oldAlwaysRefresh, ALWAYS_REFRESH_EDEFAULT, oldAlwaysRefreshESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAlwaysRefresh() {
    return alwaysRefreshESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheCoordinationType getCoordinationType() {
    return coordinationType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCoordinationType(CacheCoordinationType newCoordinationType) {
    CacheCoordinationType oldCoordinationType = coordinationType;
    coordinationType = newCoordinationType == null ? COORDINATION_TYPE_EDEFAULT : newCoordinationType;
    boolean oldCoordinationTypeESet = coordinationTypeESet;
    coordinationTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__COORDINATION_TYPE, oldCoordinationType, coordinationType, !oldCoordinationTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCoordinationType() {
    CacheCoordinationType oldCoordinationType = coordinationType;
    boolean oldCoordinationTypeESet = coordinationTypeESet;
    coordinationType = COORDINATION_TYPE_EDEFAULT;
    coordinationTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__COORDINATION_TYPE, oldCoordinationType, COORDINATION_TYPE_EDEFAULT, oldCoordinationTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCoordinationType() {
    return coordinationTypeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisableHits() {
    return disableHits;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDisableHits(boolean newDisableHits) {
    boolean oldDisableHits = disableHits;
    disableHits = newDisableHits;
    boolean oldDisableHitsESet = disableHitsESet;
    disableHitsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__DISABLE_HITS, oldDisableHits, disableHits, !oldDisableHitsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDisableHits() {
    boolean oldDisableHits = disableHits;
    boolean oldDisableHitsESet = disableHitsESet;
    disableHits = DISABLE_HITS_EDEFAULT;
    disableHitsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__DISABLE_HITS, oldDisableHits, DISABLE_HITS_EDEFAULT, oldDisableHitsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDisableHits() {
    return disableHitsESet;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CacheIsolationType getIsolation() {
    return isolation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIsolation(CacheIsolationType newIsolation) {
    CacheIsolationType oldIsolation = isolation;
    isolation = newIsolation == null ? ISOLATION_EDEFAULT : newIsolation;
    boolean oldIsolationESet = isolationESet;
    isolationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__ISOLATION, oldIsolation, isolation, !oldIsolationESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetIsolation() {
    CacheIsolationType oldIsolation = isolation;
    boolean oldIsolationESet = isolationESet;
    isolation = ISOLATION_EDEFAULT;
    isolationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__ISOLATION, oldIsolation, ISOLATION_EDEFAULT, oldIsolationESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetIsolation() {
    return isolationESet;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isRefreshOnlyIfNewer() {
    return refreshOnlyIfNewer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRefreshOnlyIfNewer(boolean newRefreshOnlyIfNewer) {
    boolean oldRefreshOnlyIfNewer = refreshOnlyIfNewer;
    refreshOnlyIfNewer = newRefreshOnlyIfNewer;
    boolean oldRefreshOnlyIfNewerESet = refreshOnlyIfNewerESet;
    refreshOnlyIfNewerESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__REFRESH_ONLY_IF_NEWER, oldRefreshOnlyIfNewer, refreshOnlyIfNewer, !oldRefreshOnlyIfNewerESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRefreshOnlyIfNewer() {
    boolean oldRefreshOnlyIfNewer = refreshOnlyIfNewer;
    boolean oldRefreshOnlyIfNewerESet = refreshOnlyIfNewerESet;
    refreshOnlyIfNewer = REFRESH_ONLY_IF_NEWER_EDEFAULT;
    refreshOnlyIfNewerESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__REFRESH_ONLY_IF_NEWER, oldRefreshOnlyIfNewer, REFRESH_ONLY_IF_NEWER_EDEFAULT, oldRefreshOnlyIfNewerESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRefreshOnlyIfNewer() {
    return refreshOnlyIfNewerESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isShared() {
    return shared;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setShared(boolean newShared) {
    boolean oldShared = shared;
    shared = newShared;
    boolean oldSharedESet = sharedESet;
    sharedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__SHARED, oldShared, shared, !oldSharedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetShared() {
    boolean oldShared = shared;
    boolean oldSharedESet = sharedESet;
    shared = SHARED_EDEFAULT;
    sharedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__SHARED, oldShared, SHARED_EDEFAULT, oldSharedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetShared() {
    return sharedESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getSize() {
    return size;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSize(BigInteger newSize) {
    BigInteger oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(CacheType newType) {
    CacheType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CACHE__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    CacheType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.CACHE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType() {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.CACHE__EXPIRY_TIME_OF_DAY:
        return basicSetExpiryTimeOfDay(null, msgs);
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
      case OrmPackage.CACHE__EXPIRY:
        return getExpiry();
      case OrmPackage.CACHE__EXPIRY_TIME_OF_DAY:
        return getExpiryTimeOfDay();
      case OrmPackage.CACHE__ALWAYS_REFRESH:
        return isAlwaysRefresh();
      case OrmPackage.CACHE__COORDINATION_TYPE:
        return getCoordinationType();
      case OrmPackage.CACHE__DISABLE_HITS:
        return isDisableHits();
      case OrmPackage.CACHE__ISOLATION:
        return getIsolation();
      case OrmPackage.CACHE__REFRESH_ONLY_IF_NEWER:
        return isRefreshOnlyIfNewer();
      case OrmPackage.CACHE__SHARED:
        return isShared();
      case OrmPackage.CACHE__SIZE:
        return getSize();
      case OrmPackage.CACHE__TYPE:
        return getType();
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
      case OrmPackage.CACHE__EXPIRY:
        setExpiry((BigInteger)newValue);
        return;
      case OrmPackage.CACHE__EXPIRY_TIME_OF_DAY:
        setExpiryTimeOfDay((TimeOfDay)newValue);
        return;
      case OrmPackage.CACHE__ALWAYS_REFRESH:
        setAlwaysRefresh((Boolean)newValue);
        return;
      case OrmPackage.CACHE__COORDINATION_TYPE:
        setCoordinationType((CacheCoordinationType)newValue);
        return;
      case OrmPackage.CACHE__DISABLE_HITS:
        setDisableHits((Boolean)newValue);
        return;
      case OrmPackage.CACHE__ISOLATION:
        setIsolation((CacheIsolationType)newValue);
        return;
      case OrmPackage.CACHE__REFRESH_ONLY_IF_NEWER:
        setRefreshOnlyIfNewer((Boolean)newValue);
        return;
      case OrmPackage.CACHE__SHARED:
        setShared((Boolean)newValue);
        return;
      case OrmPackage.CACHE__SIZE:
        setSize((BigInteger)newValue);
        return;
      case OrmPackage.CACHE__TYPE:
        setType((CacheType)newValue);
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
      case OrmPackage.CACHE__EXPIRY:
        setExpiry(EXPIRY_EDEFAULT);
        return;
      case OrmPackage.CACHE__EXPIRY_TIME_OF_DAY:
        setExpiryTimeOfDay((TimeOfDay)null);
        return;
      case OrmPackage.CACHE__ALWAYS_REFRESH:
        unsetAlwaysRefresh();
        return;
      case OrmPackage.CACHE__COORDINATION_TYPE:
        unsetCoordinationType();
        return;
      case OrmPackage.CACHE__DISABLE_HITS:
        unsetDisableHits();
        return;
      case OrmPackage.CACHE__ISOLATION:
        unsetIsolation();
        return;
      case OrmPackage.CACHE__REFRESH_ONLY_IF_NEWER:
        unsetRefreshOnlyIfNewer();
        return;
      case OrmPackage.CACHE__SHARED:
        unsetShared();
        return;
      case OrmPackage.CACHE__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case OrmPackage.CACHE__TYPE:
        unsetType();
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
      case OrmPackage.CACHE__EXPIRY:
        return EXPIRY_EDEFAULT == null ? expiry != null : !EXPIRY_EDEFAULT.equals(expiry);
      case OrmPackage.CACHE__EXPIRY_TIME_OF_DAY:
        return expiryTimeOfDay != null;
      case OrmPackage.CACHE__ALWAYS_REFRESH:
        return isSetAlwaysRefresh();
      case OrmPackage.CACHE__COORDINATION_TYPE:
        return isSetCoordinationType();
      case OrmPackage.CACHE__DISABLE_HITS:
        return isSetDisableHits();
      case OrmPackage.CACHE__ISOLATION:
        return isSetIsolation();
      case OrmPackage.CACHE__REFRESH_ONLY_IF_NEWER:
        return isSetRefreshOnlyIfNewer();
      case OrmPackage.CACHE__SHARED:
        return isSetShared();
      case OrmPackage.CACHE__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case OrmPackage.CACHE__TYPE:
        return isSetType();
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
    result.append(" (expiry: "); //$NON-NLS-1$
    result.append(expiry);
    result.append(", alwaysRefresh: "); //$NON-NLS-1$
    if (alwaysRefreshESet) result.append(alwaysRefresh); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", coordinationType: "); //$NON-NLS-1$
    if (coordinationTypeESet) result.append(coordinationType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", disableHits: "); //$NON-NLS-1$
    if (disableHitsESet) result.append(disableHits); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", isolation: "); //$NON-NLS-1$
    if (isolationESet) result.append(isolation); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", refreshOnlyIfNewer: "); //$NON-NLS-1$
    if (refreshOnlyIfNewerESet) result.append(refreshOnlyIfNewer); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", shared: "); //$NON-NLS-1$
    if (sharedESet) result.append(shared); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", size: "); //$NON-NLS-1$
    result.append(size);
    result.append(", type: "); //$NON-NLS-1$
    if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // CacheImpl
