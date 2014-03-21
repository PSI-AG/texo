package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.AudioVisualItem;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AudioVisualItem</b></em>'.
 * 
 * @generated
 */
public class AudioVisualItemDao extends BaseDao<AudioVisualItem> {

  /**
   * @generated
   */
  @Override
  public Class<AudioVisualItem> getEntityClass() {
    return AudioVisualItem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getAudioVisualItemEClass();
  }
}
