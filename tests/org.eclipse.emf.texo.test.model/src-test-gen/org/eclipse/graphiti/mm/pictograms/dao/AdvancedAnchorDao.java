package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.AdvancedAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AdvancedAnchor</b></em>'.
 * 
 * @generated
 */
public class AdvancedAnchorDao extends BaseDao<AdvancedAnchor> {

  /**
   * @generated
   */
  @Override
  public Class<AdvancedAnchor> getEntityClass() {
    return AdvancedAnchor.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getAdvancedAnchorEClass();
  }
}
