package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.ExtensionFamily;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ExtensionFamily</b></em>'.
 * 
 * @generated
 */
public class ExtensionFamilyDao extends BaseDao<ExtensionFamily> {

  /**
   * @generated
   */
  @Override
  public Class<ExtensionFamily> getEntityClass() {
    return ExtensionFamily.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getExtensionFamilyEClass();
  }
}
