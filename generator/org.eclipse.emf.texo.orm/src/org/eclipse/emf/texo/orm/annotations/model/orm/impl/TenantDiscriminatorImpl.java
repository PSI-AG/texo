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
import org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant Discriminator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TenantDiscriminatorImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TenantDiscriminatorImpl extends BaseOrmAnnotationImpl implements TenantDiscriminator {
	/**
   * The default value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColumnDefinition()
   * @generated
   * @ordered
   */
	protected static final String COLUMN_DEFINITION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColumnDefinition()
   * @generated
   * @ordered
   */
	protected String columnDefinition = COLUMN_DEFINITION_EDEFAULT;

	/**
   * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDiscriminatorType()
   * @generated
   * @ordered
   */
	protected static final DiscriminatorType DISCRIMINATOR_TYPE_EDEFAULT = DiscriminatorType.STRING;

	/**
   * The cached value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDiscriminatorType()
   * @generated
   * @ordered
   */
	protected DiscriminatorType discriminatorType = DISCRIMINATOR_TYPE_EDEFAULT;

	/**
   * This is true if the Discriminator Type attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean discriminatorTypeESet;

	/**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected int length = LENGTH_EDEFAULT;

	/**
   * This is true if the Length attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean lengthESet;

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
   * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isPrimaryKey()
   * @generated
   * @ordered
   */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isPrimaryKey()
   * @generated
   * @ordered
   */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
   * This is true if the Primary Key attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean primaryKeyESet;

	/**
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
	protected static final String TABLE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
	protected String table = TABLE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TenantDiscriminatorImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getTenantDiscriminator();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getColumnDefinition() {
    return columnDefinition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColumnDefinition(String newColumnDefinition) {
    String oldColumnDefinition = columnDefinition;
    columnDefinition = newColumnDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__COLUMN_DEFINITION, oldColumnDefinition, columnDefinition));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getColumnName() {
    return columnName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColumnName(String newColumnName) {
    String oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__COLUMN_NAME, oldColumnName, columnName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DiscriminatorType getDiscriminatorType() {
    return discriminatorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDiscriminatorType(DiscriminatorType newDiscriminatorType) {
    DiscriminatorType oldDiscriminatorType = discriminatorType;
    discriminatorType = newDiscriminatorType == null ? DISCRIMINATOR_TYPE_EDEFAULT : newDiscriminatorType;
    boolean oldDiscriminatorTypeESet = discriminatorTypeESet;
    discriminatorTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__DISCRIMINATOR_TYPE, oldDiscriminatorType, discriminatorType, !oldDiscriminatorTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetDiscriminatorType() {
    DiscriminatorType oldDiscriminatorType = discriminatorType;
    boolean oldDiscriminatorTypeESet = discriminatorTypeESet;
    discriminatorType = DISCRIMINATOR_TYPE_EDEFAULT;
    discriminatorTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.TENANT_DISCRIMINATOR__DISCRIMINATOR_TYPE, oldDiscriminatorType, DISCRIMINATOR_TYPE_EDEFAULT, oldDiscriminatorTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetDiscriminatorType() {
    return discriminatorTypeESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getLength() {
    return length;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLength(int newLength) {
    int oldLength = length;
    length = newLength;
    boolean oldLengthESet = lengthESet;
    lengthESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__LENGTH, oldLength, length, !oldLengthESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetLength() {
    int oldLength = length;
    boolean oldLengthESet = lengthESet;
    length = LENGTH_EDEFAULT;
    lengthESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.TENANT_DISCRIMINATOR__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetLength() {
    return lengthESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isPrimaryKey() {
    return primaryKey;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPrimaryKey(boolean newPrimaryKey) {
    boolean oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    boolean oldPrimaryKeyESet = primaryKeyESet;
    primaryKeyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__PRIMARY_KEY, oldPrimaryKey, primaryKey, !oldPrimaryKeyESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetPrimaryKey() {
    boolean oldPrimaryKey = primaryKey;
    boolean oldPrimaryKeyESet = primaryKeyESet;
    primaryKey = PRIMARY_KEY_EDEFAULT;
    primaryKeyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.TENANT_DISCRIMINATOR__PRIMARY_KEY, oldPrimaryKey, PRIMARY_KEY_EDEFAULT, oldPrimaryKeyESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetPrimaryKey() {
    return primaryKeyESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTable() {
    return table;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTable(String newTable) {
    String oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TENANT_DISCRIMINATOR__TABLE, oldTable, table));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_DEFINITION:
        return getColumnDefinition();
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_NAME:
        return getColumnName();
      case OrmPackage.TENANT_DISCRIMINATOR__DISCRIMINATOR_TYPE:
        return getDiscriminatorType();
      case OrmPackage.TENANT_DISCRIMINATOR__LENGTH:
        return getLength();
      case OrmPackage.TENANT_DISCRIMINATOR__NAME:
        return getName();
      case OrmPackage.TENANT_DISCRIMINATOR__PRIMARY_KEY:
        return isPrimaryKey();
      case OrmPackage.TENANT_DISCRIMINATOR__TABLE:
        return getTable();
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
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_DEFINITION:
        setColumnDefinition((String)newValue);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_NAME:
        setColumnName((String)newValue);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__DISCRIMINATOR_TYPE:
        setDiscriminatorType((DiscriminatorType)newValue);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__LENGTH:
        setLength((Integer)newValue);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__PRIMARY_KEY:
        setPrimaryKey((Boolean)newValue);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__TABLE:
        setTable((String)newValue);
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
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_DEFINITION:
        setColumnDefinition(COLUMN_DEFINITION_EDEFAULT);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_NAME:
        setColumnName(COLUMN_NAME_EDEFAULT);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__DISCRIMINATOR_TYPE:
        unsetDiscriminatorType();
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__LENGTH:
        unsetLength();
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__PRIMARY_KEY:
        unsetPrimaryKey();
        return;
      case OrmPackage.TENANT_DISCRIMINATOR__TABLE:
        setTable(TABLE_EDEFAULT);
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
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_DEFINITION:
        return COLUMN_DEFINITION_EDEFAULT == null ? columnDefinition != null : !COLUMN_DEFINITION_EDEFAULT.equals(columnDefinition);
      case OrmPackage.TENANT_DISCRIMINATOR__COLUMN_NAME:
        return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
      case OrmPackage.TENANT_DISCRIMINATOR__DISCRIMINATOR_TYPE:
        return isSetDiscriminatorType();
      case OrmPackage.TENANT_DISCRIMINATOR__LENGTH:
        return isSetLength();
      case OrmPackage.TENANT_DISCRIMINATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.TENANT_DISCRIMINATOR__PRIMARY_KEY:
        return isSetPrimaryKey();
      case OrmPackage.TENANT_DISCRIMINATOR__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
    result.append(" (columnDefinition: "); //$NON-NLS-1$
    result.append(columnDefinition);
    result.append(", columnName: "); //$NON-NLS-1$
    result.append(columnName);
    result.append(", discriminatorType: "); //$NON-NLS-1$
    if (discriminatorTypeESet) result.append(discriminatorType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", length: "); //$NON-NLS-1$
    if (lengthESet) result.append(length); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", primaryKey: "); //$NON-NLS-1$
    if (primaryKeyESet) result.append(primaryKey); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", table: "); //$NON-NLS-1$
    result.append(table);
    result.append(')');
    return result.toString();
  }

} //TenantDiscriminatorImpl
