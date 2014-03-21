package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.CirculatingItem;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CirculatingItem</b></em>'.
 * 
 * @generated
 */
public class CirculatingItemDao extends BaseDao<CirculatingItem> {

  /**
   * @generated
   */
  @Override
  public Class<CirculatingItem> getEntityClass() {
    return CirculatingItem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getCirculatingItemEClass();
  }
}
