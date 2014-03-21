package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.PlatformGraphicsAlgorithm;

/**
 * The Dao implementation for the model object '<em><b>PlatformGraphicsAlgorithm</b></em>'.
 * 
 * @generated
 */
public class PlatformGraphicsAlgorithmDao extends BaseDao<PlatformGraphicsAlgorithm> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformGraphicsAlgorithm> getEntityClass() {
    return PlatformGraphicsAlgorithm.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getPlatformGraphicsAlgorithmEClass();
  }
}
