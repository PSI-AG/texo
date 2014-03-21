package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BoxRelativeAnchor</b></em>'.
 * 
 * @generated
 */
public class BoxRelativeAnchorDao extends BaseDao<BoxRelativeAnchor> {

  /**
   * @generated
   */
  @Override
  public Class<BoxRelativeAnchor> getEntityClass() {
    return BoxRelativeAnchor.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getBoxRelativeAnchorEClass();
  }
}
