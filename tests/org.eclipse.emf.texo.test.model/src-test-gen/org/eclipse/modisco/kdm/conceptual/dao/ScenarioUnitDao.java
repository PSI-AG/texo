package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.conceptual.ScenarioUnit;

/**
 * The Dao implementation for the model object '<em><b>ScenarioUnit</b></em>'.
 * 
 * @generated
 */
public class ScenarioUnitDao extends BaseDao<ScenarioUnit> {

  /**
   * @generated
   */
  @Override
  public Class<ScenarioUnit> getEntityClass() {
    return ScenarioUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getScenarioUnitEClass();
  }
}
