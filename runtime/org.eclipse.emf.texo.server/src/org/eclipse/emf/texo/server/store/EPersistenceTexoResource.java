/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.store.EObjectStore;
import org.eclipse.emf.texo.store.TexoResource;

/**
 * A TexoResource which uses the {@link EPersistenceService} for querying and persisting.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EPersistenceTexoResource extends TexoResource {

  @Override
  protected EObjectStore createEObjectStore() {
    final EPersistenceService ePersistenceService = ComponentProvider.getInstance().newInstance(
        EPersistenceService.class);
    ePersistenceService.setUri(getURI());
    return ePersistenceService;
  }

}
