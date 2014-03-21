/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cache.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.math.BigInteger;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Cache</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* The Cache annotation is used to set an
 * 				*
 * 				org.eclipse.persistence.descriptors.invalidation.CacheInvalidationPolicy
 * 				* which sets objects in EclipseLink's identity maps to be invalid
 * 				* following given rules. By default in EclipseLink, objects do not
 * 				* expire in the cache. Several different policies are available to
 * 				* allow objects to expire.
 * 				*
 * 				* @see org.eclipse.persistence.annotations.CacheType
 * 				*
 * 				* A Cache anotation may be defined on an Entity or MappedSuperclass.
 * 				* In the case of inheritance, a Cache annotation should only be
 * 				defined
 * 				* on the root of the inheritance hierarchy.
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface Cache {
 * 				/**
 * 				* (Optional) The type of cache to use.
 * 				**
 * 				CacheType type() default SOFT_WEAK;
 * 
 * 				/**
 * 				* (Optional) The size of cache to use.
 * 				**
 * 				int size() default 100;
 * 
 * 				/**
 * 				* (Optional) Cached instances in the shared cache,
 * 				* or only a per EntityManager isolated cache.
 * 				* The default is shared.
 * 				* @deprecated As of Eclipselink 2.2. See the attribute 'isolation'
 * 				**
 * 				@Deprecated
 * 				boolean shared() default true;
 * 
 * 				/**
 * 				* (Optional) Controls the level of caching this Entity will use.
 * 				* The default is CacheIsolationType.SHARED which has EclipseLink
 * 				* Caching all Entities in the Shared Cache.
 * 				* @see org.eclipse.persistence.config.CacheIsolationType
 * 				**
 * 				CacheIsolationType isolation() default SHARED;
 * 
 * 				/**
 * 				* (Optional) Expire cached instance after a fix period of time (ms).
 * 				* Queries executed against the cache after this will be forced back
 * 				* to the database for a refreshed copy
 * 				**
 * 				int expiry() default -1; // minus one is no expiry.
 * 
 * 				/**
 * 				* (Optional) Expire cached instance a specific time of day. Queries
 * 				* executed against the cache after this will be forced back to the
 * 				* database for a refreshed copy
 * 				**
 * 				TimeOfDay expiryTimeOfDay() default @TimeOfDay(specified=false);
 * 
 * 				/**
 * 				* (Optional) Force all queries that go to the database to always
 * 				* refresh the cache.
 * 				**
 * 				boolean alwaysRefresh() default false;
 * 
 * 				/**
 * 				* (Optional) For all queries that go to the database, refresh the
 * 				* cache only if the data received from the database by a query is
 * 				* newer than the data in the cache (as determined by the optimistic
 * 				* locking field)
 * 				**
 * 				boolean refreshOnlyIfNewer() default false;
 * 
 * 				/**
 * 				* (Optional) Setting to true will force all queries to bypass the
 * 				* cache for hits but still resolve against the cache for identity.
 * 				* This forces all queries to hit the database.
 * 				**
 * 				boolean disableHits() default false;
 * 
 * 				/**
 * 				* (Optional) The cache coordination mode.
 * 				**
 * 				CacheCoordinationType coordinationType() default SEND_OBJECT_CHANGES;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiryTimeOfDay <em>Expiry Time Of Day</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isAlwaysRefresh <em>Always Refresh</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getCoordinationType <em>Coordination Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isDisableHits <em>Disable Hits</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isShared <em>Shared</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache()
 * @model extendedMetaData="name='cache' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Cache extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Expiry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expiry</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expiry</em>' attribute.
   * @see #setExpiry(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_Expiry()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='element' name='expiry' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getExpiry();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiry <em>Expiry</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Expiry</em>' attribute.
   * @see #getExpiry()
   * @generated
   */
  void setExpiry(BigInteger value);

  /**
   * Returns the value of the '<em><b>Expiry Time Of Day</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expiry Time Of Day</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expiry Time Of Day</em>' containment reference.
   * @see #setExpiryTimeOfDay(TimeOfDay)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_ExpiryTimeOfDay()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='expiry-time-of-day' namespace='##targetNamespace'"
   * @generated
   */
  TimeOfDay getExpiryTimeOfDay();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiryTimeOfDay <em>Expiry Time Of Day</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Expiry Time Of Day</em>' containment reference.
   * @see #getExpiryTimeOfDay()
   * @generated
   */
  void setExpiryTimeOfDay(TimeOfDay value);

  /**
   * Returns the value of the '<em><b>Always Refresh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Always Refresh</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Always Refresh</em>' attribute.
   * @see #isSetAlwaysRefresh()
   * @see #unsetAlwaysRefresh()
   * @see #setAlwaysRefresh(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_AlwaysRefresh()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='always-refresh'"
   * @generated
   */
  boolean isAlwaysRefresh();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isAlwaysRefresh <em>Always Refresh</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Always Refresh</em>' attribute.
   * @see #isSetAlwaysRefresh()
   * @see #unsetAlwaysRefresh()
   * @see #isAlwaysRefresh()
   * @generated
   */
  void setAlwaysRefresh(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isAlwaysRefresh <em>Always Refresh</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAlwaysRefresh()
   * @see #isAlwaysRefresh()
   * @see #setAlwaysRefresh(boolean)
   * @generated
   */
  void unsetAlwaysRefresh();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isAlwaysRefresh <em>Always Refresh</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Always Refresh</em>' attribute is set.
   * @see #unsetAlwaysRefresh()
   * @see #isAlwaysRefresh()
   * @see #setAlwaysRefresh(boolean)
   * @generated
   */
  boolean isSetAlwaysRefresh();

  /**
   * Returns the value of the '<em><b>Coordination Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordination Type</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordination Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType
   * @see #isSetCoordinationType()
   * @see #unsetCoordinationType()
   * @see #setCoordinationType(CacheCoordinationType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_CoordinationType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='coordination-type'"
   * @generated
   */
  CacheCoordinationType getCoordinationType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getCoordinationType <em>Coordination Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordination Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType
   * @see #isSetCoordinationType()
   * @see #unsetCoordinationType()
   * @see #getCoordinationType()
   * @generated
   */
  void setCoordinationType(CacheCoordinationType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getCoordinationType <em>Coordination Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCoordinationType()
   * @see #getCoordinationType()
   * @see #setCoordinationType(CacheCoordinationType)
   * @generated
   */
  void unsetCoordinationType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getCoordinationType <em>Coordination Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Coordination Type</em>' attribute is set.
   * @see #unsetCoordinationType()
   * @see #getCoordinationType()
   * @see #setCoordinationType(CacheCoordinationType)
   * @generated
   */
  boolean isSetCoordinationType();

  /**
   * Returns the value of the '<em><b>Disable Hits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disable Hits</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disable Hits</em>' attribute.
   * @see #isSetDisableHits()
   * @see #unsetDisableHits()
   * @see #setDisableHits(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_DisableHits()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='disable-hits'"
   * @generated
   */
  boolean isDisableHits();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isDisableHits <em>Disable Hits</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Disable Hits</em>' attribute.
   * @see #isSetDisableHits()
   * @see #unsetDisableHits()
   * @see #isDisableHits()
   * @generated
   */
  void setDisableHits(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isDisableHits <em>Disable Hits</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDisableHits()
   * @see #isDisableHits()
   * @see #setDisableHits(boolean)
   * @generated
   */
  void unsetDisableHits();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isDisableHits <em>Disable Hits</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Disable Hits</em>' attribute is set.
   * @see #unsetDisableHits()
   * @see #isDisableHits()
   * @see #setDisableHits(boolean)
   * @generated
   */
  boolean isSetDisableHits();

  /**
   * Returns the value of the '<em><b>Isolation</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheIsolationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Isolation</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheIsolationType
   * @see #isSetIsolation()
   * @see #unsetIsolation()
   * @see #setIsolation(CacheIsolationType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_Isolation()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='isolation'"
   * @generated
   */
	CacheIsolationType getIsolation();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getIsolation <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isolation</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheIsolationType
   * @see #isSetIsolation()
   * @see #unsetIsolation()
   * @see #getIsolation()
   * @generated
   */
	void setIsolation(CacheIsolationType value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getIsolation <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetIsolation()
   * @see #getIsolation()
   * @see #setIsolation(CacheIsolationType)
   * @generated
   */
	void unsetIsolation();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getIsolation <em>Isolation</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Isolation</em>' attribute is set.
   * @see #unsetIsolation()
   * @see #getIsolation()
   * @see #setIsolation(CacheIsolationType)
   * @generated
   */
	boolean isSetIsolation();

		/**
   * Returns the value of the '<em><b>Refresh Only If Newer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refresh Only If Newer</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refresh Only If Newer</em>' attribute.
   * @see #isSetRefreshOnlyIfNewer()
   * @see #unsetRefreshOnlyIfNewer()
   * @see #setRefreshOnlyIfNewer(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_RefreshOnlyIfNewer()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='refresh-only-if-newer'"
   * @generated
   */
  boolean isRefreshOnlyIfNewer();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Refresh Only If Newer</em>' attribute.
   * @see #isSetRefreshOnlyIfNewer()
   * @see #unsetRefreshOnlyIfNewer()
   * @see #isRefreshOnlyIfNewer()
   * @generated
   */
  void setRefreshOnlyIfNewer(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRefreshOnlyIfNewer()
   * @see #isRefreshOnlyIfNewer()
   * @see #setRefreshOnlyIfNewer(boolean)
   * @generated
   */
  void unsetRefreshOnlyIfNewer();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Refresh Only If Newer</em>' attribute is set.
   * @see #unsetRefreshOnlyIfNewer()
   * @see #isRefreshOnlyIfNewer()
   * @see #setRefreshOnlyIfNewer(boolean)
   * @generated
   */
  boolean isSetRefreshOnlyIfNewer();

  /**
   * Returns the value of the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shared</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shared</em>' attribute.
   * @see #isSetShared()
   * @see #unsetShared()
   * @see #setShared(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_Shared()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='shared'"
   * @generated
   */
  boolean isShared();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isShared <em>Shared</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Shared</em>' attribute.
   * @see #isSetShared()
   * @see #unsetShared()
   * @see #isShared()
   * @generated
   */
  void setShared(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isShared <em>Shared</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetShared()
   * @see #isShared()
   * @see #setShared(boolean)
   * @generated
   */
  void unsetShared();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isShared <em>Shared</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Shared</em>' attribute is set.
   * @see #unsetShared()
   * @see #isShared()
   * @see #setShared(boolean)
   * @generated
   */
  boolean isSetShared();

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_Size()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='size'"
   * @generated
   */
  BigInteger getSize();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(BigInteger value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(CacheType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCache_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  CacheType getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(CacheType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(CacheType)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(CacheType)
   * @generated
   */
  boolean isSetType();

} // Cache
