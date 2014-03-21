package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.AbstractPlatformElement;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractPlatformElement</b></em>'.
 * 
 * @generated
 */
public class AbstractPlatformElementDao extends BaseDao<AbstractPlatformElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractPlatformElement> getEntityClass() {
    return AbstractPlatformElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getAbstractPlatformElementEClass();
  }
}
