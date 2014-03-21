package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Extends;

/**
 * The Dao implementation for the model object '<em><b>Extends</b></em>'.
 * 
 * @generated
 */
public class ExtendsDao extends BaseDao<Extends> {

  /**
   * @generated
   */
  @Override
  public Class<Extends> getEntityClass() {
    return Extends.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getExtendsEClass();
  }
}
