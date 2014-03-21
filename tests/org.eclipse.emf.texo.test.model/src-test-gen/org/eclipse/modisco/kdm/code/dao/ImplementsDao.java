package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Implements;

/**
 * The Dao implementation for the model object '<em><b>Implements</b></em>'.
 * 
 * @generated
 */
public class ImplementsDao extends BaseDao<Implements> {

  /**
   * @generated
   */
  @Override
  public Class<Implements> getEntityClass() {
    return Implements.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getImplementsEClass();
  }
}
