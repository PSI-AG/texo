/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnumLiteralAnnotation.java,v 1.5 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EEnum Literal Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getEEnumLiteral <em>EEnum Literal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getAnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumLiteralAnnotation()
 * @model kind="class"
 * @generated
 */
public class EEnumLiteralAnnotation extends ENamedElementAnnotation {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EEnumLiteralAnnotation() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.EENUM_LITERAL_ANNOTATION;
	}

  /**
	 * Returns the value of the '<em><b>EEnum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum Literal</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum Literal</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumLiteralAnnotation_EEnumLiteral()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public EEnumLiteral getEEnumLiteral() {
		EEnumLiteral eEnumLiteral = basicGetEEnumLiteral();
		return eEnumLiteral != null && eEnumLiteral.eIsProxy() ? (EEnumLiteral)eResolveProxy((InternalEObject)eEnumLiteral) : eEnumLiteral;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EEnumLiteral basicGetEEnumLiteral() {
    return getAnnotatedEEnumLiteral().getEEnumLiteral();
  }

  /**
	 * Returns the value of the '<em><b>Annotated EEnum Literal</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteralAnnotations <em>EEnum Literal Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EEnum Literal</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EEnum Literal</em>' container reference.
	 * @see #setAnnotatedEEnumLiteral(AnnotatedEEnumLiteral)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getEEnumLiteralAnnotation_AnnotatedEEnumLiteral()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteralAnnotations
	 * @model opposite="eEnumLiteralAnnotations" transient="false"
	 * @generated
	 */
  public AnnotatedEEnumLiteral getAnnotatedEEnumLiteral() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL) return null;
		return (AnnotatedEEnumLiteral)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEEnumLiteral(AnnotatedEEnumLiteral newAnnotatedEEnumLiteral,
      NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEEnumLiteral, AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getAnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EEnum Literal</em>' container reference.
	 * @see #getAnnotatedEEnumLiteral()
	 * @generated
	 */
  public void setAnnotatedEEnumLiteral(AnnotatedEEnumLiteral newAnnotatedEEnumLiteral) {
		if (newAnnotatedEEnumLiteral != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL && newAnnotatedEEnumLiteral != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEEnumLiteral))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEEnumLiteral != null)
				msgs = ((InternalEObject)newAnnotatedEEnumLiteral).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS, AnnotatedEEnumLiteral.class, msgs);
			msgs = basicSetAnnotatedEEnumLiteral(newAnnotatedEEnumLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL, newAnnotatedEEnumLiteral, newAnnotatedEEnumLiteral));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedEEnumLiteral((AnnotatedEEnumLiteral)otherEnd, msgs);
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
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				return basicSetAnnotatedEEnumLiteral(null, msgs);
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
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS, AnnotatedEEnumLiteral.class, msgs);
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
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__EENUM_LITERAL:
				if (resolve) return getEEnumLiteral();
				return basicGetEEnumLiteral();
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				return getAnnotatedEEnumLiteral();
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
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				setAnnotatedEEnumLiteral((AnnotatedEEnumLiteral)newValue);
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
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				setAnnotatedEEnumLiteral((AnnotatedEEnumLiteral)null);
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
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__EENUM_LITERAL:
				return basicGetEEnumLiteral() != null;
			case AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL:
				return getAnnotatedEEnumLiteral() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public ENamedElement basicGetENamedElement() {
    return getEEnumLiteral();
  }

} // EEnumLiteralAnnotation
