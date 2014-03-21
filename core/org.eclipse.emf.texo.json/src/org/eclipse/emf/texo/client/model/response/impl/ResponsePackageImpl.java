/**
 */
package org.eclipse.emf.texo.client.model.response.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.texo.client.model.request.RequestPackage;

import org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl;

import org.eclipse.emf.texo.client.model.response.DocumentRoot;
import org.eclipse.emf.texo.client.model.response.ErrorType;
import org.eclipse.emf.texo.client.model.response.ResponseFactory;
import org.eclipse.emf.texo.client.model.response.ResponsePackage;
import org.eclipse.emf.texo.client.model.response.ResponseType;
import org.eclipse.emf.texo.client.model.response.ResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsePackageImpl extends EPackageImpl implements ResponsePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResponsePackageImpl() {
		super(eNS_URI, ResponseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResponsePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResponsePackage init() {
		if (isInited) return (ResponsePackage)EPackage.Registry.INSTANCE.getEPackage(ResponsePackage.eNS_URI);

		// Obtain or create and register package
		ResponsePackageImpl theResponsePackage = (ResponsePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResponsePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResponsePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI) instanceof RequestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI) : RequestPackage.eINSTANCE);

		// Create package meta-data objects
		theResponsePackage.createPackageContents();
		theRequestPackage.createPackageContents();

		// Initialize created meta-data
		theResponsePackage.initializePackageContents();
		theRequestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResponsePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResponsePackage.eNS_URI, theResponsePackage);
		return theResponsePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Error() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Response() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Result() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorType() {
		return errorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorType_ErrorClass() {
		return (EAttribute)errorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorType_Message() {
		return (EAttribute)errorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorType_StackTrace() {
		return (EAttribute)errorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorType_Cause() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseType() {
		return responseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_Status() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_StartRow() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_EndRow() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_TotalRows() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseType_Data() {
		return (EReference)responseTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultType_Updated() {
		return (EReference)resultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultType_Inserted() {
		return (EReference)resultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultType_Deleted() {
		return (EReference)resultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseFactory getResponseFactory() {
		return (ResponseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ERROR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESULT);

		errorTypeEClass = createEClass(ERROR_TYPE);
		createEAttribute(errorTypeEClass, ERROR_TYPE__ERROR_CLASS);
		createEAttribute(errorTypeEClass, ERROR_TYPE__MESSAGE);
		createEAttribute(errorTypeEClass, ERROR_TYPE__STACK_TRACE);
		createEReference(errorTypeEClass, ERROR_TYPE__CAUSE);

		responseTypeEClass = createEClass(RESPONSE_TYPE);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__STATUS);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__START_ROW);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__END_ROW);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__TOTAL_ROWS);
		createEReference(responseTypeEClass, RESPONSE_TYPE__DATA);

		resultTypeEClass = createEClass(RESULT_TYPE);
		createEReference(resultTypeEClass, RESULT_TYPE__UPDATED);
		createEReference(resultTypeEClass, RESULT_TYPE__INSERTED);
		createEReference(resultTypeEClass, RESULT_TYPE__DELETED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Error(), this.getErrorType(), null, "error", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Response(), this.getResponseType(), null, "response", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Result(), this.getResultType(), null, "result", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(errorTypeEClass, ErrorType.class, "ErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorType_ErrorClass(), theXMLTypePackage.getString(), "errorClass", null, 1, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorType_Message(), theXMLTypePackage.getString(), "message", null, 1, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorType_StackTrace(), theXMLTypePackage.getString(), "stackTrace", null, 1, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorType_Cause(), this.getErrorType(), null, "cause", null, 1, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseTypeEClass, ResponseType.class, "ResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseType_Status(), theXMLTypePackage.getString(), "status", null, 1, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_StartRow(), theXMLTypePackage.getLong(), "startRow", null, 1, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_EndRow(), theXMLTypePackage.getLong(), "endRow", null, 1, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_TotalRows(), theXMLTypePackage.getLong(), "totalRows", null, 1, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseType_Data(), ecorePackage.getEObject(), null, "data", null, 1, -1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultType_Updated(), ecorePackage.getEObject(), null, "updated", null, 1, -1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultType_Inserted(), ecorePackage.getEObject(), null, "inserted", null, 1, -1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultType_Deleted(), ecorePackage.getEObject(), null, "deleted", null, 1, -1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// org.eclipse.emf.texo
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });			
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Error(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "error",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Response(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "response",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Result(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (errorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ErrorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getErrorType_ErrorClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "errorClass"
		   });			
		addAnnotation
		  (getErrorType_Message(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "message"
		   });			
		addAnnotation
		  (getErrorType_StackTrace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stackTrace"
		   });			
		addAnnotation
		  (getErrorType_Cause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cause"
		   });			
		addAnnotation
		  (responseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "response_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResponseType_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status"
		   });			
		addAnnotation
		  (getResponseType_StartRow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startRow"
		   });			
		addAnnotation
		  (getResponseType_EndRow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "endRow"
		   });			
		addAnnotation
		  (getResponseType_TotalRows(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "totalRows"
		   });			
		addAnnotation
		  (getResponseType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data"
		   });			
		addAnnotation
		  (resultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "result_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResultType_Updated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "updated"
		   });			
		addAnnotation
		  (getResultType_Inserted(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inserted"
		   });			
		addAnnotation
		  (getResultType_Deleted(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deleted"
		   });	
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.emf.texo</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.emf.texo";				
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "java.member", "mixed"
		   });			
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "java.member", "xMLNSPrefixMap"
		   });			
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "java.member", "xSISchemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Error(), 
		   source, 
		   new String[] {
			 "java.member", "error"
		   });			
		addAnnotation
		  (getDocumentRoot_Response(), 
		   source, 
		   new String[] {
			 "java.member", "response"
		   });			
		addAnnotation
		  (getDocumentRoot_Result(), 
		   source, 
		   new String[] {
			 "java.member", "result"
		   });				
		addAnnotation
		  (getErrorType_ErrorClass(), 
		   source, 
		   new String[] {
			 "java.member", "errorClass"
		   });			
		addAnnotation
		  (getErrorType_Message(), 
		   source, 
		   new String[] {
			 "java.member", "message"
		   });			
		addAnnotation
		  (getErrorType_StackTrace(), 
		   source, 
		   new String[] {
			 "java.member", "stackTrace"
		   });			
		addAnnotation
		  (getErrorType_Cause(), 
		   source, 
		   new String[] {
			 "java.member", "cause"
		   });				
		addAnnotation
		  (getResponseType_Status(), 
		   source, 
		   new String[] {
			 "java.member", "status"
		   });			
		addAnnotation
		  (getResponseType_StartRow(), 
		   source, 
		   new String[] {
			 "java.member", "startRow"
		   });			
		addAnnotation
		  (getResponseType_EndRow(), 
		   source, 
		   new String[] {
			 "java.member", "endRow"
		   });			
		addAnnotation
		  (getResponseType_TotalRows(), 
		   source, 
		   new String[] {
			 "java.member", "totalRows"
		   });			
		addAnnotation
		  (getResponseType_Data(), 
		   source, 
		   new String[] {
			 "java.member", "data"
		   });				
		addAnnotation
		  (getResultType_Updated(), 
		   source, 
		   new String[] {
			 "java.member", "updated"
		   });			
		addAnnotation
		  (getResultType_Inserted(), 
		   source, 
		   new String[] {
			 "java.member", "inserted"
		   });			
		addAnnotation
		  (getResultType_Deleted(), 
		   source, 
		   new String[] {
			 "java.member", "deleted"
		   });
	}

} //ResponsePackageImpl
