package org.eclipse.emf.texo.test.model.samples.rental.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.rental.RentalCar;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RentalCar</b></em>'.
 * 
 * @generated
 */
public class RentalCarDao extends BaseDao<RentalCar> {

  /**
   * @generated
   */
  @Override
  public Class<RentalCar> getEntityClass() {
    return RentalCar.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RentalModelPackage.INSTANCE.getRentalCarEClass();
  }
}
