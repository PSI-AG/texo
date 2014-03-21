package org.eclipse.graphiti.mm.algorithms.styles.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.algorithms.styles.PrecisionPoint;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PrecisionPoint</b></em>'.
 * 
 * @generated
 */
public class PrecisionPointDao extends BaseDao<PrecisionPoint> {

  /**
   * @generated
   */
  @Override
  public Class<PrecisionPoint> getEntityClass() {
    return PrecisionPoint.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StylesModelPackage.INSTANCE.getPrecisionPointEClass();
  }
}
