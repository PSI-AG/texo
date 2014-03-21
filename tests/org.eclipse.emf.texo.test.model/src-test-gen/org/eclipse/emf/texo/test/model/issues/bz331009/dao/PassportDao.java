package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.Passport;

/**
 * The Dao implementation for the model object '<em><b>Passport</b></em>'.
 * 
 * @generated
 */
public class PassportDao extends BaseDao<Passport> {

  /**
   * @generated
   */
  @Override
  public Class<Passport> getEntityClass() {
    return Passport.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getPassportEClass();
  }
}
