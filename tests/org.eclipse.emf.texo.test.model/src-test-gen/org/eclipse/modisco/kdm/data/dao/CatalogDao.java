package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.Catalog;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Catalog</b></em>'.
 * 
 * @generated
 */
public class CatalogDao extends BaseDao<Catalog> {

  /**
   * @generated
   */
  @Override
  public Class<Catalog> getEntityClass() {
    return Catalog.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getCatalogEClass();
  }
}
