/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotationsmodelPackage.java,v 1.9 2011/09/23 21:00:23 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelFactory
 * @model kind="package"
 * @generated
 */
public class AnnotationsmodelPackage extends EPackageImpl {
  /**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static final String eNAME = "annotationsmodel";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static final String eNS_URI = "http://www.eclipse.org/emf/texo/annotations/model";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static final String eNS_PREFIX = "annotationsmodel";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static final AnnotationsmodelPackage eINSTANCE = org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage.init();

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation <em>ENamed Element Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getENamedElementAnnotation()
	 * @generated
	 */
  public static final int ENAMED_ELEMENT_ANNOTATION = 0;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ENAMED_ELEMENT_ANNOTATION__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER = 2;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENAMED_ELEMENT_ANNOTATION__GENERATED = 3;

		/**
	 * The number of structural features of the '<em>ENamed Element Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation <em>EClassifier Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassifierAnnotation()
	 * @generated
	 */
  public static final int ECLASSIFIER_ANNOTATION = 1;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASSIFIER_ANNOTATION__ENAMED_ELEMENT = ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASSIFIER_ANNOTATION__DESCRIPTION = ENAMED_ELEMENT_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASSIFIER_ANNOTATION__LAST_IDENTIFIER = ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASSIFIER_ANNOTATION__GENERATED = ENAMED_ELEMENT_ANNOTATION__GENERATED;

		/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASSIFIER_ANNOTATION__ECLASSIFIER = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EClassifier Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASSIFIER_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation <em>EClass Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassAnnotation()
	 * @generated
	 */
  public static final int ECLASS_ANNOTATION = 2;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASS_ANNOTATION__ENAMED_ELEMENT = ECLASSIFIER_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASS_ANNOTATION__DESCRIPTION = ECLASSIFIER_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASS_ANNOTATION__LAST_IDENTIFIER = ECLASSIFIER_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASS_ANNOTATION__GENERATED = ECLASSIFIER_ANNOTATION__GENERATED;

		/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASS_ANNOTATION__ECLASSIFIER = ECLASSIFIER_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ECLASS_ANNOTATION__ANNOTATED_ECLASSIFIER = ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
	 * The feature id for the '<em><b>Annotated EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASS_ANNOTATION__ANNOTATED_ECLASS = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASS_ANNOTATION__ECLASS = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EClass Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ECLASS_ANNOTATION_FEATURE_COUNT = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation <em>EData Type Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEDataTypeAnnotation()
	 * @generated
	 */
  public static final int EDATA_TYPE_ANNOTATION = 3;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EDATA_TYPE_ANNOTATION__ENAMED_ELEMENT = ECLASSIFIER_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EDATA_TYPE_ANNOTATION__DESCRIPTION = ECLASSIFIER_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EDATA_TYPE_ANNOTATION__LAST_IDENTIFIER = ECLASSIFIER_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EDATA_TYPE_ANNOTATION__GENERATED = ECLASSIFIER_ANNOTATION__GENERATED;

		/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EDATA_TYPE_ANNOTATION__ECLASSIFIER = ECLASSIFIER_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EDATA_TYPE_ANNOTATION__ANNOTATED_ECLASSIFIER = ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
	 * The feature id for the '<em><b>Annotated EData Type</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EDATA_TYPE_ANNOTATION__EDATA_TYPE = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EData Type Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EDATA_TYPE_ANNOTATION_FEATURE_COUNT = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation <em>EStructural Feature Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEStructuralFeatureAnnotation()
	 * @generated
	 */
  public static final int ESTRUCTURAL_FEATURE_ANNOTATION = 4;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ESTRUCTURAL_FEATURE_ANNOTATION__ENAMED_ELEMENT = ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ESTRUCTURAL_FEATURE_ANNOTATION__DESCRIPTION = ENAMED_ELEMENT_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ESTRUCTURAL_FEATURE_ANNOTATION__LAST_IDENTIFIER = ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ESTRUCTURAL_FEATURE_ANNOTATION__GENERATED = ENAMED_ELEMENT_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>EStructural Feature Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation <em>EPackage Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEPackageAnnotation()
	 * @generated
	 */
  public static final int EPACKAGE_ANNOTATION = 5;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EPACKAGE_ANNOTATION__ENAMED_ELEMENT = ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EPACKAGE_ANNOTATION__DESCRIPTION = ENAMED_ELEMENT_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EPACKAGE_ANNOTATION__LAST_IDENTIFIER = ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EPACKAGE_ANNOTATION__GENERATED = ENAMED_ELEMENT_ANNOTATION__GENERATED;

		/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EPACKAGE_ANNOTATION__EPACKAGE = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EPackage Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EPACKAGE_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation <em>EReference Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEReferenceAnnotation()
	 * @generated
	 */
  public static final int EREFERENCE_ANNOTATION = 6;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EREFERENCE_ANNOTATION__ENAMED_ELEMENT = ESTRUCTURAL_FEATURE_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EREFERENCE_ANNOTATION__DESCRIPTION = ESTRUCTURAL_FEATURE_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EREFERENCE_ANNOTATION__LAST_IDENTIFIER = ESTRUCTURAL_FEATURE_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EREFERENCE_ANNOTATION__GENERATED = ESTRUCTURAL_FEATURE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EREFERENCE_ANNOTATION__ESTRUCTURAL_FEATURE = ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE;

		/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EREFERENCE_ANNOTATION__EREFERENCE = ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EReference</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE = ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EReference Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EREFERENCE_ANNOTATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation <em>EAttribute Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEAttributeAnnotation()
	 * @generated
	 */
  public static final int EATTRIBUTE_ANNOTATION = 7;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EATTRIBUTE_ANNOTATION__ENAMED_ELEMENT = ESTRUCTURAL_FEATURE_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EATTRIBUTE_ANNOTATION__DESCRIPTION = ESTRUCTURAL_FEATURE_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EATTRIBUTE_ANNOTATION__LAST_IDENTIFIER = ESTRUCTURAL_FEATURE_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EATTRIBUTE_ANNOTATION__GENERATED = ESTRUCTURAL_FEATURE_ANNOTATION__GENERATED;

		/**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EATTRIBUTE_ANNOTATION__ESTRUCTURAL_FEATURE = ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE;

		/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EATTRIBUTE_ANNOTATION__EATTRIBUTE = ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EAttribute</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE = ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EAttribute Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EATTRIBUTE_ANNOTATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation <em>EEnum Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumAnnotation()
	 * @generated
	 */
  public static final int EENUM_ANNOTATION = 8;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_ANNOTATION__ENAMED_ELEMENT = ECLASSIFIER_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_ANNOTATION__DESCRIPTION = ECLASSIFIER_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EENUM_ANNOTATION__LAST_IDENTIFIER = ECLASSIFIER_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EENUM_ANNOTATION__GENERATED = ECLASSIFIER_ANNOTATION__GENERATED;

		/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_ANNOTATION__ECLASSIFIER = ECLASSIFIER_ANNOTATION__ECLASSIFIER;

  /**
   * The feature id for the '<em><b>Annotated EClassifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int EENUM_ANNOTATION__ANNOTATED_ECLASSIFIER = ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER;

  /**
	 * The feature id for the '<em><b>EEnum</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_ANNOTATION__EENUM = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EEnum</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_ANNOTATION__ANNOTATED_EENUM = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EEnum Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_ANNOTATION_FEATURE_COUNT = ECLASSIFIER_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation <em>EEnum Literal Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumLiteralAnnotation()
	 * @generated
	 */
  public static final int EENUM_LITERAL_ANNOTATION = 9;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_LITERAL_ANNOTATION__ENAMED_ELEMENT = ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_LITERAL_ANNOTATION__DESCRIPTION = ENAMED_ELEMENT_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Last Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EENUM_LITERAL_ANNOTATION__LAST_IDENTIFIER = ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER;

