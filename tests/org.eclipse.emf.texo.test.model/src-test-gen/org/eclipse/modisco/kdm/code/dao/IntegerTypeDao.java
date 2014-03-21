package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.IntegerType;

/**
 * The Dao implementation for the model object '<em><b>IntegerType</b></em>'.
 * 
 * @generated
 */
public class IntegerTypeDao extends BaseDao<IntegerType> {

  /**
   * @generated
   */
  @Override
  public Class<IntegerType> getEntityClass() {
    return IntegerType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getIntegerTypeEClass();
  }
}
