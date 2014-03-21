package org.eclipse.modisco.kdm.platform.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.platform.FileResource;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;

/**
 * The Dao implementation for the model object '<em><b>FileResource</b></em>'.
 * 
 * @generated
 */
public class FileResourceDao extends BaseDao<FileResource> {

  /**
   * @generated
   */
  @Override
  public Class<FileResource> getEntityClass() {
    return FileResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PlatformModelPackage.INSTANCE.getFileResourceEClass();
  }
}
