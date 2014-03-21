package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.MessagingResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>MessagingResource</b></em>'.
 * 
 * @generated
 */
public class MessagingResourceDao extends BaseDao<MessagingResource> {

  /**
   * @generated
   */
  @Override
  public Class<MessagingResource> getEntityClass() {
    return MessagingResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getMessagingResourceEClass();
  }
}
