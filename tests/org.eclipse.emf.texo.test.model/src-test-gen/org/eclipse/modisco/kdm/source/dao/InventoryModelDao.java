package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.InventoryModel;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InventoryModel</b></em>'.
 * 
 * @generated
 */
public class InventoryModelDao extends BaseDao<InventoryModel> {

  /**
   * @generated
   */
  @Override
  public Class<InventoryModel> getEntityClass() {
    return InventoryModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getInventoryModelEClass();
  }
}
