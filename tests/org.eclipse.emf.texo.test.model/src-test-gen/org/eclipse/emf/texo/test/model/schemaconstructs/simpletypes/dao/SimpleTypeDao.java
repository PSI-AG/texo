package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpleType;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpletypesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SimpleType</b></em>'.
 * 
 * @generated
 */
public class SimpleTypeDao extends BaseDao<SimpleType> {

  /**
   * @generated
   */
  @Override
  public Class<SimpleType> getEntityClass() {
    return SimpleType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SimpletypesModelPackage.INSTANCE.getSimpleTypeEClass();
  }
}
