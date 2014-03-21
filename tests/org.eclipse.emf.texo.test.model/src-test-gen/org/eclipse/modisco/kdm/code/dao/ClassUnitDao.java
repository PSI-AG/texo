package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.ClassUnit;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ClassUnit</b></em>'.
 * 
 * @generated
 */
public class ClassUnitDao extends BaseDao<ClassUnit> {

  /**
   * @generated
   */
  @Override
  public Class<ClassUnit> getEntityClass() {
    return ClassUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getClassUnitEClass();
  }
}
