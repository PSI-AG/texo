package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.Account;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Account</b></em>'.
 * 
 * @generated
 */
public class AccountDao extends BaseDao<Account> {

  /**
   * @generated
   */
  @Override
  public Class<Account> getEntityClass() {
    return Account.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getAccountEClass();
  }
}
