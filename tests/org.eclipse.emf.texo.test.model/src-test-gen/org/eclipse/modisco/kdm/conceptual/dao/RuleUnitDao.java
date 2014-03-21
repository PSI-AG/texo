package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.conceptual.RuleUnit;

/**
 * The Dao implementation for the model object '<em><b>RuleUnit</b></em>'.
 * 
 * @generated
 */
public class RuleUnitDao extends BaseDao<RuleUnit> {

  /**
   * @generated
   */
  @Override
  public Class<RuleUnit> getEntityClass() {
    return RuleUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getRuleUnitEClass();
  }
}
