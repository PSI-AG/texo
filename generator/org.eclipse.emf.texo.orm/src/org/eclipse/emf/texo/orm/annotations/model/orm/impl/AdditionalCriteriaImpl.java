/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.AdditionalCriteria;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AdditionalCriteriaImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalCriteriaImpl extends BaseOrmAnnotationImpl implements AdditionalCriteria {
	/**
   * The default value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
	protected static final String CRITERIA_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
	protected String criteria = CRITERIA_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AdditionalCriteriaImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getAdditionalCriteria();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCriteria() {
    return criteria;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCriteria(String newCriteria) {
    String oldCriteria = criteria;
    criteria = newCriteria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ADDITIONAL_CRITERIA__CRITERIA, oldCriteria, criteria));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ADDITIONAL_CRITERIA__CRITERIA:
        return getCriteria();
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
      case OrmPackage.ADDITIONAL_CRITERIA__CRITERIA:
        setCriteria((String)newValue);
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
      case OrmPackage.ADDITIONAL_CRITERIA__CRITERIA:
        setCriteria(CRITERIA_EDEFAULT);
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
      case OrmPackage.ADDITIONAL_CRITERIA__CRITERIA:
        return CRITERIA_EDEFAULT == null ? criteria != null : !CRITERIA_EDEFAULT.equals(criteria);
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
    result.append(" (criteria: "); //$NON-NLS-1$
    result.append(criteria);
    result.append(')');
    return result.toString();
  }

} //AdditionalCriteriaImpl
