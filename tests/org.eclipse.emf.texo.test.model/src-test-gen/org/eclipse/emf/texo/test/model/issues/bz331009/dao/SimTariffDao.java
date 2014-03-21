package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.SimTariff;

/**
 * The Dao implementation for the model object '<em><b>SimTariff</b></em>'.
 * 
 * @generated
 */
public class SimTariffDao extends BaseDao<SimTariff> {

  /**
   * @generated
   */
  @Override
  public Class<SimTariff> getEntityClass() {
    return SimTariff.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getSimTariffEClass();
  }
}
