package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.DeployedSoftwareSystem;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DeployedSoftwareSystem</b></em>'.
 * 
 * @generated
 */
public class DeployedSoftwareSystemDao extends BaseDao<DeployedSoftwareSystem> {

  /**
   * @generated
   */
  @Override
  public Class<DeployedSoftwareSystem> getEntityClass() {
    return DeployedSoftwareSystem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getDeployedSoftwareSystemEClass();
  }
}
