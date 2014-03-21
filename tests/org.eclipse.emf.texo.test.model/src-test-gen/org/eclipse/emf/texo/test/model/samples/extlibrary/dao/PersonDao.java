package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Person;

/**
 * The Dao implementation for the model object '<em><b>Person</b></em>'.
 * 
 * @generated
 */
public class PersonDao extends BaseDao<Person> {

  /**
   * @generated
   */
  @Override
  public Class<Person> getEntityClass() {
    return Person.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getPersonEClass();
  }
}
