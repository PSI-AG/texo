package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.SourceFile;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SourceFile</b></em>'.
 * 
 * @generated
 */
public class SourceFileDao extends BaseDao<SourceFile> {

  /**
   * @generated
   */
  @Override
  public Class<SourceFile> getEntityClass() {
    return SourceFile.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getSourceFileEClass();
  }
}
