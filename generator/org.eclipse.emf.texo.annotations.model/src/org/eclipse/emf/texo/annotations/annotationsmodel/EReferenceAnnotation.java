/**
 * <copyright>
 * </copyright>
 *
 * $Id: EReferenceAnnotation.java,v 1.10 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EReference Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getEReference <em>EReference</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getAnnotatedEReference <em>Annotated EReference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEReferenceAnnotation()
 * @model kind="class"
 * @generated
 */
public class EReferenceAnnotation extends EStructuralFeatureAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EReferenceAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.EREFERENCE_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EReference</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEReferenceAnnotation_EReference()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EReference getEReference() {
		EReference eReference = basicGetEReference();
		return eReference != null && eReference.eIsProxy() ? (EReference)eResolveProxy((InternalEObject)eReference) : eReference;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EReference basicGetEReference() {
    return getAnnotatedEReference().getEReference();
  }

  /**
	 * Returns the value of the '<em><b>Annotated EReference</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReferenceAnnotations <em>EReference Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EReference</em>' container reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EReference</em>' container reference.
	 * @see #setAnnotatedEReference(AnnotatedEReference)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEReferenceAnnotation_AnnotatedEReference()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReferenceAnnotations
	 * @model opposite="eReferenceAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEReference getAnnotatedEReference() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE) return null;
		return (AnnotatedEReference)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEReference(AnnotatedEReference newAnnotatedEReference,
      NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEReference, AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getAnnotatedEReference <em>Annotated EReference</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EReference</em>' container reference.
	 * @see #getAnnotatedEReference()
	 * @generated
	 */
  public void setAnnotatedEReference(AnnotatedEReference newAnnotatedEReference) {
		if (newAnnotatedEReference != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE && newAnnotatedEReference != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEReference))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEReference != null)
				msgs = ((InternalEObject)newAnnotatedEReference).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS, AnnotatedEReference.class, msgs);
			msgs = basicSetAnnotatedEReference(newAnnotatedEReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE, newAnnotatedEReference, newAnnotatedEReference));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEReference((AnnotatedEReference)otherEnd, msgs);
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
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				return basicSetAnnotatedEReference(null, msgs);
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
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS, AnnotatedEReference.class, msgs);
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
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__EREFERENCE:
				if (resolve) return getEReference();
				return basicGetEReference();
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				return getAnnotatedEReference();
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
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				setAnnotatedEReference((AnnotatedEReference)newValue);
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
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				setAnnotatedEReference((AnnotatedEReference)null);
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
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__EREFERENCE:
				return basicGetEReference() != null;
			case AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE:
				return getAnnotatedEReference() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AnnotatedEStructuralFeature basicGetAnnotatedEFeature() {
    return getAnnotatedEReference();
  }

  @Override
  public EStructuralFeature basicGetEStructuralFeature() {
    return getEReference();
  }

} // EReferenceAnnotation
