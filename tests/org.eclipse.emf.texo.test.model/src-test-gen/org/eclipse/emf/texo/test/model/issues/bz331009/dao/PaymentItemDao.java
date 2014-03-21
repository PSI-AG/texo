package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.PaymentItem;

/**
 * The Dao implementation for the model object '<em><b>PaymentItem</b></em>'.
 * 
 * @generated
 */
public class PaymentItemDao extends BaseDao<PaymentItem> {

  /**
   * @generated
   */
  @Override
  public Class<PaymentItem> getEntityClass() {
    return PaymentItem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getPaymentItemEClass();
  }
}
