package org.eclipse.emf.texo.test.model.samples.claim.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimLineCompositeKey;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ClaimLineCompositeKey</b></em>'.
 * 
 * @generated
 */
public class ClaimLineCompositeKeyDao extends BaseDao<ClaimLineCompositeKey> {

  /**
   * @generated
   */
  @Override
  public Class<ClaimLineCompositeKey> getEntityClass() {
    return ClaimLineCompositeKey.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ClaimModelPackage.INSTANCE.getClaimLineCompositeKeyEClass();
  }
}
