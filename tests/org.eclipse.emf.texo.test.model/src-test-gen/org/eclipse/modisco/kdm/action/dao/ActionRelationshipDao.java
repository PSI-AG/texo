package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.ActionRelationship;

/**
 * The Dao implementation for the model object '<em><b>ActionRelationship</b></em>'.
 * 
 * @generated
 */
public class ActionRelationshipDao extends BaseDao<ActionRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<ActionRelationship> getEntityClass() {
    return ActionRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getActionRelationshipEClass();
  }
}
