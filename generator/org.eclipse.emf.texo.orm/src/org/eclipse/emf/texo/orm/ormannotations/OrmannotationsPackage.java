/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmannotationsPackage.java,v 1.11 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsFactory
 * @model kind="package"
 * @generated
 */
public class OrmannotationsPackage extends EPackageImpl {
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String eNAME = "ormannotations";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_URI = "http://www.eclipse.org/emf/texo/orm/ormannotations";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "ormannotations";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final OrmannotationsPackage eINSTANCE = org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation <em>EPackage ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation()
   * @generated
   */
  public static final int EPACKAGE_ORM_ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__GENERATED = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__EPACKAGE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__EPACKAGE;

  /**
   * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__ANNOTATED_EPACKAGE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE;

  /**
   * The feature id for the '<em><b>Generate Full Db Schema Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name Dictionary Property File</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Table Name Prefix</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Column Name Prefix</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Maximum Sql Name Length</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Lower Cased Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Upper Cased Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Enforce Unique Names</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Use Join Tables For Containment</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Use Join Tables For Non Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Default Cascade Containment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Default Cascade Non Containment</b></em>' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Entity Mappings</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Generate Java Annotations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Add Order Column To List Mappings</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Rename SQL Reserved Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION__INHERITANCE = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Unique Entity Names</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 17;

		/**
   * The feature id for the '<em><b>Set Delimited Identifier Tag In ORM</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	public static final int EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 18;

		/**
   * The number of structural features of the '<em>EPackage ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EPACKAGE_ORM_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EPACKAGE_ANNOTATION_FEATURE_COUNT + 19;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation <em>ENamed Element ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getENamedElementORMAnnotation()
   * @generated
   */
  public static final int ENAMED_ELEMENT_ORM_ANNOTATION = 10;

  /**
   * The number of structural features of the '<em>ENamed Element ORM Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENAMED_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation <em>EType Element ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getETypeElementORMAnnotation()
   * @generated
   */
  public static final int ETYPE_ELEMENT_ORM_ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT = ENAMED_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EType Element ORM Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ETYPE_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation <em>EClassifier ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassifierORMAnnotation()
   * @generated
   */
  public static final int ECLASSIFIER_ORM_ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_ORM_ANNOTATION__TRANSIENT = ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;

  /**
   * The number of structural features of the '<em>EClassifier ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_ORM_ANNOTATION_FEATURE_COUNT = ETYPE_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation <em>EClass ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation()
   * @generated
   */
  public static final int ECLASS_ORM_ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.ECLASS_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.ECLASS_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.ECLASS_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__GENERATED = AnnotationsmodelPackage.ECLASS_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__ECLASSIFIER = AnnotationsmodelPackage.ECLASS_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClass</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__ANNOTATED_ECLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__ECLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION__ECLASS;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__TRANSIENT = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__ENTITY = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Embeddable</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__EMBEDDABLE = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION__INHERITANCE = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>EClass ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ECLASS_ORM_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.ECLASS_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition <em>EData Type ORM Annotation Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotationDefinition()
   * @generated
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__ENAMED_ELEMENT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__DESCRIPTION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__LAST_IDENTIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__GENERATED = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__ANNOTATED_EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE;

  /**
   * The feature id for the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION__TRANSIENT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EData Type ORM Annotation Definition</em>' class.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_DEFINITION_FEATURE_COUNT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation <em>EStructural Feature ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation()
   * @generated
   */
  public static final int ESTRUCTURAL_FEATURE_ORM_ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_ORM_ANNOTATION__TRANSIENT = ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;

  /**
   * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE = ETYPE_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION = ETYPE_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>EStructural Feature ORM Annotation</em>' class.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_ORM_ANNOTATION_FEATURE_COUNT = ETYPE_ELEMENT_ORM_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation <em>EAttribute ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation()
   * @generated
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION = 6;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__GENERATED = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__ESTRUCTURAL_FEATURE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ESTRUCTURAL_FEATURE;

  /**
   * The feature id for the '<em><b>EAttribute</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__EATTRIBUTE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__EATTRIBUTE;

  /**
   * The feature id for the '<em><b>Annotated EAttribute</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__ANNOTATED_EATTRIBUTE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__TRANSIENT = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__BASIC = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__ID = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__VERSION = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>One To Many</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Feature Map Entity</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Many To One</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>EAttribute ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ORM_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation <em>EReference ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation()
   * @generated
   */
  public static final int EREFERENCE_ORM_ANNOTATION = 7;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__GENERATED = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ESTRUCTURAL_FEATURE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ESTRUCTURAL_FEATURE;

  /**
   * The feature id for the '<em><b>EReference</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__EREFERENCE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__EREFERENCE;

  /**
   * The feature id for the '<em><b>Annotated EReference</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ANNOTATED_EREFERENCE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__TRANSIENT = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Embedded</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__EMBEDDED = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__JOIN_TABLE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Many To One</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>One To Many</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>One To One</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Map Key</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__MAP_KEY = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Order By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ORDER_BY = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Order Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Basic Collection</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Basic Map</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__BASIC_MAP = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION__BASIC = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 22;

  /**
   * The number of structural features of the '<em>EReference ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ORM_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EREFERENCE_ANNOTATION_FEATURE_COUNT + 23;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation <em>EEnum ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation()
   * @generated
   */
  public static final int EENUM_ORM_ANNOTATION = 8;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EENUM_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EENUM_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EENUM_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__GENERATED = AnnotationsmodelPackage.EENUM_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ECLASSIFIER = AnnotationsmodelPackage.EENUM_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>EEnum</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__EENUM = AnnotationsmodelPackage.EENUM_ANNOTATION__EENUM;

