package org.eclipse.emf.texo.test.model.samples.types.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.types.SingleTypes;
import org.eclipse.emf.texo.test.model.samples.types.TypesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SingleTypes</b></em>'.
 * 
 * @generated
 */
public class SingleTypesDao extends BaseDao<SingleTypes> {

  /**
   * @generated
   */
  @Override
  public Class<SingleTypes> getEntityClass() {
    return SingleTypes.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return TypesModelPackage.INSTANCE.getSingleTypesEClass();
  }
}
