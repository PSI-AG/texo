package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.ExternalActor;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ExternalActor</b></em>'.
 * 
 * @generated
 */
public class ExternalActorDao extends BaseDao<ExternalActor> {

  /**
   * @generated
   */
  @Override
  public Class<ExternalActor> getEntityClass() {
    return ExternalActor.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getExternalActorEClass();
  }
}
