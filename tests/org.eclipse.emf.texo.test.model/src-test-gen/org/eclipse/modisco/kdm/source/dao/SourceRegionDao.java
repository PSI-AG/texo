package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.SourceModelPackage;
import org.eclipse.modisco.kdm.source.SourceRegion;

/**
 * The Dao implementation for the model object '<em><b>SourceRegion</b></em>'.
 * 
 * @generated
 */
public class SourceRegionDao extends BaseDao<SourceRegion> {

  /**
   * @generated
   */
  @Override
  public Class<SourceRegion> getEntityClass() {
    return SourceRegion.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getSourceRegionEClass();
  }
}
