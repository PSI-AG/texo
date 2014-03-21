package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ItemUnit;

/**
 * The Dao implementation for the model object '<em><b>ItemUnit</b></em>'.
 * 
 * @generated
 */
public class ItemUnitDao extends BaseDao<ItemUnit> {

  /**
   * @generated
   */
  @Override
  public Class<ItemUnit> getEntityClass() {
    return ItemUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getItemUnitEClass();
  }
}
