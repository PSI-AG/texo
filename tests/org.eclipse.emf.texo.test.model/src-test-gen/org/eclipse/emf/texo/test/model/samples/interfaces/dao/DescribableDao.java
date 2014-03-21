package org.eclipse.emf.texo.test.model.samples.interfaces.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.Describable;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Describable</b></em>'.
 * 
 * @generated
 */
public class DescribableDao extends BaseDao<Describable> {

  /**
   * @generated
   */
  @Override
  public Class<Describable> getEntityClass() {
    return Describable.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfacesModelPackage.INSTANCE.getDescribableEClass();
  }
}
