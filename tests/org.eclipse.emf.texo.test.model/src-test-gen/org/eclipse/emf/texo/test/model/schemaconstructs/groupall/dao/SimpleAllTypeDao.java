package org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.GroupallModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.SimpleAllType;

/**
 * The Dao implementation for the model object '<em><b>SimpleAllType</b></em>'.
 * 
 * @generated
 */
public class SimpleAllTypeDao extends BaseDao<SimpleAllType> {

  /**
   * @generated
   */
  @Override
  public Class<SimpleAllType> getEntityClass() {
    return SimpleAllType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return GroupallModelPackage.INSTANCE.getSimpleAllTypeEClass();
  }
}
