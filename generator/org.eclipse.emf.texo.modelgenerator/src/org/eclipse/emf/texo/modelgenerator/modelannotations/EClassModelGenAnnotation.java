/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassModelGenAnnotation.java,v 1.15 2011/10/25 13:19:30 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EClass Model Gen Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasManyFeatures <em>Has Many Features</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getClassExtends <em>Class Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasSuperEClass <em>Has Super EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getClassImplements <em>Class Implements</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isSerializable <em>Serializable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getSuperEClass <em>Super EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getFeatureMapFeatures <em>Feature Map Features</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getEStructuralFeatureModelGenAnnotations <em>EStructural Feature Model Gen Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoQualifiedClassName <em>Dao Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoFinders <em>Dao Finders</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getEAllStructuralFeatureModelGenAnnotations <em>EAll Structural Feature Model Gen Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation()
 * @model kind="class"
 * @generated
 */
public class EClassModelGenAnnotation extends EClassAnnotation implements EClassifierModelGenAnnotation {
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
   * The default value of the '{@link #isHasManyFeatures() <em>Has Many Features</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isHasManyFeatures()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_MANY_FEATURES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasManyFeatures() <em>Has Many Features</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isHasManyFeatures()
   * @generated
   * @ordered
   */
  protected boolean hasManyFeatures = HAS_MANY_FEATURES_EDEFAULT;

  /**
   * This is true if the Has Many Features attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean hasManyFeaturesESet;

  /**
   * The cached value of the '{@link #getClassExtends() <em>Class Extends</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExtends()
   * @generated
   * @ordered
   */
  protected EList<String> classExtends;

  /**
   * The default value of the '{@link #isHasSuperEClass() <em>Has Super EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSuperEClass()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_SUPER_ECLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasSuperEClass() <em>Has Super EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSuperEClass()
   * @generated
   * @ordered
   */
  protected boolean hasSuperEClass = HAS_SUPER_ECLASS_EDEFAULT;

  /**
   * This is true if the Has Super EClass attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean hasSuperEClassESet;

  /**
   * The cached value of the '{@link #getClassImplements() <em>Class Implements</em>}' attribute list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getClassImplements()
   * @generated
   * @ordered
   */
  protected EList<String> classImplements;

  /**
   * The default value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isSerializable()
   * @generated
   * @ordered
   */
  protected static final boolean SERIALIZABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isSerializable()
   * @generated
   * @ordered
   */
  protected boolean serializable = SERIALIZABLE_EDEFAULT;

  /**
   * This is true if the Serializable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean serializableESet;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * This is true if the Abstract attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean abstractESet;

  /**
   * The cached value of the '{@link #getSuperEClass() <em>Super EClass</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSuperEClass()
   * @generated
   * @ordered
   */
  protected EClassModelGenAnnotation superEClass;

  /**
   * The cached value of the '{@link #getFeatureMapFeatures() <em>Feature Map Features</em>}' reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getFeatureMapFeatures()
   * @generated
   * @ordered
   */
  protected EList<EStructuralFeatureModelGenAnnotation> featureMapFeatures;

  /**
   * The cached value of the '{@link #getEStructuralFeatureModelGenAnnotations() <em>EStructural Feature Model Gen Annotations</em>}' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getEStructuralFeatureModelGenAnnotations()
   * @generated
   * @ordered
   */
  protected EList<EStructuralFeatureModelGenAnnotation> eStructuralFeatureModelGenAnnotations;

