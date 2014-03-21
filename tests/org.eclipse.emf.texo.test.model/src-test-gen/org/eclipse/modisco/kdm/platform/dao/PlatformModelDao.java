package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModel;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PlatformModel</b></em>'.
 * 
 * @generated
 */
public class PlatformModelDao extends BaseDao<PlatformModel> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformModel> getEntityClass() {
    return PlatformModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getPlatformModelEClass();
  }
}
