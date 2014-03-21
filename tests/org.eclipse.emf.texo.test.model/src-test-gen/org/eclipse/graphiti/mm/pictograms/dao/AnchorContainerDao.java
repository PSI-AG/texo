package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AnchorContainer</b></em>'.
 * 
 * @generated
 */
public class AnchorContainerDao extends BaseDao<AnchorContainer> {

  /**
   * @generated
   */
  @Override
  public Class<AnchorContainer> getEntityClass() {
    return AnchorContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getAnchorContainerEClass();
  }
}
