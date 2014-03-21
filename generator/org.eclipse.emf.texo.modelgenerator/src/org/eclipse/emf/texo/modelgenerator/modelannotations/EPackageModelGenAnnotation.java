/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageModelGenAnnotation.java,v 1.22 2011/10/25 13:19:30 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EPackage Model Gen Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isAddRuntimeModelBehavior <em>Add Runtime Model Behavior</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateInterfaces <em>Generate Interfaces</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelClassesPackagePath <em>Model Classes Package Path</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleModelFactoryClassName <em>Simple Model Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileContent <em>Ecore File Content</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileName <em>Ecore File Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getJavaFileHeader <em>Java File Header</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEClassModelGenAnnotations <em>EClass Model Gen Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEDataTypeModelGenAnnotations <em>EData Type Model Gen Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEEnumModelGenAnnotations <em>EEnum Model Gen Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEClassifierModelGenAnnotations <em>EClassifier Model Gen Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelPackageClassNamePostFix <em>Model Package Class Name Post Fix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelFactoryClassNamePostFix <em>Model Factory Class Name Post Fix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureGroupClassNamePostFix <em>Feature Group Class Name Post Fix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootClassExtends <em>Root Class Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootInterfaceExtends <em>Root Interface Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureMapClassExtends <em>Feature Map Class Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isHandleEcoreFile <em>Handle Ecore File</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoClassesPackagePath <em>Dao Classes Package Path</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoPatternName <em>Dao Pattern Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoRootClass <em>Dao Root Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSubPackageModelGens <em>Sub Package Model Gens</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation()
 * @model kind="class"
 * @generated
 */
public class EPackageModelGenAnnotation extends EPackageAnnotation implements ENamedElementModelGenAnnotation {

  private static String defaultExtends = null;

  /**
   * Is used during test code generation to give all generated classes a super class which has an id and version.
   * 
   * @param value
   */
  public static void setDefaultExtends(String value) {
    defaultExtends = value;
  }

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
   * The default value of the '{@link #isAddRuntimeModelBehavior() <em>Add Runtime Model Behavior</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isAddRuntimeModelBehavior()
   * @generated
   * @ordered
   */
  protected static final boolean ADD_RUNTIME_MODEL_BEHAVIOR_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isAddRuntimeModelBehavior() <em>Add Runtime Model Behavior</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isAddRuntimeModelBehavior()
   * @generated
   * @ordered
   */
  protected boolean addRuntimeModelBehavior = ADD_RUNTIME_MODEL_BEHAVIOR_EDEFAULT;

  /**
   * This is true if the Add Runtime Model Behavior attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean addRuntimeModelBehaviorESet;

  /**
   * The default value of the '{@link #isGenerateInterfaces() <em>Generate Interfaces</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateInterfaces()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_INTERFACES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGenerateInterfaces() <em>Generate Interfaces</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateInterfaces()
   * @generated
   * @ordered
   */
  protected boolean generateInterfaces = GENERATE_INTERFACES_EDEFAULT;

  /**
   * This is true if the Generate Interfaces attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean generateInterfacesESet;

  /**
   * The default value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPackagePath()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPackagePath()
   * @generated
   * @ordered
   */
  protected String packagePath = PACKAGE_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getModelClassesPackagePath() <em>Model Classes Package Path</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getModelClassesPackagePath()
   * @generated
   * @ordered
   */
  protected static final String MODEL_CLASSES_PACKAGE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelClassesPackagePath() <em>Model Classes Package Path</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getModelClassesPackagePath()
   * @generated
   * @ordered
   */
  protected String modelClassesPackagePath = MODEL_CLASSES_PACKAGE_PATH_EDEFAULT;

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
   * The default value of the '{@link #getSimpleModelFactoryClassName() <em>Simple Model Factory Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getSimpleModelFactoryClassName()
   * @generated
   * @ordered
   */
  protected static final String SIMPLE_MODEL_FACTORY_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSimpleModelFactoryClassName() <em>Simple Model Factory Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getSimpleModelFactoryClassName()
   * @generated
   * @ordered
   */
  protected String simpleModelFactoryClassName = SIMPLE_MODEL_FACTORY_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDependsOn()
   * @generated
   * @ordered
   */
  protected EList<EPackageModelGenAnnotation> dependsOn;

  /**
   * The default value of the '{@link #getEcoreFileContent() <em>Ecore File Content</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getEcoreFileContent()
   * @generated
   * @ordered
   */
  protected static final String ECORE_FILE_CONTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEcoreFileContent() <em>Ecore File Content</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getEcoreFileContent()
   * @generated
   * @ordered
   */
  protected String ecoreFileContent = ECORE_FILE_CONTENT_EDEFAULT;

  /**
   * The default value of the '{@link #getEcoreFileName() <em>Ecore File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreFileName()
   * @generated
   * @ordered
   */
  protected static final String ECORE_FILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEcoreFileName() <em>Ecore File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreFileName()
   * @generated
   * @ordered
   */
  protected String ecoreFileName = ECORE_FILE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getJavaFileHeader() <em>Java File Header</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getJavaFileHeader()
   * @generated
   * @ordered
   */
  protected static final String JAVA_FILE_HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaFileHeader() <em>Java File Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaFileHeader()
   * @generated
   * @ordered
   */
  protected String javaFileHeader = JAVA_FILE_HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getModelPackageClassNamePostFix() <em>Model Package Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getModelPackageClassNamePostFix()
   * @generated
   * @ordered
   */
  protected static final String MODEL_PACKAGE_CLASS_NAME_POST_FIX_EDEFAULT = "ModelPackage"; //$NON-NLS-1$

  /**
   * The cached value of the '{@link #getModelPackageClassNamePostFix() <em>Model Package Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getModelPackageClassNamePostFix()
   * @generated
   * @ordered
   */
  protected String modelPackageClassNamePostFix = MODEL_PACKAGE_CLASS_NAME_POST_FIX_EDEFAULT;

  /**
   * The default value of the '{@link #getModelFactoryClassNamePostFix() <em>Model Factory Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getModelFactoryClassNamePostFix()
   * @generated
   * @ordered
   */
  protected static final String MODEL_FACTORY_CLASS_NAME_POST_FIX_EDEFAULT = "ModelFactory"; //$NON-NLS-1$

