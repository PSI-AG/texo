package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.Tariff;

/**
 * The Dao implementation for the model object '<em><b>Tariff</b></em>'.
 * 
 * @generated
 */
public class TariffDao extends BaseDao<Tariff> {

  /**
   * @generated
   */
  @Override
  public Class<Tariff> getEntityClass() {
    return Tariff.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getTariffEClass();
  }
}
