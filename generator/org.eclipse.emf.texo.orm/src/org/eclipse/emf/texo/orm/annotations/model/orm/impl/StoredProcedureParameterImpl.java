/**
 * <copyright>
 * </copyright>
 *
 * $Id: StoredProcedureParameterImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stored Procedure Parameter</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#getJdbcType <em>Jdbc Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#getJdbcTypeName <em>Jdbc Type Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#getQueryParameter <em>Query Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoredProcedureParameterImpl extends BaseOrmAnnotationImpl implements StoredProcedureParameter {
  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.IN;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected DirectionType direction = DIRECTION_EDEFAULT;

  /**
   * This is true if the Direction attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean directionESet;

  /**
   * The default value of the '{@link #getJdbcType() <em>Jdbc Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getJdbcType()
   * @generated
   * @ordered
   */
  protected static final BigInteger JDBC_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJdbcType() <em>Jdbc Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getJdbcType()
   * @generated
   * @ordered
   */
  protected BigInteger jdbcType = JDBC_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getJdbcTypeName() <em>Jdbc Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcTypeName()
   * @generated
   * @ordered
   */
  protected static final String JDBC_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJdbcTypeName() <em>Jdbc Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcTypeName()
   * @generated
   * @ordered
   */
  protected String jdbcTypeName = JDBC_TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
	protected static final boolean OPTIONAL_EDEFAULT = false;

		/**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
	protected boolean optional = OPTIONAL_EDEFAULT;

		/**
   * This is true if the Optional attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean optionalESet;

		/**
   * The default value of the '{@link #getQueryParameter() <em>Query Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryParameter()
   * @generated
   * @ordered
   */
  protected static final String QUERY_PARAMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQueryParameter() <em>Query Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryParameter()
   * @generated
   * @ordered
   */
  protected String queryParameter = QUERY_PARAMETER_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected StoredProcedureParameterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getStoredProcedureParameter();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DirectionType getDirection() {
    return direction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(DirectionType newDirection) {
    DirectionType oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    boolean oldDirectionESet = directionESet;
    directionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__DIRECTION, oldDirection, direction, !oldDirectionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDirection() {
    DirectionType oldDirection = direction;
    boolean oldDirectionESet = directionESet;
    direction = DIRECTION_EDEFAULT;
    directionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.STORED_PROCEDURE_PARAMETER__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDirection() {
    return directionESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getJdbcType() {
    return jdbcType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJdbcType(BigInteger newJdbcType) {
    BigInteger oldJdbcType = jdbcType;
    jdbcType = newJdbcType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE, oldJdbcType, jdbcType));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getJdbcTypeName() {
    return jdbcTypeName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJdbcTypeName(String newJdbcTypeName) {
    String oldJdbcTypeName = jdbcTypeName;
    jdbcTypeName = newJdbcTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME, oldJdbcTypeName, jdbcTypeName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isOptional() {
    return optional;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOptional(boolean newOptional) {
    boolean oldOptional = optional;
    optional = newOptional;
    boolean oldOptionalESet = optionalESet;
    optionalESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__OPTIONAL, oldOptional, optional, !oldOptionalESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetOptional() {
    boolean oldOptional = optional;
    boolean oldOptionalESet = optionalESet;
    optional = OPTIONAL_EDEFAULT;
    optionalESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.STORED_PROCEDURE_PARAMETER__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetOptional() {
    return optionalESet;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getQueryParameter() {
    return queryParameter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setQueryParameter(String newQueryParameter) {
    String oldQueryParameter = queryParameter;
    queryParameter = newQueryParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER, oldQueryParameter, queryParameter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.STORED_PROCEDURE_PARAMETER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.STORED_PROCEDURE_PARAMETER__DIRECTION:
        return getDirection();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE:
        return getJdbcType();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME:
        return getJdbcTypeName();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__NAME:
        return getName();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__OPTIONAL:
        return isOptional();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER:
        return getQueryParameter();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.STORED_PROCEDURE_PARAMETER__DIRECTION:
        setDirection((DirectionType)newValue);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE:
        setJdbcType((BigInteger)newValue);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME:
        setJdbcTypeName((String)newValue);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER:
        setQueryParameter((String)newValue);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__TYPE:
        setType((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.STORED_PROCEDURE_PARAMETER__DIRECTION:
        unsetDirection();
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE:
        setJdbcType(JDBC_TYPE_EDEFAULT);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME:
        setJdbcTypeName(JDBC_TYPE_NAME_EDEFAULT);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__OPTIONAL:
        unsetOptional();
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER:
        setQueryParameter(QUERY_PARAMETER_EDEFAULT);
        return;
      case OrmPackage.STORED_PROCEDURE_PARAMETER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.STORED_PROCEDURE_PARAMETER__DIRECTION:
        return isSetDirection();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE:
        return JDBC_TYPE_EDEFAULT == null ? jdbcType != null : !JDBC_TYPE_EDEFAULT.equals(jdbcType);
      case OrmPackage.STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME:
        return JDBC_TYPE_NAME_EDEFAULT == null ? jdbcTypeName != null : !JDBC_TYPE_NAME_EDEFAULT.equals(jdbcTypeName);
      case OrmPackage.STORED_PROCEDURE_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.STORED_PROCEDURE_PARAMETER__OPTIONAL:
        return isSetOptional();
      case OrmPackage.STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER:
        return QUERY_PARAMETER_EDEFAULT == null ? queryParameter != null : !QUERY_PARAMETER_EDEFAULT.equals(queryParameter);
      case OrmPackage.STORED_PROCEDURE_PARAMETER__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (direction: "); //$NON-NLS-1$
    if (directionESet) result.append(direction); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", jdbcType: "); //$NON-NLS-1$
    result.append(jdbcType);
    result.append(", jdbcTypeName: "); //$NON-NLS-1$
    result.append(jdbcTypeName);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", optional: "); //$NON-NLS-1$
    if (optionalESet) result.append(optional); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", queryParameter: "); //$NON-NLS-1$
    result.append(queryParameter);
    result.append(", type: "); //$NON-NLS-1$
    result.append(type);
    result.append(')');
    return result.toString();
  }

} // StoredProcedureParameterImpl
