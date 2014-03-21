/**
 */
package org.eclipse.emf.texo.client.model.response;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ErrorType#getErrorClass <em>Error Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ErrorType#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ErrorType#getStackTrace <em>Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ErrorType#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getErrorType()
 * @model extendedMetaData="name='ErrorType' kind='elementOnly'"
 * @generated
 */
public interface ErrorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Class</em>' attribute.
	 * @see #isSetErrorClass()
	 * @see #unsetErrorClass()
	 * @see #setErrorClass(String)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getErrorType_ErrorClass()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='errorClass'"
	 *        annotation="org.eclipse.emf.texo java.member='errorClass'"
	 * @generated
	 */
	String getErrorClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getErrorClass <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Class</em>' attribute.
	 * @see #isSetErrorClass()
	 * @see #unsetErrorClass()
	 * @see #getErrorClass()
	 * @generated
	 */
	void setErrorClass(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getErrorClass <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorClass()
	 * @see #getErrorClass()
	 * @see #setErrorClass(String)
	 * @generated
	 */
	void unsetErrorClass();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getErrorClass <em>Error Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Class</em>' attribute is set.
	 * @see #unsetErrorClass()
	 * @see #getErrorClass()
	 * @see #setErrorClass(String)
	 * @generated
	 */
	boolean isSetErrorClass();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #isSetMessage()
	 * @see #unsetMessage()
	 * @see #setMessage(String)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getErrorType_Message()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='message'"
	 *        annotation="org.eclipse.emf.texo java.member='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #isSetMessage()
	 * @see #unsetMessage()
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessage()
	 * @see #getMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	void unsetMessage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getMessage <em>Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message</em>' attribute is set.
	 * @see #unsetMessage()
	 * @see #getMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	boolean isSetMessage();

	/**
	 * Returns the value of the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Trace</em>' attribute.
	 * @see #isSetStackTrace()
	 * @see #unsetStackTrace()
	 * @see #setStackTrace(String)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getErrorType_StackTrace()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='stackTrace'"
	 *        annotation="org.eclipse.emf.texo java.member='stackTrace'"
	 * @generated
	 */
	String getStackTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getStackTrace <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Trace</em>' attribute.
	 * @see #isSetStackTrace()
	 * @see #unsetStackTrace()
	 * @see #getStackTrace()
	 * @generated
	 */
	void setStackTrace(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getStackTrace <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStackTrace()
	 * @see #getStackTrace()
	 * @see #setStackTrace(String)
	 * @generated
	 */
	void unsetStackTrace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getStackTrace <em>Stack Trace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stack Trace</em>' attribute is set.
	 * @see #unsetStackTrace()
	 * @see #getStackTrace()
	 * @see #setStackTrace(String)
	 * @generated
	 */
	boolean isSetStackTrace();

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference.
	 * @see #isSetCause()
	 * @see #unsetCause()
	 * @see #setCause(ErrorType)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getErrorType_Cause()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='cause'"
	 *        annotation="org.eclipse.emf.texo java.member='cause'"
	 * @generated
	 */
	ErrorType getCause();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' containment reference.
	 * @see #isSetCause()
	 * @see #unsetCause()
	 * @see #getCause()
	 * @generated
	 */
	void setCause(ErrorType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCause()
	 * @see #getCause()
	 * @see #setCause(ErrorType)
	 * @generated
	 */
	void unsetCause();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getCause <em>Cause</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cause</em>' containment reference is set.
	 * @see #unsetCause()
	 * @see #getCause()
	 * @see #setCause(ErrorType)
	 * @generated
	 */
	boolean isSetCause();

} // ErrorType
