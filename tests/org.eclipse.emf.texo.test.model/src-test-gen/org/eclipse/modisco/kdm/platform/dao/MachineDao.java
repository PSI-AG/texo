package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.Machine;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Machine</b></em>'.
 * 
 * @generated
 */
public class MachineDao extends BaseDao<Machine> {

  /**
   * @generated
   */
  @Override
  public Class<Machine> getEntityClass() {
    return Machine.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getMachineEClass();
  }
}
