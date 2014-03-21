package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.MarshalledResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>MarshalledResource</b></em>'.
 * 
 * @generated
 */
public class MarshalledResourceDao extends BaseDao<MarshalledResource> {

  /**
   * @generated
   */
  @Override
  public Class<MarshalledResource> getEntityClass() {
    return MarshalledResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getMarshalledResourceEClass();
  }
}
