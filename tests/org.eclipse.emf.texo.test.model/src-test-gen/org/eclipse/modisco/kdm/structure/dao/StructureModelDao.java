package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.StructureModel;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>StructureModel</b></em>'.
 * 
 * @generated
 */
public class StructureModelDao extends BaseDao<StructureModel> {

  /**
   * @generated
   */
  @Override
  public Class<StructureModel> getEntityClass() {
    return StructureModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getStructureModelEClass();
  }
}
