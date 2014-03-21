/**
 */
package org.eclipse.emf.texo.client.model.request;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getQueryReferingObjects <em>Query Refering Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 *        annotation="org.eclipse.emf.texo java.member='mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 *        annotation="org.eclipse.emf.texo java.member='xMLNSPrefixMap'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 *        annotation="org.eclipse.emf.texo java.member='xSISchemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionType)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot_Action()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 *        annotation="org.eclipse.emf.texo java.member='action'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(QueryType)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot_Query()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 *        annotation="org.eclipse.emf.texo java.member='query'"
	 * @generated
	 */
	QueryType getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(QueryType value);

	/**
	 * Returns the value of the '<em><b>Query Refering Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Refering Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Refering Objects</em>' containment reference.
	 * @see #setQueryReferingObjects(QueryReferingObjectsType)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getDocumentRoot_QueryReferingObjects()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='queryReferingObjects' namespace='##targetNamespace'"
	 *        annotation="org.eclipse.emf.texo java.member='queryReferingObjects'"
	 * @generated
	 */
	QueryReferingObjectsType getQueryReferingObjects();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.DocumentRoot#getQueryReferingObjects <em>Query Refering Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Refering Objects</em>' containment reference.
	 * @see #getQueryReferingObjects()
	 * @generated
	 */
	void setQueryReferingObjects(QueryReferingObjectsType value);

} // DocumentRoot
