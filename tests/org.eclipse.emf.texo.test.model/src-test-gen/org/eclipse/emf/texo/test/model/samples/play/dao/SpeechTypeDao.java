package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.SpeechType;

/**
 * The Dao implementation for the model object '<em><b>SpeechType</b></em>'.
 * 
 * @generated
 */
public class SpeechTypeDao extends BaseDao<SpeechType> {

  /**
   * @generated
   */
  @Override
  public Class<SpeechType> getEntityClass() {
    return SpeechType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getSpeechTypeEClass();
  }
}
