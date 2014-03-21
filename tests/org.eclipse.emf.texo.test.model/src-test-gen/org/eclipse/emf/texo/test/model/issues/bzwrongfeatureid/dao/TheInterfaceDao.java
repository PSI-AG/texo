package org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.BzWrongFeatureIdModelPackage;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.TheInterface;

/**
 * The Dao implementation for the model object '<em><b>TheInterface</b></em>'.
 * 
 * @generated
 */
public class TheInterfaceDao extends BaseDao<TheInterface> {

  /**
   * @generated
   */
  @Override
  public Class<TheInterface> getEntityClass() {
    return TheInterface.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BzWrongFeatureIdModelPackage.INSTANCE.getTheInterfaceEClass();
  }
}
