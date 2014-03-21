package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ContractPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ContractPackage</b></em>'.
 * 
 * @generated
 */
public class ContractPackageDao extends BaseDao<ContractPackage> {

  /**
   * @generated
   */
  @Override
  public Class<ContractPackage> getEntityClass() {
    return ContractPackage.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getContractPackageEClass();
  }
}
