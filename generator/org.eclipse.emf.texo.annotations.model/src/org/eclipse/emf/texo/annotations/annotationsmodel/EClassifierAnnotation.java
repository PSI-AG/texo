/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassifierAnnotation.java,v 1.9 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EClassifier Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation#getEClassifier <em>EClassifier</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation#getAnnotatedEClassifier <em>Annotated EClassifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassifierAnnotation()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class EClassifierAnnotation extends ENamedElementAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EClassifierAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ECLASSIFIER_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClassifier</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifier</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassifierAnnotation_EClassifier()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EClassifier getEClassifier() {
		EClassifier eClassifier = basicGetEClassifier();
		return eClassifier != null && eClassifier.eIsProxy() ? (EClassifier)eResolveProxy((InternalEObject)eClassifier) : eClassifier;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public abstract EClassifier basicGetEClassifier();

  /**
	 * Returns the value of the '<em><b>Annotated EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EClassifier</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EClassifier</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassifierAnnotation_AnnotatedEClassifier()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public AnnotatedEClassifier getAnnotatedEClassifier() {
		AnnotatedEClassifier annotatedEClassifier = basicGetAnnotatedEClassifier();
		return annotatedEClassifier != null && annotatedEClassifier.eIsProxy() ? (AnnotatedEClassifier)eResolveProxy((InternalEObject)annotatedEClassifier) : annotatedEClassifier;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public abstract AnnotatedEClassifier basicGetAnnotatedEClassifier();

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsmodelPackage.ECLASSIFIER_ANNOTATION__ECLASSIFIER:
				if (resolve) return getEClassifier();
				return basicGetEClassifier();
			case AnnotationsmodelPackage.ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER:
				if (resolve) return getAnnotatedEClassifier();
				return basicGetAnnotatedEClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnnotationsmodelPackage.ECLASSIFIER_ANNOTATION__ECLASSIFIER:
				return basicGetEClassifier() != null;
			case AnnotationsmodelPackage.ECLASSIFIER_ANNOTATION__ANNOTATED_ECLASSIFIER:
				return basicGetAnnotatedEClassifier() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public ENamedElement basicGetENamedElement() {
    return getEClassifier();
  }

} // EClassifierAnnotation
