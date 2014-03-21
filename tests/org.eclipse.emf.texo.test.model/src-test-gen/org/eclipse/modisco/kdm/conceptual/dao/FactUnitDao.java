package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.conceptual.FactUnit;

/**
 * The Dao implementation for the model object '<em><b>FactUnit</b></em>'.
 * 
 * @generated
 */
public class FactUnitDao extends BaseDao<FactUnit> {

  /**
   * @generated
   */
  @Override
  public Class<FactUnit> getEntityClass() {
    return FactUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getFactUnitEClass();
  }
}
