package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.OctetstringType;

/**
 * The Dao implementation for the model object '<em><b>OctetstringType</b></em>'.
 * 
 * @generated
 */
public class OctetstringTypeDao extends BaseDao<OctetstringType> {

  /**
   * @generated
   */
  @Override
  public Class<OctetstringType> getEntityClass() {
    return OctetstringType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getOctetstringTypeEClass();
  }
}
