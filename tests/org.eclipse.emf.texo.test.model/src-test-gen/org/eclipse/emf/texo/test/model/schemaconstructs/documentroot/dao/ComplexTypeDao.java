package org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.ComplexType;
import org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.DocumentrootModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ComplexType</b></em>'.
 * 
 * @generated
 */
public class ComplexTypeDao extends BaseDao<ComplexType> {

  /**
   * @generated
   */
  @Override
  public Class<ComplexType> getEntityClass() {
    return ComplexType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DocumentrootModelPackage.INSTANCE.getComplexTypeEClass();
  }
}