		/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EENUM_LITERAL_ANNOTATION__GENERATED = ENAMED_ELEMENT_ANNOTATION__GENERATED;

		/**
	 * The feature id for the '<em><b>EEnum Literal</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_LITERAL_ANNOTATION__EENUM_LITERAL = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EEnum Literal</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>EEnum Literal Annotation</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int EENUM_LITERAL_ANNOTATION_FEATURE_COUNT = ENAMED_ELEMENT_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement <em>Annotated ENamed Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedENamedElement()
	 * @generated
	 */
  public static final int ANNOTATED_ENAMED_ELEMENT = 16;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT = 0;

  /**
	 * The number of structural features of the '<em>Annotated ENamed Element</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier <em>Annotated EClassifier</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClassifier()
	 * @generated
	 */
  public static final int ANNOTATED_ECLASSIFIER = 13;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASSIFIER__ENAMED_ELEMENT = ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASSIFIER__ECLASSIFIER = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Annotated EClassifier</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASSIFIER_FEATURE_COUNT = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass <em>Annotated EClass</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClass()
	 * @generated
	 */
  public static final int ANNOTATED_ECLASS = 10;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASS__ENAMED_ELEMENT = ANNOTATED_ECLASSIFIER__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASS__ECLASSIFIER = ANNOTATED_ECLASSIFIER__ECLASSIFIER;

  /**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASS__ANNOTATED_EPACKAGE = ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE;

  /**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASS__ECLASS = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EClass Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASS__ECLASS_ANNOTATIONS = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Annotated EStructural Features</b></em>' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  public static final int ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Annotated EClass</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ECLASS_FEATURE_COUNT = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEStructuralFeature()
	 * @generated
	 */
  public static final int ANNOTATED_ESTRUCTURAL_FEATURE = 11;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ESTRUCTURAL_FEATURE__ENAMED_ELEMENT = ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Annotated EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Annotated EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage <em>Annotated EPackage</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage()
	 * @generated
	 */
  public static final int ANNOTATED_EPACKAGE = 12;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EPACKAGE__ENAMED_ELEMENT = ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EPACKAGE__EPACKAGE = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EPackage Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Annotated EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Annotated Model</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EPACKAGE__ANNOTATED_MODEL = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Annotated EPackage</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EPACKAGE_FEATURE_COUNT = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType <em>Annotated EData Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEDataType()
	 * @generated
	 */
  public static final int ANNOTATED_EDATA_TYPE = 14;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EDATA_TYPE__ENAMED_ELEMENT = ANNOTATED_ECLASSIFIER__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EDATA_TYPE__ECLASSIFIER = ANNOTATED_ECLASSIFIER__ECLASSIFIER;

  /**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EDATA_TYPE__ANNOTATED_EPACKAGE = ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE;

  /**
	 * The feature id for the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EDATA_TYPE__EDATA_TYPE = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EData Type Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Annotated EData Type</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EDATA_TYPE_FEATURE_COUNT = ANNOTATED_ECLASSIFIER_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel <em>Annotated Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedModel()
	 * @generated
	 */
  public static final int ANNOTATED_MODEL = 15;

  /**
	 * The feature id for the '<em><b>Annotated EPackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_MODEL__ANNOTATED_EPACKAGES = 0;

  /**
	 * The feature id for the '<em><b>Generating Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATED_MODEL__GENERATING_SOURCES = 1;

		/**
	 * The number of structural features of the '<em>Annotated Model</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_MODEL_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum <em>Annotated EEnum</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnum()
	 * @generated
	 */
  public static final int ANNOTATED_EENUM = 17;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__ENAMED_ELEMENT = ANNOTATED_EDATA_TYPE__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__ECLASSIFIER = ANNOTATED_EDATA_TYPE__ECLASSIFIER;

  /**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__ANNOTATED_EPACKAGE = ANNOTATED_EDATA_TYPE__ANNOTATED_EPACKAGE;

  /**
	 * The feature id for the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__EDATA_TYPE = ANNOTATED_EDATA_TYPE__EDATA_TYPE;

  /**
	 * The feature id for the '<em><b>EData Type Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__EDATA_TYPE_ANNOTATIONS = ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS;

  /**
	 * The feature id for the '<em><b>EEnum</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__EENUM = ANNOTATED_EDATA_TYPE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EEnum Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__EENUM_ANNOTATIONS = ANNOTATED_EDATA_TYPE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Annotated EEnum Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS = ANNOTATED_EDATA_TYPE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Annotated EEnum</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM_FEATURE_COUNT = ANNOTATED_EDATA_TYPE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference <em>Annotated EReference</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEReference()
	 * @generated
	 */
  public static final int ANNOTATED_EREFERENCE = 18;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EREFERENCE__ENAMED_ELEMENT = ANNOTATED_ESTRUCTURAL_FEATURE__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ANNOTATED_EREFERENCE__ESTRUCTURAL_FEATURE = ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE;

  /**
	 * The feature id for the '<em><b>Annotated EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EREFERENCE__ANNOTATED_ECLASS = ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS;

  /**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EREFERENCE__EREFERENCE = ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EReference Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS = ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Annotated EReference</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EREFERENCE_FEATURE_COUNT = ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute <em>Annotated EAttribute</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEAttribute()
	 * @generated
	 */
  public static final int ANNOTATED_EATTRIBUTE = 19;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EATTRIBUTE__ENAMED_ELEMENT = ANNOTATED_ESTRUCTURAL_FEATURE__ENAMED_ELEMENT;

  /**
   * The feature id for the '<em><b>EStructural Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  public static final int ANNOTATED_EATTRIBUTE__ESTRUCTURAL_FEATURE = ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE;

  /**
	 * The feature id for the '<em><b>Annotated EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EATTRIBUTE__ANNOTATED_ECLASS = ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS;

  /**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EATTRIBUTE__EATTRIBUTE = ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EAttribute Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS = ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Annotated EAttribute</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EATTRIBUTE_FEATURE_COUNT = ANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnumLiteral()
	 * @generated
	 */
  public static final int ANNOTATED_EENUM_LITERAL = 20;

