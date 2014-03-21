package org.eclipse.emf.texo.test.model.schemaconstructs.attributes.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.attributes.AttributesModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.attributes.RType;

/**
 * The Dao implementation for the model object '<em><b>RType</b></em>'.
 * 
 * @generated
 */
public class RTypeDao extends BaseDao<RType> {

  /**
   * @generated
   */
  @Override
  public Class<RType> getEntityClass() {
    return RType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AttributesModelPackage.INSTANCE.getRTypeEClass();
  }
}
