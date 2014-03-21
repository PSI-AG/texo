package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.IndexElement;

/**
 * The Dao implementation for the model object '<em><b>IndexElement</b></em>'.
 * 
 * @generated
 */
public class IndexElementDao extends BaseDao<IndexElement> {

  /**
   * @generated
   */
  @Override
  public Class<IndexElement> getEntityClass() {
    return IndexElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getIndexElementEClass();
  }
}
