package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.RelationalTable;

/**
 * The Dao implementation for the model object '<em><b>RelationalTable</b></em>'.
 * 
 * @generated
 */
public class RelationalTableDao extends BaseDao<RelationalTable> {

  /**
   * @generated
   */
  @Override
  public Class<RelationalTable> getEntityClass() {
    return RelationalTable.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getRelationalTableEClass();
  }
}
