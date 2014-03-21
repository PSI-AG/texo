package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.ComplexAAA;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.SubstitutionzvonModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ComplexAAA</b></em>'.
 * 
 * @generated
 */
public class ComplexAAADao extends BaseDao<ComplexAAA> {

  /**
   * @generated
   */
  @Override
  public Class<ComplexAAA> getEntityClass() {
    return ComplexAAA.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionzvonModelPackage.INSTANCE.getComplexAAAEClass();
  }
}
