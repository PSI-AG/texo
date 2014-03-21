package org.eclipse.emf.texo.test.model.samples.catalog.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.SupplierType;

/**
 * The Dao implementation for the model object '<em><b>SupplierType</b></em>'.
 * 
 * @generated
 */
public class SupplierTypeDao extends BaseDao<SupplierType> {

  /**
   * @generated
   */
  @Override
  public Class<SupplierType> getEntityClass() {
    return SupplierType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CatalogModelPackage.INSTANCE.getSupplierTypeEClass();
  }
}
