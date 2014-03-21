package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.Component;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Component</b></em>'.
 * 
 * @generated
 */
public class ComponentDao extends BaseDao<Component> {

  /**
   * @generated
   */
  @Override
  public Class<Component> getEntityClass() {
    return Component.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getComponentEClass();
  }
}
