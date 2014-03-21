package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AdaptedGradientColoredAreas</b></em>'.
 * 
 * @generated
 */
public class AdaptedGradientColoredAreasDao extends BaseDao<AdaptedGradientColoredAreas> {

  /**
   * @generated
   */
  @Override
  public Class<AdaptedGradientColoredAreas> getEntityClass() {
    return AdaptedGradientColoredAreas.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getAdaptedGradientColoredAreasEClass();
  }
}
