package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.EcoreattrsModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.Feature;

/**
 * The Dao implementation for the model object '<em><b>Feature</b></em>'.
 * 
 * @generated
 */
public class FeatureDao extends BaseDao<Feature> {

  /**
   * @generated
   */
  @Override
  public Class<Feature> getEntityClass() {
    return Feature.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EcoreattrsModelPackage.INSTANCE.getFeatureEClass();
  }
}
