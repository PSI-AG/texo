/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageAnnotation.java,v 1.10 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EPackage Annotation</b></em> '. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getAnnotatedEPackage <em>Annotated EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEPackageAnnotation()
 * @model kind="class"
 * @generated
 */
public class EPackageAnnotation extends ENamedElementAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EPackageAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.EPACKAGE_ANNOTATION;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public ENamedElement basicGetENamedElement() {
    return getEPackage();
  }

  /**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EPackage</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEPackageAnnotation_EPackage()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EPackage getEPackage() {
		EPackage ePackage = basicGetEPackage();
		return ePackage != null && ePackage.eIsProxy() ? (EPackage)eResolveProxy((InternalEObject)ePackage) : ePackage;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EPackage basicGetEPackage() {
    return getAnnotatedEPackage().getEPackage();
  }

  /**
	 * Returns the value of the '<em><b>Annotated EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackageAnnotations <em>EPackage Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EPackage</em>' container reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EPackage</em>' container reference.
	 * @see #setAnnotatedEPackage(AnnotatedEPackage)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEPackageAnnotation_AnnotatedEPackage()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackageAnnotations
	 * @model opposite="ePackageAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEPackage getAnnotatedEPackage() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE) return null;
		return (AnnotatedEPackage)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEPackage(AnnotatedEPackage newAnnotatedEPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEPackage, AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getAnnotatedEPackage <em>Annotated EPackage</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EPackage</em>' container reference.
	 * @see #getAnnotatedEPackage()
	 * @generated
	 */
  public void setAnnotatedEPackage(AnnotatedEPackage newAnnotatedEPackage) {
		if (newAnnotatedEPackage != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE && newAnnotatedEPackage != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEPackage != null)
				msgs = ((InternalEObject)newAnnotatedEPackage).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS, AnnotatedEPackage.class, msgs);
			msgs = basicSetAnnotatedEPackage(newAnnotatedEPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE, newAnnotatedEPackage, newAnnotatedEPackage));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEPackage((AnnotatedEPackage)otherEnd, msgs);
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
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				return basicSetAnnotatedEPackage(null, msgs);
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
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS, AnnotatedEPackage.class, msgs);
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
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__EPACKAGE:
				if (resolve) return getEPackage();
				return basicGetEPackage();
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				return getAnnotatedEPackage();
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
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				setAnnotatedEPackage((AnnotatedEPackage)newValue);
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
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				setAnnotatedEPackage((AnnotatedEPackage)null);
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
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__EPACKAGE:
				return basicGetEPackage() != null;
			case AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE:
				return getAnnotatedEPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} // EPackageAnnotation
