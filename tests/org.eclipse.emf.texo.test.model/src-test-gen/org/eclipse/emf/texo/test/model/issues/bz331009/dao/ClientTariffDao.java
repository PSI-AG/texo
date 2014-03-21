package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ClientTariff;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ClientTariff</b></em>'.
 * 
 * @generated
 */
public class ClientTariffDao extends BaseDao<ClientTariff> {

  /**
   * @generated
   */
  @Override
  public Class<ClientTariff> getEntityClass() {
    return ClientTariff.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getClientTariffEClass();
  }
}
