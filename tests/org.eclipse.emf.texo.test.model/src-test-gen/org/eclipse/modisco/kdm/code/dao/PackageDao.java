package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Package;

/**
 * The Dao implementation for the model object '<em><b>Package</b></em>'.
 * 
 * @generated
 */
public class PackageDao extends BaseDao<Package> {

  /**
   * @generated
   */
  @Override
  public Class<Package> getEntityClass() {
    return Package.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getPackageEClass();
  }
}
