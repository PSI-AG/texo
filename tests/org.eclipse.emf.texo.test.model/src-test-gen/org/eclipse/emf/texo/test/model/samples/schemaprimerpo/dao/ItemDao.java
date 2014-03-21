package org.eclipse.emf.texo.test.model.samples.schemaprimerpo.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.Item;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.SchemaprimerpoModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Item</b></em>'.
 * 
 * @generated
 */
public class ItemDao extends BaseDao<Item> {

  /**
   * @generated
   */
  @Override
  public Class<Item> getEntityClass() {
    return Item.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SchemaprimerpoModelPackage.INSTANCE.getItemEClass();
  }
}
