package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Signature;

/**
 * The Dao implementation for the model object '<em><b>Signature</b></em>'.
 * 
 * @generated
 */
public class SignatureDao extends BaseDao<Signature> {

  /**
   * @generated
   */
  @Override
  public Class<Signature> getEntityClass() {
    return Signature.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getSignatureEClass();
  }
}
