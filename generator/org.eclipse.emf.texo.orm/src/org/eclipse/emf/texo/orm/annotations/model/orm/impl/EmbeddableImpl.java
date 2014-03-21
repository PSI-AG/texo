/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddableImpl.java,v 1.7 2011/10/26 05:29:39 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking;
import org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Customizer;
import org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable;
import org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.Struct;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Embeddable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getCustomizer <em>Customizer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getChangeTracking <em>Change Tracking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getCopyPolicy <em>Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getCloneCopyPolicy <em>Clone Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getPlsqlRecord <em>Plsql Record</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getPlsqlTable <em>Plsql Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl#getParentClass <em>Parent Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddableImpl extends BaseOrmAnnotationImpl implements Embeddable {
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
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
	protected AccessMethods accessMethods;

		/**
   * The cached value of the '{@link #getCustomizer() <em>Customizer</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCustomizer()
   * @generated
   * @ordered
   */
  protected Customizer customizer;

  /**
   * The cached value of the '{@link #getChangeTracking() <em>Change Tracking</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getChangeTracking()
   * @generated
   * @ordered
   */
  protected ChangeTracking changeTracking;

  /**
   * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
	protected Struct struct;

		/**
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected EList<Converter> converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<TypeConverter> typeConverter;

  /**
   * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getObjectTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<ObjectTypeConverter> objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected EList<StructConverter> structConverter;

  /**
   * The cached value of the '{@link #getCopyPolicy() <em>Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCopyPolicy()
   * @generated
   * @ordered
   */
  protected CopyPolicy copyPolicy;

  /**
   * The cached value of the '{@link #getInstantiationCopyPolicy() <em>Instantiation Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getInstantiationCopyPolicy()
   * @generated
   * @ordered
   */
  protected InstantiationCopyPolicy instantiationCopyPolicy;

  /**
   * The cached value of the '{@link #getCloneCopyPolicy() <em>Clone Copy Policy</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCloneCopyPolicy()
   * @generated
   * @ordered
   */
  protected CloneCopyPolicy cloneCopyPolicy;

  /**
   * The cached value of the '{@link #getPlsqlRecord() <em>Plsql Record</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlsqlRecord()
   * @generated
   * @ordered
   */
	protected EList<PlsqlRecord> plsqlRecord;

		/**
   * The cached value of the '{@link #getPlsqlTable() <em>Plsql Table</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlsqlTable()
   * @generated
   * @ordered
   */
	protected EList<PlsqlTable> plsqlTable;

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
   * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttributeOverride()
   * @generated
   * @ordered
   */
	protected EList<AttributeOverride> attributeOverride;

		/**
   * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAssociationOverride()
   * @generated
   * @ordered
   */
	protected EList<AssociationOverride> associationOverride;

		/**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected Attributes attributes;

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
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isExcludeDefaultMappings() <em>Exclude Default Mappings</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isExcludeDefaultMappings()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExcludeDefaultMappings() <em>Exclude Default Mappings</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isExcludeDefaultMappings()
   * @generated
   * @ordered
   */
  protected boolean excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;

  /**
   * This is true if the Exclude Default Mappings attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean excludeDefaultMappingsESet;

  /**
   * The default value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isMetadataComplete()
   * @generated
   * @ordered
   */
  protected static final boolean METADATA_COMPLETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isMetadataComplete()
   * @generated
   * @ordered
   */
  protected boolean metadataComplete = METADATA_COMPLETE_EDEFAULT;

  /**
   * This is true if the Metadata Complete attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean metadataCompleteESet;

  /**
   * The default value of the '{@link #getParentClass() <em>Parent Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParentClass()
   * @generated
   * @ordered
   */
	protected static final String PARENT_CLASS_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getParentClass() <em>Parent Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParentClass()
   * @generated
   * @ordered
   */
	protected String parentClass = PARENT_CLASS_EDEFAULT;

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EmbeddableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getEmbeddable();
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__DESCRIPTION, oldDescription, description));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Customizer getCustomizer() {
    return customizer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCustomizer(Customizer newCustomizer, NotificationChain msgs) {
    Customizer oldCustomizer = customizer;
    customizer = newCustomizer;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CUSTOMIZER, oldCustomizer, newCustomizer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCustomizer(Customizer newCustomizer) {
    if (newCustomizer != customizer) {
      NotificationChain msgs = null;
      if (customizer != null)
        msgs = ((InternalEObject)customizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__CUSTOMIZER, null, msgs);
      if (newCustomizer != null)
        msgs = ((InternalEObject)newCustomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__CUSTOMIZER, null, msgs);
      msgs = basicSetCustomizer(newCustomizer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CUSTOMIZER, newCustomizer, newCustomizer));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTracking getChangeTracking() {
    return changeTracking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChangeTracking(ChangeTracking newChangeTracking, NotificationChain msgs) {
    ChangeTracking oldChangeTracking = changeTracking;
    changeTracking = newChangeTracking;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CHANGE_TRACKING, oldChangeTracking, newChangeTracking);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setChangeTracking(ChangeTracking newChangeTracking) {
    if (newChangeTracking != changeTracking) {
      NotificationChain msgs = null;
      if (changeTracking != null)
        msgs = ((InternalEObject)changeTracking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__CHANGE_TRACKING, null, msgs);
      if (newChangeTracking != null)
        msgs = ((InternalEObject)newChangeTracking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__CHANGE_TRACKING, null, msgs);
      msgs = basicSetChangeTracking(newChangeTracking, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CHANGE_TRACKING, newChangeTracking, newChangeTracking));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Struct getStruct() {
    return struct;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetStruct(Struct newStruct, NotificationChain msgs) {
    Struct oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__STRUCT, oldStruct, newStruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStruct(Struct newStruct) {
    if (newStruct != struct) {
      NotificationChain msgs = null;
      if (struct != null)
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__STRUCT, newStruct, newStruct));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Converter> getConverter() {
    if (converter == null) {
      converter = new EObjectContainmentEList<Converter>(Converter.class, this, OrmPackage.EMBEDDABLE__CONVERTER);
    }
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeConverter> getTypeConverter() {
    if (typeConverter == null) {
      typeConverter = new EObjectContainmentEList<TypeConverter>(TypeConverter.class, this, OrmPackage.EMBEDDABLE__TYPE_CONVERTER);
    }
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
    if (objectTypeConverter == null) {
      objectTypeConverter = new EObjectContainmentEList<ObjectTypeConverter>(ObjectTypeConverter.class, this, OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER);
    }
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<StructConverter> getStructConverter() {
    if (structConverter == null) {
      structConverter = new EObjectContainmentEList<StructConverter>(StructConverter.class, this, OrmPackage.EMBEDDABLE__STRUCT_CONVERTER);
    }
    return structConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.EMBEDDABLE__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AttributeOverride> getAttributeOverride() {
    if (attributeOverride == null) {
      attributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE);
    }
    return attributeOverride;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AssociationOverride> getAssociationOverride() {
    if (associationOverride == null) {
      associationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE);
    }
    return associationOverride;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs) {
    Attributes oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__ATTRIBUTES, oldAttributes, newAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(Attributes newAttributes) {
    if (newAttributes != attributes) {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CopyPolicy getCopyPolicy() {
    return copyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCopyPolicy(CopyPolicy newCopyPolicy, NotificationChain msgs) {
    CopyPolicy oldCopyPolicy = copyPolicy;
    copyPolicy = newCopyPolicy;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__COPY_POLICY, oldCopyPolicy, newCopyPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCopyPolicy(CopyPolicy newCopyPolicy) {
    if (newCopyPolicy != copyPolicy) {
      NotificationChain msgs = null;
      if (copyPolicy != null)
        msgs = ((InternalEObject)copyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__COPY_POLICY, null, msgs);
      if (newCopyPolicy != null)
        msgs = ((InternalEObject)newCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__COPY_POLICY, null, msgs);
      msgs = basicSetCopyPolicy(newCopyPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__COPY_POLICY, newCopyPolicy, newCopyPolicy));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InstantiationCopyPolicy getInstantiationCopyPolicy() {
    return instantiationCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy,
      NotificationChain msgs) {
    InstantiationCopyPolicy oldInstantiationCopyPolicy = instantiationCopyPolicy;
    instantiationCopyPolicy = newInstantiationCopyPolicy;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY, oldInstantiationCopyPolicy, newInstantiationCopyPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy) {
    if (newInstantiationCopyPolicy != instantiationCopyPolicy) {
      NotificationChain msgs = null;
      if (instantiationCopyPolicy != null)
        msgs = ((InternalEObject)instantiationCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY, null, msgs);
      if (newInstantiationCopyPolicy != null)
        msgs = ((InternalEObject)newInstantiationCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY, null, msgs);
      msgs = basicSetInstantiationCopyPolicy(newInstantiationCopyPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY, newInstantiationCopyPolicy, newInstantiationCopyPolicy));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CloneCopyPolicy getCloneCopyPolicy() {
    return cloneCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy, NotificationChain msgs) {
    CloneCopyPolicy oldCloneCopyPolicy = cloneCopyPolicy;
    cloneCopyPolicy = newCloneCopyPolicy;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY, oldCloneCopyPolicy, newCloneCopyPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy) {
    if (newCloneCopyPolicy != cloneCopyPolicy) {
      NotificationChain msgs = null;
      if (cloneCopyPolicy != null)
        msgs = ((InternalEObject)cloneCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY, null, msgs);
      if (newCloneCopyPolicy != null)
        msgs = ((InternalEObject)newCloneCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY, null, msgs);
      msgs = basicSetCloneCopyPolicy(newCloneCopyPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY, newCloneCopyPolicy, newCloneCopyPolicy));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PlsqlRecord> getPlsqlRecord() {
    if (plsqlRecord == null) {
      plsqlRecord = new EObjectContainmentEList<PlsqlRecord>(PlsqlRecord.class, this, OrmPackage.EMBEDDABLE__PLSQL_RECORD);
    }
    return plsqlRecord;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PlsqlTable> getPlsqlTable() {
    if (plsqlTable == null) {
      plsqlTable = new EObjectContainmentEList<PlsqlTable>(PlsqlTable.class, this, OrmPackage.EMBEDDABLE__PLSQL_TABLE);
    }
    return plsqlTable;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__ACCESS, oldAccess, access, !oldAccessESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.EMBEDDABLE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
  public String getClass_() {
    return class_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setClass(String newClass) {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isExcludeDefaultMappings() {
    return excludeDefaultMappings;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExcludeDefaultMappings(boolean newExcludeDefaultMappings) {
    boolean oldExcludeDefaultMappings = excludeDefaultMappings;
    excludeDefaultMappings = newExcludeDefaultMappings;
    boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
    excludeDefaultMappingsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS, oldExcludeDefaultMappings, excludeDefaultMappings, !oldExcludeDefaultMappingsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetExcludeDefaultMappings() {
    boolean oldExcludeDefaultMappings = excludeDefaultMappings;
    boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
    excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;
    excludeDefaultMappingsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS, oldExcludeDefaultMappings, EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT, oldExcludeDefaultMappingsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetExcludeDefaultMappings() {
    return excludeDefaultMappingsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isMetadataComplete() {
    return metadataComplete;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMetadataComplete(boolean newMetadataComplete) {
    boolean oldMetadataComplete = metadataComplete;
    metadataComplete = newMetadataComplete;
    boolean oldMetadataCompleteESet = metadataCompleteESet;
    metadataCompleteESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__METADATA_COMPLETE, oldMetadataComplete, metadataComplete, !oldMetadataCompleteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMetadataComplete() {
    boolean oldMetadataComplete = metadataComplete;
    boolean oldMetadataCompleteESet = metadataCompleteESet;
    metadataComplete = METADATA_COMPLETE_EDEFAULT;
    metadataCompleteESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.EMBEDDABLE__METADATA_COMPLETE, oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMetadataComplete() {
    return metadataCompleteESet;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getParentClass() {
    return parentClass;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParentClass(String newParentClass) {
    String oldParentClass = parentClass;
    parentClass = newParentClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDABLE__PARENT_CLASS, oldParentClass, parentClass));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.EMBEDDABLE__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
      case OrmPackage.EMBEDDABLE__CUSTOMIZER:
        return basicSetCustomizer(null, msgs);
      case OrmPackage.EMBEDDABLE__CHANGE_TRACKING:
        return basicSetChangeTracking(null, msgs);
      case OrmPackage.EMBEDDABLE__STRUCT:
        return basicSetStruct(null, msgs);
      case OrmPackage.EMBEDDABLE__CONVERTER:
        return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__TYPE_CONVERTER:
        return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER:
        return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__STRUCT_CONVERTER:
        return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__COPY_POLICY:
        return basicSetCopyPolicy(null, msgs);
      case OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY:
        return basicSetInstantiationCopyPolicy(null, msgs);
      case OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY:
        return basicSetCloneCopyPolicy(null, msgs);
      case OrmPackage.EMBEDDABLE__PLSQL_RECORD:
        return ((InternalEList<?>)getPlsqlRecord()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__PLSQL_TABLE:
        return ((InternalEList<?>)getPlsqlTable()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE:
        return ((InternalEList<?>)getAttributeOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE:
        return ((InternalEList<?>)getAssociationOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDABLE__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
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
      case OrmPackage.EMBEDDABLE__DESCRIPTION:
        return getDescription();
      case OrmPackage.EMBEDDABLE__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.EMBEDDABLE__CUSTOMIZER:
        return getCustomizer();
      case OrmPackage.EMBEDDABLE__CHANGE_TRACKING:
        return getChangeTracking();
      case OrmPackage.EMBEDDABLE__STRUCT:
        return getStruct();
      case OrmPackage.EMBEDDABLE__CONVERTER:
        return getConverter();
      case OrmPackage.EMBEDDABLE__TYPE_CONVERTER:
        return getTypeConverter();
      case OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER:
        return getObjectTypeConverter();
      case OrmPackage.EMBEDDABLE__STRUCT_CONVERTER:
        return getStructConverter();
      case OrmPackage.EMBEDDABLE__COPY_POLICY:
        return getCopyPolicy();
      case OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY:
        return getInstantiationCopyPolicy();
      case OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY:
        return getCloneCopyPolicy();
      case OrmPackage.EMBEDDABLE__PLSQL_RECORD:
        return getPlsqlRecord();
      case OrmPackage.EMBEDDABLE__PLSQL_TABLE:
        return getPlsqlTable();
      case OrmPackage.EMBEDDABLE__PROPERTY:
        return getProperty();
      case OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE:
        return getAttributeOverride();
      case OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE:
        return getAssociationOverride();
      case OrmPackage.EMBEDDABLE__ATTRIBUTES:
        return getAttributes();
      case OrmPackage.EMBEDDABLE__ACCESS:
        return getAccess();
      case OrmPackage.EMBEDDABLE__CLASS:
        return getClass_();
      case OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS:
        return isExcludeDefaultMappings();
      case OrmPackage.EMBEDDABLE__METADATA_COMPLETE:
        return isMetadataComplete();
      case OrmPackage.EMBEDDABLE__PARENT_CLASS:
        return getParentClass();
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
      case OrmPackage.EMBEDDABLE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrmPackage.EMBEDDABLE__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.EMBEDDABLE__CUSTOMIZER:
        setCustomizer((Customizer)newValue);
        return;
      case OrmPackage.EMBEDDABLE__CHANGE_TRACKING:
        setChangeTracking((ChangeTracking)newValue);
        return;
      case OrmPackage.EMBEDDABLE__STRUCT:
        setStruct((Struct)newValue);
        return;
      case OrmPackage.EMBEDDABLE__CONVERTER:
        getConverter().clear();
        getConverter().addAll((Collection<? extends Converter>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__TYPE_CONVERTER:
        getTypeConverter().clear();
        getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__STRUCT_CONVERTER:
        getStructConverter().clear();
        getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__COPY_POLICY:
        setCopyPolicy((CopyPolicy)newValue);
        return;
      case OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY:
        setInstantiationCopyPolicy((InstantiationCopyPolicy)newValue);
        return;
      case OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY:
        setCloneCopyPolicy((CloneCopyPolicy)newValue);
        return;
      case OrmPackage.EMBEDDABLE__PLSQL_RECORD:
        getPlsqlRecord().clear();
        getPlsqlRecord().addAll((Collection<? extends PlsqlRecord>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__PLSQL_TABLE:
        getPlsqlTable().clear();
        getPlsqlTable().addAll((Collection<? extends PlsqlTable>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        getAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        getAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
        return;
      case OrmPackage.EMBEDDABLE__ATTRIBUTES:
        setAttributes((Attributes)newValue);
        return;
      case OrmPackage.EMBEDDABLE__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.EMBEDDABLE__CLASS:
        setClass((String)newValue);
        return;
      case OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS:
        setExcludeDefaultMappings((Boolean)newValue);
        return;
      case OrmPackage.EMBEDDABLE__METADATA_COMPLETE:
        setMetadataComplete((Boolean)newValue);
        return;
      case OrmPackage.EMBEDDABLE__PARENT_CLASS:
        setParentClass((String)newValue);
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
      case OrmPackage.EMBEDDABLE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrmPackage.EMBEDDABLE__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.EMBEDDABLE__CUSTOMIZER:
        setCustomizer((Customizer)null);
        return;
      case OrmPackage.EMBEDDABLE__CHANGE_TRACKING:
        setChangeTracking((ChangeTracking)null);
        return;
      case OrmPackage.EMBEDDABLE__STRUCT:
        setStruct((Struct)null);
        return;
      case OrmPackage.EMBEDDABLE__CONVERTER:
        getConverter().clear();
        return;
      case OrmPackage.EMBEDDABLE__TYPE_CONVERTER:
        getTypeConverter().clear();
        return;
      case OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER:
        getObjectTypeConverter().clear();
        return;
      case OrmPackage.EMBEDDABLE__STRUCT_CONVERTER:
        getStructConverter().clear();
        return;
      case OrmPackage.EMBEDDABLE__COPY_POLICY:
        setCopyPolicy((CopyPolicy)null);
        return;
      case OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY:
        setInstantiationCopyPolicy((InstantiationCopyPolicy)null);
        return;
      case OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY:
        setCloneCopyPolicy((CloneCopyPolicy)null);
        return;
      case OrmPackage.EMBEDDABLE__PLSQL_RECORD:
        getPlsqlRecord().clear();
        return;
      case OrmPackage.EMBEDDABLE__PLSQL_TABLE:
        getPlsqlTable().clear();
        return;
      case OrmPackage.EMBEDDABLE__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        return;
      case OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        return;
      case OrmPackage.EMBEDDABLE__ATTRIBUTES:
        setAttributes((Attributes)null);
        return;
      case OrmPackage.EMBEDDABLE__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.EMBEDDABLE__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS:
        unsetExcludeDefaultMappings();
        return;
      case OrmPackage.EMBEDDABLE__METADATA_COMPLETE:
        unsetMetadataComplete();
        return;
      case OrmPackage.EMBEDDABLE__PARENT_CLASS:
        setParentClass(PARENT_CLASS_EDEFAULT);
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
      case OrmPackage.EMBEDDABLE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrmPackage.EMBEDDABLE__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.EMBEDDABLE__CUSTOMIZER:
        return customizer != null;
      case OrmPackage.EMBEDDABLE__CHANGE_TRACKING:
        return changeTracking != null;
      case OrmPackage.EMBEDDABLE__STRUCT:
        return struct != null;
      case OrmPackage.EMBEDDABLE__CONVERTER:
        return converter != null && !converter.isEmpty();
      case OrmPackage.EMBEDDABLE__TYPE_CONVERTER:
        return typeConverter != null && !typeConverter.isEmpty();
      case OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER:
        return objectTypeConverter != null && !objectTypeConverter.isEmpty();
      case OrmPackage.EMBEDDABLE__STRUCT_CONVERTER:
        return structConverter != null && !structConverter.isEmpty();
      case OrmPackage.EMBEDDABLE__COPY_POLICY:
        return copyPolicy != null;
      case OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY:
        return instantiationCopyPolicy != null;
      case OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY:
        return cloneCopyPolicy != null;
      case OrmPackage.EMBEDDABLE__PLSQL_RECORD:
        return plsqlRecord != null && !plsqlRecord.isEmpty();
      case OrmPackage.EMBEDDABLE__PLSQL_TABLE:
        return plsqlTable != null && !plsqlTable.isEmpty();
      case OrmPackage.EMBEDDABLE__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE:
        return attributeOverride != null && !attributeOverride.isEmpty();
      case OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE:
        return associationOverride != null && !associationOverride.isEmpty();
      case OrmPackage.EMBEDDABLE__ATTRIBUTES:
        return attributes != null;
      case OrmPackage.EMBEDDABLE__ACCESS:
        return isSetAccess();
      case OrmPackage.EMBEDDABLE__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS:
        return isSetExcludeDefaultMappings();
      case OrmPackage.EMBEDDABLE__METADATA_COMPLETE:
        return isSetMetadataComplete();
      case OrmPackage.EMBEDDABLE__PARENT_CLASS:
        return PARENT_CLASS_EDEFAULT == null ? parentClass != null : !PARENT_CLASS_EDEFAULT.equals(parentClass);
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
    result.append(", access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", class: "); //$NON-NLS-1$
    result.append(class_);
    result.append(", excludeDefaultMappings: "); //$NON-NLS-1$
    if (excludeDefaultMappingsESet) result.append(excludeDefaultMappings); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", metadataComplete: "); //$NON-NLS-1$
    if (metadataCompleteESet) result.append(metadataComplete); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", parentClass: "); //$NON-NLS-1$
    result.append(parentClass);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    // add any other feature to hide non-jpa features
    features.add(OrmPackage.eINSTANCE.getElementCollection_Fetch());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }
} // EmbeddableImpl
