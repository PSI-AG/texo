package org.eclipse.emf.texo.test.model.samples.rental.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.rental.RentalBicycle;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RentalBicycle</b></em>'.
 * 
 * @generated
 */
public class RentalBicycleDao extends BaseDao<RentalBicycle> {

  /**
   * @generated
   */
  @Override
  public Class<RentalBicycle> getEntityClass() {
    return RentalBicycle.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RentalModelPackage.INSTANCE.getRentalBicycleEClass();
  }
}
