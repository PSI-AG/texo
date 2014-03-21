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
import org.eclipse.emf.texo.json.JSONEObjectStore;
import org.eclipse.emf.texo.server.store.EPersistenceService;
import org.junit.After;
import org.junit.Before;

/**
 * Tests the {@link EPersistenceService} object.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class JSONEObjectStoreTest extends EObjectStoreTest {

  @Before
  @Override
  public void setUp() throws Exception {
    super.setUp();
    doServerSetUp();
  }

  @Override
  @After
  public void tearDown() throws Exception {
    super.tearDown();
    doServerTearDown();
  }

  @Override
  protected JSONEObjectStore getEObjectStore() {
    final JSONEObjectStore jsonEObjectStore = ComponentProvider.getInstance().newInstance(JSONEObjectStore.class);
    jsonEObjectStore.setUri(URI.createURI(getBaseURL() + "/" + JSONWS));
    jsonEObjectStore.setChildLevels(1);
    return jsonEObjectStore;
  }
}
