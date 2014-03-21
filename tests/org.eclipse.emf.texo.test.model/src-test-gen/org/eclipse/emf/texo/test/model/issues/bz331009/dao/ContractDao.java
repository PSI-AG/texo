package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Contract;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Contract</b></em>'.
 * 
 * @generated
 */
public class ContractDao extends BaseDao<Contract> {

  /**
   * @generated
   */
  @Override
  public Class<Contract> getEntityClass() {
    return Contract.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getContractEClass();
  }
}
