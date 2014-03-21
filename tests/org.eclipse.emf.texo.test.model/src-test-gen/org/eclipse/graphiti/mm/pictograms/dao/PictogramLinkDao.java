package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PictogramLink</b></em>'.
 * 
 * @generated
 */
public class PictogramLinkDao extends BaseDao<PictogramLink> {

  /**
   * @generated
   */
  @Override
  public Class<PictogramLink> getEntityClass() {
    return PictogramLink.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getPictogramLinkEClass();
  }
}
