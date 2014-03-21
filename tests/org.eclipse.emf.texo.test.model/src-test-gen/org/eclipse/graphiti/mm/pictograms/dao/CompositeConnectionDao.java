package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.CompositeConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CompositeConnection</b></em>'.
 * 
 * @generated
 */
public class CompositeConnectionDao extends BaseDao<CompositeConnection> {

  /**
   * @generated
   */
  @Override
  public Class<CompositeConnection> getEntityClass() {
    return CompositeConnection.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getCompositeConnectionEClass();
  }
}
