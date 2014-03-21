package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.ExecutableFile;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ExecutableFile</b></em>'.
 * 
 * @generated
 */
public class ExecutableFileDao extends BaseDao<ExecutableFile> {

  /**
   * @generated
   */
  @Override
  public Class<ExecutableFile> getEntityClass() {
    return ExecutableFile.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getExecutableFileEClass();
  }
}
