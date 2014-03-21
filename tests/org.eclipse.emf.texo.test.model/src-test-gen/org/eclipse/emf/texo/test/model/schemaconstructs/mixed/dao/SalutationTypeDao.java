package org.eclipse.emf.texo.test.model.schemaconstructs.mixed.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.MixedModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.SalutationType;

/**
 * The Dao implementation for the model object '<em><b>SalutationType</b></em>'.
 * 
 * @generated
 */
public class SalutationTypeDao extends BaseDao<SalutationType> {

  /**
   * @generated
   */
  @Override
  public Class<SalutationType> getEntityClass() {
    return SalutationType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MixedModelPackage.INSTANCE.getSalutationTypeEClass();
  }
}
