package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.LockResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>LockResource</b></em>'.
 * 
 * @generated
 */
public class LockResourceDao extends BaseDao<LockResource> {

  /**
   * @generated
   */
  @Override
  public Class<LockResource> getEntityClass() {
    return LockResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getLockResourceEClass();
  }
}
