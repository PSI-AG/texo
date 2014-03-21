package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Connection</b></em>'.
 * 
 * @generated
 */
public class ConnectionDao extends BaseDao<Connection> {

  /**
   * @generated
   */
  @Override
  public Class<Connection> getEntityClass() {
    return Connection.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getConnectionEClass();
  }
}
