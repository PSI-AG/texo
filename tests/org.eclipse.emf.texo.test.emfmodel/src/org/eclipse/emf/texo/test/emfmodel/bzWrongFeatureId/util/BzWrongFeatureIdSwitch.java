/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.*;

import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdPackage
 * @generated
 */
public class BzWrongFeatureIdSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static BzWrongFeatureIdPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BzWrongFeatureIdSwitch() {
    if (modelPackage == null) {
      modelPackage = BzWrongFeatureIdPackage.eINSTANCE;
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case BzWrongFeatureIdPackage.ABSTRACT_CLASS: {
        AbstractClass abstractClass = (AbstractClass)theEObject;
        T result = caseAbstractClass(abstractClass);
        if (result == null) result = caseIdentifiable(abstractClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BzWrongFeatureIdPackage.THE_INTERFACE: {
        TheInterface theInterface = (TheInterface)theEObject;
        T result = caseTheInterface(theInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BzWrongFeatureIdPackage.CONCRETE_CLASS: {
        ConcreteClass concreteClass = (ConcreteClass)theEObject;
        T result = caseConcreteClass(concreteClass);
        if (result == null) result = caseTheInterface(concreteClass);
        if (result == null) result = caseAbstractClass(concreteClass);
        if (result == null) result = caseIdentifiable(concreteClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Class</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAbstractClass(AbstractClass object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>The Interface</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>The Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTheInterface(TheInterface object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Concrete Class</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concrete Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseConcreteClass(ConcreteClass object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIdentifiable(Identifiable object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //BzWrongFeatureIdSwitch
