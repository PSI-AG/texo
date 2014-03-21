package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.CurvedConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CurvedConnection</b></em>'.
 * 
 * @generated
 */
public class CurvedConnectionDao extends BaseDao<CurvedConnection> {

  /**
   * @generated
   */
  @Override
  public Class<CurvedConnection> getEntityClass() {
    return CurvedConnection.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getCurvedConnectionEClass();
  }
}
