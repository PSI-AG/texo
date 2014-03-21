package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualContainer;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConceptualContainer</b></em>'.
 * 
 * @generated
 */
public class ConceptualContainerDao extends BaseDao<ConceptualContainer> {

  /**
   * @generated
   */
  @Override
  public Class<ConceptualContainer> getEntityClass() {
    return ConceptualContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getConceptualContainerEClass();
  }
}
