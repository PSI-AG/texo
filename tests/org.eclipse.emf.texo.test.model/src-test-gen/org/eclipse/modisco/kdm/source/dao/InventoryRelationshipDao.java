package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.InventoryRelationship;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InventoryRelationship</b></em>'.
 * 
 * @generated
 */
public class InventoryRelationshipDao extends BaseDao<InventoryRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<InventoryRelationship> getEntityClass() {
    return InventoryRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getInventoryRelationshipEClass();
  }
}
