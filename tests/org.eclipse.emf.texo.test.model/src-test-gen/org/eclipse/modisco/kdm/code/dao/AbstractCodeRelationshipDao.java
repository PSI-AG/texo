package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.AbstractCodeRelationship;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractCodeRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractCodeRelationshipDao extends BaseDao<AbstractCodeRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractCodeRelationship> getEntityClass() {
    return AbstractCodeRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getAbstractCodeRelationshipEClass();
  }
}
