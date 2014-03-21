/**
 */
package org.eclipse.emf.texo.client.model.request;

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
 * @see org.eclipse.emf.texo.client.model.request.RequestFactory
 * @model kind="package"
 * @generated
 */
public interface RequestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "request";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/server/model/request";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "request";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestPackage eINSTANCE = org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl
	 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__UPDATE = 0;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__INSERT = 1;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__DELETE = 2;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl
	 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY = 4;

	/**
	 * The feature id for the '<em><b>Query Refering Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY_REFERING_OBJECTS = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.request.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.request.impl.ParameterImpl
	 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl <em>Query Refering Objects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl
	 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getQueryReferingObjectsType()
	 * @generated
	 */
	int QUERY_REFERING_OBJECTS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Target Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERING_OBJECTS_TYPE__TARGET_URI = 0;

	/**
	 * The feature id for the '<em><b>Include Container References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Max Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Query Refering Objects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERING_OBJECTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl
	 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__NAMED_QUERY = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>First Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__FIRST_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Max Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__MAX_RESULTS = 4;

	/**
	 * The feature id for the '<em><b>Do Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__DO_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Count Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__COUNT_OPERATION = 6;

	/**
	 * The number of structural features of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.request.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.request.ActionType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.ActionType#getUpdate()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_Update();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.request.ActionType#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.ActionType#getInsert()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_Insert();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.request.ActionType#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.ActionType#getDelete()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_Delete();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot#getQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Query();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getQueryReferingObjects <em>Query Refering Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Refering Objects</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.DocumentRoot#getQueryReferingObjects()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_QueryReferingObjects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.request.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType <em>Query Refering Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Refering Objects Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType
	 * @generated
	 */
	EClass getQueryReferingObjectsType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getTargetUri <em>Target Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Uri</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getTargetUri()
	 * @see #getQueryReferingObjectsType()
	 * @generated
	 */
	EAttribute getQueryReferingObjectsType_TargetUri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#isIncludeContainerReferences <em>Include Container References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Container References</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#isIncludeContainerReferences()
	 * @see #getQueryReferingObjectsType()
	 * @generated
	 */
	EAttribute getQueryReferingObjectsType_IncludeContainerReferences();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getMaxResults <em>Max Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Results</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getMaxResults()
	 * @see #getQueryReferingObjectsType()
	 * @generated
	 */
	EAttribute getQueryReferingObjectsType_MaxResults();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.client.model.request.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryType#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Named Query</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#getNamedQuery()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_NamedQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#getQuery()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.client.model.request.QueryType#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#getParameters()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryType#getFirstResult <em>First Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Result</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#getFirstResult()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_FirstResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryType#getMaxResults <em>Max Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Results</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#getMaxResults()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_MaxResults();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryType#isDoCount <em>Do Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Count</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#isDoCount()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_DoCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.client.model.request.QueryType#isCountOperation <em>Count Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Operation</em>'.
	 * @see org.eclipse.emf.texo.client.model.request.QueryType#isCountOperation()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_CountOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequestFactory getRequestFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl
		 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TYPE__UPDATE = eINSTANCE.getActionType_Update();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TYPE__INSERT = eINSTANCE.getActionType_Insert();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TYPE__DELETE = eINSTANCE.getActionType_Delete();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl
		 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTION = eINSTANCE.getDocumentRoot_Action();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY = eINSTANCE.getDocumentRoot_Query();

		/**
		 * The meta object literal for the '<em><b>Query Refering Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY_REFERING_OBJECTS = eINSTANCE.getDocumentRoot_QueryReferingObjects();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.request.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.request.impl.ParameterImpl
		 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl <em>Query Refering Objects Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl
		 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getQueryReferingObjectsType()
		 * @generated
		 */
		EClass QUERY_REFERING_OBJECTS_TYPE = eINSTANCE.getQueryReferingObjectsType();

		/**
		 * The meta object literal for the '<em><b>Target Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REFERING_OBJECTS_TYPE__TARGET_URI = eINSTANCE.getQueryReferingObjectsType_TargetUri();

		/**
		 * The meta object literal for the '<em><b>Include Container References</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES = eINSTANCE.getQueryReferingObjectsType_IncludeContainerReferences();

		/**
		 * The meta object literal for the '<em><b>Max Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS = eINSTANCE.getQueryReferingObjectsType_MaxResults();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl <em>Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl
		 * @see org.eclipse.emf.texo.client.model.request.impl.RequestPackageImpl#getQueryType()
		 * @generated
		 */
		EClass QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '<em><b>Named Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__NAMED_QUERY = eINSTANCE.getQueryType_NamedQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__QUERY = eINSTANCE.getQueryType_Query();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__PARAMETERS = eINSTANCE.getQueryType_Parameters();

		/**
		 * The meta object literal for the '<em><b>First Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__FIRST_RESULT = eINSTANCE.getQueryType_FirstResult();

		/**
		 * The meta object literal for the '<em><b>Max Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__MAX_RESULTS = eINSTANCE.getQueryType_MaxResults();

		/**
		 * The meta object literal for the '<em><b>Do Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__DO_COUNT = eINSTANCE.getQueryType_DoCount();

		/**
		 * The meta object literal for the '<em><b>Count Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__COUNT_OPERATION = eINSTANCE.getQueryType_CountOperation();

	}

} //RequestPackage
