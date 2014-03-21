/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEDataType.java,v 1.6 2011/09/21 09:37:39 mtaal Exp $
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated EData Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataType <em>EData Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations <em>EData Type Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEDataType()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEDataType extends AnnotatedEClassifier {
  /**
	 * The cached value of the '{@link #getEDataType() <em>EData Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getEDataType()
	 * @generated
	 * @ordered
	 */
  protected EDataType eDataType;

  /**
	 * The cached value of the '{@link #getEDataTypeAnnotations() <em>EData Type Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEDataTypeAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EDataTypeAnnotation> eDataTypeAnnotations;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEDataType() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_EDATA_TYPE;
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
	 * @see #setEDataType(EDataType)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEDataType_EDataType()
	 * @model required="true"
	 * @generated
	 */
  public EDataType getEDataType() {
		if (eDataType != null && eDataType.eIsProxy()) {
			InternalEObject oldEDataType = (InternalEObject)eDataType;
			eDataType = (EDataType)eResolveProxy(oldEDataType);
			if (eDataType != oldEDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE, oldEDataType, eDataType));
			}
		}
		return eDataType;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType basicGetEDataType() {
		return eDataType;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataType <em>EData Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EData Type</em>' reference.
	 * @see #getEDataType()
	 * @generated
	 */
  public void setEDataType(EDataType newEDataType) {
		EDataType oldEDataType = eDataType;
		eDataType = newEDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE, oldEDataType, eDataType));
	}

  /**
	 * Returns the value of the '<em><b>EData Type Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getAnnotatedEDataType <em>Annotated EData Type</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EData Type Annotations</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EData Type Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEDataType_EDataTypeAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation#getAnnotatedEDataType
	 * @model opposite="annotatedEDataType" containment="true"
	 * @generated
	 */
  public EList<EDataTypeAnnotation> getEDataTypeAnnotations() {
		if (eDataTypeAnnotations == null) {
			eDataTypeAnnotations = new EObjectContainmentWithInverseEList<EDataTypeAnnotation>(EDataTypeAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE);
		}
		return eDataTypeAnnotations;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEDataTypeAnnotations()).basicAdd(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS:
				return ((InternalEList<?>)getEDataTypeAnnotations()).basicRemove(otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE:
				if (resolve) return getEDataType();
				return basicGetEDataType();
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS:
				return getEDataTypeAnnotations();
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
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE:
				setEDataType((EDataType)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS:
				getEDataTypeAnnotations().clear();
				getEDataTypeAnnotations().addAll((Collection<? extends EDataTypeAnnotation>)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE:
				setEDataType((EDataType)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS:
				getEDataTypeAnnotations().clear();
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
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE:
				return eDataType != null;
			case AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS:
				return eDataTypeAnnotations != null && !eDataTypeAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  @Override
  public EClassifier basicGetEClassifier() {
    return getEDataType();
  }

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEDataTypeAnnotations());
    return annotations;
  }

} // AnnotatedEDataType
