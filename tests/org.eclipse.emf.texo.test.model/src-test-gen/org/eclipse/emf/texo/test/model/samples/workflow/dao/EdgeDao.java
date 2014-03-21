package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.Edge;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Edge</b></em>'.
 * 
 * @generated
 */
public class EdgeDao extends BaseDao<Edge> {

  /**
   * @generated
   */
  @Override
  public Class<Edge> getEntityClass() {
    return Edge.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getEdgeEClass();
  }
}
