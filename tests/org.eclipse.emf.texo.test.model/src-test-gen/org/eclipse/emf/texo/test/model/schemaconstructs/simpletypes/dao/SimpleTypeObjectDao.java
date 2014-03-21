package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpleTypeObject;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpletypesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SimpleTypeObject</b></em>'.
 * 
 * @generated
 */
public class SimpleTypeObjectDao extends BaseDao<SimpleTypeObject> {

  /**
   * @generated
   */
  @Override
  public Class<SimpleTypeObject> getEntityClass() {
    return SimpleTypeObject.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SimpletypesModelPackage.INSTANCE.getSimpleTypeObjectEClass();
  }
}
