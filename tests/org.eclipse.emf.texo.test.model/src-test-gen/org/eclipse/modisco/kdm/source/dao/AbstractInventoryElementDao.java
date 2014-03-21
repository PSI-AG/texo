package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractInventoryElement</b></em>'.
 * 
 * @generated
 */
public class AbstractInventoryElementDao extends BaseDao<AbstractInventoryElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractInventoryElement> getEntityClass() {
    return AbstractInventoryElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getAbstractInventoryElementEClass();
  }
}
