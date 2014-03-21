package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.User;

/**
 * The Dao implementation for the model object '<em><b>User</b></em>'.
 * 
 * @generated
 */
public class UserDao extends BaseDao<User> {

  /**
   * @generated
   */
  @Override
  public Class<User> getEntityClass() {
    return User.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getUserEClass();
  }
}
