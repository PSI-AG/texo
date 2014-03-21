package org.eclipse.emf.texo.test.model.samples.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.music.Artist;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Artist</b></em>'.
 * 
 * @generated
 */
public class ArtistDao extends BaseDao<Artist> {

  /**
   * @generated
   */
  @Override
  public Class<Artist> getEntityClass() {
    return Artist.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MusicModelPackage.INSTANCE.getArtistEClass();
  }
}
