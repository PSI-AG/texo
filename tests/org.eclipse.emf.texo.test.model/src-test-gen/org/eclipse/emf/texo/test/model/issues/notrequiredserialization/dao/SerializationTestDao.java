package org.eclipse.emf.texo.test.model.issues.notrequiredserialization.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.notrequiredserialization.NotRequiredSerializationModelPackage;
import org.eclipse.emf.texo.test.model.issues.notrequiredserialization.SerializationTest;

/**
 * The Dao implementation for the model object '<em><b>SerializationTest</b></em>'.
 * 
 * @generated
 */
public class SerializationTestDao extends BaseDao<SerializationTest> {

  /**
   * @generated
   */
  @Override
  public Class<SerializationTest> getEntityClass() {
    return SerializationTest.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return NotRequiredSerializationModelPackage.INSTANCE.getSerializationTestEClass();
  }
}
