/**
 */
package org.eclipse.emf.texo.client.model.request;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.ActionType#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.ActionType#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.ActionType#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getActionType()
 * @model extendedMetaData="name='ActionType' kind='elementOnly'"
 * @generated
 */
public interface ActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getActionType_Update()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='update'"
	 *        annotation="org.eclipse.emf.texo java.member='update'"
	 * @generated
	 */
	EList<EObject> getUpdate();

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getActionType_Insert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='insert'"
	 *        annotation="org.eclipse.emf.texo java.member='insert'"
	 * @generated
	 */
	EList<EObject> getInsert();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getActionType_Delete()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='delete'"
	 *        annotation="org.eclipse.emf.texo java.member='delete'"
	 * @generated
	 */
	EList<EObject> getDelete();

} // ActionType
