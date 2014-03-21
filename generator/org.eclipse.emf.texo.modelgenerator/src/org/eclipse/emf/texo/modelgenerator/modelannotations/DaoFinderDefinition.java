/**
 * <copyright>
 * </copyright>
 *
 * $Id: DaoFinderDefinition.java,v 1.1 2011/09/23 11:03:00 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dao Finder Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition#getFindPart <em>Find Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getDaoFinderDefinition()
 * @model kind="class"
 * @generated
 */
public class DaoFinderDefinition extends EObjectImpl implements EObject {
  /**
   * The cached value of the '{@link #getFindPart() <em>Find Part</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindPart()
   * @generated
   * @ordered
   */
  protected EList<EStructuralFeatureModelGenAnnotation> findPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaoFinderDefinition() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelcodegeneratorPackage.Literals.DAO_FINDER_DEFINITION;
  }

  /**
   * Returns the value of the '<em><b>Find Part</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Find Part</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Find Part</em>' reference list.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getDaoFinderDefinition_FindPart()
   * @model
   * @generated
   */
  public EList<EStructuralFeatureModelGenAnnotation> getFindPart() {
    if (findPart == null) {
      findPart = new EObjectResolvingEList<EStructuralFeatureModelGenAnnotation>(EStructuralFeatureModelGenAnnotation.class, this, ModelcodegeneratorPackage.DAO_FINDER_DEFINITION__FIND_PART);
    }
    return findPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelcodegeneratorPackage.DAO_FINDER_DEFINITION__FIND_PART:
        return getFindPart();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ModelcodegeneratorPackage.DAO_FINDER_DEFINITION__FIND_PART:
        getFindPart().clear();
        getFindPart().addAll((Collection<? extends EStructuralFeatureModelGenAnnotation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case ModelcodegeneratorPackage.DAO_FINDER_DEFINITION__FIND_PART:
        getFindPart().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case ModelcodegeneratorPackage.DAO_FINDER_DEFINITION__FIND_PART:
        return findPart != null && !findPart.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // DaoFinderDefinition
