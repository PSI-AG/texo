package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.InterfaceUnit;

/**
 * The Dao implementation for the model object '<em><b>InterfaceUnit</b></em>'.
 * 
 * @generated
 */
public class InterfaceUnitDao extends BaseDao<InterfaceUnit> {

  /**
   * @generated
   */
  @Override
  public Class<InterfaceUnit> getEntityClass() {
    return InterfaceUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getInterfaceUnitEClass();
  }
}
