/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotationsmodelSwitch.java,v 1.6 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.texo.annotations.annotationsmodel.*;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage
 * @generated
 */
public class AnnotationsmodelSwitch<T> extends Switch<T> {
  /**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected static AnnotationsmodelPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotationsmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = AnnotationsmodelPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION: {
				ENamedElementAnnotation eNamedElementAnnotation = (ENamedElementAnnotation)theEObject;
				T result = caseENamedElementAnnotation(eNamedElementAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ECLASSIFIER_ANNOTATION: {
				EClassifierAnnotation eClassifierAnnotation = (EClassifierAnnotation)theEObject;
				T result = caseEClassifierAnnotation(eClassifierAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eClassifierAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ECLASS_ANNOTATION: {
				EClassAnnotation eClassAnnotation = (EClassAnnotation)theEObject;
				T result = caseEClassAnnotation(eClassAnnotation);
				if (result == null) result = caseEClassifierAnnotation(eClassAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eClassAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION: {
				EDataTypeAnnotation eDataTypeAnnotation = (EDataTypeAnnotation)theEObject;
				T result = caseEDataTypeAnnotation(eDataTypeAnnotation);
				if (result == null) result = caseEClassifierAnnotation(eDataTypeAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eDataTypeAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ESTRUCTURAL_FEATURE_ANNOTATION: {
				EStructuralFeatureAnnotation eStructuralFeatureAnnotation = (EStructuralFeatureAnnotation)theEObject;
				T result = caseEStructuralFeatureAnnotation(eStructuralFeatureAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eStructuralFeatureAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION: {
				EPackageAnnotation ePackageAnnotation = (EPackageAnnotation)theEObject;
				T result = caseEPackageAnnotation(ePackageAnnotation);
				if (result == null) result = caseENamedElementAnnotation(ePackageAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION: {
				EReferenceAnnotation eReferenceAnnotation = (EReferenceAnnotation)theEObject;
				T result = caseEReferenceAnnotation(eReferenceAnnotation);
				if (result == null) result = caseEStructuralFeatureAnnotation(eReferenceAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eReferenceAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION: {
				EAttributeAnnotation eAttributeAnnotation = (EAttributeAnnotation)theEObject;
				T result = caseEAttributeAnnotation(eAttributeAnnotation);
				if (result == null) result = caseEStructuralFeatureAnnotation(eAttributeAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eAttributeAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.EENUM_ANNOTATION: {
				EEnumAnnotation eEnumAnnotation = (EEnumAnnotation)theEObject;
				T result = caseEEnumAnnotation(eEnumAnnotation);
				if (result == null) result = caseEClassifierAnnotation(eEnumAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eEnumAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION: {
				EEnumLiteralAnnotation eEnumLiteralAnnotation = (EEnumLiteralAnnotation)theEObject;
				T result = caseEEnumLiteralAnnotation(eEnumLiteralAnnotation);
				if (result == null) result = caseENamedElementAnnotation(eEnumLiteralAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_ECLASS: {
				AnnotatedEClass annotatedEClass = (AnnotatedEClass)theEObject;
				T result = caseAnnotatedEClass(annotatedEClass);
				if (result == null) result = caseAnnotatedEClassifier(annotatedEClass);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE: {
				AnnotatedEStructuralFeature annotatedEStructuralFeature = (AnnotatedEStructuralFeature)theEObject;
				T result = caseAnnotatedEStructuralFeature(annotatedEStructuralFeature);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE: {
				AnnotatedEPackage annotatedEPackage = (AnnotatedEPackage)theEObject;
				T result = caseAnnotatedEPackage(annotatedEPackage);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER: {
				AnnotatedEClassifier annotatedEClassifier = (AnnotatedEClassifier)theEObject;
				T result = caseAnnotatedEClassifier(annotatedEClassifier);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE: {
				AnnotatedEDataType annotatedEDataType = (AnnotatedEDataType)theEObject;
				T result = caseAnnotatedEDataType(annotatedEDataType);
				if (result == null) result = caseAnnotatedEClassifier(annotatedEDataType);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_MODEL: {
				AnnotatedModel annotatedModel = (AnnotatedModel)theEObject;
				T result = caseAnnotatedModel(annotatedModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_ENAMED_ELEMENT: {
				AnnotatedENamedElement annotatedENamedElement = (AnnotatedENamedElement)theEObject;
				T result = caseAnnotatedENamedElement(annotatedENamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_EENUM: {
				AnnotatedEEnum annotatedEEnum = (AnnotatedEEnum)theEObject;
				T result = caseAnnotatedEEnum(annotatedEEnum);
				if (result == null) result = caseAnnotatedEDataType(annotatedEEnum);
				if (result == null) result = caseAnnotatedEClassifier(annotatedEEnum);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE: {
				AnnotatedEReference annotatedEReference = (AnnotatedEReference)theEObject;
				T result = caseAnnotatedEReference(annotatedEReference);
				if (result == null) result = caseAnnotatedEStructuralFeature(annotatedEReference);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE: {
				AnnotatedEAttribute annotatedEAttribute = (AnnotatedEAttribute)theEObject;
				T result = caseAnnotatedEAttribute(annotatedEAttribute);
				if (result == null) result = caseAnnotatedEStructuralFeature(annotatedEAttribute);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL: {
				AnnotatedEEnumLiteral annotatedEEnumLiteral = (AnnotatedEEnumLiteral)theEObject;
				T result = caseAnnotatedEEnumLiteral(annotatedEEnumLiteral);
				if (result == null) result = caseAnnotatedENamedElement(annotatedEEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Element Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Element Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedElementAnnotation(ENamedElementAnnotation object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClassifier Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClassifier Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassifierAnnotation(EClassifierAnnotation object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Annotation</em>'.
	 * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEClassAnnotation(EClassAnnotation object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>EData Type Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EData Type Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDataTypeAnnotation(EDataTypeAnnotation object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EStructural Feature Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEStructuralFeatureAnnotation(EStructuralFeatureAnnotation object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage Annotation</em>'.
	 * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEPackageAnnotation(EPackageAnnotation object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferenceAnnotation(EReferenceAnnotation object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributeAnnotation(EAttributeAnnotation object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Annotation</em>'.
	 * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEEnumAnnotation(EEnumAnnotation object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>EEnum Literal Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EEnum Literal Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEEnumLiteralAnnotation(EEnumLiteralAnnotation object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated EClass</em>'.
	 * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnnotatedEClass(AnnotatedEClass object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated EStructural Feature</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated EStructural Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEStructuralFeature(AnnotatedEStructuralFeature object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated EPackage</em>'.
	 * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnnotatedEPackage(AnnotatedEPackage object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated EClassifier</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated EClassifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEClassifier(AnnotatedEClassifier object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated EData Type</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated EData Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEDataType(AnnotatedEDataType object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Model</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnnotatedModel(AnnotatedModel object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated ENamed Element</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated ENamed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedENamedElement(AnnotatedENamedElement object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated EEnum</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnnotatedEEnum(AnnotatedEEnum object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated EReference</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated EReference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEReference(AnnotatedEReference object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated EAttribute</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated EAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEAttribute(AnnotatedEAttribute object) {
		return null;
	}

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated EEnum Literal</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated EEnum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEEnumLiteral(AnnotatedEEnumLiteral object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object) {
		return null;
	}

} // AnnotationsmodelSwitch
