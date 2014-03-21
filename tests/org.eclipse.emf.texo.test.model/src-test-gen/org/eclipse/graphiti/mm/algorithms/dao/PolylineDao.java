package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.Polyline;

/**
 * The Dao implementation for the model object '<em><b>Polyline</b></em>'.
 * 
 * @generated
 */
public class PolylineDao extends BaseDao<Polyline> {

  /**
   * @generated
   */
  @Override
  public Class<Polyline> getEntityClass() {
    return Polyline.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getPolylineEClass();
  }
}
