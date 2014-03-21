package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.ArchitectureView;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ArchitectureView</b></em>'.
 * 
 * @generated
 */
public class ArchitectureViewDao extends BaseDao<ArchitectureView> {

  /**
   * @generated
   */
  @Override
  public Class<ArchitectureView> getEntityClass() {
    return ArchitectureView.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getArchitectureViewEClass();
  }
}
