package org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.AbstractClass;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.BzWrongFeatureIdModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractClass</b></em>'.
 * 
 * @generated
 */
public class AbstractClassDao extends BaseDao<AbstractClass> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractClass> getEntityClass() {
    return AbstractClass.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BzWrongFeatureIdModelPackage.INSTANCE.getAbstractClassEClass();
  }
}
