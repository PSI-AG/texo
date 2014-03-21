package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Datatype;

/**
 * The Dao implementation for the model object '<em><b>Datatype</b></em>'.
 * 
 * @generated
 */
public class DatatypeDao extends BaseDao<Datatype> {

  /**
   * @generated
   */
  @Override
  public Class<Datatype> getEntityClass() {
    return Datatype.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getDatatypeEClass();
  }
}
