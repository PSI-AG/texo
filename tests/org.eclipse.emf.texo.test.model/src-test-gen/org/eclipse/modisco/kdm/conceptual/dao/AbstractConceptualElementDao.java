package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.AbstractConceptualElement;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractConceptualElement</b></em>'.
 * 
 * @generated
 */
public class AbstractConceptualElementDao extends BaseDao<AbstractConceptualElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractConceptualElement> getEntityClass() {
    return AbstractConceptualElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getAbstractConceptualElementEClass();
  }
}
