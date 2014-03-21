package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.BalanceAccount;

/**
 * The Dao implementation for the model object '<em><b>BalanceAccount</b></em>'.
 * 
 * @generated
 */
public class BalanceAccountDao extends BaseDao<BalanceAccount> {

  /**
   * @generated
   */
  @Override
  public Class<BalanceAccount> getEntityClass() {
    return BalanceAccount.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getBalanceAccountEClass();
  }
}
