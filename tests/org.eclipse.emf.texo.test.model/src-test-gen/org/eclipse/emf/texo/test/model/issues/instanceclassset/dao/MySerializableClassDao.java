package org.eclipse.emf.texo.test.model.issues.instanceclassset.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.Bz306546ModelPackage;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.MySerializableClass;

/**
 * The Dao implementation for the model object '<em><b>MySerializableClass</b></em>'.
 * 
 * @generated
 */
public class MySerializableClassDao extends BaseDao<MySerializableClass> {

  /**
   * @generated
   */
  @Override
  public Class<MySerializableClass> getEntityClass() {
    return MySerializableClass.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz306546ModelPackage.INSTANCE.getMySerializableClassEClass();
  }
}
