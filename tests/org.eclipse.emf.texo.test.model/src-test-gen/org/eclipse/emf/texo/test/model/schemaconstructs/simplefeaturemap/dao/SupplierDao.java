package org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.SimplefeaturemapModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.Supplier;

/**
 * The Dao implementation for the model object '<em><b>Supplier</b></em>'.
 * 
 * @generated
 */
public class SupplierDao extends BaseDao<Supplier> {

  /**
   * @generated
   */
  @Override
  public Class<Supplier> getEntityClass() {
    return Supplier.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SimplefeaturemapModelPackage.INSTANCE.getSupplierEClass();
  }
}
