package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>FreeFormConnection</b></em>'.
 * 
 * @generated
 */
public class FreeFormConnectionDao extends BaseDao<FreeFormConnection> {

  /**
   * @generated
   */
  @Override
  public Class<FreeFormConnection> getEntityClass() {
    return FreeFormConnection.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getFreeFormConnectionEClass();
  }
}
