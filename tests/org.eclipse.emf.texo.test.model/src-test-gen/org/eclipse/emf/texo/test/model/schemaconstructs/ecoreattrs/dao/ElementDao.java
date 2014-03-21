package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.EcoreattrsModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.Element;

/**
 * The Dao implementation for the model object '<em><b>Element</b></em>'.
 * 
 * @generated
 */
public class ElementDao extends BaseDao<Element> {

  /**
   * @generated
   */
  @Override
  public Class<Element> getEntityClass() {
    return Element.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EcoreattrsModelPackage.INSTANCE.getElementEClass();
  }
}
