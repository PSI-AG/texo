package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ExtendedDataElement;

/**
 * The Dao implementation for the model object '<em><b>ExtendedDataElement</b></em>'.
 * 
 * @generated
 */
public class ExtendedDataElementDao extends BaseDao<ExtendedDataElement> {

  /**
   * @generated
   */
  @Override
  public Class<ExtendedDataElement> getEntityClass() {
    return ExtendedDataElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getExtendedDataElementEClass();
  }
}
