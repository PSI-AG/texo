package org.eclipse.emf.texo.test.model.samples.interfaces.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.IdentifiedType;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>IdentifiedType</b></em>'.
 * 
 * @generated
 */
public class IdentifiedTypeDao extends BaseDao<IdentifiedType> {

  /**
   * @generated
   */
  @Override
  public Class<IdentifiedType> getEntityClass() {
    return IdentifiedType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfacesModelPackage.INSTANCE.getIdentifiedTypeEClass();
  }
}
