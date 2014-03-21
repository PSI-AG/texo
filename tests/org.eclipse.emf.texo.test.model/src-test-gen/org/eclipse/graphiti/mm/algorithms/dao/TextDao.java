package org.eclipse.graphiti.mm.algorithms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.Text;

/**
 * The Dao implementation for the model object '<em><b>Text</b></em>'.
 * 
 * @generated
 */
public class TextDao extends BaseDao<Text> {

  /**
   * @generated
   */
  @Override
  public Class<Text> getEntityClass() {
    return Text.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AlgorithmsModelPackage.INSTANCE.getTextEClass();
  }
}
