package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Message;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Message</b></em>'.
 * 
 * @generated
 */
public class MessageDao extends BaseDao<Message> {

  /**
   * @generated
   */
  @Override
  public Class<Message> getEntityClass() {
    return Message.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getMessageEClass();
  }
}
