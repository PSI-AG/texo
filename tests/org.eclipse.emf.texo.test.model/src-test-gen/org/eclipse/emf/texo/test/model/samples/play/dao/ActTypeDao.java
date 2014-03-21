package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.ActType;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ActType</b></em>'.
 * 
 * @generated
 */
public class ActTypeDao extends BaseDao<ActType> {

  /**
   * @generated
   */
  @Override
  public Class<ActType> getEntityClass() {
    return ActType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getActTypeEClass();
  }
}