  /**
	 * The feature id for the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM_LITERAL__ENAMED_ELEMENT = ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT;

  /**
	 * The feature id for the '<em><b>EEnum Literal</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM_LITERAL__EENUM_LITERAL = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>EEnum Literal Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Annotated EEnum</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Annotated EEnum Literal</em>' class.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 * @ordered
	 */
  public static final int ANNOTATED_EENUM_LITERAL_FEATURE_COUNT = ANNOTATED_ENAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eNamedElementAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eClassifierAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eClassAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eDataTypeAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eStructuralFeatureAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ePackageAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eReferenceAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eAttributeAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eEnumAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eEnumLiteralAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEClassEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEStructuralFeatureEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEPackageEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEClassifierEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEDataTypeEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedModelEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedENamedElementEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEEnumEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEReferenceEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEAttributeEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedEEnumLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AnnotationsmodelPackage() {
		super(eNS_URI, AnnotationsmodelFactory.eINSTANCE);
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
   * This method is used to initialize {@link AnnotationsmodelPackage#eINSTANCE} when that field is accessed. Clients
   * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AnnotationsmodelPackage init() {
		if (isInited) return (AnnotationsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsmodelPackage.eNS_URI);

		// Obtain or create and register package
		AnnotationsmodelPackage theAnnotationsmodelPackage = (AnnotationsmodelPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnnotationsmodelPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnnotationsmodelPackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnnotationsmodelPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationsmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnnotationsmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationsmodelPackage.eNS_URI, theAnnotationsmodelPackage);
		return theAnnotationsmodelPackage;
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation <em>ENamed Element Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation
	 * @generated
	 */
  public EClass getENamedElementAnnotation() {
		return eNamedElementAnnotationEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ENamed Element</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getENamedElement()
	 * @see #getENamedElementAnnotation()
	 * @generated
	 */
  public EReference getENamedElementAnnotation_ENamedElement() {
		return (EReference)eNamedElementAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getDescription()
	 * @see #getENamedElementAnnotation()
	 * @generated
	 */
  public EAttribute getENamedElementAnnotation_Description() {
		return (EAttribute)eNamedElementAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getLastIdentifier <em>Last Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Identifier</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getLastIdentifier()
	 * @see #getENamedElementAnnotation()
	 * @generated
	 */
	public EAttribute getENamedElementAnnotation_LastIdentifier() {
		return (EAttribute)eNamedElementAnnotationEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#isGenerated()
	 * @see #getENamedElementAnnotation()
	 * @generated
	 */
	public EAttribute getENamedElementAnnotation_Generated() {
		return (EAttribute)eNamedElementAnnotationEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation <em>EClassifier Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation
	 * @generated
	 */
  public EClass getEClassifierAnnotation() {
		return eClassifierAnnotationEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation#getEClassifier()
	 * @see #getEClassifierAnnotation()
	 * @generated
	 */
  public EReference getEClassifierAnnotation_EClassifier() {
		return (EReference)eClassifierAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation#getAnnotatedEClassifier <em>Annotated EClassifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated EClassifier</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation#getAnnotatedEClassifier()
	 * @see #getEClassifierAnnotation()
	 * @generated
	 */
  public EReference getEClassifierAnnotation_AnnotatedEClassifier() {
		return (EReference)eClassifierAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation <em>EClass Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation
	 * @generated
	 */
  public EClass getEClassAnnotation() {
		return eClassAnnotationEClass;
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getAnnotatedEClass <em>Annotated EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EClass</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getAnnotatedEClass()
	 * @see #getEClassAnnotation()
	 * @generated
	 */
  public EReference getEClassAnnotation_AnnotatedEClass() {
		return (EReference)eClassAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getEClass <em>EClass</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>EClass</em>'.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getEClass()
   * @see #getEClassAnnotation()
   * @generated
   */
  public EReference getEClassAnnotation_EClass() {
		return (EReference)eClassAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation <em>EData Type Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation
	 * @generated
	 */
  public EClass getEDataTypeAnnotation() {
		return eDataTypeAnnotationEClass;
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getAnnotatedEDataType <em>Annotated EData Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EData Type</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getAnnotatedEDataType()
	 * @see #getEDataTypeAnnotation()
	 * @generated
	 */
  public EReference getEDataTypeAnnotation_AnnotatedEDataType() {
		return (EReference)eDataTypeAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getEDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EData Type</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getEDataType()
	 * @see #getEDataTypeAnnotation()
	 * @generated
	 */
  public EReference getEDataTypeAnnotation_EDataType() {
		return (EReference)eDataTypeAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation <em>EStructural Feature Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation
	 * @generated
	 */
  public EClass getEStructuralFeatureAnnotation() {
		return eStructuralFeatureAnnotationEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation#getEStructuralFeature()
	 * @see #getEStructuralFeatureAnnotation()
	 * @generated
	 */
  public EReference getEStructuralFeatureAnnotation_EStructuralFeature() {
		return (EReference)eStructuralFeatureAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation <em>EPackage Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation
	 * @generated
	 */
  public EClass getEPackageAnnotation() {
		return ePackageAnnotationEClass;
	}

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getEPackage <em>EPackage</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>EPackage</em>'.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getEPackage()
   * @see #getEPackageAnnotation()
   * @generated
   */
  public EReference getEPackageAnnotation_EPackage() {
		return (EReference)ePackageAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getAnnotatedEPackage <em>Annotated EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EPackage</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getAnnotatedEPackage()
	 * @see #getEPackageAnnotation()
	 * @generated
	 */
  public EReference getEPackageAnnotation_AnnotatedEPackage() {
		return (EReference)ePackageAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation <em>EReference Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation
	 * @generated
	 */
  public EClass getEReferenceAnnotation() {
		return eReferenceAnnotationEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getEReference()
	 * @see #getEReferenceAnnotation()
	 * @generated
	 */
  public EReference getEReferenceAnnotation_EReference() {
		return (EReference)eReferenceAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getAnnotatedEReference <em>Annotated EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EReference</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getAnnotatedEReference()
	 * @see #getEReferenceAnnotation()
	 * @generated
	 */
  public EReference getEReferenceAnnotation_AnnotatedEReference() {
		return (EReference)eReferenceAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation <em>EAttribute Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation
	 * @generated
	 */
  public EClass getEAttributeAnnotation() {
		return eAttributeAnnotationEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getEAttribute()
	 * @see #getEAttributeAnnotation()
	 * @generated
	 */
  public EReference getEAttributeAnnotation_EAttribute() {
		return (EReference)eAttributeAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getAnnotatedEAttribute <em>Annotated EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EAttribute</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getAnnotatedEAttribute()
	 * @see #getEAttributeAnnotation()
	 * @generated
	 */
  public EReference getEAttributeAnnotation_AnnotatedEAttribute() {
		return (EReference)eAttributeAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation <em>EEnum Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation
	 * @generated
	 */
  public EClass getEEnumAnnotation() {
		return eEnumAnnotationEClass;
	}

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getEEnum <em>EEnum</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>EEnum</em>'.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getEEnum()
   * @see #getEEnumAnnotation()
   * @generated
   */
  public EReference getEEnumAnnotation_EEnum() {
		return (EReference)eEnumAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getAnnotatedEEnum <em>Annotated EEnum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EEnum</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getAnnotatedEEnum()
	 * @see #getEEnumAnnotation()
	 * @generated
	 */
  public EReference getEEnumAnnotation_AnnotatedEEnum() {
		return (EReference)eEnumAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation <em>EEnum Literal Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal Annotation</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation
	 * @generated
	 */
  public EClass getEEnumLiteralAnnotation() {
		return eEnumLiteralAnnotationEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getEEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EEnum Literal</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getEEnumLiteral()
	 * @see #getEEnumLiteralAnnotation()
	 * @generated
	 */
  public EReference getEEnumLiteralAnnotation_EEnumLiteral() {
		return (EReference)eEnumLiteralAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getAnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EEnum Literal</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getAnnotatedEEnumLiteral()
	 * @see #getEEnumLiteralAnnotation()
	 * @generated
	 */
  public EReference getEEnumLiteralAnnotation_AnnotatedEEnumLiteral() {
		return (EReference)eEnumLiteralAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass <em>Annotated EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EClass</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass
	 * @generated
	 */
  public EClass getAnnotatedEClass() {
		return annotatedEClassEClass;
	}

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClass <em>EClass</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>EClass</em>'.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClass()
   * @see #getAnnotatedEClass()
   * @generated
   */
  public EReference getAnnotatedEClass_EClass() {
		return (EReference)annotatedEClassEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClassAnnotations <em>EClass Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClass Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClassAnnotations()
	 * @see #getAnnotatedEClass()
	 * @generated
	 */
  public EReference getAnnotatedEClass_EClassAnnotations() {
		return (EReference)annotatedEClassEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getAnnotatedEStructuralFeatures <em>Annotated EStructural Features</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotated EStructural Features</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getAnnotatedEStructuralFeatures()
	 * @see #getAnnotatedEClass()
	 * @generated
	 */
  public EReference getAnnotatedEClass_AnnotatedEStructuralFeatures() {
		return (EReference)annotatedEClassEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EStructural Feature</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature
	 * @generated
	 */
  public EClass getAnnotatedEStructuralFeature() {
		return annotatedEStructuralFeatureEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getEStructuralFeature()
	 * @see #getAnnotatedEStructuralFeature()
	 * @generated
	 */
  public EReference getAnnotatedEStructuralFeature_EStructuralFeature() {
		return (EReference)annotatedEStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getAnnotatedEClass <em>Annotated EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EClass</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getAnnotatedEClass()
	 * @see #getAnnotatedEStructuralFeature()
	 * @generated
	 */
  public EReference getAnnotatedEStructuralFeature_AnnotatedEClass() {
		return (EReference)annotatedEStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage <em>Annotated EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EPackage</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage
	 * @generated
	 */
  public EClass getAnnotatedEPackage() {
		return annotatedEPackageEClass;
	}

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackage <em>EPackage</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>EPackage</em>'.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackage()
   * @see #getAnnotatedEPackage()
   * @generated
   */
  public EReference getAnnotatedEPackage_EPackage() {
		return (EReference)annotatedEPackageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackageAnnotations <em>EPackage Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EPackage Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackageAnnotations()
	 * @see #getAnnotatedEPackage()
	 * @generated
	 */
  public EReference getAnnotatedEPackage_EPackageAnnotations() {
		return (EReference)annotatedEPackageEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedEClassifiers <em>Annotated EClassifiers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotated EClassifiers</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedEClassifiers()
	 * @see #getAnnotatedEPackage()
	 * @generated
	 */
  public EReference getAnnotatedEPackage_AnnotatedEClassifiers() {
		return (EReference)annotatedEPackageEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedModel <em>Annotated Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated Model</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedModel()
	 * @see #getAnnotatedEPackage()
	 * @generated
	 */
  public EReference getAnnotatedEPackage_AnnotatedModel() {
		return (EReference)annotatedEPackageEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier <em>Annotated EClassifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EClassifier</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier
	 * @generated
	 */
  public EClass getAnnotatedEClassifier() {
		return annotatedEClassifierEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getEClassifier()
	 * @see #getAnnotatedEClassifier()
	 * @generated
	 */
  public EReference getAnnotatedEClassifier_EClassifier() {
		return (EReference)annotatedEClassifierEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getAnnotatedEPackage <em>Annotated EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EPackage</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getAnnotatedEPackage()
	 * @see #getAnnotatedEClassifier()
	 * @generated
	 */
  public EReference getAnnotatedEClassifier_AnnotatedEPackage() {
		return (EReference)annotatedEClassifierEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType <em>Annotated EData Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EData Type</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType
	 * @generated
	 */
  public EClass getAnnotatedEDataType() {
		return annotatedEDataTypeEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EData Type</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataType()
	 * @see #getAnnotatedEDataType()
	 * @generated
	 */
  public EReference getAnnotatedEDataType_EDataType() {
		return (EReference)annotatedEDataTypeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations <em>EData Type Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EData Type Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations()
	 * @see #getAnnotatedEDataType()
	 * @generated
	 */
  public EReference getAnnotatedEDataType_EDataTypeAnnotations() {
		return (EReference)annotatedEDataTypeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel <em>Annotated Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Model</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel
	 * @generated
	 */
  public EClass getAnnotatedModel() {
		return annotatedModelEClass;
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel#getAnnotatedEPackages <em>Annotated EPackages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotated EPackages</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel#getAnnotatedEPackages()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
  public EReference getAnnotatedModel_AnnotatedEPackages() {
		return (EReference)annotatedModelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel#isGeneratingSources <em>Generating Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generating Sources</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel#isGeneratingSources()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	public EAttribute getAnnotatedModel_GeneratingSources() {
		return (EAttribute)annotatedModelEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement <em>Annotated ENamed Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated ENamed Element</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement
	 * @generated
	 */
  public EClass getAnnotatedENamedElement() {
		return annotatedENamedElementEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement#getENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ENamed Element</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement#getENamedElement()
	 * @see #getAnnotatedENamedElement()
	 * @generated
	 */
  public EReference getAnnotatedENamedElement_ENamedElement() {
		return (EReference)annotatedENamedElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum <em>Annotated EEnum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EEnum</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum
	 * @generated
	 */
  public EClass getAnnotatedEEnum() {
		return annotatedEEnumEClass;
	}

  /**
   * Returns the meta object for the reference '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnum <em>EEnum</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>EEnum</em>'.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnum()
   * @see #getAnnotatedEEnum()
   * @generated
   */
  public EReference getAnnotatedEEnum_EEnum() {
		return (EReference)annotatedEEnumEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnumAnnotations <em>EEnum Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EEnum Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnumAnnotations()
	 * @see #getAnnotatedEEnum()
	 * @generated
	 */
  public EReference getAnnotatedEEnum_EEnumAnnotations() {
		return (EReference)annotatedEEnumEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getAnnotatedEEnumLiterals <em>Annotated EEnum Literals</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotated EEnum Literals</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getAnnotatedEEnumLiterals()
	 * @see #getAnnotatedEEnum()
	 * @generated
	 */
  public EReference getAnnotatedEEnum_AnnotatedEEnumLiterals() {
		return (EReference)annotatedEEnumEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference <em>Annotated EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EReference</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference
	 * @generated
	 */
  public EClass getAnnotatedEReference() {
		return annotatedEReferenceEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReference()
	 * @see #getAnnotatedEReference()
	 * @generated
	 */
  public EReference getAnnotatedEReference_EReference() {
		return (EReference)annotatedEReferenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReferenceAnnotations <em>EReference Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReferenceAnnotations()
	 * @see #getAnnotatedEReference()
	 * @generated
	 */
  public EReference getAnnotatedEReference_EReferenceAnnotations() {
		return (EReference)annotatedEReferenceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute <em>Annotated EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EAttribute</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute
	 * @generated
	 */
  public EClass getAnnotatedEAttribute() {
		return annotatedEAttributeEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttribute()
	 * @see #getAnnotatedEAttribute()
	 * @generated
	 */
  public EReference getAnnotatedEAttribute_EAttribute() {
		return (EReference)annotatedEAttributeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttributeAnnotations <em>EAttribute Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAttribute Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttributeAnnotations()
	 * @see #getAnnotatedEAttribute()
	 * @generated
	 */
  public EReference getAnnotatedEAttribute_EAttributeAnnotations() {
		return (EReference)annotatedEAttributeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated EEnum Literal</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral
	 * @generated
	 */
  public EClass getAnnotatedEEnumLiteral() {
		return annotatedEEnumLiteralEClass;
	}

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EEnum Literal</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteral()
	 * @see #getAnnotatedEEnumLiteral()
	 * @generated
	 */
  public EReference getAnnotatedEEnumLiteral_EEnumLiteral() {
		return (EReference)annotatedEEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteralAnnotations <em>EEnum Literal Annotations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EEnum Literal Annotations</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteralAnnotations()
	 * @see #getAnnotatedEEnumLiteral()
	 * @generated
	 */
  public EReference getAnnotatedEEnumLiteral_EEnumLiteralAnnotations() {
		return (EReference)annotatedEEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getAnnotatedEEnum <em>Annotated EEnum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated EEnum</em>'.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getAnnotatedEEnum()
	 * @see #getAnnotatedEEnumLiteral()
	 * @generated
	 */
  public EReference getAnnotatedEEnumLiteral_AnnotatedEEnum() {
		return (EReference)annotatedEEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  public AnnotationsmodelFactory getAnnotationsmodelFactory() {
		return (AnnotationsmodelFactory)getEFactoryInstance();
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
		eNamedElementAnnotationEClass = createEClass(ENAMED_ELEMENT_ANNOTATION);
		createEReference(eNamedElementAnnotationEClass, ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT);
		createEAttribute(eNamedElementAnnotationEClass, ENAMED_ELEMENT_ANNOTATION__DESCRIPTION);
		createEAttribute(eNamedElementAnnotationEClass, ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER);
		createEAttribute(eNamedElementAnnotationEClass, ENAMED_ELEMENT_ANNOTATION__GENERATED);

		eClassifierAnnotationEClass = createEClass(ECLASSIFIER_ANNOTATION);
		createEReference(eClassifierAnnotationEClass, ECLASSIFIER_ANNOTATION__ECLASSIFIER);
		createEReference(eClassifierAnnotationEClass, ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER);

		eClassAnnotationEClass = createEClass(ECLASS_ANNOTATION);
		createEReference(eClassAnnotationEClass, ECLASS_ANNOTATION__ANNOTATED_ECLASS);
		createEReference(eClassAnnotationEClass, ECLASS_ANNOTATION__ECLASS);

		eDataTypeAnnotationEClass = createEClass(EDATA_TYPE_ANNOTATION);
		createEReference(eDataTypeAnnotationEClass, EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE);
		createEReference(eDataTypeAnnotationEClass, EDATA_TYPE_ANNOTATION__EDATA_TYPE);

		eStructuralFeatureAnnotationEClass = createEClass(ESTRUCTURAL_FEATURE_ANNOTATION);
		createEReference(eStructuralFeatureAnnotationEClass, ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE);

		ePackageAnnotationEClass = createEClass(EPACKAGE_ANNOTATION);
		createEReference(ePackageAnnotationEClass, EPACKAGE_ANNOTATION__EPACKAGE);
		createEReference(ePackageAnnotationEClass, EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE);

		eReferenceAnnotationEClass = createEClass(EREFERENCE_ANNOTATION);
		createEReference(eReferenceAnnotationEClass, EREFERENCE_ANNOTATION__EREFERENCE);
		createEReference(eReferenceAnnotationEClass, EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE);

		eAttributeAnnotationEClass = createEClass(EATTRIBUTE_ANNOTATION);
		createEReference(eAttributeAnnotationEClass, EATTRIBUTE_ANNOTATION__EATTRIBUTE);
		createEReference(eAttributeAnnotationEClass, EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE);

		eEnumAnnotationEClass = createEClass(EENUM_ANNOTATION);
		createEReference(eEnumAnnotationEClass, EENUM_ANNOTATION__EENUM);
		createEReference(eEnumAnnotationEClass, EENUM_ANNOTATION__ANNOTATED_EENUM);

		eEnumLiteralAnnotationEClass = createEClass(EENUM_LITERAL_ANNOTATION);
		createEReference(eEnumLiteralAnnotationEClass, EENUM_LITERAL_ANNOTATION__EENUM_LITERAL);
		createEReference(eEnumLiteralAnnotationEClass, EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL);

		annotatedEClassEClass = createEClass(ANNOTATED_ECLASS);
		createEReference(annotatedEClassEClass, ANNOTATED_ECLASS__ECLASS);
		createEReference(annotatedEClassEClass, ANNOTATED_ECLASS__ECLASS_ANNOTATIONS);
		createEReference(annotatedEClassEClass, ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES);

		annotatedEStructuralFeatureEClass = createEClass(ANNOTATED_ESTRUCTURAL_FEATURE);
		createEReference(annotatedEStructuralFeatureEClass, ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE);
		createEReference(annotatedEStructuralFeatureEClass, ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS);

		annotatedEPackageEClass = createEClass(ANNOTATED_EPACKAGE);
		createEReference(annotatedEPackageEClass, ANNOTATED_EPACKAGE__EPACKAGE);
		createEReference(annotatedEPackageEClass, ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS);
		createEReference(annotatedEPackageEClass, ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS);
		createEReference(annotatedEPackageEClass, ANNOTATED_EPACKAGE__ANNOTATED_MODEL);

		annotatedEClassifierEClass = createEClass(ANNOTATED_ECLASSIFIER);
		createEReference(annotatedEClassifierEClass, ANNOTATED_ECLASSIFIER__ECLASSIFIER);
		createEReference(annotatedEClassifierEClass, ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE);

		annotatedEDataTypeEClass = createEClass(ANNOTATED_EDATA_TYPE);
		createEReference(annotatedEDataTypeEClass, ANNOTATED_EDATA_TYPE__EDATA_TYPE);
		createEReference(annotatedEDataTypeEClass, ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS);

		annotatedModelEClass = createEClass(ANNOTATED_MODEL);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__ANNOTATED_EPACKAGES);
		createEAttribute(annotatedModelEClass, ANNOTATED_MODEL__GENERATING_SOURCES);

		annotatedENamedElementEClass = createEClass(ANNOTATED_ENAMED_ELEMENT);
		createEReference(annotatedENamedElementEClass, ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT);

		annotatedEEnumEClass = createEClass(ANNOTATED_EENUM);
		createEReference(annotatedEEnumEClass, ANNOTATED_EENUM__EENUM);
		createEReference(annotatedEEnumEClass, ANNOTATED_EENUM__EENUM_ANNOTATIONS);
		createEReference(annotatedEEnumEClass, ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS);

		annotatedEReferenceEClass = createEClass(ANNOTATED_EREFERENCE);
		createEReference(annotatedEReferenceEClass, ANNOTATED_EREFERENCE__EREFERENCE);
		createEReference(annotatedEReferenceEClass, ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS);

		annotatedEAttributeEClass = createEClass(ANNOTATED_EATTRIBUTE);
		createEReference(annotatedEAttributeEClass, ANNOTATED_EATTRIBUTE__EATTRIBUTE);
		createEReference(annotatedEAttributeEClass, ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS);

		annotatedEEnumLiteralEClass = createEClass(ANNOTATED_EENUM_LITERAL);
		createEReference(annotatedEEnumLiteralEClass, ANNOTATED_EENUM_LITERAL__EENUM_LITERAL);
		createEReference(annotatedEEnumLiteralEClass, ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS);
		createEReference(annotatedEEnumLiteralEClass, ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eClassifierAnnotationEClass.getESuperTypes().add(this.getENamedElementAnnotation());
		eClassAnnotationEClass.getESuperTypes().add(this.getEClassifierAnnotation());
		eDataTypeAnnotationEClass.getESuperTypes().add(this.getEClassifierAnnotation());
		eStructuralFeatureAnnotationEClass.getESuperTypes().add(this.getENamedElementAnnotation());
		ePackageAnnotationEClass.getESuperTypes().add(this.getENamedElementAnnotation());
		eReferenceAnnotationEClass.getESuperTypes().add(this.getEStructuralFeatureAnnotation());
		eAttributeAnnotationEClass.getESuperTypes().add(this.getEStructuralFeatureAnnotation());
		eEnumAnnotationEClass.getESuperTypes().add(this.getEClassifierAnnotation());
		eEnumLiteralAnnotationEClass.getESuperTypes().add(this.getENamedElementAnnotation());
		annotatedEClassEClass.getESuperTypes().add(this.getAnnotatedEClassifier());
		annotatedEStructuralFeatureEClass.getESuperTypes().add(this.getAnnotatedENamedElement());
		annotatedEPackageEClass.getESuperTypes().add(this.getAnnotatedENamedElement());
		annotatedEClassifierEClass.getESuperTypes().add(this.getAnnotatedENamedElement());
		annotatedEDataTypeEClass.getESuperTypes().add(this.getAnnotatedEClassifier());
		annotatedEEnumEClass.getESuperTypes().add(this.getAnnotatedEDataType());
		annotatedEReferenceEClass.getESuperTypes().add(this.getAnnotatedEStructuralFeature());
		annotatedEAttributeEClass.getESuperTypes().add(this.getAnnotatedEStructuralFeature());
		annotatedEEnumLiteralEClass.getESuperTypes().add(this.getAnnotatedENamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eNamedElementAnnotationEClass, ENamedElementAnnotation.class, "ENamedElementAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getENamedElementAnnotation_ENamedElement(), theEcorePackage.getENamedElement(), null, "eNamedElement", null, 0, 1, ENamedElementAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENamedElementAnnotation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ENamedElementAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENamedElementAnnotation_LastIdentifier(), theEcorePackage.getEString(), "lastIdentifier", null, 0, 1, ENamedElementAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENamedElementAnnotation_Generated(), theEcorePackage.getEBoolean(), "generated", null, 0, 1, ENamedElementAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eNamedElementAnnotationEClass, theEcorePackage.getEString(), "getJavaAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "identifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassifierAnnotationEClass, EClassifierAnnotation.class, "EClassifierAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassifierAnnotation_EClassifier(), theEcorePackage.getEClassifier(), null, "eClassifier", null, 0, 1, EClassifierAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifierAnnotation_AnnotatedEClassifier(), this.getAnnotatedEClassifier(), null, "annotatedEClassifier", null, 0, 1, EClassifierAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassAnnotationEClass, EClassAnnotation.class, "EClassAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassAnnotation_AnnotatedEClass(), this.getAnnotatedEClass(), this.getAnnotatedEClass_EClassAnnotations(), "annotatedEClass", null, 0, 1, EClassAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassAnnotation_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 1, 1, EClassAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDataTypeAnnotationEClass, EDataTypeAnnotation.class, "EDataTypeAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDataTypeAnnotation_AnnotatedEDataType(), this.getAnnotatedEDataType(), this.getAnnotatedEDataType_EDataTypeAnnotations(), "annotatedEDataType", null, 0, 1, EDataTypeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDataTypeAnnotation_EDataType(), theEcorePackage.getEDataType(), null, "eDataType", null, 1, 1, EDataTypeAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureAnnotationEClass, EStructuralFeatureAnnotation.class, "EStructuralFeatureAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeatureAnnotation_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 1, 1, EStructuralFeatureAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePackageAnnotationEClass, EPackageAnnotation.class, "EPackageAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPackageAnnotation_EPackage(), theEcorePackage.getEPackage(), null, "ePackage", null, 1, 1, EPackageAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackageAnnotation_AnnotatedEPackage(), this.getAnnotatedEPackage(), this.getAnnotatedEPackage_EPackageAnnotations(), "annotatedEPackage", null, 0, 1, EPackageAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceAnnotationEClass, EReferenceAnnotation.class, "EReferenceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEReferenceAnnotation_EReference(), theEcorePackage.getEReference(), null, "eReference", null, 1, 1, EReferenceAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReferenceAnnotation_AnnotatedEReference(), this.getAnnotatedEReference(), this.getAnnotatedEReference_EReferenceAnnotations(), "annotatedEReference", null, 0, 1, EReferenceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAttributeAnnotationEClass, EAttributeAnnotation.class, "EAttributeAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAttributeAnnotation_EAttribute(), theEcorePackage.getEAttribute(), null, "eAttribute", null, 1, 1, EAttributeAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttributeAnnotation_AnnotatedEAttribute(), this.getAnnotatedEAttribute(), this.getAnnotatedEAttribute_EAttributeAnnotations(), "annotatedEAttribute", null, 0, 1, EAttributeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumAnnotationEClass, EEnumAnnotation.class, "EEnumAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumAnnotation_EEnum(), theEcorePackage.getEEnum(), null, "eEnum", null, 1, 1, EEnumAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnumAnnotation_AnnotatedEEnum(), this.getAnnotatedEEnum(), this.getAnnotatedEEnum_EEnumAnnotations(), "annotatedEEnum", null, 0, 1, EEnumAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumLiteralAnnotationEClass, EEnumLiteralAnnotation.class, "EEnumLiteralAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumLiteralAnnotation_EEnumLiteral(), theEcorePackage.getEEnumLiteral(), null, "eEnumLiteral", null, 1, 1, EEnumLiteralAnnotation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnumLiteralAnnotation_AnnotatedEEnumLiteral(), this.getAnnotatedEEnumLiteral(), this.getAnnotatedEEnumLiteral_EEnumLiteralAnnotations(), "annotatedEEnumLiteral", null, 0, 1, EEnumLiteralAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEClassEClass, AnnotatedEClass.class, "AnnotatedEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEClass_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 1, 1, AnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEClass_EClassAnnotations(), this.getEClassAnnotation(), this.getEClassAnnotation_AnnotatedEClass(), "eClassAnnotations", null, 0, -1, AnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEClass_AnnotatedEStructuralFeatures(), this.getAnnotatedEStructuralFeature(), this.getAnnotatedEStructuralFeature_AnnotatedEClass(), "annotatedEStructuralFeatures", null, 0, -1, AnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEStructuralFeatureEClass, AnnotatedEStructuralFeature.class, "AnnotatedEStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEStructuralFeature_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 1, 1, AnnotatedEStructuralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEStructuralFeature_AnnotatedEClass(), this.getAnnotatedEClass(), this.getAnnotatedEClass_AnnotatedEStructuralFeatures(), "annotatedEClass", null, 1, 1, AnnotatedEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEPackageEClass, AnnotatedEPackage.class, "AnnotatedEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEPackage_EPackage(), theEcorePackage.getEPackage(), null, "ePackage", null, 1, 1, AnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEPackage_EPackageAnnotations(), this.getEPackageAnnotation(), this.getEPackageAnnotation_AnnotatedEPackage(), "ePackageAnnotations", null, 0, -1, AnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEPackage_AnnotatedEClassifiers(), this.getAnnotatedEClassifier(), this.getAnnotatedEClassifier_AnnotatedEPackage(), "annotatedEClassifiers", null, 0, -1, AnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEPackage_AnnotatedModel(), this.getAnnotatedModel(), this.getAnnotatedModel_AnnotatedEPackages(), "annotatedModel", null, 1, 1, AnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEClassifierEClass, AnnotatedEClassifier.class, "AnnotatedEClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEClassifier_EClassifier(), theEcorePackage.getEClassifier(), null, "eClassifier", null, 0, 1, AnnotatedEClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEClassifier_AnnotatedEPackage(), this.getAnnotatedEPackage(), this.getAnnotatedEPackage_AnnotatedEClassifiers(), "annotatedEPackage", null, 1, 1, AnnotatedEClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEDataTypeEClass, AnnotatedEDataType.class, "AnnotatedEDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEDataType_EDataType(), theEcorePackage.getEDataType(), null, "eDataType", null, 1, 1, AnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEDataType_EDataTypeAnnotations(), this.getEDataTypeAnnotation(), this.getEDataTypeAnnotation_AnnotatedEDataType(), "eDataTypeAnnotations", null, 0, -1, AnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedModelEClass, AnnotatedModel.class, "AnnotatedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedModel_AnnotatedEPackages(), this.getAnnotatedEPackage(), this.getAnnotatedEPackage_AnnotatedModel(), "annotatedEPackages", null, 0, -1, AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotatedModel_GeneratingSources(), theEcorePackage.getEBoolean(), "generatingSources", null, 0, 1, AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedENamedElementEClass, AnnotatedENamedElement.class, "AnnotatedENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedENamedElement_ENamedElement(), theEcorePackage.getENamedElement(), null, "eNamedElement", null, 0, 1, AnnotatedENamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEEnumEClass, AnnotatedEEnum.class, "AnnotatedEEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEEnum_EEnum(), theEcorePackage.getEEnum(), null, "eEnum", null, 1, 1, AnnotatedEEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEEnum_EEnumAnnotations(), this.getEEnumAnnotation(), this.getEEnumAnnotation_AnnotatedEEnum(), "eEnumAnnotations", null, 0, -1, AnnotatedEEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEEnum_AnnotatedEEnumLiterals(), this.getAnnotatedEEnumLiteral(), this.getAnnotatedEEnumLiteral_AnnotatedEEnum(), "annotatedEEnumLiterals", null, 0, -1, AnnotatedEEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEReferenceEClass, AnnotatedEReference.class, "AnnotatedEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEReference_EReference(), theEcorePackage.getEReference(), null, "eReference", null, 1, 1, AnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEReference_EReferenceAnnotations(), this.getEReferenceAnnotation(), this.getEReferenceAnnotation_AnnotatedEReference(), "eReferenceAnnotations", null, 0, -1, AnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotatedEAttributeEClass, AnnotatedEAttribute.class, "AnnotatedEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEAttribute_EAttribute(), theEcorePackage.getEAttribute(), null, "eAttribute", null, 1, 1, AnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEAttribute_EAttributeAnnotations(), this.getEAttributeAnnotation(), this.getEAttributeAnnotation_AnnotatedEAttribute(), "eAttributeAnnotations", null, 0, -1, AnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedEEnumLiteralEClass, AnnotatedEEnumLiteral.class, "AnnotatedEEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedEEnumLiteral_EEnumLiteral(), theEcorePackage.getEEnumLiteral(), null, "eEnumLiteral", null, 1, 1, AnnotatedEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEEnumLiteral_EEnumLiteralAnnotations(), this.getEEnumLiteralAnnotation(), this.getEEnumLiteralAnnotation_AnnotatedEEnumLiteral(), "eEnumLiteralAnnotations", null, 0, -1, AnnotatedEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedEEnumLiteral_AnnotatedEEnum(), this.getAnnotatedEEnum(), this.getAnnotatedEEnum_AnnotatedEEnumLiterals(), "annotatedEEnum", null, 0, 1, AnnotatedEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation <em>ENamed Element Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getENamedElementAnnotation()
		 * @generated
		 */
    public static final EClass ENAMED_ELEMENT_ANNOTATION = eINSTANCE.getENamedElementAnnotation();

    /**
		 * The meta object literal for the '<em><b>ENamed Element</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT = eINSTANCE.getENamedElementAnnotation_ENamedElement();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EAttribute ENAMED_ELEMENT_ANNOTATION__DESCRIPTION = eINSTANCE.getENamedElementAnnotation_Description();

    /**
		 * The meta object literal for the '<em><b>Last Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENAMED_ELEMENT_ANNOTATION__LAST_IDENTIFIER = eINSTANCE.getENamedElementAnnotation_LastIdentifier();

				/**
		 * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENAMED_ELEMENT_ANNOTATION__GENERATED = eINSTANCE.getENamedElementAnnotation_Generated();

				/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation <em>EClassifier Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassifierAnnotation()
		 * @generated
		 */
    public static final EClass ECLASSIFIER_ANNOTATION = eINSTANCE.getEClassifierAnnotation();

    /**
		 * The meta object literal for the '<em><b>EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ECLASSIFIER_ANNOTATION__ECLASSIFIER = eINSTANCE.getEClassifierAnnotation_EClassifier();

    /**
		 * The meta object literal for the '<em><b>Annotated EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
		 * @generated
		 */
    public static final EReference ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER = eINSTANCE.getEClassifierAnnotation_AnnotatedEClassifier();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation <em>EClass Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassAnnotation()
		 * @generated
		 */
    public static final EClass ECLASS_ANNOTATION = eINSTANCE.getEClassAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotated EClass</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ECLASS_ANNOTATION__ANNOTATED_ECLASS = eINSTANCE.getEClassAnnotation_AnnotatedEClass();

    /**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ECLASS_ANNOTATION__ECLASS = eINSTANCE.getEClassAnnotation_EClass();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation <em>EData Type Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEDataTypeAnnotation()
		 * @generated
		 */
    public static final EClass EDATA_TYPE_ANNOTATION = eINSTANCE.getEDataTypeAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotated EData Type</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE = eINSTANCE.getEDataTypeAnnotation_AnnotatedEDataType();

    /**
		 * The meta object literal for the '<em><b>EData Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference EDATA_TYPE_ANNOTATION__EDATA_TYPE = eINSTANCE.getEDataTypeAnnotation_EDataType();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation <em>EStructural Feature Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEStructuralFeatureAnnotation()
		 * @generated
		 */
    public static final EClass ESTRUCTURAL_FEATURE_ANNOTATION = eINSTANCE.getEStructuralFeatureAnnotation();

    /**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public static final EReference ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeatureAnnotation_EStructuralFeature();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation <em>EPackage Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEPackageAnnotation()
		 * @generated
		 */
    public static final EClass EPACKAGE_ANNOTATION = eINSTANCE.getEPackageAnnotation();

    /**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference EPACKAGE_ANNOTATION__EPACKAGE = eINSTANCE.getEPackageAnnotation_EPackage();

    /**
     * The meta object literal for the '<em><b>Annotated EPackage</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE = eINSTANCE.getEPackageAnnotation_AnnotatedEPackage();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation <em>EReference Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEReferenceAnnotation()
		 * @generated
		 */
    public static final EClass EREFERENCE_ANNOTATION = eINSTANCE.getEReferenceAnnotation();

    /**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference EREFERENCE_ANNOTATION__EREFERENCE = eINSTANCE.getEReferenceAnnotation_EReference();

    /**
     * The meta object literal for the '<em><b>Annotated EReference</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE = eINSTANCE.getEReferenceAnnotation_AnnotatedEReference();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation <em>EAttribute Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEAttributeAnnotation()
		 * @generated
		 */
    public static final EClass EATTRIBUTE_ANNOTATION = eINSTANCE.getEAttributeAnnotation();

    /**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference EATTRIBUTE_ANNOTATION__EATTRIBUTE = eINSTANCE.getEAttributeAnnotation_EAttribute();

    /**
     * The meta object literal for the '<em><b>Annotated EAttribute</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE = eINSTANCE.getEAttributeAnnotation_AnnotatedEAttribute();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation <em>EEnum Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumAnnotation()
		 * @generated
		 */
    public static final EClass EENUM_ANNOTATION = eINSTANCE.getEEnumAnnotation();

    /**
		 * The meta object literal for the '<em><b>EEnum</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference EENUM_ANNOTATION__EENUM = eINSTANCE.getEEnumAnnotation_EEnum();

    /**
     * The meta object literal for the '<em><b>Annotated EEnum</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EENUM_ANNOTATION__ANNOTATED_EENUM = eINSTANCE.getEEnumAnnotation_AnnotatedEEnum();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation <em>EEnum Literal Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumLiteralAnnotation()
		 * @generated
		 */
    public static final EClass EENUM_LITERAL_ANNOTATION = eINSTANCE.getEEnumLiteralAnnotation();

    /**
		 * The meta object literal for the '<em><b>EEnum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference EENUM_LITERAL_ANNOTATION__EENUM_LITERAL = eINSTANCE.getEEnumLiteralAnnotation_EEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Annotated EEnum Literal</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL = eINSTANCE.getEEnumLiteralAnnotation_AnnotatedEEnumLiteral();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass <em>Annotated EClass</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClass()
		 * @generated
		 */
    public static final EClass ANNOTATED_ECLASS = eINSTANCE.getAnnotatedEClass();

    /**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_ECLASS__ECLASS = eINSTANCE.getAnnotatedEClass_EClass();

    /**
     * The meta object literal for the '<em><b>EClass Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_ECLASS__ECLASS_ANNOTATIONS = eINSTANCE.getAnnotatedEClass_EClassAnnotations();

    /**
		 * The meta object literal for the '<em><b>Annotated EStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES = eINSTANCE.getAnnotatedEClass_AnnotatedEStructuralFeatures();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEStructuralFeature()
		 * @generated
		 */
    public static final EClass ANNOTATED_ESTRUCTURAL_FEATURE = eINSTANCE.getAnnotatedEStructuralFeature();

    /**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE = eINSTANCE.getAnnotatedEStructuralFeature_EStructuralFeature();

    /**
     * The meta object literal for the '<em><b>Annotated EClass</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS = eINSTANCE.getAnnotatedEStructuralFeature_AnnotatedEClass();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage <em>Annotated EPackage</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage()
		 * @generated
		 */
    public static final EClass ANNOTATED_EPACKAGE = eINSTANCE.getAnnotatedEPackage();

    /**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EPACKAGE__EPACKAGE = eINSTANCE.getAnnotatedEPackage_EPackage();

    /**
     * The meta object literal for the '<em><b>EPackage Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS = eINSTANCE.getAnnotatedEPackage_EPackageAnnotations();

    /**
     * The meta object literal for the '<em><b>Annotated EClassifiers</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS = eINSTANCE.getAnnotatedEPackage_AnnotatedEClassifiers();

    /**
     * The meta object literal for the '<em><b>Annotated Model</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EPACKAGE__ANNOTATED_MODEL = eINSTANCE.getAnnotatedEPackage_AnnotatedModel();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier <em>Annotated EClassifier</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClassifier()
		 * @generated
		 */
    public static final EClass ANNOTATED_ECLASSIFIER = eINSTANCE.getAnnotatedEClassifier();

    /**
		 * The meta object literal for the '<em><b>EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_ECLASSIFIER__ECLASSIFIER = eINSTANCE.getAnnotatedEClassifier_EClassifier();

    /**
     * The meta object literal for the '<em><b>Annotated EPackage</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE = eINSTANCE.getAnnotatedEClassifier_AnnotatedEPackage();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType <em>Annotated EData Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEDataType()
		 * @generated
		 */
    public static final EClass ANNOTATED_EDATA_TYPE = eINSTANCE.getAnnotatedEDataType();

    /**
		 * The meta object literal for the '<em><b>EData Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EDATA_TYPE__EDATA_TYPE = eINSTANCE.getAnnotatedEDataType_EDataType();

    /**
     * The meta object literal for the '<em><b>EData Type Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS = eINSTANCE.getAnnotatedEDataType_EDataTypeAnnotations();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel <em>Annotated Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedModel()
		 * @generated
		 */
    public static final EClass ANNOTATED_MODEL = eINSTANCE.getAnnotatedModel();

    /**
     * The meta object literal for the '<em><b>Annotated EPackages</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_MODEL__ANNOTATED_EPACKAGES = eINSTANCE.getAnnotatedModel_AnnotatedEPackages();

    /**
		 * The meta object literal for the '<em><b>Generating Sources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATED_MODEL__GENERATING_SOURCES = eINSTANCE.getAnnotatedModel_GeneratingSources();

				/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement <em>Annotated ENamed Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedENamedElement()
		 * @generated
		 */
    public static final EClass ANNOTATED_ENAMED_ELEMENT = eINSTANCE.getAnnotatedENamedElement();

    /**
		 * The meta object literal for the '<em><b>ENamed Element</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT = eINSTANCE.getAnnotatedENamedElement_ENamedElement();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum <em>Annotated EEnum</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnum()
		 * @generated
		 */
    public static final EClass ANNOTATED_EENUM = eINSTANCE.getAnnotatedEEnum();

    /**
		 * The meta object literal for the '<em><b>EEnum</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EENUM__EENUM = eINSTANCE.getAnnotatedEEnum_EEnum();

    /**
     * The meta object literal for the '<em><b>EEnum Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EENUM__EENUM_ANNOTATIONS = eINSTANCE.getAnnotatedEEnum_EEnumAnnotations();

    /**
		 * The meta object literal for the '<em><b>Annotated EEnum Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS = eINSTANCE.getAnnotatedEEnum_AnnotatedEEnumLiterals();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference <em>Annotated EReference</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEReference()
		 * @generated
		 */
    public static final EClass ANNOTATED_EREFERENCE = eINSTANCE.getAnnotatedEReference();

    /**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EREFERENCE__EREFERENCE = eINSTANCE.getAnnotatedEReference_EReference();

    /**
     * The meta object literal for the '<em><b>EReference Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS = eINSTANCE.getAnnotatedEReference_EReferenceAnnotations();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute <em>Annotated EAttribute</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEAttribute()
		 * @generated
		 */
    public static final EClass ANNOTATED_EATTRIBUTE = eINSTANCE.getAnnotatedEAttribute();

    /**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EATTRIBUTE__EATTRIBUTE = eINSTANCE.getAnnotatedEAttribute_EAttribute();

    /**
     * The meta object literal for the '<em><b>EAttribute Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS = eINSTANCE.getAnnotatedEAttribute_EAttributeAnnotations();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral
		 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnumLiteral()
		 * @generated
		 */
    public static final EClass ANNOTATED_EENUM_LITERAL = eINSTANCE.getAnnotatedEEnumLiteral();

    /**
		 * The meta object literal for the '<em><b>EEnum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EENUM_LITERAL__EENUM_LITERAL = eINSTANCE.getAnnotatedEEnumLiteral_EEnumLiteral();

    /**
		 * The meta object literal for the '<em><b>EEnum Literal Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
    public static final EReference ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS = eINSTANCE.getAnnotatedEEnumLiteral_EEnumLiteralAnnotations();

    /**
     * The meta object literal for the '<em><b>Annotated EEnum</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final EReference ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM = eINSTANCE.getAnnotatedEEnumLiteral_AnnotatedEEnum();

  }

} // AnnotationsmodelPackage
