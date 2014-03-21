package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.Configuration;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Configuration</b></em>'.
 * 
 * @generated
 */
public class ConfigurationDao extends BaseDao<Configuration> {

  /**
   * @generated
   */
  @Override
  public Class<Configuration> getEntityClass() {
    return Configuration.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getConfigurationEClass();
  }
}