  /**
   * The cached value of the '{@link #getModelFactoryClassNamePostFix() <em>Model Factory Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getModelFactoryClassNamePostFix()
   * @generated
   * @ordered
   */
  protected String modelFactoryClassNamePostFix = MODEL_FACTORY_CLASS_NAME_POST_FIX_EDEFAULT;

  /**
   * The default value of the '{@link #getFeatureGroupClassNamePostFix() <em>Feature Group Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFeatureGroupClassNamePostFix()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_GROUP_CLASS_NAME_POST_FIX_EDEFAULT = "FeatureGroup"; //$NON-NLS-1$

  /**
   * The cached value of the '{@link #getFeatureGroupClassNamePostFix() <em>Feature Group Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFeatureGroupClassNamePostFix()
   * @generated
   * @ordered
   */
  protected String featureGroupClassNamePostFix = FEATURE_GROUP_CLASS_NAME_POST_FIX_EDEFAULT;

  /**
   * The default value of the '{@link #isGenerateSafeManyAccess() <em>Generate Safe Many Access</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateSafeManyAccess()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_SAFE_MANY_ACCESS_EDEFAULT = false;

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
   * The default value of the '{@link #getRootClassExtends() <em>Root Class Extends</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRootClassExtends()
   * @generated
   * @ordered
   */
  protected static final String ROOT_CLASS_EXTENDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRootClassExtends() <em>Root Class Extends</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRootClassExtends()
   * @generated
   * @ordered
   */
  protected String rootClassExtends = ROOT_CLASS_EXTENDS_EDEFAULT;

  /**
   * The default value of the '{@link #getRootInterfaceExtends() <em>Root Interface Extends</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRootInterfaceExtends()
   * @generated
   * @ordered
   */
  protected static final String ROOT_INTERFACE_EXTENDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRootInterfaceExtends() <em>Root Interface Extends</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRootInterfaceExtends()
   * @generated
   * @ordered
   */
  protected String rootInterfaceExtends = ROOT_INTERFACE_EXTENDS_EDEFAULT;

  /**
   * The default value of the '{@link #getFeatureMapClassExtends() <em>Feature Map Class Extends</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getFeatureMapClassExtends()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_MAP_CLASS_EXTENDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatureMapClassExtends() <em>Feature Map Class Extends</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getFeatureMapClassExtends()
   * @generated
   * @ordered
   */
  protected String featureMapClassExtends = FEATURE_MAP_CLASS_EXTENDS_EDEFAULT;

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
   * The default value of the '{@link #isHandleEcoreFile() <em>Handle Ecore File</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isHandleEcoreFile()
   * @generated
   * @ordered
   */
  protected static final boolean HANDLE_ECORE_FILE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isHandleEcoreFile() <em>Handle Ecore File</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isHandleEcoreFile()
   * @generated
   * @ordered
   */
  protected boolean handleEcoreFile = HANDLE_ECORE_FILE_EDEFAULT;

  /**
   * This is true if the Handle Ecore File attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean handleEcoreFileESet;

  /**
   * The default value of the '{@link #getDaoClassesPackagePath() <em>Dao Classes Package Path</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDaoClassesPackagePath()
   * @generated
   * @ordered
   */
  protected static final String DAO_CLASSES_PACKAGE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDaoClassesPackagePath() <em>Dao Classes Package Path</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDaoClassesPackagePath()
   * @generated
   * @ordered
   */
  protected String daoClassesPackagePath = DAO_CLASSES_PACKAGE_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getDaoPatternName() <em>Dao Pattern Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getDaoPatternName()
   * @generated
   * @ordered
   */
  protected static final String DAO_PATTERN_NAME_EDEFAULT = "dao"; //$NON-NLS-1$

  /**
   * The cached value of the '{@link #getDaoPatternName() <em>Dao Pattern Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaoPatternName()
   * @generated
   * @ordered
   */
  protected String daoPatternName = DAO_PATTERN_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDaoRootClass() <em>Dao Root Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaoRootClass()
   * @generated
   * @ordered
   */
  protected static final String DAO_ROOT_CLASS_EDEFAULT = ""; //$NON-NLS-1$

