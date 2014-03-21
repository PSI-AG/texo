package org.eclipse.emf.texo.test.model.samples.sunbooks.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.PromotionType;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PromotionType</b></em>'.
 * 
 * @generated
 */
public class PromotionTypeDao extends BaseDao<PromotionType> {

  /**
   * @generated
   */
  @Override
  public Class<PromotionType> getEntityClass() {
    return PromotionType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SunBooksModelPackage.INSTANCE.getPromotionTypeEClass();
  }
}
