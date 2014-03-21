/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEReference.java,v 1.7 2011/09/23 21:00:23 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated EReference</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReference <em>EReference</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReferenceAnnotations <em>EReference Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEReference()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEReference extends AnnotatedEStructuralFeature {
  /**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
  protected EReference eReference;

  /**
	 * The cached value of the '{@link #getEReferenceAnnotations() <em>EReference Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEReferenceAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EReferenceAnnotation> eReferenceAnnotations;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEReference() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_EREFERENCE;
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
	 * @see #setEReference(EReference)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEReference_EReference()
	 * @model required="true"
	 * @generated
	 */
  public EReference getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject)eReference;
			eReference = (EReference)eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE, oldEReference, eReference));
			}
		}
		return eReference;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EReference basicGetEReference() {
		return eReference;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
  public void setEReference(EReference newEReference) {
		EReference oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE, oldEReference, eReference));
	}

  /**
	 * Returns the value of the '<em><b>EReference Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getAnnotatedEReference <em>Annotated EReference</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EReference Annotations</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEReference_EReferenceAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation#getAnnotatedEReference
	 * @model opposite="annotatedEReference" containment="true" ordered="false"
	 * @generated
	 */
  public EList<EReferenceAnnotation> getEReferenceAnnotations() {
		if (eReferenceAnnotations == null) {
			eReferenceAnnotations = new EObjectContainmentWithInverseEList<EReferenceAnnotation>(EReferenceAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS, AnnotationsmodelPackage.EREFERENCE_ANNOTATION__ANNOTATED_EREFERENCE);
		}
		return eReferenceAnnotations;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEReferenceAnnotations()).basicAdd(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
				return ((InternalEList<?>)getEReferenceAnnotations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE:
				if (resolve) return getEReference();
				return basicGetEReference();
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
				return getEReferenceAnnotations();
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
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE:
				setEReference((EReference)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
				getEReferenceAnnotations().clear();
				getEReferenceAnnotations().addAll((Collection<? extends EReferenceAnnotation>)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE:
				setEReference((EReference)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
				getEReferenceAnnotations().clear();
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
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE:
				return eReference != null;
			case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
				return eReferenceAnnotations != null && !eReferenceAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  @Override
  public EStructuralFeature basicGetEStructuralFeature() {
    return getEReference();
  }

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEReferenceAnnotations());
    return annotations;
  }

} // AnnotatedEReference
