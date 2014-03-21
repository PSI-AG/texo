package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.BindsTo;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BindsTo</b></em>'.
 * 
 * @generated
 */
public class BindsToDao extends BaseDao<BindsTo> {

  /**
   * @generated
   */
  @Override
  public Class<BindsTo> getEntityClass() {
    return BindsTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getBindsToEClass();
  }
}
