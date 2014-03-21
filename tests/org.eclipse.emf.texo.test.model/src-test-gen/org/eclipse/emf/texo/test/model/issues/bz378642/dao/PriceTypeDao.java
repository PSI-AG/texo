package org.eclipse.emf.texo.test.model.issues.bz378642.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz378642.Bz378642ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz378642.PriceType;

/**
 * The Dao implementation for the model object '<em><b>PriceType</b></em>'.
 * 
 * @generated
 */
public class PriceTypeDao extends BaseDao<PriceType> {

  /**
   * @generated
   */
  @Override
  public Class<PriceType> getEntityClass() {
    return PriceType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz378642ModelPackage.INSTANCE.getPriceTypeEClass();
  }
}
