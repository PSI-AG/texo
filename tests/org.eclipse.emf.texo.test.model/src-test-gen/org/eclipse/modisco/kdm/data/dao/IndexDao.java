package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.Index;

/**
 * The Dao implementation for the model object '<em><b>Index</b></em>'.
 * 
 * @generated
 */
public class IndexDao extends BaseDao<Index> {

  /**
   * @generated
   */
  @Override
  public Class<Index> getEntityClass() {
    return Index.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getIndexEClass();
  }
}
