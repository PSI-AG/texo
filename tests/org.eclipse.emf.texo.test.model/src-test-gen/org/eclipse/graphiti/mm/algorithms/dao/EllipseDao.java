package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.Ellipse;

/**
 * The Dao implementation for the model object '<em><b>Ellipse</b></em>'.
 * 
 * @generated
 */
public class EllipseDao extends BaseDao<Ellipse> {

  /**
   * @generated
   */
  @Override
  public Class<Ellipse> getEntityClass() {
    return Ellipse.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getEllipseEClass();
  }
}
