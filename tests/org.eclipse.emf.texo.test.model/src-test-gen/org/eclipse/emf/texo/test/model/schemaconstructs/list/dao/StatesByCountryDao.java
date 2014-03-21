package org.eclipse.emf.texo.test.model.schemaconstructs.list.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.list.ListModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.list.StatesByCountry;

/**
 * The Dao implementation for the model object '<em><b>statesByCountry</b></em>'.
 * 
 * @generated
 */
public class StatesByCountryDao extends BaseDao<StatesByCountry> {

  /**
   * @generated
   */
  @Override
  public Class<StatesByCountry> getEntityClass() {
    return StatesByCountry.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ListModelPackage.INSTANCE.getStatesByCountryEClass();
  }
}
