package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.DeployedResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DeployedResource</b></em>'.
 * 
 * @generated
 */
public class DeployedResourceDao extends BaseDao<DeployedResource> {

  /**
   * @generated
   */
  @Override
  public Class<DeployedResource> getEntityClass() {
    return DeployedResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getDeployedResourceEClass();
  }
}
