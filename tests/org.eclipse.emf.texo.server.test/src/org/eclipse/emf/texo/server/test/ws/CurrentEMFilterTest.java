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
 * $Id: CurrentEMFilterTest.java,v 1.1 2011/09/24 04:46:48 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test.ws;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Test;

/**
 * Tests the EntityManager request Filter.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class CurrentEMFilterTest extends BaseWSWebTest {

  public CurrentEMFilterTest() {
    super("library"); //$NON-NLS-1$
    ServiceModelPackageRegistry.getInstance().register(LibraryModelPackage.INSTANCE);
  }

  @Override
  protected String getURL() {
    return super.getBaseURL();
  }

  @Test
  public void testCreateFindError() {
    doGetRequest("testEM?insert=true", null, HttpServletResponse.SC_OK); //$NON-NLS-1$
    doGetRequest("testEM?find=true", null, HttpServletResponse.SC_OK); //$NON-NLS-1$
    doGetRequest("testEM?find=true&error=true", null, HttpServletResponse.SC_INTERNAL_SERVER_ERROR); //$NON-NLS-1$
  }
}