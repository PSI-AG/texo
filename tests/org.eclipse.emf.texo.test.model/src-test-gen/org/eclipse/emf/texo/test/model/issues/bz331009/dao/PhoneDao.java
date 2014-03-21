package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.Phone;

/**
 * The Dao implementation for the model object '<em><b>Phone</b></em>'.
 * 
 * @generated
 */
public class PhoneDao extends BaseDao<Phone> {

  /**
   * @generated
   */
  @Override
  public Class<Phone> getEntityClass() {
    return Phone.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getPhoneEClass();
  }
}
