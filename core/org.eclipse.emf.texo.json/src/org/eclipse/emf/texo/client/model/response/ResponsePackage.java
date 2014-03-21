/**
 */
package org.eclipse.emf.texo.client.model.response;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.client.model.response.ResponseFactory
 * @model kind="package"
 * @generated
 */
public interface ResponsePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "response";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/server/model/response";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "response";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResponsePackage eINSTANCE = org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.response.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.response.impl.DocumentRootImpl
	 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR = 3;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESULT = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl
	 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ERROR_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__STACK_TRACE = 2;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__CAUSE = 3;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl
	 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE__START_ROW = 1;

	/**
	 * The feature id for the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE__END_ROW = 2;

	/**
	 * The feature id for the '<em><b>Total Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE__TOTAL_ROWS = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE__DATA = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl
	 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Updated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__UPDATED = 0;

	/**
	 * The feature id for the '<em><b>Inserted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__INSERTED = 1;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__DELETED = 2;

	/**
	 * The number of structural features of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot#getError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Error();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot#getResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Response();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.response.DocumentRoot#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.DocumentRoot#getResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Result();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.response.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getErrorClass <em>Error Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Class</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ErrorType#getErrorClass()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_ErrorClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ErrorType#getMessage()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getStackTrace <em>Stack Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Trace</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ErrorType#getStackTrace()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_StackTrace();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.response.ErrorType#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cause</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ErrorType#getCause()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Cause();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.response.ResponseType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResponseType
	 * @generated
	 */
	EClass getResponseType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResponseType#getStatus()
	 * @see #getResponseType()
	 * @generated
	 */
	EAttribute getResponseType_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStartRow <em>Start Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Row</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResponseType#getStartRow()
	 * @see #getResponseType()
	 * @generated
	 */
	EAttribute getResponseType_StartRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getEndRow <em>End Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Row</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResponseType#getEndRow()
	 * @see #getResponseType()
	 * @generated
	 */
	EAttribute getResponseType_EndRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getTotalRows <em>Total Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Rows</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResponseType#getTotalRows()
	 * @see #getResponseType()
	 * @generated
	 */
	EAttribute getResponseType_TotalRows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResponseType#getData()
	 * @see #getResponseType()
	 * @generated
	 */
	EReference getResponseType_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.response.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.response.ResultType#getUpdated <em>Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updated</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResultType#getUpdated()
	 * @see #getResultType()
	 * @generated
	 */
	EReference getResultType_Updated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.response.ResultType#getInserted <em>Inserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inserted</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResultType#getInserted()
	 * @see #getResultType()
	 * @generated
	 */
	EReference getResultType_Inserted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.response.ResultType#getDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deleted</em>'.
	 * @see org.eclipse.emf.texo.client.model.response.ResultType#getDeleted()
	 * @see #getResultType()
	 * @generated
	 */
	EReference getResultType_Deleted();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResponseFactory getResponseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.response.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.response.impl.DocumentRootImpl
		 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERROR = eINSTANCE.getDocumentRoot_Error();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESPONSE = eINSTANCE.getDocumentRoot_Response();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESULT = eINSTANCE.getDocumentRoot_Result();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.response.impl.ErrorTypeImpl
		 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getErrorType()
		 * @generated
		 */
		EClass ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '<em><b>Error Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__ERROR_CLASS = eINSTANCE.getErrorType_ErrorClass();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__MESSAGE = eINSTANCE.getErrorType_Message();

		/**
		 * The meta object literal for the '<em><b>Stack Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__STACK_TRACE = eINSTANCE.getErrorType_StackTrace();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__CAUSE = eINSTANCE.getErrorType_Cause();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl
		 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getResponseType()
		 * @generated
		 */
		EClass RESPONSE_TYPE = eINSTANCE.getResponseType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_TYPE__STATUS = eINSTANCE.getResponseType_Status();

		/**
		 * The meta object literal for the '<em><b>Start Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_TYPE__START_ROW = eINSTANCE.getResponseType_StartRow();

		/**
		 * The meta object literal for the '<em><b>End Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_TYPE__END_ROW = eINSTANCE.getResponseType_EndRow();

		/**
		 * The meta object literal for the '<em><b>Total Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_TYPE__TOTAL_ROWS = eINSTANCE.getResponseType_TotalRows();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_TYPE__DATA = eINSTANCE.getResponseType_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl
		 * @see org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl#getResultType()
		 * @generated
		 */
		EClass RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '<em><b>Updated</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_TYPE__UPDATED = eINSTANCE.getResultType_Updated();

		/**
		 * The meta object literal for the '<em><b>Inserted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_TYPE__INSERTED = eINSTANCE.getResultType_Inserted();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_TYPE__DELETED = eINSTANCE.getResultType_Deleted();

	}

} //ResponsePackage
