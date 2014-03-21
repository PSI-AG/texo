package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountGroup;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AccountGroup</b></em>'.
 * 
 * @generated
 */
public class AccountGroupDao extends BaseDao<AccountGroup> {

  /**
   * @generated
   */
  @Override
  public Class<AccountGroup> getEntityClass() {
    return AccountGroup.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getAccountGroupEClass();
  }
}
