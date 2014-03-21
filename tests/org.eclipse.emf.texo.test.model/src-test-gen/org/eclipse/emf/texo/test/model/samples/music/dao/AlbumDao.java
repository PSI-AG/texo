package org.eclipse.emf.texo.test.model.samples.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.music.Album;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Album</b></em>'.
 * 
 * @generated
 */
public class AlbumDao extends BaseDao<Album> {

  /**
   * @generated
   */
  @Override
  public Class<Album> getEntityClass() {
    return Album.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MusicModelPackage.INSTANCE.getAlbumEClass();
  }
}
