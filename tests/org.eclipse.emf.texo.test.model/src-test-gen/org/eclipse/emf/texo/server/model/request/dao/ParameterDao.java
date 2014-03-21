package org.eclipse.emf.texo.server.model.request.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.request.Parameter;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Parameter</b></em>'.
 * 
 * @generated
 */
public class ParameterDao extends BaseDao<Parameter> {

  /**
   * @generated
   */
  @Override
  public Class<Parameter> getEntityClass() {
    return Parameter.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RequestModelPackage.INSTANCE.getParameterEClass();
  }
}
