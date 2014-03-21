package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.EcoreattrsModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.Mixed;

/**
 * The Dao implementation for the model object '<em><b>Mixed</b></em>'.
 * 
 * @generated
 */
public class MixedDao extends BaseDao<Mixed> {

  /**
   * @generated
   */
  @Override
  public Class<Mixed> getEntityClass() {
    return Mixed.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EcoreattrsModelPackage.INSTANCE.getMixedEClass();
  }
}
