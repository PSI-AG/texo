package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformEvent;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PlatformEvent</b></em>'.
 * 
 * @generated
 */
public class PlatformEventDao extends BaseDao<PlatformEvent> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformEvent> getEntityClass() {
    return PlatformEvent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getPlatformEventEClass();
  }
}
