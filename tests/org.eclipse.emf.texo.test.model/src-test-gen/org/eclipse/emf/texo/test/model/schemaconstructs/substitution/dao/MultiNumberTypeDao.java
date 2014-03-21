package org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.MultiNumberType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>MultiNumberType</b></em>'.
 * 
 * @generated
 */
public class MultiNumberTypeDao extends BaseDao<MultiNumberType> {

  /**
   * @generated
   */
  @Override
  public Class<MultiNumberType> getEntityClass() {
    return MultiNumberType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionModelPackage.INSTANCE.getMultiNumberTypeEClass();
  }
}
