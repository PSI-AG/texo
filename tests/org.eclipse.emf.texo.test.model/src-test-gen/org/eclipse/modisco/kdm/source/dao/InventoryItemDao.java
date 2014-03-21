package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.InventoryItem;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InventoryItem</b></em>'.
 * 
 * @generated
 */
public class InventoryItemDao extends BaseDao<InventoryItem> {

  /**
   * @generated
   */
  @Override
  public Class<InventoryItem> getEntityClass() {
    return InventoryItem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getInventoryItemEClass();
  }
}
