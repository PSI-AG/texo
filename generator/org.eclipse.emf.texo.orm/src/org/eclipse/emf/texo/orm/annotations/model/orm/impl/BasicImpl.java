/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicImpl.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue;
import org.eclipse.emf.texo.orm.annotations.model.orm.Index;
import org.eclipse.emf.texo.orm.annotations.model.orm.Lob;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReturnInsert;
import org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getGeneratedValue <em>Generated Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getLob <em>Lob</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getReturnInsert <em>Return Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getReturnUpdate <em>Return Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicImpl extends BaseOrmAnnotationImpl implements Basic {
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected Column column;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Index index;

  /**
   * The cached value of the '{@link #getGeneratedValue() <em>Generated Value</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getGeneratedValue()
   * @generated
   * @ordered
   */
  protected GeneratedValue generatedValue;

  /**
   * The cached value of the '{@link #getLob() <em>Lob</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLob()
   * @generated
   * @ordered
   */
  protected Lob lob;

  /**
   * The default value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
  protected static final TemporalType TEMPORAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
  protected TemporalType temporal = TEMPORAL_EDEFAULT;

  /**
   * The default value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected static final EnumType ENUMERATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected EnumType enumerated = ENUMERATED_EDEFAULT;

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
   * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTableGenerator()
   * @generated
   * @ordered
   */
  protected TableGenerator tableGenerator;

  /**
   * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSequenceGenerator()
   * @generated
   * @ordered
   */
  protected SequenceGenerator sequenceGenerator;

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
   * The cached value of the '{@link #getReturnInsert() <em>Return Insert</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getReturnInsert()
   * @generated
   * @ordered
   */
  protected ReturnInsert returnInsert;

  /**
   * The cached value of the '{@link #getReturnUpdate() <em>Return Update</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getReturnUpdate()
   * @generated
   * @ordered
   */
  protected EmptyType returnUpdate;

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
   * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isMutable()
   * @generated
   * @ordered
   */
  protected static final boolean MUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isMutable()
   * @generated
   * @ordered
   */
  protected boolean mutable = MUTABLE_EDEFAULT;

  /**
   * This is true if the Mutable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean mutableESet;

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
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * This is true if the Optional attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean optionalESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected BasicImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getBasic();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column getColumn() {
    return column;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
    Column oldColumn = column;
    column = newColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__COLUMN, oldColumn, newColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(Column newColumn) {
    if (newColumn != column) {
      NotificationChain msgs = null;
      if (column != null)
        msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__COLUMN, null, msgs);
      if (newColumn != null)
        msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__COLUMN, null, msgs);
      msgs = basicSetColumn(newColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__COLUMN, newColumn, newColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Index getIndex() {
    return index;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs) {
    Index oldIndex = index;
    index = newIndex;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Index newIndex) {
    if (newIndex != index) {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__INDEX, newIndex, newIndex));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GeneratedValue getGeneratedValue() {
    return generatedValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeneratedValue(GeneratedValue newGeneratedValue, NotificationChain msgs) {
    GeneratedValue oldGeneratedValue = generatedValue;
    generatedValue = newGeneratedValue;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__GENERATED_VALUE, oldGeneratedValue, newGeneratedValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setGeneratedValue(GeneratedValue newGeneratedValue) {
    if (newGeneratedValue != generatedValue) {
      NotificationChain msgs = null;
      if (generatedValue != null)
        msgs = ((InternalEObject)generatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__GENERATED_VALUE, null, msgs);
      if (newGeneratedValue != null)
        msgs = ((InternalEObject)newGeneratedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__GENERATED_VALUE, null, msgs);
      msgs = basicSetGeneratedValue(newGeneratedValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__GENERATED_VALUE, newGeneratedValue, newGeneratedValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Lob getLob() {
    return lob;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLob(Lob newLob, NotificationChain msgs) {
    Lob oldLob = lob;
    lob = newLob;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__LOB, oldLob, newLob);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLob(Lob newLob) {
    if (newLob != lob) {
      NotificationChain msgs = null;
      if (lob != null)
        msgs = ((InternalEObject)lob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__LOB, null, msgs);
      if (newLob != null)
        msgs = ((InternalEObject)newLob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__LOB, null, msgs);
      msgs = basicSetLob(newLob, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__LOB, newLob, newLob));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType getTemporal() {
    return temporal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTemporal(TemporalType newTemporal) {
    TemporalType oldTemporal = temporal;
    temporal = newTemporal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__TEMPORAL, oldTemporal, temporal));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType getEnumerated() {
    return enumerated;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnumerated(EnumType newEnumerated) {
    EnumType oldEnumerated = enumerated;
    enumerated = newEnumerated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__ENUMERATED, oldEnumerated, enumerated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__CONVERT, oldConvert, convert));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__CONVERTER, oldConverter, newConverter);
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
        msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__CONVERTER, null, msgs);
      if (newConverter != null)
        msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__CONVERTER, null, msgs);
      msgs = basicSetConverter(newConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__CONVERTER, newConverter, newConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__TYPE_CONVERTER, oldTypeConverter, newTypeConverter);
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
        msgs = ((InternalEObject)typeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__TYPE_CONVERTER, null, msgs);
      if (newTypeConverter != null)
        msgs = ((InternalEObject)newTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__TYPE_CONVERTER, null, msgs);
      msgs = basicSetTypeConverter(newTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__TYPE_CONVERTER, newTypeConverter, newTypeConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__OBJECT_TYPE_CONVERTER, oldObjectTypeConverter, newObjectTypeConverter);
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
        msgs = ((InternalEObject)objectTypeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__OBJECT_TYPE_CONVERTER, null, msgs);
      if (newObjectTypeConverter != null)
        msgs = ((InternalEObject)newObjectTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__OBJECT_TYPE_CONVERTER, null, msgs);
      msgs = basicSetObjectTypeConverter(newObjectTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__OBJECT_TYPE_CONVERTER, newObjectTypeConverter, newObjectTypeConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__STRUCT_CONVERTER, oldStructConverter, newStructConverter);
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
        msgs = ((InternalEObject)structConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__STRUCT_CONVERTER, null, msgs);
      if (newStructConverter != null)
        msgs = ((InternalEObject)newStructConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__STRUCT_CONVERTER, null, msgs);
      msgs = basicSetStructConverter(newStructConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__STRUCT_CONVERTER, newStructConverter, newStructConverter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TableGenerator getTableGenerator() {
    return tableGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTableGenerator(TableGenerator newTableGenerator, NotificationChain msgs) {
    TableGenerator oldTableGenerator = tableGenerator;
    tableGenerator = newTableGenerator;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTableGenerator(TableGenerator newTableGenerator) {
    if (newTableGenerator != tableGenerator) {
      NotificationChain msgs = null;
      if (tableGenerator != null)
        msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__TABLE_GENERATOR, null, msgs);
      if (newTableGenerator != null)
        msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__TABLE_GENERATOR, null, msgs);
      msgs = basicSetTableGenerator(newTableGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SequenceGenerator getSequenceGenerator() {
    return sequenceGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenceGenerator(SequenceGenerator newSequenceGenerator, NotificationChain msgs) {
    SequenceGenerator oldSequenceGenerator = sequenceGenerator;
    sequenceGenerator = newSequenceGenerator;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSequenceGenerator(SequenceGenerator newSequenceGenerator) {
    if (newSequenceGenerator != sequenceGenerator) {
      NotificationChain msgs = null;
      if (sequenceGenerator != null)
        msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__SEQUENCE_GENERATOR, null, msgs);
      if (newSequenceGenerator != null)
        msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__SEQUENCE_GENERATOR, null, msgs);
      msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.BASIC__PROPERTY);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReturnInsert getReturnInsert() {
    return returnInsert;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnInsert(ReturnInsert newReturnInsert, NotificationChain msgs) {
    ReturnInsert oldReturnInsert = returnInsert;
    returnInsert = newReturnInsert;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__RETURN_INSERT, oldReturnInsert, newReturnInsert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReturnInsert(ReturnInsert newReturnInsert) {
    if (newReturnInsert != returnInsert) {
      NotificationChain msgs = null;
      if (returnInsert != null)
        msgs = ((InternalEObject)returnInsert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__RETURN_INSERT, null, msgs);
      if (newReturnInsert != null)
        msgs = ((InternalEObject)newReturnInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__RETURN_INSERT, null, msgs);
      msgs = basicSetReturnInsert(newReturnInsert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__RETURN_INSERT, newReturnInsert, newReturnInsert));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType getReturnUpdate() {
    return returnUpdate;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnUpdate(EmptyType newReturnUpdate, NotificationChain msgs) {
    EmptyType oldReturnUpdate = returnUpdate;
    returnUpdate = newReturnUpdate;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__RETURN_UPDATE, oldReturnUpdate, newReturnUpdate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReturnUpdate(EmptyType newReturnUpdate) {
    if (newReturnUpdate != returnUpdate) {
      NotificationChain msgs = null;
      if (returnUpdate != null)
        msgs = ((InternalEObject)returnUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__RETURN_UPDATE, null, msgs);
      if (newReturnUpdate != null)
        msgs = ((InternalEObject)newReturnUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.BASIC__RETURN_UPDATE, null, msgs);
      msgs = basicSetReturnUpdate(newReturnUpdate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__RETURN_UPDATE, newReturnUpdate, newReturnUpdate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
  public String getAttributeType() {
    return attributeType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeType(String newAttributeType) {
    String oldAttributeType = attributeType;
    attributeType = newAttributeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__FETCH, oldFetch, fetch, !oldFetchESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
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
  public boolean isMutable() {
    return mutable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMutable(boolean newMutable) {
    boolean oldMutable = mutable;
    mutable = newMutable;
    boolean oldMutableESet = mutableESet;
    mutableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__MUTABLE, oldMutable, mutable, !oldMutableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMutable() {
    boolean oldMutable = mutable;
    boolean oldMutableESet = mutableESet;
    mutable = MUTABLE_EDEFAULT;
    mutableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC__MUTABLE, oldMutable, MUTABLE_EDEFAULT, oldMutableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMutable() {
    return mutableESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional() {
    return optional;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional) {
    boolean oldOptional = optional;
    optional = newOptional;
    boolean oldOptionalESet = optionalESet;
    optionalESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.BASIC__OPTIONAL, oldOptional, optional, !oldOptionalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOptional() {
    boolean oldOptional = optional;
    boolean oldOptionalESet = optionalESet;
    optional = OPTIONAL_EDEFAULT;
    optionalESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.BASIC__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOptional() {
    return optionalESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.BASIC__COLUMN:
        return basicSetColumn(null, msgs);
      case OrmPackage.BASIC__INDEX:
        return basicSetIndex(null, msgs);
      case OrmPackage.BASIC__GENERATED_VALUE:
        return basicSetGeneratedValue(null, msgs);
      case OrmPackage.BASIC__LOB:
        return basicSetLob(null, msgs);
      case OrmPackage.BASIC__CONVERTER:
        return basicSetConverter(null, msgs);
      case OrmPackage.BASIC__TYPE_CONVERTER:
        return basicSetTypeConverter(null, msgs);
      case OrmPackage.BASIC__OBJECT_TYPE_CONVERTER:
        return basicSetObjectTypeConverter(null, msgs);
      case OrmPackage.BASIC__STRUCT_CONVERTER:
        return basicSetStructConverter(null, msgs);
      case OrmPackage.BASIC__TABLE_GENERATOR:
        return basicSetTableGenerator(null, msgs);
      case OrmPackage.BASIC__SEQUENCE_GENERATOR:
        return basicSetSequenceGenerator(null, msgs);
      case OrmPackage.BASIC__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.BASIC__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.BASIC__RETURN_INSERT:
        return basicSetReturnInsert(null, msgs);
      case OrmPackage.BASIC__RETURN_UPDATE:
        return basicSetReturnUpdate(null, msgs);
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
      case OrmPackage.BASIC__COLUMN:
        return getColumn();
      case OrmPackage.BASIC__INDEX:
        return getIndex();
      case OrmPackage.BASIC__GENERATED_VALUE:
        return getGeneratedValue();
      case OrmPackage.BASIC__LOB:
        return getLob();
      case OrmPackage.BASIC__TEMPORAL:
        return getTemporal();
      case OrmPackage.BASIC__ENUMERATED:
        return getEnumerated();
      case OrmPackage.BASIC__CONVERT:
        return getConvert();
      case OrmPackage.BASIC__CONVERTER:
        return getConverter();
      case OrmPackage.BASIC__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.BASIC__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.BASIC__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.BASIC__TABLE_GENERATOR:
        return getTableGenerator();
      case OrmPackage.BASIC__SEQUENCE_GENERATOR:
        return getSequenceGenerator();
      case OrmPackage.BASIC__PROPERTY:
        return getProperty();
      case OrmPackage.BASIC__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.BASIC__RETURN_INSERT:
        return getReturnInsert();
      case OrmPackage.BASIC__RETURN_UPDATE:
        return getReturnUpdate();
      case OrmPackage.BASIC__ACCESS:
        return getAccess();
      case OrmPackage.BASIC__ATTRIBUTE_TYPE:
        return getAttributeType();
      case OrmPackage.BASIC__FETCH:
        return getFetch();
      case OrmPackage.BASIC__MUTABLE:
        return isMutable();
      case OrmPackage.BASIC__NAME:
        return getName();
      case OrmPackage.BASIC__OPTIONAL:
        return isOptional();
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
      case OrmPackage.BASIC__COLUMN:
        setColumn((Column)newValue);
        return;
      case OrmPackage.BASIC__INDEX:
        setIndex((Index)newValue);
        return;
      case OrmPackage.BASIC__GENERATED_VALUE:
        setGeneratedValue((GeneratedValue)newValue);
        return;
      case OrmPackage.BASIC__LOB:
        setLob((Lob)newValue);
        return;
      case OrmPackage.BASIC__TEMPORAL:
        setTemporal((TemporalType)newValue);
        return;
      case OrmPackage.BASIC__ENUMERATED:
        setEnumerated((EnumType)newValue);
        return;
      case OrmPackage.BASIC__CONVERT:
        setConvert((String)newValue);
        return;
      case OrmPackage.BASIC__CONVERTER:
        setConverter((Converter)newValue);
        return;
      case OrmPackage.BASIC__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)newValue);
        return;
      case OrmPackage.BASIC__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)newValue);
        return;
      case OrmPackage.BASIC__STRUCT_CONVERTER:
        setStructConverter((StructConverter)newValue);
        return;
      case OrmPackage.BASIC__TABLE_GENERATOR:
        setTableGenerator((TableGenerator)newValue);
        return;
      case OrmPackage.BASIC__SEQUENCE_GENERATOR:
        setSequenceGenerator((SequenceGenerator)newValue);
        return;
      case OrmPackage.BASIC__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.BASIC__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.BASIC__RETURN_INSERT:
        setReturnInsert((ReturnInsert)newValue);
        return;
      case OrmPackage.BASIC__RETURN_UPDATE:
        setReturnUpdate((EmptyType)newValue);
        return;
      case OrmPackage.BASIC__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.BASIC__ATTRIBUTE_TYPE:
        setAttributeType((String)newValue);
        return;
      case OrmPackage.BASIC__FETCH:
        setFetch((FetchType)newValue);
        return;
      case OrmPackage.BASIC__MUTABLE:
        setMutable((Boolean)newValue);
        return;
      case OrmPackage.BASIC__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.BASIC__OPTIONAL:
        setOptional((Boolean)newValue);
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
      case OrmPackage.BASIC__COLUMN:
        setColumn((Column)null);
        return;
      case OrmPackage.BASIC__INDEX:
        setIndex((Index)null);
        return;
      case OrmPackage.BASIC__GENERATED_VALUE:
        setGeneratedValue((GeneratedValue)null);
        return;
      case OrmPackage.BASIC__LOB:
        setLob((Lob)null);
        return;
      case OrmPackage.BASIC__TEMPORAL:
        setTemporal(TEMPORAL_EDEFAULT);
        return;
      case OrmPackage.BASIC__ENUMERATED:
        setEnumerated(ENUMERATED_EDEFAULT);
        return;
      case OrmPackage.BASIC__CONVERT:
        setConvert(CONVERT_EDEFAULT);
        return;
      case OrmPackage.BASIC__CONVERTER:
        setConverter((Converter)null);
        return;
      case OrmPackage.BASIC__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)null);
        return;
      case OrmPackage.BASIC__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)null);
        return;
      case OrmPackage.BASIC__STRUCT_CONVERTER:
        setStructConverter((StructConverter)null);
        return;
      case OrmPackage.BASIC__TABLE_GENERATOR:
        setTableGenerator((TableGenerator)null);
        return;
      case OrmPackage.BASIC__SEQUENCE_GENERATOR:
        setSequenceGenerator((SequenceGenerator)null);
        return;
      case OrmPackage.BASIC__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.BASIC__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.BASIC__RETURN_INSERT:
        setReturnInsert((ReturnInsert)null);
        return;
      case OrmPackage.BASIC__RETURN_UPDATE:
        setReturnUpdate((EmptyType)null);
        return;
      case OrmPackage.BASIC__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.BASIC__ATTRIBUTE_TYPE:
        setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
        return;
      case OrmPackage.BASIC__FETCH:
        unsetFetch();
        return;
      case OrmPackage.BASIC__MUTABLE:
        unsetMutable();
        return;
      case OrmPackage.BASIC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.BASIC__OPTIONAL:
        unsetOptional();
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
      case OrmPackage.BASIC__COLUMN:
        return column != null;
      case OrmPackage.BASIC__INDEX:
        return index != null;
      case OrmPackage.BASIC__GENERATED_VALUE:
        return generatedValue != null;
      case OrmPackage.BASIC__LOB:
        return lob != null;
      case OrmPackage.BASIC__TEMPORAL:
        return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
      case OrmPackage.BASIC__ENUMERATED:
        return ENUMERATED_EDEFAULT == null ? enumerated != null : !ENUMERATED_EDEFAULT.equals(enumerated);
      case OrmPackage.BASIC__CONVERT:
        return CONVERT_EDEFAULT == null ? convert != null : !CONVERT_EDEFAULT.equals(convert);
      case OrmPackage.BASIC__CONVERTER:
        return converter != null;
      case OrmPackage.BASIC__TYPE_CONVERTER:
        return typeConverter != null;
      case OrmPackage.BASIC__OBJECT_TYPE_CONVERTER:
        return objectTypeConverter != null;
      case OrmPackage.BASIC__STRUCT_CONVERTER:
        return structConverter != null;
      case OrmPackage.BASIC__TABLE_GENERATOR:
        return tableGenerator != null;
      case OrmPackage.BASIC__SEQUENCE_GENERATOR:
        return sequenceGenerator != null;
      case OrmPackage.BASIC__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.BASIC__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.BASIC__RETURN_INSERT:
        return returnInsert != null;
      case OrmPackage.BASIC__RETURN_UPDATE:
        return returnUpdate != null;
      case OrmPackage.BASIC__ACCESS:
        return isSetAccess();
      case OrmPackage.BASIC__ATTRIBUTE_TYPE:
        return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
      case OrmPackage.BASIC__FETCH:
        return isSetFetch();
      case OrmPackage.BASIC__MUTABLE:
        return isSetMutable();
      case OrmPackage.BASIC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.BASIC__OPTIONAL:
        return isSetOptional();
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
    result.append(" (temporal: "); //$NON-NLS-1$
    result.append(temporal);
    result.append(", enumerated: "); //$NON-NLS-1$
    result.append(enumerated);
    result.append(", convert: "); //$NON-NLS-1$
    result.append(convert);
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", attributeType: "); //$NON-NLS-1$
    result.append(attributeType);
    result.append(", fetch: "); //$NON-NLS-1$
    if (fetchESet) result.append(fetch); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", mutable: "); //$NON-NLS-1$
    if (mutableESet) result.append(mutable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", optional: "); //$NON-NLS-1$
    if (optionalESet) result.append(optional); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getBasic_Fetch());
    features.add(OrmPackage.eINSTANCE.getBasic_Convert());
    features.add(OrmPackage.eINSTANCE.getBasic_Optional());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }
} // BasicImpl
