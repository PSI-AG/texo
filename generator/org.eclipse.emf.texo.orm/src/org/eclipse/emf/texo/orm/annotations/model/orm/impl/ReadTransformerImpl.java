/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReadTransformerImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Read Transformer</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ReadTransformerImpl#getMethod <em>Method</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ReadTransformerImpl#getTransformerClass <em>
 * Transformer Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReadTransformerImpl extends BaseOrmAnnotationImpl implements ReadTransformer {
  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getTransformerClass() <em>Transformer Class</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTransformerClass()
   * @generated
   * @ordered
   */
  protected static final String TRANSFORMER_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransformerClass() <em>Transformer Class</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTransformerClass()
   * @generated
   * @ordered
   */
  protected String transformerClass = TRANSFORMER_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ReadTransformerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getReadTransformer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getMethod() {
    return method;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod) {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.READ_TRANSFORMER__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTransformerClass() {
    return transformerClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTransformerClass(String newTransformerClass) {
    String oldTransformerClass = transformerClass;
    transformerClass = newTransformerClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.READ_TRANSFORMER__TRANSFORMER_CLASS, oldTransformerClass, transformerClass));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.READ_TRANSFORMER__METHOD:
        return getMethod();
      case OrmPackage.READ_TRANSFORMER__TRANSFORMER_CLASS:
        return getTransformerClass();
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
      case OrmPackage.READ_TRANSFORMER__METHOD:
        setMethod((String)newValue);
        return;
      case OrmPackage.READ_TRANSFORMER__TRANSFORMER_CLASS:
        setTransformerClass((String)newValue);
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
      case OrmPackage.READ_TRANSFORMER__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case OrmPackage.READ_TRANSFORMER__TRANSFORMER_CLASS:
        setTransformerClass(TRANSFORMER_CLASS_EDEFAULT);
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
      case OrmPackage.READ_TRANSFORMER__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case OrmPackage.READ_TRANSFORMER__TRANSFORMER_CLASS:
        return TRANSFORMER_CLASS_EDEFAULT == null ? transformerClass != null : !TRANSFORMER_CLASS_EDEFAULT.equals(transformerClass);
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
    result.append(" (method: "); //$NON-NLS-1$
    result.append(method);
    result.append(", transformerClass: "); //$NON-NLS-1$
    result.append(transformerClass);
    result.append(')');
    return result.toString();
  }

} // ReadTransformerImpl
