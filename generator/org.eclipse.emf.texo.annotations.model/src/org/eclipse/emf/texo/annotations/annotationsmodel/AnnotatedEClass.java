/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEClass.java,v 1.6 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Annotated EClass</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClass <em>EClass</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClassAnnotations <em>EClass
 * Annotations</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getAnnotatedEStructuralFeatures <em>
 * Annotated EStructural Features</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClass()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEClass extends AnnotatedEClassifier {
  /**
   * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getEClass()
   * @generated
   * @ordered
   */
  protected EClass eClass;

  /**
	 * The cached value of the '{@link #getEClassAnnotations() <em>EClass Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEClassAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EClassAnnotation> eClassAnnotations;

  /**
	 * The cached value of the '{@link #getAnnotatedEStructuralFeatures() <em>Annotated EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAnnotatedEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
  protected EList<AnnotatedEStructuralFeature> annotatedEStructuralFeatures;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEClass() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS;
	}

  /**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClass_EClass()
	 * @model required="true"
	 * @generated
	 */
  public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EClass basicGetEClass() {
		return eClass;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
  public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS, oldEClass, eClass));
	}

  /**
	 * Returns the value of the '<em><b>EClass Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getAnnotatedEClass <em>Annotated EClass</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass Annotations</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClass_EClassAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation#getAnnotatedEClass
	 * @model opposite="annotatedEClass" containment="true"
	 * @generated
	 */
  public EList<EClassAnnotation> getEClassAnnotations() {
		if (eClassAnnotations == null) {
			eClassAnnotations = new EObjectContainmentWithInverseEList<EClassAnnotation>(EClassAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS, AnnotationsmodelPackage.ECLASS_ANNOTATION__ANNOTATED_ECLASS);
		}
		return eClassAnnotations;
	}

  /**
	 * Returns the value of the '<em><b>Annotated EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getAnnotatedEClass <em>Annotated EClass</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EStructural Features</em>' containment reference list isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EStructural Features</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEClass_AnnotatedEStructuralFeatures()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature#getAnnotatedEClass
	 * @model opposite="annotatedEClass" containment="true"
	 * @generated
	 */
  public EList<AnnotatedEStructuralFeature> getAnnotatedEStructuralFeatures() {
		if (annotatedEStructuralFeatures == null) {
			annotatedEStructuralFeatures = new EObjectContainmentWithInverseEList<AnnotatedEStructuralFeature>(AnnotatedEStructuralFeature.class, this, AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES, AnnotationsmodelPackage.ANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ECLASS);
		}
		return annotatedEStructuralFeatures;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEClassAnnotations()).basicAdd(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatedEStructuralFeatures()).basicAdd(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
				return ((InternalEList<?>)getEClassAnnotations()).basicRemove(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
				return ((InternalEList<?>)getAnnotatedEStructuralFeatures()).basicRemove(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
				return getEClassAnnotations();
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
				return getAnnotatedEStructuralFeatures();
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS:
				setEClass((EClass)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
				getEClassAnnotations().clear();
				getEClassAnnotations().addAll((Collection<? extends EClassAnnotation>)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
				getAnnotatedEStructuralFeatures().clear();
				getAnnotatedEStructuralFeatures().addAll((Collection<? extends AnnotatedEStructuralFeature>)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS:
				setEClass((EClass)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
				getEClassAnnotations().clear();
				return;
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
				getAnnotatedEStructuralFeatures().clear();
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
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS:
				return eClass != null;
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
				return eClassAnnotations != null && !eClassAnnotations.isEmpty();
			case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
				return annotatedEStructuralFeatures != null && !annotatedEStructuralFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  // ++++++++++++++++++++++++ Custom Part +++++++++++++++++++++++++++++++++
  @Override
  public EClassifier basicGetEClassifier() {
    return getEClass();
  }

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEClassAnnotations());
    return annotations;
  }
} // AnnotatedEClass
