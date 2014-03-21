package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;
import org.eclipse.graphiti.mm.pictograms.Shape;

/**
 * The Dao implementation for the model object '<em><b>Shape</b></em>'.
 * 
 * @generated
 */
public class ShapeDao extends BaseDao<Shape> {

  /**
   * @generated
   */
  @Override
  public Class<Shape> getEntityClass() {
    return Shape.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getShapeEClass();
  }
}
