package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.ResourceDescription;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ResourceDescription</b></em>'.
 * 
 * @generated
 */
public class ResourceDescriptionDao extends BaseDao<ResourceDescription> {

  /**
   * @generated
   */
  @Override
  public Class<ResourceDescription> getEntityClass() {
    return ResourceDescription.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getResourceDescriptionEClass();
  }
}
