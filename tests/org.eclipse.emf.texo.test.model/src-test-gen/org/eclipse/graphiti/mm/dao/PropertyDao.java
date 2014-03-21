package org.eclipse.graphiti.mm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.MmModelPackage;
import org.eclipse.graphiti.mm.Property;

/**
 * The Dao implementation for the model object '<em><b>Property</b></em>'.
 * 
 * @generated
 */
public class PropertyDao extends BaseDao<Property> {

  /**
   * @generated
   */
  @Override
  public Class<Property> getEntityClass() {
    return Property.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MmModelPackage.INSTANCE.getPropertyEClass();
  }
}
