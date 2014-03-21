/**
 */
package org.eclipse.emf.texo.client.model.request.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.client.model.request.ActionType;
import org.eclipse.emf.texo.client.model.request.DocumentRoot;
import org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType;
import org.eclipse.emf.texo.client.model.request.QueryType;
import org.eclipse.emf.texo.client.model.request.RequestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.DocumentRootImpl#getQueryReferingObjects <em>Query Refering Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RequestPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RequestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RequestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return (ActionType)getMixed().get(RequestPackage.Literals.DOCUMENT_ROOT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionType newAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RequestPackage.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		((FeatureMap.Internal)getMixed()).set(RequestPackage.Literals.DOCUMENT_ROOT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType getQuery() {
		return (QueryType)getMixed().get(RequestPackage.Literals.DOCUMENT_ROOT__QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(QueryType newQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RequestPackage.Literals.DOCUMENT_ROOT__QUERY, newQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(QueryType newQuery) {
		((FeatureMap.Internal)getMixed()).set(RequestPackage.Literals.DOCUMENT_ROOT__QUERY, newQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryReferingObjectsType getQueryReferingObjects() {
		return (QueryReferingObjectsType)getMixed().get(RequestPackage.Literals.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryReferingObjects(QueryReferingObjectsType newQueryReferingObjects, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RequestPackage.Literals.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS, newQueryReferingObjects, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryReferingObjects(QueryReferingObjectsType newQueryReferingObjects) {
		((FeatureMap.Internal)getMixed()).set(RequestPackage.Literals.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS, newQueryReferingObjects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case RequestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case RequestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case RequestPackage.DOCUMENT_ROOT__ACTION:
				return basicSetAction(null, msgs);
			case RequestPackage.DOCUMENT_ROOT__QUERY:
				return basicSetQuery(null, msgs);
			case RequestPackage.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS:
				return basicSetQueryReferingObjects(null, msgs);
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
			case RequestPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RequestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case RequestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case RequestPackage.DOCUMENT_ROOT__ACTION:
				return getAction();
			case RequestPackage.DOCUMENT_ROOT__QUERY:
				return getQuery();
			case RequestPackage.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS:
				return getQueryReferingObjects();
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
			case RequestPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RequestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case RequestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case RequestPackage.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)newValue);
				return;
			case RequestPackage.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)newValue);
				return;
			case RequestPackage.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS:
				setQueryReferingObjects((QueryReferingObjectsType)newValue);
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
			case RequestPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case RequestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case RequestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case RequestPackage.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)null);
				return;
			case RequestPackage.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)null);
				return;
			case RequestPackage.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS:
				setQueryReferingObjects((QueryReferingObjectsType)null);
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
			case RequestPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RequestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case RequestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case RequestPackage.DOCUMENT_ROOT__ACTION:
				return getAction() != null;
			case RequestPackage.DOCUMENT_ROOT__QUERY:
				return getQuery() != null;
			case RequestPackage.DOCUMENT_ROOT__QUERY_REFERING_OBJECTS:
				return getQueryReferingObjects() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
