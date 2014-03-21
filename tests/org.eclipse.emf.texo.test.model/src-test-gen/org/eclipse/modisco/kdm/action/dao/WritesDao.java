package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Writes;

/**
 * The Dao implementation for the model object '<em><b>Writes</b></em>'.
 * 
 * @generated
 */
public class WritesDao extends BaseDao<Writes> {

  /**
   * @generated
   */
  @Override
  public Class<Writes> getEntityClass() {
    return Writes.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getWritesEClass();
  }
}
