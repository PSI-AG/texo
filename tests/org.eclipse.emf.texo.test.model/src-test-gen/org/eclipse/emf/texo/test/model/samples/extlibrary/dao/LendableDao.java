package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Lendable;

/**
 * The Dao implementation for the model object '<em><b>Lendable</b></em>'.
 * 
 * @generated
 */
public class LendableDao extends BaseDao<Lendable> {

  /**
   * @generated
   */
  @Override
  public Class<Lendable> getEntityClass() {
    return Lendable.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getLendableEClass();
  }
}
