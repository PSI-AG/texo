package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.BooleanType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BooleanType</b></em>'.
 * 
 * @generated
 */
public class BooleanTypeDao extends BaseDao<BooleanType> {

  /**
   * @generated
   */
  @Override
  public Class<BooleanType> getEntityClass() {
    return BooleanType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getBooleanTypeEClass();
  }
}
