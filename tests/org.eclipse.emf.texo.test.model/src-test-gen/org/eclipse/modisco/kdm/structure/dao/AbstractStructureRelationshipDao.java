package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.AbstractStructureRelationship;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractStructureRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractStructureRelationshipDao extends BaseDao<AbstractStructureRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractStructureRelationship> getEntityClass() {
    return AbstractStructureRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getAbstractStructureRelationshipEClass();
  }
}
