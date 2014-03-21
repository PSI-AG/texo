package org.eclipse.emf.texo.test.model.base.identifiable.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableInterface;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;

/**
 * The Dao implementation for the model object '<em><b>IdentifiableInterface</b></em>'.
 * 
 * @generated
 */
public class IdentifiableInterfaceDao extends BaseDao<IdentifiableInterface> {

  /**
   * @generated
   */
  @Override
  public Class<IdentifiableInterface> getEntityClass() {
    return IdentifiableInterface.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return IdentifiableModelPackage.INSTANCE.getIdentifiableInterfaceEClass();
  }
}
