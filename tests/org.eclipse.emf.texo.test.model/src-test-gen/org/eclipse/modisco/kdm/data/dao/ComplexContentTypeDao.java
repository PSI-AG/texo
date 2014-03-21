package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.ComplexContentType;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ComplexContentType</b></em>'.
 * 
 * @generated
 */
public class ComplexContentTypeDao extends BaseDao<ComplexContentType> {

  /**
   * @generated
   */
  @Override
  public Class<ComplexContentType> getEntityClass() {
    return ComplexContentType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getComplexContentTypeEClass();
  }
}
