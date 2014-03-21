/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedENamedElement.java,v 1.5 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Annotated ENamed Element</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement#getENamedElement <em>ENamed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedENamedElement()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class AnnotatedENamedElement extends EObjectImpl implements EObject {
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected AnnotatedENamedElement() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AnnotationsmodelPackage.Literals.ANNOTATED_ENAMED_ELEMENT;
	}

  /**
	 * Returns the value of the '<em><b>ENamed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ENamed Element</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>ENamed Element</em>' reference.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getAnnotatedENamedElement_ENamedElement()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
  public ENamedElement getENamedElement() {
		ENamedElement eNamedElement = basicGetENamedElement();
		return eNamedElement != null && eNamedElement.eIsProxy() ? (ENamedElement)eResolveProxy((InternalEObject)eNamedElement) : eNamedElement;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public abstract ENamedElement basicGetENamedElement();

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT:
				if (resolve) return getENamedElement();
				return basicGetENamedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnnotationsmodelPackage.ANNOTATED_ENAMED_ELEMENT__ENAMED_ELEMENT:
				return basicGetENamedElement() != null;
		}
		return super.eIsSet(featureID);
	}

  public abstract List<ENamedElementAnnotation> getAllAnnotations();

} // AnnotatedENamedElement
