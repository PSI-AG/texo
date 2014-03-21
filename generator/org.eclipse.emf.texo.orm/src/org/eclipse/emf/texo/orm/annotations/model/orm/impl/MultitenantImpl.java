/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant;
import org.eclipse.emf.texo.orm.annotations.model.orm.MultitenantType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Multitenant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MultitenantImpl#getTenantDiscriminator <em>Tenant Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MultitenantImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultitenantImpl extends BaseOrmAnnotationImpl implements Multitenant {
  /**
   * The cached value of the '{@link #getTenantDiscriminator() <em>Tenant Discriminator</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTenantDiscriminator()
   * @generated
   * @ordered
   */
  protected EList<TenantDiscriminator> tenantDiscriminator;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final MultitenantType TYPE_EDEFAULT = MultitenantType.SINGLETABLE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected MultitenantType type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MultitenantImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getMultitenant();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<TenantDiscriminator> getTenantDiscriminator() {
    if (tenantDiscriminator == null) {
      tenantDiscriminator = new EObjectContainmentEList<TenantDiscriminator>(TenantDiscriminator.class, this, OrmPackage.MULTITENANT__TENANT_DISCRIMINATOR);
    }
    return tenantDiscriminator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MultitenantType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(MultitenantType newType) {
    MultitenantType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MULTITENANT__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    MultitenantType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MULTITENANT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType() {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.MULTITENANT__TENANT_DISCRIMINATOR:
        return ((InternalEList<?>)getTenantDiscriminator()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.MULTITENANT__TENANT_DISCRIMINATOR:
        return getTenantDiscriminator();
      case OrmPackage.MULTITENANT__TYPE:
        return getType();
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
      case OrmPackage.MULTITENANT__TENANT_DISCRIMINATOR:
        getTenantDiscriminator().clear();
        getTenantDiscriminator().addAll((Collection<? extends TenantDiscriminator>)newValue);
        return;
      case OrmPackage.MULTITENANT__TYPE:
        setType((MultitenantType)newValue);
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
      case OrmPackage.MULTITENANT__TENANT_DISCRIMINATOR:
        getTenantDiscriminator().clear();
        return;
      case OrmPackage.MULTITENANT__TYPE:
        unsetType();
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
      case OrmPackage.MULTITENANT__TENANT_DISCRIMINATOR:
        return tenantDiscriminator != null && !tenantDiscriminator.isEmpty();
      case OrmPackage.MULTITENANT__TYPE:
        return isSetType();
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
    result.append(" (type: "); //$NON-NLS-1$
    if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getMultitenant_Type());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }

} // MultitenantImpl
