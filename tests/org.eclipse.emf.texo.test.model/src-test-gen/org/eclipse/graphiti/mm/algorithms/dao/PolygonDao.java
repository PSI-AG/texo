package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.Polygon;

/**
 * The Dao implementation for the model object '<em><b>Polygon</b></em>'.
 * 
 * @generated
 */
public class PolygonDao extends BaseDao<Polygon> {

  /**
   * @generated
   */
  @Override
  public Class<Polygon> getEntityClass() {
    return Polygon.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getPolygonEClass();
  }
}
