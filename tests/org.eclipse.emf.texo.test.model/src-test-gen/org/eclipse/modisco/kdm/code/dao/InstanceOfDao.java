package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.InstanceOf;

/**
 * The Dao implementation for the model object '<em><b>InstanceOf</b></em>'.
 * 
 * @generated
 */
public class InstanceOfDao extends BaseDao<InstanceOf> {

  /**
   * @generated
   */
  @Override
  public Class<InstanceOf> getEntityClass() {
    return InstanceOf.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getInstanceOfEClass();
  }
}
