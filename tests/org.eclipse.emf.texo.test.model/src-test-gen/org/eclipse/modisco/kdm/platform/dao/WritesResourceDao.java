package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.WritesResource;

/**
 * The Dao implementation for the model object '<em><b>WritesResource</b></em>'.
 * 
 * @generated
 */
public class WritesResourceDao extends BaseDao<WritesResource> {

  /**
   * @generated
   */
  @Override
  public Class<WritesResource> getEntityClass() {
    return WritesResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getWritesResourceEClass();
  }
}
