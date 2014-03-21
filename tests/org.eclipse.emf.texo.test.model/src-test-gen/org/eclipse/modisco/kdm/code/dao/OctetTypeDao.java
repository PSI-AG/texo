package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.OctetType;

/**
 * The Dao implementation for the model object '<em><b>OctetType</b></em>'.
 * 
 * @generated
 */
public class OctetTypeDao extends BaseDao<OctetType> {

  /**
   * @generated
   */
  @Override
  public Class<OctetType> getEntityClass() {
    return OctetType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getOctetTypeEClass();
  }
}
