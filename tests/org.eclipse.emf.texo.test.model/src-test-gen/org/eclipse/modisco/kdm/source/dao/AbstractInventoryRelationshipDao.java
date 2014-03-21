package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.AbstractInventoryRelationship;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractInventoryRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractInventoryRelationshipDao extends BaseDao<AbstractInventoryRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractInventoryRelationship> getEntityClass() {
    return AbstractInventoryRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getAbstractInventoryRelationshipEClass();
  }
}
