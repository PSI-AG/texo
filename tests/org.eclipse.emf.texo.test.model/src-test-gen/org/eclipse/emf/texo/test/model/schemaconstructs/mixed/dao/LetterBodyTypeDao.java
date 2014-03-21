package org.eclipse.emf.texo.test.model.schemaconstructs.mixed.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.LetterBodyType;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.MixedModelPackage;

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
    return MixedModelPackage.INSTANCE.getLetterBodyTypeEClass();
  }
}
