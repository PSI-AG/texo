/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDataTypeAnnotation.java,v 1.11 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EData Type Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getAnnotatedEDataType <em>Annotated EData Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getEDataType <em>EData Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEDataTypeAnnotation()
 * @model kind="class"
 * @generated
 */
public class EDataTypeAnnotation extends EClassifierAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EDataTypeAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.EDATA_TYPE_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>Annotated EData Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations <em>EData Type Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EData Type</em>' container reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EData Type</em>' container reference.
	 * @see #setAnnotatedEDataType(AnnotatedEDataType)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEDataTypeAnnotation_AnnotatedEDataType()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations
	 * @model opposite="eDataTypeAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEDataType getAnnotatedEDataType() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE) return null;
		return (AnnotatedEDataType)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEDataType(AnnotatedEDataType newAnnotatedEDataType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEDataType, AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getAnnotatedEDataType <em>Annotated EData Type</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EData Type</em>' container reference.
	 * @see #getAnnotatedEDataType()
	 * @generated
	 */
  public void setAnnotatedEDataType(AnnotatedEDataType newAnnotatedEDataType) {
		if (newAnnotatedEDataType != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE && newAnnotatedEDataType != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEDataType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEDataType != null)
				msgs = ((InternalEObject)newAnnotatedEDataType).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotatedEDataType.class, msgs);
			msgs = basicSetAnnotatedEDataType(newAnnotatedEDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE, newAnnotatedEDataType, newAnnotatedEDataType));
	}

  /**
	 * Returns the value of the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EData Type</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EData Type</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEDataTypeAnnotation_EDataType()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EDataType getEDataType() {
		EDataType eDataType = basicGetEDataType();
		return eDataType != null && eDataType.eIsProxy() ? (EDataType)eResolveProxy((InternalEObject)eDataType) : eDataType;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EDataType basicGetEDataType() {
    return getAnnotatedEDataType().getEDataType();
  }

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEDataType((AnnotatedEDataType)otherEnd, msgs);
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
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				return basicSetAnnotatedEDataType(null, msgs);
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
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotatedEDataType.class, msgs);
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
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				return getAnnotatedEDataType();
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE:
				if (resolve) return getEDataType();
				return basicGetEDataType();
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
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				setAnnotatedEDataType((AnnotatedEDataType)newValue);
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
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				setAnnotatedEDataType((AnnotatedEDataType)null);
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
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE:
				return getAnnotatedEDataType() != null;
			case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE:
				return basicGetEDataType() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AnnotatedEClassifier basicGetAnnotatedEClassifier() {
    return getAnnotatedEDataType();
  }

  @Override
  public EClassifier basicGetEClassifier() {
    return getEDataType();
  }

} // EDataTypeAnnotation
