package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.FloatType;

/**
 * The Dao implementation for the model object '<em><b>FloatType</b></em>'.
 * 
 * @generated
 */
public class FloatTypeDao extends BaseDao<FloatType> {

  /**
   * @generated
   */
  @Override
  public Class<FloatType> getEntityClass() {
    return FloatType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getFloatTypeEClass();
  }
}
