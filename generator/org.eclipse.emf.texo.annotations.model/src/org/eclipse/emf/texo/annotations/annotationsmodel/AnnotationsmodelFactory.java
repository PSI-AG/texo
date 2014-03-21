/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotationsmodelFactory.java,v 1.6 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage
 * @generated
 */
public class AnnotationsmodelFactory extends EFactoryImpl {
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static final AnnotationsmodelFactory eINSTANCE = init();

  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static AnnotationsmodelFactory init() {
		try {
			AnnotationsmodelFactory theAnnotationsmodelFactory = (AnnotationsmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/texo/annotations/model"); 
			if (theAnnotationsmodelFactory != null) {
				return theAnnotationsmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnotationsmodelFactory();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotationsmodelFactory() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnnotationsmodelPackage.ECLASS_ANNOTATION: return createEClassAnnotation();
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION: return createEDataTypeAnnotation();
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION: return createEPackageAnnotation();
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION: return createEReferenceAnnotation();
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION: return createEAttributeAnnotation();
			case AnnotationsmodelPackage.EENUM_ANNOTATION: return createEEnumAnnotation();
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION: return createEEnumLiteralAnnotation();
			case AnnotationsmodelPackage.ANNOTATED_ECLASS: return createAnnotatedEClass();
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE: return createAnnotatedEPackage();
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE: return createAnnotatedEDataType();
			case AnnotationsmodelPackage.ANNOTATED_MODEL: return createAnnotatedModel();
			case AnnotationsmodelPackage.ANNOTATED_EENUM: return createAnnotatedEEnum();
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE: return createAnnotatedEReference();
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE: return createAnnotatedEAttribute();
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL: return createAnnotatedEEnumLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EClassAnnotation createEClassAnnotation() {
		EClassAnnotation eClassAnnotation = new EClassAnnotation();
		return eClassAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EDataTypeAnnotation createEDataTypeAnnotation() {
		EDataTypeAnnotation eDataTypeAnnotation = new EDataTypeAnnotation();
		return eDataTypeAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EPackageAnnotation createEPackageAnnotation() {
		EPackageAnnotation ePackageAnnotation = new EPackageAnnotation();
		return ePackageAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EReferenceAnnotation createEReferenceAnnotation() {
		EReferenceAnnotation eReferenceAnnotation = new EReferenceAnnotation();
		return eReferenceAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EAttributeAnnotation createEAttributeAnnotation() {
		EAttributeAnnotation eAttributeAnnotation = new EAttributeAnnotation();
		return eAttributeAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EEnumAnnotation createEEnumAnnotation() {
		EEnumAnnotation eEnumAnnotation = new EEnumAnnotation();
		return eEnumAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EEnumLiteralAnnotation createEEnumLiteralAnnotation() {
		EEnumLiteralAnnotation eEnumLiteralAnnotation = new EEnumLiteralAnnotation();
		return eEnumLiteralAnnotation;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEClass createAnnotatedEClass() {
		AnnotatedEClass annotatedEClass = new AnnotatedEClass();
		return annotatedEClass;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEPackage createAnnotatedEPackage() {
		AnnotatedEPackage annotatedEPackage = new AnnotatedEPackage();
		return annotatedEPackage;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEDataType createAnnotatedEDataType() {
		AnnotatedEDataType annotatedEDataType = new AnnotatedEDataType();
		return annotatedEDataType;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedModel createAnnotatedModel() {
		AnnotatedModel annotatedModel = new AnnotatedModel();
		return annotatedModel;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEEnum createAnnotatedEEnum() {
		AnnotatedEEnum annotatedEEnum = new AnnotatedEEnum();
		return annotatedEEnum;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEReference createAnnotatedEReference() {
		AnnotatedEReference annotatedEReference = new AnnotatedEReference();
		return annotatedEReference;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEAttribute createAnnotatedEAttribute() {
		AnnotatedEAttribute annotatedEAttribute = new AnnotatedEAttribute();
		return annotatedEAttribute;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotatedEEnumLiteral createAnnotatedEEnumLiteral() {
		AnnotatedEEnumLiteral annotatedEEnumLiteral = new AnnotatedEEnumLiteral();
		return annotatedEEnumLiteral;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotationsmodelPackage getAnnotationsmodelPackage() {
		return (AnnotationsmodelPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static AnnotationsmodelPackage getPackage() {
		return AnnotationsmodelPackage.eINSTANCE;
	}

} // AnnotationsmodelFactory
