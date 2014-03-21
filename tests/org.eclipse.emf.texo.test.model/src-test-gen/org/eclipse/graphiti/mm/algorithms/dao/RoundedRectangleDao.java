package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;

/**
 * The Dao implementation for the model object '<em><b>RoundedRectangle</b></em>'.
 * 
 * @generated
 */
public class RoundedRectangleDao extends BaseDao<RoundedRectangle> {

  /**
   * @generated
   */
  @Override
  public Class<RoundedRectangle> getEntityClass() {
    return RoundedRectangle.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getRoundedRectangleEClass();
  }
}
