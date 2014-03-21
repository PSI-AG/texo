package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.SceneType;

/**
 * The Dao implementation for the model object '<em><b>SceneType</b></em>'.
 * 
 * @generated
 */
public class SceneTypeDao extends BaseDao<SceneType> {

  /**
   * @generated
   */
  @Override
  public Class<SceneType> getEntityClass() {
    return SceneType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getSceneTypeEClass();
  }
}
