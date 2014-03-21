/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicCollectionImpl.java,v 1.6 2011/10/25 13:25:23 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic Collection</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getValueColumn <em>Value Column
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getConvert <em>Convert</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getConverter <em>Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getTypeConverter <em>Type
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getObjectTypeConverter <em>Object
 * Type Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getStructConverter <em>Struct
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getCollectionTable <em>Collection
 * Table</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getJoinFetch <em>Join Fetch</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getAccessMethods <em>Access
 * Methods</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getAccess <em>Access</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getFetch <em>Fetch</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BasicCollectionImpl extends BaseOrmAnnotationImpl implements BasicCollection {
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
   * The default value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getConvert()
   * @generated
   * @ordered
   */
  protected static final String CONVERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getConvert()
   * @generated
   * @ordered
   */
  protected String convert = CONVERT_EDEFAULT;

  /**
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected Converter converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected TypeConverter typeConverter;

  /**
   * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getObjectTypeConverter()
   * @generated
   * @ordered
   */
  protected ObjectTypeConverter objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected StructConverter structConverter;

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
  protected BasicCollectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getBasicCollection();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__VALUE_COLUMN, oldValueColumn, newValueColumn);
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
        msgs = ((InternalEObject)valueColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__VALUE_COLUMN, null, msgs);
      if (newValueColumn != null)
        msgs = ((InternalEObject)newValueColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__VALUE_COLUMN, null, msgs);
      msgs = basicSetValueColumn(newValueColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__VALUE_COLUMN, newValueColumn, newValueColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getConvert() {
    return convert;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConvert(String newConvert) {
    String oldConvert = convert;
    convert = newConvert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__CONVERT, oldConvert, convert));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Converter getConverter() {
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConverter(Converter newConverter, NotificationChain msgs) {
    Converter oldConverter = converter;
    converter = newConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__CONVERTER, oldConverter, newConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConverter(Converter newConverter) {
    if (newConverter != converter) {
      NotificationChain msgs = null;
      if (converter != null)
        msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__CONVERTER, null, msgs);
      if (newConverter != null)
        msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__CONVERTER, null, msgs);
      msgs = basicSetConverter(newConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__CONVERTER, newConverter, newConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypeConverter getTypeConverter() {
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeConverter(TypeConverter newTypeConverter, NotificationChain msgs) {
    TypeConverter oldTypeConverter = typeConverter;
    typeConverter = newTypeConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER, oldTypeConverter, newTypeConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTypeConverter(TypeConverter newTypeConverter) {
    if (newTypeConverter != typeConverter) {
      NotificationChain msgs = null;
      if (typeConverter != null)
        msgs = ((InternalEObject)typeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER, null, msgs);
      if (newTypeConverter != null)
        msgs = ((InternalEObject)newTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER, null, msgs);
      msgs = basicSetTypeConverter(newTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER, newTypeConverter, newTypeConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ObjectTypeConverter getObjectTypeConverter() {
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectTypeConverter(ObjectTypeConverter newObjectTypeConverter,
      NotificationChain msgs) {
    ObjectTypeConverter oldObjectTypeConverter = objectTypeConverter;
    objectTypeConverter = newObjectTypeConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER, oldObjectTypeConverter, newObjectTypeConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setObjectTypeConverter(ObjectTypeConverter newObjectTypeConverter) {
    if (newObjectTypeConverter != objectTypeConverter) {
      NotificationChain msgs = null;
      if (objectTypeConverter != null)
        msgs = ((InternalEObject)objectTypeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER, null, msgs);
      if (newObjectTypeConverter != null)
        msgs = ((InternalEObject)newObjectTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER, null, msgs);
      msgs = basicSetObjectTypeConverter(newObjectTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER, newObjectTypeConverter, newObjectTypeConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StructConverter getStructConverter() {
    return structConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructConverter(StructConverter newStructConverter, NotificationChain msgs) {
    StructConverter oldStructConverter = structConverter;
    structConverter = newStructConverter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER, oldStructConverter, newStructConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStructConverter(StructConverter newStructConverter) {
    if (newStructConverter != structConverter) {
      NotificationChain msgs = null;
      if (structConverter != null)
        msgs = ((InternalEObject)structConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER, null, msgs);
      if (newStructConverter != null)
        msgs = ((InternalEObject)newStructConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER, null, msgs);
      msgs = basicSetStructConverter(newStructConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER, newStructConverter, newStructConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
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
        msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE, null, msgs);
      if (newCollectionTable != null)
        msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE, null, msgs);
      msgs = basicSetCollectionTable(newCollectionTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__JOIN_FETCH, oldJoinFetch, joinFetch, !oldJoinFetchESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC_COLLECTION__JOIN_FETCH, oldJoinFetch, JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__BATCH_FETCH, oldBatchFetch, newBatchFetch);
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
        msgs = ((InternalEObject)batchFetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__BATCH_FETCH, null, msgs);
      if (newBatchFetch != null)
        msgs = ((InternalEObject)newBatchFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__BATCH_FETCH, null, msgs);
      msgs = basicSetBatchFetch(newBatchFetch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__BATCH_FETCH, newBatchFetch, newBatchFetch));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.BASIC_COLLECTION__PROPERTY);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__ACCESS_METHODS, newAccessMethods, newAccessMethods));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__NONCACHEABLE, oldNoncacheable, newNoncacheable);
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
        msgs = ((InternalEObject)noncacheable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__NONCACHEABLE, null, msgs);
      if (newNoncacheable != null)
        msgs = ((InternalEObject)newNoncacheable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC_COLLECTION__NONCACHEABLE, null, msgs);
      msgs = basicSetNoncacheable(newNoncacheable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__NONCACHEABLE, newNoncacheable, newNoncacheable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC_COLLECTION__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__FETCH, oldFetch, fetch, !oldFetchESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC_COLLECTION__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC_COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.BASIC_COLLECTION__VALUE_COLUMN:
        return basicSetValueColumn(null, msgs);
      case OrmPackage.BASIC_COLLECTION__CONVERTER:
        return basicSetConverter(null, msgs);
      case OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER:
        return basicSetTypeConverter(null, msgs);
      case OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER:
        return basicSetObjectTypeConverter(null, msgs);
      case OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER:
        return basicSetStructConverter(null, msgs);
      case OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE:
        return basicSetCollectionTable(null, msgs);
      case OrmPackage.BASIC_COLLECTION__BATCH_FETCH:
        return basicSetBatchFetch(null, msgs);
      case OrmPackage.BASIC_COLLECTION__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC_COLLECTION__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.BASIC_COLLECTION__NONCACHEABLE:
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
      case OrmPackage.BASIC_COLLECTION__VALUE_COLUMN:
        return getValueColumn();
      case OrmPackage.BASIC_COLLECTION__CONVERT:
        return getConvert();
      case OrmPackage.BASIC_COLLECTION__CONVERTER:
        return getConverter();
      case OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE:
        return getCollectionTable();
      case OrmPackage.BASIC_COLLECTION__JOIN_FETCH:
        return getJoinFetch();
      case OrmPackage.BASIC_COLLECTION__BATCH_FETCH:
        return getBatchFetch();
      case OrmPackage.BASIC_COLLECTION__PROPERTY:
        return getProperty();
      case OrmPackage.BASIC_COLLECTION__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.BASIC_COLLECTION__NONCACHEABLE:
        return getNoncacheable();
      case OrmPackage.BASIC_COLLECTION__ACCESS:
        return getAccess();
      case OrmPackage.BASIC_COLLECTION__FETCH:
        return getFetch();
      case OrmPackage.BASIC_COLLECTION__NAME:
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
      case OrmPackage.BASIC_COLLECTION__VALUE_COLUMN:
        setValueColumn((Column)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__CONVERT:
        setConvert((String)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__CONVERTER:
        setConverter((Converter)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER:
        setStructConverter((StructConverter)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE:
        setCollectionTable((EclipselinkCollectionTable)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__JOIN_FETCH:
        setJoinFetch((JoinFetchType)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__BATCH_FETCH:
        setBatchFetch((BatchFetch)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__NONCACHEABLE:
        setNoncacheable((EmptyType)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__FETCH:
        setFetch((FetchType)newValue);
        return;
      case OrmPackage.BASIC_COLLECTION__NAME:
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
      case OrmPackage.BASIC_COLLECTION__VALUE_COLUMN:
        setValueColumn((Column)null);
        return;
      case OrmPackage.BASIC_COLLECTION__CONVERT:
        setConvert(CONVERT_EDEFAULT);
        return;
      case OrmPackage.BASIC_COLLECTION__CONVERTER:
        setConverter((Converter)null);
        return;
      case OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)null);
        return;
      case OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)null);
        return;
      case OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER:
        setStructConverter((StructConverter)null);
        return;
      case OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE:
        setCollectionTable((EclipselinkCollectionTable)null);
        return;
      case OrmPackage.BASIC_COLLECTION__JOIN_FETCH:
        unsetJoinFetch();
        return;
      case OrmPackage.BASIC_COLLECTION__BATCH_FETCH:
        setBatchFetch((BatchFetch)null);
        return;
      case OrmPackage.BASIC_COLLECTION__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.BASIC_COLLECTION__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.BASIC_COLLECTION__NONCACHEABLE:
        setNoncacheable((EmptyType)null);
        return;
      case OrmPackage.BASIC_COLLECTION__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.BASIC_COLLECTION__FETCH:
        unsetFetch();
        return;
      case OrmPackage.BASIC_COLLECTION__NAME:
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
      case OrmPackage.BASIC_COLLECTION__VALUE_COLUMN:
        return valueColumn != null;
      case OrmPackage.BASIC_COLLECTION__CONVERT:
        return CONVERT_EDEFAULT == null ? convert != null : !CONVERT_EDEFAULT.equals(convert);
      case OrmPackage.BASIC_COLLECTION__CONVERTER:
        return converter != null;
      case OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER:
        return typeConverter != null;
      case OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER:
        return objectTypeConverter != null;
      case OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER:
        return structConverter != null;
      case OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE:
        return collectionTable != null;
      case OrmPackage.BASIC_COLLECTION__JOIN_FETCH:
        return isSetJoinFetch();
      case OrmPackage.BASIC_COLLECTION__BATCH_FETCH:
        return batchFetch != null;
      case OrmPackage.BASIC_COLLECTION__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.BASIC_COLLECTION__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.BASIC_COLLECTION__NONCACHEABLE:
        return noncacheable != null;
      case OrmPackage.BASIC_COLLECTION__ACCESS:
        return isSetAccess();
      case OrmPackage.BASIC_COLLECTION__FETCH:
        return isSetFetch();
      case OrmPackage.BASIC_COLLECTION__NAME:
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
    result.append(" (convert: "); //$NON-NLS-1$
    result.append(convert);
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

} // BasicCollectionImpl
