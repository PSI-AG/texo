/**
 */
package org.eclipse.emf.texo.client.model.response;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResultType#getUpdated <em>Updated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResultType#getInserted <em>Inserted</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResultType#getDeleted <em>Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResultType()
 * @model extendedMetaData="name='result_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultType extends EObject {
	/**
	 * Returns the value of the '<em><b>Updated</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResultType_Updated()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='updated'"
	 *        annotation="org.eclipse.emf.texo java.member='updated'"
	 * @generated
	 */
	EList<EObject> getUpdated();

	/**
	 * Returns the value of the '<em><b>Inserted</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResultType_Inserted()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inserted'"
	 *        annotation="org.eclipse.emf.texo java.member='inserted'"
	 * @generated
	 */
	EList<EObject> getInserted();

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResultType_Deleted()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deleted'"
	 *        annotation="org.eclipse.emf.texo java.member='deleted'"
	 * @generated
	 */
	EList<EObject> getDeleted();

} // ResultType
