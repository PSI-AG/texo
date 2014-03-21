/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmannotationsSwitch.java,v 1.5 2011/09/23 21:00:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.util;

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
import org.eclipse.emf.texo.orm.ormannotations.*;
import org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition;
import org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage
 * @generated
 */
public class OrmannotationsSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static OrmannotationsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmannotationsSwitch() {
    if (modelPackage == null) {
      modelPackage = OrmannotationsPackage.eINSTANCE;
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
    case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION: {
      EPackageORMAnnotation ePackageORMAnnotation = (EPackageORMAnnotation) theEObject;
      T result = caseEPackageORMAnnotation(ePackageORMAnnotation);
      if (result == null) {
        result = caseEPackageAnnotation(ePackageORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(ePackageORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(ePackageORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION: {
      ETypeElementORMAnnotation eTypeElementORMAnnotation = (ETypeElementORMAnnotation) theEObject;
      T result = caseETypeElementORMAnnotation(eTypeElementORMAnnotation);
      if (result == null) {
        result = caseENamedElementORMAnnotation(eTypeElementORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.ECLASSIFIER_ORM_ANNOTATION: {
      EClassifierORMAnnotation eClassifierORMAnnotation = (EClassifierORMAnnotation) theEObject;
      T result = caseEClassifierORMAnnotation(eClassifierORMAnnotation);
      if (result == null) {
        result = caseETypeElementORMAnnotation(eClassifierORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eClassifierORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.ECLASS_ORM_ANNOTATION: {
      EClassORMAnnotation eClassORMAnnotation = (EClassORMAnnotation) theEObject;
      T result = caseEClassORMAnnotation(eClassORMAnnotation);
      if (result == null) {
        result = caseEClassAnnotation(eClassORMAnnotation);
      }
      if (result == null) {
        result = caseEClassifierORMAnnotation(eClassORMAnnotation);
      }
      if (result == null) {
        result = caseEClassifierAnnotation(eClassORMAnnotation);
      }
      if (result == null) {
        result = caseETypeElementORMAnnotation(eClassORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eClassORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eClassORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION_DEFINITION: {
      EDataTypeORMAnnotationDefinition eDataTypeORMAnnotationDefinition = (EDataTypeORMAnnotationDefinition) theEObject;
      T result = caseEDataTypeORMAnnotationDefinition(eDataTypeORMAnnotationDefinition);
      // if (result == null) result = caseEDataTypeAnnotation(eDataTypeORMAnnotationDefinition);
      if (result == null) {
        result = caseEClassifierORMAnnotation(eDataTypeORMAnnotationDefinition);
      }
      // if (result == null) result = caseEClassifierAnnotation(eDataTypeORMAnnotationDefinition);
      if (result == null) {
        result = caseETypeElementORMAnnotation(eDataTypeORMAnnotationDefinition);
      }
      // if (result == null) result = caseENamedElementAnnotation(eDataTypeORMAnnotationDefinition);
      if (result == null) {
        result = caseENamedElementORMAnnotation(eDataTypeORMAnnotationDefinition);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION: {
      EStructuralFeatureORMAnnotation eStructuralFeatureORMAnnotation = (EStructuralFeatureORMAnnotation) theEObject;
      T result = caseEStructuralFeatureORMAnnotation(eStructuralFeatureORMAnnotation);
      if (result == null) {
        result = caseETypeElementORMAnnotation(eStructuralFeatureORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eStructuralFeatureORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION: {
      EAttributeORMAnnotation eAttributeORMAnnotation = (EAttributeORMAnnotation) theEObject;
      T result = caseEAttributeORMAnnotation(eAttributeORMAnnotation);
      if (result == null) {
        result = caseEAttributeAnnotation(eAttributeORMAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureORMAnnotation(eAttributeORMAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureAnnotation(eAttributeORMAnnotation);
      }
      if (result == null) {
        result = caseETypeElementORMAnnotation(eAttributeORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eAttributeORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eAttributeORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION: {
      EReferenceORMAnnotation eReferenceORMAnnotation = (EReferenceORMAnnotation) theEObject;
      T result = caseEReferenceORMAnnotation(eReferenceORMAnnotation);
      if (result == null) {
        result = caseEReferenceAnnotation(eReferenceORMAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureORMAnnotation(eReferenceORMAnnotation);
      }
      if (result == null) {
        result = caseEStructuralFeatureAnnotation(eReferenceORMAnnotation);
      }
      if (result == null) {
        result = caseETypeElementORMAnnotation(eReferenceORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eReferenceORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eReferenceORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.EENUM_ORM_ANNOTATION: {
      EEnumORMAnnotation eEnumORMAnnotation = (EEnumORMAnnotation) theEObject;
      T result = caseEEnumORMAnnotation(eEnumORMAnnotation);
      if (result == null) {
        result = caseEEnumAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = caseEDataTypeORMAnnotationDefinition(eEnumORMAnnotation);
      }
      if (result == null) {
        // result = caseEDataTypeAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = caseEClassifierORMAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = caseEClassifierAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = caseETypeElementORMAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eEnumORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION: {
      EDataTypeORMAnnotation eDataTypeORMAnnotation = (EDataTypeORMAnnotation) theEObject;
      T result = caseEDataTypeORMAnnotation(eDataTypeORMAnnotation);
      if (result == null) {
        result = caseEDataTypeORMAnnotationDefinition(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = caseEDataTypeAnnotation(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = caseEClassifierAnnotation(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = caseEClassifierORMAnnotation(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementAnnotation(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = caseETypeElementORMAnnotation(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = caseENamedElementORMAnnotation(eDataTypeORMAnnotation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case OrmannotationsPackage.ENAMED_ELEMENT_ORM_ANNOTATION: {
      ENamedElementORMAnnotation eNamedElementORMAnnotation = (ENamedElementORMAnnotation) theEObject;
      T result = caseENamedElementORMAnnotation(eNamedElementORMAnnotation);
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
   * Returns the result of interpreting the object as an instance of '<em>EPackage ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackageORMAnnotation(EPackageORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EType Element ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EType Element ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETypeElementORMAnnotation(ETypeElementORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClassifier ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClassifier ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassifierORMAnnotation(EClassifierORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassORMAnnotation(EClassORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EData Type ORM Annotation Definition</em>'.
   * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EData Type ORM Annotation Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDataTypeORMAnnotationDefinition(EDataTypeORMAnnotationDefinition object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EStructural Feature ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EStructural Feature ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEStructuralFeatureORMAnnotation(EStructuralFeatureORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributeORMAnnotation(EAttributeORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferenceORMAnnotation(EReferenceORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EEnum ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EEnum ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEEnumORMAnnotation(EEnumORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EData Type ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EData Type ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDataTypeORMAnnotation(EDataTypeORMAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Element ORM Annotation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Element ORM Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedElementORMAnnotation(ENamedElementORMAnnotation object) {
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

} // OrmannotationsSwitch
