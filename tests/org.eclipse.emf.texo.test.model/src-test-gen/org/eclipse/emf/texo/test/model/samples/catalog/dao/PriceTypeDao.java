package org.eclipse.emf.texo.test.model.samples.catalog.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.PriceType;

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
    return CatalogModelPackage.INSTANCE.getPriceTypeEClass();
  }
}
