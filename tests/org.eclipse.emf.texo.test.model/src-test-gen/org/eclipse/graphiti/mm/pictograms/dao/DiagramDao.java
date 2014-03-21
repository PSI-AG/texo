package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Diagram</b></em>'.
 * 
 * @generated
 */
public class DiagramDao extends BaseDao<Diagram> {

  /**
   * @generated
   */
  @Override
  public Class<Diagram> getEntityClass() {
    return Diagram.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getDiagramEClass();
  }
}
