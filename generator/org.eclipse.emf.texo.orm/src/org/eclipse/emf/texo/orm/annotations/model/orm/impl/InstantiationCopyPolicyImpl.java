/**
 * <copyright>
 * </copyright>
 *
 * $Id: InstantiationCopyPolicyImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Instantiation Copy Policy</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InstantiationCopyPolicyImpl extends BaseOrmAnnotationImpl implements InstantiationCopyPolicy {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected InstantiationCopyPolicyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getInstantiationCopyPolicy();
  }

} // InstantiationCopyPolicyImpl
