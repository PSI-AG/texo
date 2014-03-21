package org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.GroupallModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.SimpleAllMapType;

/**
 * The Dao implementation for the model object '<em><b>SimpleAllMapType</b></em>'.
 * 
 * @generated
 */
public class SimpleAllMapTypeDao extends BaseDao<SimpleAllMapType> {

  /**
   * @generated
   */
  @Override
  public Class<SimpleAllMapType> getEntityClass() {
    return SimpleAllMapType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return GroupallModelPackage.INSTANCE.getSimpleAllMapTypeEClass();
  }
}
