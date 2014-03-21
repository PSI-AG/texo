package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.DefinedBy;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DefinedBy</b></em>'.
 * 
 * @generated
 */
public class DefinedByDao extends BaseDao<DefinedBy> {

  /**
   * @generated
   */
  @Override
  public Class<DefinedBy> getEntityClass() {
    return DefinedBy.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getDefinedByEClass();
  }
}
