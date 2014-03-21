/**
 */
package org.eclipse.emf.texo.client.model.request.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType;
import org.eclipse.emf.texo.client.model.request.RequestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Refering Objects Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl#getTargetUri <em>Target Uri</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl#isIncludeContainerReferences <em>Include Container References</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.QueryReferingObjectsTypeImpl#getMaxResults <em>Max Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryReferingObjectsTypeImpl extends EObjectImpl implements QueryReferingObjectsType {
	/**
	 * The default value of the '{@link #getTargetUri() <em>Target Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetUri() <em>Target Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUri()
	 * @generated
	 * @ordered
	 */
	protected String targetUri = TARGET_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeContainerReferences() <em>Include Container References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeContainerReferences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_CONTAINER_REFERENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeContainerReferences() <em>Include Container References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeContainerReferences()
	 * @generated
	 * @ordered
	 */
	protected boolean includeContainerReferences = INCLUDE_CONTAINER_REFERENCES_EDEFAULT;

	/**
	 * This is true if the Include Container References attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeContainerReferencesESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryReferingObjectsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.QUERY_REFERING_OBJECTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetUri() {
		return targetUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUri(String newTargetUri) {
		String oldTargetUri = targetUri;
		targetUri = newTargetUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_REFERING_OBJECTS_TYPE__TARGET_URI, oldTargetUri, targetUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeContainerReferences() {
		return includeContainerReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeContainerReferences(boolean newIncludeContainerReferences) {
		boolean oldIncludeContainerReferences = includeContainerReferences;
		includeContainerReferences = newIncludeContainerReferences;
		boolean oldIncludeContainerReferencesESet = includeContainerReferencesESet;
		includeContainerReferencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES, oldIncludeContainerReferences, includeContainerReferences, !oldIncludeContainerReferencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeContainerReferences() {
		boolean oldIncludeContainerReferences = includeContainerReferences;
		boolean oldIncludeContainerReferencesESet = includeContainerReferencesESet;
		includeContainerReferences = INCLUDE_CONTAINER_REFERENCES_EDEFAULT;
		includeContainerReferencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequestPackage.QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES, oldIncludeContainerReferences, INCLUDE_CONTAINER_REFERENCES_EDEFAULT, oldIncludeContainerReferencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeContainerReferences() {
		return includeContainerReferencesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS, oldMaxResults, maxResults, !oldMaxResultsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequestPackage.QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS, oldMaxResults, MAX_RESULTS_EDEFAULT, oldMaxResultsESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__TARGET_URI:
				return getTargetUri();
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES:
				return isIncludeContainerReferences();
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS:
				return getMaxResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__TARGET_URI:
				setTargetUri((String)newValue);
				return;
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES:
				setIncludeContainerReferences((Boolean)newValue);
				return;
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS:
				setMaxResults((Integer)newValue);
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
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__TARGET_URI:
				setTargetUri(TARGET_URI_EDEFAULT);
				return;
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES:
				unsetIncludeContainerReferences();
				return;
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS:
				unsetMaxResults();
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
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__TARGET_URI:
				return TARGET_URI_EDEFAULT == null ? targetUri != null : !TARGET_URI_EDEFAULT.equals(targetUri);
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__INCLUDE_CONTAINER_REFERENCES:
				return isSetIncludeContainerReferences();
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE__MAX_RESULTS:
				return isSetMaxResults();
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
		result.append(" (targetUri: ");
		result.append(targetUri);
		result.append(", includeContainerReferences: ");
		if (includeContainerReferencesESet) result.append(includeContainerReferences); else result.append("<unset>");
		result.append(", maxResults: ");
		if (maxResultsESet) result.append(maxResults); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryReferingObjectsTypeImpl
