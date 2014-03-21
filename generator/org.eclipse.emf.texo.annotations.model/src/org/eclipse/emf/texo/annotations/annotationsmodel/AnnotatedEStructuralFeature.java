/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEStructuralFeature.java,v 1.8 2011/09/23 21:00:23 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated EStructural Feature</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getAnnotatedEClass <em>Annotated EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEStructuralFeature()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class AnnotatedEStructuralFeature extends AnnotatedENamedElement {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEStructuralFeature() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_ESTRUCTURAL_FEATURE;
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
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEStructuralFeature_EStructuralFeature()
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
	 * Returns the value of the '<em><b>Annotated EClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getAnnotatedEStructuralFeatures <em>Annotated EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EClass</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EClass</em>' container reference.
	 * @see #setAnnotatedEClass(AnnotatedEClass)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEStructuralFeature_AnnotatedEClass()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getAnnotatedEStructuralFeatures
	 * @model opposite="annotatedEStructuralFeatures" required="true" transient="false"
	 * @generated
	 */
  public AnnotatedEClass getAnnotatedEClass() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS) return null;
		return (AnnotatedEClass)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEClass(AnnotatedEClass newAnnotatedEClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEClass, AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getAnnotatedEClass <em>Annotated EClass</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EClass</em>' container reference.
	 * @see #getAnnotatedEClass()
	 * @generated
	 */
  public void setAnnotatedEClass(AnnotatedEClass newAnnotatedEClass) {
		if (newAnnotatedEClass != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS && newAnnotatedEClass != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEClass != null)
				msgs = ((InternalEObject)newAnnotatedEClass).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES, AnnotatedEClass.class, msgs);
			msgs = basicSetAnnotatedEClass(newAnnotatedEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS, newAnnotatedEClass, newAnnotatedEClass));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEClass((AnnotatedEClass)otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				return basicSetAnnotatedEClass(null, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES, AnnotatedEClass.class, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE:
				if (resolve) return getEStructuralFeature();
				return basicGetEStructuralFeature();
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				return getAnnotatedEClass();
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
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				setAnnotatedEClass((AnnotatedEClass)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				setAnnotatedEClass((AnnotatedEClass)null);
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
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE:
				return basicGetEStructuralFeature() != null;
			case AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS:
				return getAnnotatedEClass() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public ENamedElement basicGetENamedElement() {
    return getEStructuralFeature();
  }
} // AnnotatedEStructuralFeature
