package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.RecordFile;

/**
 * The Dao implementation for the model object '<em><b>RecordFile</b></em>'.
 * 
 * @generated
 */
public class RecordFileDao extends BaseDao<RecordFile> {

  /**
   * @generated
   */
  @Override
  public Class<RecordFile> getEntityClass() {
    return RecordFile.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getRecordFileEClass();
  }
}
