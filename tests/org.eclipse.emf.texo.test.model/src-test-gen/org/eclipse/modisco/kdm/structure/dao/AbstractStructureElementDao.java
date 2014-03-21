package org.eclipse.modisco.kdm.structure.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.structure.AbstractStructureElement;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractStructureElement</b></em>'.
 * 
 * @generated
 */
public class AbstractStructureElementDao extends BaseDao<AbstractStructureElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractStructureElement> getEntityClass() {
    return AbstractStructureElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return StructureModelPackage.INSTANCE.getAbstractStructureElementEClass();
  }
}
