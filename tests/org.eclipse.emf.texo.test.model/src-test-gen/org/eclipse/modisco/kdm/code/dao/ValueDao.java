package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Value;

/**
 * The Dao implementation for the model object '<em><b>Value</b></em>'.
 * 
 * @generated
 */
public class ValueDao extends BaseDao<Value> {

  /**
   * @generated
   */
  @Override
  public Class<Value> getEntityClass() {
    return Value.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getValueEClass();
  }
}
