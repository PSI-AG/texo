package org.eclipse.emf.texo.test.model.samples.catalog.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.ProductType;

/**
 * The Dao implementation for the model object '<em><b>ProductType</b></em>'.
 * 
 * @generated
 */
public class ProductTypeDao extends BaseDao<ProductType> {

  /**
   * @generated
   */
  @Override
  public Class<ProductType> getEntityClass() {
    return ProductType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CatalogModelPackage.INSTANCE.getProductTypeEClass();
  }
}
