package org.eclipse.emf.texo.test.model.issues.bz399086.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz399086.Bz399086ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz399086.MapElement;

/**
 * The Dao implementation for the model object '<em><b>MapElement</b></em>'.
 * 
 * @generated
 */
public class MapElementDao extends BaseDao<MapElement> {

  /**
   * @generated
   */
  @Override
  public Class<MapElement> getEntityClass() {
    return MapElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz399086ModelPackage.INSTANCE.getMapElementEClass();
  }
}
