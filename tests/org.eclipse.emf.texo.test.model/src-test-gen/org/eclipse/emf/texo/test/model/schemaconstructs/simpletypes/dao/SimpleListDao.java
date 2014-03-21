package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpleList;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpletypesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SimpleList</b></em>'.
 * 
 * @generated
 */
public class SimpleListDao extends BaseDao<SimpleList> {

  /**
   * @generated
   */
  @Override
  public Class<SimpleList> getEntityClass() {
    return SimpleList.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SimpletypesModelPackage.INSTANCE.getSimpleListEClass();
  }
}
