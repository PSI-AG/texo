package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.NamingResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>NamingResource</b></em>'.
 * 
 * @generated
 */
public class NamingResourceDao extends BaseDao<NamingResource> {

  /**
   * @generated
   */
  @Override
  public Class<NamingResource> getEntityClass() {
    return NamingResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getNamingResourceEClass();
  }
}
