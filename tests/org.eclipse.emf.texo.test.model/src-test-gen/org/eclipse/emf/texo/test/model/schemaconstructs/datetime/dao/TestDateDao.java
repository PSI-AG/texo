package org.eclipse.emf.texo.test.model.schemaconstructs.datetime.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.datetime.DatetimeModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.datetime.TestDate;

/**
 * The Dao implementation for the model object '<em><b>TestDate</b></em>'.
 * 
 * @generated
 */
public class TestDateDao extends BaseDao<TestDate> {

  /**
   * @generated
   */
  @Override
  public Class<TestDate> getEntityClass() {
    return TestDate.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DatetimeModelPackage.INSTANCE.getTestDateEClass();
  }
}
