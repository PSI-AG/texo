package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.DrivingLicense;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DrivingLicense</b></em>'.
 * 
 * @generated
 */
public class DrivingLicenseDao extends BaseDao<DrivingLicense> {

  /**
   * @generated
   */
  @Override
  public Class<DrivingLicense> getEntityClass() {
    return DrivingLicense.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getDrivingLicenseEClass();
  }
}
