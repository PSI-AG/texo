package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.BitstringType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BitstringType</b></em>'.
 * 
 * @generated
 */
public class BitstringTypeDao extends BaseDao<BitstringType> {

  /**
   * @generated
   */
  @Override
  public Class<BitstringType> getEntityClass() {
    return BitstringType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getBitstringTypeEClass();
  }
}
