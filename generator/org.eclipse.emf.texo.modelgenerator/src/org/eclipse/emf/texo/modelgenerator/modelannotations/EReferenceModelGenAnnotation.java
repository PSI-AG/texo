/**
 * <copyright>
 * </copyright>
 *
 * $Id: EReferenceModelGenAnnotation.java,v 1.16 2011/10/25 13:19:30 mtaal Exp $
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
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EReference Model Gen Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getOppositeModelGenAnnotation <em>Opposite Model Gen Annotation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEReferenceModelGenAnnotation()
 * @model kind="class"
 * @generated
 */
public class EReferenceModelGenAnnotation extends EReferenceAnnotation implements EStructuralFeatureModelGenAnnotation {
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
   * The cached value of the '{@link #getOppositeModelGenAnnotation() <em>Opposite Model Gen Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getOppositeModelGenAnnotation()
   * @generated
   * @ordered
   */
  protected EReferenceModelGenAnnotation oppositeModelGenAnnotation;

  /**
   * The default value of the '{@link #isGenerateSafeManyAccess() <em>Generate Safe Many Access</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateSafeManyAccess()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_SAFE_MANY_ACCESS_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isGenerateSafeManyAccess() <em>Generate Safe Many Access</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateSafeManyAccess()
   * @generated
   * @ordered
   */
  protected boolean generateSafeManyAccess = GENERATE_SAFE_MANY_ACCESS_EDEFAULT;

  /**
   * This is true if the Generate Safe Many Access attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean generateSafeManyAccessESet;

  /**
   * The default value of the '{@link #isGenerateBidirectionalAssociationSupport() <em>Generate Bidirectional Association Support</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isGenerateBidirectionalAssociationSupport()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isGenerateBidirectionalAssociationSupport() <em>Generate Bidirectional Association Support</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isGenerateBidirectionalAssociationSupport()
   * @generated
   * @ordered
   */
  protected boolean generateBidirectionalAssociationSupport = GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT_EDEFAULT;

