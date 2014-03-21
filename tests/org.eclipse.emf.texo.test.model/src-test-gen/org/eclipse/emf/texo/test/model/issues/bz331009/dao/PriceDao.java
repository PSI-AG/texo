package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.Price;

/**
 * The Dao implementation for the model object '<em><b>Price</b></em>'.
 * 
 * @generated
 */
public class PriceDao extends BaseDao<Price> {

  /**
   * @generated
   */
  @Override
  public Class<Price> getEntityClass() {
    return Price.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getPriceEClass();
  }
}
