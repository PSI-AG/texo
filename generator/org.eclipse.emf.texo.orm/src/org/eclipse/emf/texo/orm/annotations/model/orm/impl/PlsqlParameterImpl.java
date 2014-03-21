/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plsql Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getQueryParameter <em>Query Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PlsqlParameterImpl#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlsqlParameterImpl extends BaseOrmAnnotationImpl implements PlsqlParameter {
	/**
   * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDatabaseType()
   * @generated
   * @ordered
   */
	protected static final String DATABASE_TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDatabaseType()
   * @generated
   * @ordered
   */
	protected String databaseType = DATABASE_TYPE_EDEFAULT;

	/**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.IN;

	/**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
   * This is true if the Direction attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean directionESet;

	/**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected static final BigInteger LENGTH_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected BigInteger length = LENGTH_EDEFAULT;

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
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
	protected static final BigInteger PRECISION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
	protected BigInteger precision = PRECISION_EDEFAULT;

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
   * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
	protected static final BigInteger SCALE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
	protected BigInteger scale = SCALE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PlsqlParameterImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getPlsqlParameter();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDatabaseType() {
    return databaseType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDatabaseType(String newDatabaseType) {
    String oldDatabaseType = databaseType;
    databaseType = newDatabaseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__DATABASE_TYPE, oldDatabaseType, databaseType));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectionType getDirection() {
    return direction;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDirection(DirectionType newDirection) {
    DirectionType oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    boolean oldDirectionESet = directionESet;
    directionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__DIRECTION, oldDirection, direction, !oldDirectionESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetDirection() {
    DirectionType oldDirection = direction;
    boolean oldDirectionESet = directionESet;
    direction = DIRECTION_EDEFAULT;
    directionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.PLSQL_PARAMETER__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetDirection() {
    return directionESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getLength() {
    return length;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLength(BigInteger newLength) {
    BigInteger oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__LENGTH, oldLength, length));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__OPTIONAL, oldOptional, optional, !oldOptionalESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.PLSQL_PARAMETER__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getPrecision() {
    return precision;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPrecision(BigInteger newPrecision) {
    BigInteger oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__PRECISION, oldPrecision, precision));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getQueryParameter() {
    return queryParameter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setQueryParameter(String newQueryParameter) {
    String oldQueryParameter = queryParameter;
    queryParameter = newQueryParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__QUERY_PARAMETER, oldQueryParameter, queryParameter));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getScale() {
    return scale;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScale(BigInteger newScale) {
    BigInteger oldScale = scale;
    scale = newScale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PLSQL_PARAMETER__SCALE, oldScale, scale));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.PLSQL_PARAMETER__DATABASE_TYPE:
        return getDatabaseType();
      case OrmPackage.PLSQL_PARAMETER__DIRECTION:
        return getDirection();
      case OrmPackage.PLSQL_PARAMETER__LENGTH:
        return getLength();
      case OrmPackage.PLSQL_PARAMETER__NAME:
        return getName();
      case OrmPackage.PLSQL_PARAMETER__OPTIONAL:
        return isOptional();
      case OrmPackage.PLSQL_PARAMETER__PRECISION:
        return getPrecision();
      case OrmPackage.PLSQL_PARAMETER__QUERY_PARAMETER:
        return getQueryParameter();
      case OrmPackage.PLSQL_PARAMETER__SCALE:
        return getScale();
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
      case OrmPackage.PLSQL_PARAMETER__DATABASE_TYPE:
        setDatabaseType((String)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__DIRECTION:
        setDirection((DirectionType)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__LENGTH:
        setLength((BigInteger)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__PRECISION:
        setPrecision((BigInteger)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__QUERY_PARAMETER:
        setQueryParameter((String)newValue);
        return;
      case OrmPackage.PLSQL_PARAMETER__SCALE:
        setScale((BigInteger)newValue);
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
      case OrmPackage.PLSQL_PARAMETER__DATABASE_TYPE:
        setDatabaseType(DATABASE_TYPE_EDEFAULT);
        return;
      case OrmPackage.PLSQL_PARAMETER__DIRECTION:
        unsetDirection();
        return;
      case OrmPackage.PLSQL_PARAMETER__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case OrmPackage.PLSQL_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.PLSQL_PARAMETER__OPTIONAL:
        unsetOptional();
        return;
      case OrmPackage.PLSQL_PARAMETER__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
        return;
      case OrmPackage.PLSQL_PARAMETER__QUERY_PARAMETER:
        setQueryParameter(QUERY_PARAMETER_EDEFAULT);
        return;
      case OrmPackage.PLSQL_PARAMETER__SCALE:
        setScale(SCALE_EDEFAULT);
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
      case OrmPackage.PLSQL_PARAMETER__DATABASE_TYPE:
        return DATABASE_TYPE_EDEFAULT == null ? databaseType != null : !DATABASE_TYPE_EDEFAULT.equals(databaseType);
      case OrmPackage.PLSQL_PARAMETER__DIRECTION:
        return isSetDirection();
      case OrmPackage.PLSQL_PARAMETER__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case OrmPackage.PLSQL_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.PLSQL_PARAMETER__OPTIONAL:
        return isSetOptional();
      case OrmPackage.PLSQL_PARAMETER__PRECISION:
        return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
      case OrmPackage.PLSQL_PARAMETER__QUERY_PARAMETER:
        return QUERY_PARAMETER_EDEFAULT == null ? queryParameter != null : !QUERY_PARAMETER_EDEFAULT.equals(queryParameter);
      case OrmPackage.PLSQL_PARAMETER__SCALE:
        return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
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
    result.append(" (databaseType: "); //$NON-NLS-1$
    result.append(databaseType);
    result.append(", direction: "); //$NON-NLS-1$
    if (directionESet) result.append(direction); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", length: "); //$NON-NLS-1$
    result.append(length);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", optional: "); //$NON-NLS-1$
    if (optionalESet) result.append(optional); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", precision: "); //$NON-NLS-1$
    result.append(precision);
    result.append(", queryParameter: "); //$NON-NLS-1$
    result.append(queryParameter);
    result.append(", scale: "); //$NON-NLS-1$
    result.append(scale);
    result.append(')');
    return result.toString();
  }

} //PlsqlParameterImpl
