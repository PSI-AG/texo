package org.eclipse.emf.texo.test.model.schemaconstructs.include.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.include.Include1;
import org.eclipse.emf.texo.test.model.schemaconstructs.include.IncludeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Include1</b></em>'.
 * 
 * @generated
 */
public class Include1Dao extends BaseDao<Include1> {

  /**
   * @generated
   */
  @Override
  public Class<Include1> getEntityClass() {
    return Include1.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return IncludeModelPackage.INSTANCE.getInclude1EClass();
  }
}
