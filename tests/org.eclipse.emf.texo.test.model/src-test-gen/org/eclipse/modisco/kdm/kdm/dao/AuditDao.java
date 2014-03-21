package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.Audit;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Audit</b></em>'.
 * 
 * @generated
 */
public class AuditDao extends BaseDao<Audit> {

  /**
   * @generated
   */
  @Override
  public Class<Audit> getEntityClass() {
    return Audit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getAuditEClass();
  }
}
