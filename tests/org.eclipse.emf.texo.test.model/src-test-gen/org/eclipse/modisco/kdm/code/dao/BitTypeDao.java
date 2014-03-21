package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.BitType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BitType</b></em>'.
 * 
 * @generated
 */
public class BitTypeDao extends BaseDao<BitType> {

  /**
   * @generated
   */
  @Override
  public Class<BitType> getEntityClass() {
    return BitType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getBitTypeEClass();
  }
}
