/**
 */
package org.eclipse.emf.texo.client.model.response.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.texo.client.model.response.ErrorType;
import org.eclipse.emf.texo.client.model.response.ResponsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl#getErrorClass <em>Error Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl#getStackTrace <em>Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorTypeImpl extends EObjectImpl implements ErrorType {
	/**
	 * The default value of the '{@link #getErrorClass() <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorClass() <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorClass()
	 * @generated
	 * @ordered
	 */
	protected String errorClass = ERROR_CLASS_EDEFAULT;

	/**
	 * This is true if the Error Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorClassESet;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * This is true if the Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageESet;

	/**
	 * The default value of the '{@link #getStackTrace() <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackTrace() <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTrace()
	 * @generated
	 * @ordered
	 */
	protected String stackTrace = STACK_TRACE_EDEFAULT;

	/**
	 * This is true if the Stack Trace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stackTraceESet;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected ErrorType cause;

	/**
	 * This is true if the Cause containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean causeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsePackage.Literals.ERROR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorClass() {
		return errorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorClass(String newErrorClass) {
		String oldErrorClass = errorClass;
		errorClass = newErrorClass;
		boolean oldErrorClassESet = errorClassESet;
		errorClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.ERROR_TYPE__ERROR_CLASS, oldErrorClass, errorClass, !oldErrorClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorClass() {
		String oldErrorClass = errorClass;
		boolean oldErrorClassESet = errorClassESet;
		errorClass = ERROR_CLASS_EDEFAULT;
		errorClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.ERROR_TYPE__ERROR_CLASS, oldErrorClass, ERROR_CLASS_EDEFAULT, oldErrorClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorClass() {
		return errorClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		boolean oldMessageESet = messageESet;
		messageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.ERROR_TYPE__MESSAGE, oldMessage, message, !oldMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessage() {
		String oldMessage = message;
		boolean oldMessageESet = messageESet;
		message = MESSAGE_EDEFAULT;
		messageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.ERROR_TYPE__MESSAGE, oldMessage, MESSAGE_EDEFAULT, oldMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessage() {
		return messageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackTrace(String newStackTrace) {
		String oldStackTrace = stackTrace;
		stackTrace = newStackTrace;
		boolean oldStackTraceESet = stackTraceESet;
		stackTraceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.ERROR_TYPE__STACK_TRACE, oldStackTrace, stackTrace, !oldStackTraceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStackTrace() {
		String oldStackTrace = stackTrace;
		boolean oldStackTraceESet = stackTraceESet;
		stackTrace = STACK_TRACE_EDEFAULT;
		stackTraceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.ERROR_TYPE__STACK_TRACE, oldStackTrace, STACK_TRACE_EDEFAULT, oldStackTraceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStackTrace() {
		return stackTraceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCause(ErrorType newCause, NotificationChain msgs) {
		ErrorType oldCause = cause;
		cause = newCause;
		boolean oldCauseESet = causeESet;
		causeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsePackage.ERROR_TYPE__CAUSE, oldCause, newCause, !oldCauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(ErrorType newCause) {
		if (newCause != cause) {
			NotificationChain msgs = null;
			if (cause != null)
				msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResponsePackage.ERROR_TYPE__CAUSE, null, msgs);
			if (newCause != null)
				msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResponsePackage.ERROR_TYPE__CAUSE, null, msgs);
			msgs = basicSetCause(newCause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCauseESet = causeESet;
			causeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.ERROR_TYPE__CAUSE, newCause, newCause, !oldCauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCause(NotificationChain msgs) {
		ErrorType oldCause = cause;
		cause = null;
		boolean oldCauseESet = causeESet;
		causeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ResponsePackage.ERROR_TYPE__CAUSE, oldCause, null, oldCauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCause() {
		if (cause != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResponsePackage.ERROR_TYPE__CAUSE, null, msgs);
			msgs = basicUnsetCause(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCauseESet = causeESet;
			causeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.ERROR_TYPE__CAUSE, null, null, oldCauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCause() {
		return causeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsePackage.ERROR_TYPE__CAUSE:
				return basicUnsetCause(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResponsePackage.ERROR_TYPE__ERROR_CLASS:
				return getErrorClass();
			case ResponsePackage.ERROR_TYPE__MESSAGE:
				return getMessage();
			case ResponsePackage.ERROR_TYPE__STACK_TRACE:
				return getStackTrace();
			case ResponsePackage.ERROR_TYPE__CAUSE:
				return getCause();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResponsePackage.ERROR_TYPE__ERROR_CLASS:
				setErrorClass((String)newValue);
				return;
			case ResponsePackage.ERROR_TYPE__MESSAGE:
				setMessage((String)newValue);
				return;
			case ResponsePackage.ERROR_TYPE__STACK_TRACE:
				setStackTrace((String)newValue);
				return;
			case ResponsePackage.ERROR_TYPE__CAUSE:
				setCause((ErrorType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResponsePackage.ERROR_TYPE__ERROR_CLASS:
				unsetErrorClass();
				return;
			case ResponsePackage.ERROR_TYPE__MESSAGE:
				unsetMessage();
				return;
			case ResponsePackage.ERROR_TYPE__STACK_TRACE:
				unsetStackTrace();
				return;
			case ResponsePackage.ERROR_TYPE__CAUSE:
				unsetCause();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResponsePackage.ERROR_TYPE__ERROR_CLASS:
				return isSetErrorClass();
			case ResponsePackage.ERROR_TYPE__MESSAGE:
				return isSetMessage();
			case ResponsePackage.ERROR_TYPE__STACK_TRACE:
				return isSetStackTrace();
			case ResponsePackage.ERROR_TYPE__CAUSE:
				return isSetCause();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorClass: ");
		if (errorClassESet) result.append(errorClass); else result.append("<unset>");
		result.append(", message: ");
		if (messageESet) result.append(message); else result.append("<unset>");
		result.append(", stackTrace: ");
		if (stackTraceESet) result.append(stackTrace); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErrorTypeImpl
