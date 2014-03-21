/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAttributeAnnotation.java,v 1.11 2011/09/21 14:04:06 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EAttribute Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getEAttribute <em>EAttribute</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getAnnotatedEAttribute <em>Annotated EAttribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEAttributeAnnotation()
 * @model kind="class"
 * @generated
 */
public class EAttributeAnnotation extends EStructuralFeatureAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EAttributeAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.EATTRIBUTE_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAttribute</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEAttributeAnnotation_EAttribute()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EAttribute getEAttribute() {
		EAttribute eAttribute = basicGetEAttribute();
		return eAttribute != null && eAttribute.eIsProxy() ? (EAttribute)eResolveProxy((InternalEObject)eAttribute) : eAttribute;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EAttribute basicGetEAttribute() {
    return getAnnotatedEAttribute().getEAttribute();
  }

  /**
	 * Returns the value of the '<em><b>Annotated EAttribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttributeAnnotations <em>EAttribute Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EAttribute</em>' container reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EAttribute</em>' container reference.
	 * @see #setAnnotatedEAttribute(AnnotatedEAttribute)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEAttributeAnnotation_AnnotatedEAttribute()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttributeAnnotations
	 * @model opposite="eAttributeAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEAttribute getAnnotatedEAttribute() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE) return null;
		return (AnnotatedEAttribute)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEAttribute(AnnotatedEAttribute newAnnotatedEAttribute,
      NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEAttribute, AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getAnnotatedEAttribute <em>Annotated EAttribute</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EAttribute</em>' container reference.
	 * @see #getAnnotatedEAttribute()
	 * @generated
	 */
  public void setAnnotatedEAttribute(AnnotatedEAttribute newAnnotatedEAttribute) {
		if (newAnnotatedEAttribute != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE && newAnnotatedEAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEAttribute != null)
				msgs = ((InternalEObject)newAnnotatedEAttribute).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS, AnnotatedEAttribute.class, msgs);
			msgs = basicSetAnnotatedEAttribute(newAnnotatedEAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE, newAnnotatedEAttribute, newAnnotatedEAttribute));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEAttribute((AnnotatedEAttribute)otherEnd, msgs);
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
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				return basicSetAnnotatedEAttribute(null, msgs);
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
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS, AnnotatedEAttribute.class, msgs);
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
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__EATTRIBUTE:
				if (resolve) return getEAttribute();
				return basicGetEAttribute();
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				return getAnnotatedEAttribute();
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
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				setAnnotatedEAttribute((AnnotatedEAttribute)newValue);
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
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				setAnnotatedEAttribute((AnnotatedEAttribute)null);
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
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__EATTRIBUTE:
				return basicGetEAttribute() != null;
			case AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE:
				return getAnnotatedEAttribute() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public EStructuralFeature basicGetEStructuralFeature() {
    return getEAttribute();
  }

  @Override
  public AnnotatedEStructuralFeature basicGetAnnotatedEFeature() {
    return getAnnotatedEAttribute();
  }
} // EAttributeAnnotation
