package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Color</b></em>'.
 * 
 * @generated
 */
public class ColorDao extends BaseDao<Color> {

  /**
   * @generated
   */
  @Override
  public Class<Color> getEntityClass() {
    return Color.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getColorEClass();
  }
}
