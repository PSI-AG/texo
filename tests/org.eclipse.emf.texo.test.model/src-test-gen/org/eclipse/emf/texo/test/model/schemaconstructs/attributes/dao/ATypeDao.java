package org.eclipse.emf.texo.test.model.schemaconstructs.attributes.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.attributes.AType;
import org.eclipse.emf.texo.test.model.schemaconstructs.attributes.AttributesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AType</b></em>'.
 * 
 * @generated
 */
public class ATypeDao extends BaseDao<AType> {

  /**
   * @generated
   */
  @Override
  public Class<AType> getEntityClass() {
    return AType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AttributesModelPackage.INSTANCE.getATypeEClass();
  }
}
