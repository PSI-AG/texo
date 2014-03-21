package org.eclipse.graphiti.mm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.MmModelPackage;
import org.eclipse.graphiti.mm.PropertyContainer;

/**
 * The Dao implementation for the model object '<em><b>PropertyContainer</b></em>'.
 * 
 * @generated
 */
public class PropertyContainerDao extends BaseDao<PropertyContainer> {

  /**
   * @generated
   */
  @Override
  public Class<PropertyContainer> getEntityClass() {
    return PropertyContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MmModelPackage.INSTANCE.getPropertyContainerEClass();
  }
}
