package org.eclipse.graphiti.mm.pictograms.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConnectionDecorator</b></em>'.
 * 
 * @generated
 */
public class ConnectionDecoratorDao extends BaseDao<ConnectionDecorator> {

  /**
   * @generated
   */
  @Override
  public Class<ConnectionDecorator> getEntityClass() {
    return ConnectionDecorator.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PictogramsModelPackage.INSTANCE.getConnectionDecoratorEClass();
  }
}
