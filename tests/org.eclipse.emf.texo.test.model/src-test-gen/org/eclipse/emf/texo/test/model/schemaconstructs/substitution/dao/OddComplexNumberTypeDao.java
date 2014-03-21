package org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.OddComplexNumberType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>OddComplexNumberType</b></em>'.
 * 
 * @generated
 */
public class OddComplexNumberTypeDao extends BaseDao<OddComplexNumberType> {

  /**
   * @generated
   */
  @Override
  public Class<OddComplexNumberType> getEntityClass() {
    return OddComplexNumberType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionModelPackage.INSTANCE.getOddComplexNumberTypeEClass();
  }
}
