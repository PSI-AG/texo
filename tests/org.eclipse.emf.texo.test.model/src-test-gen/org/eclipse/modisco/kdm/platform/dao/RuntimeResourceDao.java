package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.RuntimeResource;

/**
 * The Dao implementation for the model object '<em><b>RuntimeResource</b></em>'.
 * 
 * @generated
 */
public class RuntimeResourceDao extends BaseDao<RuntimeResource> {

  /**
   * @generated
   */
  @Override
  public Class<RuntimeResource> getEntityClass() {
    return RuntimeResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getRuntimeResourceEClass();
  }
}
