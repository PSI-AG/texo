package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Redefines;

/**
 * The Dao implementation for the model object '<em><b>Redefines</b></em>'.
 * 
 * @generated
 */
public class RedefinesDao extends BaseDao<Redefines> {

  /**
   * @generated
   */
  @Override
  public Class<Redefines> getEntityClass() {
    return Redefines.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getRedefinesEClass();
  }
}
