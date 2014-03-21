/**
 */
package org.eclipse.emf.texo.client.model.request;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Refering Objects Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getTargetUri <em>Target Uri</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#isIncludeContainerReferences <em>Include Container References</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getMaxResults <em>Max Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryReferingObjectsType()
 * @model extendedMetaData="name='QueryReferingObjectsType' kind='elementOnly'"
 * @generated
 */
public interface QueryReferingObjectsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Uri</em>' attribute.
	 * @see #setTargetUri(String)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryReferingObjectsType_TargetUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='targetUri'"
	 *        annotation="org.eclipse.emf.texo java.member='targetUri'"
	 * @generated
	 */
	String getTargetUri();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getTargetUri <em>Target Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Uri</em>' attribute.
	 * @see #getTargetUri()
	 * @generated
	 */
	void setTargetUri(String value);

	/**
	 * Returns the value of the '<em><b>Include Container References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Container References</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Container References</em>' attribute.
	 * @see #isSetIncludeContainerReferences()
	 * @see #unsetIncludeContainerReferences()
	 * @see #setIncludeContainerReferences(boolean)
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryReferingObjectsType_IncludeContainerReferences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='includeContainerReferences'"
	 *        annotation="org.eclipse.emf.texo java.member='includeContainerReferences'"
	 * @generated
	 */
	boolean isIncludeContainerReferences();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#isIncludeContainerReferences <em>Include Container References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Container References</em>' attribute.
	 * @see #isSetIncludeContainerReferences()
	 * @see #unsetIncludeContainerReferences()
	 * @see #isIncludeContainerReferences()
	 * @generated
	 */
	void setIncludeContainerReferences(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#isIncludeContainerReferences <em>Include Container References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeContainerReferences()
	 * @see #isIncludeContainerReferences()
	 * @see #setIncludeContainerReferences(boolean)
	 * @generated
	 */
	void unsetIncludeContainerReferences();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#isIncludeContainerReferences <em>Include Container References</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Container References</em>' attribute is set.
	 * @see #unsetIncludeContainerReferences()
	 * @see #isIncludeContainerReferences()
	 * @see #setIncludeContainerReferences(boolean)
	 * @generated
	 */
	boolean isSetIncludeContainerReferences();

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
	 * @see org.eclipse.emf.texo.client.model.request.RequestPackage#getQueryReferingObjectsType_MaxResults()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='maxResults'"
	 *        annotation="org.eclipse.emf.texo java.member='maxResults'"
	 * @generated
	 */
	int getMaxResults();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getMaxResults <em>Max Results</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getMaxResults <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResults()
	 * @see #getMaxResults()
	 * @see #setMaxResults(int)
	 * @generated
	 */
	void unsetMaxResults();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType#getMaxResults <em>Max Results</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Results</em>' attribute is set.
	 * @see #unsetMaxResults()
	 * @see #getMaxResults()
	 * @see #setMaxResults(int)
	 * @generated
	 */
	boolean isSetMaxResults();

} // QueryReferingObjectsType
