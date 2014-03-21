package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.HasType;

/**
 * The Dao implementation for the model object '<em><b>HasType</b></em>'.
 * 
 * @generated
 */
public class HasTypeDao extends BaseDao<HasType> {

  /**
   * @generated
   */
  @Override
  public Class<HasType> getEntityClass() {
    return HasType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getHasTypeEClass();
  }
}
