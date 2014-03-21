package org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.NumberType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>NumberType</b></em>'.
 * 
 * @generated
 */
public class NumberTypeDao extends BaseDao<NumberType> {

  /**
   * @generated
   */
  @Override
  public Class<NumberType> getEntityClass() {
    return NumberType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionModelPackage.INSTANCE.getNumberTypeEClass();
  }
}
