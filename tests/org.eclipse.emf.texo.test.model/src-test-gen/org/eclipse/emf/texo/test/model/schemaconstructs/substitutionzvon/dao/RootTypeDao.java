package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.RootType;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.SubstitutionzvonModelPackage;

/**
 * The Dao implementation for the model object '<em><b>RootType</b></em>'.
 * 
 * @generated
 */
public class RootTypeDao extends BaseDao<RootType> {

  /**
   * @generated
   */
  @Override
  public Class<RootType> getEntityClass() {
    return RootType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SubstitutionzvonModelPackage.INSTANCE.getRootTypeEClass();
  }
}
