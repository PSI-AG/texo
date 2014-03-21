package org.eclipse.emf.texo.test.model.samples.rental.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.rental.RentalContractLine;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RentalContractLine</b></em>'.
 * 
 * @generated
 */
public class RentalContractLineDao extends BaseDao<RentalContractLine> {

  /**
   * @generated
   */
  @Override
  public Class<RentalContractLine> getEntityClass() {
    return RentalContractLine.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RentalModelPackage.INSTANCE.getRentalContractLineEClass();
  }
}
