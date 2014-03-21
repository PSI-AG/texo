package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.ManhattanConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ManhattanConnection</b></em>'.
 * 
 * @generated
 */
public class ManhattanConnectionDao extends BaseDao<ManhattanConnection> {

  /**
   * @generated
   */
  @Override
  public Class<ManhattanConnection> getEntityClass() {
    return ManhattanConnection.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getManhattanConnectionEClass();
  }
}
