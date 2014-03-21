package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.Project;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Project</b></em>'.
 * 
 * @generated
 */
public class ProjectDao extends BaseDao<Project> {

  /**
   * @generated
   */
  @Override
  public Class<Project> getEntityClass() {
    return Project.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getProjectEClass();
  }
}
