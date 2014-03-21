/**
 */
package org.eclipse.emf.texo.client.model.request.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.client.model.request.Parameter;
import org.eclipse.emf.texo.client.model.request.QueryType;
import org.eclipse.emf.texo.client.model.request.RequestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#getFirstResult <em>First Result</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#getMaxResults <em>Max Results</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#isDoCount <em>Do Count</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryTypeImpl#isCountOperation <em>Count Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryTypeImpl extends EObjectImpl implements QueryType {
	/**
	 * The default value of the '{@link #getNamedQuery() <em>Named Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMED_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamedQuery() <em>Named Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedQuery()
	 * @generated
	 * @ordered
	 */
	protected String namedQuery = NAMED_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getFirstResult() <em>First Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstResult()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_RESULT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getFirstResult() <em>First Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstResult()
	 * @generated
	 * @ordered
	 */
	protected int firstResult = FIRST_RESULT_EDEFAULT;

	/**
	 * This is true if the First Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstResultESet;

	/**
	 * The default value of the '{@link #getMaxResults() <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResults()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RESULTS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaxResults() <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResults()
	 * @generated
	 * @ordered
	 */
	protected int maxResults = MAX_RESULTS_EDEFAULT;

	/**
	 * This is true if the Max Results attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxResultsESet;

	/**
	 * The default value of the '{@link #isDoCount() <em>Do Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoCount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_COUNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDoCount() <em>Do Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoCount()
	 * @generated
	 * @ordered
	 */
	protected boolean doCount = DO_COUNT_EDEFAULT;

	/**
	 * This is true if the Do Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doCountESet;

	/**
	 * The default value of the '{@link #isCountOperation() <em>Count Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCountOperation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COUNT_OPERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCountOperation() <em>Count Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCountOperation()
	 * @generated
	 * @ordered
	 */
	protected boolean countOperation = COUNT_OPERATION_EDEFAULT;

	/**
	 * This is true if the Count Operation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countOperationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamedQuery() {
		return namedQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedQuery(String newNamedQuery) {
		String oldNamedQuery = namedQuery;
		namedQuery = newNamedQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_TYPE__NAMED_QUERY, oldNamedQuery, namedQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_TYPE__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RequestPackage.QUERY_TYPE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstResult() {
		return firstResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstResult(int newFirstResult) {
		int oldFirstResult = firstResult;
		firstResult = newFirstResult;
		boolean oldFirstResultESet = firstResultESet;
		firstResultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_TYPE__FIRST_RESULT, oldFirstResult, firstResult, !oldFirstResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstResult() {
		int oldFirstResult = firstResult;
		boolean oldFirstResultESet = firstResultESet;
		firstResult = FIRST_RESULT_EDEFAULT;
		firstResultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequestPackage.QUERY_TYPE__FIRST_RESULT, oldFirstResult, FIRST_RESULT_EDEFAULT, oldFirstResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstResult() {
		return firstResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxResults() {
		return maxResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResults(int newMaxResults) {
		int oldMaxResults = maxResults;
		maxResults = newMaxResults;
		boolean oldMaxResultsESet = maxResultsESet;
		maxResultsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_TYPE__MAX_RESULTS, oldMaxResults, maxResults, !oldMaxResultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxResults() {
		int oldMaxResults = maxResults;
		boolean oldMaxResultsESet = maxResultsESet;
		maxResults = MAX_RESULTS_EDEFAULT;
		maxResultsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequestPackage.QUERY_TYPE__MAX_RESULTS, oldMaxResults, MAX_RESULTS_EDEFAULT, oldMaxResultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxResults() {
		return maxResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoCount() {
		return doCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoCount(boolean newDoCount) {
		boolean oldDoCount = doCount;
		doCount = newDoCount;
		boolean oldDoCountESet = doCountESet;
		doCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_TYPE__DO_COUNT, oldDoCount, doCount, !oldDoCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoCount() {
		boolean oldDoCount = doCount;
		boolean oldDoCountESet = doCountESet;
		doCount = DO_COUNT_EDEFAULT;
		doCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequestPackage.QUERY_TYPE__DO_COUNT, oldDoCount, DO_COUNT_EDEFAULT, oldDoCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDoCount() {
		return doCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCountOperation() {
		return countOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountOperation(boolean newCountOperation) {
		boolean oldCountOperation = countOperation;
		countOperation = newCountOperation;
		boolean oldCountOperationESet = countOperationESet;
		countOperationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_TYPE__COUNT_OPERATION, oldCountOperation, countOperation, !oldCountOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCountOperation() {
		boolean oldCountOperation = countOperation;
		boolean oldCountOperationESet = countOperationESet;
		countOperation = COUNT_OPERATION_EDEFAULT;
		countOperationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequestPackage.QUERY_TYPE__COUNT_OPERATION, oldCountOperation, COUNT_OPERATION_EDEFAULT, oldCountOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCountOperation() {
		return countOperationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.QUERY_TYPE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case RequestPackage.QUERY_TYPE__NAMED_QUERY:
				return getNamedQuery();
			case RequestPackage.QUERY_TYPE__QUERY:
				return getQuery();
			case RequestPackage.QUERY_TYPE__PARAMETERS:
				return getParameters();
			case RequestPackage.QUERY_TYPE__FIRST_RESULT:
				return getFirstResult();
			case RequestPackage.QUERY_TYPE__MAX_RESULTS:
				return getMaxResults();
			case RequestPackage.QUERY_TYPE__DO_COUNT:
				return isDoCount();
			case RequestPackage.QUERY_TYPE__COUNT_OPERATION:
				return isCountOperation();
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
			case RequestPackage.QUERY_TYPE__NAMED_QUERY:
				setNamedQuery((String)newValue);
				return;
			case RequestPackage.QUERY_TYPE__QUERY:
				setQuery((String)newValue);
				return;
			case RequestPackage.QUERY_TYPE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RequestPackage.QUERY_TYPE__FIRST_RESULT:
				setFirstResult((Integer)newValue);
				return;
			case RequestPackage.QUERY_TYPE__MAX_RESULTS:
				setMaxResults((Integer)newValue);
				return;
			case RequestPackage.QUERY_TYPE__DO_COUNT:
				setDoCount((Boolean)newValue);
				return;
			case RequestPackage.QUERY_TYPE__COUNT_OPERATION:
				setCountOperation((Boolean)newValue);
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
			case RequestPackage.QUERY_TYPE__NAMED_QUERY:
				setNamedQuery(NAMED_QUERY_EDEFAULT);
				return;
			case RequestPackage.QUERY_TYPE__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case RequestPackage.QUERY_TYPE__PARAMETERS:
				getParameters().clear();
				return;
			case RequestPackage.QUERY_TYPE__FIRST_RESULT:
				unsetFirstResult();
				return;
			case RequestPackage.QUERY_TYPE__MAX_RESULTS:
				unsetMaxResults();
				return;
			case RequestPackage.QUERY_TYPE__DO_COUNT:
				unsetDoCount();
				return;
			case RequestPackage.QUERY_TYPE__COUNT_OPERATION:
				unsetCountOperation();
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
			case RequestPackage.QUERY_TYPE__NAMED_QUERY:
				return NAMED_QUERY_EDEFAULT == null ? namedQuery != null : !NAMED_QUERY_EDEFAULT.equals(namedQuery);
			case RequestPackage.QUERY_TYPE__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case RequestPackage.QUERY_TYPE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RequestPackage.QUERY_TYPE__FIRST_RESULT:
				return isSetFirstResult();
			case RequestPackage.QUERY_TYPE__MAX_RESULTS:
				return isSetMaxResults();
			case RequestPackage.QUERY_TYPE__DO_COUNT:
				return isSetDoCount();
			case RequestPackage.QUERY_TYPE__COUNT_OPERATION:
				return isSetCountOperation();
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
		result.append(" (namedQuery: ");
		result.append(namedQuery);
		result.append(", query: ");
		result.append(query);
		result.append(", firstResult: ");
		if (firstResultESet) result.append(firstResult); else result.append("<unset>");
		result.append(", maxResults: ");
		if (maxResultsESet) result.append(maxResults); else result.append("<unset>");
		result.append(", doCount: ");
		if (doCountESet) result.append(doCount); else result.append("<unset>");
		result.append(", countOperation: ");
		if (countOperationESet) result.append(countOperation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryTypeImpl
