/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEEnum.java,v 1.7 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Annotated EEnum</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnum <em>EEnum</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnumAnnotations <em>EEnum Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getAnnotatedEEnumLiterals <em>Annotated EEnum Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnum()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEEnum extends AnnotatedEDataType {
  /**
   * The cached value of the '{@link #getEEnum() <em>EEnum</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getEEnum()
   * @generated
   * @ordered
   */
  protected EEnum eEnum;
  /**
	 * The cached value of the '{@link #getEEnumAnnotations() <em>EEnum Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEEnumAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EEnumAnnotation> eEnumAnnotations;

  /**
	 * The cached value of the '{@link #getAnnotatedEEnumLiterals() <em>Annotated EEnum Literals</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAnnotatedEEnumLiterals()
	 * @generated
	 * @ordered
	 */
  protected EList<AnnotatedEEnumLiteral> annotatedEEnumLiterals;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEEnum() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_EENUM;
	}

  /**
	 * Returns the value of the '<em><b>EEnum</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' reference.
	 * @see #setEEnum(EEnum)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnum_EEnum()
	 * @model required="true"
	 * @generated
	 */
  public EEnum getEEnum() {
		if (eEnum != null && eEnum.eIsProxy()) {
			InternalEObject oldEEnum = (InternalEObject)eEnum;
			eEnum = (EEnum)eResolveProxy(oldEEnum);
			if (eEnum != oldEEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM, oldEEnum, eEnum));
			}
		}
		return eEnum;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum basicGetEEnum() {
		return eEnum;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum#getEEnum <em>EEnum</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnum</em>' reference.
	 * @see #getEEnum()
	 * @generated
	 */
  public void setEEnum(EEnum newEEnum) {
		EEnum oldEEnum = eEnum;
		eEnum = newEEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM, oldEEnum, eEnum));
	}

  /**
	 * Returns the value of the '<em><b>EEnum Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getAnnotatedEEnum <em>Annotated EEnum</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum Annotations</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnum_EEnumAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation#getAnnotatedEEnum
	 * @model opposite="annotatedEEnum" containment="true"
	 * @generated
	 */
  public EList<EEnumAnnotation> getEEnumAnnotations() {
		if (eEnumAnnotations == null) {
			eEnumAnnotations = new EObjectContainmentWithInverseEList<EEnumAnnotation>(EEnumAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS, AnnotationsmodelPackage.EENUM_ANNOTATION__ANNOTATED_EENUM);
		}
		return eEnumAnnotations;
	}

  /**
	 * Returns the value of the '<em><b>Annotated EEnum Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getAnnotatedEEnum <em>Annotated EEnum</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EEnum Literals</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EEnum Literals</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEEnum_AnnotatedEEnumLiterals()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral#getAnnotatedEEnum
	 * @model opposite="annotatedEEnum" containment="true"
	 * @generated
	 */
  public EList<AnnotatedEEnumLiteral> getAnnotatedEEnumLiterals() {
		if (annotatedEEnumLiterals == null) {
			annotatedEEnumLiterals = new EObjectContainmentWithInverseEList<AnnotatedEEnumLiteral>(AnnotatedEEnumLiteral.class, this, AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS, AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__ANNOTATED_EENUM);
		}
		return annotatedEEnumLiterals;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEEnumAnnotations()).basicAdd(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatedEEnumLiterals()).basicAdd(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
				return ((InternalEList<?>)getEEnumAnnotations()).basicRemove(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
				return ((InternalEList<?>)getAnnotatedEEnumLiterals()).basicRemove(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM:
				if (resolve) return getEEnum();
				return basicGetEEnum();
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
				return getEEnumAnnotations();
			case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
				return getAnnotatedEEnumLiterals();
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM:
				setEEnum((EEnum)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
				getEEnumAnnotations().clear();
				getEEnumAnnotations().addAll((Collection<? extends EEnumAnnotation>)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
				getAnnotatedEEnumLiterals().clear();
				getAnnotatedEEnumLiterals().addAll((Collection<? extends AnnotatedEEnumLiteral>)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM:
				setEEnum((EEnum)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
				getEEnumAnnotations().clear();
				return;
			case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
				getAnnotatedEEnumLiterals().clear();
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
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM:
				return eEnum != null;
			case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
				return eEnumAnnotations != null && !eEnumAnnotations.isEmpty();
			case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
				return annotatedEEnumLiterals != null && !annotatedEEnumLiterals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEDataTypeAnnotations());
    annotations.addAll(getEEnumAnnotations());
    return annotations;
  }

} // AnnotatedEEnum
