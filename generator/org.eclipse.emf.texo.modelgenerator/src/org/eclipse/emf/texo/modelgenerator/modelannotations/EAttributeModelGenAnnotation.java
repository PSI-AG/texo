/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAttributeModelGenAnnotation.java,v 1.13 2011/10/25 13:19:30 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EAttribute Model Gen Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isPrimitive <em>Primitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEAttributeModelGenAnnotation()
 * @model kind="class"
 * @generated
 */
public class EAttributeModelGenAnnotation extends EAttributeAnnotation implements EStructuralFeatureModelGenAnnotation {
  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

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
   * The default value of the '{@link #getGetter() <em>Getter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getGetter()
   * @generated
   * @ordered
   */
  protected static final String GETTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetter() <em>Getter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getGetter()
   * @generated
   * @ordered
   */
  protected String getter = GETTER_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected String objectType = OBJECT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getItemType()
   * @generated
   * @ordered
   */
  protected static final String ITEM_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getItemType()
   * @generated
   * @ordered
   */
  protected String itemType = ITEM_TYPE_EDEFAULT;

  /**
   * This is true if the Item Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean itemTypeESet;

  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getSetter() <em>Setter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSetter()
   * @generated
   * @ordered
   */
  protected static final String SETTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSetter() <em>Setter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getSetter()
   * @generated
   * @ordered
   */
  protected String setter = SETTER_EDEFAULT;

  /**
   * The default value of the '{@link #getValidJavaMemberName() <em>Valid Java Member Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getValidJavaMemberName()
   * @generated
   * @ordered
   */
  protected static final String VALID_JAVA_MEMBER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValidJavaMemberName() <em>Valid Java Member Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getValidJavaMemberName()
   * @generated
   * @ordered
   */
  protected String validJavaMemberName = VALID_JAVA_MEMBER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isGenerateCode() <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isGenerateCode()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_CODE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isGenerateCode() <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isGenerateCode()
   * @generated
   * @ordered
   */
  protected boolean generateCode = GENERATE_CODE_EDEFAULT;

  /**
   * This is true if the Generate Code attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean generateCodeESet;

  /**
   * The default value of the '{@link #getFeatureMapQualifiedClassName() <em>Feature Map Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFeatureMapQualifiedClassName()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatureMapQualifiedClassName() <em>Feature Map Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFeatureMapQualifiedClassName()
   * @generated
   * @ordered
   */
  protected String featureMapQualifiedClassName = FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFeatureMapSimpleClassName() <em>Feature Map Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFeatureMapSimpleClassName()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatureMapSimpleClassName() <em>Feature Map Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFeatureMapSimpleClassName()
   * @generated
   * @ordered
   */
  protected String featureMapSimpleClassName = FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeatureMapFeature() <em>Feature Map Feature</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getFeatureMapFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeatureModelGenAnnotation featureMapFeature;

  /**
   * The cached value of the '{@link #getMemberFeatureMapFeatures() <em>Member Feature Map Features</em>}' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMemberFeatureMapFeatures()
   * @generated
   * @ordered
   */
  protected EList<EStructuralFeatureModelGenAnnotation> memberFeatureMapFeatures;

  /**
   * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected static final boolean MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected boolean many = MANY_EDEFAULT;

  /**
   * This is true if the Many attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean manyESet;

  /**
   * The default value of the '{@link #isUseList() <em>Use List</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUseList()
   * @generated
   * @ordered
   */
  protected static final boolean USE_LIST_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isUseList() <em>Use List</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUseList()
   * @generated
   * @ordered
   */
  protected boolean useList = USE_LIST_EDEFAULT;

  /**
   * This is true if the Use List attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean useListESet;

  /**
   * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected static final boolean REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected boolean reference = REFERENCE_EDEFAULT;

  /**
   * This is true if the Reference attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean referenceESet;

  /**
   * The cached value of the '{@link #getOwnerEClassAnnotation() <em>Owner EClass Annotation</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOwnerEClassAnnotation()
   * @generated
   * @ordered
   */
  protected EClassModelGenAnnotation ownerEClassAnnotation;

