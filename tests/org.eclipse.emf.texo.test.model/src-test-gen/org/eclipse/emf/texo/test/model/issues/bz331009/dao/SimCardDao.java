package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.SimCard;

/**
 * The Dao implementation for the model object '<em><b>SimCard</b></em>'.
 * 
 * @generated
 */
public class SimCardDao extends BaseDao<SimCard> {

  /**
   * @generated
   */
  @Override
  public Class<SimCard> getEntityClass() {
    return SimCard.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getSimCardEClass();
  }
}
