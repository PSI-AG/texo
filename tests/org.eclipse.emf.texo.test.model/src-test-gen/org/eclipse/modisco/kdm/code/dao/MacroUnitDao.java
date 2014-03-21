package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.MacroUnit;

/**
 * The Dao implementation for the model object '<em><b>MacroUnit</b></em>'.
 * 
 * @generated
 */
public class MacroUnitDao extends BaseDao<MacroUnit> {

  /**
   * @generated
   */
  @Override
  public Class<MacroUnit> getEntityClass() {
    return MacroUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getMacroUnitEClass();
  }
}
