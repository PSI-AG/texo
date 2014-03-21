package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.DeployedComponent;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DeployedComponent</b></em>'.
 * 
 * @generated
 */
public class DeployedComponentDao extends BaseDao<DeployedComponent> {

  /**
   * @generated
   */
  @Override
  public Class<DeployedComponent> getEntityClass() {
    return DeployedComponent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getDeployedComponentEClass();
  }
}
