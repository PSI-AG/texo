package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredLocation;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>GradientColoredLocation</b></em>'.
 * 
 * @generated
 */
public class GradientColoredLocationDao extends BaseDao<GradientColoredLocation> {

  /**
   * @generated
   */
  @Override
  public Class<GradientColoredLocation> getEntityClass() {
    return GradientColoredLocation.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getGradientColoredLocationEClass();
  }
}
