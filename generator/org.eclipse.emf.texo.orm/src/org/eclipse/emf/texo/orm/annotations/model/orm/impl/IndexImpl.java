/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.Index;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IndexImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IndexImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IndexImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IndexImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IndexImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IndexImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends BaseOrmAnnotationImpl implements Index {
	/**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
	protected EList<String> columnName;

	/**
   * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCatalog()
   * @generated
   * @ordered
   */
	protected static final String CATALOG_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCatalog()
   * @generated
   * @ordered
   */
	protected String catalog = CATALOG_EDEFAULT;

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
   * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
	protected String schema = SCHEMA_EDEFAULT;

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
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
   * This is true if the Unique attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean uniqueESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IndexImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getIndex();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getColumnName() {
    if (columnName == null) {
      columnName = new EDataTypeEList<String>(String.class, this, OrmPackage.INDEX__COLUMN_NAME);
    }
    return columnName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCatalog() {
    return catalog;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCatalog(String newCatalog) {
    String oldCatalog = catalog;
    catalog = newCatalog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.INDEX__CATALOG, oldCatalog, catalog));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.INDEX__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSchema() {
    return schema;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSchema(String newSchema) {
    String oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.INDEX__SCHEMA, oldSchema, schema));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.INDEX__TABLE, oldTable, table));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isUnique() {
    return unique;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnique(boolean newUnique) {
    boolean oldUnique = unique;
    unique = newUnique;
    boolean oldUniqueESet = uniqueESet;
    uniqueESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.INDEX__UNIQUE, oldUnique, unique, !oldUniqueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetUnique() {
    boolean oldUnique = unique;
    boolean oldUniqueESet = uniqueESet;
    unique = UNIQUE_EDEFAULT;
    uniqueESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.INDEX__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetUnique() {
    return uniqueESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.INDEX__COLUMN_NAME:
        return getColumnName();
      case OrmPackage.INDEX__CATALOG:
        return getCatalog();
      case OrmPackage.INDEX__NAME:
        return getName();
      case OrmPackage.INDEX__SCHEMA:
        return getSchema();
      case OrmPackage.INDEX__TABLE:
        return getTable();
      case OrmPackage.INDEX__UNIQUE:
        return isUnique();
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
      case OrmPackage.INDEX__COLUMN_NAME:
        getColumnName().clear();
        getColumnName().addAll((Collection<? extends String>)newValue);
        return;
      case OrmPackage.INDEX__CATALOG:
        setCatalog((String)newValue);
        return;
      case OrmPackage.INDEX__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.INDEX__SCHEMA:
        setSchema((String)newValue);
        return;
      case OrmPackage.INDEX__TABLE:
        setTable((String)newValue);
        return;
      case OrmPackage.INDEX__UNIQUE:
        setUnique((Boolean)newValue);
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
      case OrmPackage.INDEX__COLUMN_NAME:
        getColumnName().clear();
        return;
      case OrmPackage.INDEX__CATALOG:
        setCatalog(CATALOG_EDEFAULT);
        return;
      case OrmPackage.INDEX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.INDEX__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
        return;
      case OrmPackage.INDEX__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
      case OrmPackage.INDEX__UNIQUE:
        unsetUnique();
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
      case OrmPackage.INDEX__COLUMN_NAME:
        return columnName != null && !columnName.isEmpty();
      case OrmPackage.INDEX__CATALOG:
        return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
      case OrmPackage.INDEX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.INDEX__SCHEMA:
        return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
      case OrmPackage.INDEX__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
      case OrmPackage.INDEX__UNIQUE:
        return isSetUnique();
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
    result.append(" (columnName: "); //$NON-NLS-1$
    result.append(columnName);
    result.append(", catalog: "); //$NON-NLS-1$
    result.append(catalog);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", schema: "); //$NON-NLS-1$
    result.append(schema);
    result.append(", table: "); //$NON-NLS-1$
    result.append(table);
    result.append(", unique: "); //$NON-NLS-1$
    if (uniqueESet) result.append(unique); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} //IndexImpl