  /**
   * The default value of the '{@link #getDaoQualifiedClassName() <em>Dao Qualified Class Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDaoQualifiedClassName()
   * @generated
   * @ordered
   */
  protected static final String DAO_QUALIFIED_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDaoQualifiedClassName() <em>Dao Qualified Class Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDaoQualifiedClassName()
   * @generated
   * @ordered
   */
  protected String daoQualifiedClassName = DAO_QUALIFIED_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDaoFinders() <em>Dao Finders</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDaoFinders()
   * @generated
   * @ordered
   */
  protected DaoFinderDefinition daoFinders;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EClassModelGenAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION;
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  public void setDocumentation(String newDocumentation) {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION, oldDocumentation, documentation));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME, oldName, name));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Class Name</em>' attribute.
   * @see #getQualifiedClassName()
   * @generated
   */
  public void setQualifiedClassName(String newQualifiedClassName) {
    String oldQualifiedClassName = qualifiedClassName;
    qualifiedClassName = newQualifiedClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Class Name</em>' attribute.
   * @see #getSimpleClassName()
   * @generated
   */
  public void setSimpleClassName(String newSimpleClassName) {
    String oldSimpleClassName = simpleClassName;
    simpleClassName = newSimpleClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME, oldSimpleClassName, simpleClassName));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, generateCode, !oldGenerateCodeESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE, oldGenerateCode, GENERATE_CODE_EDEFAULT, oldGenerateCodeESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isGenerateCode <em>Generate Code</em>}' attribute is set.
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION, oldOwnerEPackageAnnotation, ownerEPackageAnnotation));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getOwnerEPackageAnnotation <em>Owner EPackage Annotation</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner EPackage Annotation</em>' reference.
   * @see #getOwnerEPackageAnnotation()
   * @generated
   */
  public void setOwnerEPackageAnnotation(EPackageModelGenAnnotation newOwnerEPackageAnnotation) {
    EPackageModelGenAnnotation oldOwnerEPackageAnnotation = ownerEPackageAnnotation;
    ownerEPackageAnnotation = newOwnerEPackageAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION, oldOwnerEPackageAnnotation, ownerEPackageAnnotation));
  }

  /**
   * Returns the value of the '<em><b>Has Many Features</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Many Features</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Many Features</em>' attribute.
   * @see #isSetHasManyFeatures()
   * @see #unsetHasManyFeatures()
   * @see #setHasManyFeatures(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_HasManyFeatures()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isHasManyFeatures() {
    return hasManyFeatures;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasManyFeatures <em>Has Many Features</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Many Features</em>' attribute.
   * @see #isSetHasManyFeatures()
   * @see #unsetHasManyFeatures()
   * @see #isHasManyFeatures()
   * @generated
   */
  public void setHasManyFeatures(boolean newHasManyFeatures) {
    boolean oldHasManyFeatures = hasManyFeatures;
    hasManyFeatures = newHasManyFeatures;
    boolean oldHasManyFeaturesESet = hasManyFeaturesESet;
    hasManyFeaturesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES, oldHasManyFeatures, hasManyFeatures, !oldHasManyFeaturesESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasManyFeatures <em>Has Many Features</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHasManyFeatures()
   * @see #isHasManyFeatures()
   * @see #setHasManyFeatures(boolean)
   * @generated
   */
  public void unsetHasManyFeatures() {
    boolean oldHasManyFeatures = hasManyFeatures;
    boolean oldHasManyFeaturesESet = hasManyFeaturesESet;
    hasManyFeatures = HAS_MANY_FEATURES_EDEFAULT;
    hasManyFeaturesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES, oldHasManyFeatures, HAS_MANY_FEATURES_EDEFAULT, oldHasManyFeaturesESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasManyFeatures <em>Has Many Features</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Has Many Features</em>' attribute is set.
   * @see #unsetHasManyFeatures()
   * @see #isHasManyFeatures()
   * @see #setHasManyFeatures(boolean)
   * @generated
   */
  public boolean isSetHasManyFeatures() {
    return hasManyFeaturesESet;
  }

  /**
   * Returns the value of the '<em><b>Class Extends</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Extends</em>' attribute list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Extends</em>' attribute list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_ClassExtends()
   * @model unique="false"
   * @generated
   */
  public EList<String> getClassExtends() {
    if (classExtends == null) {
      classExtends = new EDataTypeEList<String>(String.class, this, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS);
    }
    return classExtends;
  }

  /**
   * Returns the value of the '<em><b>Has Super EClass</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Super EClass</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Super EClass</em>' attribute.
   * @see #isSetHasSuperEClass()
   * @see #unsetHasSuperEClass()
   * @see #setHasSuperEClass(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_HasSuperEClass()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isHasSuperEClass() {
    return hasSuperEClass;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasSuperEClass <em>Has Super EClass</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Super EClass</em>' attribute.
   * @see #isSetHasSuperEClass()
   * @see #unsetHasSuperEClass()
   * @see #isHasSuperEClass()
   * @generated
   */
  public void setHasSuperEClass(boolean newHasSuperEClass) {
    boolean oldHasSuperEClass = hasSuperEClass;
    hasSuperEClass = newHasSuperEClass;
    boolean oldHasSuperEClassESet = hasSuperEClassESet;
    hasSuperEClassESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS, oldHasSuperEClass, hasSuperEClass, !oldHasSuperEClassESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasSuperEClass <em>Has Super EClass</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHasSuperEClass()
   * @see #isHasSuperEClass()
   * @see #setHasSuperEClass(boolean)
   * @generated
   */
  public void unsetHasSuperEClass() {
    boolean oldHasSuperEClass = hasSuperEClass;
    boolean oldHasSuperEClassESet = hasSuperEClassESet;
    hasSuperEClass = HAS_SUPER_ECLASS_EDEFAULT;
    hasSuperEClassESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS, oldHasSuperEClass, HAS_SUPER_ECLASS_EDEFAULT, oldHasSuperEClassESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasSuperEClass <em>Has Super EClass</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Has Super EClass</em>' attribute is set.
   * @see #unsetHasSuperEClass()
   * @see #isHasSuperEClass()
   * @see #setHasSuperEClass(boolean)
   * @generated
   */
  public boolean isSetHasSuperEClass() {
    return hasSuperEClassESet;
  }

  /**
   * Returns the value of the '<em><b>Class Implements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Implements</em>' attribute list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Implements</em>' attribute list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_ClassImplements()
   * @model unique="false"
   * @generated
   */
  public EList<String> getClassImplements() {
    if (classImplements == null) {
      classImplements = new EDataTypeEList<String>(String.class, this, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS);
    }
    return classImplements;
  }

  /**
   * Returns the value of the '<em><b>Serializable</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Serializable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Serializable</em>' attribute.
   * @see #isSetSerializable()
   * @see #unsetSerializable()
   * @see #setSerializable(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_Serializable()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isSerializable() {
    return serializable;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isSerializable <em>Serializable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Serializable</em>' attribute.
   * @see #isSetSerializable()
   * @see #unsetSerializable()
   * @see #isSerializable()
   * @generated
   */
  public void setSerializable(boolean newSerializable) {
    boolean oldSerializable = serializable;
    serializable = newSerializable;
    boolean oldSerializableESet = serializableESet;
    serializableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE, oldSerializable, serializable, !oldSerializableESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isSerializable <em>Serializable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSerializable()
   * @see #isSerializable()
   * @see #setSerializable(boolean)
   * @generated
   */
  public void unsetSerializable() {
    boolean oldSerializable = serializable;
    boolean oldSerializableESet = serializableESet;
    serializable = SERIALIZABLE_EDEFAULT;
    serializableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE, oldSerializable, SERIALIZABLE_EDEFAULT, oldSerializableESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isSerializable <em>Serializable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Serializable</em>' attribute is set.
   * @see #unsetSerializable()
   * @see #isSerializable()
   * @see #setSerializable(boolean)
   * @generated
   */
  public boolean isSetSerializable() {
    return serializableESet;
  }

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #isSetAbstract()
   * @see #unsetAbstract()
   * @see #setAbstract(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_Abstract()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isAbstract() {
    return abstract_;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isSetAbstract()
   * @see #unsetAbstract()
   * @see #isAbstract()
   * @generated
   */
  public void setAbstract(boolean newAbstract) {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    boolean oldAbstractESet = abstractESet;
    abstractESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAbstract()
   * @see #isAbstract()
   * @see #setAbstract(boolean)
   * @generated
   */
  public void unsetAbstract() {
    boolean oldAbstract = abstract_;
    boolean oldAbstractESet = abstractESet;
    abstract_ = ABSTRACT_EDEFAULT;
    abstractESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isAbstract <em>Abstract</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Abstract</em>' attribute is set.
   * @see #unsetAbstract()
   * @see #isAbstract()
   * @see #setAbstract(boolean)
   * @generated
   */
  public boolean isSetAbstract() {
    return abstractESet;
  }

  /**
   * Returns the value of the '<em><b>Super EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super EClass</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super EClass</em>' reference.
   * @see #setSuperEClass(EClassModelGenAnnotation)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_SuperEClass()
   * @model transient="true"
   * @generated
   */
  public EClassModelGenAnnotation getSuperEClass() {
    if (superEClass != null && superEClass.eIsProxy()) {
      InternalEObject oldSuperEClass = (InternalEObject)superEClass;
      superEClass = (EClassModelGenAnnotation)eResolveProxy(oldSuperEClass);
      if (superEClass != oldSuperEClass) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS, oldSuperEClass, superEClass));
      }
    }
    return superEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClassModelGenAnnotation basicGetSuperEClass() {
    return superEClass;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getSuperEClass <em>Super EClass</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Super EClass</em>' reference.
   * @see #getSuperEClass()
   * @generated
   */
  public void setSuperEClass(EClassModelGenAnnotation newSuperEClass) {
    EClassModelGenAnnotation oldSuperEClass = superEClass;
    superEClass = newSuperEClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS, oldSuperEClass, superEClass));
  }

  /**
   * Returns the value of the '<em><b>Feature Map Features</b></em>' reference list. The list contents are of type
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Features</em>' reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Feature Map Features</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_FeatureMapFeatures()
   * @model changeable="false"
   * @generated
   */
  public EList<EStructuralFeatureModelGenAnnotation> getFeatureMapFeatures() {
    if (featureMapFeatures == null) {
      featureMapFeatures = new EObjectResolvingEList<EStructuralFeatureModelGenAnnotation>(EStructuralFeatureModelGenAnnotation.class, this, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES);
    }
    return featureMapFeatures;
  }

  /**
   * Returns the value of the '<em><b>EStructural Feature Model Gen Annotations</b></em>' reference list. The list
   * contents are of type
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EStructural Feature Model Gen Annotations</em>' reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>EStructural Feature Model Gen Annotations</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_EStructuralFeatureModelGenAnnotations()
   * @model transient="true" changeable="false"
   * @generated
   */
  public EList<EStructuralFeatureModelGenAnnotation> getEStructuralFeatureModelGenAnnotations() {
    if (eStructuralFeatureModelGenAnnotations == null) {
      eStructuralFeatureModelGenAnnotations = new EObjectResolvingEList<EStructuralFeatureModelGenAnnotation>(EStructuralFeatureModelGenAnnotation.class, this, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS);
    }
    return eStructuralFeatureModelGenAnnotations;
  }

  /**
   * Returns the value of the '<em><b>Dao Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dao Qualified Class Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dao Qualified Class Name</em>' attribute.
   * @see #setDaoQualifiedClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_DaoQualifiedClassName()
   * @model unique="false"
   * @generated
   */
  public String getDaoQualifiedClassName() {
    return daoQualifiedClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoQualifiedClassName <em>Dao Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Dao Qualified Class Name</em>' attribute.
   * @see #getDaoQualifiedClassName()
   * @generated
   */
  public void setDaoQualifiedClassName(String newDaoQualifiedClassName) {
    String oldDaoQualifiedClassName = daoQualifiedClassName;
    daoQualifiedClassName = newDaoQualifiedClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME, oldDaoQualifiedClassName, daoQualifiedClassName));
  }

  /**
   * Returns the value of the '<em><b>Dao Finders</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dao Finders</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dao Finders</em>' reference.
   * @see #setDaoFinders(DaoFinderDefinition)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_DaoFinders()
   * @model
   * @generated
   */
  public DaoFinderDefinition getDaoFinders() {
    if (daoFinders != null && daoFinders.eIsProxy()) {
      InternalEObject oldDaoFinders = (InternalEObject)daoFinders;
      daoFinders = (DaoFinderDefinition)eResolveProxy(oldDaoFinders);
      if (daoFinders != oldDaoFinders) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS, oldDaoFinders, daoFinders));
      }
    }
    return daoFinders;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DaoFinderDefinition basicGetDaoFinders() {
    return daoFinders;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoFinders <em>Dao Finders</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Dao Finders</em>' reference.
   * @see #getDaoFinders()
   * @generated
   */
  public void setDaoFinders(DaoFinderDefinition newDaoFinders) {
    DaoFinderDefinition oldDaoFinders = daoFinders;
    daoFinders = newDaoFinders;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS, oldDaoFinders, daoFinders));
  }

  /**
   * Returns the value of the '<em><b>EAll Structural Feature Model Gen Annotations</b></em>' reference list. The list
   * contents are of type
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Structural Feature Model Gen Annotations</em>' reference list isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>EAll Structural Feature Model Gen Annotations</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation_EAllStructuralFeatureModelGenAnnotations()
   * @model transient="true" changeable="false" volatile="true"
   * @generatedNOT
   */
  public EList<EStructuralFeatureModelGenAnnotation> getEAllStructuralFeatureModelGenAnnotations() {
    final EList<EStructuralFeatureModelGenAnnotation> result = new EObjectEList<EStructuralFeatureModelGenAnnotation>(
        EStructuralFeatureModelGenAnnotation.class, this,
        ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__EALL_STRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS);
    if (getSuperEClass() != null) {
      result.addAll(getSuperEClass().getEAllStructuralFeatureModelGenAnnotations());
    }
    result.addAll(getEStructuralFeatureModelGenAnnotations());
    return result;
  }

  public EList<EStructuralFeatureModelGenAnnotation> getTestEStructuralFeatureModelGenAnnotations() {
    final EList<EStructuralFeatureModelGenAnnotation> localEStructuralFeatureModelGenAnnotations = new EObjectEList<EStructuralFeatureModelGenAnnotation>(
        EStructuralFeatureModelGenAnnotation.class, this,
        ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS);

    for (AnnotatedEStructuralFeature aFeature : getAnnotatedEClass().getAnnotatedEStructuralFeatures()) {
      for (ENamedElementAnnotation featureAnnotation : aFeature.getAllAnnotations()) {
        if (featureAnnotation instanceof EStructuralFeatureModelGenAnnotation
            && !localEStructuralFeatureModelGenAnnotations.contains(featureAnnotation)) {
          localEStructuralFeatureModelGenAnnotations.add((EStructuralFeatureModelGenAnnotation) featureAnnotation);
        }
      }
    }

    // and collect the ones from superclasses which are not inherited
    for (EClass eSuperEClass : getEClass().getESuperTypes()) {
      if (eSuperEClass != getSuperEClass()) {
        final AnnotatedEClass annotatedESuperClass = getAnnotatedEClass().getAnnotatedEPackage().getAnnotatedModel()
            .getAnnotatedEClass(eSuperEClass, true);
        // and get the features
        for (AnnotatedEStructuralFeature aFeature : annotatedESuperClass.getAnnotatedEStructuralFeatures()) {
          for (ENamedElementAnnotation featureAnnotation : aFeature.getAllAnnotations()) {
            if (featureAnnotation instanceof EStructuralFeatureModelGenAnnotation
                && !localEStructuralFeatureModelGenAnnotations.contains(featureAnnotation)) {
              localEStructuralFeatureModelGenAnnotations.add((EStructuralFeatureModelGenAnnotation) featureAnnotation);
            }
          }
        }

      }
    }
    return localEStructuralFeatureModelGenAnnotations;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return getDocumentation();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME:
        return getName();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        return getQualifiedClassName();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        return getSimpleClassName();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isGenerateCode();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        if (resolve) return getOwnerEPackageAnnotation();
        return basicGetOwnerEPackageAnnotation();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES:
        return isHasManyFeatures();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS:
        return getClassExtends();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS:
        return isHasSuperEClass();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS:
        return getClassImplements();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE:
        return isSerializable();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT:
        return isAbstract();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS:
        if (resolve) return getSuperEClass();
        return basicGetSuperEClass();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES:
        return getFeatureMapFeatures();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS:
        return getEStructuralFeatureModelGenAnnotations();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME:
        return getDaoQualifiedClassName();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS:
        if (resolve) return getDaoFinders();
        return basicGetDaoFinders();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__EALL_STRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS:
        return getEAllStructuralFeatureModelGenAnnotations();
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
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        setQualifiedClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        setSimpleClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        setGenerateCode((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        setOwnerEPackageAnnotation((EPackageModelGenAnnotation)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES:
        setHasManyFeatures((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS:
        getClassExtends().clear();
        getClassExtends().addAll((Collection<? extends String>)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS:
        setHasSuperEClass((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS:
        getClassImplements().clear();
        getClassImplements().addAll((Collection<? extends String>)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE:
        setSerializable((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS:
        setSuperEClass((EClassModelGenAnnotation)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME:
        setDaoQualifiedClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS:
        setDaoFinders((DaoFinderDefinition)newValue);
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
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        setSimpleClassName(SIMPLE_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        unsetGenerateCode();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        setOwnerEPackageAnnotation((EPackageModelGenAnnotation)null);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES:
        unsetHasManyFeatures();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS:
        getClassExtends().clear();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS:
        unsetHasSuperEClass();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS:
        getClassImplements().clear();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE:
        unsetSerializable();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT:
        unsetAbstract();
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS:
        setSuperEClass((EClassModelGenAnnotation)null);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME:
        setDaoQualifiedClassName(DAO_QUALIFIED_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS:
        setDaoFinders((DaoFinderDefinition)null);
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
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        return SIMPLE_CLASS_NAME_EDEFAULT == null ? simpleClassName != null : !SIMPLE_CLASS_NAME_EDEFAULT.equals(simpleClassName);
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE:
        return isSetGenerateCode();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION:
        return ownerEPackageAnnotation != null;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES:
        return isSetHasManyFeatures();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS:
        return classExtends != null && !classExtends.isEmpty();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS:
        return isSetHasSuperEClass();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS:
        return classImplements != null && !classImplements.isEmpty();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE:
        return isSetSerializable();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT:
        return isSetAbstract();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS:
        return superEClass != null;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES:
        return featureMapFeatures != null && !featureMapFeatures.isEmpty();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS:
        return eStructuralFeatureModelGenAnnotations != null && !eStructuralFeatureModelGenAnnotations.isEmpty();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME:
        return DAO_QUALIFIED_CLASS_NAME_EDEFAULT == null ? daoQualifiedClassName != null : !DAO_QUALIFIED_CLASS_NAME_EDEFAULT.equals(daoQualifiedClassName);
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS:
        return daoFinders != null;
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__EALL_STRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS:
        return !getEAllStructuralFeatureModelGenAnnotations().isEmpty();
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
        case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EClassifierModelGenAnnotation.class) {
      switch (derivedFeatureID) {
        case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION: return ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION;
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
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == EClassifierModelGenAnnotation.class) {
      switch (baseFeatureID) {
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME: return ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME;
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME: return ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME;
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE: return ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE;
        case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION: return ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION;
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
    result.append(", hasManyFeatures: "); //$NON-NLS-1$
    if (hasManyFeaturesESet) result.append(hasManyFeatures); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", classExtends: "); //$NON-NLS-1$
    result.append(classExtends);
    result.append(", hasSuperEClass: "); //$NON-NLS-1$
    if (hasSuperEClassESet) result.append(hasSuperEClass); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", classImplements: "); //$NON-NLS-1$
    result.append(classImplements);
    result.append(", serializable: "); //$NON-NLS-1$
    if (serializableESet) result.append(serializable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", abstract: "); //$NON-NLS-1$
    if (abstractESet) result.append(abstract_); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", daoQualifiedClassName: "); //$NON-NLS-1$
    result.append(daoQualifiedClassName);
    result.append(')');
    return result.toString();
  }

  public boolean getAbstractValue() {
    return abstract_;
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    return getJavaAnnotationFromEAnnotation(annotationProvider, identifier);
  }

  public boolean getAddSuppressUnchecked() {
    for (EStructuralFeatureModelGenAnnotation annotation : getEStructuralFeatureModelGenAnnotations()) {
      if (!annotation.getEStructuralFeature().isChangeable() || annotation.getEStructuralFeature().isTransient()
          || annotation.getEStructuralFeature().isVolatile()) {
        continue;
      }
      if (annotation.getObjectType().contains("java.util.List")) { //$NON-NLS-1$
        return true;
      }
    }
    return false;
  }

} // EClassModelGenAnnotation
