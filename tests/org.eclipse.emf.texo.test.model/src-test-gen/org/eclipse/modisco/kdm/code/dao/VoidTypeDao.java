package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.VoidType;

/**
 * The Dao implementation for the model object '<em><b>VoidType</b></em>'.
 * 
 * @generated
 */
public class VoidTypeDao extends BaseDao<VoidType> {

  /**
   * @generated
   */
  @Override
  public Class<VoidType> getEntityClass() {
    return VoidType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getVoidTypeEClass();
  }
}
