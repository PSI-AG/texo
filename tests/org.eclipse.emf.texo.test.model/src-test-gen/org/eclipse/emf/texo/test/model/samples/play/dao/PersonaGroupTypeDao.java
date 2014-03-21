package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.PersonaGroupType;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PersonaGroupType</b></em>'.
 * 
 * @generated
 */
public class PersonaGroupTypeDao extends BaseDao<PersonaGroupType> {

  /**
   * @generated
   */
  @Override
  public Class<PersonaGroupType> getEntityClass() {
    return PersonaGroupType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getPersonaGroupTypeEClass();
  }
}
