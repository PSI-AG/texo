package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.CodeRelationship;

/**
 * The Dao implementation for the model object '<em><b>CodeRelationship</b></em>'.
 * 
 * @generated
 */
public class CodeRelationshipDao extends BaseDao<CodeRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<CodeRelationship> getEntityClass() {
    return CodeRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCodeRelationshipEClass();
  }
}
