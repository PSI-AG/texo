package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.MixedContent;

/**
 * The Dao implementation for the model object '<em><b>MixedContent</b></em>'.
 * 
 * @generated
 */
public class MixedContentDao extends BaseDao<MixedContent> {

  /**
   * @generated
   */
  @Override
  public Class<MixedContent> getEntityClass() {
    return MixedContent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getMixedContentEClass();
  }
}
