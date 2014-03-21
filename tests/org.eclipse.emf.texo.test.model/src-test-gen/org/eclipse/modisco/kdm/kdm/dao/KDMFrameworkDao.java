package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KDMFramework;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>KDMFramework</b></em>'.
 * 
 * @generated
 */
public class KDMFrameworkDao extends BaseDao<KDMFramework> {

  /**
   * @generated
   */
  @Override
  public Class<KDMFramework> getEntityClass() {
    return KDMFramework.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getKDMFrameworkEClass();
  }
}
