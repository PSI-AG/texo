package org.eclipse.emf.texo.server.model.response.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>ResponseType</b></em>'.
 * 
 * @generated
 */
public class ResponseTypeDao extends BaseDao<ResponseType> {

  /**
   * @generated
   */
  @Override
  public Class<ResponseType> getEntityClass() {
    return ResponseType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ResponseModelPackage.INSTANCE.getResponseTypeEClass();
  }
}
