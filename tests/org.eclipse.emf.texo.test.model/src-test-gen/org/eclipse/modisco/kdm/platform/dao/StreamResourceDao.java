package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.StreamResource;

/**
 * The Dao implementation for the model object '<em><b>StreamResource</b></em>'.
 * 
 * @generated
 */
public class StreamResourceDao extends BaseDao<StreamResource> {

  /**
   * @generated
   */
  @Override
  public Class<StreamResource> getEntityClass() {
    return StreamResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getStreamResourceEClass();
  }
}
