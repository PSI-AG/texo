/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnumAnnotation.java,v 1.10 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEnum Annotation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getEEnum <em>EEnum</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getAnnotatedEEnum <em>Annotated EEnum
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumAnnotation()
 * @model kind="class"
 * @generated
 */
public class EEnumAnnotation extends EClassifierAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EEnumAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.EENUM_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>EEnum</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumAnnotation_EEnum()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EEnum getEEnum() {
		EEnum eEnum = basicGetEEnum();
		return eEnum != null && eEnum.eIsProxy() ? (EEnum)eResolveProxy((InternalEObject)eEnum) : eEnum;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EEnum basicGetEEnum() {
    return getAnnotatedEEnum().getEEnum();
  }

  /**
	 * Returns the value of the '<em><b>Annotated EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnumAnnotations <em>EEnum Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EEnum</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EEnum</em>' container reference.
	 * @see #setAnnotatedEEnum(AnnotatedEEnum)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumAnnotation_AnnotatedEEnum()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnumAnnotations
	 * @model opposite="eEnumAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEEnum getAnnotatedEEnum() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM) return null;
		return (AnnotatedEEnum)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEEnum(AnnotatedEEnum newAnnotatedEEnum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEEnum, AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getAnnotatedEEnum <em>Annotated EEnum</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EEnum</em>' container reference.
	 * @see #getAnnotatedEEnum()
	 * @generated
	 */
  public void setAnnotatedEEnum(AnnotatedEEnum newAnnotatedEEnum) {
		if (newAnnotatedEEnum != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM && newAnnotatedEEnum != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEEnum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEEnum != null)
				msgs = ((InternalEObject)newAnnotatedEEnum).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS, AnnotatedEEnum.class, msgs);
			msgs = basicSetAnnotatedEEnum(newAnnotatedEEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM, newAnnotatedEEnum, newAnnotatedEEnum));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEEnum((AnnotatedEEnum)otherEnd, msgs);
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
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				return basicSetAnnotatedEEnum(null, msgs);
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
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS, AnnotatedEEnum.class, msgs);
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
			case AnnotationsmodelPackage.EENUM_ANNOTATION__EENUM:
				if (resolve) return getEEnum();
				return basicGetEEnum();
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				return getAnnotatedEEnum();
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
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				setAnnotatedEEnum((AnnotatedEEnum)newValue);
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
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				setAnnotatedEEnum((AnnotatedEEnum)null);
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
			case AnnotationsmodelPackage.EENUM_ANNOTATION__EENUM:
				return basicGetEEnum() != null;
			case AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM:
				return getAnnotatedEEnum() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AnnotatedEClassifier basicGetAnnotatedEClassifier() {
    return getAnnotatedEEnum();
  }

  @Override
  public EClassifier basicGetEClassifier() {
    return getEEnum();
  }

} // EEnumAnnotation
