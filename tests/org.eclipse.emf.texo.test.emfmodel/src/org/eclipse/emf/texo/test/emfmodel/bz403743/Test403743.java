/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz403743;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test403743</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Package#getTest403743()
 * @model
 * @generated
 */
public interface Test403743 extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Package#getTest403743_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Package#getTest403743_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test403743> getChildren();

} // Test403743
