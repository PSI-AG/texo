package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.BagType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BagType</b></em>'.
 * 
 * @generated
 */
public class BagTypeDao extends BaseDao<BagType> {

  /**
   * @generated
   */
  @Override
  public Class<BagType> getEntityClass() {
    return BagType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getBagTypeEClass();
  }
}
