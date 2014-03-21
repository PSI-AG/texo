package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.CompliesTo;

/**
 * The Dao implementation for the model object '<em><b>CompliesTo</b></em>'.
 * 
 * @generated
 */
public class CompliesToDao extends BaseDao<CompliesTo> {

  /**
   * @generated
   */
  @Override
  public Class<CompliesTo> getEntityClass() {
    return CompliesTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getCompliesToEClass();
  }
}
