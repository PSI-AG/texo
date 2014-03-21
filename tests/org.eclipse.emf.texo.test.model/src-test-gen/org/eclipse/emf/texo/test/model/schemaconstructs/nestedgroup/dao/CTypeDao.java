package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.CType;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.NestedgroupModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CType</b></em>'.
 * 
 * @generated
 */
public class CTypeDao extends BaseDao<CType> {

  /**
   * @generated
   */
  @Override
  public Class<CType> getEntityClass() {
    return CType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return NestedgroupModelPackage.INSTANCE.getCTypeEClass();
  }
}
