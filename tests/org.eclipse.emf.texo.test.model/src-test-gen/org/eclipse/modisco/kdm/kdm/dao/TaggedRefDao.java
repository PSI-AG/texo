package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.kdm.TaggedRef;

/**
 * The Dao implementation for the model object '<em><b>TaggedRef</b></em>'.
 * 
 * @generated
 */
public class TaggedRefDao extends BaseDao<TaggedRef> {

  /**
   * @generated
   */
  @Override
  public Class<TaggedRef> getEntityClass() {
    return TaggedRef.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getTaggedRefEClass();
  }
}
