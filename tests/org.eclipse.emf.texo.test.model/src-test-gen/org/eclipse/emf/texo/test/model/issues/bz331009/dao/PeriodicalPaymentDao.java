package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.PeriodicalPayment;

/**
 * The Dao implementation for the model object '<em><b>PeriodicalPayment</b></em>'.
 * 
 * @generated
 */
public class PeriodicalPaymentDao extends BaseDao<PeriodicalPayment> {

  /**
   * @generated
   */
  @Override
  public Class<PeriodicalPayment> getEntityClass() {
    return PeriodicalPayment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getPeriodicalPaymentEClass();
  }
}
