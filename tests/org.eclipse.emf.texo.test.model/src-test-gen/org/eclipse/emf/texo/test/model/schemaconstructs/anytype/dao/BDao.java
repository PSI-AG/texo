package org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.AnytypeModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.B;

/**
 * The Dao implementation for the model object '<em><b>B</b></em>'.
 * 
 * @generated
 */
public class BDao extends BaseDao<B> {

  /**
   * @generated
   */
  @Override
  public Class<B> getEntityClass() {
    return B.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AnytypeModelPackage.INSTANCE.getBEClass();
  }
}
