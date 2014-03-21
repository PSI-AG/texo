package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.ArrayType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ArrayType</b></em>'.
 * 
 * @generated
 */
public class ArrayTypeDao extends BaseDao<ArrayType> {

  /**
   * @generated
   */
  @Override
  public Class<ArrayType> getEntityClass() {
    return ArrayType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getArrayTypeEClass();
  }
}
