/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinTableImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Join Table</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getInverseJoinColumn <em>Inverse Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getUniqueConstraint <em>Unique Constraint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getCreationSuffix <em>Creation Suffix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinTableImpl extends BaseOrmAnnotationImpl implements JoinTable {
  /**
   * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> joinColumn;

  /**
   * The cached value of the '{@link #getInverseJoinColumn() <em>Inverse Join Column</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getInverseJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> inverseJoinColumn;

  /**
   * The cached value of the '{@link #getUniqueConstraint() <em>Unique Constraint</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getUniqueConstraint()
   * @generated
   * @ordered
   */
  protected EList<UniqueConstraint> uniqueConstraint;

  /**
   * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCatalog()
   * @generated
   * @ordered
   */
  protected static final String CATALOG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCatalog()
   * @generated
   * @ordered
   */
  protected String catalog = CATALOG_EDEFAULT;

  /**
   * The default value of the '{@link #getCreationSuffix() <em>Creation Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCreationSuffix()
   * @generated
   * @ordered
   */
	protected static final String CREATION_SUFFIX_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getCreationSuffix() <em>Creation Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCreationSuffix()
   * @generated
   * @ordered
   */
	protected String creationSuffix = CREATION_SUFFIX_EDEFAULT;

		/**
   * This is true if the Creation Suffix attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean creationSuffixESet;

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
   * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected static final String SCHEMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected String schema = SCHEMA_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected JoinTableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getJoinTable();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinColumn> getJoinColumn() {
    if (joinColumn == null) {
      joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.JOIN_TABLE__JOIN_COLUMN);
    }
    return joinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinColumn> getInverseJoinColumn() {
    if (inverseJoinColumn == null) {
      inverseJoinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.JOIN_TABLE__INVERSE_JOIN_COLUMN);
    }
    return inverseJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<UniqueConstraint> getUniqueConstraint() {
    if (uniqueConstraint == null) {
      uniqueConstraint = new EObjectContainmentEList<UniqueConstraint>(UniqueConstraint.class, this, OrmPackage.JOIN_TABLE__UNIQUE_CONSTRAINT);
    }
    return uniqueConstraint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCatalog(String newCatalog) {
    String oldCatalog = catalog;
    catalog = newCatalog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.JOIN_TABLE__CATALOG, oldCatalog, catalog));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCreationSuffix() {
    return creationSuffix;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCreationSuffix(String newCreationSuffix) {
    String oldCreationSuffix = creationSuffix;
    creationSuffix = newCreationSuffix;
    boolean oldCreationSuffixESet = creationSuffixESet;
    creationSuffixESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.JOIN_TABLE__CREATION_SUFFIX, oldCreationSuffix, creationSuffix, !oldCreationSuffixESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetCreationSuffix() {
    String oldCreationSuffix = creationSuffix;
    boolean oldCreationSuffixESet = creationSuffixESet;
    creationSuffix = CREATION_SUFFIX_EDEFAULT;
    creationSuffixESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.JOIN_TABLE__CREATION_SUFFIX, oldCreationSuffix, CREATION_SUFFIX_EDEFAULT, oldCreationSuffixESet));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetCreationSuffix() {
    return creationSuffixESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.JOIN_TABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getSchema() {
    return schema;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(String newSchema) {
    String oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.JOIN_TABLE__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.JOIN_TABLE__JOIN_COLUMN:
        return ((InternalEList<?>)getJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmPackage.JOIN_TABLE__INVERSE_JOIN_COLUMN:
        return ((InternalEList<?>)getInverseJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmPackage.JOIN_TABLE__UNIQUE_CONSTRAINT:
        return ((InternalEList<?>)getUniqueConstraint()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.JOIN_TABLE__JOIN_COLUMN:
        return getJoinColumn();
      case OrmPackage.JOIN_TABLE__INVERSE_JOIN_COLUMN:
        return getInverseJoinColumn();
      case OrmPackage.JOIN_TABLE__UNIQUE_CONSTRAINT:
        return getUniqueConstraint();
      case OrmPackage.JOIN_TABLE__CATALOG:
        return getCatalog();
      case OrmPackage.JOIN_TABLE__CREATION_SUFFIX:
        return getCreationSuffix();
      case OrmPackage.JOIN_TABLE__NAME:
        return getName();
      case OrmPackage.JOIN_TABLE__SCHEMA:
        return getSchema();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.JOIN_TABLE__JOIN_COLUMN:
        getJoinColumn().clear();
        getJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
        return;
      case OrmPackage.JOIN_TABLE__INVERSE_JOIN_COLUMN:
        getInverseJoinColumn().clear();
        getInverseJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
        return;
      case OrmPackage.JOIN_TABLE__UNIQUE_CONSTRAINT:
        getUniqueConstraint().clear();
        getUniqueConstraint().addAll((Collection<? extends UniqueConstraint>)newValue);
        return;
      case OrmPackage.JOIN_TABLE__CATALOG:
        setCatalog((String)newValue);
        return;
      case OrmPackage.JOIN_TABLE__CREATION_SUFFIX:
        setCreationSuffix((String)newValue);
        return;
      case OrmPackage.JOIN_TABLE__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.JOIN_TABLE__SCHEMA:
        setSchema((String)newValue);
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
      case OrmPackage.JOIN_TABLE__JOIN_COLUMN:
        getJoinColumn().clear();
        return;
      case OrmPackage.JOIN_TABLE__INVERSE_JOIN_COLUMN:
        getInverseJoinColumn().clear();
        return;
      case OrmPackage.JOIN_TABLE__UNIQUE_CONSTRAINT:
        getUniqueConstraint().clear();
        return;
      case OrmPackage.JOIN_TABLE__CATALOG:
        setCatalog(CATALOG_EDEFAULT);
        return;
      case OrmPackage.JOIN_TABLE__CREATION_SUFFIX:
        unsetCreationSuffix();
        return;
      case OrmPackage.JOIN_TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.JOIN_TABLE__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
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
      case OrmPackage.JOIN_TABLE__JOIN_COLUMN:
        return joinColumn != null && !joinColumn.isEmpty();
      case OrmPackage.JOIN_TABLE__INVERSE_JOIN_COLUMN:
        return inverseJoinColumn != null && !inverseJoinColumn.isEmpty();
      case OrmPackage.JOIN_TABLE__UNIQUE_CONSTRAINT:
        return uniqueConstraint != null && !uniqueConstraint.isEmpty();
      case OrmPackage.JOIN_TABLE__CATALOG:
        return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
      case OrmPackage.JOIN_TABLE__CREATION_SUFFIX:
        return isSetCreationSuffix();
      case OrmPackage.JOIN_TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.JOIN_TABLE__SCHEMA:
        return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
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
    result.append(" (catalog: "); //$NON-NLS-1$
    result.append(catalog);
    result.append(", creationSuffix: "); //$NON-NLS-1$
    if (creationSuffixESet) result.append(creationSuffix); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", schema: "); //$NON-NLS-1$
    result.append(schema);
    result.append(')');
    return result.toString();
  }

} // JoinTableImpl