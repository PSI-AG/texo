/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritanceImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance;
import org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Inheritance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.InheritanceImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritanceImpl extends BaseOrmAnnotationImpl implements Inheritance {
  /**
   * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected static final InheritanceType STRATEGY_EDEFAULT = InheritanceType.SINGLETABLE;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected InheritanceType strategy = STRATEGY_EDEFAULT;

  /**
   * This is true if the Strategy attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean strategyESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected InheritanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getInheritance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InheritanceType getStrategy() {
    return strategy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStrategy(InheritanceType newStrategy) {
    InheritanceType oldStrategy = strategy;
    strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
    boolean oldStrategyESet = strategyESet;
    strategyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.INHERITANCE__STRATEGY, oldStrategy, strategy, !oldStrategyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetStrategy() {
    InheritanceType oldStrategy = strategy;
    boolean oldStrategyESet = strategyESet;
    strategy = STRATEGY_EDEFAULT;
    strategyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.INHERITANCE__STRATEGY, oldStrategy, STRATEGY_EDEFAULT, oldStrategyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetStrategy() {
    return strategyESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.INHERITANCE__STRATEGY:
        return getStrategy();
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
      case OrmPackage.INHERITANCE__STRATEGY:
        setStrategy((InheritanceType)newValue);
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
      case OrmPackage.INHERITANCE__STRATEGY:
        unsetStrategy();
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
      case OrmPackage.INHERITANCE__STRATEGY:
        return isSetStrategy();
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
    result.append(" (strategy: "); //$NON-NLS-1$
    if (strategyESet) result.append(strategy); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // InheritanceImpl
