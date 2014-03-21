package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.OrdinalType;

/**
 * The Dao implementation for the model object '<em><b>OrdinalType</b></em>'.
 * 
 * @generated
 */
public class OrdinalTypeDao extends BaseDao<OrdinalType> {

  /**
   * @generated
   */
  @Override
  public Class<OrdinalType> getEntityClass() {
    return OrdinalType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getOrdinalTypeEClass();
  }
}
