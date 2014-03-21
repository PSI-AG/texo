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
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint;
import org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Stored Function Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#getReturnParameter <em>Return Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#isCallByIndex <em>Call By Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredFunctionQueryImpl#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedStoredFunctionQueryImpl extends BaseOrmAnnotationImpl implements NamedStoredFunctionQuery {
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
	protected EList<StoredProcedureParameter> parameter;

	/**
   * The cached value of the '{@link #getReturnParameter() <em>Return Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReturnParameter()
   * @generated
   * @ordered
   */
	protected StoredProcedureParameter returnParameter;

	/**
   * The default value of the '{@link #isCallByIndex() <em>Call By Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isCallByIndex()
   * @generated
   * @ordered
   */
	protected static final boolean CALL_BY_INDEX_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isCallByIndex() <em>Call By Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isCallByIndex()
   * @generated
   * @ordered
   */
	protected boolean callByIndex = CALL_BY_INDEX_EDEFAULT;

	/**
   * This is true if the Call By Index attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean callByIndexESet;

	/**
   * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
	protected static final String FUNCTION_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
	protected String functionName = FUNCTION_NAME_EDEFAULT;

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
	protected NamedStoredFunctionQueryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getNamedStoredFunctionQuery();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<QueryHint> getHint() {
    if (hint == null) {
      hint = new EObjectContainmentEList<QueryHint>(QueryHint.class, this, OrmPackage.NAMED_STORED_FUNCTION_QUERY__HINT);
    }
    return hint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StoredProcedureParameter> getParameter() {
    if (parameter == null) {
      parameter = new EObjectContainmentEList<StoredProcedureParameter>(StoredProcedureParameter.class, this, OrmPackage.NAMED_STORED_FUNCTION_QUERY__PARAMETER);
    }
    return parameter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StoredProcedureParameter getReturnParameter() {
    return returnParameter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetReturnParameter(StoredProcedureParameter newReturnParameter, NotificationChain msgs) {
    StoredProcedureParameter oldReturnParameter = returnParameter;
    returnParameter = newReturnParameter;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER, oldReturnParameter, newReturnParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReturnParameter(StoredProcedureParameter newReturnParameter) {
    if (newReturnParameter != returnParameter) {
      NotificationChain msgs = null;
      if (returnParameter != null)
        msgs = ((InternalEObject)returnParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER, null, msgs);
      if (newReturnParameter != null)
        msgs = ((InternalEObject)newReturnParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER, null, msgs);
      msgs = basicSetReturnParameter(newReturnParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER, newReturnParameter, newReturnParameter));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isCallByIndex() {
    return callByIndex;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCallByIndex(boolean newCallByIndex) {
    boolean oldCallByIndex = callByIndex;
    callByIndex = newCallByIndex;
    boolean oldCallByIndexESet = callByIndexESet;
    callByIndexESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__CALL_BY_INDEX, oldCallByIndex, callByIndex, !oldCallByIndexESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetCallByIndex() {
    boolean oldCallByIndex = callByIndex;
    boolean oldCallByIndexESet = callByIndexESet;
    callByIndex = CALL_BY_INDEX_EDEFAULT;
    callByIndexESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__CALL_BY_INDEX, oldCallByIndex, CALL_BY_INDEX_EDEFAULT, oldCallByIndexESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetCallByIndex() {
    return callByIndexESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getFunctionName() {
    return functionName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFunctionName(String newFunctionName) {
    String oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__FUNCTION_NAME, oldFunctionName, functionName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_FUNCTION_QUERY__RESULT_SET_MAPPING, oldResultSetMapping, resultSetMapping));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__HINT:
        return ((InternalEList<?>)getHint()).basicRemove(otherEnd, msgs);
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER:
        return basicSetReturnParameter(null, msgs);
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
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__HINT:
        return getHint();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__PARAMETER:
        return getParameter();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER:
        return getReturnParameter();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__CALL_BY_INDEX:
        return isCallByIndex();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__FUNCTION_NAME:
        return getFunctionName();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__NAME:
        return getName();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RESULT_SET_MAPPING:
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
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__HINT:
        getHint().clear();
        getHint().addAll((Collection<? extends QueryHint>)newValue);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends StoredProcedureParameter>)newValue);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER:
        setReturnParameter((StoredProcedureParameter)newValue);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__CALL_BY_INDEX:
        setCallByIndex((Boolean)newValue);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__FUNCTION_NAME:
        setFunctionName((String)newValue);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RESULT_SET_MAPPING:
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
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__HINT:
        getHint().clear();
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__PARAMETER:
        getParameter().clear();
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER:
        setReturnParameter((StoredProcedureParameter)null);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__CALL_BY_INDEX:
        unsetCallByIndex();
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__FUNCTION_NAME:
        setFunctionName(FUNCTION_NAME_EDEFAULT);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RESULT_SET_MAPPING:
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
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__HINT:
        return hint != null && !hint.isEmpty();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RETURN_PARAMETER:
        return returnParameter != null;
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__CALL_BY_INDEX:
        return isSetCallByIndex();
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__FUNCTION_NAME:
        return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.NAMED_STORED_FUNCTION_QUERY__RESULT_SET_MAPPING:
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
    result.append(" (callByIndex: "); //$NON-NLS-1$
    if (callByIndexESet) result.append(callByIndex); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", functionName: "); //$NON-NLS-1$
    result.append(functionName);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", resultSetMapping: "); //$NON-NLS-1$
    result.append(resultSetMapping);
    result.append(')');
    return result.toString();
  }

} //NamedStoredFunctionQueryImpl
