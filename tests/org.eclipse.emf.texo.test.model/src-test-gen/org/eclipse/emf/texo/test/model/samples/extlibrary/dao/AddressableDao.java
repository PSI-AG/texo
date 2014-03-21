package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Addressable;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Addressable</b></em>'.
 * 
 * @generated
 */
public class AddressableDao extends BaseDao<Addressable> {

  /**
   * @generated
   */
  @Override
  public Class<Addressable> getEntityClass() {
    return Addressable.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getAddressableEClass();
  }
}
