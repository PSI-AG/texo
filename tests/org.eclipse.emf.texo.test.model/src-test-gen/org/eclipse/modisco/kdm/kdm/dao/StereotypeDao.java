package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.kdm.Stereotype;

/**
 * The Dao implementation for the model object '<em><b>Stereotype</b></em>'.
 * 
 * @generated
 */
public class StereotypeDao extends BaseDao<Stereotype> {

  /**
   * @generated
   */
  @Override
  public Class<Stereotype> getEntityClass() {
    return Stereotype.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getStereotypeEClass();
  }
}
