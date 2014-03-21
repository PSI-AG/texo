/**
 */
package org.eclipse.emf.texo.client.model.response.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.client.model.response.ResponsePackage;
import org.eclipse.emf.texo.client.model.response.ResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl#getStartRow <em>Start Row</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl#getEndRow <em>End Row</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl#getTotalRows <em>Total Rows</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResponseTypeImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseTypeImpl extends EObjectImpl implements ResponseType {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartRow() <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRow()
	 * @generated
	 * @ordered
	 */
	protected static final long START_ROW_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartRow() <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRow()
	 * @generated
	 * @ordered
	 */
	protected long startRow = START_ROW_EDEFAULT;

	/**
	 * This is true if the Start Row attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startRowESet;

	/**
	 * The default value of the '{@link #getEndRow() <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRow()
	 * @generated
	 * @ordered
	 */
	protected static final long END_ROW_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndRow() <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRow()
	 * @generated
	 * @ordered
	 */
	protected long endRow = END_ROW_EDEFAULT;

	/**
	 * This is true if the End Row attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endRowESet;

	/**
	 * The default value of the '{@link #getTotalRows() <em>Total Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRows()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_ROWS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalRows() <em>Total Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRows()
	 * @generated
	 * @ordered
	 */
	protected long totalRows = TOTAL_ROWS_EDEFAULT;

	/**
	 * This is true if the Total Rows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalRowsESet;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsePackage.Literals.RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.RESPONSE_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartRow() {
		return startRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRow(long newStartRow) {
		long oldStartRow = startRow;
		startRow = newStartRow;
		boolean oldStartRowESet = startRowESet;
		startRowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.RESPONSE_TYPE__START_ROW, oldStartRow, startRow, !oldStartRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartRow() {
		long oldStartRow = startRow;
		boolean oldStartRowESet = startRowESet;
		startRow = START_ROW_EDEFAULT;
		startRowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.RESPONSE_TYPE__START_ROW, oldStartRow, START_ROW_EDEFAULT, oldStartRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartRow() {
		return startRowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndRow() {
		return endRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndRow(long newEndRow) {
		long oldEndRow = endRow;
		endRow = newEndRow;
		boolean oldEndRowESet = endRowESet;
		endRowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.RESPONSE_TYPE__END_ROW, oldEndRow, endRow, !oldEndRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndRow() {
		long oldEndRow = endRow;
		boolean oldEndRowESet = endRowESet;
		endRow = END_ROW_EDEFAULT;
		endRowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.RESPONSE_TYPE__END_ROW, oldEndRow, END_ROW_EDEFAULT, oldEndRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndRow() {
		return endRowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalRows() {
		return totalRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalRows(long newTotalRows) {
		long oldTotalRows = totalRows;
		totalRows = newTotalRows;
		boolean oldTotalRowsESet = totalRowsESet;
		totalRowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.RESPONSE_TYPE__TOTAL_ROWS, oldTotalRows, totalRows, !oldTotalRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalRows() {
		long oldTotalRows = totalRows;
		boolean oldTotalRowsESet = totalRowsESet;
		totalRows = TOTAL_ROWS_EDEFAULT;
		totalRowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.RESPONSE_TYPE__TOTAL_ROWS, oldTotalRows, TOTAL_ROWS_EDEFAULT, oldTotalRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalRows() {
		return totalRowsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<EObject>(EObject.class, this, ResponsePackage.RESPONSE_TYPE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsePackage.RESPONSE_TYPE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case ResponsePackage.RESPONSE_TYPE__STATUS:
				return getStatus();
			case ResponsePackage.RESPONSE_TYPE__START_ROW:
				return getStartRow();
			case ResponsePackage.RESPONSE_TYPE__END_ROW:
				return getEndRow();
			case ResponsePackage.RESPONSE_TYPE__TOTAL_ROWS:
				return getTotalRows();
			case ResponsePackage.RESPONSE_TYPE__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResponsePackage.RESPONSE_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case ResponsePackage.RESPONSE_TYPE__START_ROW:
				setStartRow((Long)newValue);
				return;
			case ResponsePackage.RESPONSE_TYPE__END_ROW:
				setEndRow((Long)newValue);
				return;
			case ResponsePackage.RESPONSE_TYPE__TOTAL_ROWS:
				setTotalRows((Long)newValue);
				return;
			case ResponsePackage.RESPONSE_TYPE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends EObject>)newValue);
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
			case ResponsePackage.RESPONSE_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ResponsePackage.RESPONSE_TYPE__START_ROW:
				unsetStartRow();
				return;
			case ResponsePackage.RESPONSE_TYPE__END_ROW:
				unsetEndRow();
				return;
			case ResponsePackage.RESPONSE_TYPE__TOTAL_ROWS:
				unsetTotalRows();
				return;
			case ResponsePackage.RESPONSE_TYPE__DATA:
				getData().clear();
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
			case ResponsePackage.RESPONSE_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ResponsePackage.RESPONSE_TYPE__START_ROW:
				return isSetStartRow();
			case ResponsePackage.RESPONSE_TYPE__END_ROW:
				return isSetEndRow();
			case ResponsePackage.RESPONSE_TYPE__TOTAL_ROWS:
				return isSetTotalRows();
			case ResponsePackage.RESPONSE_TYPE__DATA:
				return data != null && !data.isEmpty();
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
		result.append(" (status: ");
		result.append(status);
		result.append(", startRow: ");
		if (startRowESet) result.append(startRow); else result.append("<unset>");
		result.append(", endRow: ");
		if (endRowESet) result.append(endRow); else result.append("<unset>");
		result.append(", totalRows: ");
		if (totalRowsESet) result.append(totalRows); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResponseTypeImpl
