package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.Process;

/**
 * The Dao implementation for the model object '<em><b>Process</b></em>'.
 * 
 * @generated
 */
public class ProcessDao extends BaseDao<Process> {

  /**
   * @generated
   */
  @Override
  public Class<Process> getEntityClass() {
    return Process.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getProcessEClass();
  }
}
