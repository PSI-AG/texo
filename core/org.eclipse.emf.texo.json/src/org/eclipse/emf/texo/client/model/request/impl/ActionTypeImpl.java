/**
 */
package org.eclipse.emf.texo.client.model.request.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.client.model.request.ActionType;
import org.eclipse.emf.texo.client.model.request.RequestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.client.model.request.impl.ActionTypeImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionTypeImpl extends EObjectImpl implements ActionType {
	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> update;

	/**
	 * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsert()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> insert;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> delete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.ACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUpdate() {
		if (update == null) {
			update = new EObjectContainmentEList<EObject>(EObject.class, this, RequestPackage.ACTION_TYPE__UPDATE);
		}
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInsert() {
		if (insert == null) {
			insert = new EObjectContainmentEList<EObject>(EObject.class, this, RequestPackage.ACTION_TYPE__INSERT);
		}
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDelete() {
		if (delete == null) {
			delete = new EObjectContainmentEList<EObject>(EObject.class, this, RequestPackage.ACTION_TYPE__DELETE);
		}
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.ACTION_TYPE__UPDATE:
				return ((InternalEList<?>)getUpdate()).basicRemove(otherEnd, msgs);
			case RequestPackage.ACTION_TYPE__INSERT:
				return ((InternalEList<?>)getInsert()).basicRemove(otherEnd, msgs);
			case RequestPackage.ACTION_TYPE__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
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
			case RequestPackage.ACTION_TYPE__UPDATE:
				return getUpdate();
			case RequestPackage.ACTION_TYPE__INSERT:
				return getInsert();
			case RequestPackage.ACTION_TYPE__DELETE:
				return getDelete();
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
			case RequestPackage.ACTION_TYPE__UPDATE:
				getUpdate().clear();
				getUpdate().addAll((Collection<? extends EObject>)newValue);
				return;
			case RequestPackage.ACTION_TYPE__INSERT:
				getInsert().clear();
				getInsert().addAll((Collection<? extends EObject>)newValue);
				return;
			case RequestPackage.ACTION_TYPE__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends EObject>)newValue);
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
			case RequestPackage.ACTION_TYPE__UPDATE:
				getUpdate().clear();
				return;
			case RequestPackage.ACTION_TYPE__INSERT:
				getInsert().clear();
				return;
			case RequestPackage.ACTION_TYPE__DELETE:
				getDelete().clear();
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
			case RequestPackage.ACTION_TYPE__UPDATE:
				return update != null && !update.isEmpty();
			case RequestPackage.ACTION_TYPE__INSERT:
				return insert != null && !insert.isEmpty();
			case RequestPackage.ACTION_TYPE__DELETE:
				return delete != null && !delete.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionTypeImpl
