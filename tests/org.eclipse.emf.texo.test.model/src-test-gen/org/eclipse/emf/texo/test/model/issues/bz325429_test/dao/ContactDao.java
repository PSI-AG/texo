package org.eclipse.emf.texo.test.model.issues.bz325429_test.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz325429_test.Contact;
import org.eclipse.emf.texo.test.model.issues.bz325429_test.TestModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Contact</b></em>'.
 * 
 * @generated
 */
public class ContactDao extends BaseDao<Contact> {

  /**
   * @generated
   */
  @Override
  public Class<Contact> getEntityClass() {
    return Contact.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return TestModelPackage.INSTANCE.getContactEClass();
  }
}
