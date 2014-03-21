package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.InventoryContainer;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InventoryContainer</b></em>'.
 * 
 * @generated
 */
public class InventoryContainerDao extends BaseDao<InventoryContainer> {

  /**
   * @generated
   */
  @Override
  public Class<InventoryContainer> getEntityClass() {
    return InventoryContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getInventoryContainerEClass();
  }
}
