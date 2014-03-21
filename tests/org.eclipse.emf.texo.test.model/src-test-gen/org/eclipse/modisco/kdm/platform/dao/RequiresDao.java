package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.Requires;

/**
 * The Dao implementation for the model object '<em><b>Requires</b></em>'.
 * 
 * @generated
 */
public class RequiresDao extends BaseDao<Requires> {

  /**
   * @generated
   */
  @Override
  public Class<Requires> getEntityClass() {
    return Requires.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getRequiresEClass();
  }
}
