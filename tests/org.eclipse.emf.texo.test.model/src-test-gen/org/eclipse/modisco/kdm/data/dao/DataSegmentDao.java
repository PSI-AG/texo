package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.DataSegment;

/**
 * The Dao implementation for the model object '<em><b>DataSegment</b></em>'.
 * 
 * @generated
 */
public class DataSegmentDao extends BaseDao<DataSegment> {

  /**
   * @generated
   */
  @Override
  public Class<DataSegment> getEntityClass() {
    return DataSegment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataSegmentEClass();
  }
}
