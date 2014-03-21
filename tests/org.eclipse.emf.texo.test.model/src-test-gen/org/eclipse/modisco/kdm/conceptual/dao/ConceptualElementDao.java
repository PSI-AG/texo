package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualElement;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConceptualElement</b></em>'.
 * 
 * @generated
 */
public class ConceptualElementDao extends BaseDao<ConceptualElement> {

  /**
   * @generated
   */
  @Override
  public Class<ConceptualElement> getEntityClass() {
    return ConceptualElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getConceptualElementEClass();
  }
}
