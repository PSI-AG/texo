package org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice.Person;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice.SimplechoiceModelPackage;

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
    return SimplechoiceModelPackage.INSTANCE.getPersonEClass();
  }
}
