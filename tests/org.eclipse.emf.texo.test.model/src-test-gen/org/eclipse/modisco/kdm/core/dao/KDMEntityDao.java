package org.eclipse.modisco.kdm.core.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.core.KDMEntity;

/**
 * The Dao implementation for the model object '<em><b>KDMEntity</b></em>'.
 * 
 * @generated
 */
public class KDMEntityDao extends BaseDao<KDMEntity> {

  /**
   * @generated
   */
  @Override
  public Class<KDMEntity> getEntityClass() {
    return KDMEntity.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CoreModelPackage.INSTANCE.getKDMEntityEClass();
  }
}
