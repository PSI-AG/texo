package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.BinaryFile;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BinaryFile</b></em>'.
 * 
 * @generated
 */
public class BinaryFileDao extends BaseDao<BinaryFile> {

  /**
   * @generated
   */
  @Override
  public Class<BinaryFile> getEntityClass() {
    return BinaryFile.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getBinaryFileEClass();
  }
}
