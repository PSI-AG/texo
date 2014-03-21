package org.eclipse.modisco.kdm.core.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.core.KDMRelationship;

/**
 * The Dao implementation for the model object '<em><b>KDMRelationship</b></em>'.
 * 
 * @generated
 */
public class KDMRelationshipDao extends BaseDao<KDMRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<KDMRelationship> getEntityClass() {
    return KDMRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CoreModelPackage.INSTANCE.getKDMRelationshipEClass();
  }
}
