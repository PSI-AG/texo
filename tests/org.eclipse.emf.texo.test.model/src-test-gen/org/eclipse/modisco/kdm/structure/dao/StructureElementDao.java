package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.StructureElement;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>StructureElement</b></em>'.
 * 
 * @generated
 */
public class StructureElementDao extends BaseDao<StructureElement> {

  /**
   * @generated
   */
  @Override
  public Class<StructureElement> getEntityClass() {
    return StructureElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getStructureElementEClass();
  }
}
