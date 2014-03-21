/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz399086.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package;
import org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement;
import org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap;
import org.eclipse.emf.texo.test.emfmodel.identifiable.impl.IdentifiableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>The Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.TheMapImpl#getRefContent <em>Ref Content</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.TheMapImpl#getValueContent <em>Value Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TheMapImpl extends IdentifiableImpl implements TheMap {
	/**
	 * The cached value of the '{@link #getRefContent() <em>Ref Content</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefContent()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, MapElement> refContent;

	/**
	 * The cached value of the '{@link #getValueContent() <em>Value Content</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContent()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> valueContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TheMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz399086Package.Literals.THE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, MapElement> getRefContent() {
		if (refContent == null) {
			refContent = new EcoreEMap<String,MapElement>(Bz399086Package.Literals.MAP_REF_ENTRY, MapRefEntryImpl.class, this, Bz399086Package.THE_MAP__REF_CONTENT);
		}
		return refContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getValueContent() {
		if (valueContent == null) {
			valueContent = new EcoreEMap<String,String>(Bz399086Package.Literals.MAP_VALUE_ENTRY, MapValueEntryImpl.class, this, Bz399086Package.THE_MAP__VALUE_CONTENT);
		}
		return valueContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz399086Package.THE_MAP__REF_CONTENT:
				return ((InternalEList<?>)getRefContent()).basicRemove(otherEnd, msgs);
			case Bz399086Package.THE_MAP__VALUE_CONTENT:
				return ((InternalEList<?>)getValueContent()).basicRemove(otherEnd, msgs);
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
			case Bz399086Package.THE_MAP__REF_CONTENT:
				if (coreType) return getRefContent();
				else return getRefContent().map();
			case Bz399086Package.THE_MAP__VALUE_CONTENT:
				if (coreType) return getValueContent();
				else return getValueContent().map();
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
			case Bz399086Package.THE_MAP__REF_CONTENT:
				((EStructuralFeature.Setting)getRefContent()).set(newValue);
				return;
			case Bz399086Package.THE_MAP__VALUE_CONTENT:
				((EStructuralFeature.Setting)getValueContent()).set(newValue);
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
			case Bz399086Package.THE_MAP__REF_CONTENT:
				getRefContent().clear();
				return;
			case Bz399086Package.THE_MAP__VALUE_CONTENT:
				getValueContent().clear();
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
			case Bz399086Package.THE_MAP__REF_CONTENT:
				return refContent != null && !refContent.isEmpty();
			case Bz399086Package.THE_MAP__VALUE_CONTENT:
				return valueContent != null && !valueContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TheMapImpl
