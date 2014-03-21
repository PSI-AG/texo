/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelcodegeneratorAdapterFactory.java,v 1.14 2011/09/23 11:03:00 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations.util;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage
 * @generated
 */
public class ModelcodegeneratorAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static ModelcodegeneratorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModelcodegeneratorAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = ModelcodegeneratorPackage.eINSTANCE;
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
  protected ModelcodegeneratorSwitch<Adapter> modelSwitch = new ModelcodegeneratorSwitch<Adapter>() {
      @Override
      public Adapter caseEPackageModelGenAnnotation(EPackageModelGenAnnotation object) {
        return createEPackageModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseENamedElementModelGenAnnotation(ENamedElementModelGenAnnotation object) {
        return createENamedElementModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEClassifierModelGenAnnotation(EClassifierModelGenAnnotation object) {
        return createEClassifierModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEClassModelGenAnnotation(EClassModelGenAnnotation object) {
        return createEClassModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEDataTypeModelGenAnnotationDefinition(EDataTypeModelGenAnnotationDefinition object) {
        return createEDataTypeModelGenAnnotationDefinitionAdapter();
      }
      @Override
      public Adapter caseEStructuralFeatureModelGenAnnotation(EStructuralFeatureModelGenAnnotation object) {
        return createEStructuralFeatureModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEAttributeModelGenAnnotation(EAttributeModelGenAnnotation object) {
        return createEAttributeModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEReferenceModelGenAnnotation(EReferenceModelGenAnnotation object) {
        return createEReferenceModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEEnumModelGenAnnotation(EEnumModelGenAnnotation object) {
        return createEEnumModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseEDataTypeModelGenAnnotation(EDataTypeModelGenAnnotation object) {
        return createEDataTypeModelGenAnnotationAdapter();
      }
      @Override
      public Adapter caseDaoFinderDefinition(DaoFinderDefinition object) {
        return createDaoFinderDefinitionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation <em>EPackage Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that
   * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
   * @generated
   */
  public Adapter createEPackageModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation <em>ENamed Element Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation
   * @generated
   */
  public Adapter createENamedElementModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation <em>EClassifier Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation
   * @generated
   */
  public Adapter createEClassifierModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation <em>EClass Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
   * @generated
   */
  public Adapter createEClassModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition <em>EData Type Model Gen Annotation Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
   * anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition
   * @generated
   */
  public Adapter createEDataTypeModelGenAnnotationDefinitionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation <em>EStructural Feature Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
   * anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation
   * @generated
   */
  public Adapter createEStructuralFeatureModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation <em>EAttribute Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation
   * @generated
   */
  public Adapter createEAttributeModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation <em>EReference Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation
   * @generated
   */
  public Adapter createEReferenceModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation <em>EEnum Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation
   * @generated
   */
  public Adapter createEEnumModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation <em>EData Type Model Gen Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation
   * @generated
   */
  public Adapter createEDataTypeModelGenAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition <em>Dao Finder Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition
   * @generated
   */
  public Adapter createDaoFinderDefinitionAdapter() {
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

} // ModelcodegeneratorAdapterFactory
