package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.PointerType;

/**
 * The Dao implementation for the model object '<em><b>PointerType</b></em>'.
 * 
 * @generated
 */
public class PointerTypeDao extends BaseDao<PointerType> {

  /**
   * @generated
   */
  @Override
  public Class<PointerType> getEntityClass() {
    return PointerType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getPointerTypeEClass();
  }
}
