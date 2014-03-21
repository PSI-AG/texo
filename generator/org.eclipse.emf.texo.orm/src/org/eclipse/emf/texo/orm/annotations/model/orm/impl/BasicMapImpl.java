/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicMapImpl.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap;
import org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic Map</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getKeyColumn <em>Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getKeyConverter <em>Key Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getValueColumn <em>Value Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getValueConverter <em>Value Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getBatchFetch <em>Batch Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getNoncacheable <em>Noncacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicMapImpl extends BaseOrmAnnotationImpl implements BasicMap {
  /**
   * The cached value of the '{@link #getKeyColumn() <em>Key Column</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getKeyColumn()
   * @generated
   * @ordered
   */
  protected Column keyColumn;

  /**
   * The default value of the '{@link #getKeyConverter() <em>Key Converter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyConverter()
   * @generated
   * @ordered
   */
  protected static final String KEY_CONVERTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyConverter() <em>Key Converter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getKeyConverter()
   * @generated
   * @ordered
   */
  protected String keyConverter = KEY_CONVERTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueColumn() <em>Value Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getValueColumn()
   * @generated
   * @ordered
   */
  protected Column valueColumn;

  /**
   * The default value of the '{@link #getValueConverter() <em>Value Converter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueConverter()
   * @generated
   * @ordered
   */
  protected static final String VALUE_CONVERTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueConverter() <em>Value Converter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueConverter()
   * @generated
   * @ordered
   */
  protected String valueConverter = VALUE_CONVERTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected FeatureMap group;

  /**
   * The cached value of the '{@link #getCollectionTable() <em>Collection Table</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCollectionTable()
   * @generated
   * @ordered
   */
  protected EclipselinkCollectionTable collectionTable;

  /**
   * The default value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getJoinFetch()
   * @generated
   * @ordered
   */
  protected static final JoinFetchType JOIN_FETCH_EDEFAULT = JoinFetchType.INNER;

  /**
   * The cached value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getJoinFetch()
   * @generated
   * @ordered
   */
  protected JoinFetchType joinFetch = JOIN_FETCH_EDEFAULT;

  /**
   * This is true if the Join Fetch attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean joinFetchESet;

  /**
   * The cached value of the '{@link #getBatchFetch() <em>Batch Fetch</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBatchFetch()
   * @generated
   * @ordered
   */
	protected BatchFetch batchFetch;

		/**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
  protected AccessMethods accessMethods;

  /**
   * The cached value of the '{@link #getNoncacheable() <em>Noncacheable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNoncacheable()
   * @generated
   * @ordered
   */
	protected EmptyType noncacheable;

		/**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet;

  /**
   * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected static final FetchType FETCH_EDEFAULT = FetchType.LAZY;

  /**
   * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected FetchType fetch = FETCH_EDEFAULT;

  /**
   * This is true if the Fetch attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean fetchESet;

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
  protected BasicMapImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getBasicMap();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column getKeyColumn() {
    return keyColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyColumn(Column newKeyColumn, NotificationChain msgs) {
    Column oldKeyColumn = keyColumn;
    keyColumn = newKeyColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__KEY_COLUMN, oldKeyColumn, newKeyColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setKeyColumn(Column newKeyColumn) {
    if (newKeyColumn != keyColumn) {
      NotificationChain msgs = null;
      if (keyColumn != null)
        msgs = ((InternalEObject)keyColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__KEY_COLUMN, null, msgs);
      if (newKeyColumn != null)
        msgs = ((InternalEObject)newKeyColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__KEY_COLUMN, null, msgs);
      msgs = basicSetKeyColumn(newKeyColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__KEY_COLUMN, newKeyColumn, newKeyColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getKeyConverter() {
    return keyConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setKeyConverter(String newKeyConverter) {
    String oldKeyConverter = keyConverter;
    keyConverter = newKeyConverter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__KEY_CONVERTER, oldKeyConverter, keyConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column getValueColumn() {
    return valueColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueColumn(Column newValueColumn, NotificationChain msgs) {
    Column oldValueColumn = valueColumn;
    valueColumn = newValueColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__VALUE_COLUMN, oldValueColumn, newValueColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValueColumn(Column newValueColumn) {
    if (newValueColumn != valueColumn) {
      NotificationChain msgs = null;
      if (valueColumn != null)
        msgs = ((InternalEObject)valueColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__VALUE_COLUMN, null, msgs);
      if (newValueColumn != null)
        msgs = ((InternalEObject)newValueColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__VALUE_COLUMN, null, msgs);
      msgs = basicSetValueColumn(newValueColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__VALUE_COLUMN, newValueColumn, newValueColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getValueConverter() {
    return valueConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValueConverter(String newValueConverter) {
    String oldValueConverter = valueConverter;
    valueConverter = newValueConverter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__VALUE_CONVERTER, oldValueConverter, valueConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, OrmPackage.BASIC_MAP__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Converter> getConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getBasicMap_Converter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeConverter> getTypeConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getBasicMap_TypeConverter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getBasicMap_ObjectTypeConverter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<StructConverter> getStructConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getBasicMap_StructConverter());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EclipselinkCollectionTable getCollectionTable() {
    return collectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollectionTable(EclipselinkCollectionTable newCollectionTable, NotificationChain msgs) {
    EclipselinkCollectionTable oldCollectionTable = collectionTable;
    collectionTable = newCollectionTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCollectionTable(EclipselinkCollectionTable newCollectionTable) {
    if (newCollectionTable != collectionTable) {
      NotificationChain msgs = null;
      if (collectionTable != null)
        msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__COLLECTION_TABLE, null, msgs);
      if (newCollectionTable != null)
        msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__COLLECTION_TABLE, null, msgs);
      msgs = basicSetCollectionTable(newCollectionTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinFetchType getJoinFetch() {
    return joinFetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJoinFetch(JoinFetchType newJoinFetch) {
    JoinFetchType oldJoinFetch = joinFetch;
    joinFetch = newJoinFetch == null ? JOIN_FETCH_EDEFAULT : newJoinFetch;
    boolean oldJoinFetchESet = joinFetchESet;
    joinFetchESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__JOIN_FETCH, oldJoinFetch, joinFetch, !oldJoinFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetJoinFetch() {
    JoinFetchType oldJoinFetch = joinFetch;
    boolean oldJoinFetchESet = joinFetchESet;
    joinFetch = JOIN_FETCH_EDEFAULT;
    joinFetchESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC_MAP__JOIN_FETCH, oldJoinFetch, JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetJoinFetch() {
    return joinFetchESet;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BatchFetch getBatchFetch() {
    return batchFetch;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBatchFetch(BatchFetch newBatchFetch, NotificationChain msgs) {
    BatchFetch oldBatchFetch = batchFetch;
    batchFetch = newBatchFetch;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__BATCH_FETCH, oldBatchFetch, newBatchFetch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBatchFetch(BatchFetch newBatchFetch) {
    if (newBatchFetch != batchFetch) {
      NotificationChain msgs = null;
      if (batchFetch != null)
        msgs = ((InternalEObject)batchFetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__BATCH_FETCH, null, msgs);
      if (newBatchFetch != null)
        msgs = ((InternalEObject)newBatchFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__BATCH_FETCH, null, msgs);
      msgs = basicSetBatchFetch(newBatchFetch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__BATCH_FETCH, newBatchFetch, newBatchFetch));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.BASIC_MAP__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessMethods getAccessMethods() {
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null)
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EmptyType getNoncacheable() {
    return noncacheable;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNoncacheable(EmptyType newNoncacheable, NotificationChain msgs) {
    EmptyType oldNoncacheable = noncacheable;
    noncacheable = newNoncacheable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__NONCACHEABLE, oldNoncacheable, newNoncacheable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNoncacheable(EmptyType newNoncacheable) {
    if (newNoncacheable != noncacheable) {
      NotificationChain msgs = null;
      if (noncacheable != null)
        msgs = ((InternalEObject)noncacheable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__NONCACHEABLE, null, msgs);
      if (newNoncacheable != null)
        msgs = ((InternalEObject)newNoncacheable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_MAP__NONCACHEABLE, null, msgs);
      msgs = basicSetNoncacheable(newNoncacheable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__NONCACHEABLE, newNoncacheable, newNoncacheable));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC_MAP__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType getFetch() {
    return fetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFetch(FetchType newFetch) {
    FetchType oldFetch = fetch;
    fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
    boolean oldFetchESet = fetchESet;
    fetchESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__FETCH, oldFetch, fetch, !oldFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetFetch() {
    FetchType oldFetch = fetch;
    boolean oldFetchESet = fetchESet;
    fetch = FETCH_EDEFAULT;
    fetchESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC_MAP__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFetch() {
    return fetchESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_MAP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.BASIC_MAP__KEY_COLUMN:
        return basicSetKeyColumn(null, msgs);
      case OrmPackage.BASIC_MAP__VALUE_COLUMN:
        return basicSetValueColumn(null, msgs);
      case OrmPackage.BASIC_MAP__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_MAP__CONVERTER:
        return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_MAP__TYPE_CONVERTER:
        return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_MAP__OBJECT_TYPE_CONVERTER:
        return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_MAP__STRUCT_CONVERTER:
        return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_MAP__COLLECTION_TABLE:
        return basicSetCollectionTable(null, msgs);
      case OrmPackage.BASIC_MAP__BATCH_FETCH:
        return basicSetBatchFetch(null, msgs);
      case OrmPackage.BASIC_MAP__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_MAP__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.BASIC_MAP__NONCACHEABLE:
        return basicSetNoncacheable(null, msgs);
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
      case OrmPackage.BASIC_MAP__KEY_COLUMN:
        return getKeyColumn();
      case OrmPackage.BASIC_MAP__KEY_CONVERTER:
        return getKeyConverter();
      case OrmPackage.BASIC_MAP__VALUE_COLUMN:
        return getValueColumn();
      case OrmPackage.BASIC_MAP__VALUE_CONVERTER:
        return getValueConverter();
      case OrmPackage.BASIC_MAP__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case OrmPackage.BASIC_MAP__CONVERTER:
        return getConverter();
      case OrmPackage.BASIC_MAP__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.BASIC_MAP__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.BASIC_MAP__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.BASIC_MAP__COLLECTION_TABLE:
        return getCollectionTable();
      case OrmPackage.BASIC_MAP__JOIN_FETCH:
        return getJoinFetch();
      case OrmPackage.BASIC_MAP__BATCH_FETCH:
        return getBatchFetch();
      case OrmPackage.BASIC_MAP__PROPERTY:
        return getProperty();
      case OrmPackage.BASIC_MAP__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.BASIC_MAP__NONCACHEABLE:
        return getNoncacheable();
      case OrmPackage.BASIC_MAP__ACCESS:
        return getAccess();
      case OrmPackage.BASIC_MAP__FETCH:
        return getFetch();
      case OrmPackage.BASIC_MAP__NAME:
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
      case OrmPackage.BASIC_MAP__KEY_COLUMN:
        setKeyColumn((Column)newValue);
        return;
      case OrmPackage.BASIC_MAP__KEY_CONVERTER:
        setKeyConverter((String)newValue);
        return;
      case OrmPackage.BASIC_MAP__VALUE_COLUMN:
        setValueColumn((Column)newValue);
        return;
      case OrmPackage.BASIC_MAP__VALUE_CONVERTER:
        setValueConverter((String)newValue);
        return;
      case OrmPackage.BASIC_MAP__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case OrmPackage.BASIC_MAP__CONVERTER:
        getConverter().clear();
        getConverter().addAll((Collection<? extends Converter>)newValue);
        return;
      case OrmPackage.BASIC_MAP__TYPE_CONVERTER:
        getTypeConverter().clear();
        getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
        return;
      case OrmPackage.BASIC_MAP__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
        return;
      case OrmPackage.BASIC_MAP__STRUCT_CONVERTER:
        getStructConverter().clear();
        getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
        return;
      case OrmPackage.BASIC_MAP__COLLECTION_TABLE:
        setCollectionTable((EclipselinkCollectionTable)newValue);
        return;
      case OrmPackage.BASIC_MAP__JOIN_FETCH:
        setJoinFetch((JoinFetchType)newValue);
        return;
      case OrmPackage.BASIC_MAP__BATCH_FETCH:
        setBatchFetch((BatchFetch)newValue);
        return;
      case OrmPackage.BASIC_MAP__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.BASIC_MAP__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.BASIC_MAP__NONCACHEABLE:
        setNoncacheable((EmptyType)newValue);
        return;
      case OrmPackage.BASIC_MAP__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.BASIC_MAP__FETCH:
        setFetch((FetchType)newValue);
        return;
      case OrmPackage.BASIC_MAP__NAME:
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
      case OrmPackage.BASIC_MAP__KEY_COLUMN:
        setKeyColumn((Column)null);
        return;
      case OrmPackage.BASIC_MAP__KEY_CONVERTER:
        setKeyConverter(KEY_CONVERTER_EDEFAULT);
        return;
      case OrmPackage.BASIC_MAP__VALUE_COLUMN:
        setValueColumn((Column)null);
        return;
      case OrmPackage.BASIC_MAP__VALUE_CONVERTER:
        setValueConverter(VALUE_CONVERTER_EDEFAULT);
        return;
      case OrmPackage.BASIC_MAP__GROUP:
        getGroup().clear();
        return;
      case OrmPackage.BASIC_MAP__CONVERTER:
        getConverter().clear();
        return;
      case OrmPackage.BASIC_MAP__TYPE_CONVERTER:
        getTypeConverter().clear();
        return;
      case OrmPackage.BASIC_MAP__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        return;
      case OrmPackage.BASIC_MAP__STRUCT_CONVERTER:
        getStructConverter().clear();
        return;
      case OrmPackage.BASIC_MAP__COLLECTION_TABLE:
        setCollectionTable((EclipselinkCollectionTable)null);
        return;
      case OrmPackage.BASIC_MAP__JOIN_FETCH:
        unsetJoinFetch();
        return;
      case OrmPackage.BASIC_MAP__BATCH_FETCH:
        setBatchFetch((BatchFetch)null);
        return;
      case OrmPackage.BASIC_MAP__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.BASIC_MAP__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.BASIC_MAP__NONCACHEABLE:
        setNoncacheable((EmptyType)null);
        return;
      case OrmPackage.BASIC_MAP__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.BASIC_MAP__FETCH:
        unsetFetch();
        return;
      case OrmPackage.BASIC_MAP__NAME:
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
      case OrmPackage.BASIC_MAP__KEY_COLUMN:
        return keyColumn != null;
      case OrmPackage.BASIC_MAP__KEY_CONVERTER:
        return KEY_CONVERTER_EDEFAULT == null ? keyConverter != null : !KEY_CONVERTER_EDEFAULT.equals(keyConverter);
      case OrmPackage.BASIC_MAP__VALUE_COLUMN:
        return valueColumn != null;
      case OrmPackage.BASIC_MAP__VALUE_CONVERTER:
        return VALUE_CONVERTER_EDEFAULT == null ? valueConverter != null : !VALUE_CONVERTER_EDEFAULT.equals(valueConverter);
      case OrmPackage.BASIC_MAP__GROUP:
        return group != null && !group.isEmpty();
      case OrmPackage.BASIC_MAP__CONVERTER:
        return !getConverter().isEmpty();
      case OrmPackage.BASIC_MAP__TYPE_CONVERTER:
        return !getTypeConverter().isEmpty();
      case OrmPackage.BASIC_MAP__OBJECT_TYPE_CONVERTER:
        return !getObjectTypeConverter().isEmpty();
      case OrmPackage.BASIC_MAP__STRUCT_CONVERTER:
        return !getStructConverter().isEmpty();
      case OrmPackage.BASIC_MAP__COLLECTION_TABLE:
        return collectionTable != null;
      case OrmPackage.BASIC_MAP__JOIN_FETCH:
        return isSetJoinFetch();
      case OrmPackage.BASIC_MAP__BATCH_FETCH:
        return batchFetch != null;
      case OrmPackage.BASIC_MAP__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.BASIC_MAP__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.BASIC_MAP__NONCACHEABLE:
        return noncacheable != null;
      case OrmPackage.BASIC_MAP__ACCESS:
        return isSetAccess();
      case OrmPackage.BASIC_MAP__FETCH:
        return isSetFetch();
      case OrmPackage.BASIC_MAP__NAME:
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
    result.append(" (keyConverter: "); //$NON-NLS-1$
    result.append(keyConverter);
    result.append(", valueConverter: "); //$NON-NLS-1$
    result.append(valueConverter);
    result.append(", group: "); //$NON-NLS-1$
    result.append(group);
    result.append(", joinFetch: "); //$NON-NLS-1$
    if (joinFetchESet) result.append(joinFetch); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", fetch: "); //$NON-NLS-1$
    if (fetchESet) result.append(fetch); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} // BasicMapImpl
