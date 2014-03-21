package org.eclipse.emf.texo.test.model.issues.bz399086.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz399086.Bz399086ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz399086.TheMap;

/**
 * The Dao implementation for the model object '<em><b>TheMap</b></em>'.
 * 
 * @generated
 */
public class TheMapDao extends BaseDao<TheMap> {

  /**
   * @generated
   */
  @Override
  public Class<TheMap> getEntityClass() {
    return TheMap.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz399086ModelPackage.INSTANCE.getTheMapEClass();
  }
}
