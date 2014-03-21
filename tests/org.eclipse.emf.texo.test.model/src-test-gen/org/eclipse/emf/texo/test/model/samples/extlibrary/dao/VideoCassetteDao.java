package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.VideoCassette;

/**
 * The Dao implementation for the model object '<em><b>VideoCassette</b></em>'.
 * 
 * @generated
 */
public class VideoCassetteDao extends BaseDao<VideoCassette> {

  /**
   * @generated
   */
  @Override
  public Class<VideoCassette> getEntityClass() {
    return VideoCassette.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getVideoCassetteEClass();
  }
}
