package org.eclipse.emf.texo.test.model.samples.rental.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.rental.RentalCarDriver;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RentalCarDriver</b></em>'.
 * 
 * @generated
 */
public class RentalCarDriverDao extends BaseDao<RentalCarDriver> {

  /**
   * @generated
   */
  @Override
  public Class<RentalCarDriver> getEntityClass() {
    return RentalCarDriver.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RentalModelPackage.INSTANCE.getRentalCarDriverEClass();
  }
}
