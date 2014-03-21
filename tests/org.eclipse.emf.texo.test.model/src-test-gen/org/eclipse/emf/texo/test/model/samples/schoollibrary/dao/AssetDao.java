package org.eclipse.emf.texo.test.model.samples.schoollibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.Asset;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Asset</b></em>'.
 * 
 * @generated
 */
public class AssetDao extends BaseDao<Asset> {

  /**
   * @generated
   */
  @Override
  public Class<Asset> getEntityClass() {
    return Asset.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SchoollibraryModelPackage.INSTANCE.getAssetEClass();
  }
}
