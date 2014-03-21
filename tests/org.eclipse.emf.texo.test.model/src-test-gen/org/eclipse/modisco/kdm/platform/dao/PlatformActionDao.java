package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformAction;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PlatformAction</b></em>'.
 * 
 * @generated
 */
public class PlatformActionDao extends BaseDao<PlatformAction> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformAction> getEntityClass() {
    return PlatformAction.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getPlatformActionEClass();
  }
}
