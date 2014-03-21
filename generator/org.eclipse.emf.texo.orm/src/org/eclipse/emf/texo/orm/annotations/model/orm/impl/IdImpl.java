/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdImpl.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue;
import org.eclipse.emf.texo.orm.annotations.model.orm.Id;
import org.eclipse.emf.texo.orm.annotations.model.orm.Index;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Id</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getGeneratedValue <em>Generated Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdImpl extends BaseOrmAnnotationImpl implements Id {
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected IdImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getId();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__COLUMN, oldColumn, newColumn);
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
        msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__COLUMN, null, msgs);
      if (newColumn != null)
        msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__COLUMN, null, msgs);
      msgs = basicSetColumn(newColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__COLUMN, newColumn, newColumn));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Index getIndex() {
    return index;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs) {
    Index oldIndex = index;
    index = newIndex;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIndex(Index newIndex) {
    if (newIndex != index) {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__INDEX, newIndex, newIndex));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__GENERATED_VALUE, oldGeneratedValue, newGeneratedValue);
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
        msgs = ((InternalEObject)generatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__GENERATED_VALUE, null, msgs);
      if (newGeneratedValue != null)
        msgs = ((InternalEObject)newGeneratedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__GENERATED_VALUE, null, msgs);
      msgs = basicSetGeneratedValue(newGeneratedValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__GENERATED_VALUE, newGeneratedValue, newGeneratedValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__TEMPORAL, oldTemporal, temporal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__ENUMERATED, oldEnumerated, enumerated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__CONVERT, oldConvert, convert));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__CONVERTER, oldConverter, newConverter);
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
        msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__CONVERTER, null, msgs);
      if (newConverter != null)
        msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__CONVERTER, null, msgs);
      msgs = basicSetConverter(newConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__CONVERTER, newConverter, newConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__TYPE_CONVERTER, oldTypeConverter, newTypeConverter);
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
        msgs = ((InternalEObject)typeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__TYPE_CONVERTER, null, msgs);
      if (newTypeConverter != null)
        msgs = ((InternalEObject)newTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__TYPE_CONVERTER, null, msgs);
      msgs = basicSetTypeConverter(newTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__TYPE_CONVERTER, newTypeConverter, newTypeConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__OBJECT_TYPE_CONVERTER, oldObjectTypeConverter, newObjectTypeConverter);
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
        msgs = ((InternalEObject)objectTypeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__OBJECT_TYPE_CONVERTER, null, msgs);
      if (newObjectTypeConverter != null)
        msgs = ((InternalEObject)newObjectTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__OBJECT_TYPE_CONVERTER, null, msgs);
      msgs = basicSetObjectTypeConverter(newObjectTypeConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__OBJECT_TYPE_CONVERTER, newObjectTypeConverter, newObjectTypeConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__STRUCT_CONVERTER, oldStructConverter, newStructConverter);
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
        msgs = ((InternalEObject)structConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__STRUCT_CONVERTER, null, msgs);
      if (newStructConverter != null)
        msgs = ((InternalEObject)newStructConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__STRUCT_CONVERTER, null, msgs);
      msgs = basicSetStructConverter(newStructConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__STRUCT_CONVERTER, newStructConverter, newStructConverter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
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
        msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__TABLE_GENERATOR, null, msgs);
      if (newTableGenerator != null)
        msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__TABLE_GENERATOR, null, msgs);
      msgs = basicSetTableGenerator(newTableGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
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
        msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__SEQUENCE_GENERATOR, null, msgs);
      if (newSequenceGenerator != null)
        msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__SEQUENCE_GENERATOR, null, msgs);
      msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.ID__PROPERTY);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ID__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ID__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__ACCESS_METHODS, newAccessMethods, newAccessMethods));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ID__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__MUTABLE, oldMutable, mutable, !oldMutableESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ID__MUTABLE, oldMutable, MUTABLE_EDEFAULT, oldMutableESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ID__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.ID__COLUMN:
        return basicSetColumn(null, msgs);
      case OrmPackage.ID__INDEX:
        return basicSetIndex(null, msgs);
      case OrmPackage.ID__GENERATED_VALUE:
        return basicSetGeneratedValue(null, msgs);
      case OrmPackage.ID__CONVERTER:
        return basicSetConverter(null, msgs);
      case OrmPackage.ID__TYPE_CONVERTER:
        return basicSetTypeConverter(null, msgs);
      case OrmPackage.ID__OBJECT_TYPE_CONVERTER:
        return basicSetObjectTypeConverter(null, msgs);
      case OrmPackage.ID__STRUCT_CONVERTER:
        return basicSetStructConverter(null, msgs);
      case OrmPackage.ID__TABLE_GENERATOR:
        return basicSetTableGenerator(null, msgs);
      case OrmPackage.ID__SEQUENCE_GENERATOR:
        return basicSetSequenceGenerator(null, msgs);
      case OrmPackage.ID__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.ID__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
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
      case OrmPackage.ID__COLUMN:
        return getColumn();
      case OrmPackage.ID__INDEX:
        return getIndex();
      case OrmPackage.ID__GENERATED_VALUE:
        return getGeneratedValue();
      case OrmPackage.ID__TEMPORAL:
        return getTemporal();
      case OrmPackage.ID__ENUMERATED:
        return getEnumerated();
      case OrmPackage.ID__CONVERT:
        return getConvert();
      case OrmPackage.ID__CONVERTER:
        return getConverter();
      case OrmPackage.ID__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.ID__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.ID__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.ID__TABLE_GENERATOR:
        return getTableGenerator();
      case OrmPackage.ID__SEQUENCE_GENERATOR:
        return getSequenceGenerator();
      case OrmPackage.ID__PROPERTY:
        return getProperty();
      case OrmPackage.ID__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.ID__ACCESS:
        return getAccess();
      case OrmPackage.ID__ATTRIBUTE_TYPE:
        return getAttributeType();
      case OrmPackage.ID__MUTABLE:
        return isMutable();
      case OrmPackage.ID__NAME:
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
      case OrmPackage.ID__COLUMN:
        setColumn((Column)newValue);
        return;
      case OrmPackage.ID__INDEX:
        setIndex((Index)newValue);
        return;
      case OrmPackage.ID__GENERATED_VALUE:
        setGeneratedValue((GeneratedValue)newValue);
        return;
      case OrmPackage.ID__TEMPORAL:
        setTemporal((TemporalType)newValue);
        return;
      case OrmPackage.ID__ENUMERATED:
        setEnumerated((EnumType)newValue);
        return;
      case OrmPackage.ID__CONVERT:
        setConvert((String)newValue);
        return;
      case OrmPackage.ID__CONVERTER:
        setConverter((Converter)newValue);
        return;
      case OrmPackage.ID__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)newValue);
        return;
      case OrmPackage.ID__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)newValue);
        return;
      case OrmPackage.ID__STRUCT_CONVERTER:
        setStructConverter((StructConverter)newValue);
        return;
      case OrmPackage.ID__TABLE_GENERATOR:
        setTableGenerator((TableGenerator)newValue);
        return;
      case OrmPackage.ID__SEQUENCE_GENERATOR:
        setSequenceGenerator((SequenceGenerator)newValue);
        return;
      case OrmPackage.ID__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.ID__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.ID__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.ID__ATTRIBUTE_TYPE:
        setAttributeType((String)newValue);
        return;
      case OrmPackage.ID__MUTABLE:
        setMutable((Boolean)newValue);
        return;
      case OrmPackage.ID__NAME:
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
      case OrmPackage.ID__COLUMN:
        setColumn((Column)null);
        return;
      case OrmPackage.ID__INDEX:
        setIndex((Index)null);
        return;
      case OrmPackage.ID__GENERATED_VALUE:
        setGeneratedValue((GeneratedValue)null);
        return;
      case OrmPackage.ID__TEMPORAL:
        setTemporal(TEMPORAL_EDEFAULT);
        return;
      case OrmPackage.ID__ENUMERATED:
        setEnumerated(ENUMERATED_EDEFAULT);
        return;
      case OrmPackage.ID__CONVERT:
        setConvert(CONVERT_EDEFAULT);
        return;
      case OrmPackage.ID__CONVERTER:
        setConverter((Converter)null);
        return;
      case OrmPackage.ID__TYPE_CONVERTER:
        setTypeConverter((TypeConverter)null);
        return;
      case OrmPackage.ID__OBJECT_TYPE_CONVERTER:
        setObjectTypeConverter((ObjectTypeConverter)null);
        return;
      case OrmPackage.ID__STRUCT_CONVERTER:
        setStructConverter((StructConverter)null);
        return;
      case OrmPackage.ID__TABLE_GENERATOR:
        setTableGenerator((TableGenerator)null);
        return;
      case OrmPackage.ID__SEQUENCE_GENERATOR:
        setSequenceGenerator((SequenceGenerator)null);
        return;
      case OrmPackage.ID__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.ID__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.ID__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.ID__ATTRIBUTE_TYPE:
        setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
        return;
      case OrmPackage.ID__MUTABLE:
        unsetMutable();
        return;
      case OrmPackage.ID__NAME:
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
      case OrmPackage.ID__COLUMN:
        return column != null;
      case OrmPackage.ID__INDEX:
        return index != null;
      case OrmPackage.ID__GENERATED_VALUE:
        return generatedValue != null;
      case OrmPackage.ID__TEMPORAL:
        return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
      case OrmPackage.ID__ENUMERATED:
        return ENUMERATED_EDEFAULT == null ? enumerated != null : !ENUMERATED_EDEFAULT.equals(enumerated);
      case OrmPackage.ID__CONVERT:
        return CONVERT_EDEFAULT == null ? convert != null : !CONVERT_EDEFAULT.equals(convert);
      case OrmPackage.ID__CONVERTER:
        return converter != null;
      case OrmPackage.ID__TYPE_CONVERTER:
        return typeConverter != null;
      case OrmPackage.ID__OBJECT_TYPE_CONVERTER:
        return objectTypeConverter != null;
      case OrmPackage.ID__STRUCT_CONVERTER:
        return structConverter != null;
      case OrmPackage.ID__TABLE_GENERATOR:
        return tableGenerator != null;
      case OrmPackage.ID__SEQUENCE_GENERATOR:
        return sequenceGenerator != null;
      case OrmPackage.ID__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.ID__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.ID__ACCESS:
        return isSetAccess();
      case OrmPackage.ID__ATTRIBUTE_TYPE:
        return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
      case OrmPackage.ID__MUTABLE:
        return isSetMutable();
      case OrmPackage.ID__NAME:
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
    result.append(", mutable: "); //$NON-NLS-1$
    if (mutableESet) result.append(mutable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    // add just any feature to force all eattributes to be ignored
    features.add(OrmPackage.eINSTANCE.getManyToOne_Cascade());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }

} // IdImpl
