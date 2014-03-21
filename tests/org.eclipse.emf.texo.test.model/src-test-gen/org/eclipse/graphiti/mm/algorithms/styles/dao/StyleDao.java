package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Style</b></em>'.
 * 
 * @generated
 */
public class StyleDao extends BaseDao<Style> {

  /**
   * @generated
   */
  @Override
  public Class<Style> getEntityClass() {
    return Style.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getStyleEClass();
  }
}
