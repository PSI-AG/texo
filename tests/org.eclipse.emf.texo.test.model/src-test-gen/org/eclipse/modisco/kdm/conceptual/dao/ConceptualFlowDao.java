package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualFlow;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConceptualFlow</b></em>'.
 * 
 * @generated
 */
public class ConceptualFlowDao extends BaseDao<ConceptualFlow> {

  /**
   * @generated
   */
  @Override
  public Class<ConceptualFlow> getEntityClass() {
    return ConceptualFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getConceptualFlowEClass();
  }
}
