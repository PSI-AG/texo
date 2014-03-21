package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Font</b></em>'.
 * 
 * @generated
 */
public class FontDao extends BaseDao<Font> {

  /**
   * @generated
   */
  @Override
  public Class<Font> getEntityClass() {
    return Font.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getFontEClass();
  }
}
