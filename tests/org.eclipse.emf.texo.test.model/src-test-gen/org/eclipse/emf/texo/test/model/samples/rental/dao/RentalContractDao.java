package org.eclipse.emf.texo.test.model.samples.rental.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.rental.RentalContract;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RentalContract</b></em>'.
 * 
 * @generated
 */
public class RentalContractDao extends BaseDao<RentalContract> {

  /**
   * @generated
   */
  @Override
  public Class<RentalContract> getEntityClass() {
    return RentalContract.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RentalModelPackage.INSTANCE.getRentalContractEClass();
  }
}
