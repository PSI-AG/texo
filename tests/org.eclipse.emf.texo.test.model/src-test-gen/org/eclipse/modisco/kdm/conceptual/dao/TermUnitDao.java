package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.conceptual.TermUnit;

/**
 * The Dao implementation for the model object '<em><b>TermUnit</b></em>'.
 * 
 * @generated
 */
public class TermUnitDao extends BaseDao<TermUnit> {

  /**
   * @generated
   */
  @Override
  public Class<TermUnit> getEntityClass() {
    return TermUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getTermUnitEClass();
  }
}
