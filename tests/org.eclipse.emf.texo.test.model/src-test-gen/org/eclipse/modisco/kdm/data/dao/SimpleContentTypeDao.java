package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.SimpleContentType;

/**
 * The Dao implementation for the model object '<em><b>SimpleContentType</b></em>'.
 * 
 * @generated
 */
public class SimpleContentTypeDao extends BaseDao<SimpleContentType> {

  /**
   * @generated
   */
  @Override
  public Class<SimpleContentType> getEntityClass() {
    return SimpleContentType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getSimpleContentTypeEClass();
  }
}