  /**
   * This is true if the Generate Bidirectional Association Support attribute has been set.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean generateBidirectionalAssociationSupportESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EReferenceModelGenAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelcodegeneratorPackage.Literals.EREFERENCE_MODEL_GEN_ANNOTATION;
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  public void setDocumentation(String newDocumentation) {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION, oldDocumentation, documentation));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME, oldName, name));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getGetter <em>Getter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Getter</em>' attribute.
   * @see #getGetter()
   * @generated
   */
  public void setGetter(String newGetter) {
    String oldGetter = getter;
    getter = newGetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER, oldGetter, getter));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE, oldType, type));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  public void setObjectType(String newObjectType) {
    String oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE, oldObjectType, objectType));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE, oldItemType, itemType, !oldItemTypeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE, oldItemType, ITEM_TYPE_EDEFAULT, oldItemTypeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getItemType <em>Item Type</em>}' attribute is set.
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  public void setDefaultValue(String newDefaultValue) {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getSetter <em>Setter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Setter</em>' attribute.
   * @see #getSetter()
   * @generated
   */
  public void setSetter(String newSetter) {
    String oldSetter = setter;
    setter = newSetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER, oldSetter, setter));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getValidJavaMemberName <em>Valid Java Member Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid Java Member Name</em>' attribute.
   * @see #getValidJavaMemberName()
   * @generated
   */
  public void setValidJavaMemberName(String newValidJavaMemberName) {
    String oldValidJavaMemberName = validJavaMemberName;
    validJavaMemberName = newValidJavaMemberName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME, oldValidJavaMemberName, validJavaMemberName));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, generateCode, !oldGenerateCodeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, GENERATE_CODE_EDEFAULT, oldGenerateCodeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute is set.
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getFeatureMapQualifiedClassName <em>Feature Map Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Qualified Class Name</em>' attribute.
   * @see #getFeatureMapQualifiedClassName()
   * @generated
   */
  public void setFeatureMapQualifiedClassName(String newFeatureMapQualifiedClassName) {
    String oldFeatureMapQualifiedClassName = featureMapQualifiedClassName;
    featureMapQualifiedClassName = newFeatureMapQualifiedClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME, oldFeatureMapQualifiedClassName, featureMapQualifiedClassName));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getFeatureMapSimpleClassName <em>Feature Map Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Simple Class Name</em>' attribute.
   * @see #getFeatureMapSimpleClassName()
   * @generated
   */
  public void setFeatureMapSimpleClassName(String newFeatureMapSimpleClassName) {
    String oldFeatureMapSimpleClassName = featureMapSimpleClassName;
    featureMapSimpleClassName = newFeatureMapSimpleClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME, oldFeatureMapSimpleClassName, featureMapSimpleClassName));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE, oldFeatureMapFeature, featureMapFeature));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE, oldFeatureMapFeature, newFeatureMapFeature);
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
      memberFeatureMapFeatures = new EObjectWithInverseResolvingEList<EStructuralFeatureModelGenAnnotation>(EStructuralFeatureModelGenAnnotation.class, this, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES, ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE);
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isMany <em>Many</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY, oldMany, many, !oldManyESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isMany <em>Many</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY, oldMany, MANY_EDEFAULT, oldManyESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isMany <em>Many</em>}' attribute is set.
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isUseList <em>Use List</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST, oldUseList, useList, !oldUseListESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isUseList <em>Use List</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST, oldUseList, USE_LIST_EDEFAULT, oldUseListESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isUseList <em>Use List</em>}' attribute is set.
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isReference <em>Reference</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE, oldReference, reference, !oldReferenceESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isReference <em>Reference</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE, oldReference, REFERENCE_EDEFAULT, oldReferenceESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isReference <em>Reference</em>}' attribute is set.
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION, oldOwnerEClassAnnotation, ownerEClassAnnotation));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getOwnerEClassAnnotation <em>Owner EClass Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner EClass Annotation</em>' reference.
   * @see #getOwnerEClassAnnotation()
   * @generated
   */
  public void setOwnerEClassAnnotation(EClassModelGenAnnotation newOwnerEClassAnnotation) {
    EClassModelGenAnnotation oldOwnerEClassAnnotation = ownerEClassAnnotation;
    ownerEClassAnnotation = newOwnerEClassAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION, oldOwnerEClassAnnotation, ownerEClassAnnotation));
  }

  /**
   * Returns the value of the '<em><b>Opposite Model Gen Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite Model Gen Annotation</em>' reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite Model Gen Annotation</em>' reference.
   * @see #setOppositeModelGenAnnotation(EReferenceModelGenAnnotation)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEReferenceModelGenAnnotation_OppositeModelGenAnnotation()
   * @model transient="true"
   * @generated
   */
  public EReferenceModelGenAnnotation getOppositeModelGenAnnotation() {
    if (oppositeModelGenAnnotation != null && oppositeModelGenAnnotation.eIsProxy()) {
      InternalEObject oldOppositeModelGenAnnotation = (InternalEObject)oppositeModelGenAnnotation;
      oppositeModelGenAnnotation = (EReferenceModelGenAnnotation)eResolveProxy(oldOppositeModelGenAnnotation);
      if (oppositeModelGenAnnotation != oldOppositeModelGenAnnotation) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION, oldOppositeModelGenAnnotation, oppositeModelGenAnnotation));
      }
    }
    return oppositeModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReferenceModelGenAnnotation basicGetOppositeModelGenAnnotation() {
    return oppositeModelGenAnnotation;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getOppositeModelGenAnnotation <em>Opposite Model Gen Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite Model Gen Annotation</em>' reference.
   * @see #getOppositeModelGenAnnotation()
   * @generated
   */
  public void setOppositeModelGenAnnotation(EReferenceModelGenAnnotation newOppositeModelGenAnnotation) {
    EReferenceModelGenAnnotation oldOppositeModelGenAnnotation = oppositeModelGenAnnotation;
    oppositeModelGenAnnotation = newOppositeModelGenAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION, oldOppositeModelGenAnnotation, oppositeModelGenAnnotation));
  }

  /**
   * Returns the value of the '<em><b>Generate Safe Many Access</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Safe Many Access</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Safe Many Access</em>' attribute.
   * @see #isSetGenerateSafeManyAccess()
   * @see #unsetGenerateSafeManyAccess()
   * @see #setGenerateSafeManyAccess(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEReferenceModelGenAnnotation_GenerateSafeManyAccess()
   * @model default="true" unsettable="true"
   * @generated
   */
  public boolean isGenerateSafeManyAccess() {
    return generateSafeManyAccess;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Safe Many Access</em>' attribute.
   * @see #isSetGenerateSafeManyAccess()
   * @see #unsetGenerateSafeManyAccess()
   * @see #isGenerateSafeManyAccess()
   * @generated
   */
  public void setGenerateSafeManyAccess(boolean newGenerateSafeManyAccess) {
    boolean oldGenerateSafeManyAccess = generateSafeManyAccess;
    generateSafeManyAccess = newGenerateSafeManyAccess;
    boolean oldGenerateSafeManyAccessESet = generateSafeManyAccessESet;
    generateSafeManyAccessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS, oldGenerateSafeManyAccess, generateSafeManyAccess, !oldGenerateSafeManyAccessESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenerateSafeManyAccess()
   * @see #isGenerateSafeManyAccess()
   * @see #setGenerateSafeManyAccess(boolean)
   * @generated
   */
  public void unsetGenerateSafeManyAccess() {
    boolean oldGenerateSafeManyAccess = generateSafeManyAccess;
    boolean oldGenerateSafeManyAccessESet = generateSafeManyAccessESet;
    generateSafeManyAccess = GENERATE_SAFE_MANY_ACCESS_EDEFAULT;
    generateSafeManyAccessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS, oldGenerateSafeManyAccess, GENERATE_SAFE_MANY_ACCESS_EDEFAULT, oldGenerateSafeManyAccessESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Generate Safe Many Access</em>' attribute is set.
   * @see #unsetGenerateSafeManyAccess()
   * @see #isGenerateSafeManyAccess()
   * @see #setGenerateSafeManyAccess(boolean)
   * @generated
   */
  public boolean isSetGenerateSafeManyAccess() {
    return generateSafeManyAccessESet;
  }

  /**
   * Returns the value of the '<em><b>Generate Bidirectional Association Support</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Bidirectional Association Support</em>' attribute isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Bidirectional Association Support</em>' attribute.
   * @see #isSetGenerateBidirectionalAssociationSupport()
   * @see #unsetGenerateBidirectionalAssociationSupport()
   * @see #setGenerateBidirectionalAssociationSupport(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEReferenceModelGenAnnotation_GenerateBidirectionalAssociationSupport()
   * @model default="true" unsettable="true"
   * @generated
   */
  public boolean isGenerateBidirectionalAssociationSupport() {
    return generateBidirectionalAssociationSupport;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Bidirectional Association Support</em>' attribute.
   * @see #isSetGenerateBidirectionalAssociationSupport()
   * @see #unsetGenerateBidirectionalAssociationSupport()
   * @see #isGenerateBidirectionalAssociationSupport()
   * @generated
   */
  public void setGenerateBidirectionalAssociationSupport(boolean newGenerateBidirectionalAssociationSupport) {
    boolean oldGenerateBidirectionalAssociationSupport = generateBidirectionalAssociationSupport;
    generateBidirectionalAssociationSupport = newGenerateBidirectionalAssociationSupport;
    boolean oldGenerateBidirectionalAssociationSupportESet = generateBidirectionalAssociationSupportESet;
    generateBidirectionalAssociationSupportESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT, oldGenerateBidirectionalAssociationSupport, generateBidirectionalAssociationSupport, !oldGenerateBidirectionalAssociationSupportESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenerateBidirectionalAssociationSupport()
   * @see #isGenerateBidirectionalAssociationSupport()
   * @see #setGenerateBidirectionalAssociationSupport(boolean)
   * @generated
   */
  public void unsetGenerateBidirectionalAssociationSupport() {
    boolean oldGenerateBidirectionalAssociationSupport = generateBidirectionalAssociationSupport;
    boolean oldGenerateBidirectionalAssociationSupportESet = generateBidirectionalAssociationSupportESet;
    generateBidirectionalAssociationSupport = GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT_EDEFAULT;
    generateBidirectionalAssociationSupportESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT, oldGenerateBidirectionalAssociationSupport, GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT_EDEFAULT, oldGenerateBidirectionalAssociationSupportESet));
  }

  /**
   * Returns whether the value of the '
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateBidirectionalAssociationSupport
   * <em>Generate Bidirectional Association Support</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return whether the value of the '<em>Generate Bidirectional Association Support</em>' attribute is set.
   * @see #unsetGenerateBidirectionalAssociationSupport()
   * @see #isGenerateBidirectionalAssociationSupport()
   * @see #setGenerateBidirectionalAssociationSupport(boolean)
   * @generated
   */
  public boolean isSetGenerateBidirectionalAssociationSupport() {
    return generateBidirectionalAssociationSupportESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        if (featureMapFeature != null)
          msgs = ((InternalEObject)featureMapFeature).eInverseRemove(this, ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES, EStructuralFeatureModelGenAnnotation.class, msgs);
        return basicSetFeatureMapFeature((EStructuralFeatureModelGenAnnotation)otherEnd, msgs);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
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
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        return basicSetFeatureMapFeature(null, msgs);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
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
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return getDocumentation();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME:
        return getName();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER:
        return getGetter();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE:
        return getType();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        return getObjectType();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        return getItemType();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        return getDefaultValue();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER:
        return getSetter();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        return getValidJavaMemberName();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isGenerateCode();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        return getFeatureMapQualifiedClassName();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        return getFeatureMapSimpleClassName();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        if (resolve) return getFeatureMapFeature();
        return basicGetFeatureMapFeature();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
        return getMemberFeatureMapFeatures();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY:
        return isMany();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST:
        return isUseList();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE:
        return isReference();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        if (resolve) return getOwnerEClassAnnotation();
        return basicGetOwnerEClassAnnotation();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION:
        if (resolve) return getOppositeModelGenAnnotation();
        return basicGetOppositeModelGenAnnotation();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        return isGenerateSafeManyAccess();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        return isGenerateBidirectionalAssociationSupport();
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
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER:
        setGetter((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE:
        setType((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        setObjectType((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        setItemType((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER:
        setSetter((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        setValidJavaMemberName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        setGenerateCode((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        setFeatureMapQualifiedClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        setFeatureMapSimpleClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY:
        setMany((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST:
        setUseList((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE:
        setReference((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        setOwnerEClassAnnotation((EClassModelGenAnnotation)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION:
        setOppositeModelGenAnnotation((EReferenceModelGenAnnotation)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        setGenerateSafeManyAccess((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        setGenerateBidirectionalAssociationSupport((Boolean)newValue);
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
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER:
        setGetter(GETTER_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        setObjectType(OBJECT_TYPE_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        unsetItemType();
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER:
        setSetter(SETTER_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        setValidJavaMemberName(VALID_JAVA_MEMBER_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        unsetGenerateCode();
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        setFeatureMapQualifiedClassName(FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        setFeatureMapSimpleClassName(FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY:
        unsetMany();
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST:
        unsetUseList();
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE:
        unsetReference();
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        setOwnerEClassAnnotation((EClassModelGenAnnotation)null);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION:
        setOppositeModelGenAnnotation((EReferenceModelGenAnnotation)null);
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        unsetGenerateSafeManyAccess();
        return;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        unsetGenerateBidirectionalAssociationSupport();
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
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER:
        return GETTER_EDEFAULT == null ? getter != null : !GETTER_EDEFAULT.equals(getter);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
        return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        return isSetItemType();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER:
        return SETTER_EDEFAULT == null ? setter != null : !SETTER_EDEFAULT.equals(setter);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
        return VALID_JAVA_MEMBER_NAME_EDEFAULT == null ? validJavaMemberName != null : !VALID_JAVA_MEMBER_NAME_EDEFAULT.equals(validJavaMemberName);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isSetGenerateCode();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
        return FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT == null ? featureMapQualifiedClassName != null : !FEATURE_MAP_QUALIFIED_CLASS_NAME_EDEFAULT.equals(featureMapQualifiedClassName);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
        return FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT == null ? featureMapSimpleClassName != null : !FEATURE_MAP_SIMPLE_CLASS_NAME_EDEFAULT.equals(featureMapSimpleClassName);
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE:
        return featureMapFeature != null;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES:
        return memberFeatureMapFeatures != null && !memberFeatureMapFeatures.isEmpty();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY:
        return isSetMany();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST:
        return isSetUseList();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE:
        return isSetReference();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION:
        return ownerEClassAnnotation != null;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION:
        return oppositeModelGenAnnotation != null;
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        return isSetGenerateSafeManyAccess();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        return isSetGenerateBidirectionalAssociationSupport();
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
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureModelGenAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE;
        case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION: return ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION;
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
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureModelGenAnnotation.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE;
        case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION: return ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION;
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
    result.append(", generateSafeManyAccess: "); //$NON-NLS-1$
    if (generateSafeManyAccessESet) result.append(generateSafeManyAccess); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", generateBidirectionalAssociationSupport: "); //$NON-NLS-1$
    if (generateBidirectionalAssociationSupportESet) result.append(generateBidirectionalAssociationSupport); else result.append("<unset>"); //$NON-NLS-1$
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

} // EReferenceModelGenAnnotation
