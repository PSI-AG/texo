/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotationsmodelAdapterFactory.java,v 1.6 2011/09/21 09:37:39 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.annotations.annotationsmodel.*;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassifierAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EStructuralFeatureAnnotation;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage
 * @generated
 */
public class AnnotationsmodelAdapterFactory extends AdapterFactoryImpl {
  /**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected static AnnotationsmodelPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AnnotationsmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnnotationsmodelPackage.eINSTANCE;
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
  protected AnnotationsmodelSwitch<Adapter> modelSwitch = new AnnotationsmodelSwitch<Adapter>() {
			@Override
			public Adapter caseENamedElementAnnotation(ENamedElementAnnotation object) {
				return createENamedElementAnnotationAdapter();
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
			public Adapter caseEPackageAnnotation(EPackageAnnotation object) {
				return createEPackageAnnotationAdapter();
			}
			@Override
			public Adapter caseEReferenceAnnotation(EReferenceAnnotation object) {
				return createEReferenceAnnotationAdapter();
			}
			@Override
			public Adapter caseEAttributeAnnotation(EAttributeAnnotation object) {
				return createEAttributeAnnotationAdapter();
			}
			@Override
			public Adapter caseEEnumAnnotation(EEnumAnnotation object) {
				return createEEnumAnnotationAdapter();
			}
			@Override
			public Adapter caseEEnumLiteralAnnotation(EEnumLiteralAnnotation object) {
				return createEEnumLiteralAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotatedEClass(AnnotatedEClass object) {
				return createAnnotatedEClassAdapter();
			}
			@Override
			public Adapter caseAnnotatedEStructuralFeature(AnnotatedEStructuralFeature object) {
				return createAnnotatedEStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseAnnotatedEPackage(AnnotatedEPackage object) {
				return createAnnotatedEPackageAdapter();
			}
			@Override
			public Adapter caseAnnotatedEClassifier(AnnotatedEClassifier object) {
				return createAnnotatedEClassifierAdapter();
			}
			@Override
			public Adapter caseAnnotatedEDataType(AnnotatedEDataType object) {
				return createAnnotatedEDataTypeAdapter();
			}
			@Override
			public Adapter caseAnnotatedModel(AnnotatedModel object) {
				return createAnnotatedModelAdapter();
			}
			@Override
			public Adapter caseAnnotatedENamedElement(AnnotatedENamedElement object) {
				return createAnnotatedENamedElementAdapter();
			}
			@Override
			public Adapter caseAnnotatedEEnum(AnnotatedEEnum object) {
				return createAnnotatedEEnumAdapter();
			}
			@Override
			public Adapter caseAnnotatedEReference(AnnotatedEReference object) {
				return createAnnotatedEReferenceAdapter();
			}
			@Override
			public Adapter caseAnnotatedEAttribute(AnnotatedEAttribute object) {
				return createAnnotatedEAttributeAdapter();
			}
			@Override
			public Adapter caseAnnotatedEEnumLiteral(AnnotatedEEnumLiteral object) {
				return createAnnotatedEEnumLiteralAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation <em>EEnum Literal Annotation</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation
	 * @generated
	 */
  public Adapter createEEnumLiteralAnnotationAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass <em>Annotated EClass</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass
   * @generated
   */
  public Adapter createAnnotatedEClassAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
   * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEStructuralFeature
	 * @generated
	 */
  public Adapter createAnnotatedEStructuralFeatureAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage <em>Annotated EPackage</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage
   * @generated
   */
  public Adapter createAnnotatedEPackageAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier <em>Annotated EClassifier</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier
	 * @generated
	 */
  public Adapter createAnnotatedEClassifierAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType <em>Annotated EData Type</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType
   * @generated
   */
  public Adapter createAnnotatedEDataTypeAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel <em>Annotated Model</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel
   * @generated
   */
  public Adapter createAnnotatedModelAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement <em>Annotated ENamed Element</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedENamedElement
	 * @generated
	 */
  public Adapter createAnnotatedENamedElementAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum <em>Annotated EEnum</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum
   * @generated
   */
  public Adapter createAnnotatedEEnumAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference <em>Annotated EReference</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference
   * @generated
   */
  public Adapter createAnnotatedEReferenceAdapter() {
		return null;
	}

  /**
   * Creates a new adapter for an object of class '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute <em>Annotated EAttribute</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute
   * @generated
   */
  public Adapter createAnnotatedEAttributeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral <em>Annotated EEnum Literal</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral
	 * @generated
	 */
  public Adapter createAnnotatedEEnumLiteralAdapter() {
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

} // AnnotationsmodelAdapterFactory
