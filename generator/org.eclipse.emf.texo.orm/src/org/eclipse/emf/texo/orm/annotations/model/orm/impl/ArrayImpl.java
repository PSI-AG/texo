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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Array;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Lob;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getLob <em>Lob</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ArrayImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayImpl extends BaseOrmAnnotationImpl implements Array {
	/**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
	protected Column column;

	/**
   * The default value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
	protected static final TemporalType TEMPORAL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
	protected TemporalType temporal = TEMPORAL_EDEFAULT;

	/**
   * The default value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
	protected static final EnumType ENUMERATED_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
	protected EnumType enumerated = ENUMERATED_EDEFAULT;

	/**
   * The cached value of the '{@link #getLob() <em>Lob</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLob()
   * @generated
   * @ordered
   */
	protected Lob lob;

	/**
   * The default value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConvert()
   * @generated
   * @ordered
   */
	protected static final String CONVERT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConvert()
   * @generated
   * @ordered
   */
	protected String convert = CONVERT_EDEFAULT;

	/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
	protected EList<Property> property;

	/**
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
	protected AccessMethods accessMethods;

	/**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
	protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

	/**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
	protected AccessType access = ACCESS_EDEFAULT;

	/**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean accessESet;

	/**
   * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
	protected static final String ATTRIBUTE_TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
	protected String attributeType = ATTRIBUTE_TYPE_EDEFAULT;

	/**
   * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDatabaseType()
   * @generated
   * @ordered
   */
	protected static final String DATABASE_TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDatabaseType()
   * @generated
   * @ordered
   */
	protected String databaseType = DATABASE_TYPE_EDEFAULT;

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
   * The default value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetClass()
   * @generated
   * @ordered
   */
	protected static final String TARGET_CLASS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetClass()
   * @generated
   * @ordered
   */
	protected String targetClass = TARGET_CLASS_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ArrayImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getArray();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Column getColumn() {
    return column;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
    Column oldColumn = column;
    column = newColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__COLUMN, oldColumn, newColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColumn(Column newColumn) {
    if (newColumn != column) {
      NotificationChain msgs = null;
      if (column != null)
        msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ARRAY__COLUMN, null, msgs);
      if (newColumn != null)
        msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ARRAY__COLUMN, null, msgs);
      msgs = basicSetColumn(newColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__COLUMN, newColumn, newColumn));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TemporalType getTemporal() {
    return temporal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTemporal(TemporalType newTemporal) {
    TemporalType oldTemporal = temporal;
    temporal = newTemporal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__TEMPORAL, oldTemporal, temporal));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EnumType getEnumerated() {
    return enumerated;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEnumerated(EnumType newEnumerated) {
    EnumType oldEnumerated = enumerated;
    enumerated = newEnumerated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__ENUMERATED, oldEnumerated, enumerated));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Lob getLob() {
    return lob;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLob(Lob newLob, NotificationChain msgs) {
    Lob oldLob = lob;
    lob = newLob;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__LOB, oldLob, newLob);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLob(Lob newLob) {
    if (newLob != lob) {
      NotificationChain msgs = null;
      if (lob != null)
        msgs = ((InternalEObject)lob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ARRAY__LOB, null, msgs);
      if (newLob != null)
        msgs = ((InternalEObject)newLob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ARRAY__LOB, null, msgs);
      msgs = basicSetLob(newLob, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__LOB, newLob, newLob));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getConvert() {
    return convert;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConvert(String newConvert) {
    String oldConvert = convert;
    convert = newConvert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__CONVERT, oldConvert, convert));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, OrmPackage.ARRAY__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Converter> getConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getArray_Converter());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TypeConverter> getTypeConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getArray_TypeConverter());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ObjectTypeConverter> getObjectTypeConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getArray_ObjectTypeConverter());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StructConverter> getStructConverter() {
    return getGroup().list(OrmPackage.eINSTANCE.getArray_StructConverter());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.ARRAY__PROPERTY);
    }
    return property;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AccessMethods getAccessMethods() {
    return accessMethods;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null)
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ARRAY__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ARRAY__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AccessType getAccess() {
    return access;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__ACCESS, oldAccess, access, !oldAccessESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ARRAY__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetAccess() {
    return accessESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAttributeType() {
    return attributeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAttributeType(String newAttributeType) {
    String oldAttributeType = attributeType;
    attributeType = newAttributeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDatabaseType() {
    return databaseType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDatabaseType(String newDatabaseType) {
    String oldDatabaseType = databaseType;
    databaseType = newDatabaseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__DATABASE_TYPE, oldDatabaseType, databaseType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTargetClass() {
    return targetClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargetClass(String newTargetClass) {
    String oldTargetClass = targetClass;
    targetClass = newTargetClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ARRAY__TARGET_CLASS, oldTargetClass, targetClass));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.ARRAY__COLUMN:
        return basicSetColumn(null, msgs);
      case OrmPackage.ARRAY__LOB:
        return basicSetLob(null, msgs);
      case OrmPackage.ARRAY__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case OrmPackage.ARRAY__CONVERTER:
        return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ARRAY__TYPE_CONVERTER:
        return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ARRAY__OBJECT_TYPE_CONVERTER:
        return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ARRAY__STRUCT_CONVERTER:
        return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.ARRAY__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.ARRAY__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
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
      case OrmPackage.ARRAY__COLUMN:
        return getColumn();
      case OrmPackage.ARRAY__TEMPORAL:
        return getTemporal();
      case OrmPackage.ARRAY__ENUMERATED:
        return getEnumerated();
      case OrmPackage.ARRAY__LOB:
        return getLob();
      case OrmPackage.ARRAY__CONVERT:
        return getConvert();
      case OrmPackage.ARRAY__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case OrmPackage.ARRAY__CONVERTER:
        return getConverter();
      case OrmPackage.ARRAY__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.ARRAY__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.ARRAY__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.ARRAY__PROPERTY:
        return getProperty();
      case OrmPackage.ARRAY__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.ARRAY__ACCESS:
        return getAccess();
      case OrmPackage.ARRAY__ATTRIBUTE_TYPE:
        return getAttributeType();
      case OrmPackage.ARRAY__DATABASE_TYPE:
        return getDatabaseType();
      case OrmPackage.ARRAY__NAME:
        return getName();
      case OrmPackage.ARRAY__TARGET_CLASS:
        return getTargetClass();
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
      case OrmPackage.ARRAY__COLUMN:
        setColumn((Column)newValue);
        return;
      case OrmPackage.ARRAY__TEMPORAL:
        setTemporal((TemporalType)newValue);
        return;
      case OrmPackage.ARRAY__ENUMERATED:
        setEnumerated((EnumType)newValue);
        return;
      case OrmPackage.ARRAY__LOB:
        setLob((Lob)newValue);
        return;
      case OrmPackage.ARRAY__CONVERT:
        setConvert((String)newValue);
        return;
      case OrmPackage.ARRAY__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case OrmPackage.ARRAY__CONVERTER:
        getConverter().clear();
        getConverter().addAll((Collection<? extends Converter>)newValue);
        return;
      case OrmPackage.ARRAY__TYPE_CONVERTER:
        getTypeConverter().clear();
        getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
        return;
      case OrmPackage.ARRAY__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
        return;
      case OrmPackage.ARRAY__STRUCT_CONVERTER:
        getStructConverter().clear();
        getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
        return;
      case OrmPackage.ARRAY__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.ARRAY__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.ARRAY__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.ARRAY__ATTRIBUTE_TYPE:
        setAttributeType((String)newValue);
        return;
      case OrmPackage.ARRAY__DATABASE_TYPE:
        setDatabaseType((String)newValue);
        return;
      case OrmPackage.ARRAY__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.ARRAY__TARGET_CLASS:
        setTargetClass((String)newValue);
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
      case OrmPackage.ARRAY__COLUMN:
        setColumn((Column)null);
        return;
      case OrmPackage.ARRAY__TEMPORAL:
        setTemporal(TEMPORAL_EDEFAULT);
        return;
      case OrmPackage.ARRAY__ENUMERATED:
        setEnumerated(ENUMERATED_EDEFAULT);
        return;
      case OrmPackage.ARRAY__LOB:
        setLob((Lob)null);
        return;
      case OrmPackage.ARRAY__CONVERT:
        setConvert(CONVERT_EDEFAULT);
        return;
      case OrmPackage.ARRAY__GROUP:
        getGroup().clear();
        return;
      case OrmPackage.ARRAY__CONVERTER:
        getConverter().clear();
        return;
      case OrmPackage.ARRAY__TYPE_CONVERTER:
        getTypeConverter().clear();
        return;
      case OrmPackage.ARRAY__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        return;
      case OrmPackage.ARRAY__STRUCT_CONVERTER:
        getStructConverter().clear();
        return;
      case OrmPackage.ARRAY__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.ARRAY__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.ARRAY__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.ARRAY__ATTRIBUTE_TYPE:
        setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
        return;
      case OrmPackage.ARRAY__DATABASE_TYPE:
        setDatabaseType(DATABASE_TYPE_EDEFAULT);
        return;
      case OrmPackage.ARRAY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.ARRAY__TARGET_CLASS:
        setTargetClass(TARGET_CLASS_EDEFAULT);
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
      case OrmPackage.ARRAY__COLUMN:
        return column != null;
      case OrmPackage.ARRAY__TEMPORAL:
        return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
      case OrmPackage.ARRAY__ENUMERATED:
        return ENUMERATED_EDEFAULT == null ? enumerated != null : !ENUMERATED_EDEFAULT.equals(enumerated);
      case OrmPackage.ARRAY__LOB:
        return lob != null;
      case OrmPackage.ARRAY__CONVERT:
        return CONVERT_EDEFAULT == null ? convert != null : !CONVERT_EDEFAULT.equals(convert);
      case OrmPackage.ARRAY__GROUP:
        return group != null && !group.isEmpty();
      case OrmPackage.ARRAY__CONVERTER:
        return !getConverter().isEmpty();
      case OrmPackage.ARRAY__TYPE_CONVERTER:
        return !getTypeConverter().isEmpty();
      case OrmPackage.ARRAY__OBJECT_TYPE_CONVERTER:
        return !getObjectTypeConverter().isEmpty();
      case OrmPackage.ARRAY__STRUCT_CONVERTER:
        return !getStructConverter().isEmpty();
      case OrmPackage.ARRAY__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.ARRAY__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.ARRAY__ACCESS:
        return isSetAccess();
      case OrmPackage.ARRAY__ATTRIBUTE_TYPE:
        return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
      case OrmPackage.ARRAY__DATABASE_TYPE:
        return DATABASE_TYPE_EDEFAULT == null ? databaseType != null : !DATABASE_TYPE_EDEFAULT.equals(databaseType);
      case OrmPackage.ARRAY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.ARRAY__TARGET_CLASS:
        return TARGET_CLASS_EDEFAULT == null ? targetClass != null : !TARGET_CLASS_EDEFAULT.equals(targetClass);
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
    result.append(" (temporal: "); //$NON-NLS-1$
    result.append(temporal);
    result.append(", enumerated: "); //$NON-NLS-1$
    result.append(enumerated);
    result.append(", convert: "); //$NON-NLS-1$
    result.append(convert);
    result.append(", group: "); //$NON-NLS-1$
    result.append(group);
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", attributeType: "); //$NON-NLS-1$
    result.append(attributeType);
    result.append(", databaseType: "); //$NON-NLS-1$
    result.append(databaseType);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", targetClass: "); //$NON-NLS-1$
    result.append(targetClass);
    result.append(')');
    return result.toString();
  }

} //ArrayImpl
