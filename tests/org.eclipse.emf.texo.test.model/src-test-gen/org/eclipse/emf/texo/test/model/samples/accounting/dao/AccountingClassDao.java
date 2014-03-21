package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingClass;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Accounting</b></em>'.
 * 
 * @generated
 */
public class AccountingClassDao extends BaseDao<AccountingClass> {

  /**
   * @generated
   */
  @Override
  public Class<AccountingClass> getEntityClass() {
    return AccountingClass.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getAccountingEClass();
  }
}
