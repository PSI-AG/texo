package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.DataElement;

/**
 * The Dao implementation for the model object '<em><b>DataElement</b></em>'.
 * 
 * @generated
 */
public class DataElementDao extends BaseDao<DataElement> {

  /**
   * @generated
   */
  @Override
  public Class<DataElement> getEntityClass() {
    return DataElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getDataElementEClass();
  }
}
