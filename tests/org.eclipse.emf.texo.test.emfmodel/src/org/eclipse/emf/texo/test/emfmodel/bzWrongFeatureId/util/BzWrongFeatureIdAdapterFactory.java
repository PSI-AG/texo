/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.*;

import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdPackage
 * @generated
 */
public class BzWrongFeatureIdAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static BzWrongFeatureIdPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BzWrongFeatureIdAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = BzWrongFeatureIdPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BzWrongFeatureIdSwitch<Adapter> modelSwitch =
		new BzWrongFeatureIdSwitch<Adapter>() {
      @Override
      public Adapter caseAbstractClass(AbstractClass object) {
        return createAbstractClassAdapter();
      }
      @Override
      public Adapter caseTheInterface(TheInterface object) {
        return createTheInterfaceAdapter();
      }
      @Override
      public Adapter caseConcreteClass(ConcreteClass object) {
        return createConcreteClassAdapter();
      }
      @Override
      public Adapter caseIdentifiable(Identifiable object) {
        return createIdentifiableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass <em>Abstract Class</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass
   * @generated
   */
	public Adapter createAbstractClassAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface <em>The Interface</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface
   * @generated
   */
	public Adapter createTheInterfaceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass <em>Concrete Class</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass
   * @generated
   */
	public Adapter createConcreteClassAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable <em>Identifiable</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable
   * @generated
   */
	public Adapter createIdentifiableAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //BzWrongFeatureIdAdapterFactory
