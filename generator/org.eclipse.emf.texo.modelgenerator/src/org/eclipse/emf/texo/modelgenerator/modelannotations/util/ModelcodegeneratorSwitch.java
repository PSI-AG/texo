/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelcodegeneratorSwitch.java,v 1.16 2011/09/23 11:03:00 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage
 * @generated
 */
public class ModelcodegeneratorSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static ModelcodegeneratorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModelcodegeneratorSwitch() {
    if (modelPackage == null) {
      modelPackage = ModelcodegeneratorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generatedNOT
   */
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
    case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION: {
      EPackageModelGenAnnotation ePackageModelGenAnnotation = (EPackageModelGenAnnotation) theEObject;
      T result = caseEPackageModelGenAnnotation(ePackageModelGenAnnotation);
      if (result == null) {
        result = caseEPackageAnnotation(ePackageModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(ePackageModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(ePackageModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION: {
      ENamedElementModelGenAnnotation eNamedElementModelGenAnnotation = (ENamedElementModelGenAnnotation) theEObject;
      T result = caseENamedElementModelGenAnnotation(eNamedElementModelGenAnnotation);
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.ECLASSIFIER_MODEL_GEN_ANNOTATION: {
      EClassifierModelGenAnnotation eClassifierModelGenAnnotation = (EClassifierModelGenAnnotation) theEObject;
      T result = caseEClassifierModelGenAnnotation(eClassifierModelGenAnnotation);
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eClassifierModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION: {
      EClassModelGenAnnotation eClassModelGenAnnotation = (EClassModelGenAnnotation) theEObject;
      T result = caseEClassModelGenAnnotation(eClassModelGenAnnotation);
      if (result == null) {
        result = caseEClassAnnotation(eClassModelGenAnnotation);
      }
      if (result == null) {
        result = caseEClassifierModelGenAnnotation(eClassModelGenAnnotation);
      }
      if (result == null) {
        result = caseEClassifierAnnotation(eClassModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eClassModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eClassModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION: {
      EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation = (EStructuralFeatureModelGenAnnotation) theEObject;
      T result = caseEStructuralFeatureModelGenAnnotation(eStructuralFeatureModelGenAnnotation);
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eStructuralFeatureModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION: {
      EAttributeModelGenAnnotation eAttributeModelGenAnnotation = (EAttributeModelGenAnnotation) theEObject;
      T result = caseEAttributeModelGenAnnotation(eAttributeModelGenAnnotation);
      if (result == null) {
        result = caseEAttributeAnnotation(eAttributeModelGenAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureModelGenAnnotation(eAttributeModelGenAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureAnnotation(eAttributeModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eAttributeModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eAttributeModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION: {
      EReferenceModelGenAnnotation eReferenceModelGenAnnotation = (EReferenceModelGenAnnotation) theEObject;
      T result = caseEReferenceModelGenAnnotation(eReferenceModelGenAnnotation);
      if (result == null) {
        result = caseEReferenceAnnotation(eReferenceModelGenAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureModelGenAnnotation(eReferenceModelGenAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureAnnotation(eReferenceModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eReferenceModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eReferenceModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION: {
      EEnumModelGenAnnotation eEnumModelGenAnnotation = (EEnumModelGenAnnotation) theEObject;
      T result = caseEEnumModelGenAnnotation(eEnumModelGenAnnotation);
      if (result == null) {
        result = caseEEnumAnnotation(eEnumModelGenAnnotation);
      }
      if (result == null) {
        result = caseEDataTypeModelGenAnnotationDefinition(eEnumModelGenAnnotation);
      }
      if (result == null) {
        result = caseEClassifierModelGenAnnotation(eEnumModelGenAnnotation);
      }
      if (result == null) {
        result = caseEClassifierAnnotation(eEnumModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eEnumModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eEnumModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION: {
      EDataTypeModelGenAnnotation eDataTypeModelGenAnnotation = (EDataTypeModelGenAnnotation) theEObject;
      T result = caseEDataTypeModelGenAnnotation(eDataTypeModelGenAnnotation);
      if (result == null) {
        result = caseEDataTypeModelGenAnnotationDefinition(eDataTypeModelGenAnnotation);
      }
      if (result == null) {
        result = caseEDataTypeAnnotation(eDataTypeModelGenAnnotation);
      }
      if (result == null) {
        result = caseEClassifierAnnotation(eDataTypeModelGenAnnotation);
      }
      if (result == null) {
        result = caseEClassifierModelGenAnnotation(eDataTypeModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eDataTypeModelGenAnnotation);
      }
      if (result == null) {
        result = caseENamedElementModelGenAnnotation(eDataTypeModelGenAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPackage Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackageModelGenAnnotation(EPackageModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Element Model Gen Annotation</em>'.
   * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Element Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedElementModelGenAnnotation(ENamedElementModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClassifier Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClassifier Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassifierModelGenAnnotation(EClassifierModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassModelGenAnnotation(EClassModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EData Type Model Gen Annotation Definition</em>'.
   * <!-- begin-user-doc --> This implementation returns null;
   * returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EData Type Model Gen Annotation Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDataTypeModelGenAnnotationDefinition(EDataTypeModelGenAnnotationDefinition object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Model Gen Annotation</em>'.
   * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EStructural Feature Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEStructuralFeatureModelGenAnnotation(EStructuralFeatureModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributeModelGenAnnotation(EAttributeModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferenceModelGenAnnotation(EReferenceModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EEnum Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EEnum Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEEnumModelGenAnnotation(EEnumModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EData Type Model Gen Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EData Type Model Gen Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDataTypeModelGenAnnotation(EDataTypeModelGenAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Finder Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Finder Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoFinderDefinition(DaoFinderDefinition object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Element Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Element Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedElementAnnotation(ENamedElementAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPackage Annotation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackageAnnotation(EPackageAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClassifier Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClassifier Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassifierAnnotation(EClassifierAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass Annotation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassAnnotation(EClassAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EData Type Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EData Type Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDataTypeAnnotation(EDataTypeAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EStructural Feature Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEStructuralFeatureAnnotation(EStructuralFeatureAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributeAnnotation(EAttributeAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferenceAnnotation(EReferenceAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EEnum Annotation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EEnum Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEEnumAnnotation(EEnumAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} // ModelcodegeneratorSwitch
