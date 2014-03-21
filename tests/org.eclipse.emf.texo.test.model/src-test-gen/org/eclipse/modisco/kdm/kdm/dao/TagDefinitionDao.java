package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.kdm.TagDefinition;

/**
 * The Dao implementation for the model object '<em><b>TagDefinition</b></em>'.
 * 
 * @generated
 */
public class TagDefinitionDao extends BaseDao<TagDefinition> {

  /**
   * @generated
   */
  @Override
  public Class<TagDefinition> getEntityClass() {
    return TagDefinition.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getTagDefinitionEClass();
  }
}
