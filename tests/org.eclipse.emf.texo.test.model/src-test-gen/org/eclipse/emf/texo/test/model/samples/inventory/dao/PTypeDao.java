package org.eclipse.emf.texo.test.model.samples.inventory.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.inventory.InvModelPackage;
import org.eclipse.emf.texo.test.model.samples.inventory.PType;

/**
 * The Dao implementation for the model object '<em><b>PType</b></em>'.
 * 
 * @generated
 */
public class PTypeDao extends BaseDao<PType> {

  /**
   * @generated
   */
  @Override
  public Class<PType> getEntityClass() {
    return PType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InvModelPackage.INSTANCE.getPTypeEClass();
  }
}
