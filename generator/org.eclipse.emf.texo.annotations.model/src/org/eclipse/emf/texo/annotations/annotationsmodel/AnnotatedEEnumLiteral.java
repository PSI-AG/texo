/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEEnumLiteral.java,v 1.5 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated EEnum Literal</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteral <em>EEnum Literal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteralAnnotations <em>EEnum Literal Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getAnnotatedEEnum <em>Annotated EEnum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnumLiteral()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEEnumLiteral extends AnnotatedENamedElement {
  /**
	 * The cached value of the '{@link #getEEnumLiteral() <em>EEnum Literal</em>}' reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getEEnumLiteral()
	 * @generated
	 * @ordered
	 */
  protected EEnumLiteral eEnumLiteral;

  /**
	 * The cached value of the '{@link #getEEnumLiteralAnnotations() <em>EEnum Literal Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEEnumLiteralAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EEnumLiteralAnnotation> eEnumLiteralAnnotations;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEEnumLiteral() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_EENUM_LITERAL;
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
	 * @see #setEEnumLiteral(EEnumLiteral)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnumLiteral_EEnumLiteral()
	 * @model required="true"
	 * @generated
	 */
  public EEnumLiteral getEEnumLiteral() {
		if (eEnumLiteral != null && eEnumLiteral.eIsProxy()) {
			InternalEObject oldEEnumLiteral = (InternalEObject)eEnumLiteral;
			eEnumLiteral = (EEnumLiteral)eResolveProxy(oldEEnumLiteral);
			if (eEnumLiteral != oldEEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL, oldEEnumLiteral, eEnumLiteral));
			}
		}
		return eEnumLiteral;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EEnumLiteral basicGetEEnumLiteral() {
		return eEnumLiteral;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getEEnumLiteral <em>EEnum Literal</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnum Literal</em>' reference.
	 * @see #getEEnumLiteral()
	 * @generated
	 */
  public void setEEnumLiteral(EEnumLiteral newEEnumLiteral) {
		EEnumLiteral oldEEnumLiteral = eEnumLiteral;
		eEnumLiteral = newEEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL, oldEEnumLiteral, eEnumLiteral));
	}

  /**
	 * Returns the value of the '<em><b>EEnum Literal Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getAnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}'.
	 * <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>EEnum Literal Annotations</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum Literal Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnumLiteral_EEnumLiteralAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation#getAnnotatedEEnumLiteral
	 * @model opposite="annotatedEEnumLiteral" containment="true"
	 * @generated
	 */
  public EList<EEnumLiteralAnnotation> getEEnumLiteralAnnotations() {
		if (eEnumLiteralAnnotations == null) {
			eEnumLiteralAnnotations = new EObjectContainmentWithInverseEList<EEnumLiteralAnnotation>(EEnumLiteralAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS, AnnotationsmodelPackage.EENUM_LITERAL_ANNOTATION__ANNOTATED_EENUM_LITERAL);
		}
		return eEnumLiteralAnnotations;
	}

  /**
	 * Returns the value of the '<em><b>Annotated EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getAnnotatedEEnumLiterals <em>Annotated EEnum Literals</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EEnum</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EEnum</em>' container reference.
	 * @see #setAnnotatedEEnum(AnnotatedEEnum)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnumLiteral_AnnotatedEEnum()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getAnnotatedEEnumLiterals
	 * @model opposite="annotatedEEnumLiterals" transient="false"
	 * @generated
	 */
  public AnnotatedEEnum getAnnotatedEEnum() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM) return null;
		return (AnnotatedEEnum)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedEEnum(AnnotatedEEnum newAnnotatedEEnum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedEEnum, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getAnnotatedEEnum <em>Annotated EEnum</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EEnum</em>' container reference.
	 * @see #getAnnotatedEEnum()
	 * @generated
	 */
  public void setAnnotatedEEnum(AnnotatedEEnum newAnnotatedEEnum) {
		if (newAnnotatedEEnum != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM && newAnnotatedEEnum != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedEEnum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedEEnum != null)
				msgs = ((InternalEObject)newAnnotatedEEnum).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS, AnnotatedEEnum.class, msgs);
			msgs = basicSetAnnotatedEEnum(newAnnotatedEEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM, newAnnotatedEEnum, newAnnotatedEEnum));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEEnumLiteralAnnotations()).basicAdd(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
				return ((InternalEList<?>)getEEnumLiteralAnnotations()).basicRemove(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS, AnnotatedEEnum.class, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL:
				if (resolve) return getEEnumLiteral();
				return basicGetEEnumLiteral();
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
				return getEEnumLiteralAnnotations();
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
				return getAnnotatedEEnum();
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL:
				setEEnumLiteral((EEnumLiteral)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
				getEEnumLiteralAnnotations().clear();
				getEEnumLiteralAnnotations().addAll((Collection<? extends EEnumLiteralAnnotation>)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL:
				setEEnumLiteral((EEnumLiteral)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
				getEEnumLiteralAnnotations().clear();
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL:
				return eEnumLiteral != null;
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
				return eEnumLiteralAnnotations != null && !eEnumLiteralAnnotations.isEmpty();
			case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM:
				return getAnnotatedEEnum() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public ENamedElement basicGetENamedElement() {
    return getEEnumLiteral();
  }

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEEnumLiteralAnnotations());
    return annotations;
  }

} // AnnotatedEEnumLiteral
