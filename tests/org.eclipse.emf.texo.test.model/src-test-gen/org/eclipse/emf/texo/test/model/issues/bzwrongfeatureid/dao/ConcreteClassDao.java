package org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.BzWrongFeatureIdModelPackage;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.ConcreteClass;

/**
 * The Dao implementation for the model object '<em><b>ConcreteClass</b></em>'.
 * 
 * @generated
 */
public class ConcreteClassDao extends BaseDao<ConcreteClass> {

  /**
   * @generated
   */
  @Override
  public Class<ConcreteClass> getEntityClass() {
    return ConcreteClass.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BzWrongFeatureIdModelPackage.INSTANCE.getConcreteClassEClass();
  }
}
