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
 * $Id: GenericModelDao.java,v 1.1 2011/09/24 04:00:24 mtaal Exp $
 */
package org.eclipse.emf.texo.server.store;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.model.ModelResolver;

/**
 * A generic Dao which uses the {@link ModelResolver} to get the {@link EClass} and other information.
 * 
 * If no Dao is generated for a certain type then the {@link GenericModelDao} is used.
 * 
 * @see DaoRegistry
 * @see DaoRegistry#getDaoForEntity(Class)
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class GenericModelDao<T extends Object> extends BaseDao<T> {

  private Class<T> entityClass;
  private EClass eClass;

  @Override
  public Class<T> getEntityClass() {
    return entityClass;
  }

  @Override
  public EClass getEClass() {
    if (eClass == null) {
      eClass = (EClass) ModelResolver.getInstance().getModelDescriptor(getEntityClass(), true).getEClassifier();
    }
    return eClass;
  }

  public void setEntityClass(Class<T> entityClass) {
    this.entityClass = entityClass;
  }

}
