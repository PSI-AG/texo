package org.eclipse.emf.texo.server.model.response.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.response.ErrorType;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>ErrorType</b></em>'.
 * 
 * @generated
 */
public class ErrorTypeDao extends BaseDao<ErrorType> {

  /**
   * @generated
   */
  @Override
  public Class<ErrorType> getEntityClass() {
    return ErrorType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ResponseModelPackage.INSTANCE.getErrorTypeEClass();
  }
}
