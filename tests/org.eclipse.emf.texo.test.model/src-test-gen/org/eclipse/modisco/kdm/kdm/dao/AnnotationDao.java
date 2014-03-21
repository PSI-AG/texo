package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.Annotation;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Annotation</b></em>'.
 * 
 * @generated
 */
public class AnnotationDao extends BaseDao<Annotation> {

  /**
   * @generated
   */
  @Override
  public Class<Annotation> getEntityClass() {
    return Annotation.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getAnnotationEClass();
  }
}
