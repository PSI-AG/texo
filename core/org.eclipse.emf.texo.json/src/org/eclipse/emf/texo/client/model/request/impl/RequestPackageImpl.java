/**
 */
package org.eclipse.emf.texo.client.model.request.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.texo.client.model.request.ActionType;
import org.eclipse.emf.texo.client.model.request.DocumentRoot;
import org.eclipse.emf.texo.client.model.request.Parameter;
import org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType;
import org.eclipse.emf.texo.client.model.request.QueryType;
import org.eclipse.emf.texo.client.model.request.RequestFactory;
import org.eclipse.emf.texo.client.model.request.RequestPackage;

import org.eclipse.emf.texo.client.model.response.ResponsePackage;

import org.eclipse.emf.texo.client.model.response.impl.ResponsePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequestPackageImpl extends EPackageImpl implements RequestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTypeEClass = null;

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
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryReferingObjectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryTypeEClass = null;

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
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequestPackageImpl() {
		super(eNS_URI, RequestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequestPackage init() {
		if (isInited) return (RequestPackage)EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);

		// Obtain or create and register package
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ResponsePackageImpl theResponsePackage = (ResponsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResponsePackage.eNS_URI) instanceof ResponsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResponsePackage.eNS_URI) : ResponsePackage.eINSTANCE);

		// Create package meta-data objects
		theRequestPackage.createPackageContents();
		theResponsePackage.createPackageContents();

		// Initialize created meta-data
		theRequestPackage.initializePackageContents();
		theResponsePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequestPackage.eNS_URI, theRequestPackage);
		return theRequestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionType_Update() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionType_Insert() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionType_Delete() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_Action() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Query() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryReferingObjects() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryReferingObjectsType() {
		return queryReferingObjectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryReferingObjectsType_TargetUri() {
		return (EAttribute)queryReferingObjectsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryReferingObjectsType_IncludeContainerReferences() {
		return (EAttribute)queryReferingObjectsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryReferingObjectsType_MaxResults() {
		return (EAttribute)queryReferingObjectsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryType() {
		return queryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_NamedQuery() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_Query() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_Parameters() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_FirstResult() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_MaxResults() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_DoCount() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_CountOperation() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFactory getRequestFactory() {
		return (RequestFactory)getEFactoryInstance();
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
		actionTypeEClass = createEClass(ACTION_TYPE);
		createEReference(actionTypeEClass, ACTION_TYPE__UPDATE);
		createEReference(actionTypeEClass, ACTION_TYPE__INSERT);
		createEReference(actionTypeEClass, ACTION_TYPE__DELETE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QUERY_REFERING_OBJECTS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		queryReferingObjectsTypeEClass = createEClass(QUERY_REFERING_OBJECTS_TYPE);
		createEAttribute(queryReferingObjectsTypeEClass, QUERY_REFERING_OBJECTS_TYPE__TARGET_URI);
		createEAttribute(queryReferingObjectsTypeEClass, QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES);
		createEAttribute(queryReferingObjectsTypeEClass, QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS);

		queryTypeEClass = createEClass(QUERY_TYPE);
		createEAttribute(queryTypeEClass, QUERY_TYPE__NAMED_QUERY);
		createEAttribute(queryTypeEClass, QUERY_TYPE__QUERY);
		createEReference(queryTypeEClass, QUERY_TYPE__PARAMETERS);
		createEAttribute(queryTypeEClass, QUERY_TYPE__FIRST_RESULT);
		createEAttribute(queryTypeEClass, QUERY_TYPE__MAX_RESULTS);
		createEAttribute(queryTypeEClass, QUERY_TYPE__DO_COUNT);
		createEAttribute(queryTypeEClass, QUERY_TYPE__COUNT_OPERATION);
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
		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionType_Update(), ecorePackage.getEObject(), null, "update", null, 1, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_Insert(), ecorePackage.getEObject(), null, "insert", null, 1, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_Delete(), ecorePackage.getEObject(), null, "delete", null, 1, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Action(), this.getActionType(), null, "action", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Query(), this.getQueryType(), null, "query", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_QueryReferingObjects(), this.getQueryReferingObjectsType(), null, "queryReferingObjects", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryReferingObjectsTypeEClass, QueryReferingObjectsType.class, "QueryReferingObjectsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryReferingObjectsType_TargetUri(), theXMLTypePackage.getString(), "targetUri", null, 1, 1, QueryReferingObjectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryReferingObjectsType_IncludeContainerReferences(), theXMLTypePackage.getBoolean(), "includeContainerReferences", null, 0, 1, QueryReferingObjectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryReferingObjectsType_MaxResults(), theXMLTypePackage.getInt(), "maxResults", "-1", 0, 1, QueryReferingObjectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryTypeEClass, QueryType.class, "QueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryType_NamedQuery(), theXMLTypePackage.getString(), "namedQuery", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_Query(), theXMLTypePackage.getString(), "query", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryType_Parameters(), this.getParameter(), null, "parameters", null, 1, -1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_FirstResult(), theXMLTypePackage.getInt(), "firstResult", "-1", 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_MaxResults(), theXMLTypePackage.getInt(), "maxResults", "-1", 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_DoCount(), theXMLTypePackage.getBoolean(), "doCount", "false", 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_CountOperation(), theXMLTypePackage.getBoolean(), "countOperation", "false", 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (actionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActionType_Update(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "update"
		   });			
		addAnnotation
		  (getActionType_Insert(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insert"
		   });			
		addAnnotation
		  (getActionType_Delete(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delete"
		   });			
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
		  (getDocumentRoot_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_QueryReferingObjects(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "queryReferingObjects",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "name", "Parameter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParameter_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getParameter_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });			
		addAnnotation
		  (getParameter_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });			
		addAnnotation
		  (queryReferingObjectsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QueryReferingObjectsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueryReferingObjectsType_TargetUri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "targetUri"
		   });			
		addAnnotation
		  (getQueryReferingObjectsType_IncludeContainerReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "includeContainerReferences"
		   });			
		addAnnotation
		  (getQueryReferingObjectsType_MaxResults(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxResults"
		   });			
		addAnnotation
		  (queryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueryType_NamedQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "namedQuery"
		   });			
		addAnnotation
		  (getQueryType_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query"
		   });			
		addAnnotation
		  (getQueryType_Parameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameters"
		   });			
		addAnnotation
		  (getQueryType_FirstResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstResult"
		   });			
		addAnnotation
		  (getQueryType_MaxResults(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxResults"
		   });			
		addAnnotation
		  (getQueryType_DoCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doCount"
		   });			
		addAnnotation
		  (getQueryType_CountOperation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "countOperation"
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
		  (getActionType_Update(), 
		   source, 
		   new String[] {
			 "java.member", "update"
		   });			
		addAnnotation
		  (getActionType_Insert(), 
		   source, 
		   new String[] {
			 "java.member", "insert"
		   });			
		addAnnotation
		  (getActionType_Delete(), 
		   source, 
		   new String[] {
			 "java.member", "delete"
		   });				
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
		  (getDocumentRoot_Action(), 
		   source, 
		   new String[] {
			 "java.member", "action"
		   });			
		addAnnotation
		  (getDocumentRoot_Query(), 
		   source, 
		   new String[] {
			 "java.member", "query"
		   });			
		addAnnotation
		  (getDocumentRoot_QueryReferingObjects(), 
		   source, 
		   new String[] {
			 "java.member", "queryReferingObjects"
		   });				
		addAnnotation
		  (getParameter_Name(), 
		   source, 
		   new String[] {
			 "java.member", "name"
		   });			
		addAnnotation
		  (getParameter_Value(), 
		   source, 
		   new String[] {
			 "java.member", "value"
		   });			
		addAnnotation
		  (getParameter_Type(), 
		   source, 
		   new String[] {
			 "java.member", "type"
		   });				
		addAnnotation
		  (getQueryReferingObjectsType_TargetUri(), 
		   source, 
		   new String[] {
			 "java.member", "targetUri"
		   });			
		addAnnotation
		  (getQueryReferingObjectsType_IncludeContainerReferences(), 
		   source, 
		   new String[] {
			 "java.member", "includeContainerReferences"
		   });			
		addAnnotation
		  (getQueryReferingObjectsType_MaxResults(), 
		   source, 
		   new String[] {
			 "java.member", "maxResults"
		   });				
		addAnnotation
		  (getQueryType_NamedQuery(), 
		   source, 
		   new String[] {
			 "java.member", "namedQuery"
		   });			
		addAnnotation
		  (getQueryType_Query(), 
		   source, 
		   new String[] {
			 "java.member", "query"
		   });			
		addAnnotation
		  (getQueryType_Parameters(), 
		   source, 
		   new String[] {
			 "java.member", "parameters"
		   });			
		addAnnotation
		  (getQueryType_FirstResult(), 
		   source, 
		   new String[] {
			 "java.member", "firstResult"
		   });			
		addAnnotation
		  (getQueryType_MaxResults(), 
		   source, 
		   new String[] {
			 "java.member", "maxResults"
		   });			
		addAnnotation
		  (getQueryType_DoCount(), 
		   source, 
		   new String[] {
			 "java.member", "doCount"
		   });			
		addAnnotation
		  (getQueryType_CountOperation(), 
		   source, 
		   new String[] {
			 "java.member", "countOperation"
		   });
	}

} //RequestPackageImpl
