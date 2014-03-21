package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Point</b></em>'.
 * 
 * @generated
 */
public class PointDao extends BaseDao<Point> {

  /**
   * @generated
   */
  @Override
  public Class<Point> getEntityClass() {
    return Point.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getPointEClass();
  }
}
