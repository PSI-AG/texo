package org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.ComplexNumber;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ComplexNumber</b></em>'.
 * 
 * @generated
 */
public class ComplexNumberDao extends BaseDao<ComplexNumber> {

  /**
   * @generated
   */
  @Override
  public Class<ComplexNumber> getEntityClass() {
    return ComplexNumber.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionModelPackage.INSTANCE.getComplexNumberEClass();
  }
}
