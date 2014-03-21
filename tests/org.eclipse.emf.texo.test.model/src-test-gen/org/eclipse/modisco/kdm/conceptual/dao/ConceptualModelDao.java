package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModel;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConceptualModel</b></em>'.
 * 
 * @generated
 */
public class ConceptualModelDao extends BaseDao<ConceptualModel> {

  /**
   * @generated
   */
  @Override
  public Class<ConceptualModel> getEntityClass() {
    return ConceptualModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getConceptualModelEClass();
  }
}
