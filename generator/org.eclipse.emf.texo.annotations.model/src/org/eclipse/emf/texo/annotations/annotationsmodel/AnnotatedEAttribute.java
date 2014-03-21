/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEAttribute.java,v 1.7 2011/09/23 21:00:23 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated EAttribute</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttribute <em>EAttribute</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttributeAnnotations <em>EAttribute Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEAttribute()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEAttribute extends AnnotatedEStructuralFeature {
  /**
	 * The cached value of the '{@link #getEAttribute() <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getEAttribute()
	 * @generated
	 * @ordered
	 */
  protected EAttribute eAttribute;

  /**
	 * The cached value of the '{@link #getEAttributeAnnotations() <em>EAttribute Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEAttributeAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EAttributeAnnotation> eAttributeAnnotations;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEAttribute() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_EATTRIBUTE;
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
	 * @see #setEAttribute(EAttribute)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEAttribute_EAttribute()
	 * @model required="true"
	 * @generated
	 */
  public EAttribute getEAttribute() {
		if (eAttribute != null && eAttribute.eIsProxy()) {
			InternalEObject oldEAttribute = (InternalEObject)eAttribute;
			eAttribute = (EAttribute)eResolveProxy(oldEAttribute);
			if (eAttribute != oldEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE, oldEAttribute, eAttribute));
			}
		}
		return eAttribute;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute basicGetEAttribute() {
		return eAttribute;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute#getEAttribute <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 * @generated
	 */
  public void setEAttribute(EAttribute newEAttribute) {
		EAttribute oldEAttribute = eAttribute;
		eAttribute = newEAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE, oldEAttribute, eAttribute));
	}

  /**
	 * Returns the value of the '<em><b>EAttribute Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getAnnotatedEAttribute <em>Annotated EAttribute</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAttribute Annotations</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEAttribute_EAttributeAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation#getAnnotatedEAttribute
	 * @model opposite="annotatedEAttribute" containment="true"
	 * @generated
	 */
  public EList<EAttributeAnnotation> getEAttributeAnnotations() {
		if (eAttributeAnnotations == null) {
			eAttributeAnnotations = new EObjectContainmentWithInverseEList<EAttributeAnnotation>(EAttributeAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS, AnnotationsmodelPackage.EATTRIBUTE_ANNOTATION__ANNOTATED_EATTRIBUTE);
		}
		return eAttributeAnnotations;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEAttributeAnnotations()).basicAdd(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
				return ((InternalEList<?>)getEAttributeAnnotations()).basicRemove(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE:
				if (resolve) return getEAttribute();
				return basicGetEAttribute();
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
				return getEAttributeAnnotations();
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
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE:
				setEAttribute((EAttribute)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
				getEAttributeAnnotations().clear();
				getEAttributeAnnotations().addAll((Collection<? extends EAttributeAnnotation>)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE:
				setEAttribute((EAttribute)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
				getEAttributeAnnotations().clear();
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
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE:
				return eAttribute != null;
			case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
				return eAttributeAnnotations != null && !eAttributeAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  @Override
  public EStructuralFeature basicGetEStructuralFeature() {
    return getEAttribute();
  }

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEAttributeAnnotations());
    return annotations;
  }

} // AnnotatedEAttribute
