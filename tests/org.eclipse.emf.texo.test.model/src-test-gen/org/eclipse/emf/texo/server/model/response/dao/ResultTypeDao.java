package org.eclipse.emf.texo.server.model.response.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.server.model.response.ResultType;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>ResultType</b></em>'.
 * 
 * @generated
 */
public class ResultTypeDao extends BaseDao<ResultType> {

  /**
   * @generated
   */
  @Override
  public Class<ResultType> getEntityClass() {
    return ResultType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ResponseModelPackage.INSTANCE.getResultTypeEClass();
  }
}
