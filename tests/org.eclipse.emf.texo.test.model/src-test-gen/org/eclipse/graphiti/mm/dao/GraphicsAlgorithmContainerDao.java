package org.eclipse.graphiti.mm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.MmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>GraphicsAlgorithmContainer</b></em>'.
 * 
 * @generated
 */
public class GraphicsAlgorithmContainerDao extends BaseDao<GraphicsAlgorithmContainer> {

  /**
   * @generated
   */
  @Override
  public Class<GraphicsAlgorithmContainer> getEntityClass() {
    return GraphicsAlgorithmContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MmModelPackage.INSTANCE.getGraphicsAlgorithmContainerEClass();
  }
}
