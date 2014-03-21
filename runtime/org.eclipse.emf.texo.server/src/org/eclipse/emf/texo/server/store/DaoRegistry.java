/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 * </copyright>
 *
 * $Id: DaoRegistry.java,v 1.1 2011/09/24 04:00:25 mtaal Exp $
 */
package org.eclipse.emf.texo.server.store;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.component.TexoStaticSingleton;

/**
 * The BaseDaoRegistry keeps track which {@link BaseDao} classes are available for a certain entity class.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class DaoRegistry implements TexoComponent, TexoStaticSingleton {

  private static DaoRegistry instance = ComponentProvider.getInstance().newInstance(DaoRegistry.class);

  public static DaoRegistry getInstance() {
    return instance;
  }

  public static void setInstance(DaoRegistry instance) {
    DaoRegistry.instance = instance;
  }

  private Map<Class<?>, Class<? extends BaseDao<?>>> daoRegistry = new HashMap<Class<?>, Class<? extends BaseDao<?>>>();

  /**
   * Register a new dao class for a certain entity class, note existing registration are overwritten without warning.
   */
  public void registerDao(Class<?> entityClass, Class<? extends BaseDao<?>> daoClass) {
    daoRegistry.put(entityClass, daoClass);
  }

  /**
   * Get a dao instance for a certain entity class. If the Dao can not be found then the {@link GenericModelDao} is
   * returned.
   * 
   * NOTE: if the dao class can not be found then the {@link GenericModelDao} is returned.
   */
  @SuppressWarnings("unchecked")
  public <T extends Object> BaseDao<T> getDaoForEntity(Class<T> entityClass) {
    final Class<? extends BaseDao<?>> daoClass = daoRegistry.get(entityClass);
    // not found return the GenericModelDao
    if (daoClass == null) {
      final GenericModelDao<T> genericDao = ComponentProvider.getInstance().newInstance(GenericModelDao.class);
      genericDao.setEntityClass(entityClass);
      return genericDao;
    }
    return (BaseDao<T>) ComponentProvider.getInstance().newInstance(daoClass);
  }

  /**
   * Get a dao instance for a certain Dao class.
   * 
   * NOTE: if the dao class can not be found null is returned.
   */
  @SuppressWarnings("unchecked")
  public <T extends BaseDao<?>> T getDao(Class<T> daoClass) {
    for (Class<? extends BaseDao<?>> clz : daoRegistry.values()) {
      if (clz.isAssignableFrom(daoClass)) {
        return (T) ComponentProvider.getInstance().newInstance(clz);
      }
    }
    return null;
  }
}
