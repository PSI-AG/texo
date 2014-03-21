package org.eclipse.emf.texo.test.model.schemaconstructs.duration.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.duration.DurationModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.duration.DurationTest;

/**
 * The Dao implementation for the model object '<em><b>DurationTest</b></em>'.
 * 
 * @generated
 */
public class DurationTestDao extends BaseDao<DurationTest> {

  /**
   * @generated
   */
  @Override
  public Class<DurationTest> getEntityClass() {
    return DurationTest.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DurationModelPackage.INSTANCE.getDurationTestEClass();
  }
}
