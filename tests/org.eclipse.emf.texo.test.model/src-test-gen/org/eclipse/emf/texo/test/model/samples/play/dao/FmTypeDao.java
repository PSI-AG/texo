package org.eclipse.emf.texo.test.model.samples.play.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.play.FmType;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;

/**
 * The Dao implementation for the model object '<em><b>FmType</b></em>'.
 * 
 * @generated
 */
public class FmTypeDao extends BaseDao<FmType> {

  /**
   * @generated
   */
  @Override
  public Class<FmType> getEntityClass() {
    return FmType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlayModelPackage.INSTANCE.getFmTypeEClass();
  }
}
