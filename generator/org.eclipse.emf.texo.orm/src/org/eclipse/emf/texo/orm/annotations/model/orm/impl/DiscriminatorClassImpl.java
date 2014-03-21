/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiscriminatorClassImpl.java,v 1.6 2011/10/25 13:21:27 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Discriminator Class</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.DiscriminatorClassImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.DiscriminatorClassImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscriminatorClassImpl extends BaseOrmAnnotationImpl implements DiscriminatorClass {
  /**
   * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminator()
   * @generated
   * @ordered
   */
  protected static final String DISCRIMINATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminator()
   * @generated
   * @ordered
   */
  protected String discriminator = DISCRIMINATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DiscriminatorClassImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getDiscriminatorClass();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDiscriminator() {
    return discriminator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminator(String newDiscriminator) {
    String oldDiscriminator = discriminator;
    discriminator = newDiscriminator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.DISCRIMINATOR_CLASS__DISCRIMINATOR, oldDiscriminator, discriminator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.DISCRIMINATOR_CLASS__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.DISCRIMINATOR_CLASS__DISCRIMINATOR:
        return getDiscriminator();
      case OrmPackage.DISCRIMINATOR_CLASS__VALUE:
        return getValue();
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
      case OrmPackage.DISCRIMINATOR_CLASS__DISCRIMINATOR:
        setDiscriminator((String)newValue);
        return;
      case OrmPackage.DISCRIMINATOR_CLASS__VALUE:
        setValue((String)newValue);
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
      case OrmPackage.DISCRIMINATOR_CLASS__DISCRIMINATOR:
        setDiscriminator(DISCRIMINATOR_EDEFAULT);
        return;
      case OrmPackage.DISCRIMINATOR_CLASS__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case OrmPackage.DISCRIMINATOR_CLASS__DISCRIMINATOR:
        return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
      case OrmPackage.DISCRIMINATOR_CLASS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (discriminator: "); //$NON-NLS-1$
    result.append(discriminator);
    result.append(", value: "); //$NON-NLS-1$
    result.append(value);
    result.append(')');
    return result.toString();
  }

} // DiscriminatorClassImpl
