package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.PLAccount;

/**
 * The Dao implementation for the model object '<em><b>PLAccount</b></em>'.
 * 
 * @generated
 */
public class PLAccountDao extends BaseDao<PLAccount> {

  /**
   * @generated
   */
  @Override
  public Class<PLAccount> getEntityClass() {
    return PLAccount.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getPLAccountEClass();
  }
}
