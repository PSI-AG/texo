/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz399086;

import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package#getMapElement()
 * @model extendedMetaData="name='MapElement' kind='elementOnly'"
 * @generated
 */
public interface MapElement extends Identifiable {
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
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package#getMapElement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MapElement
