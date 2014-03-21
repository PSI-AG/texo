package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.ComplexEvenType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.SubstitutionzvonModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ComplexEvenType</b></em>'.
 * 
 * @generated
 */
public class ComplexEvenTypeDao extends BaseDao<ComplexEvenType> {

  /**
   * @generated
   */
  @Override
  public Class<ComplexEvenType> getEntityClass() {
    return ComplexEvenType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionzvonModelPackage.INSTANCE.getComplexEvenTypeEClass();
  }
}
