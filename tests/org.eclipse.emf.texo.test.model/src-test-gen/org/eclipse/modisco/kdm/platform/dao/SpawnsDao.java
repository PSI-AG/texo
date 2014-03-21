package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.Spawns;

/**
 * The Dao implementation for the model object '<em><b>Spawns</b></em>'.
 * 
 * @generated
 */
public class SpawnsDao extends BaseDao<Spawns> {

  /**
   * @generated
   */
  @Override
  public Class<Spawns> getEntityClass() {
    return Spawns.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getSpawnsEClass();
  }
}
