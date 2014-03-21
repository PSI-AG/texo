package org.eclipse.emf.texo.test.model.samples.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;
import org.eclipse.emf.texo.test.model.samples.music.Song;

/**
 * The Dao implementation for the model object '<em><b>Song</b></em>'.
 * 
 * @generated
 */
public class SongDao extends BaseDao<Song> {

  /**
   * @generated
   */
  @Override
  public Class<Song> getEntityClass() {
    return Song.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MusicModelPackage.INSTANCE.getSongEClass();
  }
}
