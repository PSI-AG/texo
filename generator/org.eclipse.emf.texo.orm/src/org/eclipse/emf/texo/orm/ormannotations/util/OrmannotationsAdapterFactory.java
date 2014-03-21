/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmannotationsAdapterFactory.java,v 1.5 2011/09/23 21:00:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage
 * @generated
 */
public class OrmannotationsAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static OrmannotationsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmannotationsAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = OrmannotationsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected OrmannotationsSwitch<Adapter> modelSwitch = new OrmannotationsSwitch<Adapter>() {
      @Override
      public Adapter caseEPackageORMAnnotation(EPackageORMAnnotation object) {
        return createEPackageORMAnnotationAdapter();
      }
      @Override
      public Adapter caseETypeElementORMAnnotation(ETypeElementORMAnnotation object) {
        return createETypeElementORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEClassifierORMAnnotation(EClassifierORMAnnotation object) {
        return createEClassifierORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEClassORMAnnotation(EClassORMAnnotation object) {
        return createEClassORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEDataTypeORMAnnotationDefinition(EDataTypeORMAnnotationDefinition object) {
        return createEDataTypeORMAnnotationDefinitionAdapter();
      }
      @Override
      public Adapter caseEStructuralFeatureORMAnnotation(EStructuralFeatureORMAnnotation object) {
        return createEStructuralFeatureORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEAttributeORMAnnotation(EAttributeORMAnnotation object) {
        return createEAttributeORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEReferenceORMAnnotation(EReferenceORMAnnotation object) {
        return createEReferenceORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEEnumORMAnnotation(EEnumORMAnnotation object) {
        return createEEnumORMAnnotationAdapter();
      }
      @Override
      public Adapter caseEDataTypeORMAnnotation(EDataTypeORMAnnotation object) {
        return createEDataTypeORMAnnotationAdapter();
      }
      @Override
      public Adapter caseENamedElementORMAnnotation(ENamedElementORMAnnotation object) {
        return createENamedElementORMAnnotationAdapter();
      }
      @Override
      public Adapter caseENamedElementAnnotation(ENamedElementAnnotation object) {
        return createENamedElementAnnotationAdapter();
      }
      @Override
      public Adapter caseEPackageAnnotation(EPackageAnnotation object) {
        return createEPackageAnnotationAdapter();
      }
      @Override
      public Adapter caseEClassifierAnnotation(EClassifierAnnotation object) {
        return createEClassifierAnnotationAdapter();
      }
      @Override
      public Adapter caseEClassAnnotation(EClassAnnotation object) {
        return createEClassAnnotationAdapter();
      }
      @Override
      public Adapter caseEDataTypeAnnotation(EDataTypeAnnotation object) {
        return createEDataTypeAnnotationAdapter();
      }
      @Override
      public Adapter caseEStructuralFeatureAnnotation(EStructuralFeatureAnnotation object) {
        return createEStructuralFeatureAnnotationAdapter();
      }
      @Override
      public Adapter caseEAttributeAnnotation(EAttributeAnnotation object) {
        return createEAttributeAnnotationAdapter();
      }
      @Override
      public Adapter caseEReferenceAnnotation(EReferenceAnnotation object) {
        return createEReferenceAnnotationAdapter();
      }
      @Override
      public Adapter caseEEnumAnnotation(EEnumAnnotation object) {
        return createEEnumAnnotationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation <em>EPackage ORM Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation
   * @generated
   */
  public Adapter createEPackageORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation <em>EType Element ORM Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation
   * @generated
   */
  public Adapter createETypeElementORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation <em>EClassifier ORM Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassifierORMAnnotation
   * @generated
   */
  public Adapter createEClassifierORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation <em>EClass ORM Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation
   * @generated
   */
  public Adapter createEClassORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition <em>EData Type ORM Annotation Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotationDefinition
   * @generated
   */
  public Adapter createEDataTypeORMAnnotationDefinitionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation <em>EStructural Feature ORM Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation
   * @generated
   */
  public Adapter createEStructuralFeatureORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation <em>EAttribute ORM Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation
   * @generated
   */
  public Adapter createEAttributeORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation <em>EReference ORM Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation
   * @generated
   */
  public Adapter createEReferenceORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation <em>EEnum ORM Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation
   * @generated
   */
  public Adapter createEEnumORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation <em>EData Type ORM Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation
   * @generated
   */
  public Adapter createEDataTypeORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation <em>ENamed Element ORM Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.orm.ormannotations.ENamedElementORMAnnotation
   * @generated
   */
  public Adapter createENamedElementORMAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation <em>ENamed Element Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation
   * @generated
   */
  public Adapter createENamedElementAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation <em>EPackage Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation
   * @generated
   */
  public Adapter createEPackageAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation <em>EClassifier Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation
   * @generated
   */
  public Adapter createEClassifierAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation <em>EClass Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation
   * @generated
   */
  public Adapter createEClassAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation <em>EData Type Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation
   * @generated
   */
  public Adapter createEDataTypeAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation <em>EStructural Feature Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that
   * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation
   * @generated
   */
  public Adapter createEStructuralFeatureAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation <em>EAttribute Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation
   * @generated
   */
  public Adapter createEAttributeAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation <em>EReference Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation
   * @generated
   */
  public Adapter createEReferenceAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation <em>EEnum Annotation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation
   * @generated
   */
  public Adapter createEEnumAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} // OrmannotationsAdapterFactory
