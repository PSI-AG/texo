package org.eclipse.emf.texo.server.model.request.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.request.QueryReferingObjectsType;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>QueryReferingObjectsType</b></em>'.
 * 
 * @generated
 */
public class QueryReferingObjectsTypeDao extends BaseDao<QueryReferingObjectsType> {

  /**
   * @generated
   */
  @Override
  public Class<QueryReferingObjectsType> getEntityClass() {
    return QueryReferingObjectsType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RequestModelPackage.INSTANCE.getQueryReferingObjectsTypeEClass();
  }
}
