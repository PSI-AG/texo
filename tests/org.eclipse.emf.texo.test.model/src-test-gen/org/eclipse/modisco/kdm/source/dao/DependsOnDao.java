package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.DependsOn;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DependsOn</b></em>'.
 * 
 * @generated
 */
public class DependsOnDao extends BaseDao<DependsOn> {

  /**
   * @generated
   */
  @Override
  public Class<DependsOn> getEntityClass() {
    return DependsOn.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getDependsOnEClass();
  }
}
