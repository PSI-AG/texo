package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.Attribute;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Attribute</b></em>'.
 * 
 * @generated
 */
public class AttributeDao extends BaseDao<Attribute> {

  /**
   * @generated
   */
  @Override
  public Class<Attribute> getEntityClass() {
    return Attribute.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getAttributeEClass();
  }
}
