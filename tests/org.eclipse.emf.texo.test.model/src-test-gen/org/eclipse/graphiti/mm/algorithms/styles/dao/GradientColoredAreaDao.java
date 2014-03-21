package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>GradientColoredArea</b></em>'.
 * 
 * @generated
 */
public class GradientColoredAreaDao extends BaseDao<GradientColoredArea> {

  /**
   * @generated
   */
  @Override
  public Class<GradientColoredArea> getEntityClass() {
    return GradientColoredArea.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getGradientColoredAreaEClass();
  }
}
