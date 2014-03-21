package org.eclipse.emf.texo.test.model.samples.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.music.Genre;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Genre</b></em>'.
 * 
 * @generated
 */
public class GenreDao extends BaseDao<Genre> {

  /**
   * @generated
   */
  @Override
  public Class<Genre> getEntityClass() {
    return Genre.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return MusicModelPackage.INSTANCE.getGenreEClass();
  }
}
