package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.PlatformRelationship;

/**
 * The Dao implementation for the model object '<em><b>PlatformRelationship</b></em>'.
 * 
 * @generated
 */
public class PlatformRelationshipDao extends BaseDao<PlatformRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformRelationship> getEntityClass() {
    return PlatformRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getPlatformRelationshipEClass();
  }
}
