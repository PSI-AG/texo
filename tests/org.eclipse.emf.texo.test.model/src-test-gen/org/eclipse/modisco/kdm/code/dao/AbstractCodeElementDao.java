package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractCodeElement</b></em>'.
 * 
 * @generated
 */
public class AbstractCodeElementDao extends BaseDao<AbstractCodeElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractCodeElement> getEntityClass() {
    return AbstractCodeElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getAbstractCodeElementEClass();
  }
}
