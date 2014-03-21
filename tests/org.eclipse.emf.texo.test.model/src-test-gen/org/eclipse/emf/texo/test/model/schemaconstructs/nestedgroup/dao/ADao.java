package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.A;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.NestedgroupModelPackage;

/**
 * The Dao implementation for the model object '<em><b>A</b></em>'.
 * 
 * @generated
 */
public class ADao extends BaseDao<A> {

  /**
   * @generated
   */
  @Override
  public Class<A> getEntityClass() {
    return A.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return NestedgroupModelPackage.INSTANCE.getAEClass();
  }
}
