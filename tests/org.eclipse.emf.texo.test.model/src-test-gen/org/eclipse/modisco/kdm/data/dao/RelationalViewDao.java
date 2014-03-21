package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.RelationalView;

/**
 * The Dao implementation for the model object '<em><b>RelationalView</b></em>'.
 * 
 * @generated
 */
public class RelationalViewDao extends BaseDao<RelationalView> {

  /**
   * @generated
   */
  @Override
  public Class<RelationalView> getEntityClass() {
    return RelationalView.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getRelationalViewEClass();
  }
}
