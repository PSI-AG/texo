package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.BlockUnit;

/**
 * The Dao implementation for the model object '<em><b>BlockUnit</b></em>'.
 * 
 * @generated
 */
public class BlockUnitDao extends BaseDao<BlockUnit> {

  /**
   * @generated
   */
  @Override
  public Class<BlockUnit> getEntityClass() {
    return BlockUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getBlockUnitEClass();
  }
}
