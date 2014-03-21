package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.EcoreattrsModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.NameList;

/**
 * The Dao implementation for the model object '<em><b>NameList</b></em>'.
 * 
 * @generated
 */
public class NameListDao extends BaseDao<NameList> {

  /**
   * @generated
   */
  @Override
  public Class<NameList> getEntityClass() {
    return NameList.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EcoreattrsModelPackage.INSTANCE.getNameListEClass();
  }
}
