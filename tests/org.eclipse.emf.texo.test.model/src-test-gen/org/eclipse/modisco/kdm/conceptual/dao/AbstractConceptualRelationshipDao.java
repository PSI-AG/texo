package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.AbstractConceptualRelationship;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractConceptualRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractConceptualRelationshipDao extends BaseDao<AbstractConceptualRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractConceptualRelationship> getEntityClass() {
    return AbstractConceptualRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getAbstractConceptualRelationshipEClass();
  }
}
