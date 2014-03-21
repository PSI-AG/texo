package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Expands;

/**
 * The Dao implementation for the model object '<em><b>Expands</b></em>'.
 * 
 * @generated
 */
public class ExpandsDao extends BaseDao<Expands> {

  /**
   * @generated
   */
  @Override
  public Class<Expands> getEntityClass() {
    return Expands.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getExpandsEClass();
  }
}
