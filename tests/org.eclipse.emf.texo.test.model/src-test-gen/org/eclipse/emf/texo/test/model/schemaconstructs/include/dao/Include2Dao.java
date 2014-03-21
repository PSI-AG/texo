package org.eclipse.emf.texo.test.model.schemaconstructs.include.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.include.Include2;
import org.eclipse.emf.texo.test.model.schemaconstructs.include.IncludeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Include2</b></em>'.
 * 
 * @generated
 */
public class Include2Dao extends BaseDao<Include2> {

  /**
   * @generated
   */
  @Override
  public Class<Include2> getEntityClass() {
    return Include2.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return IncludeModelPackage.INSTANCE.getInclude2EClass();
  }
}
