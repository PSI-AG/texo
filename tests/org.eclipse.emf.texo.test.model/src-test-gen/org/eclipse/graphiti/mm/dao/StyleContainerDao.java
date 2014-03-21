package org.eclipse.graphiti.mm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.MmModelPackage;
import org.eclipse.graphiti.mm.StyleContainer;

/**
 * The Dao implementation for the model object '<em><b>StyleContainer</b></em>'.
 * 
 * @generated
 */
public class StyleContainerDao extends BaseDao<StyleContainer> {

  /**
   * @generated
   */
  @Override
  public Class<StyleContainer> getEntityClass() {
    return StyleContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MmModelPackage.INSTANCE.getStyleContainerEClass();
  }
}
