/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeConverterImpl.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Type Converter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TypeConverterImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TypeConverterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TypeConverterImpl#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConverterImpl extends BaseOrmAnnotationImpl implements TypeConverter {
  /**
   * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected static final String DATA_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected String dataType = DATA_TYPE_EDEFAULT;

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
   * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected String objectType = OBJECT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TypeConverterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getTypeConverter();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(String newDataType) {
    String oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TYPE_CONVERTER__DATA_TYPE, oldDataType, dataType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TYPE_CONVERTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getObjectType() {
    return objectType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setObjectType(String newObjectType) {
    String oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TYPE_CONVERTER__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.TYPE_CONVERTER__DATA_TYPE:
        return getDataType();
      case OrmPackage.TYPE_CONVERTER__NAME:
        return getName();
      case OrmPackage.TYPE_CONVERTER__OBJECT_TYPE:
        return getObjectType();
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
      case OrmPackage.TYPE_CONVERTER__DATA_TYPE:
        setDataType((String)newValue);
        return;
      case OrmPackage.TYPE_CONVERTER__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.TYPE_CONVERTER__OBJECT_TYPE:
        setObjectType((String)newValue);
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
      case OrmPackage.TYPE_CONVERTER__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case OrmPackage.TYPE_CONVERTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.TYPE_CONVERTER__OBJECT_TYPE:
        setObjectType(OBJECT_TYPE_EDEFAULT);
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
      case OrmPackage.TYPE_CONVERTER__DATA_TYPE:
        return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
      case OrmPackage.TYPE_CONVERTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.TYPE_CONVERTER__OBJECT_TYPE:
        return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
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
    result.append(" (dataType: "); //$NON-NLS-1$
    result.append(dataType);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", objectType: "); //$NON-NLS-1$
    result.append(objectType);
    result.append(')');
    return result.toString();
  }

} // TypeConverterImpl
