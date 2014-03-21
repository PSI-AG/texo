package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.RenderingStyle;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RenderingStyle</b></em>'.
 * 
 * @generated
 */
public class RenderingStyleDao extends BaseDao<RenderingStyle> {

  /**
   * @generated
   */
  @Override
  public Class<RenderingStyle> getEntityClass() {
    return RenderingStyle.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getRenderingStyleEClass();
  }
}
