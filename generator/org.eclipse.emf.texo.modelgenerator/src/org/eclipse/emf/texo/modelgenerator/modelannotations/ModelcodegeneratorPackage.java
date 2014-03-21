/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelcodegeneratorPackage.java,v 1.30 2011/09/23 21:00:28 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorFactory
 * @model kind="package"
 * @generated
 */
public class ModelcodegeneratorPackage extends EPackageImpl {
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String eNAME = "modelannotations"; //$NON-NLS-1$

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_URI = "http://www.eclipse.org/emf/texo/modelgenerator/modelannotations"; //$NON-NLS-1$

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "modelannotations"; //$NON-NLS-1$

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final ModelcodegeneratorPackage eINSTANCE = org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation <em>EPackage Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation()
   * @generated
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EPACKAGE_MODEL_GEN_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EPACKAGE_MODEL_GEN_ANNOTATION__GENERATED = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__EPACKAGE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__EPACKAGE;

  /**
   * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ANNOTATED_EPACKAGE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__NAME = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Add Runtime Model Behavior</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Generate Interfaces</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Package Path</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Model Classes Package Path</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Simple Model Factory Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Ecore File Content</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Ecore File Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Java File Header</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>EClass Model Gen Annotations</b></em>' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>EData Type Model Gen Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>EEnum Model Gen Annotations</b></em>' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>EClassifier Model Gen Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Model Package Class Name Post Fix</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Model Factory Class Name Post Fix</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Feature Group Class Name Post Fix</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Generate Safe Many Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Root Class Extends</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Root Interface Extends</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Feature Map Class Extends</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Generate Bidirectional Association Support</b></em>' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Handle Ecore File</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Dao Classes Package Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Dao Pattern Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>Dao Root Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>Sub Package Model Gens</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 29;

		/**
   * The number of structural features of the '<em>EPackage Model Gen Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_MODEL_GEN_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 30;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation <em>ENamed Element Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation()
   * @generated
   */
  public static final int ENAMED_ELEMENT_MODEL_GEN_ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME = 1;

  /**
   * The number of structural features of the '<em>ENamed Element Model Gen Annotation</em>' class.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation <em>EClassifier Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation()
   * @generated
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION__DOCUMENTATION = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION__NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>EClassifier Model Gen Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_MODEL_GEN_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation <em>EClass Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation()
   * @generated
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.ECLASS_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.ECLASS_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int ECLASS_MODEL_GEN_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.ECLASS_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int ECLASS_MODEL_GEN_ANNOTATION__GENERATED = AnnotationsmodelPackage.ECLASS_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ECLASSIFIER = AnnotationsmodelPackage.ECLASS_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClass</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ANNOTATED_ECLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ECLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION__ECLASS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__NAME = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Has Many Features</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Class Extends</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Has Super EClass</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Class Implements</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Serializable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Super EClass</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Feature Map Features</b></em>' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>EStructural Feature Model Gen Annotations</b></em>' reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Dao Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Dao Finders</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>EAll Structural Feature Model Gen Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int ECLASS_MODEL_GEN_ANNOTATION__EALL_STRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 17;

		/**
   * The number of structural features of the '<em>EClass Model Gen Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_MODEL_GEN_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 18;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition <em>EData Type Model Gen Annotation Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENAMED_ELEMENT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DESCRIPTION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__LAST_IDENTIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__GENERATED = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ANNOTATED_EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE;

  /**
   * The feature id for the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DOCUMENTATION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__SIMPLE_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__GENERATE_CODE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OWNER_EPACKAGE_ANNOTATION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__INSTANCE_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Object Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OBJECT_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Enum</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENUM = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Date Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DATE_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Automatic String Conversion</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__AUTOMATIC_STRING_CONVERSION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Base Type Annotation</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__BASE_TYPE_ANNOTATION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ITEM_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>EData Type Model Gen Annotation Definition</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION_FEATURE_COUNT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation <em>EStructural Feature Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DOCUMENTATION = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Getter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Setter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Valid Java Member Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Feature Map Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Feature Map Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Feature Map Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Member Feature Map Features</b></em>' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Use List</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Owner EClass Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The number of structural features of the '<em>EStructural Feature Model Gen Annotation</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_MODEL_GEN_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation <em>EAttribute Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEAttributeModelGenAnnotation()
   * @generated
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION = 6;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATED = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ESTRUCTURAL_FEATURE;

  /**
   * The feature id for the '<em><b>EAttribute</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__EATTRIBUTE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__EATTRIBUTE;

  /**
   * The feature id for the '<em><b>Annotated EAttribute</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__ANNOTATED_EATTRIBUTE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__DOCUMENTATION = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__NAME = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Getter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__GETTER = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__TYPE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__OBJECT_TYPE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__ITEM_TYPE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Setter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__SETTER = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Valid Java Member Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__GENERATE_CODE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Feature Map Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Feature Map Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Feature Map Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Member Feature Map Features</b></em>' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__MANY = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Use List</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__USE_LIST = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__REFERENCE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Owner EClass Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Primitive</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 19;

  /**
   * The number of structural features of the '<em>EAttribute Model Gen Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_MODEL_GEN_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 20;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation <em>EReference Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEReferenceModelGenAnnotation()
   * @generated
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION = 7;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EREFERENCE_MODEL_GEN_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EREFERENCE_MODEL_GEN_ANNOTATION__GENERATED = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ESTRUCTURAL_FEATURE;

  /**
   * The feature id for the '<em><b>EReference</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__EREFERENCE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__EREFERENCE;

  /**
   * The feature id for the '<em><b>Annotated EReference</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__ANNOTATED_EREFERENCE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__NAME = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Getter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__GETTER = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__TYPE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Setter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__SETTER = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Valid Java Member Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Feature Map Qualified Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Feature Map Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Feature Map Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Member Feature Map Features</b></em>' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__MANY = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Use List</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Owner EClass Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Opposite Model Gen Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Generate Safe Many Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Generate Bidirectional Association Support</b></em>' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 20;

  /**
   * The number of structural features of the '<em>EReference Model Gen Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_MODEL_GEN_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 21;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation <em>EEnum Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEEnumModelGenAnnotation()
   * @generated
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION = 8;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EENUM_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EENUM_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EENUM_MODEL_GEN_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EENUM_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EENUM_MODEL_GEN_ANNOTATION__GENERATED = AnnotationsmodelPackage.EENUM_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ECLASSIFIER = AnnotationsmodelPackage.EENUM_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>EEnum</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__EENUM = AnnotationsmodelPackage.EENUM_ANNOTATION__EENUM;

  /**
   * The feature id for the '<em><b>Annotated EEnum</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EENUM = AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM;

  /**
   * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__EDATA_TYPE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__DOCUMENTATION = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__NAME = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__GENERATE_CODE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Object Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Enum</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ENUM = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Date Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__DATE_TYPE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Automatic String Conversion</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Base Type Annotation</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION__ITEM_TYPE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>EEnum Model Gen Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_MODEL_GEN_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation <em>EData Type Model Gen Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotation()
   * @generated
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION = 9;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__LAST_IDENTIFIER;

		/**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__GENERATED = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__ANNOTATED_EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE;

  /**
   * The feature id for the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__DOCUMENTATION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Simple Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Generate Code</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__GENERATE_CODE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Owner EPackage Annotation</b></em>' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Object Class Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Enum</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__ENUM = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Date Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__DATE_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Automatic String Conversion</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Base Type Annotation</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__BASE_TYPE_ANNOTATION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION__ITEM_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>EData Type Model Gen Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_MODEL_GEN_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition <em>Dao Finder Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getDaoFinderDefinition()
   * @generated
   */
  public static final int DAO_FINDER_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Find Part</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DAO_FINDER_DEFINITION__FIND_PART = 0;

