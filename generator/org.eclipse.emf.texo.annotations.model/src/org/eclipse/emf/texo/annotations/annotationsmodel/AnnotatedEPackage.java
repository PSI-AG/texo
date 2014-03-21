/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEPackage.java,v 1.6 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Annotated EPackage</b></em> '. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackage <em>EPackage</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackageAnnotations <em>EPackage
 * Annotations</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedEClassifiers <em>Annotated
 * EClassifiers</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedModel <em>Annotated Model
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage()
 * @model kind="class"
 * @generated
 */
public class AnnotatedEPackage extends AnnotatedENamedElement {
  /**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
  protected EPackage ePackage;

  /**
	 * The cached value of the '{@link #getEPackageAnnotations() <em>EPackage Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEPackageAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<EPackageAnnotation> ePackageAnnotations;

  /**
	 * The cached value of the '{@link #getAnnotatedEClassifiers() <em>Annotated EClassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAnnotatedEClassifiers()
	 * @generated
	 * @ordered
	 */
  protected EList<AnnotatedEClassifier> annotatedEClassifiers;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedEPackage() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_EPACKAGE;
	}

  /**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EPackage</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage_EPackage()
	 * @model required="true"
	 * @generated
	 */
  public EPackage getEPackage() {
		if (ePackage != null && ePackage.eIsProxy()) {
			InternalEObject oldEPackage = (InternalEObject)ePackage;
			ePackage = (EPackage)eResolveProxy(oldEPackage);
			if (ePackage != oldEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE, oldEPackage, ePackage));
			}
		}
		return ePackage;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EPackage basicGetEPackage() {
		return ePackage;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
  public void setEPackage(EPackage newEPackage) {
		EPackage oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE, oldEPackage, ePackage));
	}

  /**
	 * Returns the value of the '<em><b>EPackage Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getAnnotatedEPackage <em>Annotated EPackage</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EPackage Annotations</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage Annotations</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage_EPackageAnnotations()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation#getAnnotatedEPackage
	 * @model opposite="annotatedEPackage" containment="true"
	 * @generated
	 */
  public EList<EPackageAnnotation> getEPackageAnnotations() {
		if (ePackageAnnotations == null) {
			ePackageAnnotations = new EObjectContainmentWithInverseEList<EPackageAnnotation>(EPackageAnnotation.class, this, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS, AnnotationsmodelPackage.EPACKAGE_ANNOTATION__ANNOTATED_EPACKAGE);
		}
		return ePackageAnnotations;
	}

  /**
	 * Returns the value of the '<em><b>Annotated EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getAnnotatedEPackage <em>Annotated EPackage</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EClassifiers</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EClassifiers</em>' containment reference list.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage_AnnotatedEClassifiers()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier#getAnnotatedEPackage
	 * @model opposite="annotatedEPackage" containment="true"
	 * @generated
	 */
  public EList<AnnotatedEClassifier> getAnnotatedEClassifiers() {
		if (annotatedEClassifiers == null) {
			annotatedEClassifiers = new EObjectContainmentWithInverseEList<AnnotatedEClassifier>(AnnotatedEClassifier.class, this, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS, AnnotationsmodelPackage.ANNOTATED_ECLASSIFIER__ANNOTATED_EPACKAGE);
		}
		return annotatedEClassifiers;
	}

  /**
	 * Returns the value of the '<em><b>Annotated Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel#getAnnotatedEPackages <em>Annotated EPackages</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated Model</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Model</em>' container reference.
	 * @see #setAnnotatedModel(AnnotatedModel)
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedEPackage_AnnotatedModel()
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel#getAnnotatedEPackages
	 * @model opposite="annotatedEPackages" required="true" transient="false"
	 * @generated
	 */
  public AnnotatedModel getAnnotatedModel() {
		if (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL) return null;
		return (AnnotatedModel)eContainer();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotatedModel(AnnotatedModel newAnnotatedModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotatedModel, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL, msgs);
		return msgs;
	}

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage#getAnnotatedModel <em>Annotated Model</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Model</em>' container reference.
	 * @see #getAnnotatedModel()
	 * @generated
	 */
  public void setAnnotatedModel(AnnotatedModel newAnnotatedModel) {
		if (newAnnotatedModel != eInternalContainer() || (eContainerFeatureID() != AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL && newAnnotatedModel != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedModel != null)
				msgs = ((InternalEObject)newAnnotatedModel).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_MODEL__ANNOTATED_EPACKAGES, AnnotatedModel.class, msgs);
			msgs = basicSetAnnotatedModel(newAnnotatedModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL, newAnnotatedModel, newAnnotatedModel));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEPackageAnnotations()).basicAdd(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatedEClassifiers()).basicAdd(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotatedModel((AnnotatedModel)otherEnd, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS:
				return ((InternalEList<?>)getEPackageAnnotations()).basicRemove(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS:
				return ((InternalEList<?>)getAnnotatedEClassifiers()).basicRemove(otherEnd, msgs);
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				return basicSetAnnotatedModel(null, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_MODEL__ANNOTATED_EPACKAGES, AnnotatedModel.class, msgs);
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
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE:
				if (resolve) return getEPackage();
				return basicGetEPackage();
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS:
				return getEPackageAnnotations();
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS:
				return getAnnotatedEClassifiers();
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				return getAnnotatedModel();
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
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE:
				setEPackage((EPackage)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS:
				getEPackageAnnotations().clear();
				getEPackageAnnotations().addAll((Collection<? extends EPackageAnnotation>)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS:
				getAnnotatedEClassifiers().clear();
				getAnnotatedEClassifiers().addAll((Collection<? extends AnnotatedEClassifier>)newValue);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				setAnnotatedModel((AnnotatedModel)newValue);
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
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE:
				setEPackage((EPackage)null);
				return;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS:
				getEPackageAnnotations().clear();
				return;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS:
				getAnnotatedEClassifiers().clear();
				return;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				setAnnotatedModel((AnnotatedModel)null);
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
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE:
				return ePackage != null;
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__EPACKAGE_ANNOTATIONS:
				return ePackageAnnotations != null && !ePackageAnnotations.isEmpty();
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_ECLASSIFIERS:
				return annotatedEClassifiers != null && !annotatedEClassifiers.isEmpty();
			case AnnotationsmodelPackage.ANNOTATED_EPACKAGE__ANNOTATED_MODEL:
				return getAnnotatedModel() != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public ENamedElement basicGetENamedElement() {
    return getEPackage();
  }

  @Override
  public List<ENamedElementAnnotation> getAllAnnotations() {
    final List<ENamedElementAnnotation> annotations = new ArrayList<ENamedElementAnnotation>();
    annotations.addAll(getEPackageAnnotations());
    return annotations;
  }

} // AnnotatedEPackage
