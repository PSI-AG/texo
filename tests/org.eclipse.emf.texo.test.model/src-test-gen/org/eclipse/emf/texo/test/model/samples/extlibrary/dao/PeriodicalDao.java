package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Periodical;

/**
 * The Dao implementation for the model object '<em><b>Periodical</b></em>'.
 * 
 * @generated
 */
public class PeriodicalDao extends BaseDao<Periodical> {

  /**
   * @generated
   */
  @Override
  public Class<Periodical> getEntityClass() {
    return Periodical.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getPeriodicalEClass();
  }
}
