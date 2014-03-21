package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PictogramElement</b></em>'.
 * 
 * @generated
 */
public class PictogramElementDao extends BaseDao<PictogramElement> {

  /**
   * @generated
   */
  @Override
  public Class<PictogramElement> getEntityClass() {
    return PictogramElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getPictogramElementEClass();
  }
}
