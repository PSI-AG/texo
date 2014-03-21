/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnumModelGenAnnotation.java,v 1.11 2011/10/25 13:19:30 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EEnum Model Gen Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEEnumModelGenAnnotation()
 * @model kind="class"
 * @generated
 */
public class EEnumModelGenAnnotation extends EEnumAnnotation implements EDataTypeModelGenAnnotationDefinition {
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
   * The default value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getQualifiedClassName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getQualifiedClassName()
   * @generated
   * @ordered
   */
  protected String qualifiedClassName = QUALIFIED_CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSimpleClassName() <em>Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getSimpleClassName()
   * @generated
   * @ordered
   */
  protected static final String SIMPLE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSimpleClassName() <em>Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getSimpleClassName()
   * @generated
   * @ordered
   */
  protected String simpleClassName = SIMPLE_CLASS_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getOwnerEPackageAnnotation() <em>Owner EPackage Annotation</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOwnerEPackageAnnotation()
   * @generated
   * @ordered
   */
  protected EPackageModelGenAnnotation ownerEPackageAnnotation;

  /**
   * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInstanceClassName()
   * @generated
   * @ordered
   */
  protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInstanceClassName()
   * @generated
   * @ordered
   */
  protected String instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getObjectClassName() <em>Object Class Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getObjectClassName()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectClassName() <em>Object Class Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getObjectClassName()
   * @generated
   * @ordered
   */
  protected String objectClassName = OBJECT_CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isEnum() <em>Enum</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isEnum()
   * @generated
   * @ordered
   */
  protected static final boolean ENUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnum() <em>Enum</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isEnum()
   * @generated
   * @ordered
   */
  protected boolean enum_ = ENUM_EDEFAULT;

  /**
   * This is true if the Enum attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean enumESet;

  /**
   * The default value of the '{@link #isDateType() <em>Date Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDateType()
   * @generated
   * @ordered
   */
  protected static final boolean DATE_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDateType() <em>Date Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDateType()
   * @generated
   * @ordered
   */
  protected boolean dateType = DATE_TYPE_EDEFAULT;

  /**
   * This is true if the Date Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean dateTypeESet;

  /**
   * The default value of the '{@link #isAutomaticStringConversion() <em>Automatic String Conversion</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isAutomaticStringConversion()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOMATIC_STRING_CONVERSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutomaticStringConversion() <em>Automatic String Conversion</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isAutomaticStringConversion()
   * @generated
   * @ordered
   */
  protected boolean automaticStringConversion = AUTOMATIC_STRING_CONVERSION_EDEFAULT;

