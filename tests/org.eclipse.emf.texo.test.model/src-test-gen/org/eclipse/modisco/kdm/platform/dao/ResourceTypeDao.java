package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.ResourceType;

/**
 * The Dao implementation for the model object '<em><b>ResourceType</b></em>'.
 * 
 * @generated
 */
public class ResourceTypeDao extends BaseDao<ResourceType> {

  /**
   * @generated
   */
  @Override
  public Class<ResourceType> getEntityClass() {
    return ResourceType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getResourceTypeEClass();
  }
}
