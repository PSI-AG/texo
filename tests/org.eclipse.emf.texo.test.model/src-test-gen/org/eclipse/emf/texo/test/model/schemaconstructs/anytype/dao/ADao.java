package org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.A;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.AnytypeModelPackage;

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
    return AnytypeModelPackage.INSTANCE.getAEClass();
  }
}
