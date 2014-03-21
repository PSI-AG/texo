package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.kdm.Segment;

/**
 * The Dao implementation for the model object '<em><b>Segment</b></em>'.
 * 
 * @generated
 */
public class SegmentDao extends BaseDao<Segment> {

  /**
   * @generated
   */
  @Override
  public Class<Segment> getEntityClass() {
    return Segment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getSegmentEClass();
  }
}