  /**
   * This is true if the Automatic String Conversion attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean automaticStringConversionESet;

  /**
   * The cached value of the '{@link #getBaseTypeAnnotation() <em>Base Type Annotation</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getBaseTypeAnnotation()
   * @generated
   * @ordered
   */
  protected EDataTypeModelGenAnnotationDefinition baseTypeAnnotation;

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EEnumModelGenAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelcodegeneratorPackage.Literals.EENUM_MODEL_GEN_ANNOTATION;
  }

  /**
   * Returns the value of the '<em><b>Annotated EData Type</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations <em>EData Type Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EData Type</em>' container reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotated EData Type</em>' container reference.
   * @see #setAnnotatedEDataType(AnnotatedEDataType)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeAnnotation_AnnotatedEDataType()
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations
   * @model opposite="eDataTypeAnnotations" transient="false"
   * @generated
   */
  public AnnotatedEDataType getAnnotatedEDataType() {
    if (eContainerFeatureID() != ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE) return null;
    return (AnnotatedEDataType)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotatedEDataType(AnnotatedEDataType newAnnotatedEDataType, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newAnnotatedEDataType, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE, msgs);
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getAnnotatedEDataType <em>Annotated EData Type</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotated EData Type</em>' container reference.
   * @see #getAnnotatedEDataType()
   * @generated
   */
  public void setAnnotatedEDataType(AnnotatedEDataType newAnnotatedEDataType) {
    if (newAnnotatedEDataType != eInternalContainer() || (eContainerFeatureID() != ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE && newAnnotatedEDataType != null)) {
      if (EcoreUtil.isAncestor(this, newAnnotatedEDataType))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAnnotatedEDataType != null)
        msgs = ((InternalEObject)newAnnotatedEDataType).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotatedEDataType.class, msgs);
      msgs = basicSetAnnotatedEDataType(newAnnotatedEDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE, newAnnotatedEDataType, newAnnotatedEDataType));
  }

  /**
   * Returns the value of the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EData Type</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EData Type</em>' reference.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeAnnotation_EDataType()
   * @model required="true" transient="true" changeable="false" volatile="true"
   * @generated
   */
  public EDataType getEDataType() {
    EDataType eDataType = basicGetEDataType();
    return eDataType != null && eDataType.eIsProxy() ? (EDataType)eResolveProxy((InternalEObject)eDataType) : eDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EDataType basicGetEDataType() {
    return getEEnum();
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  public void setDocumentation(String newDocumentation) {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION, oldDocumentation, documentation));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME, oldName, name));
  }

  /**
   * Returns the value of the '<em><b>Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Class Name</em>' attribute.
   * @see #setQualifiedClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_QualifiedClassName()
   * @model unique="false"
   * @generated
   */
  public String getQualifiedClassName() {
    return qualifiedClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Class Name</em>' attribute.
   * @see #getQualifiedClassName()
   * @generated
   */
  public void setQualifiedClassName(String newQualifiedClassName) {
    String oldQualifiedClassName = qualifiedClassName;
    qualifiedClassName = newQualifiedClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
  }

  /**
   * Returns the value of the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Class Name</em>' attribute.
   * @see #setSimpleClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_SimpleClassName()
   * @model unique="false"
   * @generated
   */
  public String getSimpleClassName() {
    return simpleClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Class Name</em>' attribute.
   * @see #getSimpleClassName()
   * @generated
   */
  public void setSimpleClassName(String newSimpleClassName) {
    String oldSimpleClassName = simpleClassName;
    simpleClassName = newSimpleClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME, oldSimpleClassName, simpleClassName));
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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_GenerateCode()
   * @model default="true" unique="false" unsettable="true"
   * @generated
   */
  public boolean isGenerateCode() {
    return generateCode;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, generateCode, !oldGenerateCodeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, GENERATE_CODE_EDEFAULT, oldGenerateCodeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner EPackage Annotation</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner EPackage Annotation</em>' reference.
   * @see #setOwnerEPackageAnnotation(EPackageModelGenAnnotation)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation_OwnerEPackageAnnotation()
   * @model ordered="false"
   * @generated
   */
  public EPackageModelGenAnnotation getOwnerEPackageAnnotation() {
    if (ownerEPackageAnnotation != null && ownerEPackageAnnotation.eIsProxy()) {
      InternalEObject oldOwnerEPackageAnnotation = (InternalEObject)ownerEPackageAnnotation;
      ownerEPackageAnnotation = (EPackageModelGenAnnotation)eResolveProxy(oldOwnerEPackageAnnotation);
      if (ownerEPackageAnnotation != oldOwnerEPackageAnnotation) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION, oldOwnerEPackageAnnotation, ownerEPackageAnnotation));
      }
    }
    return ownerEPackageAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EPackageModelGenAnnotation basicGetOwnerEPackageAnnotation() {
    return ownerEPackageAnnotation;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getOwnerEPackageAnnotation <em>Owner EPackage Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner EPackage Annotation</em>' reference.
   * @see #getOwnerEPackageAnnotation()
   * @generated
   */
  public void setOwnerEPackageAnnotation(EPackageModelGenAnnotation newOwnerEPackageAnnotation) {
    EPackageModelGenAnnotation oldOwnerEPackageAnnotation = ownerEPackageAnnotation;
    ownerEPackageAnnotation = newOwnerEPackageAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION, oldOwnerEPackageAnnotation, ownerEPackageAnnotation));
  }

  /**
   * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Class Name</em>' attribute.
   * @see #setInstanceClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_InstanceClassName()
   * @model unique="false" transient="true"
   * @generated
   */
  public String getInstanceClassName() {
    return instanceClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getInstanceClassName <em>Instance Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Class Name</em>' attribute.
   * @see #getInstanceClassName()
   * @generated
   */
  public void setInstanceClassName(String newInstanceClassName) {
    String oldInstanceClassName = instanceClassName;
    instanceClassName = newInstanceClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME, oldInstanceClassName, instanceClassName));
  }

  /**
   * Returns the value of the '<em><b>Object Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Class Name</em>' attribute.
   * @see #setObjectClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_ObjectClassName()
   * @model unique="false" transient="true"
   * @generated
   */
  public String getObjectClassName() {
    return objectClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getObjectClassName <em>Object Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Class Name</em>' attribute.
   * @see #getObjectClassName()
   * @generated
   */
  public void setObjectClassName(String newObjectClassName) {
    String oldObjectClassName = objectClassName;
    objectClassName = newObjectClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME, oldObjectClassName, objectClassName));
  }

  /**
   * Returns the value of the '<em><b>Enum</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enum</em>' attribute.
   * @see #isSetEnum()
   * @see #unsetEnum()
   * @see #setEnum(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_Enum()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isEnum() {
    return enum_;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #isSetEnum()
   * @see #unsetEnum()
   * @see #isEnum()
   * @generated
   */
  public void setEnum(boolean newEnum) {
    boolean oldEnum = enum_;
    enum_ = newEnum;
    boolean oldEnumESet = enumESet;
    enumESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM, oldEnum, enum_, !oldEnumESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnum()
   * @see #isEnum()
   * @see #setEnum(boolean)
   * @generated
   */
  public void unsetEnum() {
    boolean oldEnum = enum_;
    boolean oldEnumESet = enumESet;
    enum_ = ENUM_EDEFAULT;
    enumESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM, oldEnum, ENUM_EDEFAULT, oldEnumESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isEnum <em>Enum</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enum</em>' attribute is set.
   * @see #unsetEnum()
   * @see #isEnum()
   * @see #setEnum(boolean)
   * @generated
   */
  public boolean isSetEnum() {
    return enumESet;
  }

  /**
   * Returns the value of the '<em><b>Date Type</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Date Type</em>' attribute.
   * @see #isSetDateType()
   * @see #unsetDateType()
   * @see #setDateType(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_DateType()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isDateType() {
    return dateType;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isDateType <em>Date Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Type</em>' attribute.
   * @see #isSetDateType()
   * @see #unsetDateType()
   * @see #isDateType()
   * @generated
   */
  public void setDateType(boolean newDateType) {
    boolean oldDateType = dateType;
    dateType = newDateType;
    boolean oldDateTypeESet = dateTypeESet;
    dateTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE, oldDateType, dateType, !oldDateTypeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isDateType <em>Date Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDateType()
   * @see #isDateType()
   * @see #setDateType(boolean)
   * @generated
   */
  public void unsetDateType() {
    boolean oldDateType = dateType;
    boolean oldDateTypeESet = dateTypeESet;
    dateType = DATE_TYPE_EDEFAULT;
    dateTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE, oldDateType, DATE_TYPE_EDEFAULT, oldDateTypeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isDateType <em>Date Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Date Type</em>' attribute is set.
   * @see #unsetDateType()
   * @see #isDateType()
   * @see #setDateType(boolean)
   * @generated
   */
  public boolean isSetDateType() {
    return dateTypeESet;
  }

  /**
   * Returns the value of the '<em><b>Automatic String Conversion</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Automatic String Conversion</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Automatic String Conversion</em>' attribute.
   * @see #isSetAutomaticStringConversion()
   * @see #unsetAutomaticStringConversion()
   * @see #setAutomaticStringConversion(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_AutomaticStringConversion()
   * @model default="false" unsettable="true"
   * @generated
   */
  public boolean isAutomaticStringConversion() {
    return automaticStringConversion;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isAutomaticStringConversion <em>Automatic String Conversion</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Automatic String Conversion</em>' attribute.
   * @see #isSetAutomaticStringConversion()
   * @see #unsetAutomaticStringConversion()
   * @see #isAutomaticStringConversion()
   * @generated
   */
  public void setAutomaticStringConversion(boolean newAutomaticStringConversion) {
    boolean oldAutomaticStringConversion = automaticStringConversion;
    automaticStringConversion = newAutomaticStringConversion;
    boolean oldAutomaticStringConversionESet = automaticStringConversionESet;
    automaticStringConversionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION, oldAutomaticStringConversion, automaticStringConversion, !oldAutomaticStringConversionESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isAutomaticStringConversion <em>Automatic String Conversion</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAutomaticStringConversion()
   * @see #isAutomaticStringConversion()
   * @see #setAutomaticStringConversion(boolean)
   * @generated
   */
  public void unsetAutomaticStringConversion() {
    boolean oldAutomaticStringConversion = automaticStringConversion;
    boolean oldAutomaticStringConversionESet = automaticStringConversionESet;
    automaticStringConversion = AUTOMATIC_STRING_CONVERSION_EDEFAULT;
    automaticStringConversionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION, oldAutomaticStringConversion, AUTOMATIC_STRING_CONVERSION_EDEFAULT, oldAutomaticStringConversionESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#isAutomaticStringConversion <em>Automatic String Conversion</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Automatic String Conversion</em>' attribute is set.
   * @see #unsetAutomaticStringConversion()
   * @see #isAutomaticStringConversion()
   * @see #setAutomaticStringConversion(boolean)
   * @generated
   */
  public boolean isSetAutomaticStringConversion() {
    return automaticStringConversionESet;
  }

  /**
   * Returns the value of the '<em><b>Base Type Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type Annotation</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type Annotation</em>' reference.
   * @see #setBaseTypeAnnotation(EDataTypeModelGenAnnotationDefinition)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_BaseTypeAnnotation()
   * @model transient="true"
   * @generated
   */
  public EDataTypeModelGenAnnotationDefinition getBaseTypeAnnotation() {
    if (baseTypeAnnotation != null && baseTypeAnnotation.eIsProxy()) {
      InternalEObject oldBaseTypeAnnotation = (InternalEObject)baseTypeAnnotation;
      baseTypeAnnotation = (EDataTypeModelGenAnnotationDefinition)eResolveProxy(oldBaseTypeAnnotation);
      if (baseTypeAnnotation != oldBaseTypeAnnotation) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION, oldBaseTypeAnnotation, baseTypeAnnotation));
      }
    }
    return baseTypeAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataTypeModelGenAnnotationDefinition basicGetBaseTypeAnnotation() {
    return baseTypeAnnotation;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getBaseTypeAnnotation <em>Base Type Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type Annotation</em>' reference.
   * @see #getBaseTypeAnnotation()
   * @generated
   */
  public void setBaseTypeAnnotation(EDataTypeModelGenAnnotationDefinition newBaseTypeAnnotation) {
    EDataTypeModelGenAnnotationDefinition oldBaseTypeAnnotation = baseTypeAnnotation;
    baseTypeAnnotation = newBaseTypeAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION, oldBaseTypeAnnotation, baseTypeAnnotation));
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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition_ItemType()
   * @model unique="false" unsettable="true" required="true" transient="true"
   * @generated
   */
  public String getItemType() {
    return itemType;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE, oldItemType, itemType, !oldItemTypeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getItemType <em>Item Type</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE, oldItemType, ITEM_TYPE_EDEFAULT, oldItemTypeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation#getItemType <em>Item Type</em>}' attribute is set.
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetAnnotatedEDataType((AnnotatedEDataType)otherEnd, msgs);
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
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return basicSetAnnotatedEDataType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotatedEDataType.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return getAnnotatedEDataType();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__EDATA_TYPE:
        if (resolve) return getEDataType();
        return basicGetEDataType();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return getDocumentation();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME:
        return getName();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        return getQualifiedClassName();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        return getSimpleClassName();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isGenerateCode();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        if (resolve) return getOwnerEPackageAnnotation();
        return basicGetOwnerEPackageAnnotation();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME:
        return getInstanceClassName();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME:
        return getObjectClassName();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM:
        return isEnum();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE:
        return isDateType();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION:
        return isAutomaticStringConversion();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION:
        if (resolve) return getBaseTypeAnnotation();
        return basicGetBaseTypeAnnotation();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        return getItemType();
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
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        setAnnotatedEDataType((AnnotatedEDataType)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        setQualifiedClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        setSimpleClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        setGenerateCode((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        setOwnerEPackageAnnotation((EPackageModelGenAnnotation)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME:
        setInstanceClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME:
        setObjectClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM:
        setEnum((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE:
        setDateType((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION:
        setAutomaticStringConversion((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION:
        setBaseTypeAnnotation((EDataTypeModelGenAnnotationDefinition)newValue);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        setItemType((String)newValue);
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
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        setAnnotatedEDataType((AnnotatedEDataType)null);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        setSimpleClassName(SIMPLE_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        unsetGenerateCode();
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        setOwnerEPackageAnnotation((EPackageModelGenAnnotation)null);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME:
        setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME:
        setObjectClassName(OBJECT_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM:
        unsetEnum();
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE:
        unsetDateType();
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION:
        unsetAutomaticStringConversion();
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION:
        setBaseTypeAnnotation((EDataTypeModelGenAnnotationDefinition)null);
        return;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        unsetItemType();
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
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return getAnnotatedEDataType() != null;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__EDATA_TYPE:
        return basicGetEDataType() != null;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        return SIMPLE_CLASS_NAME_EDEFAULT == null ? simpleClassName != null : !SIMPLE_CLASS_NAME_EDEFAULT.equals(simpleClassName);
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isSetGenerateCode();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        return ownerEPackageAnnotation != null;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME:
        return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null : !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME:
        return OBJECT_CLASS_NAME_EDEFAULT == null ? objectClassName != null : !OBJECT_CLASS_NAME_EDEFAULT.equals(objectClassName);
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM:
        return isSetEnum();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE:
        return isSetDateType();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION:
        return isSetAutomaticStringConversion();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION:
        return baseTypeAnnotation != null;
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE:
        return isSetItemType();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == EDataTypeAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE: return AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__EDATA_TYPE: return AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE;
        default: return -1;
      }
    }
    if (baseClass == ENamedElementModelGenAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EClassifierModelGenAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION;
        default: return -1;
      }
    }
    if (baseClass == EDataTypeModelGenAnnotationDefinition.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__INSTANCE_CLASS_NAME;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OBJECT_CLASS_NAME;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENUM;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DATE_TYPE;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__AUTOMATIC_STRING_CONVERSION;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__BASE_TYPE_ANNOTATION;
        case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE: return ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ITEM_TYPE;
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
    if (baseClass == EDataTypeAnnotation.class) {
      switch (baseFeatureID) {
        case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE;
        case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__EDATA_TYPE;
        default: return -1;
      }
    }
    if (baseClass == ENamedElementModelGenAnnotation.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EClassifierModelGenAnnotation.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION;
        default: return -1;
      }
    }
    if (baseClass == EDataTypeModelGenAnnotationDefinition.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__INSTANCE_CLASS_NAME: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME;
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OBJECT_CLASS_NAME: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME;
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENUM: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ENUM;
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DATE_TYPE: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE;
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__AUTOMATIC_STRING_CONVERSION: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION;
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__BASE_TYPE_ANNOTATION: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION;
        case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ITEM_TYPE: return ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE;
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
    result.append(", qualifiedClassName: "); //$NON-NLS-1$
    result.append(qualifiedClassName);
    result.append(", simpleClassName: "); //$NON-NLS-1$
    result.append(simpleClassName);
    result.append(", generateCode: "); //$NON-NLS-1$
    if (generateCodeESet) result.append(generateCode); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", instanceClassName: "); //$NON-NLS-1$
    result.append(instanceClassName);
    result.append(", objectClassName: "); //$NON-NLS-1$
    result.append(objectClassName);
    result.append(", enum: "); //$NON-NLS-1$
    if (enumESet) result.append(enum_); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", dateType: "); //$NON-NLS-1$
    if (dateTypeESet) result.append(dateType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", automaticStringConversion: "); //$NON-NLS-1$
    if (automaticStringConversionESet) result.append(automaticStringConversion); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", itemType: "); //$NON-NLS-1$
    if (itemTypeESet) result.append(itemType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    return getJavaAnnotationFromEAnnotation(annotationProvider, identifier);
  }

} // EEnumModelGenAnnotation
