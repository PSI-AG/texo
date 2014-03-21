package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.SequenceType;

/**
 * The Dao implementation for the model object '<em><b>SequenceType</b></em>'.
 * 
 * @generated
 */
public class SequenceTypeDao extends BaseDao<SequenceType> {

  /**
   * @generated
   */
  @Override
  public Class<SequenceType> getEntityClass() {
    return SequenceType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getSequenceTypeEClass();
  }
}
