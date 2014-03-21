package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.SeqContent;

/**
 * The Dao implementation for the model object '<em><b>SeqContent</b></em>'.
 * 
 * @generated
 */
public class SeqContentDao extends BaseDao<SeqContent> {

  /**
   * @generated
   */
  @Override
  public Class<SeqContent> getEntityClass() {
    return SeqContent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getSeqContentEClass();
  }
}
