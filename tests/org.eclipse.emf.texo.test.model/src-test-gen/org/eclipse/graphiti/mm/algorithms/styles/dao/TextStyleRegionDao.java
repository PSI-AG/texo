package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyleRegion;

/**
 * The Dao implementation for the model object '<em><b>TextStyleRegion</b></em>'.
 * 
 * @generated
 */
public class TextStyleRegionDao extends BaseDao<TextStyleRegion> {

  /**
   * @generated
   */
  @Override
  public Class<TextStyleRegion> getEntityClass() {
    return TextStyleRegion.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getTextStyleRegionEClass();
  }
}
