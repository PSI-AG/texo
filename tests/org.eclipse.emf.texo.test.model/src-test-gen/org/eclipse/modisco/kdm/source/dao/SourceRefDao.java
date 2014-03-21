package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.SourceModelPackage;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The Dao implementation for the model object '<em><b>SourceRef</b></em>'.
 * 
 * @generated
 */
public class SourceRefDao extends BaseDao<SourceRef> {

  /**
   * @generated
   */
  @Override
  public Class<SourceRef> getEntityClass() {
    return SourceRef.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getSourceRefEClass();
  }
}
