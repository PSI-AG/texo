package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.SetType;

/**
 * The Dao implementation for the model object '<em><b>SetType</b></em>'.
 * 
 * @generated
 */
public class SetTypeDao extends BaseDao<SetType> {

  /**
   * @generated
   */
  @Override
  public Class<SetType> getEntityClass() {
    return SetType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getSetTypeEClass();
  }
}
