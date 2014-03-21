package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.MacroDirective;

/**
 * The Dao implementation for the model object '<em><b>MacroDirective</b></em>'.
 * 
 * @generated
 */
public class MacroDirectiveDao extends BaseDao<MacroDirective> {

  /**
   * @generated
   */
  @Override
  public Class<MacroDirective> getEntityClass() {
    return MacroDirective.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getMacroDirectiveEClass();
  }
}
