package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.Loads;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Loads</b></em>'.
 * 
 * @generated
 */
public class LoadsDao extends BaseDao<Loads> {

  /**
   * @generated
   */
  @Override
  public Class<Loads> getEntityClass() {
    return Loads.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getLoadsEClass();
  }
}