  /**
   * The cached value of the '{@link #getDaoRootClass() <em>Dao Root Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaoRootClass()
   * @generated
   * @ordered
   */
  protected String daoRootClass = DAO_ROOT_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubPackageModelGens() <em>Sub Package Model Gens</em>}' reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSubPackageModelGens()
   * @generated
   * @ordered
   */
  protected EList<EPackageModelGenAnnotation> subPackageModelGens;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected EPackageModelGenAnnotation() {
    super();
    if (defaultExtends != null) {
      setRootClassExtends(defaultExtends);
      setFeatureMapClassExtends(defaultExtends);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION;
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  public void setDocumentation(String newDocumentation) {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION, oldDocumentation, documentation));
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
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME, oldName, name));
  }

  /**
   * Returns the value of the '<em><b>Add Runtime Model Behavior</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Runtime Model Behavior</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Runtime Model Behavior</em>' attribute.
   * @see #isSetAddRuntimeModelBehavior()
   * @see #unsetAddRuntimeModelBehavior()
   * @see #setAddRuntimeModelBehavior(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_AddRuntimeModelBehavior()
   * @model default="true" unique="false" unsettable="true"
   * @generated
   */
  public boolean isAddRuntimeModelBehavior() {
    return addRuntimeModelBehavior;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isAddRuntimeModelBehavior <em>Add Runtime Model Behavior</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Runtime Model Behavior</em>' attribute.
   * @see #isSetAddRuntimeModelBehavior()
   * @see #unsetAddRuntimeModelBehavior()
   * @see #isAddRuntimeModelBehavior()
   * @generated
   */
  public void setAddRuntimeModelBehavior(boolean newAddRuntimeModelBehavior) {
    boolean oldAddRuntimeModelBehavior = addRuntimeModelBehavior;
    addRuntimeModelBehavior = newAddRuntimeModelBehavior;
    boolean oldAddRuntimeModelBehaviorESet = addRuntimeModelBehaviorESet;
    addRuntimeModelBehaviorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR, oldAddRuntimeModelBehavior, addRuntimeModelBehavior, !oldAddRuntimeModelBehaviorESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isAddRuntimeModelBehavior <em>Add Runtime Model Behavior</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddRuntimeModelBehavior()
   * @see #isAddRuntimeModelBehavior()
   * @see #setAddRuntimeModelBehavior(boolean)
   * @generated
   */
  public void unsetAddRuntimeModelBehavior() {
    boolean oldAddRuntimeModelBehavior = addRuntimeModelBehavior;
    boolean oldAddRuntimeModelBehaviorESet = addRuntimeModelBehaviorESet;
    addRuntimeModelBehavior = ADD_RUNTIME_MODEL_BEHAVIOR_EDEFAULT;
    addRuntimeModelBehaviorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR, oldAddRuntimeModelBehavior, ADD_RUNTIME_MODEL_BEHAVIOR_EDEFAULT, oldAddRuntimeModelBehaviorESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isAddRuntimeModelBehavior <em>Add Runtime Model Behavior</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Add Runtime Model Behavior</em>' attribute is set.
   * @see #unsetAddRuntimeModelBehavior()
   * @see #isAddRuntimeModelBehavior()
   * @see #setAddRuntimeModelBehavior(boolean)
   * @generated
   */
  public boolean isSetAddRuntimeModelBehavior() {
    return addRuntimeModelBehaviorESet;
  }

  /**
   * Returns the value of the '<em><b>Generate Interfaces</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Interfaces</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Interfaces</em>' attribute.
   * @see #isSetGenerateInterfaces()
   * @see #unsetGenerateInterfaces()
   * @see #setGenerateInterfaces(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_GenerateInterfaces()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  public boolean isGenerateInterfaces() {
    return generateInterfaces;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateInterfaces <em>Generate Interfaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Interfaces</em>' attribute.
   * @see #isSetGenerateInterfaces()
   * @see #unsetGenerateInterfaces()
   * @see #isGenerateInterfaces()
   * @generated
   */
  public void setGenerateInterfaces(boolean newGenerateInterfaces) {
    boolean oldGenerateInterfaces = generateInterfaces;
    generateInterfaces = newGenerateInterfaces;
    boolean oldGenerateInterfacesESet = generateInterfacesESet;
    generateInterfacesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES, oldGenerateInterfaces, generateInterfaces, !oldGenerateInterfacesESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateInterfaces <em>Generate Interfaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenerateInterfaces()
   * @see #isGenerateInterfaces()
   * @see #setGenerateInterfaces(boolean)
   * @generated
   */
  public void unsetGenerateInterfaces() {
    boolean oldGenerateInterfaces = generateInterfaces;
    boolean oldGenerateInterfacesESet = generateInterfacesESet;
    generateInterfaces = GENERATE_INTERFACES_EDEFAULT;
    generateInterfacesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES, oldGenerateInterfaces, GENERATE_INTERFACES_EDEFAULT, oldGenerateInterfacesESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateInterfaces <em>Generate Interfaces</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Generate Interfaces</em>' attribute is set.
   * @see #unsetGenerateInterfaces()
   * @see #isGenerateInterfaces()
   * @see #setGenerateInterfaces(boolean)
   * @generated
   */
  public boolean isSetGenerateInterfaces() {
    return generateInterfacesESet;
  }

  /**
   * Returns the value of the '<em><b>Package Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Path</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Path</em>' attribute.
   * @see #setPackagePath(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_PackagePath()
   * @model unique="false"
   * @generated
   */
  public String getPackagePath() {
    return packagePath;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getPackagePath <em>Package Path</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Path</em>' attribute.
   * @see #getPackagePath()
   * @generated
   */
  public void setPackagePath(String newPackagePath) {
    String oldPackagePath = packagePath;
    packagePath = newPackagePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH, oldPackagePath, packagePath));
  }

  /**
   * Returns the value of the '<em><b>Model Classes Package Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Classes Package Path</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Classes Package Path</em>' attribute.
   * @see #setModelClassesPackagePath(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_ModelClassesPackagePath()
   * @model unique="false"
   * @generated
   */
  public String getModelClassesPackagePath() {
    return modelClassesPackagePath;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelClassesPackagePath <em>Model Classes Package Path</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Classes Package Path</em>' attribute.
   * @see #getModelClassesPackagePath()
   * @generated
   */
  public void setModelClassesPackagePath(String newModelClassesPackagePath) {
    String oldModelClassesPackagePath = modelClassesPackagePath;
    modelClassesPackagePath = newModelClassesPackagePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH, oldModelClassesPackagePath, modelClassesPackagePath));
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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_QualifiedClassName()
   * @model unique="false"
   * @generated
   */
  public String getQualifiedClassName() {
    return qualifiedClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Class Name</em>' attribute.
   * @see #getQualifiedClassName()
   * @generated
   */
  public void setQualifiedClassName(String newQualifiedClassName) {
    String oldQualifiedClassName = qualifiedClassName;
    qualifiedClassName = newQualifiedClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_SimpleClassName()
   * @model unique="false"
   * @generated
   */
  public String getSimpleClassName() {
    return simpleClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Class Name</em>' attribute.
   * @see #getSimpleClassName()
   * @generated
   */
  public void setSimpleClassName(String newSimpleClassName) {
    String oldSimpleClassName = simpleClassName;
    simpleClassName = newSimpleClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME, oldSimpleClassName, simpleClassName));
  }

  /**
   * Returns the value of the '<em><b>Simple Model Factory Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Model Factory Class Name</em>' attribute isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Model Factory Class Name</em>' attribute.
   * @see #setSimpleModelFactoryClassName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_SimpleModelFactoryClassName()
   * @model unique="false"
   * @generated
   */
  public String getSimpleModelFactoryClassName() {
    return simpleModelFactoryClassName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleModelFactoryClassName <em>Simple Model Factory Class Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Model Factory Class Name</em>' attribute.
   * @see #getSimpleModelFactoryClassName()
   * @generated
   */
  public void setSimpleModelFactoryClassName(String newSimpleModelFactoryClassName) {
    String oldSimpleModelFactoryClassName = simpleModelFactoryClassName;
    simpleModelFactoryClassName = newSimpleModelFactoryClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME, oldSimpleModelFactoryClassName, simpleModelFactoryClassName));
  }

  /**
   * Returns the value of the '<em><b>Depends On</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On</em>' reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_DependsOn()
   * @model transient="true"
   * @generated
   */
  public EList<EPackageModelGenAnnotation> getDependsOn() {
    if (dependsOn == null) {
      dependsOn = new EObjectResolvingEList<EPackageModelGenAnnotation>(EPackageModelGenAnnotation.class, this, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON);
    }
    return dependsOn;
  }

  /**
   * Returns the value of the '<em><b>Ecore File Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore File Content</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore File Content</em>' attribute.
   * @see #setEcoreFileContent(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_EcoreFileContent()
   * @model unique="false" transient="true"
   * @generated
   */
  public String getEcoreFileContent() {
    return ecoreFileContent;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileContent <em>Ecore File Content</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore File Content</em>' attribute.
   * @see #getEcoreFileContent()
   * @generated
   */
  public void setEcoreFileContent(String newEcoreFileContent) {
    String oldEcoreFileContent = ecoreFileContent;
    ecoreFileContent = newEcoreFileContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT, oldEcoreFileContent, ecoreFileContent));
  }

  /**
   * Returns the value of the '<em><b>Ecore File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore File Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore File Name</em>' attribute.
   * @see #setEcoreFileName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_EcoreFileName()
   * @model unique="false"
   * @generated
   */
  public String getEcoreFileName() {
    return ecoreFileName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileName <em>Ecore File Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore File Name</em>' attribute.
   * @see #getEcoreFileName()
   * @generated
   */
  public void setEcoreFileName(String newEcoreFileName) {
    String oldEcoreFileName = ecoreFileName;
    ecoreFileName = newEcoreFileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME, oldEcoreFileName, ecoreFileName));
  }

  /**
   * Returns the value of the '<em><b>Java File Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java File Header</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java File Header</em>' attribute.
   * @see #setJavaFileHeader(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_JavaFileHeader()
   * @model
   * @generated
   */
  public String getJavaFileHeader() {
    return javaFileHeader;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getJavaFileHeader <em>Java File Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Java File Header</em>' attribute.
   * @see #getJavaFileHeader()
   * @generated
   */
  public void setJavaFileHeader(String newJavaFileHeader) {
    String oldJavaFileHeader = javaFileHeader;
    javaFileHeader = newJavaFileHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER, oldJavaFileHeader, javaFileHeader));
  }

  /**
   * Returns the value of the '<em><b>EClass Model Gen Annotations</b></em>' reference list. The list contents are of
   * type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass Model Gen Annotations</em>' reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>EClass Model Gen Annotations</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_EClassModelGenAnnotations()
   * @model transient="true" volatile="true"
   * @generatedNOT
   */
  public EList<EClassModelGenAnnotation> getEClassModelGenAnnotations() {
    final EList<EClassModelGenAnnotation> eClassModelGenAnnotations = new EObjectEList<EClassModelGenAnnotation>(
        EClassModelGenAnnotation.class, this,
        ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS);

    for (AnnotatedEClassifier aClassifier : getAnnotatedEPackage().getAnnotatedEClassifiers()) {
      for (ENamedElementAnnotation annotation : aClassifier.getAllAnnotations()) {
        if (annotation instanceof EClassModelGenAnnotation) {
          eClassModelGenAnnotations.add((EClassModelGenAnnotation) annotation);
        }
      }
    }
    return eClassModelGenAnnotations;
  }

  /**
   * Returns the value of the '<em><b>EData Type Model Gen Annotations</b></em>' reference list. The list contents are
   * of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition} . <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EData Type Model Gen Annotations</em>' reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>EData Type Model Gen Annotations</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_EDataTypeModelGenAnnotations()
   * @model transient="true" volatile="true"
   * @generatedNOT
   */
  public EList<EDataTypeModelGenAnnotationDefinition> getEDataTypeModelGenAnnotations() {
    final EList<EDataTypeModelGenAnnotationDefinition> eDataTypeModelGenAnnotations = new EObjectEList<EDataTypeModelGenAnnotationDefinition>(
        EDataTypeModelGenAnnotationDefinition.class, this,
        ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS);

    for (AnnotatedEClassifier aClassifier : getAnnotatedEPackage().getAnnotatedEClassifiers()) {
      for (ENamedElementAnnotation annotation : aClassifier.getAllAnnotations()) {
        if (annotation instanceof EDataTypeModelGenAnnotationDefinition) {
          eDataTypeModelGenAnnotations.add((EDataTypeModelGenAnnotationDefinition) annotation);
        }
      }
    }
    return eDataTypeModelGenAnnotations;
  }

  /**
   * Returns the value of the '<em><b>EEnum Model Gen Annotations</b></em>' reference list. The list contents are of
   * type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum Model Gen Annotations</em>' reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>EEnum Model Gen Annotations</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_EEnumModelGenAnnotations()
   * @model transient="true" volatile="true"
   * @generatedNOT
   */
  public EList<EEnumModelGenAnnotation> getEEnumModelGenAnnotations() {
    final EList<EEnumModelGenAnnotation> eEnumModelGenAnnotations = new EObjectEList<EEnumModelGenAnnotation>(
        EEnumModelGenAnnotation.class, this,
        ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS);

    for (AnnotatedEClassifier aClassifier : getAnnotatedEPackage().getAnnotatedEClassifiers()) {
      for (ENamedElementAnnotation annotation : aClassifier.getAllAnnotations()) {
        if (annotation instanceof EEnumModelGenAnnotation) {
          eEnumModelGenAnnotations.add((EEnumModelGenAnnotation) annotation);
        }
      }
    }
    return eEnumModelGenAnnotations;
  }

  /**
   * Returns the value of the '<em><b>EClassifier Model Gen Annotations</b></em>' reference list. The list contents are
   * of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClassifier Model Gen Annotations</em>' reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>EClassifier Model Gen Annotations</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_EClassifierModelGenAnnotations()
   * @model transient="true" volatile="true"
   * @generatedNOT
   */
  public EList<EClassifierModelGenAnnotation> getEClassifierModelGenAnnotations() {
    final EList<EClassifierModelGenAnnotation> eClassifierModelGenAnnotations = new EObjectEList<EClassifierModelGenAnnotation>(
        EClassifierModelGenAnnotation.class, this,
        ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS);

    for (AnnotatedEClassifier aClassifier : getAnnotatedEPackage().getAnnotatedEClassifiers()) {
      for (ENamedElementAnnotation annotation : aClassifier.getAllAnnotations()) {
        if (annotation instanceof EClassifierModelGenAnnotation) {
          eClassifierModelGenAnnotations.add((EClassifierModelGenAnnotation) annotation);
        }
      }
    }
    return eClassifierModelGenAnnotations;
  }

  /**
   * Returns the value of the '<em><b>Model Package Class Name Post Fix</b></em>' attribute.
   * The default value is <code>"ModelPackage"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Package Class Name Post Fix</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Package Class Name Post Fix</em>' attribute.
   * @see #setModelPackageClassNamePostFix(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_ModelPackageClassNamePostFix()
   * @model default="ModelPackage" unique="false"
   * @generated
   */
  public String getModelPackageClassNamePostFix() {
    return modelPackageClassNamePostFix;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelPackageClassNamePostFix <em>Model Package Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Package Class Name Post Fix</em>' attribute.
   * @see #getModelPackageClassNamePostFix()
   * @generated
   */
  public void setModelPackageClassNamePostFix(String newModelPackageClassNamePostFix) {
    String oldModelPackageClassNamePostFix = modelPackageClassNamePostFix;
    modelPackageClassNamePostFix = newModelPackageClassNamePostFix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX, oldModelPackageClassNamePostFix, modelPackageClassNamePostFix));
  }

  /**
   * Returns the value of the '<em><b>Model Factory Class Name Post Fix</b></em>' attribute.
   * The default value is <code>"ModelFactory"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Factory Class Name Post Fix</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Factory Class Name Post Fix</em>' attribute.
   * @see #setModelFactoryClassNamePostFix(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_ModelFactoryClassNamePostFix()
   * @model default="ModelFactory" unique="false"
   * @generated
   */
  public String getModelFactoryClassNamePostFix() {
    return modelFactoryClassNamePostFix;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelFactoryClassNamePostFix <em>Model Factory Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Factory Class Name Post Fix</em>' attribute.
   * @see #getModelFactoryClassNamePostFix()
   * @generated
   */
  public void setModelFactoryClassNamePostFix(String newModelFactoryClassNamePostFix) {
    String oldModelFactoryClassNamePostFix = modelFactoryClassNamePostFix;
    modelFactoryClassNamePostFix = newModelFactoryClassNamePostFix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX, oldModelFactoryClassNamePostFix, modelFactoryClassNamePostFix));
  }

  /**
   * Returns the value of the '<em><b>Feature Group Class Name Post Fix</b></em>' attribute.
   * The default value is <code>"FeatureGroup"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Group Class Name Post Fix</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Group Class Name Post Fix</em>' attribute.
   * @see #setFeatureGroupClassNamePostFix(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_FeatureGroupClassNamePostFix()
   * @model default="FeatureGroup" unique="false"
   * @generated
   */
  public String getFeatureGroupClassNamePostFix() {
    return featureGroupClassNamePostFix;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureGroupClassNamePostFix <em>Feature Group Class Name Post Fix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Group Class Name Post Fix</em>' attribute.
   * @see #getFeatureGroupClassNamePostFix()
   * @generated
   */
  public void setFeatureGroupClassNamePostFix(String newFeatureGroupClassNamePostFix) {
    String oldFeatureGroupClassNamePostFix = featureGroupClassNamePostFix;
    featureGroupClassNamePostFix = newFeatureGroupClassNamePostFix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX, oldFeatureGroupClassNamePostFix, featureGroupClassNamePostFix));
  }

  /**
   * Returns the value of the '<em><b>Generate Safe Many Access</b></em>' attribute.
   * The default value is <code>"false"</code>.
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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_GenerateSafeManyAccess()
   * @model default="false" unsettable="true"
   * @generated
   */
  public boolean isGenerateSafeManyAccess() {
    return generateSafeManyAccess;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS, oldGenerateSafeManyAccess, generateSafeManyAccess, !oldGenerateSafeManyAccessESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS, oldGenerateSafeManyAccess, GENERATE_SAFE_MANY_ACCESS_EDEFAULT, oldGenerateSafeManyAccessESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Root Class Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Class Extends</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Class Extends</em>' attribute.
   * @see #setRootClassExtends(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_RootClassExtends()
   * @model unique="false"
   * @generated
   */
  public String getRootClassExtends() {
    return rootClassExtends;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootClassExtends <em>Root Class Extends</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Class Extends</em>' attribute.
   * @see #getRootClassExtends()
   * @generated
   */
  public void setRootClassExtends(String newRootClassExtends) {
    String oldRootClassExtends = rootClassExtends;
    rootClassExtends = newRootClassExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS, oldRootClassExtends, rootClassExtends));
  }

  /**
   * Returns the value of the '<em><b>Root Interface Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Interface Extends</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Interface Extends</em>' attribute.
   * @see #setRootInterfaceExtends(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_RootInterfaceExtends()
   * @model unique="false"
   * @generated
   */
  public String getRootInterfaceExtends() {
    return rootInterfaceExtends;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootInterfaceExtends <em>Root Interface Extends</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Interface Extends</em>' attribute.
   * @see #getRootInterfaceExtends()
   * @generated
   */
  public void setRootInterfaceExtends(String newRootInterfaceExtends) {
    String oldRootInterfaceExtends = rootInterfaceExtends;
    rootInterfaceExtends = newRootInterfaceExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS, oldRootInterfaceExtends, rootInterfaceExtends));
  }

  /**
   * Returns the value of the '<em><b>Feature Map Class Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Class Extends</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Class Extends</em>' attribute.
   * @see #setFeatureMapClassExtends(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_FeatureMapClassExtends()
   * @model unique="false"
   * @generated
   */
  public String getFeatureMapClassExtends() {
    return featureMapClassExtends;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureMapClassExtends <em>Feature Map Class Extends</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Class Extends</em>' attribute.
   * @see #getFeatureMapClassExtends()
   * @generated
   */
  public void setFeatureMapClassExtends(String newFeatureMapClassExtends) {
    String oldFeatureMapClassExtends = featureMapClassExtends;
    featureMapClassExtends = newFeatureMapClassExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS, oldFeatureMapClassExtends, featureMapClassExtends));
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
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_GenerateBidirectionalAssociationSupport()
   * @model default="true" unsettable="true"
   * @generated
   */
  public boolean isGenerateBidirectionalAssociationSupport() {
    return generateBidirectionalAssociationSupport;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT, oldGenerateBidirectionalAssociationSupport, generateBidirectionalAssociationSupport, !oldGenerateBidirectionalAssociationSupportESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT, oldGenerateBidirectionalAssociationSupport, GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT_EDEFAULT, oldGenerateBidirectionalAssociationSupportESet));
  }

  /**
   * Returns whether the value of the '
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateBidirectionalAssociationSupport
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
   * Returns the value of the '<em><b>Handle Ecore File</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handle Ecore File</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handle Ecore File</em>' attribute.
   * @see #isSetHandleEcoreFile()
   * @see #unsetHandleEcoreFile()
   * @see #setHandleEcoreFile(boolean)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_HandleEcoreFile()
   * @model default="true" unique="false" unsettable="true"
   * @generated
   */
  public boolean isHandleEcoreFile() {
    return handleEcoreFile;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isHandleEcoreFile <em>Handle Ecore File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Handle Ecore File</em>' attribute.
   * @see #isSetHandleEcoreFile()
   * @see #unsetHandleEcoreFile()
   * @see #isHandleEcoreFile()
   * @generated
   */
  public void setHandleEcoreFile(boolean newHandleEcoreFile) {
    boolean oldHandleEcoreFile = handleEcoreFile;
    handleEcoreFile = newHandleEcoreFile;
    boolean oldHandleEcoreFileESet = handleEcoreFileESet;
    handleEcoreFileESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE, oldHandleEcoreFile, handleEcoreFile, !oldHandleEcoreFileESet));
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isHandleEcoreFile <em>Handle Ecore File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHandleEcoreFile()
   * @see #isHandleEcoreFile()
   * @see #setHandleEcoreFile(boolean)
   * @generated
   */
  public void unsetHandleEcoreFile() {
    boolean oldHandleEcoreFile = handleEcoreFile;
    boolean oldHandleEcoreFileESet = handleEcoreFileESet;
    handleEcoreFile = HANDLE_ECORE_FILE_EDEFAULT;
    handleEcoreFileESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE, oldHandleEcoreFile, HANDLE_ECORE_FILE_EDEFAULT, oldHandleEcoreFileESet));
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isHandleEcoreFile <em>Handle Ecore File</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Handle Ecore File</em>' attribute is set.
   * @see #unsetHandleEcoreFile()
   * @see #isHandleEcoreFile()
   * @see #setHandleEcoreFile(boolean)
   * @generated
   */
  public boolean isSetHandleEcoreFile() {
    return handleEcoreFileESet;
  }

  /**
   * Returns the value of the '<em><b>Dao Classes Package Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dao Classes Package Path</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dao Classes Package Path</em>' attribute.
   * @see #setDaoClassesPackagePath(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_DaoClassesPackagePath()
   * @model unique="false"
   * @generated
   */
  public String getDaoClassesPackagePath() {
    return daoClassesPackagePath;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoClassesPackagePath <em>Dao Classes Package Path</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Dao Classes Package Path</em>' attribute.
   * @see #getDaoClassesPackagePath()
   * @generated
   */
  public void setDaoClassesPackagePath(String newDaoClassesPackagePath) {
    String oldDaoClassesPackagePath = daoClassesPackagePath;
    daoClassesPackagePath = newDaoClassesPackagePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH, oldDaoClassesPackagePath, daoClassesPackagePath));
  }

  /**
   * Returns the value of the '<em><b>Dao Pattern Name</b></em>' attribute.
   * The default value is <code>"dao"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dao Pattern Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dao Pattern Name</em>' attribute.
   * @see #setDaoPatternName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_DaoPatternName()
   * @model default="dao" unique="false"
   * @generated
   */
  public String getDaoPatternName() {
    return daoPatternName;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoPatternName <em>Dao Pattern Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Dao Pattern Name</em>' attribute.
   * @see #getDaoPatternName()
   * @generated
   */
  public void setDaoPatternName(String newDaoPatternName) {
    String oldDaoPatternName = daoPatternName;
    daoPatternName = newDaoPatternName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME, oldDaoPatternName, daoPatternName));
  }

  /**
   * Returns the value of the '<em><b>Dao Root Class</b></em>' attribute. The default value is <code>""</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dao Root Class</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Dao Root Class</em>' attribute.
   * @see #setDaoRootClass(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_DaoRootClass()
   * @model default="" unique="false"
   * @generated
   */
  public String getDaoRootClass() {
    return daoRootClass;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoRootClass <em>Dao Root Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Dao Root Class</em>' attribute.
   * @see #getDaoRootClass()
   * @generated
   */
  public void setDaoRootClass(String newDaoRootClass) {
    String oldDaoRootClass = daoRootClass;
    daoRootClass = newDaoRootClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS, oldDaoRootClass, daoRootClass));
  }

  /**
   * Returns the value of the '<em><b>Sub Package Model Gens</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Package Model Gens</em>' reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Package Model Gens</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation_SubPackageModelGens()
   * @model
   * @generated
   */
  public EList<EPackageModelGenAnnotation> getSubPackageModelGens() {
    if (subPackageModelGens == null) {
      subPackageModelGens = new EObjectResolvingEList<EPackageModelGenAnnotation>(EPackageModelGenAnnotation.class, this, ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS);
    }
    return subPackageModelGens;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return getDocumentation();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME:
        return getName();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR:
        return isAddRuntimeModelBehavior();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES:
        return isGenerateInterfaces();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH:
        return getPackagePath();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH:
        return getModelClassesPackagePath();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        return getQualifiedClassName();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        return getSimpleClassName();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME:
        return getSimpleModelFactoryClassName();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON:
        return getDependsOn();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT:
        return getEcoreFileContent();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME:
        return getEcoreFileName();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER:
        return getJavaFileHeader();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS:
        return getEClassModelGenAnnotations();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS:
        return getEDataTypeModelGenAnnotations();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS:
        return getEEnumModelGenAnnotations();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS:
        return getEClassifierModelGenAnnotations();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX:
        return getModelPackageClassNamePostFix();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX:
        return getModelFactoryClassNamePostFix();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX:
        return getFeatureGroupClassNamePostFix();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        return isGenerateSafeManyAccess();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS:
        return getRootClassExtends();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS:
        return getRootInterfaceExtends();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS:
        return getFeatureMapClassExtends();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        return isGenerateBidirectionalAssociationSupport();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE:
        return isHandleEcoreFile();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH:
        return getDaoClassesPackagePath();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME:
        return getDaoPatternName();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS:
        return getDaoRootClass();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS:
        return getSubPackageModelGens();
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
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR:
        setAddRuntimeModelBehavior((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES:
        setGenerateInterfaces((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH:
        setPackagePath((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH:
        setModelClassesPackagePath((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        setQualifiedClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        setSimpleClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME:
        setSimpleModelFactoryClassName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON:
        getDependsOn().clear();
        getDependsOn().addAll((Collection<? extends EPackageModelGenAnnotation>)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT:
        setEcoreFileContent((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME:
        setEcoreFileName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER:
        setJavaFileHeader((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS:
        getEClassModelGenAnnotations().clear();
        getEClassModelGenAnnotations().addAll((Collection<? extends EClassModelGenAnnotation>)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS:
        getEDataTypeModelGenAnnotations().clear();
        getEDataTypeModelGenAnnotations().addAll((Collection<? extends EDataTypeModelGenAnnotationDefinition>)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS:
        getEEnumModelGenAnnotations().clear();
        getEEnumModelGenAnnotations().addAll((Collection<? extends EEnumModelGenAnnotation>)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS:
        getEClassifierModelGenAnnotations().clear();
        getEClassifierModelGenAnnotations().addAll((Collection<? extends EClassifierModelGenAnnotation>)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX:
        setModelPackageClassNamePostFix((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX:
        setModelFactoryClassNamePostFix((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX:
        setFeatureGroupClassNamePostFix((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        setGenerateSafeManyAccess((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS:
        setRootClassExtends((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS:
        setRootInterfaceExtends((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS:
        setFeatureMapClassExtends((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        setGenerateBidirectionalAssociationSupport((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE:
        setHandleEcoreFile((Boolean)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH:
        setDaoClassesPackagePath((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME:
        setDaoPatternName((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS:
        setDaoRootClass((String)newValue);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS:
        getSubPackageModelGens().clear();
        getSubPackageModelGens().addAll((Collection<? extends EPackageModelGenAnnotation>)newValue);
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
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR:
        unsetAddRuntimeModelBehavior();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES:
        unsetGenerateInterfaces();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH:
        setPackagePath(PACKAGE_PATH_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH:
        setModelClassesPackagePath(MODEL_CLASSES_PACKAGE_PATH_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        setSimpleClassName(SIMPLE_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME:
        setSimpleModelFactoryClassName(SIMPLE_MODEL_FACTORY_CLASS_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON:
        getDependsOn().clear();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT:
        setEcoreFileContent(ECORE_FILE_CONTENT_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME:
        setEcoreFileName(ECORE_FILE_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER:
        setJavaFileHeader(JAVA_FILE_HEADER_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS:
        getEClassModelGenAnnotations().clear();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS:
        getEDataTypeModelGenAnnotations().clear();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS:
        getEEnumModelGenAnnotations().clear();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS:
        getEClassifierModelGenAnnotations().clear();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX:
        setModelPackageClassNamePostFix(MODEL_PACKAGE_CLASS_NAME_POST_FIX_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX:
        setModelFactoryClassNamePostFix(MODEL_FACTORY_CLASS_NAME_POST_FIX_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX:
        setFeatureGroupClassNamePostFix(FEATURE_GROUP_CLASS_NAME_POST_FIX_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        unsetGenerateSafeManyAccess();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS:
        setRootClassExtends(ROOT_CLASS_EXTENDS_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS:
        setRootInterfaceExtends(ROOT_INTERFACE_EXTENDS_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS:
        setFeatureMapClassExtends(FEATURE_MAP_CLASS_EXTENDS_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        unsetGenerateBidirectionalAssociationSupport();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE:
        unsetHandleEcoreFile();
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH:
        setDaoClassesPackagePath(DAO_CLASSES_PACKAGE_PATH_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME:
        setDaoPatternName(DAO_PATTERN_NAME_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS:
        setDaoRootClass(DAO_ROOT_CLASS_EDEFAULT);
        return;
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS:
        getSubPackageModelGens().clear();
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
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR:
        return isSetAddRuntimeModelBehavior();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES:
        return isSetGenerateInterfaces();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH:
        return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH:
        return MODEL_CLASSES_PACKAGE_PATH_EDEFAULT == null ? modelClassesPackagePath != null : !MODEL_CLASSES_PACKAGE_PATH_EDEFAULT.equals(modelClassesPackagePath);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
        return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
        return SIMPLE_CLASS_NAME_EDEFAULT == null ? simpleClassName != null : !SIMPLE_CLASS_NAME_EDEFAULT.equals(simpleClassName);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME:
        return SIMPLE_MODEL_FACTORY_CLASS_NAME_EDEFAULT == null ? simpleModelFactoryClassName != null : !SIMPLE_MODEL_FACTORY_CLASS_NAME_EDEFAULT.equals(simpleModelFactoryClassName);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON:
        return dependsOn != null && !dependsOn.isEmpty();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT:
        return ECORE_FILE_CONTENT_EDEFAULT == null ? ecoreFileContent != null : !ECORE_FILE_CONTENT_EDEFAULT.equals(ecoreFileContent);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME:
        return ECORE_FILE_NAME_EDEFAULT == null ? ecoreFileName != null : !ECORE_FILE_NAME_EDEFAULT.equals(ecoreFileName);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER:
        return JAVA_FILE_HEADER_EDEFAULT == null ? javaFileHeader != null : !JAVA_FILE_HEADER_EDEFAULT.equals(javaFileHeader);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS:
        return !getEClassModelGenAnnotations().isEmpty();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS:
        return !getEDataTypeModelGenAnnotations().isEmpty();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS:
        return !getEEnumModelGenAnnotations().isEmpty();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS:
        return !getEClassifierModelGenAnnotations().isEmpty();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX:
        return MODEL_PACKAGE_CLASS_NAME_POST_FIX_EDEFAULT == null ? modelPackageClassNamePostFix != null : !MODEL_PACKAGE_CLASS_NAME_POST_FIX_EDEFAULT.equals(modelPackageClassNamePostFix);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX:
        return MODEL_FACTORY_CLASS_NAME_POST_FIX_EDEFAULT == null ? modelFactoryClassNamePostFix != null : !MODEL_FACTORY_CLASS_NAME_POST_FIX_EDEFAULT.equals(modelFactoryClassNamePostFix);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX:
        return FEATURE_GROUP_CLASS_NAME_POST_FIX_EDEFAULT == null ? featureGroupClassNamePostFix != null : !FEATURE_GROUP_CLASS_NAME_POST_FIX_EDEFAULT.equals(featureGroupClassNamePostFix);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
        return isSetGenerateSafeManyAccess();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS:
        return ROOT_CLASS_EXTENDS_EDEFAULT == null ? rootClassExtends != null : !ROOT_CLASS_EXTENDS_EDEFAULT.equals(rootClassExtends);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS:
        return ROOT_INTERFACE_EXTENDS_EDEFAULT == null ? rootInterfaceExtends != null : !ROOT_INTERFACE_EXTENDS_EDEFAULT.equals(rootInterfaceExtends);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS:
        return FEATURE_MAP_CLASS_EXTENDS_EDEFAULT == null ? featureMapClassExtends != null : !FEATURE_MAP_CLASS_EXTENDS_EDEFAULT.equals(featureMapClassExtends);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
        return isSetGenerateBidirectionalAssociationSupport();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE:
        return isSetHandleEcoreFile();
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH:
        return DAO_CLASSES_PACKAGE_PATH_EDEFAULT == null ? daoClassesPackagePath != null : !DAO_CLASSES_PACKAGE_PATH_EDEFAULT.equals(daoClassesPackagePath);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME:
        return DAO_PATTERN_NAME_EDEFAULT == null ? daoPatternName != null : !DAO_PATTERN_NAME_EDEFAULT.equals(daoPatternName);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS:
        return DAO_ROOT_CLASS_EDEFAULT == null ? daoRootClass != null : !DAO_ROOT_CLASS_EDEFAULT.equals(daoRootClass);
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS:
        return subPackageModelGens != null && !subPackageModelGens.isEmpty();
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
        case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;
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
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION: return ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION;
        case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME: return ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME;
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
    result.append(", addRuntimeModelBehavior: "); //$NON-NLS-1$
    if (addRuntimeModelBehaviorESet) result.append(addRuntimeModelBehavior); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", generateInterfaces: "); //$NON-NLS-1$
    if (generateInterfacesESet) result.append(generateInterfaces); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", packagePath: "); //$NON-NLS-1$
    result.append(packagePath);
    result.append(", modelClassesPackagePath: "); //$NON-NLS-1$
    result.append(modelClassesPackagePath);
    result.append(", qualifiedClassName: "); //$NON-NLS-1$
    result.append(qualifiedClassName);
    result.append(", simpleClassName: "); //$NON-NLS-1$
    result.append(simpleClassName);
    result.append(", simpleModelFactoryClassName: "); //$NON-NLS-1$
    result.append(simpleModelFactoryClassName);
    result.append(", ecoreFileContent: "); //$NON-NLS-1$
    result.append(ecoreFileContent);
    result.append(", ecoreFileName: "); //$NON-NLS-1$
    result.append(ecoreFileName);
    result.append(", javaFileHeader: "); //$NON-NLS-1$
    result.append(javaFileHeader);
    result.append(", modelPackageClassNamePostFix: "); //$NON-NLS-1$
    result.append(modelPackageClassNamePostFix);
    result.append(", modelFactoryClassNamePostFix: "); //$NON-NLS-1$
    result.append(modelFactoryClassNamePostFix);
    result.append(", featureGroupClassNamePostFix: "); //$NON-NLS-1$
    result.append(featureGroupClassNamePostFix);
    result.append(", generateSafeManyAccess: "); //$NON-NLS-1$
    if (generateSafeManyAccessESet) result.append(generateSafeManyAccess); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", rootClassExtends: "); //$NON-NLS-1$
    result.append(rootClassExtends);
    result.append(", rootInterfaceExtends: "); //$NON-NLS-1$
    result.append(rootInterfaceExtends);
    result.append(", featureMapClassExtends: "); //$NON-NLS-1$
    result.append(featureMapClassExtends);
    result.append(", generateBidirectionalAssociationSupport: "); //$NON-NLS-1$
    if (generateBidirectionalAssociationSupportESet) result.append(generateBidirectionalAssociationSupport); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", handleEcoreFile: "); //$NON-NLS-1$
    if (handleEcoreFileESet) result.append(handleEcoreFile); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", daoClassesPackagePath: "); //$NON-NLS-1$
    result.append(daoClassesPackagePath);
    result.append(", daoPatternName: "); //$NON-NLS-1$
    result.append(daoPatternName);
    result.append(", daoRootClass: "); //$NON-NLS-1$
    result.append(daoRootClass);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    return getJavaAnnotationFromEAnnotation(annotationProvider, identifier);
  }

  public boolean getAddSuppressUnchecked() {
    for (EDataTypeModelGenAnnotationDefinition annotation : getEDataTypeModelGenAnnotations()) {
      if (annotation.getObjectClassName().contains("java.util.List")) { //$NON-NLS-1$
        return true;
      }
    }
    return false;
  }

} // EPackageModelGenAnnotation
