package org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.EvenComplexNumberType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>EvenComplexNumberType</b></em>'.
 * 
 * @generated
 */
public class EvenComplexNumberTypeDao extends BaseDao<EvenComplexNumberType> {

  /**
   * @generated
   */
  @Override
  public Class<EvenComplexNumberType> getEntityClass() {
    return EvenComplexNumberType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionModelPackage.INSTANCE.getEvenComplexNumberTypeEClass();
  }
}
