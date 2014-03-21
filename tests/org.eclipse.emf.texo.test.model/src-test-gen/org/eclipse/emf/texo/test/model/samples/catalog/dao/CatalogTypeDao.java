package org.eclipse.emf.texo.test.model.samples.catalog.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogType;

/**
 * The Dao implementation for the model object '<em><b>CatalogType</b></em>'.
 * 
 * @generated
 */
public class CatalogTypeDao extends BaseDao<CatalogType> {

  /**
   * @generated
   */
  @Override
  public Class<CatalogType> getEntityClass() {
    return CatalogType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CatalogModelPackage.INSTANCE.getCatalogTypeEClass();
  }
}
