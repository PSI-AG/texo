package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ChopboxAnchor</b></em>'.
 * 
 * @generated
 */
public class ChopboxAnchorDao extends BaseDao<ChopboxAnchor> {

  /**
   * @generated
   */
  @Override
  public Class<ChopboxAnchor> getEntityClass() {
    return ChopboxAnchor.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getChopboxAnchorEClass();
  }
}
