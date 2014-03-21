/**
 */
package org.eclipse.emf.texo.client.model.response.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.client.model.response.ResponsePackage;
import org.eclipse.emf.texo.client.model.response.ResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl#getInserted <em>Inserted</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.response.impl.ResultTypeImpl#getDeleted <em>Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultTypeImpl extends EObjectImpl implements ResultType {
	/**
	 * The cached value of the '{@link #getUpdated() <em>Updated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> updated;

	/**
	 * The cached value of the '{@link #getInserted() <em>Inserted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInserted()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> inserted;

	/**
	 * The cached value of the '{@link #getDeleted() <em>Deleted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleted()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> deleted;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsePackage.Literals.RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUpdated() {
		if (updated == null) {
			updated = new EObjectContainmentEList<EObject>(EObject.class, this, ResponsePackage.RESULT_TYPE__UPDATED);
		}
		return updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInserted() {
		if (inserted == null) {
			inserted = new EObjectContainmentEList<EObject>(EObject.class, this, ResponsePackage.RESULT_TYPE__INSERTED);
		}
		return inserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeleted() {
		if (deleted == null) {
			deleted = new EObjectContainmentEList<EObject>(EObject.class, this, ResponsePackage.RESULT_TYPE__DELETED);
		}
		return deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsePackage.RESULT_TYPE__UPDATED:
				return ((InternalEList<?>)getUpdated()).basicRemove(otherEnd, msgs);
			case ResponsePackage.RESULT_TYPE__INSERTED:
				return ((InternalEList<?>)getInserted()).basicRemove(otherEnd, msgs);
			case ResponsePackage.RESULT_TYPE__DELETED:
				return ((InternalEList<?>)getDeleted()).basicRemove(otherEnd, msgs);
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
			case ResponsePackage.RESULT_TYPE__UPDATED:
				return getUpdated();
			case ResponsePackage.RESULT_TYPE__INSERTED:
				return getInserted();
			case ResponsePackage.RESULT_TYPE__DELETED:
				return getDeleted();
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
			case ResponsePackage.RESULT_TYPE__UPDATED:
				getUpdated().clear();
				getUpdated().addAll((Collection<? extends EObject>)newValue);
				return;
			case ResponsePackage.RESULT_TYPE__INSERTED:
				getInserted().clear();
				getInserted().addAll((Collection<? extends EObject>)newValue);
				return;
			case ResponsePackage.RESULT_TYPE__DELETED:
				getDeleted().clear();
				getDeleted().addAll((Collection<? extends EObject>)newValue);
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
			case ResponsePackage.RESULT_TYPE__UPDATED:
				getUpdated().clear();
				return;
			case ResponsePackage.RESULT_TYPE__INSERTED:
				getInserted().clear();
				return;
			case ResponsePackage.RESULT_TYPE__DELETED:
				getDeleted().clear();
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
			case ResponsePackage.RESULT_TYPE__UPDATED:
				return updated != null && !updated.isEmpty();
			case ResponsePackage.RESULT_TYPE__INSERTED:
				return inserted != null && !inserted.isEmpty();
			case ResponsePackage.RESULT_TYPE__DELETED:
				return deleted != null && !deleted.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultTypeImpl
