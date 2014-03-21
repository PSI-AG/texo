/**
 */
package org.eclipse.emf.texo.client.model.response.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.texo.client.model.response.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponseFactoryImpl extends EFactoryImpl implements ResponseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResponseFactory init() {
		try {
			ResponseFactory theResponseFactory = (ResponseFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/texo/server/model/response"); 
			if (theResponseFactory != null) {
				return theResponseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResponseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResponsePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ResponsePackage.ERROR_TYPE: return createErrorType();
			case ResponsePackage.RESPONSE_TYPE: return createResponseType();
			case ResponsePackage.RESULT_TYPE: return createResultType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePackage getResponsePackage() {
		return (ResponsePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResponsePackage getPackage() {
		return ResponsePackage.eINSTANCE;
	}

} //ResponseFactoryImpl
