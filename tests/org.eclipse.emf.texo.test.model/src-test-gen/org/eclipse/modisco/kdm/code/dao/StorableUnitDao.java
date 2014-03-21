package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.StorableUnit;

/**
 * The Dao implementation for the model object '<em><b>StorableUnit</b></em>'.
 * 
 * @generated
 */
public class StorableUnitDao extends BaseDao<StorableUnit> {

  /**
   * @generated
   */
  @Override
  public Class<StorableUnit> getEntityClass() {
    return StorableUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getStorableUnitEClass();
  }
}
