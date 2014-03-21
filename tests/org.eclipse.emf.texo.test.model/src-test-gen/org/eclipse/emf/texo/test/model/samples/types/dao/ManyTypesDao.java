package org.eclipse.emf.texo.test.model.samples.types.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.types.ManyTypes;
import org.eclipse.emf.texo.test.model.samples.types.TypesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ManyTypes</b></em>'.
 * 
 * @generated
 */
public class ManyTypesDao extends BaseDao<ManyTypes> {

  /**
   * @generated
   */
  @Override
  public Class<ManyTypes> getEntityClass() {
    return ManyTypes.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return TypesModelPackage.INSTANCE.getManyTypesEClass();
  }
}
