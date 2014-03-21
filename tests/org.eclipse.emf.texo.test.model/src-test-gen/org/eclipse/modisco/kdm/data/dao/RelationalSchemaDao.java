package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.RelationalSchema;

/**
 * The Dao implementation for the model object '<em><b>RelationalSchema</b></em>'.
 * 
 * @generated
 */
public class RelationalSchemaDao extends BaseDao<RelationalSchema> {

  /**
   * @generated
   */
  @Override
  public Class<RelationalSchema> getEntityClass() {
    return RelationalSchema.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getRelationalSchemaEClass();
  }
}
