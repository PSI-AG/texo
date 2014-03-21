package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.kdm.TaggedValue;

/**
 * The Dao implementation for the model object '<em><b>TaggedValue</b></em>'.
 * 
 * @generated
 */
public class TaggedValueDao extends BaseDao<TaggedValue> {

  /**
   * @generated
   */
  @Override
  public Class<TaggedValue> getEntityClass() {
    return TaggedValue.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getTaggedValueEClass();
  }
}
