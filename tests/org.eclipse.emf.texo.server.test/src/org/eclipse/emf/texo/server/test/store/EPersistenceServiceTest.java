/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ReferersTest.java,v 1.4 2011/08/26 07:58:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.store;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.server.store.EPersistenceService;

/**
 * Tests the {@link EPersistenceService} object.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class EPersistenceServiceTest extends EObjectStoreTest {

  @Override
  protected EPersistenceService getEObjectStore() {
    final EPersistenceService ePersistenceService = ComponentProvider.getInstance().newInstance(
        EPersistenceService.class);
    ePersistenceService.setUri(URI.createURI(STORE_URI));
    return ePersistenceService;
  }
}
