package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.action.ActionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ActionElement</b></em>'.
 * 
 * @generated
 */
public class ActionElementDao extends BaseDao<ActionElement> {

  /**
   * @generated
   */
  @Override
  public Class<ActionElement> getEntityClass() {
    return ActionElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getActionElementEClass();
  }
}
