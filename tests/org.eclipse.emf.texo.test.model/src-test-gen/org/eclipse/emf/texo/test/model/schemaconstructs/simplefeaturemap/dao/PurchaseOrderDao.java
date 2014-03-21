package org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.PurchaseOrder;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.SimplefeaturemapModelPackage;

/**
 * The Dao implementation for the model object '<em><b>PurchaseOrder</b></em>'.
 * 
 * @generated
 */
public class PurchaseOrderDao extends BaseDao<PurchaseOrder> {

  /**
   * @generated
   */
  @Override
  public Class<PurchaseOrder> getEntityClass() {
    return PurchaseOrder.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SimplefeaturemapModelPackage.INSTANCE.getPurchaseOrderEClass();
  }
}
