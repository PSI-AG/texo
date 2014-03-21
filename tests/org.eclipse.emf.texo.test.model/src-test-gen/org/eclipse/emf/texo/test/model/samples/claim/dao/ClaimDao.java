package org.eclipse.emf.texo.test.model.samples.claim.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.claim.Claim;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Claim</b></em>'.
 * 
 * @generated
 */
public class ClaimDao extends BaseDao<Claim> {

  /**
   * @generated
   */
  @Override
  public Class<Claim> getEntityClass() {
    return Claim.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ClaimModelPackage.INSTANCE.getClaimEClass();
  }
}
