/**
 */
package org.eclipse.emf.texo.client.model.response;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStartRow <em>Start Row</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResponseType#getEndRow <em>End Row</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResponseType#getTotalRows <em>Total Rows</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.ResponseType#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResponseType()
 * @model extendedMetaData="name='response_._type' kind='elementOnly'"
 * @generated
 */
public interface ResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResponseType_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='status'"
	 *        annotation="org.eclipse.emf.texo java.member='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Row</em>' attribute.
	 * @see #isSetStartRow()
	 * @see #unsetStartRow()
	 * @see #setStartRow(long)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResponseType_StartRow()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='startRow'"
	 *        annotation="org.eclipse.emf.texo java.member='startRow'"
	 * @generated
	 */
	long getStartRow();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStartRow <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Row</em>' attribute.
	 * @see #isSetStartRow()
	 * @see #unsetStartRow()
	 * @see #getStartRow()
	 * @generated
	 */
	void setStartRow(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStartRow <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartRow()
	 * @see #getStartRow()
	 * @see #setStartRow(long)
	 * @generated
	 */
	void unsetStartRow();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getStartRow <em>Start Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Row</em>' attribute is set.
	 * @see #unsetStartRow()
	 * @see #getStartRow()
	 * @see #setStartRow(long)
	 * @generated
	 */
	boolean isSetStartRow();

	/**
	 * Returns the value of the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Row</em>' attribute.
	 * @see #isSetEndRow()
	 * @see #unsetEndRow()
	 * @see #setEndRow(long)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResponseType_EndRow()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='endRow'"
	 *        annotation="org.eclipse.emf.texo java.member='endRow'"
	 * @generated
	 */
	long getEndRow();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getEndRow <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Row</em>' attribute.
	 * @see #isSetEndRow()
	 * @see #unsetEndRow()
	 * @see #getEndRow()
	 * @generated
	 */
	void setEndRow(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getEndRow <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndRow()
	 * @see #getEndRow()
	 * @see #setEndRow(long)
	 * @generated
	 */
	void unsetEndRow();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getEndRow <em>End Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Row</em>' attribute is set.
	 * @see #unsetEndRow()
	 * @see #getEndRow()
	 * @see #setEndRow(long)
	 * @generated
	 */
	boolean isSetEndRow();

	/**
	 * Returns the value of the '<em><b>Total Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Rows</em>' attribute.
	 * @see #isSetTotalRows()
	 * @see #unsetTotalRows()
	 * @see #setTotalRows(long)
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResponseType_TotalRows()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='totalRows'"
	 *        annotation="org.eclipse.emf.texo java.member='totalRows'"
	 * @generated
	 */
	long getTotalRows();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getTotalRows <em>Total Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Rows</em>' attribute.
	 * @see #isSetTotalRows()
	 * @see #unsetTotalRows()
	 * @see #getTotalRows()
	 * @generated
	 */
	void setTotalRows(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getTotalRows <em>Total Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalRows()
	 * @see #getTotalRows()
	 * @see #setTotalRows(long)
	 * @generated
	 */
	void unsetTotalRows();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.texo.client.model.response.ResponseType#getTotalRows <em>Total Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Rows</em>' attribute is set.
	 * @see #unsetTotalRows()
	 * @see #getTotalRows()
	 * @see #setTotalRows(long)
	 * @generated
	 */
	boolean isSetTotalRows();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.eclipse.emf.texo.client.model.response.ResponsePackage#getResponseType_Data()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='data'"
	 *        annotation="org.eclipse.emf.texo java.member='data'"
	 * @generated
	 */
	EList<EObject> getData();

} // ResponseType
