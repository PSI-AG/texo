package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;

/**
 * The Dao implementation for the model object '<em><b>GraphicsAlgorithm</b></em>'.
 * 
 * @generated
 */
public class GraphicsAlgorithmDao extends BaseDao<GraphicsAlgorithm> {

  /**
   * @generated
   */
  @Override
  public Class<GraphicsAlgorithm> getEntityClass() {
    return GraphicsAlgorithm.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getGraphicsAlgorithmEClass();
  }
}
