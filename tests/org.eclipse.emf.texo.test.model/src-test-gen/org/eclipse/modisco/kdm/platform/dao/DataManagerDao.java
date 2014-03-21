package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.DataManager;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DataManager</b></em>'.
 * 
 * @generated
 */
public class DataManagerDao extends BaseDao<DataManager> {

  /**
   * @generated
   */
  @Override
  public Class<DataManager> getEntityClass() {
    return DataManager.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getDataManagerEClass();
  }
}
