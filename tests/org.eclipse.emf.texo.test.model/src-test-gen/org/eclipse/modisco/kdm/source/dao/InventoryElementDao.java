package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.InventoryElement;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InventoryElement</b></em>'.
 * 
 * @generated
 */
public class InventoryElementDao extends BaseDao<InventoryElement> {

  /**
   * @generated
   */
  @Override
  public Class<InventoryElement> getEntityClass() {
    return InventoryElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getInventoryElementEClass();
  }
}
