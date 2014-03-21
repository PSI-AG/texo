package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractText</b></em>'.
 * 
 * @generated
 */
public class AbstractTextDao extends BaseDao<AbstractText> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractText> getEntityClass() {
    return AbstractText.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getAbstractTextEClass();
  }
}
