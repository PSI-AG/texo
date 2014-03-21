package org.eclipse.emf.texo.test.model.schemaconstructs.restriction.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.RestrictionModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.XMLDeviant;

/**
 * The Dao implementation for the model object '<em><b>XMLDeviant</b></em>'.
 * 
 * @generated
 */
public class XMLDeviantDao extends BaseDao<XMLDeviant> {

  /**
   * @generated
   */
  @Override
  public Class<XMLDeviant> getEntityClass() {
    return XMLDeviant.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RestrictionModelPackage.INSTANCE.getXMLDeviantEClass();
  }
}