  /**
   * The number of structural features of the '<em>Dao Finder Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DAO_FINDER_DEFINITION_FEATURE_COUNT = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass ePackageModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eNamedElementModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassifierModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eDataTypeModelGenAnnotationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eStructuralFeatureModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eReferenceModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eEnumModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eDataTypeModelGenAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daoFinderDefinitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModelcodegeneratorPackage() {
    super(eNS_URI, ModelcodegeneratorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>
   * This method is used to initialize {@link ModelcodegeneratorPackage#eINSTANCE} when that field is accessed. Clients
   * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ModelcodegeneratorPackage init() {
    if (isInited) return (ModelcodegeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(ModelcodegeneratorPackage.eNS_URI);

    // Obtain or create and register package
    ModelcodegeneratorPackage theModelcodegeneratorPackage = (ModelcodegeneratorPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelcodegeneratorPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelcodegeneratorPackage());

    isInited = true;

    // Initialize simple dependencies
    AnnotationsmodelPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theModelcodegeneratorPackage.createPackageContents();

    // Initialize created meta-data
    theModelcodegeneratorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theModelcodegeneratorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModelcodegeneratorPackage.eNS_URI, theModelcodegeneratorPackage);
    return theModelcodegeneratorPackage;
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation <em>EPackage Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
   * @generated
   */
  public EClass getEPackageModelGenAnnotation() {
    return ePackageModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isAddRuntimeModelBehavior <em>Add Runtime Model Behavior</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add Runtime Model Behavior</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isAddRuntimeModelBehavior()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_AddRuntimeModelBehavior() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateInterfaces <em>Generate Interfaces</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Interfaces</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateInterfaces()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_GenerateInterfaces() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getPackagePath <em>Package Path</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Path</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getPackagePath()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_PackagePath() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelClassesPackagePath <em>Model Classes Package Path</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Classes Package Path</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelClassesPackagePath()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_ModelClassesPackagePath() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getQualifiedClassName()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_QualifiedClassName() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleClassName()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_SimpleClassName() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleModelFactoryClassName <em>Simple Model Factory Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Model Factory Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSimpleModelFactoryClassName()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_SimpleModelFactoryClassName() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Depends On</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDependsOn()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EReference getEPackageModelGenAnnotation_DependsOn() {
    return (EReference)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileContent <em>Ecore File Content</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ecore File Content</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileContent()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_EcoreFileContent() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileName <em>Ecore File Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ecore File Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEcoreFileName()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_EcoreFileName() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getJavaFileHeader <em>Java File Header</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java File Header</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getJavaFileHeader()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_JavaFileHeader() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEClassModelGenAnnotations <em>EClass Model Gen Annotations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EClass Model Gen Annotations</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEClassModelGenAnnotations()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EReference getEPackageModelGenAnnotation_EClassModelGenAnnotations() {
    return (EReference)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEDataTypeModelGenAnnotations <em>EData Type Model Gen Annotations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EData Type Model Gen Annotations</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEDataTypeModelGenAnnotations()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EReference getEPackageModelGenAnnotation_EDataTypeModelGenAnnotations() {
    return (EReference)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEEnumModelGenAnnotations <em>EEnum Model Gen Annotations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EEnum Model Gen Annotations</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEEnumModelGenAnnotations()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EReference getEPackageModelGenAnnotation_EEnumModelGenAnnotations() {
    return (EReference)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEClassifierModelGenAnnotations <em>EClassifier Model Gen Annotations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EClassifier Model Gen Annotations</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getEClassifierModelGenAnnotations()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EReference getEPackageModelGenAnnotation_EClassifierModelGenAnnotations() {
    return (EReference)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelPackageClassNamePostFix <em>Model Package Class Name Post Fix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Package Class Name Post Fix</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelPackageClassNamePostFix()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_ModelPackageClassNamePostFix() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelFactoryClassNamePostFix <em>Model Factory Class Name Post Fix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Factory Class Name Post Fix</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getModelFactoryClassNamePostFix()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_ModelFactoryClassNamePostFix() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(16);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureGroupClassNamePostFix <em>Feature Group Class Name Post Fix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Group Class Name Post Fix</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureGroupClassNamePostFix()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_FeatureGroupClassNamePostFix() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(17);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Safe Many Access</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateSafeManyAccess()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_GenerateSafeManyAccess() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(18);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootClassExtends <em>Root Class Extends</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root Class Extends</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootClassExtends()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_RootClassExtends() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(19);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootInterfaceExtends <em>Root Interface Extends</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root Interface Extends</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getRootInterfaceExtends()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_RootInterfaceExtends() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(20);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureMapClassExtends <em>Feature Map Class Extends</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Map Class Extends</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getFeatureMapClassExtends()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_FeatureMapClassExtends() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(21);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Bidirectional Association Support</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isGenerateBidirectionalAssociationSupport()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_GenerateBidirectionalAssociationSupport() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(22);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isHandleEcoreFile <em>Handle Ecore File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle Ecore File</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#isHandleEcoreFile()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_HandleEcoreFile() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(23);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoClassesPackagePath <em>Dao Classes Package Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dao Classes Package Path</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoClassesPackagePath()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_DaoClassesPackagePath() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(24);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoPatternName <em>Dao Pattern Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dao Pattern Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoPatternName()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_DaoPatternName() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(25);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoRootClass <em>Dao Root Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dao Root Class</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getDaoRootClass()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
  public EAttribute getEPackageModelGenAnnotation_DaoRootClass() {
    return (EAttribute)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(26);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSubPackageModelGens <em>Sub Package Model Gens</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sub Package Model Gens</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation#getSubPackageModelGens()
   * @see #getEPackageModelGenAnnotation()
   * @generated
   */
	public EReference getEPackageModelGenAnnotation_SubPackageModelGens() {
    return (EReference)ePackageModelGenAnnotationEClass.getEStructuralFeatures().get(27);
  }

		/**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation <em>ENamed Element Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamed Element Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation
   * @generated
   */
  public EClass getENamedElementModelGenAnnotation() {
    return eNamedElementModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getDocumentation()
   * @see #getENamedElementModelGenAnnotation()
   * @generated
   */
  public EAttribute getENamedElementModelGenAnnotation_Documentation() {
    return (EAttribute)eNamedElementModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getName()
   * @see #getENamedElementModelGenAnnotation()
   * @generated
   */
  public EAttribute getENamedElementModelGenAnnotation_Name() {
    return (EAttribute)eNamedElementModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation <em>EClassifier Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EClassifier Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation
   * @generated
   */
  public EClass getEClassifierModelGenAnnotation() {
    return eClassifierModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getQualifiedClassName <em>Qualified Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getQualifiedClassName()
   * @see #getEClassifierModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassifierModelGenAnnotation_QualifiedClassName() {
    return (EAttribute)eClassifierModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getSimpleClassName <em>Simple Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getSimpleClassName()
   * @see #getEClassifierModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassifierModelGenAnnotation_SimpleClassName() {
    return (EAttribute)eClassifierModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#isGenerateCode <em>Generate Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Code</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#isGenerateCode()
   * @see #getEClassifierModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassifierModelGenAnnotation_GenerateCode() {
    return (EAttribute)eClassifierModelGenAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getOwnerEPackageAnnotation <em>Owner EPackage Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner EPackage Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation#getOwnerEPackageAnnotation()
   * @see #getEClassifierModelGenAnnotation()
   * @generated
   */
  public EReference getEClassifierModelGenAnnotation_OwnerEPackageAnnotation() {
    return (EReference)eClassifierModelGenAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation <em>EClass Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
   * @generated
   */
  public EClass getEClassModelGenAnnotation() {
    return eClassModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasManyFeatures <em>Has Many Features</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Many Features</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasManyFeatures()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_HasManyFeatures() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getClassExtends <em>Class Extends</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Class Extends</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getClassExtends()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_ClassExtends() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasSuperEClass <em>Has Super EClass</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Super EClass</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isHasSuperEClass()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_HasSuperEClass() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getClassImplements <em>Class Implements</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Class Implements</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getClassImplements()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_ClassImplements() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isSerializable <em>Serializable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Serializable</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isSerializable()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_Serializable() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#isAbstract()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_Abstract() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getSuperEClass <em>Super EClass</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super EClass</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getSuperEClass()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EReference getEClassModelGenAnnotation_SuperEClass() {
    return (EReference)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getFeatureMapFeatures <em>Feature Map Features</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Feature Map Features</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getFeatureMapFeatures()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EReference getEClassModelGenAnnotation_FeatureMapFeatures() {
    return (EReference)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getEStructuralFeatureModelGenAnnotations <em>EStructural Feature Model Gen Annotations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EStructural Feature Model Gen Annotations</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getEStructuralFeatureModelGenAnnotations()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EReference getEClassModelGenAnnotation_EStructuralFeatureModelGenAnnotations() {
    return (EReference)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoQualifiedClassName <em>Dao Qualified Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dao Qualified Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoQualifiedClassName()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EAttribute getEClassModelGenAnnotation_DaoQualifiedClassName() {
    return (EAttribute)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoFinders <em>Dao Finders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dao Finders</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getDaoFinders()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
  public EReference getEClassModelGenAnnotation_DaoFinders() {
    return (EReference)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getEAllStructuralFeatureModelGenAnnotations <em>EAll Structural Feature Model Gen Annotations</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll Structural Feature Model Gen Annotations</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation#getEAllStructuralFeatureModelGenAnnotations()
   * @see #getEClassModelGenAnnotation()
   * @generated
   */
	public EReference getEClassModelGenAnnotation_EAllStructuralFeatureModelGenAnnotations() {
    return (EReference)eClassModelGenAnnotationEClass.getEStructuralFeatures().get(11);
  }

		/**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition <em>EData Type Model Gen Annotation Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EData Type Model Gen Annotation Definition</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition
   * @generated
   */
  public EClass getEDataTypeModelGenAnnotationDefinition() {
    return eDataTypeModelGenAnnotationDefinitionEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getInstanceClassName <em>Instance Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getInstanceClassName()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EAttribute getEDataTypeModelGenAnnotationDefinition_InstanceClassName() {
    return (EAttribute)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getObjectClassName <em>Object Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getObjectClassName()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EAttribute getEDataTypeModelGenAnnotationDefinition_ObjectClassName() {
    return (EAttribute)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isEnum <em>Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isEnum()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EAttribute getEDataTypeModelGenAnnotationDefinition_Enum() {
    return (EAttribute)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isDateType <em>Date Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date Type</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isDateType()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EAttribute getEDataTypeModelGenAnnotationDefinition_DateType() {
    return (EAttribute)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isAutomaticStringConversion <em>Automatic String Conversion</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Automatic String Conversion</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#isAutomaticStringConversion()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EAttribute getEDataTypeModelGenAnnotationDefinition_AutomaticStringConversion() {
    return (EAttribute)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getBaseTypeAnnotation <em>Base Type Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Type Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getBaseTypeAnnotation()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EReference getEDataTypeModelGenAnnotationDefinition_BaseTypeAnnotation() {
    return (EReference)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item Type</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition#getItemType()
   * @see #getEDataTypeModelGenAnnotationDefinition()
   * @generated
   */
  public EAttribute getEDataTypeModelGenAnnotationDefinition_ItemType() {
    return (EAttribute)eDataTypeModelGenAnnotationDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation <em>EStructural Feature Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EStructural Feature Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation
   * @generated
   */
  public EClass getEStructuralFeatureModelGenAnnotation() {
    return eStructuralFeatureModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getGetter <em>Getter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Getter</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getGetter()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_Getter() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getType <em>Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getType()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_Type() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getObjectType()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_ObjectType() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item Type</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getItemType()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_ItemType() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getDefaultValue()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_DefaultValue() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getSetter <em>Setter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Setter</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getSetter()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_Setter() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getValidJavaMemberName <em>Valid Java Member Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valid Java Member Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getValidJavaMemberName()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_ValidJavaMemberName() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isGenerateCode <em>Generate Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Code</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isGenerateCode()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_GenerateCode() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapQualifiedClassName <em>Feature Map Qualified Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Map Qualified Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapQualifiedClassName()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_FeatureMapQualifiedClassName() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapSimpleClassName <em>Feature Map Simple Class Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Map Simple Class Name</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapSimpleClassName()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_FeatureMapSimpleClassName() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature <em>Feature Map Feature</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature Map Feature</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getFeatureMapFeature()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EReference getEStructuralFeatureModelGenAnnotation_FeatureMapFeature() {
    return (EReference)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures <em>Member Feature Map Features</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Member Feature Map Features</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getMemberFeatureMapFeatures()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EReference getEStructuralFeatureModelGenAnnotation_MemberFeatureMapFeatures() {
    return (EReference)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isMany <em>Many</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isMany()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_Many() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isUseList <em>Use List</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use List</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isUseList()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_UseList() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isReference <em>Reference</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#isReference()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EAttribute getEStructuralFeatureModelGenAnnotation_Reference() {
    return (EAttribute)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getOwnerEClassAnnotation <em>Owner EClass Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner EClass Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation#getOwnerEClassAnnotation()
   * @see #getEStructuralFeatureModelGenAnnotation()
   * @generated
   */
  public EReference getEStructuralFeatureModelGenAnnotation_OwnerEClassAnnotation() {
    return (EReference)eStructuralFeatureModelGenAnnotationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation <em>EAttribute Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation
   * @generated
   */
  public EClass getEAttributeModelGenAnnotation() {
    return eAttributeModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isBoolean()
   * @see #getEAttributeModelGenAnnotation()
   * @generated
   */
  public EAttribute getEAttributeModelGenAnnotation_Boolean() {
    return (EAttribute)eAttributeModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isPrimitive <em>Primitive</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primitive</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation#isPrimitive()
   * @see #getEAttributeModelGenAnnotation()
   * @generated
   */
  public EAttribute getEAttributeModelGenAnnotation_Primitive() {
    return (EAttribute)eAttributeModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation <em>EReference Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation
   * @generated
   */
  public EClass getEReferenceModelGenAnnotation() {
    return eReferenceModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getOppositeModelGenAnnotation <em>Opposite Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#getOppositeModelGenAnnotation()
   * @see #getEReferenceModelGenAnnotation()
   * @generated
   */
  public EReference getEReferenceModelGenAnnotation_OppositeModelGenAnnotation() {
    return (EReference)eReferenceModelGenAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateSafeManyAccess <em>Generate Safe Many Access</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Safe Many Access</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateSafeManyAccess()
   * @see #getEReferenceModelGenAnnotation()
   * @generated
   */
  public EAttribute getEReferenceModelGenAnnotation_GenerateSafeManyAccess() {
    return (EAttribute)eReferenceModelGenAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateBidirectionalAssociationSupport <em>Generate Bidirectional Association Support</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Bidirectional Association Support</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation#isGenerateBidirectionalAssociationSupport()
   * @see #getEReferenceModelGenAnnotation()
   * @generated
   */
  public EAttribute getEReferenceModelGenAnnotation_GenerateBidirectionalAssociationSupport() {
    return (EAttribute)eReferenceModelGenAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation <em>EEnum Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EEnum Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation
   * @generated
   */
  public EClass getEEnumModelGenAnnotation() {
    return eEnumModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation <em>EData Type Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EData Type Model Gen Annotation</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation
   * @generated
   */
  public EClass getEDataTypeModelGenAnnotation() {
    return eDataTypeModelGenAnnotationEClass;
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition <em>Dao Finder Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Finder Definition</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition
   * @generated
   */
  public EClass getDaoFinderDefinition() {
    return daoFinderDefinitionEClass;
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition#getFindPart <em>Find Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Find Part</em>'.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition#getFindPart()
   * @see #getDaoFinderDefinition()
   * @generated
   */
  public EReference getDaoFinderDefinition_FindPart() {
    return (EReference)daoFinderDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  public ModelcodegeneratorFactory getModelcodegeneratorFactory() {
    return (ModelcodegeneratorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ePackageModelGenAnnotationEClass = createEClass(EPACKAGE_MODEL_GEN_ANNOTATION);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME);
    createEReference(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER);
    createEReference(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS);
    createEReference(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS);
    createEReference(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS);
    createEReference(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME);
    createEAttribute(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS);
    createEReference(ePackageModelGenAnnotationEClass, EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS);

    eNamedElementModelGenAnnotationEClass = createEClass(ENAMED_ELEMENT_MODEL_GEN_ANNOTATION);
    createEAttribute(eNamedElementModelGenAnnotationEClass, ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION);
    createEAttribute(eNamedElementModelGenAnnotationEClass, ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME);

    eClassifierModelGenAnnotationEClass = createEClass(ECLASSIFIER_MODEL_GEN_ANNOTATION);
    createEAttribute(eClassifierModelGenAnnotationEClass, ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME);
    createEAttribute(eClassifierModelGenAnnotationEClass, ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME);
    createEAttribute(eClassifierModelGenAnnotationEClass, ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE);
    createEReference(eClassifierModelGenAnnotationEClass, ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION);

    eClassModelGenAnnotationEClass = createEClass(ECLASS_MODEL_GEN_ANNOTATION);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT);
    createEReference(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS);
    createEReference(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES);
    createEReference(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS);
    createEAttribute(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME);
    createEReference(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS);
    createEReference(eClassModelGenAnnotationEClass, ECLASS_MODEL_GEN_ANNOTATION__EALL_STRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS);

    eDataTypeModelGenAnnotationDefinitionEClass = createEClass(EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION);
    createEAttribute(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__INSTANCE_CLASS_NAME);
    createEAttribute(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OBJECT_CLASS_NAME);
    createEAttribute(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENUM);
    createEAttribute(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DATE_TYPE);
    createEAttribute(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__AUTOMATIC_STRING_CONVERSION);
    createEReference(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__BASE_TYPE_ANNOTATION);
    createEAttribute(eDataTypeModelGenAnnotationDefinitionEClass, EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ITEM_TYPE);

    eStructuralFeatureModelGenAnnotationEClass = createEClass(ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME);
    createEReference(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE);
    createEReference(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST);
    createEAttribute(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE);
    createEReference(eStructuralFeatureModelGenAnnotationEClass, ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION);

    eAttributeModelGenAnnotationEClass = createEClass(EATTRIBUTE_MODEL_GEN_ANNOTATION);
    createEAttribute(eAttributeModelGenAnnotationEClass, EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN);
    createEAttribute(eAttributeModelGenAnnotationEClass, EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE);

    eReferenceModelGenAnnotationEClass = createEClass(EREFERENCE_MODEL_GEN_ANNOTATION);
    createEReference(eReferenceModelGenAnnotationEClass, EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION);
    createEAttribute(eReferenceModelGenAnnotationEClass, EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS);
    createEAttribute(eReferenceModelGenAnnotationEClass, EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT);

    eEnumModelGenAnnotationEClass = createEClass(EENUM_MODEL_GEN_ANNOTATION);

    eDataTypeModelGenAnnotationEClass = createEClass(EDATA_TYPE_MODEL_GEN_ANNOTATION);

    daoFinderDefinitionEClass = createEClass(DAO_FINDER_DEFINITION);
    createEReference(daoFinderDefinitionEClass, DAO_FINDER_DEFINITION__FIND_PART);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    AnnotationsmodelPackage theAnnotationsmodelPackage = (AnnotationsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsmodelPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ePackageModelGenAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEPackageAnnotation());
    ePackageModelGenAnnotationEClass.getESuperTypes().add(this.getENamedElementModelGenAnnotation());
    eClassifierModelGenAnnotationEClass.getESuperTypes().add(this.getENamedElementModelGenAnnotation());
    eClassModelGenAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEClassAnnotation());
    eClassModelGenAnnotationEClass.getESuperTypes().add(this.getEClassifierModelGenAnnotation());
    eDataTypeModelGenAnnotationDefinitionEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEDataTypeAnnotation());
    eDataTypeModelGenAnnotationDefinitionEClass.getESuperTypes().add(this.getEClassifierModelGenAnnotation());
    eStructuralFeatureModelGenAnnotationEClass.getESuperTypes().add(this.getENamedElementModelGenAnnotation());
    eAttributeModelGenAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEAttributeAnnotation());
    eAttributeModelGenAnnotationEClass.getESuperTypes().add(this.getEStructuralFeatureModelGenAnnotation());
    eReferenceModelGenAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEReferenceAnnotation());
    eReferenceModelGenAnnotationEClass.getESuperTypes().add(this.getEStructuralFeatureModelGenAnnotation());
    eEnumModelGenAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEEnumAnnotation());
    eEnumModelGenAnnotationEClass.getESuperTypes().add(this.getEDataTypeModelGenAnnotationDefinition());
    eDataTypeModelGenAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEDataTypeAnnotation());
    eDataTypeModelGenAnnotationEClass.getESuperTypes().add(this.getEDataTypeModelGenAnnotationDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(ePackageModelGenAnnotationEClass, EPackageModelGenAnnotation.class, "EPackageModelGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_AddRuntimeModelBehavior(), ecorePackage.getEBoolean(), "addRuntimeModelBehavior", "true", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_GenerateInterfaces(), ecorePackage.getEBoolean(), "generateInterfaces", "false", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_PackagePath(), theEcorePackage.getEString(), "packagePath", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_ModelClassesPackagePath(), theEcorePackage.getEString(), "modelClassesPackagePath", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_QualifiedClassName(), theEcorePackage.getEString(), "qualifiedClassName", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_SimpleClassName(), theEcorePackage.getEString(), "simpleClassName", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_SimpleModelFactoryClassName(), theEcorePackage.getEString(), "simpleModelFactoryClassName", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageModelGenAnnotation_DependsOn(), this.getEPackageModelGenAnnotation(), null, "dependsOn", null, 0, -1, EPackageModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_EcoreFileContent(), theEcorePackage.getEString(), "ecoreFileContent", null, 0, 1, EPackageModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_EcoreFileName(), theEcorePackage.getEString(), "ecoreFileName", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_JavaFileHeader(), theEcorePackage.getEString(), "javaFileHeader", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageModelGenAnnotation_EClassModelGenAnnotations(), this.getEClassModelGenAnnotation(), null, "eClassModelGenAnnotations", null, 0, -1, EPackageModelGenAnnotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageModelGenAnnotation_EDataTypeModelGenAnnotations(), this.getEDataTypeModelGenAnnotationDefinition(), null, "eDataTypeModelGenAnnotations", null, 0, -1, EPackageModelGenAnnotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageModelGenAnnotation_EEnumModelGenAnnotations(), this.getEEnumModelGenAnnotation(), null, "eEnumModelGenAnnotations", null, 0, -1, EPackageModelGenAnnotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageModelGenAnnotation_EClassifierModelGenAnnotations(), this.getEClassifierModelGenAnnotation(), null, "eClassifierModelGenAnnotations", null, 0, -1, EPackageModelGenAnnotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_ModelPackageClassNamePostFix(), theEcorePackage.getEString(), "modelPackageClassNamePostFix", "ModelPackage", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_ModelFactoryClassNamePostFix(), theEcorePackage.getEString(), "modelFactoryClassNamePostFix", "ModelFactory", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_FeatureGroupClassNamePostFix(), theEcorePackage.getEString(), "featureGroupClassNamePostFix", "FeatureGroup", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_GenerateSafeManyAccess(), theEcorePackage.getEBoolean(), "generateSafeManyAccess", "false", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_RootClassExtends(), theEcorePackage.getEString(), "rootClassExtends", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_RootInterfaceExtends(), theEcorePackage.getEString(), "rootInterfaceExtends", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_FeatureMapClassExtends(), theEcorePackage.getEString(), "featureMapClassExtends", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_GenerateBidirectionalAssociationSupport(), theEcorePackage.getEBoolean(), "generateBidirectionalAssociationSupport", "true", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_HandleEcoreFile(), ecorePackage.getEBoolean(), "handleEcoreFile", "true", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_DaoClassesPackagePath(), theEcorePackage.getEString(), "daoClassesPackagePath", null, 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageModelGenAnnotation_DaoPatternName(), theEcorePackage.getEString(), "daoPatternName", "dao", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageModelGenAnnotation_DaoRootClass(), theEcorePackage.getEString(), "daoRootClass", "", 0, 1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEPackageModelGenAnnotation_SubPackageModelGens(), this.getEPackageModelGenAnnotation(), null, "subPackageModelGens", null, 0, -1, EPackageModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eNamedElementModelGenAnnotationEClass, ENamedElementModelGenAnnotation.class, "ENamedElementModelGenAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getENamedElementModelGenAnnotation_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, ENamedElementModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getENamedElementModelGenAnnotation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ENamedElementModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eClassifierModelGenAnnotationEClass, EClassifierModelGenAnnotation.class, "EClassifierModelGenAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEClassifierModelGenAnnotation_QualifiedClassName(), theEcorePackage.getEString(), "qualifiedClassName", null, 0, 1, EClassifierModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEClassifierModelGenAnnotation_SimpleClassName(), theEcorePackage.getEString(), "simpleClassName", null, 0, 1, EClassifierModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEClassifierModelGenAnnotation_GenerateCode(), theEcorePackage.getEBoolean(), "generateCode", "true", 0, 1, EClassifierModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEClassifierModelGenAnnotation_OwnerEPackageAnnotation(), this.getEPackageModelGenAnnotation(), null, "ownerEPackageAnnotation", null, 0, 1, EClassifierModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

    initEClass(eClassModelGenAnnotationEClass, EClassModelGenAnnotation.class, "EClassModelGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEClassModelGenAnnotation_HasManyFeatures(), theEcorePackage.getEBoolean(), "hasManyFeatures", "false", 0, 1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEClassModelGenAnnotation_ClassExtends(), theEcorePackage.getEString(), "classExtends", null, 0, -1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEClassModelGenAnnotation_HasSuperEClass(), ecorePackage.getEBoolean(), "hasSuperEClass", "false", 0, 1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEClassModelGenAnnotation_ClassImplements(), theEcorePackage.getEString(), "classImplements", null, 0, -1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEClassModelGenAnnotation_Serializable(), ecorePackage.getEBoolean(), "serializable", "false", 0, 1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEClassModelGenAnnotation_Abstract(), theEcorePackage.getEBoolean(), "abstract", "false", 0, 1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEClassModelGenAnnotation_SuperEClass(), this.getEClassModelGenAnnotation(), null, "superEClass", null, 0, 1, EClassModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassModelGenAnnotation_FeatureMapFeatures(), this.getEStructuralFeatureModelGenAnnotation(), null, "featureMapFeatures", null, 0, -1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassModelGenAnnotation_EStructuralFeatureModelGenAnnotations(), this.getEStructuralFeatureModelGenAnnotation(), null, "eStructuralFeatureModelGenAnnotations", null, 0, -1, EClassModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEClassModelGenAnnotation_DaoQualifiedClassName(), theEcorePackage.getEString(), "daoQualifiedClassName", null, 0, 1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassModelGenAnnotation_DaoFinders(), this.getDaoFinderDefinition(), null, "daoFinders", null, 0, 1, EClassModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassModelGenAnnotation_EAllStructuralFeatureModelGenAnnotations(), this.getEStructuralFeatureModelGenAnnotation(), null, "eAllStructuralFeatureModelGenAnnotations", null, 0, -1, EClassModelGenAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eDataTypeModelGenAnnotationDefinitionEClass, EDataTypeModelGenAnnotationDefinition.class, "EDataTypeModelGenAnnotationDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEDataTypeModelGenAnnotationDefinition_InstanceClassName(), theEcorePackage.getEString(), "instanceClassName", null, 0, 1, EDataTypeModelGenAnnotationDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEDataTypeModelGenAnnotationDefinition_ObjectClassName(), theEcorePackage.getEString(), "objectClassName", null, 0, 1, EDataTypeModelGenAnnotationDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEDataTypeModelGenAnnotationDefinition_Enum(), ecorePackage.getEBoolean(), "enum", "false", 0, 1, EDataTypeModelGenAnnotationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEDataTypeModelGenAnnotationDefinition_DateType(), ecorePackage.getEBoolean(), "dateType", "false", 0, 1, EDataTypeModelGenAnnotationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEDataTypeModelGenAnnotationDefinition_AutomaticStringConversion(), theEcorePackage.getEBoolean(), "automaticStringConversion", "false", 0, 1, EDataTypeModelGenAnnotationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEDataTypeModelGenAnnotationDefinition_BaseTypeAnnotation(), this.getEDataTypeModelGenAnnotationDefinition(), null, "baseTypeAnnotation", null, 0, 1, EDataTypeModelGenAnnotationDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEDataTypeModelGenAnnotationDefinition_ItemType(), theEcorePackage.getEString(), "itemType", null, 1, 1, EDataTypeModelGenAnnotationDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eStructuralFeatureModelGenAnnotationEClass, EStructuralFeatureModelGenAnnotation.class, "EStructuralFeatureModelGenAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_Getter(), theEcorePackage.getEString(), "getter", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_Type(), theEcorePackage.getEString(), "type", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_ObjectType(), theEcorePackage.getEString(), "objectType", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_ItemType(), theEcorePackage.getEString(), "itemType", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_DefaultValue(), theEcorePackage.getEString(), "defaultValue", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_Setter(), theEcorePackage.getEString(), "setter", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_ValidJavaMemberName(), theEcorePackage.getEString(), "validJavaMemberName", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_GenerateCode(), theEcorePackage.getEBoolean(), "generateCode", "true", 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_FeatureMapQualifiedClassName(), theEcorePackage.getEString(), "featureMapQualifiedClassName", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_FeatureMapSimpleClassName(), theEcorePackage.getEString(), "featureMapSimpleClassName", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEStructuralFeatureModelGenAnnotation_FeatureMapFeature(), this.getEStructuralFeatureModelGenAnnotation(), this.getEStructuralFeatureModelGenAnnotation_MemberFeatureMapFeatures(), "featureMapFeature", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEStructuralFeatureModelGenAnnotation_MemberFeatureMapFeatures(), this.getEStructuralFeatureModelGenAnnotation(), this.getEStructuralFeatureModelGenAnnotation_FeatureMapFeature(), "memberFeatureMapFeatures", null, 0, -1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_Many(), ecorePackage.getEBoolean(), "many", "false", 0, 1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_UseList(), ecorePackage.getEBoolean(), "useList", "true", 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEStructuralFeatureModelGenAnnotation_Reference(), ecorePackage.getEBoolean(), "reference", "false", 0, 1, EStructuralFeatureModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEStructuralFeatureModelGenAnnotation_OwnerEClassAnnotation(), this.getEClassModelGenAnnotation(), null, "ownerEClassAnnotation", null, 0, 1, EStructuralFeatureModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eAttributeModelGenAnnotationEClass, EAttributeModelGenAnnotation.class, "EAttributeModelGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEAttributeModelGenAnnotation_Boolean(), ecorePackage.getEBoolean(), "boolean", "false", 0, 1, EAttributeModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEAttributeModelGenAnnotation_Primitive(), ecorePackage.getEBoolean(), "primitive", "false", 0, 1, EAttributeModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

    initEClass(eReferenceModelGenAnnotationEClass, EReferenceModelGenAnnotation.class, "EReferenceModelGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getEReferenceModelGenAnnotation_OppositeModelGenAnnotation(), this.getEReferenceModelGenAnnotation(), null, "oppositeModelGenAnnotation", null, 0, 1, EReferenceModelGenAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEReferenceModelGenAnnotation_GenerateSafeManyAccess(), theEcorePackage.getEBoolean(), "generateSafeManyAccess", "true", 0, 1, EReferenceModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEReferenceModelGenAnnotation_GenerateBidirectionalAssociationSupport(), theEcorePackage.getEBoolean(), "generateBidirectionalAssociationSupport", "true", 0, 1, EReferenceModelGenAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

    initEClass(eEnumModelGenAnnotationEClass, EEnumModelGenAnnotation.class, "EEnumModelGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(eDataTypeModelGenAnnotationEClass, EDataTypeModelGenAnnotation.class, "EDataTypeModelGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(daoFinderDefinitionEClass, DaoFinderDefinition.class, "DaoFinderDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getDaoFinderDefinition_FindPart(), this.getEStructuralFeatureModelGenAnnotation(), null, "findPart", null, 0, -1, DaoFinderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    // Create resource
    createResource(eNS_URI);
  }

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  public interface Literals {
    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation <em>EPackage Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEPackageModelGenAnnotation()
     * @generated
     */
    public static final EClass EPACKAGE_MODEL_GEN_ANNOTATION = eINSTANCE.getEPackageModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Add Runtime Model Behavior</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR = eINSTANCE.getEPackageModelGenAnnotation_AddRuntimeModelBehavior();

    /**
     * The meta object literal for the '<em><b>Generate Interfaces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES = eINSTANCE.getEPackageModelGenAnnotation_GenerateInterfaces();

    /**
     * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH = eINSTANCE.getEPackageModelGenAnnotation_PackagePath();

    /**
     * The meta object literal for the '<em><b>Model Classes Package Path</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH = eINSTANCE.getEPackageModelGenAnnotation_ModelClassesPackagePath();

    /**
     * The meta object literal for the '<em><b>Qualified Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = eINSTANCE.getEPackageModelGenAnnotation_QualifiedClassName();

    /**
     * The meta object literal for the '<em><b>Simple Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = eINSTANCE.getEPackageModelGenAnnotation_SimpleClassName();

    /**
     * The meta object literal for the '<em><b>Simple Model Factory Class Name</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME = eINSTANCE.getEPackageModelGenAnnotation_SimpleModelFactoryClassName();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EReference EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON = eINSTANCE.getEPackageModelGenAnnotation_DependsOn();

    /**
     * The meta object literal for the '<em><b>Ecore File Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT = eINSTANCE.getEPackageModelGenAnnotation_EcoreFileContent();

    /**
     * The meta object literal for the '<em><b>Ecore File Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME = eINSTANCE.getEPackageModelGenAnnotation_EcoreFileName();

    /**
     * The meta object literal for the '<em><b>Java File Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER = eINSTANCE.getEPackageModelGenAnnotation_JavaFileHeader();

    /**
     * The meta object literal for the '<em><b>EClass Model Gen Annotations</b></em>' reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS = eINSTANCE.getEPackageModelGenAnnotation_EClassModelGenAnnotations();

    /**
     * The meta object literal for the '<em><b>EData Type Model Gen Annotations</b></em>' reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS = eINSTANCE.getEPackageModelGenAnnotation_EDataTypeModelGenAnnotations();

    /**
     * The meta object literal for the '<em><b>EEnum Model Gen Annotations</b></em>' reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS = eINSTANCE.getEPackageModelGenAnnotation_EEnumModelGenAnnotations();

    /**
     * The meta object literal for the '<em><b>EClassifier Model Gen Annotations</b></em>' reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS = eINSTANCE.getEPackageModelGenAnnotation_EClassifierModelGenAnnotations();

    /**
     * The meta object literal for the '<em><b>Model Package Class Name Post Fix</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX = eINSTANCE.getEPackageModelGenAnnotation_ModelPackageClassNamePostFix();

    /**
     * The meta object literal for the '<em><b>Model Factory Class Name Post Fix</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX = eINSTANCE.getEPackageModelGenAnnotation_ModelFactoryClassNamePostFix();

    /**
     * The meta object literal for the '<em><b>Feature Group Class Name Post Fix</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX = eINSTANCE.getEPackageModelGenAnnotation_FeatureGroupClassNamePostFix();

    /**
     * The meta object literal for the '<em><b>Generate Safe Many Access</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS = eINSTANCE.getEPackageModelGenAnnotation_GenerateSafeManyAccess();

    /**
     * The meta object literal for the '<em><b>Root Class Extends</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS = eINSTANCE.getEPackageModelGenAnnotation_RootClassExtends();

    /**
     * The meta object literal for the '<em><b>Root Interface Extends</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS = eINSTANCE.getEPackageModelGenAnnotation_RootInterfaceExtends();

    /**
     * The meta object literal for the '<em><b>Feature Map Class Extends</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS = eINSTANCE.getEPackageModelGenAnnotation_FeatureMapClassExtends();

    /**
     * The meta object literal for the '<em><b>Generate Bidirectional Association Support</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT = eINSTANCE.getEPackageModelGenAnnotation_GenerateBidirectionalAssociationSupport();

    /**
     * The meta object literal for the '<em><b>Handle Ecore File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE = eINSTANCE.getEPackageModelGenAnnotation_HandleEcoreFile();

    /**
     * The meta object literal for the '<em><b>Dao Classes Package Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH = eINSTANCE.getEPackageModelGenAnnotation_DaoClassesPackagePath();

    /**
     * The meta object literal for the '<em><b>Dao Pattern Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME = eINSTANCE.getEPackageModelGenAnnotation_DaoPatternName();

    /**
     * The meta object literal for the '<em><b>Dao Root Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS = eINSTANCE.getEPackageModelGenAnnotation_DaoRootClass();

    /**
     * The meta object literal for the '<em><b>Sub Package Model Gens</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		public static final EReference EPACKAGE_MODEL_GEN_ANNOTATION__SUB_PACKAGE_MODEL_GENS = eINSTANCE.getEPackageModelGenAnnotation_SubPackageModelGens();

				/**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation <em>ENamed Element Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation()
     * @generated
     */
    public static final EClass ENAMED_ELEMENT_MODEL_GEN_ANNOTATION = eINSTANCE.getENamedElementModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION = eINSTANCE.getENamedElementModelGenAnnotation_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME = eINSTANCE.getENamedElementModelGenAnnotation_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation <em>EClassifier Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassifierModelGenAnnotation()
     * @generated
     */
    public static final EClass ECLASSIFIER_MODEL_GEN_ANNOTATION = eINSTANCE.getEClassifierModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Qualified Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME = eINSTANCE.getEClassifierModelGenAnnotation_QualifiedClassName();

    /**
     * The meta object literal for the '<em><b>Simple Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME = eINSTANCE.getEClassifierModelGenAnnotation_SimpleClassName();

    /**
     * The meta object literal for the '<em><b>Generate Code</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE = eINSTANCE.getEClassifierModelGenAnnotation_GenerateCode();

    /**
     * The meta object literal for the '<em><b>Owner EPackage Annotation</b></em>' reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION = eINSTANCE.getEClassifierModelGenAnnotation_OwnerEPackageAnnotation();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation <em>EClass Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEClassModelGenAnnotation()
     * @generated
     */
    public static final EClass ECLASS_MODEL_GEN_ANNOTATION = eINSTANCE.getEClassModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Has Many Features</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES = eINSTANCE.getEClassModelGenAnnotation_HasManyFeatures();

    /**
     * The meta object literal for the '<em><b>Class Extends</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS = eINSTANCE.getEClassModelGenAnnotation_ClassExtends();

    /**
     * The meta object literal for the '<em><b>Has Super EClass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS = eINSTANCE.getEClassModelGenAnnotation_HasSuperEClass();

    /**
     * The meta object literal for the '<em><b>Class Implements</b></em>' attribute list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS = eINSTANCE.getEClassModelGenAnnotation_ClassImplements();

    /**
     * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE = eINSTANCE.getEClassModelGenAnnotation_Serializable();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT = eINSTANCE.getEClassModelGenAnnotation_Abstract();

    /**
     * The meta object literal for the '<em><b>Super EClass</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EReference ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS = eINSTANCE.getEClassModelGenAnnotation_SuperEClass();

    /**
     * The meta object literal for the '<em><b>Feature Map Features</b></em>' reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES = eINSTANCE.getEClassModelGenAnnotation_FeatureMapFeatures();

    /**
     * The meta object literal for the '<em><b>EStructural Feature Model Gen Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS = eINSTANCE.getEClassModelGenAnnotation_EStructuralFeatureModelGenAnnotations();

    /**
     * The meta object literal for the '<em><b>Dao Qualified Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME = eINSTANCE.getEClassModelGenAnnotation_DaoQualifiedClassName();

    /**
     * The meta object literal for the '<em><b>Dao Finders</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS = eINSTANCE.getEClassModelGenAnnotation_DaoFinders();

    /**
     * The meta object literal for the '<em><b>EAll Structural Feature Model Gen Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		public static final EReference ECLASS_MODEL_GEN_ANNOTATION__EALL_STRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS = eINSTANCE.getEClassModelGenAnnotation_EAllStructuralFeatureModelGenAnnotations();

				/**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition <em>EData Type Model Gen Annotation Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotationDefinition()
     * @generated
     */
    public static final EClass EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION = eINSTANCE.getEDataTypeModelGenAnnotationDefinition();

    /**
     * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__INSTANCE_CLASS_NAME = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_InstanceClassName();

    /**
     * The meta object literal for the '<em><b>Object Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OBJECT_CLASS_NAME = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_ObjectClassName();

    /**
     * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENUM = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_Enum();

    /**
     * The meta object literal for the '<em><b>Date Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DATE_TYPE = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_DateType();

    /**
     * The meta object literal for the '<em><b>Automatic String Conversion</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__AUTOMATIC_STRING_CONVERSION = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_AutomaticStringConversion();

    /**
     * The meta object literal for the '<em><b>Base Type Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__BASE_TYPE_ANNOTATION = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_BaseTypeAnnotation();

    /**
     * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ITEM_TYPE = eINSTANCE.getEDataTypeModelGenAnnotationDefinition_ItemType();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation <em>EStructural Feature Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEStructuralFeatureModelGenAnnotation()
     * @generated
     */
    public static final EClass ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION = eINSTANCE.getEStructuralFeatureModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Getter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER = eINSTANCE.getEStructuralFeatureModelGenAnnotation_Getter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_Type();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_ObjectType();

    /**
     * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_ItemType();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Setter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER = eINSTANCE.getEStructuralFeatureModelGenAnnotation_Setter();

    /**
     * The meta object literal for the '<em><b>Valid Java Member Name</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME = eINSTANCE.getEStructuralFeatureModelGenAnnotation_ValidJavaMemberName();

    /**
     * The meta object literal for the '<em><b>Generate Code</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_GenerateCode();

    /**
     * The meta object literal for the '<em><b>Feature Map Qualified Class Name</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME = eINSTANCE.getEStructuralFeatureModelGenAnnotation_FeatureMapQualifiedClassName();

    /**
     * The meta object literal for the '<em><b>Feature Map Simple Class Name</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME = eINSTANCE.getEStructuralFeatureModelGenAnnotation_FeatureMapSimpleClassName();

    /**
     * The meta object literal for the '<em><b>Feature Map Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_FeatureMapFeature();

    /**
     * The meta object literal for the '<em><b>Member Feature Map Features</b></em>' reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES = eINSTANCE.getEStructuralFeatureModelGenAnnotation_MemberFeatureMapFeatures();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY = eINSTANCE.getEStructuralFeatureModelGenAnnotation_Many();

    /**
     * The meta object literal for the '<em><b>Use List</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST = eINSTANCE.getEStructuralFeatureModelGenAnnotation_UseList();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE = eINSTANCE.getEStructuralFeatureModelGenAnnotation_Reference();

    /**
     * The meta object literal for the '<em><b>Owner EClass Annotation</b></em>' reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION = eINSTANCE.getEStructuralFeatureModelGenAnnotation_OwnerEClassAnnotation();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation <em>EAttribute Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEAttributeModelGenAnnotation()
     * @generated
     */
    public static final EClass EATTRIBUTE_MODEL_GEN_ANNOTATION = eINSTANCE.getEAttributeModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EATTRIBUTE_MODEL_GEN_ANNOTATION__BOOLEAN = eINSTANCE.getEAttributeModelGenAnnotation_Boolean();

    /**
     * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EATTRIBUTE_MODEL_GEN_ANNOTATION__PRIMITIVE = eINSTANCE.getEAttributeModelGenAnnotation_Primitive();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation <em>EReference Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEReferenceModelGenAnnotation()
     * @generated
     */
    public static final EClass EREFERENCE_MODEL_GEN_ANNOTATION = eINSTANCE.getEReferenceModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Opposite Model Gen Annotation</b></em>' reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION = eINSTANCE.getEReferenceModelGenAnnotation_OppositeModelGenAnnotation();

    /**
     * The meta object literal for the '<em><b>Generate Safe Many Access</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS = eINSTANCE.getEReferenceModelGenAnnotation_GenerateSafeManyAccess();

    /**
     * The meta object literal for the '<em><b>Generate Bidirectional Association Support</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT = eINSTANCE.getEReferenceModelGenAnnotation_GenerateBidirectionalAssociationSupport();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation <em>EEnum Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEEnumModelGenAnnotation()
     * @generated
     */
    public static final EClass EENUM_MODEL_GEN_ANNOTATION = eINSTANCE.getEEnumModelGenAnnotation();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation <em>EData Type Model Gen Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getEDataTypeModelGenAnnotation()
     * @generated
     */
    public static final EClass EDATA_TYPE_MODEL_GEN_ANNOTATION = eINSTANCE.getEDataTypeModelGenAnnotation();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition <em>Dao Finder Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition
     * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getDaoFinderDefinition()
     * @generated
     */
    public static final EClass DAO_FINDER_DEFINITION = eINSTANCE.getDaoFinderDefinition();

    /**
     * The meta object literal for the '<em><b>Find Part</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference DAO_FINDER_DEFINITION__FIND_PART = eINSTANCE.getDaoFinderDefinition_FindPart();

  }

} // ModelcodegeneratorPackage
