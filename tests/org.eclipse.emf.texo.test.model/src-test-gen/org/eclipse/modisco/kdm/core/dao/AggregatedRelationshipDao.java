package org.eclipse.modisco.kdm.core.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.kdm.core.CoreModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AggregatedRelationship</b></em>'.
 * 
 * @generated
 */
public class AggregatedRelationshipDao extends BaseDao<AggregatedRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AggregatedRelationship> getEntityClass() {
    return AggregatedRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CoreModelPackage.INSTANCE.getAggregatedRelationshipEClass();
  }
}
