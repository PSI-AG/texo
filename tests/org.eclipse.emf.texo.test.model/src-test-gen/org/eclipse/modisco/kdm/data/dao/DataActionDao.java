package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataAction;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DataAction</b></em>'.
 * 
 * @generated
 */
public class DataActionDao extends BaseDao<DataAction> {

  /**
   * @generated
   */
  @Override
  public Class<DataAction> getEntityClass() {
    return DataAction.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataActionEClass();
  }
}
