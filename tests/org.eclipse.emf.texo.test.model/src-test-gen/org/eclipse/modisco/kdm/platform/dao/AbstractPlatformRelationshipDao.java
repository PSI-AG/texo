package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.AbstractPlatformRelationship;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractPlatformRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractPlatformRelationshipDao extends BaseDao<AbstractPlatformRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractPlatformRelationship> getEntityClass() {
    return AbstractPlatformRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getAbstractPlatformRelationshipEClass();
  }
}
