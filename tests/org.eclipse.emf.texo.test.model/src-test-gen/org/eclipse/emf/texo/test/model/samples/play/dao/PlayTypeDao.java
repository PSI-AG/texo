package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.PlayType;

/**
 * The Dao implementation for the model object '<em><b>PlayType</b></em>'.
 * 
 * @generated
 */
public class PlayTypeDao extends BaseDao<PlayType> {

  /**
   * @generated
   */
  @Override
  public Class<PlayType> getEntityClass() {
    return PlayType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getPlayTypeEClass();
  }
}
