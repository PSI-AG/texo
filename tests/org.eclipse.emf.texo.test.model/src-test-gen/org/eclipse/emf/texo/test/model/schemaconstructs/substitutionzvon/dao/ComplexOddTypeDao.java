package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.ComplexOddType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.SubstitutionzvonModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ComplexOddType</b></em>'.
 * 
 * @generated
 */
public class ComplexOddTypeDao extends BaseDao<ComplexOddType> {

  /**
   * @generated
   */
  @Override
  public Class<ComplexOddType> getEntityClass() {
    return ComplexOddType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionzvonModelPackage.INSTANCE.getComplexOddTypeEClass();
  }
}
