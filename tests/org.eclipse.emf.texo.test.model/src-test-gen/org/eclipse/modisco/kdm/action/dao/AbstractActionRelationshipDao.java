package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.AbstractActionRelationship;
import org.eclipse.modisco.kdm.action.ActionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractActionRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractActionRelationshipDao extends BaseDao<AbstractActionRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractActionRelationship> getEntityClass() {
    return AbstractActionRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getAbstractActionRelationshipEClass();
  }
}
