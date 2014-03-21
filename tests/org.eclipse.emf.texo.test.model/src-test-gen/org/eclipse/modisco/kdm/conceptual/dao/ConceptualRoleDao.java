package org.eclipse.modisco.kdm.conceptual.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.conceptual.ConceptualRole;

/**
 * The Dao implementation for the model object '<em><b>ConceptualRole</b></em>'.
 * 
 * @generated
 */
public class ConceptualRoleDao extends BaseDao<ConceptualRole> {

  /**
   * @generated
   */
  @Override
  public Class<ConceptualRole> getEntityClass() {
    return ConceptualRole.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ConceptualModelPackage.INSTANCE.getConceptualRoleEClass();
  }
}
