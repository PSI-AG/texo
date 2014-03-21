package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.AbstractStyle;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractStyle</b></em>'.
 * 
 * @generated
 */
public class AbstractStyleDao extends BaseDao<AbstractStyle> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractStyle> getEntityClass() {
    return AbstractStyle.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getAbstractStyleEClass();
  }
}
