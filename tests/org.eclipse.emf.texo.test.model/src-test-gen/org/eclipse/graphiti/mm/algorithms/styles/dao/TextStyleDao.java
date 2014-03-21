package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyle;

/**
 * The Dao implementation for the model object '<em><b>TextStyle</b></em>'.
 * 
 * @generated
 */
public class TextStyleDao extends BaseDao<TextStyle> {

  /**
   * @generated
   */
  @Override
  public Class<TextStyle> getEntityClass() {
    return TextStyle.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getTextStyleEClass();
  }
}
