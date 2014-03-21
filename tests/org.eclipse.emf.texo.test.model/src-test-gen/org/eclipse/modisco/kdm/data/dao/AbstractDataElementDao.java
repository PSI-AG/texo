package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.AbstractDataElement;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractDataElement</b></em>'.
 * 
 * @generated
 */
public class AbstractDataElementDao extends BaseDao<AbstractDataElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractDataElement> getEntityClass() {
    return AbstractDataElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getAbstractDataElementEClass();
  }
}
