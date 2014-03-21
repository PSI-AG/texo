package org.eclipse.emf.texo.server.model.request.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.request.QueryType;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>QueryType</b></em>'.
 * 
 * @generated
 */
public class QueryTypeDao extends BaseDao<QueryType> {

  /**
   * @generated
   */
  @Override
  public Class<QueryType> getEntityClass() {
    return QueryType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RequestModelPackage.INSTANCE.getQueryTypeEClass();
  }
}
