/**
 * <copyright>
 * </copyright>
 *
 * $Id: MySerializableClass.java,v 1.4 2011/08/26 07:29:15 mtaal Exp $
 */
package nonemf;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>My Serializable Class</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nonemf.MySerializableClass#getSomethingInteresting <em>Something Interesting</em>}</li>
 * </ul>
 * </p>
 *
 * @see nonemf.NonemfPackage#getMySerializableClass()
 * @model superTypes="nonemf.Serializable"
 * @generated
 */
public interface MySerializableClass extends EObject, Serializable {
  /**
   * Returns the value of the '<em><b>Something Interesting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Something Interesting</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Something Interesting</em>' attribute.
   * @see #setSomethingInteresting(String)
   * @see nonemf.NonemfPackage#getMySerializableClass_SomethingInteresting()
   * @model
   * @generated
   */
  String getSomethingInteresting();

  /**
   * Sets the value of the '{@link nonemf.MySerializableClass#getSomethingInteresting <em>Something Interesting</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Something Interesting</em>' attribute.
   * @see #getSomethingInteresting()
   * @generated
   */
  void setSomethingInteresting(String value);

} // MySerializableClass
