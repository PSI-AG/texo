package org.eclipse.emf.texo.test.model.samples.rental.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.rental.RentalBusiness;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RentalBusiness</b></em>'.
 * 
 * @generated
 */
public class RentalBusinessDao extends BaseDao<RentalBusiness> {

  /**
   * @generated
   */
  @Override
  public Class<RentalBusiness> getEntityClass() {
    return RentalBusiness.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RentalModelPackage.INSTANCE.getRentalBusinessEClass();
  }
}
