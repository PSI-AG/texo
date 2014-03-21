package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.SimContract;

/**
 * The Dao implementation for the model object '<em><b>SimContract</b></em>'.
 * 
 * @generated
 */
public class SimContractDao extends BaseDao<SimContract> {

  /**
   * @generated
   */
  @Override
  public Class<SimContract> getEntityClass() {
    return SimContract.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getSimContractEClass();
  }
}
