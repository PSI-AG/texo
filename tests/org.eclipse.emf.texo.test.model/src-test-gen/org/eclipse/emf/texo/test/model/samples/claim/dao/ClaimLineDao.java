package org.eclipse.emf.texo.test.model.samples.claim.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimLine;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ClaimLine</b></em>'.
 * 
 * @generated
 */
public class ClaimLineDao extends BaseDao<ClaimLine> {

  /**
   * @generated
   */
  @Override
  public Class<ClaimLine> getEntityClass() {
    return ClaimLine.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ClaimModelPackage.INSTANCE.getClaimLineEClass();
  }
}
