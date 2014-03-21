package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ContainerShape</b></em>'.
 * 
 * @generated
 */
public class ContainerShapeDao extends BaseDao<ContainerShape> {

  /**
   * @generated
   */
  @Override
  public Class<ContainerShape> getEntityClass() {
    return ContainerShape.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getContainerShapeEClass();
  }
}
