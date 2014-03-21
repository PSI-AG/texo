package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;
import org.eclipse.modisco.kdm.structure.StructureRelationship;

/**
 * The Dao implementation for the model object '<em><b>StructureRelationship</b></em>'.
 * 
 * @generated
 */
public class StructureRelationshipDao extends BaseDao<StructureRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<StructureRelationship> getEntityClass() {
    return StructureRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getStructureRelationshipEClass();
  }
}
