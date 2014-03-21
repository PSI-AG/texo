package org.eclipse.modisco.kdm.source.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.source.Image;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Image</b></em>'.
 * 
 * @generated
 */
public class ImageDao extends BaseDao<Image> {

  /**
   * @generated
   */
  @Override
  public Class<Image> getEntityClass() {
    return Image.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SourceModelPackage.INSTANCE.getImageEClass();
  }
}
