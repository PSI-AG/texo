package org.eclipse.emf.texo.test.model.issues.subpackage.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.subpackage.MainModelPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.MainType;

/**
 * The Dao implementation for the model object '<em><b>MainType</b></em>'.
 * 
 * @generated
 */
public class MainTypeDao extends BaseDao<MainType> {

  /**
   * @generated
   */
  @Override
  public Class<MainType> getEntityClass() {
    return MainType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MainModelPackage.INSTANCE.getMainTypeEClass();
  }
}
