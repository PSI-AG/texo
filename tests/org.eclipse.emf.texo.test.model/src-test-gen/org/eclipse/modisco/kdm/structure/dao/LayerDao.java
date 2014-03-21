package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.Layer;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Layer</b></em>'.
 * 
 * @generated
 */
public class LayerDao extends BaseDao<Layer> {

  /**
   * @generated
   */
  @Override
  public Class<Layer> getEntityClass() {
    return Layer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getLayerEClass();
  }
}
