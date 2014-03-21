package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.SynonymUnit;

/**
 * The Dao implementation for the model object '<em><b>SynonymUnit</b></em>'.
 * 
 * @generated
 */
public class SynonymUnitDao extends BaseDao<SynonymUnit> {

  /**
   * @generated
   */
  @Override
  public Class<SynonymUnit> getEntityClass() {
    return SynonymUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getSynonymUnitEClass();
  }
}
