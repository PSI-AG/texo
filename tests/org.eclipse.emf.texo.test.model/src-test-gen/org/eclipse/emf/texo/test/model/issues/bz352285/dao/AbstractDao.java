package org.eclipse.emf.texo.test.model.issues.bz352285.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz352285.Abstract;
import org.eclipse.emf.texo.test.model.issues.bz352285.Bz352285ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Abstract</b></em>'.
 * 
 * @generated
 */
public class AbstractDao extends BaseDao<Abstract> {

  /**
   * @generated
   */
  @Override
  public Class<Abstract> getEntityClass() {
    return Abstract.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz352285ModelPackage.INSTANCE.getAbstractEClass();
  }
}
