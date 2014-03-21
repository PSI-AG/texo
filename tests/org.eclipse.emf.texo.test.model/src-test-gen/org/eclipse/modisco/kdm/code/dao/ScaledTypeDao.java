package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ScaledType;

/**
 * The Dao implementation for the model object '<em><b>ScaledType</b></em>'.
 * 
 * @generated
 */
public class ScaledTypeDao extends BaseDao<ScaledType> {

  /**
   * @generated
   */
  @Override
  public Class<ScaledType> getEntityClass() {
    return ScaledType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getScaledTypeEClass();
  }
}
