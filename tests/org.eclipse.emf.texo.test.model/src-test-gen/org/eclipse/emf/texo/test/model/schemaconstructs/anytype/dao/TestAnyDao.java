package org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.AnytypeModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.TestAny;

/**
 * The Dao implementation for the model object '<em><b>TestAny</b></em>'.
 * 
 * @generated
 */
public class TestAnyDao extends BaseDao<TestAny> {

  /**
   * @generated
   */
  @Override
  public Class<TestAny> getEntityClass() {
    return TestAny.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AnytypeModelPackage.INSTANCE.getTestAnyEClass();
  }
}
