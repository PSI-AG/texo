package org.eclipse.emf.texo.test.model.issues.bz379796.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz379796.Bz379796ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379796.PriceType;

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
    return Bz379796ModelPackage.INSTANCE.getPriceTypeEClass();
  }
}
