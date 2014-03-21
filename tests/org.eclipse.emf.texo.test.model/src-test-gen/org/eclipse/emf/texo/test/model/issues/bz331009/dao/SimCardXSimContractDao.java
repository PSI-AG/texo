package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.SimCardXSimContract;

/**
 * The Dao implementation for the model object '<em><b>SimCardXSimContract</b></em>'.
 * 
 * @generated
 */
public class SimCardXSimContractDao extends BaseDao<SimCardXSimContract> {

  /**
   * @generated
   */
  @Override
  public Class<SimCardXSimContract> getEntityClass() {
    return SimCardXSimContract.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getSimCardXSimContractEClass();
  }
}
