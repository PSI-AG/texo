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

import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.server.test.BaseTest;
import org.eclipse.emf.texo.store.TexoResource;

/**
 * Tests the {@link TexoResource}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public abstract class TexoResourceTest extends BaseTest {

  protected static final int PORT = 8080;
  protected static final String CONTEXTNAME = "texo"; //$NON-NLS-1$
  protected static final String JSONWS = "jsonws"; //$NON-NLS-1$

  /**
   * @return the base url of the webservice
   */
  @Override
  protected String getBaseURL() {
    return "http://localhost:" + PORT + "/" + CONTEXTNAME + "/" + JSONWS; //$NON-NLS-1$//$NON-NLS-2$
  }

  public TexoResourceTest(String name) {
    super(name);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();

    // set to false
    // is set to true in super
    EntityManagerProvider.getInstance().setUseCurrentEntityManagerPattern(false);
  }

  protected TexoResource createResource() {
    return createResource(getBaseURL());
  }

  protected abstract TexoResource createResource(String uriString);
}
