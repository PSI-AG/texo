package org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.AnytypeModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.C;

/**
 * The Dao implementation for the model object '<em><b>C</b></em>'.
 * 
 * @generated
 */
public class CDao extends BaseDao<C> {

  /**
   * @generated
   */
  @Override
  public Class<C> getEntityClass() {
    return C.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AnytypeModelPackage.INSTANCE.getCEClass();
  }
}
