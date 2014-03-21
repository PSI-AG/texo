package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.RecordType;

/**
 * The Dao implementation for the model object '<em><b>RecordType</b></em>'.
 * 
 * @generated
 */
public class RecordTypeDao extends BaseDao<RecordType> {

  /**
   * @generated
   */
  @Override
  public Class<RecordType> getEntityClass() {
    return RecordType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getRecordTypeEClass();
  }
}
