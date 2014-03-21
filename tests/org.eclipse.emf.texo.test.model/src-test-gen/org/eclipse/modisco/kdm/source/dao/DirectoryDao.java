package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.Directory;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Directory</b></em>'.
 * 
 * @generated
 */
public class DirectoryDao extends BaseDao<Directory> {

  /**
   * @generated
   */
  @Override
  public Class<Directory> getEntityClass() {
    return Directory.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getDirectoryEClass();
  }
}
