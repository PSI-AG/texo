package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.ExecutionResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ExecutionResource</b></em>'.
 * 
 * @generated
 */
public class ExecutionResourceDao extends BaseDao<ExecutionResource> {

  /**
   * @generated
   */
  @Override
  public Class<ExecutionResource> getEntityClass() {
    return ExecutionResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getExecutionResourceEClass();
  }
}
