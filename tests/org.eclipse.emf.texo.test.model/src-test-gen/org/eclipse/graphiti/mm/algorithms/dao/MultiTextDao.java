package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.MultiText;

/**
 * The Dao implementation for the model object '<em><b>MultiText</b></em>'.
 * 
 * @generated
 */
public class MultiTextDao extends BaseDao<MultiText> {

  /**
   * @generated
   */
  @Override
  public Class<MultiText> getEntityClass() {
    return MultiText.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getMultiTextEClass();
  }
}
