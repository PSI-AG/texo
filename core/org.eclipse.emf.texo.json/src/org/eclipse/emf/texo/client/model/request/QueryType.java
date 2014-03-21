/**
 */
package org.eclipse.emf.texo.client.model.request;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#getFirstResult <em>First Result</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#getMaxResults <em>Max Results</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#isDoCount <em>Do Count</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryType#isCountOperation <em>Count Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType()
 * @model extendedMetaData="name='QueryType' kind='elementOnly'"
 * @generated
 */
public interface QueryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Query</em>' attribute.
	 * @see #setNamedQuery(String)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_NamedQuery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='namedQuery'"
	 *        annotation="org.eclipse.emf.texo java.member='namedQuery'"
	 * @generated
	 */
	String getNamedQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getNamedQuery <em>Named Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Query</em>' attribute.
	 * @see #getNamedQuery()
	 * @generated
	 */
	void setNamedQuery(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_Query()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='query'"
	 *        annotation="org.eclipse.emf.texo java.member='query'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.client.model.request.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_Parameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameters'"
	 *        annotation="org.eclipse.emf.texo java.member='parameters'"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>First Result</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Result</em>' attribute.
	 * @see #isSetFirstResult()
	 * @see #unsetFirstResult()
	 * @see #setFirstResult(int)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_FirstResult()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='firstResult'"
	 *        annotation="org.eclipse.emf.texo java.member='firstResult'"
	 * @generated
	 */
	int getFirstResult();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getFirstResult <em>First Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Result</em>' attribute.
	 * @see #isSetFirstResult()
	 * @see #unsetFirstResult()
	 * @see #getFirstResult()
	 * @generated
	 */
	void setFirstResult(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getFirstResult <em>First Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstResult()
	 * @see #getFirstResult()
	 * @see #setFirstResult(int)
	 * @generated
	 */
	void unsetFirstResult();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getFirstResult <em>First Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Result</em>' attribute is set.
	 * @see #unsetFirstResult()
	 * @see #getFirstResult()
	 * @see #setFirstResult(int)
	 * @generated
	 */
	boolean isSetFirstResult();

	/**
	 * Returns the value of the '<em><b>Max Results</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Results</em>' attribute.
	 * @see #isSetMaxResults()
	 * @see #unsetMaxResults()
	 * @see #setMaxResults(int)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_MaxResults()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='maxResults'"
	 *        annotation="org.eclipse.emf.texo java.member='maxResults'"
	 * @generated
	 */
	int getMaxResults();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getMaxResults <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Results</em>' attribute.
	 * @see #isSetMaxResults()
	 * @see #unsetMaxResults()
	 * @see #getMaxResults()
	 * @generated
	 */
	void setMaxResults(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getMaxResults <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResults()
	 * @see #getMaxResults()
	 * @see #setMaxResults(int)
	 * @generated
	 */
	void unsetMaxResults();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#getMaxResults <em>Max Results</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Results</em>' attribute is set.
	 * @see #unsetMaxResults()
	 * @see #getMaxResults()
	 * @see #setMaxResults(int)
	 * @generated
	 */
	boolean isSetMaxResults();

	/**
	 * Returns the value of the '<em><b>Do Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Count</em>' attribute.
	 * @see #isSetDoCount()
	 * @see #unsetDoCount()
	 * @see #setDoCount(boolean)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_DoCount()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='doCount'"
	 *        annotation="org.eclipse.emf.texo java.member='doCount'"
	 * @generated
	 */
	boolean isDoCount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#isDoCount <em>Do Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Count</em>' attribute.
	 * @see #isSetDoCount()
	 * @see #unsetDoCount()
	 * @see #isDoCount()
	 * @generated
	 */
	void setDoCount(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#isDoCount <em>Do Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoCount()
	 * @see #isDoCount()
	 * @see #setDoCount(boolean)
	 * @generated
	 */
	void unsetDoCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#isDoCount <em>Do Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Do Count</em>' attribute is set.
	 * @see #unsetDoCount()
	 * @see #isDoCount()
	 * @see #setDoCount(boolean)
	 * @generated
	 */
	boolean isSetDoCount();

	/**
	 * Returns the value of the '<em><b>Count Operation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Operation</em>' attribute.
	 * @see #isSetCountOperation()
	 * @see #unsetCountOperation()
	 * @see #setCountOperation(boolean)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryType_CountOperation()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='countOperation'"
	 *        annotation="org.eclipse.emf.texo java.member='countOperation'"
	 * @generated
	 */
	boolean isCountOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#isCountOperation <em>Count Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Operation</em>' attribute.
	 * @see #isSetCountOperation()
	 * @see #unsetCountOperation()
	 * @see #isCountOperation()
	 * @generated
	 */
	void setCountOperation(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#isCountOperation <em>Count Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountOperation()
	 * @see #isCountOperation()
	 * @see #setCountOperation(boolean)
	 * @generated
	 */
	void unsetCountOperation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryType#isCountOperation <em>Count Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count Operation</em>' attribute is set.
	 * @see #unsetCountOperation()
	 * @see #isCountOperation()
	 * @see #setCountOperation(boolean)
	 * @generated
	 */
	boolean isSetCountOperation();

} // QueryType
