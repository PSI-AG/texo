package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.platform.Thread;

/**
 * The Dao implementation for the model object '<em><b>Thread</b></em>'.
 * 
 * @generated
 */
public class ThreadDao extends BaseDao<Thread> {

  /**
   * @generated
   */
  @Override
  public Class<Thread> getEntityClass() {
    return Thread.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getThreadEClass();
  }
}
