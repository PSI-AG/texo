package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.BehaviorUnit;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BehaviorUnit</b></em>'.
 * 
 * @generated
 */
public class BehaviorUnitDao extends BaseDao<BehaviorUnit> {

  /**
   * @generated
   */
  @Override
  public Class<BehaviorUnit> getEntityClass() {
    return BehaviorUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getBehaviorUnitEClass();
  }
}
