package org.eclipse.emf.texo.test.model.samples.sport.society.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sport.society.Society;
import org.eclipse.emf.texo.test.model.samples.sport.society.SocietyModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Society</b></em>'.
 * 
 * @generated
 */
public class SocietyDao extends BaseDao<Society> {

  /**
   * @generated
   */
  @Override
  public Class<Society> getEntityClass() {
    return Society.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SocietyModelPackage.INSTANCE.getSocietyEClass();
  }
}
