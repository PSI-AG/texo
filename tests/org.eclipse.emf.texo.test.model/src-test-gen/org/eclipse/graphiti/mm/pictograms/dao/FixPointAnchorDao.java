package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>FixPointAnchor</b></em>'.
 * 
 * @generated
 */
public class FixPointAnchorDao extends BaseDao<FixPointAnchor> {

  /**
   * @generated
   */
  @Override
  public Class<FixPointAnchor> getEntityClass() {
    return FixPointAnchor.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getFixPointAnchorEClass();
  }
}
