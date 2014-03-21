package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.ChoiceContent;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ChoiceContent</b></em>'.
 * 
 * @generated
 */
public class ChoiceContentDao extends BaseDao<ChoiceContent> {

  /**
   * @generated
   */
  @Override
  public Class<ChoiceContent> getEntityClass() {
    return ChoiceContent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getChoiceContentEClass();
  }
}
