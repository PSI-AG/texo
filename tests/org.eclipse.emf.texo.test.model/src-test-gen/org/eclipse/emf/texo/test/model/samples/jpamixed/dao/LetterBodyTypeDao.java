package org.eclipse.emf.texo.test.model.samples.jpamixed.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.jpamixed.JpamixedModelPackage;
import org.eclipse.emf.texo.test.model.samples.jpamixed.LetterBodyType;

/**
 * The Dao implementation for the model object '<em><b>LetterBodyType</b></em>'.
 * 
 * @generated
 */
public class LetterBodyTypeDao extends BaseDao<LetterBodyType> {

  /**
   * @generated
   */
  @Override
  public Class<LetterBodyType> getEntityClass() {
    return LetterBodyType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return JpamixedModelPackage.INSTANCE.getLetterBodyTypeEClass();
  }
}
