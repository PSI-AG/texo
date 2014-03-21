package org.eclipse.emf.texo.test.model.issues.bz393240.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz393240.Application;
import org.eclipse.emf.texo.test.model.issues.bz393240.Bz393240ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Application</b></em>'.
 * 
 * @generated
 */
public class ApplicationDao extends BaseDao<Application> {

  /**
   * @generated
   */
  @Override
  public Class<Application> getEntityClass() {
    return Application.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz393240ModelPackage.INSTANCE.getApplicationEClass();
  }
}
