package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.ManagesResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ManagesResource</b></em>'.
 * 
 * @generated
 */
public class ManagesResourceDao extends BaseDao<ManagesResource> {

  /**
   * @generated
   */
  @Override
  public Class<ManagesResource> getEntityClass() {
    return ManagesResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getManagesResourceEClass();
  }
}
