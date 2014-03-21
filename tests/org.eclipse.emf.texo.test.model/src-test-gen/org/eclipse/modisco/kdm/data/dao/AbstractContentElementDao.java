package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.AbstractContentElement;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractContentElement</b></em>'.
 * 
 * @generated
 */
public class AbstractContentElementDao extends BaseDao<AbstractContentElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractContentElement> getEntityClass() {
    return AbstractContentElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getAbstractContentElementEClass();
  }
}
