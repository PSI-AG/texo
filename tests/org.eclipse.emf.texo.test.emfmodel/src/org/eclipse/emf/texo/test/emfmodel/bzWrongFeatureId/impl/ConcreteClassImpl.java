/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass;
import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdPackage;
import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass;

import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;
import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl#getDb_Id <em>Db Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl#getDb_version <em>Db version</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl#getConcreteName <em>Concrete Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteClassImpl extends EObjectImpl implements ConcreteClass {
	/**
   * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
	protected static final String INTERFACE_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getDb_Id() <em>Db Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDb_Id()
   * @generated
   * @ordered
   */
	protected static final Long DB_ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDb_Id() <em>Db Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDb_Id()
   * @generated
   * @ordered
   */
	protected Long db_Id = DB_ID_EDEFAULT;

	/**
   * The default value of the '{@link #getDb_version() <em>Db version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDb_version()
   * @generated
   * @ordered
   */
	protected static final Integer DB_VERSION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDb_version() <em>Db version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDb_version()
   * @generated
   * @ordered
   */
	protected Integer db_version = DB_VERSION_EDEFAULT;

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
   * The default value of the '{@link #getConcreteName() <em>Concrete Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConcreteName()
   * @generated
   * @ordered
   */
	protected static final String CONCRETE_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getConcreteName() <em>Concrete Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConcreteName()
   * @generated
   * @ordered
   */
	protected String concreteName = CONCRETE_NAME_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ConcreteClassImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return BzWrongFeatureIdPackage.Literals.CONCRETE_CLASS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getInterfaceName() {
    return interfaceName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInterfaceName(String newInterfaceName) {
    String oldInterfaceName = interfaceName;
    interfaceName = newInterfaceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BzWrongFeatureIdPackage.CONCRETE_CLASS__INTERFACE_NAME, oldInterfaceName, interfaceName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Long getDb_Id() {
    return db_Id;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDb_Id(Long newDb_Id) {
    Long oldDb_Id = db_Id;
    db_Id = newDb_Id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID, oldDb_Id, db_Id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer getDb_version() {
    return db_version;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDb_version(Integer newDb_version) {
    Integer oldDb_version = db_version;
    db_version = newDb_version;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION, oldDb_version, db_version));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getConcreteName() {
    return concreteName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConcreteName(String newConcreteName) {
    String oldConcreteName = concreteName;
    concreteName = newConcreteName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BzWrongFeatureIdPackage.CONCRETE_CLASS__CONCRETE_NAME, oldConcreteName, concreteName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__INTERFACE_NAME:
        return getInterfaceName();
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID:
        return getDb_Id();
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION:
        return getDb_version();
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME:
        return getName();
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__CONCRETE_NAME:
        return getConcreteName();
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
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__INTERFACE_NAME:
        setInterfaceName((String)newValue);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID:
        setDb_Id((Long)newValue);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION:
        setDb_version((Integer)newValue);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME:
        setName((String)newValue);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__CONCRETE_NAME:
        setConcreteName((String)newValue);
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
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__INTERFACE_NAME:
        setInterfaceName(INTERFACE_NAME_EDEFAULT);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID:
        setDb_Id(DB_ID_EDEFAULT);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION:
        setDb_version(DB_VERSION_EDEFAULT);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__CONCRETE_NAME:
        setConcreteName(CONCRETE_NAME_EDEFAULT);
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
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__INTERFACE_NAME:
        return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID:
        return DB_ID_EDEFAULT == null ? db_Id != null : !DB_ID_EDEFAULT.equals(db_Id);
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION:
        return DB_VERSION_EDEFAULT == null ? db_version != null : !DB_VERSION_EDEFAULT.equals(db_version);
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BzWrongFeatureIdPackage.CONCRETE_CLASS__CONCRETE_NAME:
        return CONCRETE_NAME_EDEFAULT == null ? concreteName != null : !CONCRETE_NAME_EDEFAULT.equals(concreteName);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Identifiable.class) {
      switch (derivedFeatureID) {
        case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID: return IdentifiablePackage.IDENTIFIABLE__DB_ID;
        case BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION: return IdentifiablePackage.IDENTIFIABLE__DB_VERSION;
        default: return -1;
      }
    }
    if (baseClass == AbstractClass.class) {
      switch (derivedFeatureID) {
        case BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME: return BzWrongFeatureIdPackage.ABSTRACT_CLASS__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == Identifiable.class) {
      switch (baseFeatureID) {
        case IdentifiablePackage.IDENTIFIABLE__DB_ID: return BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_ID;
        case IdentifiablePackage.IDENTIFIABLE__DB_VERSION: return BzWrongFeatureIdPackage.CONCRETE_CLASS__DB_VERSION;
        default: return -1;
      }
    }
    if (baseClass == AbstractClass.class) {
      switch (baseFeatureID) {
        case BzWrongFeatureIdPackage.ABSTRACT_CLASS__NAME: return BzWrongFeatureIdPackage.CONCRETE_CLASS__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (interfaceName: ");
    result.append(interfaceName);
    result.append(", db_Id: ");
    result.append(db_Id);
    result.append(", db_version: ");
    result.append(db_version);
    result.append(", name: ");
    result.append(name);
    result.append(", concreteName: ");
    result.append(concreteName);
    result.append(')');
    return result.toString();
  }

} //ConcreteClassImpl
