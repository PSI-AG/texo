package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.OneTimePayment;

/**
 * The Dao implementation for the model object '<em><b>OneTimePayment</b></em>'.
 * 
 * @generated
 */
public class OneTimePaymentDao extends BaseDao<OneTimePayment> {

  /**
   * @generated
   */
  @Override
  public Class<OneTimePayment> getEntityClass() {
    return OneTimePayment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getOneTimePaymentEClass();
  }
}
