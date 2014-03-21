package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.PrimitiveType;

/**
 * The Dao implementation for the model object '<em><b>PrimitiveType</b></em>'.
 * 
 * @generated
 */
public class PrimitiveTypeDao extends BaseDao<PrimitiveType> {

  /**
   * @generated
   */
  @Override
  public Class<PrimitiveType> getEntityClass() {
    return PrimitiveType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getPrimitiveTypeEClass();
  }
}
