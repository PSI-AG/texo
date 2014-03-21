/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonemfSwitch.java,v 1.4 2011/08/26 07:29:15 mtaal Exp $
 */
package nonemf.util;

import java.io.Serializable;

import nonemf.A;
import nonemf.B;
import nonemf.MySerializableClass;
import nonemf.NonemfPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see nonemf.NonemfPackage
 * @generated
 */
public class NonemfSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static NonemfPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NonemfSwitch() {
    if (modelPackage == null) {
      modelPackage = NonemfPackage.eINSTANCE;
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
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case NonemfPackage.MY_SERIALIZABLE_CLASS: {
        MySerializableClass mySerializableClass = (MySerializableClass)theEObject;
        T result = caseMySerializableClass(mySerializableClass);
        if (result == null) result = caseSerializable(mySerializableClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NonemfPackage.B: {
        B b = (B)theEObject;
        T result = caseB(b);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NonemfPackage.A: {
        A a = (A)theEObject;
        T result = caseA(a);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Serializable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Serializable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSerializable(Serializable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>My Serializable Class</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>My Serializable Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMySerializableClass(MySerializableClass object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>B</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>B</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseB(B object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>A</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseA(A object) {
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

} // NonemfSwitch
