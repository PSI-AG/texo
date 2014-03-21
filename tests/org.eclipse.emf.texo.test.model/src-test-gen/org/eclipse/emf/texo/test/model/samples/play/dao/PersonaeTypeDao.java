package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.PersonaeType;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PersonaeType</b></em>'.
 * 
 * @generated
 */
public class PersonaeTypeDao extends BaseDao<PersonaeType> {

  /**
   * @generated
   */
  @Override
  public Class<PersonaeType> getEntityClass() {
    return PersonaeType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getPersonaeTypeEClass();
  }
}
