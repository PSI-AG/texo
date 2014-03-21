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
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plsql Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlTableImpl#getCompatibleType <em>Compatible Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlTableImpl#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlTableImpl#getNestedType <em>Nested Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlsqlTableImpl extends BaseOrmAnnotationImpl implements PlsqlTable {
	/**
   * The default value of the '{@link #getCompatibleType() <em>Compatible Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCompatibleType()
   * @generated
   * @ordered
   */
	protected static final String COMPATIBLE_TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCompatibleType() <em>Compatible Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCompatibleType()
   * @generated
   * @ordered
   */
	protected String compatibleType = COMPATIBLE_TYPE_EDEFAULT;

	/**
   * The default value of the '{@link #getJavaType() <em>Java Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJavaType()
   * @generated
   * @ordered
   */
	protected static final String JAVA_TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJavaType()
   * @generated
   * @ordered
   */
	protected String javaType = JAVA_TYPE_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getNestedType() <em>Nested Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNestedType()
   * @generated
   * @ordered
   */
	protected static final String NESTED_TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getNestedType() <em>Nested Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNestedType()
   * @generated
   * @ordered
   */
	protected String nestedType = NESTED_TYPE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PlsqlTableImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getPlsqlTable();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCompatibleType() {
    return compatibleType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCompatibleType(String newCompatibleType) {
    String oldCompatibleType = compatibleType;
    compatibleType = newCompatibleType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_TABLE__COMPATIBLE_TYPE, oldCompatibleType, compatibleType));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getJavaType() {
    return javaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setJavaType(String newJavaType) {
    String oldJavaType = javaType;
    javaType = newJavaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_TABLE__JAVA_TYPE, oldJavaType, javaType));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_TABLE__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getNestedType() {
    return nestedType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNestedType(String newNestedType) {
    String oldNestedType = nestedType;
    nestedType = newNestedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_TABLE__NESTED_TYPE, oldNestedType, nestedType));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.PLSQL_TABLE__COMPATIBLE_TYPE:
        return getCompatibleType();
      case OrmPackage.PLSQL_TABLE__JAVA_TYPE:
        return getJavaType();
      case OrmPackage.PLSQL_TABLE__NAME:
        return getName();
      case OrmPackage.PLSQL_TABLE__NESTED_TYPE:
        return getNestedType();
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
      case OrmPackage.PLSQL_TABLE__COMPATIBLE_TYPE:
        setCompatibleType((String)newValue);
        return;
      case OrmPackage.PLSQL_TABLE__JAVA_TYPE:
        setJavaType((String)newValue);
        return;
      case OrmPackage.PLSQL_TABLE__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.PLSQL_TABLE__NESTED_TYPE:
        setNestedType((String)newValue);
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
      case OrmPackage.PLSQL_TABLE__COMPATIBLE_TYPE:
        setCompatibleType(COMPATIBLE_TYPE_EDEFAULT);
        return;
      case OrmPackage.PLSQL_TABLE__JAVA_TYPE:
        setJavaType(JAVA_TYPE_EDEFAULT);
        return;
      case OrmPackage.PLSQL_TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.PLSQL_TABLE__NESTED_TYPE:
        setNestedType(NESTED_TYPE_EDEFAULT);
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
      case OrmPackage.PLSQL_TABLE__COMPATIBLE_TYPE:
        return COMPATIBLE_TYPE_EDEFAULT == null ? compatibleType != null : !COMPATIBLE_TYPE_EDEFAULT.equals(compatibleType);
      case OrmPackage.PLSQL_TABLE__JAVA_TYPE:
        return JAVA_TYPE_EDEFAULT == null ? javaType != null : !JAVA_TYPE_EDEFAULT.equals(javaType);
      case OrmPackage.PLSQL_TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.PLSQL_TABLE__NESTED_TYPE:
        return NESTED_TYPE_EDEFAULT == null ? nestedType != null : !NESTED_TYPE_EDEFAULT.equals(nestedType);
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
    result.append(" (compatibleType: "); //$NON-NLS-1$
    result.append(compatibleType);
    result.append(", javaType: "); //$NON-NLS-1$
    result.append(javaType);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", nestedType: "); //$NON-NLS-1$
    result.append(nestedType);
    result.append(')');
    return result.toString();
  }

} //PlsqlTableImpl
