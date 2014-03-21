package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;
import org.eclipse.modisco.kdm.structure.Subsystem;

/**
 * The Dao implementation for the model object '<em><b>Subsystem</b></em>'.
 * 
 * @generated
 */
public class SubsystemDao extends BaseDao<Subsystem> {

  /**
   * @generated
   */
  @Override
  public Class<Subsystem> getEntityClass() {
    return Subsystem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getSubsystemEClass();
  }
}
