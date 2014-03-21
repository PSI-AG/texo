package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.Rectangle;

/**
 * The Dao implementation for the model object '<em><b>Rectangle</b></em>'.
 * 
 * @generated
 */
public class RectangleDao extends BaseDao<Rectangle> {

  /**
   * @generated
   */
  @Override
  public Class<Rectangle> getEntityClass() {
    return Rectangle.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getRectangleEClass();
  }
}
