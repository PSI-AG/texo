package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>GradientColoredAreas</b></em>'.
 * 
 * @generated
 */
public class GradientColoredAreasDao extends BaseDao<GradientColoredAreas> {

  /**
   * @generated
   */
  @Override
  public Class<GradientColoredAreas> getEntityClass() {
    return GradientColoredAreas.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getGradientColoredAreasEClass();
  }
}