  /**
   * The feature id for the '<em><b>Annotated EEnum</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ANNOTATED_EENUM = AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM;

  /**
   * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__EDATA_TYPE = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__TRANSIENT = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enumerated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ENUMERATED = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__BASIC = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__VERSION = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>EEnum ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EENUM_ORM_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EENUM_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation <em>EData Type ORM Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation()
   * @generated
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION = 9;

  /**
   * The feature id for the '<em><b>ENamed Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__ENAMED_ELEMENT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__DESCRIPTION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__LAST_IDENTIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__LAST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__GENERATED = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__GENERATED;

  /**
   * The feature id for the '<em><b>EClassifier</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__ANNOTATED_ECLASSIFIER = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE;

  /**
   * The feature id for the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__EDATA_TYPE = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__TRANSIENT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__BASIC = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__ID = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__VERSION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>EData Type ORM Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ORM_ANNOTATION_FEATURE_COUNT = AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass ePackageORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eTypeElementORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassifierORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eDataTypeORMAnnotationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eStructuralFeatureORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eReferenceORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eEnumORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eDataTypeORMAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass eNamedElementORMAnnotationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrmannotationsPackage() {
    super(eNS_URI, OrmannotationsFactory.eINSTANCE);
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
   * This method is used to initialize {@link OrmannotationsPackage#eINSTANCE} when that field is accessed. Clients
   * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OrmannotationsPackage init() {
    if (isInited) return (OrmannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(OrmannotationsPackage.eNS_URI);

    // Obtain or create and register package
    OrmannotationsPackage theOrmannotationsPackage = (OrmannotationsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrmannotationsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrmannotationsPackage());

    isInited = true;

    // Initialize simple dependencies
    OrmPackage.eINSTANCE.eClass();
    AnnotationsmodelPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOrmannotationsPackage.createPackageContents();

    // Initialize created meta-data
    theOrmannotationsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOrmannotationsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrmannotationsPackage.eNS_URI, theOrmannotationsPackage);
    return theOrmannotationsPackage;
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation <em>EPackage ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation
   * @generated
   */
  public EClass getEPackageORMAnnotation() {
    return ePackageORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateFullDbSchemaNames <em>Generate Full Db Schema Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Full Db Schema Names</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateFullDbSchemaNames()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_GenerateFullDbSchemaNames() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getNameDictionaryPropertyFile <em>Name Dictionary Property File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Dictionary Property File</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getNameDictionaryPropertyFile()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_NameDictionaryPropertyFile() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getTableNamePrefix <em>Table Name Prefix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Name Prefix</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getTableNamePrefix()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_TableNamePrefix() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getColumnNamePrefix <em>Column Name Prefix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Name Prefix</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getColumnNamePrefix()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_ColumnNamePrefix() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getMaximumSqlNameLength <em>Maximum Sql Name Length</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maximum Sql Name Length</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getMaximumSqlNameLength()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_MaximumSqlNameLength() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isLowerCasedNames <em>Lower Cased Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Cased Names</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isLowerCasedNames()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_LowerCasedNames() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUpperCasedNames <em>Upper Cased Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Cased Names</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUpperCasedNames()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_UpperCasedNames() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isEnforceUniqueNames <em>Enforce Unique Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforce Unique Names</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isEnforceUniqueNames()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_EnforceUniqueNames() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForContainment <em>Use Join Tables For Containment</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Join Tables For Containment</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForContainment()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_UseJoinTablesForContainment() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForNonContainment <em>Use Join Tables For Non Containment</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Join Tables For Non Containment</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForNonContainment()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_UseJoinTablesForNonContainment() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeContainment <em>Default Cascade Containment</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Cascade Containment</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeContainment()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EReference getEPackageORMAnnotation_DefaultCascadeContainment() {
    return (EReference)ePackageORMAnnotationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeNonContainment <em>Default Cascade Non Containment</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Cascade Non Containment</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeNonContainment()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EReference getEPackageORMAnnotation_DefaultCascadeNonContainment() {
    return (EReference)ePackageORMAnnotationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getEntityMappings <em>Entity Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getEntityMappings()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EReference getEPackageORMAnnotation_EntityMappings() {
    return (EReference)ePackageORMAnnotationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateJavaAnnotations <em>Generate Java Annotations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Java Annotations</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateJavaAnnotations()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_GenerateJavaAnnotations() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isAddOrderColumnToListMappings <em>Add Order Column To List Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add Order Column To List Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isAddOrderColumnToListMappings()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_AddOrderColumnToListMappings() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isRenameSQLReservedNames <em>Rename SQL Reserved Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rename SQL Reserved Names</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isRenameSQLReservedNames()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EAttribute getEPackageORMAnnotation_RenameSQLReservedNames() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getInheritance <em>Inheritance</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Inheritance</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getInheritance()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
  public EReference getEPackageORMAnnotation_Inheritance() {
    return (EReference)ePackageORMAnnotationEClass.getEStructuralFeatures().get(16);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUniqueEntityNames <em>Unique Entity Names</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Entity Names</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUniqueEntityNames()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
	public EAttribute getEPackageORMAnnotation_UniqueEntityNames() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(17);
  }

		/**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isSetDelimitedIdentifierTagInORM <em>Set Delimited Identifier Tag In ORM</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Set Delimited Identifier Tag In ORM</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isSetDelimitedIdentifierTagInORM()
   * @see #getEPackageORMAnnotation()
   * @generated
   */
	public EAttribute getEPackageORMAnnotation_SetDelimitedIdentifierTagInORM() {
    return (EAttribute)ePackageORMAnnotationEClass.getEStructuralFeatures().get(18);
  }

		/**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation <em>EType Element ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EType Element ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation
   * @generated
   */
  public EClass getETypeElementORMAnnotation() {
    return eTypeElementORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation#getTransient <em>Transient</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Transient</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation#getTransient()
   * @see #getETypeElementORMAnnotation()
   * @generated
   */
  public EReference getETypeElementORMAnnotation_Transient() {
    return (EReference)eTypeElementORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation <em>EClassifier ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EClassifier ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation
   * @generated
   */
  public EClass getEClassifierORMAnnotation() {
    return eClassifierORMAnnotationEClass;
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation <em>EClass ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation
   * @generated
   */
  public EClass getEClassORMAnnotation() {
    return eClassORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEntity()
   * @see #getEClassORMAnnotation()
   * @generated
   */
  public EReference getEClassORMAnnotation_Entity() {
    return (EReference)eClassORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEmbeddable <em>Embeddable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Embeddable</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEmbeddable()
   * @see #getEClassORMAnnotation()
   * @generated
   */
  public EReference getEClassORMAnnotation_Embeddable() {
    return (EReference)eClassORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getMappedSuperclass <em>Mapped Superclass</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped Superclass</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getMappedSuperclass()
   * @see #getEClassORMAnnotation()
   * @generated
   */
  public EReference getEClassORMAnnotation_MappedSuperclass() {
    return (EReference)eClassORMAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getInheritance <em>Inheritance</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Inheritance</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getInheritance()
   * @see #getEClassORMAnnotation()
   * @generated
   */
  public EReference getEClassORMAnnotation_Inheritance() {
    return (EReference)eClassORMAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition <em>EData Type ORM Annotation Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EData Type ORM Annotation Definition</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition
   * @generated
   */
  public EClass getEDataTypeORMAnnotationDefinition() {
    return eDataTypeORMAnnotationDefinitionEClass;
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation <em>EStructural Feature ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EStructural Feature ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation
   * @generated
   */
  public EClass getEStructuralFeatureORMAnnotation() {
    return eStructuralFeatureORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getCollectionTable <em>Collection Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection Table</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getCollectionTable()
   * @see #getEStructuralFeatureORMAnnotation()
   * @generated
   */
  public EReference getEStructuralFeatureORMAnnotation_CollectionTable() {
    return (EReference)eStructuralFeatureORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getElementCollection <em>Element Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Collection</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getElementCollection()
   * @see #getEStructuralFeatureORMAnnotation()
   * @generated
   */
  public EReference getEStructuralFeatureORMAnnotation_ElementCollection() {
    return (EReference)eStructuralFeatureORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation <em>EAttribute ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation
   * @generated
   */
  public EClass getEAttributeORMAnnotation() {
    return eAttributeORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getBasic <em>Basic</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Basic</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getBasic()
   * @see #getEAttributeORMAnnotation()
   * @generated
   */
  public EReference getEAttributeORMAnnotation_Basic() {
    return (EReference)eAttributeORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getId()
   * @see #getEAttributeORMAnnotation()
   * @generated
   */
  public EReference getEAttributeORMAnnotation_Id() {
    return (EReference)eAttributeORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getVersion <em>Version</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getVersion()
   * @see #getEAttributeORMAnnotation()
   * @generated
   */
  public EReference getEAttributeORMAnnotation_Version() {
    return (EReference)eAttributeORMAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getOneToMany <em>One To Many</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>One To Many</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getOneToMany()
   * @see #getEAttributeORMAnnotation()
   * @generated
   */
  public EReference getEAttributeORMAnnotation_OneToMany() {
    return (EReference)eAttributeORMAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getFeatureMapEntity <em>Feature Map Entity</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Map Entity</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getFeatureMapEntity()
   * @see #getEAttributeORMAnnotation()
   * @generated
   */
  public EReference getEAttributeORMAnnotation_FeatureMapEntity() {
    return (EReference)eAttributeORMAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getManyToOne <em>Many To One</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Many To One</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getManyToOne()
   * @see #getEAttributeORMAnnotation()
   * @generated
   */
  public EReference getEAttributeORMAnnotation_ManyToOne() {
    return (EReference)eAttributeORMAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation <em>EReference ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation
   * @generated
   */
  public EClass getEReferenceORMAnnotation() {
    return eReferenceORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbedded <em>Embedded</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Embedded</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbedded()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_Embedded() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbeddedId <em>Embedded Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Embedded Id</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbeddedId()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_EmbeddedId() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinColumn()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_JoinColumn() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinTable <em>Join Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinTable()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_JoinTable() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToMany <em>Many To Many</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Many To Many</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToMany()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_ManyToMany() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToOne <em>Many To One</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Many To One</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToOne()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_ManyToOne() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToMany <em>One To Many</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>One To Many</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToMany()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_OneToMany() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToOne <em>One To One</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>One To One</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToOne()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_OneToOne() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKey <em>Map Key</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Map Key</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKey()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_MapKey() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyClass <em>Map Key Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key Class</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyClass()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_MapKeyClass() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyColumn <em>Map Key Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key Column</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyColumn()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_MapKeyColumn() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyJoinColumn()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_MapKeyJoinColumn() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderBy <em>Order By</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Order By</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderBy()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EAttribute getEReferenceORMAnnotation_OrderBy() {
    return (EAttribute)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderColumn <em>Order Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Order Column</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderColumn()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_OrderColumn() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicCollection <em>Basic Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Collection</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicCollection()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_BasicCollection() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicMap <em>Basic Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Basic Map</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicMap()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_BasicMap() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAssociationOverride <em>Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAssociationOverride()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_AssociationOverride() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(16);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAttributeOverride <em>Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAttributeOverride()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_AttributeOverride() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(17);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getPrimaryKeyJoinColumn()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_PrimaryKeyJoinColumn() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(18);
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasic <em>Basic</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Basic</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasic()
   * @see #getEReferenceORMAnnotation()
   * @generated
   */
  public EReference getEReferenceORMAnnotation_Basic() {
    return (EReference)eReferenceORMAnnotationEClass.getEStructuralFeatures().get(19);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation <em>EEnum ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EEnum ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation
   * @generated
   */
  public EClass getEEnumORMAnnotation() {
    return eEnumORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getEnumerated <em>Enumerated</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getEnumerated()
   * @see #getEEnumORMAnnotation()
   * @generated
   */
  public EAttribute getEEnumORMAnnotation_Enumerated() {
    return (EAttribute)eEnumORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getBasic <em>Basic</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getBasic()
   * @see #getEEnumORMAnnotation()
   * @generated
   */
  public EReference getEEnumORMAnnotation_Basic() {
    return (EReference)eEnumORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getVersion <em>Version</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Version</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getVersion()
   * @see #getEEnumORMAnnotation()
   * @generated
   */
  public EReference getEEnumORMAnnotation_Version() {
    return (EReference)eEnumORMAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getElementCollection <em>Element Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Collection</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getElementCollection()
   * @see #getEEnumORMAnnotation()
   * @generated
   */
  public EReference getEEnumORMAnnotation_ElementCollection() {
    return (EReference)eEnumORMAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation <em>EData Type ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EData Type ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation
   * @generated
   */
  public EClass getEDataTypeORMAnnotation() {
    return eDataTypeORMAnnotationEClass;
  }

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getBasic <em>Basic</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Basic</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getBasic()
   * @see #getEDataTypeORMAnnotation()
   * @generated
   */
  public EReference getEDataTypeORMAnnotation_Basic() {
    return (EReference)eDataTypeORMAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getId()
   * @see #getEDataTypeORMAnnotation()
   * @generated
   */
  public EReference getEDataTypeORMAnnotation_Id() {
    return (EReference)eDataTypeORMAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getVersion <em>Version</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Version</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getVersion()
   * @see #getEDataTypeORMAnnotation()
   * @generated
   */
  public EReference getEDataTypeORMAnnotation_Version() {
    return (EReference)eDataTypeORMAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getElementCollection <em>Element Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Collection</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getElementCollection()
   * @see #getEDataTypeORMAnnotation()
   * @generated
   */
  public EReference getEDataTypeORMAnnotation_ElementCollection() {
    return (EReference)eDataTypeORMAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation <em>ENamed Element ORM Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamed Element ORM Annotation</em>'.
   * @see org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation
   * @generated
   */
  public EClass getENamedElementORMAnnotation() {
    return eNamedElementORMAnnotationEClass;
  }

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  public OrmannotationsFactory getOrmannotationsFactory() {
    return (OrmannotationsFactory)getEFactoryInstance();
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
    ePackageORMAnnotationEClass = createEClass(EPACKAGE_ORM_ANNOTATION);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT);
    createEReference(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT);
    createEReference(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT);
    createEReference(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES);
    createEReference(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__INHERITANCE);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES);
    createEAttribute(ePackageORMAnnotationEClass, EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM);

    eTypeElementORMAnnotationEClass = createEClass(ETYPE_ELEMENT_ORM_ANNOTATION);
    createEReference(eTypeElementORMAnnotationEClass, ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT);

    eClassifierORMAnnotationEClass = createEClass(ECLASSIFIER_ORM_ANNOTATION);

    eClassORMAnnotationEClass = createEClass(ECLASS_ORM_ANNOTATION);
    createEReference(eClassORMAnnotationEClass, ECLASS_ORM_ANNOTATION__ENTITY);
    createEReference(eClassORMAnnotationEClass, ECLASS_ORM_ANNOTATION__EMBEDDABLE);
    createEReference(eClassORMAnnotationEClass, ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS);
    createEReference(eClassORMAnnotationEClass, ECLASS_ORM_ANNOTATION__INHERITANCE);

    eDataTypeORMAnnotationDefinitionEClass = createEClass(EDATA_TYPE_ORM_ANNOTATION_DEFINITION);

    eStructuralFeatureORMAnnotationEClass = createEClass(ESTRUCTURAL_FEATURE_ORM_ANNOTATION);
    createEReference(eStructuralFeatureORMAnnotationEClass, ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE);
    createEReference(eStructuralFeatureORMAnnotationEClass, ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION);

    eAttributeORMAnnotationEClass = createEClass(EATTRIBUTE_ORM_ANNOTATION);
    createEReference(eAttributeORMAnnotationEClass, EATTRIBUTE_ORM_ANNOTATION__BASIC);
    createEReference(eAttributeORMAnnotationEClass, EATTRIBUTE_ORM_ANNOTATION__ID);
    createEReference(eAttributeORMAnnotationEClass, EATTRIBUTE_ORM_ANNOTATION__VERSION);
    createEReference(eAttributeORMAnnotationEClass, EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY);
    createEReference(eAttributeORMAnnotationEClass, EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY);
    createEReference(eAttributeORMAnnotationEClass, EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE);

    eReferenceORMAnnotationEClass = createEClass(EREFERENCE_ORM_ANNOTATION);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__EMBEDDED);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__JOIN_TABLE);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__MAP_KEY);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN);
    createEAttribute(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__ORDER_BY);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__BASIC_MAP);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN);
    createEReference(eReferenceORMAnnotationEClass, EREFERENCE_ORM_ANNOTATION__BASIC);

    eEnumORMAnnotationEClass = createEClass(EENUM_ORM_ANNOTATION);
    createEAttribute(eEnumORMAnnotationEClass, EENUM_ORM_ANNOTATION__ENUMERATED);
    createEReference(eEnumORMAnnotationEClass, EENUM_ORM_ANNOTATION__BASIC);
    createEReference(eEnumORMAnnotationEClass, EENUM_ORM_ANNOTATION__VERSION);
    createEReference(eEnumORMAnnotationEClass, EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION);

    eDataTypeORMAnnotationEClass = createEClass(EDATA_TYPE_ORM_ANNOTATION);
    createEReference(eDataTypeORMAnnotationEClass, EDATA_TYPE_ORM_ANNOTATION__BASIC);
    createEReference(eDataTypeORMAnnotationEClass, EDATA_TYPE_ORM_ANNOTATION__ID);
    createEReference(eDataTypeORMAnnotationEClass, EDATA_TYPE_ORM_ANNOTATION__VERSION);
    createEReference(eDataTypeORMAnnotationEClass, EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION);

    eNamedElementORMAnnotationEClass = createEClass(ENAMED_ELEMENT_ORM_ANNOTATION);
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
    OrmPackage theOrmPackage = (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ePackageORMAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEPackageAnnotation());
    ePackageORMAnnotationEClass.getESuperTypes().add(this.getENamedElementORMAnnotation());
    eTypeElementORMAnnotationEClass.getESuperTypes().add(this.getENamedElementORMAnnotation());
    eClassifierORMAnnotationEClass.getESuperTypes().add(this.getETypeElementORMAnnotation());
    eClassORMAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEClassAnnotation());
    eClassORMAnnotationEClass.getESuperTypes().add(this.getEClassifierORMAnnotation());
    eDataTypeORMAnnotationDefinitionEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEDataTypeAnnotation());
    eDataTypeORMAnnotationDefinitionEClass.getESuperTypes().add(this.getEClassifierORMAnnotation());
    eStructuralFeatureORMAnnotationEClass.getESuperTypes().add(this.getETypeElementORMAnnotation());
    eAttributeORMAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEAttributeAnnotation());
    eAttributeORMAnnotationEClass.getESuperTypes().add(this.getEStructuralFeatureORMAnnotation());
    eReferenceORMAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEReferenceAnnotation());
    eReferenceORMAnnotationEClass.getESuperTypes().add(this.getEStructuralFeatureORMAnnotation());
    eEnumORMAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEEnumAnnotation());
    eEnumORMAnnotationEClass.getESuperTypes().add(this.getEDataTypeORMAnnotationDefinition());
    eDataTypeORMAnnotationEClass.getESuperTypes().add(theAnnotationsmodelPackage.getEDataTypeAnnotation());
    eDataTypeORMAnnotationEClass.getESuperTypes().add(this.getEDataTypeORMAnnotationDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(ePackageORMAnnotationEClass, EPackageORMAnnotation.class, "EPackageORMAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEPackageORMAnnotation_GenerateFullDbSchemaNames(), theEcorePackage.getEBoolean(), "generateFullDbSchemaNames", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_NameDictionaryPropertyFile(), theEcorePackage.getEString(), "nameDictionaryPropertyFile", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageORMAnnotation_TableNamePrefix(), theEcorePackage.getEString(), "tableNamePrefix", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageORMAnnotation_ColumnNamePrefix(), theEcorePackage.getEString(), "columnNamePrefix", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageORMAnnotation_MaximumSqlNameLength(), theEcorePackage.getEInt(), "maximumSqlNameLength", "255", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_LowerCasedNames(), theEcorePackage.getEBoolean(), "lowerCasedNames", "false", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_UpperCasedNames(), theEcorePackage.getEBoolean(), "upperCasedNames", "false", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_EnforceUniqueNames(), theEcorePackage.getEBoolean(), "enforceUniqueNames", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_UseJoinTablesForContainment(), theEcorePackage.getEBoolean(), "useJoinTablesForContainment", "false", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_UseJoinTablesForNonContainment(), theEcorePackage.getEBoolean(), "useJoinTablesForNonContainment", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEPackageORMAnnotation_DefaultCascadeContainment(), theOrmPackage.getCascadeType(), null, "defaultCascadeContainment", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageORMAnnotation_DefaultCascadeNonContainment(), theOrmPackage.getCascadeType(), null, "defaultCascadeNonContainment", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEPackageORMAnnotation_EntityMappings(), theOrmPackage.getEntityMappingsType(), null, "entityMappings", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageORMAnnotation_GenerateJavaAnnotations(), theEcorePackage.getEBoolean(), "generateJavaAnnotations", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_AddOrderColumnToListMappings(), theEcorePackage.getEBoolean(), "addOrderColumnToListMappings", "false", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_RenameSQLReservedNames(), theEcorePackage.getEBoolean(), "renameSQLReservedNames", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEReference(getEPackageORMAnnotation_Inheritance(), theOrmPackage.getInheritance(), null, "inheritance", null, 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEPackageORMAnnotation_UniqueEntityNames(), theEcorePackage.getEBoolean(), "uniqueEntityNames", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(getEPackageORMAnnotation_SetDelimitedIdentifierTagInORM(), theEcorePackage.getEBoolean(), "setDelimitedIdentifierTagInORM", "true", 0, 1, EPackageORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

    initEClass(eTypeElementORMAnnotationEClass, ETypeElementORMAnnotation.class, "ETypeElementORMAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getETypeElementORMAnnotation_Transient(), theOrmPackage.getTransient(), null, "transient", null, 0, 1, ETypeElementORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eClassifierORMAnnotationEClass, EClassifierORMAnnotation.class, "EClassifierORMAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(eClassORMAnnotationEClass, EClassORMAnnotation.class, "EClassORMAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getEClassORMAnnotation_Entity(), theOrmPackage.getEntity(), null, "entity", null, 0, 1, EClassORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassORMAnnotation_Embeddable(), theOrmPackage.getEmbeddable(), null, "embeddable", null, 0, 1, EClassORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassORMAnnotation_MappedSuperclass(), theOrmPackage.getMappedSuperclass(), null, "mappedSuperclass", null, 0, 1, EClassORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEClassORMAnnotation_Inheritance(), theOrmPackage.getInheritance(), null, "inheritance", null, 0, 1, EClassORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eDataTypeORMAnnotationDefinitionEClass, EDataTypeORMAnnotationDefinition.class, "EDataTypeORMAnnotationDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(eStructuralFeatureORMAnnotationEClass, EStructuralFeatureORMAnnotation.class, "EStructuralFeatureORMAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getEStructuralFeatureORMAnnotation_CollectionTable(), theOrmPackage.getCollectionTable(), null, "collectionTable", null, 0, 1, EStructuralFeatureORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEStructuralFeatureORMAnnotation_ElementCollection(), theOrmPackage.getElementCollection(), null, "elementCollection", null, 0, 1, EStructuralFeatureORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eAttributeORMAnnotationEClass, EAttributeORMAnnotation.class, "EAttributeORMAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getEAttributeORMAnnotation_Basic(), theOrmPackage.getBasic(), null, "basic", null, 0, 1, EAttributeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEAttributeORMAnnotation_Id(), theOrmPackage.getId(), null, "id", null, 0, 1, EAttributeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEAttributeORMAnnotation_Version(), theOrmPackage.getVersion(), null, "version", null, 0, 1, EAttributeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEAttributeORMAnnotation_OneToMany(), theOrmPackage.getOneToMany(), null, "oneToMany", null, 0, 1, EAttributeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEAttributeORMAnnotation_FeatureMapEntity(), theOrmPackage.getEntity(), null, "featureMapEntity", null, 0, 1, EAttributeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEAttributeORMAnnotation_ManyToOne(), theOrmPackage.getManyToOne(), null, "manyToOne", null, 0, 1, EAttributeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eReferenceORMAnnotationEClass, EReferenceORMAnnotation.class, "EReferenceORMAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_Embedded(), theOrmPackage.getEmbedded(), null, "embedded", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_EmbeddedId(), theOrmPackage.getEmbeddedId(), null, "embeddedId", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_JoinColumn(), theOrmPackage.getJoinColumn(), null, "joinColumn", null, 0, -1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_JoinTable(), theOrmPackage.getJoinTable(), null, "joinTable", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_ManyToMany(), theOrmPackage.getManyToMany(), null, "manyToMany", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_ManyToOne(), theOrmPackage.getManyToOne(), null, "manyToOne", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_OneToMany(), theOrmPackage.getOneToMany(), null, "oneToMany", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_OneToOne(), theOrmPackage.getOneToOne(), null, "oneToOne", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_MapKey(), theOrmPackage.getMapKey(), null, "mapKey", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_MapKeyClass(), theOrmPackage.getMapKeyClass(), null, "mapKeyClass", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_MapKeyColumn(), theOrmPackage.getMapKeyColumn(), null, "mapKeyColumn", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_MapKeyJoinColumn(), theOrmPackage.getMapKeyJoinColumn(), null, "mapKeyJoinColumn", null, 0, -1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(getEReferenceORMAnnotation_OrderBy(), theOrmPackage.getOrderBy(), "orderBy", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_OrderColumn(), theOrmPackage.getOrderColumn(), null, "orderColumn", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_BasicCollection(), theOrmPackage.getBasicCollection(), null, "basicCollection", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_BasicMap(), theOrmPackage.getBasicMap(), null, "basicMap", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_AssociationOverride(), theOrmPackage.getAssociationOverride(), null, "associationOverride", null, 0, -1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_AttributeOverride(), theOrmPackage.getAttributeOverride(), null, "attributeOverride", null, 0, -1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_PrimaryKeyJoinColumn(), theOrmPackage.getPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumn", null, 0, -1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEReferenceORMAnnotation_Basic(), theOrmPackage.getBasic(), null, "basic", null, 0, 1, EReferenceORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eEnumORMAnnotationEClass, EEnumORMAnnotation.class, "EEnumORMAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getEEnumORMAnnotation_Enumerated(), theOrmPackage.getEnumerated(), "enumerated", null, 0, 1, EEnumORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEEnumORMAnnotation_Basic(), theOrmPackage.getBasic(), null, "basic", null, 0, 1, EEnumORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEEnumORMAnnotation_Version(), theOrmPackage.getVersion(), null, "version", null, 0, 1, EEnumORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEEnumORMAnnotation_ElementCollection(), theOrmPackage.getElementCollection(), null, "elementCollection", null, 0, 1, EEnumORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eDataTypeORMAnnotationEClass, EDataTypeORMAnnotation.class, "EDataTypeORMAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getEDataTypeORMAnnotation_Basic(), theOrmPackage.getBasic(), null, "basic", null, 0, 1, EDataTypeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEDataTypeORMAnnotation_Id(), theOrmPackage.getId(), null, "id", null, 0, 1, EDataTypeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEDataTypeORMAnnotation_Version(), theOrmPackage.getVersion(), null, "version", null, 0, 1, EDataTypeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(getEDataTypeORMAnnotation_ElementCollection(), theOrmPackage.getElementCollection(), null, "elementCollection", null, 0, 1, EDataTypeORMAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(eNamedElementORMAnnotationEClass, ENamedElementORMAnnotation.class, "ENamedElementORMAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation <em>EPackage ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation()
     * @generated
     */
    public static final EClass EPACKAGE_ORM_ANNOTATION = eINSTANCE.getEPackageORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Generate Full Db Schema Names</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES = eINSTANCE.getEPackageORMAnnotation_GenerateFullDbSchemaNames();

    /**
     * The meta object literal for the '<em><b>Name Dictionary Property File</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE = eINSTANCE.getEPackageORMAnnotation_NameDictionaryPropertyFile();

    /**
     * The meta object literal for the '<em><b>Table Name Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX = eINSTANCE.getEPackageORMAnnotation_TableNamePrefix();

    /**
     * The meta object literal for the '<em><b>Column Name Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX = eINSTANCE.getEPackageORMAnnotation_ColumnNamePrefix();

    /**
     * The meta object literal for the '<em><b>Maximum Sql Name Length</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH = eINSTANCE.getEPackageORMAnnotation_MaximumSqlNameLength();

    /**
     * The meta object literal for the '<em><b>Lower Cased Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES = eINSTANCE.getEPackageORMAnnotation_LowerCasedNames();

    /**
     * The meta object literal for the '<em><b>Upper Cased Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES = eINSTANCE.getEPackageORMAnnotation_UpperCasedNames();

    /**
     * The meta object literal for the '<em><b>Enforce Unique Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES = eINSTANCE.getEPackageORMAnnotation_EnforceUniqueNames();

    /**
     * The meta object literal for the '<em><b>Use Join Tables For Containment</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT = eINSTANCE.getEPackageORMAnnotation_UseJoinTablesForContainment();

    /**
     * The meta object literal for the '<em><b>Use Join Tables For Non Containment</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT = eINSTANCE.getEPackageORMAnnotation_UseJoinTablesForNonContainment();

    /**
     * The meta object literal for the '<em><b>Default Cascade Containment</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT = eINSTANCE.getEPackageORMAnnotation_DefaultCascadeContainment();

    /**
     * The meta object literal for the '<em><b>Default Cascade Non Containment</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT = eINSTANCE.getEPackageORMAnnotation_DefaultCascadeNonContainment();

    /**
     * The meta object literal for the '<em><b>Entity Mappings</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS = eINSTANCE.getEPackageORMAnnotation_EntityMappings();

    /**
     * The meta object literal for the '<em><b>Generate Java Annotations</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS = eINSTANCE.getEPackageORMAnnotation_GenerateJavaAnnotations();

    /**
     * The meta object literal for the '<em><b>Add Order Column To List Mappings</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS = eINSTANCE.getEPackageORMAnnotation_AddOrderColumnToListMappings();

    /**
     * The meta object literal for the '<em><b>Rename SQL Reserved Names</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EAttribute EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES = eINSTANCE.getEPackageORMAnnotation_RenameSQLReservedNames();

    /**
     * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EPACKAGE_ORM_ANNOTATION__INHERITANCE = eINSTANCE.getEPackageORMAnnotation_Inheritance();

    /**
     * The meta object literal for the '<em><b>Unique Entity Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		public static final EAttribute EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES = eINSTANCE.getEPackageORMAnnotation_UniqueEntityNames();

				/**
     * The meta object literal for the '<em><b>Set Delimited Identifier Tag In ORM</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		public static final EAttribute EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM = eINSTANCE.getEPackageORMAnnotation_SetDelimitedIdentifierTagInORM();

				/**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation <em>EType Element ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getETypeElementORMAnnotation()
     * @generated
     */
    public static final EClass ETYPE_ELEMENT_ORM_ANNOTATION = eINSTANCE.getETypeElementORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Transient</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT = eINSTANCE.getETypeElementORMAnnotation_Transient();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation <em>EClassifier ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassifierORMAnnotation()
     * @generated
     */
    public static final EClass ECLASSIFIER_ORM_ANNOTATION = eINSTANCE.getEClassifierORMAnnotation();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation <em>EClass ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation()
     * @generated
     */
    public static final EClass ECLASS_ORM_ANNOTATION = eINSTANCE.getEClassORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ECLASS_ORM_ANNOTATION__ENTITY = eINSTANCE.getEClassORMAnnotation_Entity();

    /**
     * The meta object literal for the '<em><b>Embeddable</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ECLASS_ORM_ANNOTATION__EMBEDDABLE = eINSTANCE.getEClassORMAnnotation_Embeddable();

    /**
     * The meta object literal for the '<em><b>Mapped Superclass</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS = eINSTANCE.getEClassORMAnnotation_MappedSuperclass();

    /**
     * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ECLASS_ORM_ANNOTATION__INHERITANCE = eINSTANCE.getEClassORMAnnotation_Inheritance();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition <em>EData Type ORM Annotation Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotationDefinition()
     * @generated
     */
    public static final EClass EDATA_TYPE_ORM_ANNOTATION_DEFINITION = eINSTANCE.getEDataTypeORMAnnotationDefinition();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation <em>EStructural Feature ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation()
     * @generated
     */
    public static final EClass ESTRUCTURAL_FEATURE_ORM_ANNOTATION = eINSTANCE.getEStructuralFeatureORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Collection Table</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE = eINSTANCE.getEStructuralFeatureORMAnnotation_CollectionTable();

    /**
     * The meta object literal for the '<em><b>Element Collection</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION = eINSTANCE.getEStructuralFeatureORMAnnotation_ElementCollection();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation <em>EAttribute ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation()
     * @generated
     */
    public static final EClass EATTRIBUTE_ORM_ANNOTATION = eINSTANCE.getEAttributeORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EATTRIBUTE_ORM_ANNOTATION__BASIC = eINSTANCE.getEAttributeORMAnnotation_Basic();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EReference EATTRIBUTE_ORM_ANNOTATION__ID = eINSTANCE.getEAttributeORMAnnotation_Id();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EATTRIBUTE_ORM_ANNOTATION__VERSION = eINSTANCE.getEAttributeORMAnnotation_Version();

    /**
     * The meta object literal for the '<em><b>One To Many</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY = eINSTANCE.getEAttributeORMAnnotation_OneToMany();

    /**
     * The meta object literal for the '<em><b>Feature Map Entity</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY = eINSTANCE.getEAttributeORMAnnotation_FeatureMapEntity();

    /**
     * The meta object literal for the '<em><b>Many To One</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE = eINSTANCE.getEAttributeORMAnnotation_ManyToOne();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation <em>EReference ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation()
     * @generated
     */
    public static final EClass EREFERENCE_ORM_ANNOTATION = eINSTANCE.getEReferenceORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Embedded</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__EMBEDDED = eINSTANCE.getEReferenceORMAnnotation_Embedded();

    /**
     * The meta object literal for the '<em><b>Embedded Id</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID = eINSTANCE.getEReferenceORMAnnotation_EmbeddedId();

    /**
     * The meta object literal for the '<em><b>Join Column</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN = eINSTANCE.getEReferenceORMAnnotation_JoinColumn();

    /**
     * The meta object literal for the '<em><b>Join Table</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__JOIN_TABLE = eINSTANCE.getEReferenceORMAnnotation_JoinTable();

    /**
     * The meta object literal for the '<em><b>Many To Many</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY = eINSTANCE.getEReferenceORMAnnotation_ManyToMany();

    /**
     * The meta object literal for the '<em><b>Many To One</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE = eINSTANCE.getEReferenceORMAnnotation_ManyToOne();

    /**
     * The meta object literal for the '<em><b>One To Many</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY = eINSTANCE.getEReferenceORMAnnotation_OneToMany();

    /**
     * The meta object literal for the '<em><b>One To One</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE = eINSTANCE.getEReferenceORMAnnotation_OneToOne();

    /**
     * The meta object literal for the '<em><b>Map Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__MAP_KEY = eINSTANCE.getEReferenceORMAnnotation_MapKey();

    /**
     * The meta object literal for the '<em><b>Map Key Class</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS = eINSTANCE.getEReferenceORMAnnotation_MapKeyClass();

    /**
     * The meta object literal for the '<em><b>Map Key Column</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN = eINSTANCE.getEReferenceORMAnnotation_MapKeyColumn();

    /**
     * The meta object literal for the '<em><b>Map Key Join Column</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN = eINSTANCE.getEReferenceORMAnnotation_MapKeyJoinColumn();

    /**
     * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EREFERENCE_ORM_ANNOTATION__ORDER_BY = eINSTANCE.getEReferenceORMAnnotation_OrderBy();

    /**
     * The meta object literal for the '<em><b>Order Column</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN = eINSTANCE.getEReferenceORMAnnotation_OrderColumn();

    /**
     * The meta object literal for the '<em><b>Basic Collection</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION = eINSTANCE.getEReferenceORMAnnotation_BasicCollection();

    /**
     * The meta object literal for the '<em><b>Basic Map</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__BASIC_MAP = eINSTANCE.getEReferenceORMAnnotation_BasicMap();

    /**
     * The meta object literal for the '<em><b>Association Override</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE = eINSTANCE.getEReferenceORMAnnotation_AssociationOverride();

    /**
     * The meta object literal for the '<em><b>Attribute Override</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE = eINSTANCE.getEReferenceORMAnnotation_AttributeOverride();

    /**
     * The meta object literal for the '<em><b>Primary Key Join Column</b></em>' containment reference list feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN = eINSTANCE.getEReferenceORMAnnotation_PrimaryKeyJoinColumn();

    /**
     * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EREFERENCE_ORM_ANNOTATION__BASIC = eINSTANCE.getEReferenceORMAnnotation_Basic();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation <em>EEnum ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation()
     * @generated
     */
    public static final EClass EENUM_ORM_ANNOTATION = eINSTANCE.getEEnumORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Enumerated</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EAttribute EENUM_ORM_ANNOTATION__ENUMERATED = eINSTANCE.getEEnumORMAnnotation_Enumerated();

    /**
     * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EENUM_ORM_ANNOTATION__BASIC = eINSTANCE.getEEnumORMAnnotation_Basic();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EENUM_ORM_ANNOTATION__VERSION = eINSTANCE.getEEnumORMAnnotation_Version();

    /**
     * The meta object literal for the '<em><b>Element Collection</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION = eINSTANCE.getEEnumORMAnnotation_ElementCollection();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation <em>EData Type ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation()
     * @generated
     */
    public static final EClass EDATA_TYPE_ORM_ANNOTATION = eINSTANCE.getEDataTypeORMAnnotation();

    /**
     * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference EDATA_TYPE_ORM_ANNOTATION__BASIC = eINSTANCE.getEDataTypeORMAnnotation_Basic();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EReference EDATA_TYPE_ORM_ANNOTATION__ID = eINSTANCE.getEDataTypeORMAnnotation_Id();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final EReference EDATA_TYPE_ORM_ANNOTATION__VERSION = eINSTANCE.getEDataTypeORMAnnotation_Version();

    /**
     * The meta object literal for the '<em><b>Element Collection</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION = eINSTANCE.getEDataTypeORMAnnotation_ElementCollection();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation <em>ENamed Element ORM Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation
     * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getENamedElementORMAnnotation()
     * @generated
     */
    public static final EClass ENAMED_ELEMENT_ORM_ANNOTATION = eINSTANCE.getENamedElementORMAnnotation();

  }

} // OrmannotationsPackage
