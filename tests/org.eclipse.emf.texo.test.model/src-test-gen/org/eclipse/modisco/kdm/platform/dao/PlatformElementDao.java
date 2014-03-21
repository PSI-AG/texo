package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformElement;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PlatformElement</b></em>'.
 * 
 * @generated
 */
public class PlatformElementDao extends BaseDao<PlatformElement> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformElement> getEntityClass() {
    return PlatformElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getPlatformElementEClass();
  }
}
