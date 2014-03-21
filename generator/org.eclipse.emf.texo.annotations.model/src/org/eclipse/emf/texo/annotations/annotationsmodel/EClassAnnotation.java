/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassAnnotation.java,v 1.11 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EClass Annotation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getAnnotatedEClass <em>Annotated EClass
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassAnnotation()
 * @model kind="class"
 * @generated
 */
public class EClassAnnotation extends EClassifierAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EClassAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ECLASS_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>Annotated EClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClassAnnotations <em>EClass Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EClass</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EClass</em>' container reference.
	 * @see #setAnnotatedEClass(AnnotatedEClass)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassAnnotation_AnnotatedEClass()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClassAnnotations
	 * @model opposite="eClassAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEClass getAnnotatedEClass() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS) return null;
		return (AnnotatedEClass)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEClass(AnnotatedEClass newAnnotatedEClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEClass, AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getAnnotatedEClass <em>Annotated EClass</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EClass</em>' container reference.
	 * @see #getAnnotatedEClass()
	 * @generated
	 */
  public void setAnnotatedEClass(AnnotatedEClass newAnnotatedEClass) {
		if (newAnnotatedEClass != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS && newAnnotatedEClass != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEClass != null)
				msgs = ((InternalEObject)newAnnotatedEClass).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS, AnnotatedEClass.class, msgs);
			msgs = basicSetAnnotatedEClass(newAnnotatedEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS, newAnnotatedEClass, newAnnotatedEClass));
	}

  /**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEClassAnnotation_EClass()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EClass getEClass() {
		EClass eClass = basicGetEClass();
		return eClass != null && eClass.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)eClass) : eClass;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EClass basicGetEClass() {
    return getAnnotatedEClass().getEClass();
  }

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
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
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
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
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS, AnnotatedEClass.class, msgs);
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
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
				return getAnnotatedEClass();
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
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
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
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
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
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
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS:
				return getAnnotatedEClass() != null;
			case AnnotationsmodelPackage.ECLASS_ANNOTATION__ECLASS:
				return basicGetEClass() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AnnotatedEClassifier basicGetAnnotatedEClassifier() {
    return getAnnotatedEClass();
  }

  @Override
  public EClassifier basicGetEClassifier() {
    return getEClass();
  }

} // EClassAnnotation
