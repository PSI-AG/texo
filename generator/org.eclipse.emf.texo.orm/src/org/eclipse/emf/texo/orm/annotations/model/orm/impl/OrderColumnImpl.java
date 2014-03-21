/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderColumnImpl.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Order Column</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl#getCorrectionType <em>Correction Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl#isUpdatable <em>Updatable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderColumnImpl extends BaseOrmAnnotationImpl implements OrderColumn {
  /**
   * The default value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumnDefinition()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_DEFINITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumnDefinition()
   * @generated
   * @ordered
   */
  protected String columnDefinition = COLUMN_DEFINITION_EDEFAULT;

  /**
   * The default value of the '{@link #getCorrectionType() <em>Correction Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrectionType()
   * @generated
   * @ordered
   */
  protected static final OrderColumnCorrectionType CORRECTION_TYPE_EDEFAULT = OrderColumnCorrectionType.READ;

  /**
   * The cached value of the '{@link #getCorrectionType() <em>Correction Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrectionType()
   * @generated
   * @ordered
   */
  protected OrderColumnCorrectionType correctionType = CORRECTION_TYPE_EDEFAULT;

  /**
   * This is true if the Correction Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean correctionTypeESet;

  /**
   * The default value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isInsertable()
   * @generated
   * @ordered
   */
  protected static final boolean INSERTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isInsertable()
   * @generated
   * @ordered
   */
  protected boolean insertable = INSERTABLE_EDEFAULT;

  /**
   * This is true if the Insertable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean insertableESet;

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
   * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected static final boolean NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected boolean nullable = NULLABLE_EDEFAULT;

  /**
   * This is true if the Nullable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean nullableESet;

  /**
   * The default value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUpdatable()
   * @generated
   * @ordered
   */
  protected static final boolean UPDATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUpdatable()
   * @generated
   * @ordered
   */
  protected boolean updatable = UPDATABLE_EDEFAULT;

  /**
   * This is true if the Updatable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean updatableESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected OrderColumnImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getOrderColumn();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getColumnDefinition() {
    return columnDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColumnDefinition(String newColumnDefinition) {
    String oldColumnDefinition = columnDefinition;
    columnDefinition = newColumnDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORDER_COLUMN__COLUMN_DEFINITION, oldColumnDefinition, columnDefinition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumnCorrectionType getCorrectionType() {
    return correctionType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCorrectionType(OrderColumnCorrectionType newCorrectionType) {
    OrderColumnCorrectionType oldCorrectionType = correctionType;
    correctionType = newCorrectionType == null ? CORRECTION_TYPE_EDEFAULT : newCorrectionType;
    boolean oldCorrectionTypeESet = correctionTypeESet;
    correctionTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORDER_COLUMN__CORRECTION_TYPE, oldCorrectionType, correctionType, !oldCorrectionTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCorrectionType() {
    OrderColumnCorrectionType oldCorrectionType = correctionType;
    boolean oldCorrectionTypeESet = correctionTypeESet;
    correctionType = CORRECTION_TYPE_EDEFAULT;
    correctionTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ORDER_COLUMN__CORRECTION_TYPE, oldCorrectionType, CORRECTION_TYPE_EDEFAULT, oldCorrectionTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCorrectionType() {
    return correctionTypeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isInsertable() {
    return insertable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInsertable(boolean newInsertable) {
    boolean oldInsertable = insertable;
    insertable = newInsertable;
    boolean oldInsertableESet = insertableESet;
    insertableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORDER_COLUMN__INSERTABLE, oldInsertable, insertable, !oldInsertableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetInsertable() {
    boolean oldInsertable = insertable;
    boolean oldInsertableESet = insertableESet;
    insertable = INSERTABLE_EDEFAULT;
    insertableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ORDER_COLUMN__INSERTABLE, oldInsertable, INSERTABLE_EDEFAULT, oldInsertableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetInsertable() {
    return insertableESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORDER_COLUMN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullable() {
    return nullable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(boolean newNullable) {
    boolean oldNullable = nullable;
    nullable = newNullable;
    boolean oldNullableESet = nullableESet;
    nullableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORDER_COLUMN__NULLABLE, oldNullable, nullable, !oldNullableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNullable() {
    boolean oldNullable = nullable;
    boolean oldNullableESet = nullableESet;
    nullable = NULLABLE_EDEFAULT;
    nullableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ORDER_COLUMN__NULLABLE, oldNullable, NULLABLE_EDEFAULT, oldNullableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNullable() {
    return nullableESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isUpdatable() {
    return updatable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUpdatable(boolean newUpdatable) {
    boolean oldUpdatable = updatable;
    updatable = newUpdatable;
    boolean oldUpdatableESet = updatableESet;
    updatableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORDER_COLUMN__UPDATABLE, oldUpdatable, updatable, !oldUpdatableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetUpdatable() {
    boolean oldUpdatable = updatable;
    boolean oldUpdatableESet = updatableESet;
    updatable = UPDATABLE_EDEFAULT;
    updatableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ORDER_COLUMN__UPDATABLE, oldUpdatable, UPDATABLE_EDEFAULT, oldUpdatableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetUpdatable() {
    return updatableESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ORDER_COLUMN__COLUMN_DEFINITION:
        return getColumnDefinition();
      case OrmPackage.ORDER_COLUMN__CORRECTION_TYPE:
        return getCorrectionType();
      case OrmPackage.ORDER_COLUMN__INSERTABLE:
        return isInsertable();
      case OrmPackage.ORDER_COLUMN__NAME:
        return getName();
      case OrmPackage.ORDER_COLUMN__NULLABLE:
        return isNullable();
      case OrmPackage.ORDER_COLUMN__UPDATABLE:
        return isUpdatable();
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
      case OrmPackage.ORDER_COLUMN__COLUMN_DEFINITION:
        setColumnDefinition((String)newValue);
        return;
      case OrmPackage.ORDER_COLUMN__CORRECTION_TYPE:
        setCorrectionType((OrderColumnCorrectionType)newValue);
        return;
      case OrmPackage.ORDER_COLUMN__INSERTABLE:
        setInsertable((Boolean)newValue);
        return;
      case OrmPackage.ORDER_COLUMN__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.ORDER_COLUMN__NULLABLE:
        setNullable((Boolean)newValue);
        return;
      case OrmPackage.ORDER_COLUMN__UPDATABLE:
        setUpdatable((Boolean)newValue);
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
      case OrmPackage.ORDER_COLUMN__COLUMN_DEFINITION:
        setColumnDefinition(COLUMN_DEFINITION_EDEFAULT);
        return;
      case OrmPackage.ORDER_COLUMN__CORRECTION_TYPE:
        unsetCorrectionType();
        return;
      case OrmPackage.ORDER_COLUMN__INSERTABLE:
        unsetInsertable();
        return;
      case OrmPackage.ORDER_COLUMN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.ORDER_COLUMN__NULLABLE:
        unsetNullable();
        return;
      case OrmPackage.ORDER_COLUMN__UPDATABLE:
        unsetUpdatable();
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
      case OrmPackage.ORDER_COLUMN__COLUMN_DEFINITION:
        return COLUMN_DEFINITION_EDEFAULT == null ? columnDefinition != null : !COLUMN_DEFINITION_EDEFAULT.equals(columnDefinition);
      case OrmPackage.ORDER_COLUMN__CORRECTION_TYPE:
        return isSetCorrectionType();
      case OrmPackage.ORDER_COLUMN__INSERTABLE:
        return isSetInsertable();
      case OrmPackage.ORDER_COLUMN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.ORDER_COLUMN__NULLABLE:
        return isSetNullable();
      case OrmPackage.ORDER_COLUMN__UPDATABLE:
        return isSetUpdatable();
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
    result.append(" (columnDefinition: "); //$NON-NLS-1$
    result.append(columnDefinition);
    result.append(", correctionType: "); //$NON-NLS-1$
    if (correctionTypeESet) result.append(correctionType); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", insertable: "); //$NON-NLS-1$
    if (insertableESet) result.append(insertable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", nullable: "); //$NON-NLS-1$
    if (nullableESet) result.append(nullable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", updatable: "); //$NON-NLS-1$
    if (updatableESet) result.append(updatable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // OrderColumnImpl
