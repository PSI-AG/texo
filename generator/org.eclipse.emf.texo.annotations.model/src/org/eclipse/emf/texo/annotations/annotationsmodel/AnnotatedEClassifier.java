/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEClassifier.java,v 1.5 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated EClassifier</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getEClassifier <em>EClassifier</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getAnnotatedEPackage <em>Annotated EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClassifier()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class AnnotatedEClassifier extends AnnotatedENamedElement {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEClassifier() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_ECLASSIFIER;
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
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClassifier_EClassifier()
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
	 * Returns the value of the '<em><b>Annotated EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedEClassifiers <em>Annotated EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EPackage</em>' container reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EPackage</em>' container reference.
	 * @see #setAnnotatedEPackage(AnnotatedEPackage)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClassifier_AnnotatedEPackage()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedEClassifiers
	 * @model opposite="annotatedEClassifiers" required="true" transient="false"
	 * @generated
	 */
  public AnnotatedEPackage getAnnotatedEPackage() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE) return null;
		return (AnnotatedEPackage)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEPackage(AnnotatedEPackage newAnnotatedEPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEPackage, AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getAnnotatedEPackage <em>Annotated EPackage</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EPackage</em>' container reference.
	 * @see #getAnnotatedEPackage()
	 * @generated
	 */
  public void setAnnotatedEPackage(AnnotatedEPackage newAnnotatedEPackage) {
		if (newAnnotatedEPackage != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE && newAnnotatedEPackage != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEPackage != null)
				msgs = ((InternalEObject)newAnnotatedEPackage).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS, AnnotatedEPackage.class, msgs);
			msgs = basicSetAnnotatedEPackage(newAnnotatedEPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE, newAnnotatedEPackage, newAnnotatedEPackage));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS, AnnotatedEPackage.class, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ECLASSIFIER:
				if (resolve) return getEClassifier();
				return basicGetEClassifier();
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ECLASSIFIER:
				return basicGetEClassifier() != null;
			case AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE:
				return getAnnotatedEPackage() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public ENamedElement basicGetENamedElement() {
    return getEClassifier();
  }
} // AnnotatedEClassifier
