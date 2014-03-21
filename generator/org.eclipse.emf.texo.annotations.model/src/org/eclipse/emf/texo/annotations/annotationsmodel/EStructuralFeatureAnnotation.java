/**
 * <copyright>
 * </copyright>
 *
 * $Id: EStructuralFeatureAnnotation.java,v 1.11 2011/09/23 21:00:23 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EStructural Feature Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEStructuralFeatureAnnotation()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class EStructuralFeatureAnnotation extends ENamedElementAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EStructuralFeatureAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ESTRUCTURAL_FEATURE_ANNOTATION;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public ENamedElement basicGetENamedElement() {
    return getEStructuralFeature();
  }

  /**
	 * Returns the value of the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EStructural Feature</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Feature</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEStructuralFeatureAnnotation_EStructuralFeature()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EStructuralFeature getEStructuralFeature() {
		EStructuralFeature eStructuralFeature = basicGetEStructuralFeature();
		return eStructuralFeature != null && eStructuralFeature.eIsProxy() ? (EStructuralFeature)eResolveProxy((InternalEObject)eStructuralFeature) : eStructuralFeature;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public abstract EStructuralFeature basicGetEStructuralFeature();

  /**
   * Returns the value of the '<em><b>Annotated EFeature</b></em>' container reference. It is bidirectional and its
   * opposite is '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getEStructuralFeatureAnnotations
   * <em>EStructural Feature Annotations</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EFeature</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Annotated EFeature</em>' container reference.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEStructuralFeatureAnnotation_AnnotatedEFeature()
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getEStructuralFeatureAnnotations
   * @model opposite="eStructuralFeatureAnnotations" changeable="false" volatile="true"
   * @generatedNOT
   */
  public AnnotatedEStructuralFeature getAnnotatedEFeature() {
    return basicGetAnnotatedEFeature();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public abstract AnnotatedEStructuralFeature basicGetAnnotatedEFeature();

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsmodelPackage.ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE:
				if (resolve) return getEStructuralFeature();
				return basicGetEStructuralFeature();
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
			case AnnotationsmodelPackage.ESTRUCTURAL_FEATURE_ANNOTATION__ESTRUCTURAL_FEATURE:
				return basicGetEStructuralFeature() != null;
		}
		return super.eIsSet(featureID);
	}
} // EStructuralFeatureAnnotation
