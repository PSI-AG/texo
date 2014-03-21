/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter;
import org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Plsql Stored Procedure Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedPlsqlStoredProcedureQueryImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedPlsqlStoredProcedureQueryImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedPlsqlStoredProcedureQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedPlsqlStoredProcedureQueryImpl#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedPlsqlStoredProcedureQueryImpl#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedPlsqlStoredProcedureQueryImpl#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedPlsqlStoredProcedureQueryImpl extends BaseOrmAnnotationImpl implements NamedPlsqlStoredProcedureQuery {
	/**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
	protected EList<QueryHint> hint;

	/**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
	protected EList<PlsqlParameter> parameter;

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
   * The default value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProcedureName()
   * @generated
   * @ordered
   */
	protected static final String PROCEDURE_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProcedureName()
   * @generated
   * @ordered
   */
	protected String procedureName = PROCEDURE_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultClass()
   * @generated
   * @ordered
   */
	protected static final String RESULT_CLASS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultClass()
   * @generated
   * @ordered
   */
	protected String resultClass = RESULT_CLASS_EDEFAULT;

	/**
   * The default value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultSetMapping()
   * @generated
   * @ordered
   */
	protected static final String RESULT_SET_MAPPING_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultSetMapping()
   * @generated
   * @ordered
   */
	protected String resultSetMapping = RESULT_SET_MAPPING_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NamedPlsqlStoredProcedureQueryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getNamedPlsqlStoredProcedureQuery();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<QueryHint> getHint() {
    if (hint == null) {
      hint = new EObjectContainmentEList<QueryHint>(QueryHint.class, this, OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__HINT);
    }
    return hint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PlsqlParameter> getParameter() {
    if (parameter == null) {
      parameter = new EObjectContainmentEList<PlsqlParameter>(PlsqlParameter.class, this, OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PARAMETER);
    }
    return parameter;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getProcedureName() {
    return procedureName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProcedureName(String newProcedureName) {
    String oldProcedureName = procedureName;
    procedureName = newProcedureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PROCEDURE_NAME, oldProcedureName, procedureName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getResultClass() {
    return resultClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResultClass(String newResultClass) {
    String oldResultClass = resultClass;
    resultClass = newResultClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_CLASS, oldResultClass, resultClass));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getResultSetMapping() {
    return resultSetMapping;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResultSetMapping(String newResultSetMapping) {
    String oldResultSetMapping = resultSetMapping;
    resultSetMapping = newResultSetMapping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING, oldResultSetMapping, resultSetMapping));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__HINT:
        return ((InternalEList<?>)getHint()).basicRemove(otherEnd, msgs);
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__HINT:
        return getHint();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PARAMETER:
        return getParameter();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__NAME:
        return getName();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
        return getProcedureName();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_CLASS:
        return getResultClass();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
        return getResultSetMapping();
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
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__HINT:
        getHint().clear();
        getHint().addAll((Collection<? extends QueryHint>)newValue);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends PlsqlParameter>)newValue);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
        setProcedureName((String)newValue);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_CLASS:
        setResultClass((String)newValue);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
        setResultSetMapping((String)newValue);
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
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__HINT:
        getHint().clear();
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PARAMETER:
        getParameter().clear();
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
        setProcedureName(PROCEDURE_NAME_EDEFAULT);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_CLASS:
        setResultClass(RESULT_CLASS_EDEFAULT);
        return;
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
        setResultSetMapping(RESULT_SET_MAPPING_EDEFAULT);
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
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__HINT:
        return hint != null && !hint.isEmpty();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
        return PROCEDURE_NAME_EDEFAULT == null ? procedureName != null : !PROCEDURE_NAME_EDEFAULT.equals(procedureName);
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_CLASS:
        return RESULT_CLASS_EDEFAULT == null ? resultClass != null : !RESULT_CLASS_EDEFAULT.equals(resultClass);
      case OrmPackage.NAMED_PLSQL_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
        return RESULT_SET_MAPPING_EDEFAULT == null ? resultSetMapping != null : !RESULT_SET_MAPPING_EDEFAULT.equals(resultSetMapping);
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
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", procedureName: "); //$NON-NLS-1$
    result.append(procedureName);
    result.append(", resultClass: "); //$NON-NLS-1$
    result.append(resultClass);
    result.append(", resultSetMapping: "); //$NON-NLS-1$
    result.append(resultSetMapping);
    result.append(')');
    return result.toString();
  }

} //NamedPlsqlStoredProcedureQueryImpl
