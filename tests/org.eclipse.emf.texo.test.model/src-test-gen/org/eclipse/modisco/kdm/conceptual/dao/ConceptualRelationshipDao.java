package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.conceptual.ConceptualRelationship;

/**
 * The Dao implementation for the model object '<em><b>ConceptualRelationship</b></em>'.
 * 
 * @generated
 */
public class ConceptualRelationshipDao extends BaseDao<ConceptualRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<ConceptualRelationship> getEntityClass() {
    return ConceptualRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getConceptualRelationshipEClass();
  }
}
