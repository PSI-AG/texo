package org.eclipse.emf.texo.test.model.schemaconstructs.qname.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.qname.Mytest;
import org.eclipse.emf.texo.test.model.schemaconstructs.qname.QnameModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Mytest</b></em>'.
 * 
 * @generated
 */
public class MytestDao extends BaseDao<Mytest> {

  /**
   * @generated
   */
  @Override
  public Class<Mytest> getEntityClass() {
    return Mytest.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return QnameModelPackage.INSTANCE.getMytestEClass();
  }
}
