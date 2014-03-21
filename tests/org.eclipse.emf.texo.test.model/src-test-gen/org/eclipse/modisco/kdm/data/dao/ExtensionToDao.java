package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ExtensionTo;

/**
 * The Dao implementation for the model object '<em><b>ExtensionTo</b></em>'.
 * 
 * @generated
 */
public class ExtensionToDao extends BaseDao<ExtensionTo> {

  /**
   * @generated
   */
  @Override
  public Class<ExtensionTo> getEntityClass() {
    return ExtensionTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getExtensionToEClass();
  }
}
