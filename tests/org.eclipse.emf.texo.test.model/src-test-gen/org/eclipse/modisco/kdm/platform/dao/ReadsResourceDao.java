package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.ReadsResource;

/**
 * The Dao implementation for the model object '<em><b>ReadsResource</b></em>'.
 * 
 * @generated
 */
public class ReadsResourceDao extends BaseDao<ReadsResource> {

  /**
   * @generated
   */
  @Override
  public Class<ReadsResource> getEntityClass() {
    return ReadsResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getReadsResourceEClass();
  }
}
