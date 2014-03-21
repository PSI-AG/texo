package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KDMModel;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>KDMModel</b></em>'.
 * 
 * @generated
 */
public class KDMModelDao extends BaseDao<KDMModel> {

  /**
   * @generated
   */
  @Override
  public Class<KDMModel> getEntityClass() {
    return KDMModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getKDMModelEClass();
  }
}
