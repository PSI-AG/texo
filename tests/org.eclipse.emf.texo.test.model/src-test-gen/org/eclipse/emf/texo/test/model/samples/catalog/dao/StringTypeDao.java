package org.eclipse.emf.texo.test.model.samples.catalog.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.StringType;

/**
 * The Dao implementation for the model object '<em><b>StringType</b></em>'.
 * 
 * @generated
 */
public class StringTypeDao extends BaseDao<StringType> {

  /**
   * @generated
   */
  @Override
  public Class<StringType> getEntityClass() {
    return StringType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CatalogModelPackage.INSTANCE.getStringTypeEClass();
  }
}
