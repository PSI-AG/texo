package org.eclipse.emf.texo.test.model.samples.sunbooks.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.CollectionType;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CollectionType</b></em>'.
 * 
 * @generated
 */
public class CollectionTypeDao extends BaseDao<CollectionType> {

  /**
   * @generated
   */
  @Override
  public Class<CollectionType> getEntityClass() {
    return CollectionType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SunBooksModelPackage.INSTANCE.getCollectionTypeEClass();
  }
}
