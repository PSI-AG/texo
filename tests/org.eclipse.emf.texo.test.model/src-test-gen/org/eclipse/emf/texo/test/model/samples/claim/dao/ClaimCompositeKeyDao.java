package org.eclipse.emf.texo.test.model.samples.claim.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimCompositeKey;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ClaimCompositeKey</b></em>'.
 * 
 * @generated
 */
public class ClaimCompositeKeyDao extends BaseDao<ClaimCompositeKey> {

  /**
   * @generated
   */
  @Override
  public Class<ClaimCompositeKey> getEntityClass() {
    return ClaimCompositeKey.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ClaimModelPackage.INSTANCE.getClaimCompositeKeyEClass();
  }
}
