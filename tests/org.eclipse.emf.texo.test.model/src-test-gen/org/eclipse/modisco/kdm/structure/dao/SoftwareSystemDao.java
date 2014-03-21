package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.SoftwareSystem;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SoftwareSystem</b></em>'.
 * 
 * @generated
 */
public class SoftwareSystemDao extends BaseDao<SoftwareSystem> {

  /**
   * @generated
   */
  @Override
  public Class<SoftwareSystem> getEntityClass() {
    return SoftwareSystem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getSoftwareSystemEClass();
  }
}
