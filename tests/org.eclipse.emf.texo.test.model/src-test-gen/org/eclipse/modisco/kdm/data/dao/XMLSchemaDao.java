package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.XMLSchema;

/**
 * The Dao implementation for the model object '<em><b>XMLSchema</b></em>'.
 * 
 * @generated
 */
public class XMLSchemaDao extends BaseDao<XMLSchema> {

  /**
   * @generated
   */
  @Override
  public Class<XMLSchema> getEntityClass() {
    return XMLSchema.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getXMLSchemaEClass();
  }
}