  /**
   * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isBoolean()
   * @generated
   * @ordered
   */
  protected static final boolean BOOLEAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isBoolean()
   * @generated
   * @ordered
   */
  protected boolean boolean_ = BOOLEAN_EDEFAULT;

  /**
   * This is true if the Boolean attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean booleanESet;

  /**
   * The default value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPrimitive()
   * @generated
   * @ordered
   */
  protected static final boolean PRIMITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPrimitive()
   * @generated
   * @ordered
   */
  protected boolean primitive = PRIMITIVE_EDEFAULT;

  /**
   * This is true if the Primitive attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean primitiveESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EAttributeModelGenAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelcodegeneratorPackage.Literals.EATTRIBUTE_MODEL_GEN_ANNOTATION;
  }

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation_Documentation()
   * @model unique="false"
   * @generated
   */
  public String getDocumentation() {
    return documentation;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  public void setDocumentation(String newDocumentation) {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation_Name()
   * @model unique="false"
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME, oldName, name));
  }

  /**
   * Returns the value of the '<em><b>Getter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getter</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getter</em>' attribute.
   * @see #setGetter(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Getter()
   * @model unique="false"
   * @generated
   */
  public String getGetter() {
    return getter;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getGetter <em>Getter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Getter</em>' attribute.
   * @see #getGetter()
   * @generated
   */
  public void setGetter(String newGetter) {
    String oldGetter = getter;
    getter = newGetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER, oldGetter, getter));
  }

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Type()
   * @model unique="false" transient="true"
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE, oldType, type));
  }

  /**
   * Returns the value of the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' attribute.
   * @see #setObjectType(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_ObjectType()
   * @model unique="false" transient="true"
   * @generated
   */
  public String getObjectType() {
    return objectType;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  public void setObjectType(String newObjectType) {
    String oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * Returns the value of the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Type</em>' attribute.
   * @see #isSetItemType()
   * @see #unsetItemType()
   * @see #setItemType(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_ItemType()
   * @model unique="false" unsettable="true" transient="true"
   * @generated
   */
  public String getItemType() {
    return itemType;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Type</em>' attribute.
   * @see #isSetItemType()
   * @see #unsetItemType()
   * @see #getItemType()
   * @generated
   */
  public void setItemType(String newItemType) {
    String oldItemType = itemType;
    itemType = newItemType;
    boolean oldItemTypeESet = itemTypeESet;
    itemTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE, oldItemType, itemType, !oldItemTypeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetItemType()
   * @see #getItemType()
   * @see #setItemType(String)
   * @generated
   */
  public void unsetItemType() {
    String oldItemType = itemType;
    boolean oldItemTypeESet = itemTypeESet;
    itemType = ITEM_TYPE_EDEFAULT;
    itemTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE, oldItemType, ITEM_TYPE_EDEFAULT, oldItemTypeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getItemType <em>Item Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Item Type</em>' attribute is set.
   * @see #unsetItemType()
   * @see #getItemType()
   * @see #setItemType(String)
   * @generated
   */
  public boolean isSetItemType() {
    return itemTypeESet;
  }

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_DefaultValue()
   * @model unique="false"
   * @generated
   */
  public String getDefaultValue() {
    return defaultValue;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  public void setDefaultValue(String newDefaultValue) {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * Returns the value of the '<em><b>Setter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setter</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setter</em>' attribute.
   * @see #setSetter(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Setter()
   * @model unique="false"
   * @generated
   */
  public String getSetter() {
    return setter;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getSetter <em>Setter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Setter</em>' attribute.
   * @see #getSetter()
   * @generated
   */
  public void setSetter(String newSetter) {
    String oldSetter = setter;
    setter = newSetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER, oldSetter, setter));
  }

  /**
   * Returns the value of the '<em><b>Valid Java Member Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valid Java Member Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid Java Member Name</em>' attribute.
   * @see #setValidJavaMemberName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_ValidJavaMemberName()
   * @model unique="false"
   * @generated
   */
  public String getValidJavaMemberName() {
    return validJavaMemberName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getValidJavaMemberName <em>Valid Java Member Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid Java Member Name</em>' attribute.
   * @see #getValidJavaMemberName()
   * @generated
   */
  public void setValidJavaMemberName(String newValidJavaMemberName) {
    String oldValidJavaMemberName = validJavaMemberName;
    validJavaMemberName = newValidJavaMemberName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME, oldValidJavaMemberName, validJavaMemberName));
  }

  /**
   * Returns the value of the '<em><b>Generate Code</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Code</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Generate Code</em>' attribute.
   * @see #isSetGenerateCode()
   * @see #unsetGenerateCode()
   * @see #setGenerateCode(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_GenerateCode()
   * @model default="true" unsettable="true"
   * @generated
   */
  public boolean isGenerateCode() {
    return generateCode;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Code</em>' attribute.
   * @see #isSetGenerateCode()
   * @see #unsetGenerateCode()
   * @see #isGenerateCode()
   * @generated
   */
  public void setGenerateCode(boolean newGenerateCode) {
    boolean oldGenerateCode = generateCode;
    generateCode = newGenerateCode;
    boolean oldGenerateCodeESet = generateCodeESet;
    generateCodeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, generateCode, !oldGenerateCodeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenerateCode()
   * @see #isGenerateCode()
   * @see #setGenerateCode(boolean)
   * @generated
   */
  public void unsetGenerateCode() {
    boolean oldGenerateCode = generateCode;
    boolean oldGenerateCodeESet = generateCodeESet;
    generateCode = GENERATE_CODE_EDEFAULT;
    generateCodeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, GENERATE_CODE_EDEFAULT, oldGenerateCodeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Generate Code</em>' attribute is set.
   * @see #unsetGenerateCode()
   * @see #isGenerateCode()
   * @see #setGenerateCode(boolean)
   * @generated
   */
  public boolean isSetGenerateCode() {
    return generateCodeESet;
  }

  /**
   * Returns the value of the '<em><b>Feature Map Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Qualified Class Name</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Qualified Class Name</em>' attribute.
   * @see #setFeatureMapQualifiedClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_FeatureMapQualifiedClassName()
   * @model unique="false"
   * @generated
   */
  public String getFeatureMapQualifiedClassName() {
    return featureMapQualifiedClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getFeatureMapQualifiedClassName <em>Feature Map Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Qualified Class Name</em>' attribute.
   * @see #getFeatureMapQualifiedClassName()
   * @generated
   */
  public void setFeatureMapQualifiedClassName(String newFeatureMapQualifiedClassName) {
    String oldFeatureMapQualifiedClassName = featureMapQualifiedClassName;
    featureMapQualifiedClassName = newFeatureMapQualifiedClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME, oldFeatureMapQualifiedClassName, featureMapQualifiedClassName));
  }

  /**
   * Returns the value of the '<em><b>Feature Map Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Simple Class Name</em>' attribute isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Simple Class Name</em>' attribute.
   * @see #setFeatureMapSimpleClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_FeatureMapSimpleClassName()
   * @model unique="false"
   * @generated
   */
  public String getFeatureMapSimpleClassName() {
    return featureMapSimpleClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getFeatureMapSimpleClassName <em>Feature Map Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Simple Class Name</em>' attribute.
   * @see #getFeatureMapSimpleClassName()
   * @generated
   */
  public void setFeatureMapSimpleClassName(String newFeatureMapSimpleClassName) {
    String oldFeatureMapSimpleClassName = featureMapSimpleClassName;
    featureMapSimpleClassName = newFeatureMapSimpleClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME, oldFeatureMapSimpleClassName, featureMapSimpleClassName));
  }

  /**
   * Returns the value of the '<em><b>Feature Map Feature</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures <em>Member Feature Map Features</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Feature</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Feature</em>' reference.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_FeatureMapFeature()
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures
   * @model opposite="memberFeatureMapFeatures" transient="true" changeable="false"
   * @generated
   */
  public EStructuralFeatureModelGenAnnotation getFeatureMapFeature() {
    if (featureMapFeature != null && featureMapFeature.eIsProxy()) {
      InternalEObject oldFeatureMapFeature = (InternalEObject)featureMapFeature;
      featureMapFeature = (EStructuralFeatureModelGenAnnotation)eResolveProxy(oldFeatureMapFeature);
      if (featureMapFeature != oldFeatureMapFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE, oldFeatureMapFeature, featureMapFeature));
      }
    }
    return featureMapFeature;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeatureModelGenAnnotation basicGetFeatureMapFeature() {
    return featureMapFeature;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureMapFeature(EStructuralFeatureModelGenAnnotation newFeatureMapFeature,
      NotificationChain msgs) {
    EStructuralFeatureModelGenAnnotation oldFeatureMapFeature = featureMapFeature;
    featureMapFeature = newFeatureMapFeature;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE, oldFeatureMapFeature, newFeatureMapFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Returns the value of the '<em><b>Member Feature Map Features</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation}.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature <em>Feature Map Feature</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Feature Map Features</em>' reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Feature Map Features</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_MemberFeatureMapFeatures()
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature
   * @model opposite="featureMapFeature" transient="true" changeable="false"
   * @generated
   */
  public EList<EStructuralFeatureModelGenAnnotation> getMemberFeatureMapFeatures() {
    if (memberFeatureMapFeatures == null) {
      memberFeatureMapFeatures = new EObjectWithInverseResolvingEList<EStructuralFeatureModelGenAnnotation>(EStructuralFeatureModelGenAnnotation.class, this, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES, ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE);
    }
    return memberFeatureMapFeatures;
  }

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Many</em>' attribute.
   * @see #isSetMany()
   * @see #unsetMany()
   * @see #setMany(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Many()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isMany() {
    return many;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isSetMany()
   * @see #unsetMany()
   * @see #isMany()
   * @generated
   */
  public void setMany(boolean newMany) {
    boolean oldMany = many;
    many = newMany;
    boolean oldManyESet = manyESet;
    manyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY, oldMany, many, !oldManyESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMany()
   * @see #isMany()
   * @see #setMany(boolean)
   * @generated
   */
  public void unsetMany() {
    boolean oldMany = many;
    boolean oldManyESet = manyESet;
    many = MANY_EDEFAULT;
    manyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY, oldMany, MANY_EDEFAULT, oldManyESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isMany <em>Many</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Many</em>' attribute is set.
   * @see #unsetMany()
   * @see #isMany()
   * @see #setMany(boolean)
   * @generated
   */
  public boolean isSetMany() {
    return manyESet;
  }

  /**
   * Returns the value of the '<em><b>Use List</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use List</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Use List</em>' attribute.
   * @see #isSetUseList()
   * @see #unsetUseList()
   * @see #setUseList(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_UseList()
   * @model default="true" unique="false" unsettable="true"
   * @generated
   */
  public boolean isUseList() {
    return useList;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isUseList <em>Use List</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Use List</em>' attribute.
   * @see #isSetUseList()
   * @see #unsetUseList()
   * @see #isUseList()
   * @generated
   */
  public void setUseList(boolean newUseList) {
    boolean oldUseList = useList;
    useList = newUseList;
    boolean oldUseListESet = useListESet;
    useListESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST, oldUseList, useList, !oldUseListESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isUseList <em>Use List</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetUseList()
   * @see #isUseList()
   * @see #setUseList(boolean)
   * @generated
   */
  public void unsetUseList() {
    boolean oldUseList = useList;
    boolean oldUseListESet = useListESet;
    useList = USE_LIST_EDEFAULT;
    useListESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST, oldUseList, USE_LIST_EDEFAULT, oldUseListESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isUseList <em>Use List</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Use List</em>' attribute is set.
   * @see #unsetUseList()
   * @see #isUseList()
   * @see #setUseList(boolean)
   * @generated
   */
  public boolean isSetUseList() {
    return useListESet;
  }

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #isSetReference()
   * @see #unsetReference()
   * @see #setReference(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_Reference()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isReference() {
    return reference;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #isSetReference()
   * @see #unsetReference()
   * @see #isReference()
   * @generated
   */
  public void setReference(boolean newReference) {
    boolean oldReference = reference;
    reference = newReference;
    boolean oldReferenceESet = referenceESet;
    referenceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE, oldReference, reference, !oldReferenceESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReference()
   * @see #isReference()
   * @see #setReference(boolean)
   * @generated
   */
  public void unsetReference() {
    boolean oldReference = reference;
    boolean oldReferenceESet = referenceESet;
    reference = REFERENCE_EDEFAULT;
    referenceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE, oldReference, REFERENCE_EDEFAULT, oldReferenceESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isReference <em>Reference</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Reference</em>' attribute is set.
   * @see #unsetReference()
   * @see #isReference()
   * @see #setReference(boolean)
   * @generated
   */
  public boolean isSetReference() {
    return referenceESet;
  }

  /**
   * Returns the value of the '<em><b>Owner EClass Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner EClass Annotation</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner EClass Annotation</em>' reference.
   * @see #setOwnerEClassAnnotation(EClassModelGenAnnotation)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation_OwnerEClassAnnotation()
   * @model
   * @generated
   */
  public EClassModelGenAnnotation getOwnerEClassAnnotation() {
    if (ownerEClassAnnotation != null && ownerEClassAnnotation.eIsProxy()) {
      InternalEObject oldOwnerEClassAnnotation = (InternalEObject)ownerEClassAnnotation;
      ownerEClassAnnotation = (EClassModelGenAnnotation)eResolveProxy(oldOwnerEClassAnnotation);
      if (ownerEClassAnnotation != oldOwnerEClassAnnotation) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION, oldOwnerEClassAnnotation, ownerEClassAnnotation));
      }
    }
    return ownerEClassAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClassModelGenAnnotation basicGetOwnerEClassAnnotation() {
    return ownerEClassAnnotation;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#getOwnerEClassAnnotation <em>Owner EClass Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner EClass Annotation</em>' reference.
   * @see #getOwnerEClassAnnotation()
   * @generated
   */
  public void setOwnerEClassAnnotation(EClassModelGenAnnotation newOwnerEClassAnnotation) {
    EClassModelGenAnnotation oldOwnerEClassAnnotation = ownerEClassAnnotation;
    ownerEClassAnnotation = newOwnerEClassAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION, oldOwnerEClassAnnotation, ownerEClassAnnotation));
  }

  /**
   * Returns the value of the '<em><b>Boolean</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Boolean</em>' attribute.
   * @see #isSetBoolean()
   * @see #unsetBoolean()
   * @see #setBoolean(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEAttributeModelGenAnnotation_Boolean()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isBoolean() {
    return boolean_;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' attribute.
   * @see #isSetBoolean()
   * @see #unsetBoolean()
   * @see #isBoolean()
   * @generated
   */
  public void setBoolean(boolean newBoolean) {
    boolean oldBoolean = boolean_;
    boolean_ = newBoolean;
    boolean oldBooleanESet = booleanESet;
    booleanESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN, oldBoolean, boolean_, !oldBooleanESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetBoolean()
   * @see #isBoolean()
   * @see #setBoolean(boolean)
   * @generated
   */
  public void unsetBoolean() {
    boolean oldBoolean = boolean_;
    boolean oldBooleanESet = booleanESet;
    boolean_ = BOOLEAN_EDEFAULT;
    booleanESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN, oldBoolean, BOOLEAN_EDEFAULT, oldBooleanESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isBoolean <em>Boolean</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Boolean</em>' attribute is set.
   * @see #unsetBoolean()
   * @see #isBoolean()
   * @see #setBoolean(boolean)
   * @generated
   */
  public boolean isSetBoolean() {
    return booleanESet;
  }

  /**
   * Returns the value of the '<em><b>Primitive</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Primitive</em>' attribute.
   * @see #isSetPrimitive()
   * @see #unsetPrimitive()
   * @see #setPrimitive(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEAttributeModelGenAnnotation_Primitive()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isPrimitive() {
    return primitive;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isPrimitive <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive</em>' attribute.
   * @see #isSetPrimitive()
   * @see #unsetPrimitive()
   * @see #isPrimitive()
   * @generated
   */
  public void setPrimitive(boolean newPrimitive) {
    boolean oldPrimitive = primitive;
    primitive = newPrimitive;
    boolean oldPrimitiveESet = primitiveESet;
    primitiveESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE, oldPrimitive, primitive, !oldPrimitiveESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isPrimitive <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPrimitive()
   * @see #isPrimitive()
   * @see #setPrimitive(boolean)
   * @generated
   */
  public void unsetPrimitive() {
    boolean oldPrimitive = primitive;
    boolean oldPrimitiveESet = primitiveESet;
    primitive = PRIMITIVE_EDEFAULT;
    primitiveESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE, oldPrimitive, PRIMITIVE_EDEFAULT, oldPrimitiveESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isPrimitive <em>Primitive</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Primitive</em>' attribute is set.
   * @see #unsetPrimitive()
   * @see #isPrimitive()
   * @see #setPrimitive(boolean)
   * @generated
   */
  public boolean isSetPrimitive() {
    return primitiveESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        if (featureMapFeature != null)
          msgs = ((InternalEObject)featureMapFeature).eInverseRemove(this, ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES, EStructuralFeatureModelGenAnnotation.class, msgs);
        return basicSetFeatureMapFeature((EStructuralFeatureModelGenAnnotation)otherEnd, msgs);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberFeatureMapFeatures()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        return basicSetFeatureMapFeature(null, msgs);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
        return ((InternalEList<?>)getMemberFeatureMapFeatures()).basicRemove(otherEnd, msgs);
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
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return getDocumentation();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME:
        return getName();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER:
        return getGetter();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE:
        return getType();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        return getObjectType();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        return getItemType();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        return getDefaultValue();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER:
        return getSetter();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        return getValidJavaMemberName();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isGenerateCode();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        return getFeatureMapQualifiedClassName();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        return getFeatureMapSimpleClassName();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        if (resolve) return getFeatureMapFeature();
        return basicGetFeatureMapFeature();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
        return getMemberFeatureMapFeatures();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY:
        return isMany();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST:
        return isUseList();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE:
        return isReference();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        if (resolve) return getOwnerEClassAnnotation();
        return basicGetOwnerEClassAnnotation();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN:
        return isBoolean();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE:
        return isPrimitive();
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
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER:
        setGetter((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE:
        setType((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        setObjectType((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        setItemType((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER:
        setSetter((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        setValidJavaMemberName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        setGenerateCode((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        setFeatureMapQualifiedClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        setFeatureMapSimpleClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY:
        setMany((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST:
        setUseList((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE:
        setReference((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        setOwnerEClassAnnotation((EClassModelGenAnnotation)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN:
        setBoolean((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE:
        setPrimitive((Boolean)newValue);
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
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER:
        setGetter(GETTER_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        setObjectType(OBJECT_TYPE_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        unsetItemType();
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER:
        setSetter(SETTER_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        setValidJavaMemberName(VALID_JAVA_MEMBER_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        unsetGenerateCode();
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        setFeatureMapQualifiedClassName(FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        setFeatureMapSimpleClassName(FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY:
        unsetMany();
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST:
        unsetUseList();
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE:
        unsetReference();
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        setOwnerEClassAnnotation((EClassModelGenAnnotation)null);
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN:
        unsetBoolean();
        return;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE:
        unsetPrimitive();
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
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER:
        return GETTER_EDEFAULT == null ? getter != null : !GETTER_EDEFAULT.equals(getter);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        return isSetItemType();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER:
        return SETTER_EDEFAULT == null ? setter != null : !SETTER_EDEFAULT.equals(setter);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        return VALID_JAVA_MEMBER_NAME_EDEFAULT == null ? validJavaMemberName != null : !VALID_JAVA_MEMBER_NAME_EDEFAULT.equals(validJavaMemberName);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isSetGenerateCode();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        return FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT == null ? featureMapQualifiedClassName != null : !FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT.equals(featureMapQualifiedClassName);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        return FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT == null ? featureMapSimpleClassName != null : !FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT.equals(featureMapSimpleClassName);
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        return featureMapFeature != null;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
        return memberFeatureMapFeatures != null && !memberFeatureMapFeatures.isEmpty();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY:
        return isSetMany();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST:
        return isSetUseList();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE:
        return isSetReference();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        return ownerEClassAnnotation != null;
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN:
        return isSetBoolean();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE:
        return isSetPrimitive();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == ENamedElementModelGenAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureModelGenAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE;
        case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == ENamedElementModelGenAnnotation.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureModelGenAnnotation.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION: return ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (documentation: "); //$NON-NLS-1$
    result.append(documentation);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", getter: "); //$NON-NLS-1$
    result.append(getter);
    result.append(", type: "); //$NON-NLS-1$
    result.append(type);
    result.append(", objectType: "); //$NON-NLS-1$
    result.append(objectType);
    result.append(", itemType: "); //$NON-NLS-1$
    if (itemTypeESet) result.append(itemType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", defaultValue: "); //$NON-NLS-1$
    result.append(defaultValue);
    result.append(", setter: "); //$NON-NLS-1$
    result.append(setter);
    result.append(", validJavaMemberName: "); //$NON-NLS-1$
    result.append(validJavaMemberName);
    result.append(", generateCode: "); //$NON-NLS-1$
    if (generateCodeESet) result.append(generateCode); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", featureMapQualifiedClassName: "); //$NON-NLS-1$
    result.append(featureMapQualifiedClassName);
    result.append(", featureMapSimpleClassName: "); //$NON-NLS-1$
    result.append(featureMapSimpleClassName);
    result.append(", many: "); //$NON-NLS-1$
    if (manyESet) result.append(many); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", useList: "); //$NON-NLS-1$
    if (useListESet) result.append(useList); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", reference: "); //$NON-NLS-1$
    if (referenceESet) result.append(reference); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", boolean: "); //$NON-NLS-1$
    if (booleanESet) result.append(boolean_); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", primitive: "); //$NON-NLS-1$
    if (primitiveESet) result.append(primitive); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

  /**
   * @return the member features of this EStructuralFeatures and the member features of the member features, recursively
   */
  public List<EStructuralFeatureModelGenAnnotation> getAllMemberFeatureMapFeatures() {
    final List<EStructuralFeatureModelGenAnnotation> collectedFeatureAnnotations = new ArrayList<EStructuralFeatureModelGenAnnotation>();
    collectMemberFeatures(collectedFeatureAnnotations);
    return collectedFeatureAnnotations;
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#
   * collectMemberFeatures(java.util.List)
   */
  public void collectMemberFeatures(List<EStructuralFeatureModelGenAnnotation> collectedFeatureAnnotations) {
    for (EStructuralFeatureModelGenAnnotation featureAnnotation : getMemberFeatureMapFeatures()) {
      if (!collectedFeatureAnnotations.contains(featureAnnotation)) {
        collectedFeatureAnnotations.add(featureAnnotation);
        featureAnnotation.collectMemberFeatures(collectedFeatureAnnotations);
      }
    }
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    return getJavaAnnotationFromEAnnotation(annotationProvider, identifier);
  }
} // EAttributeModelGenAnnotation
